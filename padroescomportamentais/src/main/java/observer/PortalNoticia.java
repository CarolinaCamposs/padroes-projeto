package observer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Observable;

public class PortalNoticia extends Observable {

    private String titulo;
    private String conteudo;
    private Date dataPublicacao;
    private String secao;
    private String autor;

    public PortalNoticia(String titulo, String conteudo, Date dataPublicacao, String secao, String autor) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataPublicacao = dataPublicacao;
        this.secao = secao;
        this.autor = autor;
    }

    public static Date parseDate(String dateString) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        try {
            return dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void publicarNoticias() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = dateFormat.format(dataPublicacao);

        return "PortalNoticia{" +
                "titulo='" + titulo + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", dataPublicacao=" + dataFormatada +
                ", secao='" + secao + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
