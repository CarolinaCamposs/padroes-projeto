package interpreter;

public class Banco {

    public static String formula = "valor1 * 2 + valor2";

    public static double calcularTotal(double valor1, double valor2) {
        String expressao;
        expressao = formula.replace("valor1", Double.toString(valor1));
        expressao = expressao.replace("valor2", Double.toString(valor2));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
