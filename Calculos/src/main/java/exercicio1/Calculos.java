package exercicio1;

/**
 * Classe destinada a objetos do tipo Calculos, contendo os atributos e metodos
 * relacionados ao mesmo.
 *
 * @author Janiele
 * @since 11/12/2024
 */
public class Calculos {

    //Atributos
    private double media;

    /**
     * Metodo para calculo da media de notas de um aluno que recebe as quatro
     * notas do aluno e calcula a media aritmetica delas e a retorna
     *
     * @param n1 double - valor da primeira nota
     * @param n2 double - valor da segunda nota
     * @param n3 double - valor da terceira nota
     * @param n4 double - valor da quarta nota
     * @return double - media das notas
     * @throws ArithmeticException
     */
    public double calculaMedia(double n1, double n2, double n3, double n4)
            throws ArithmeticException {
        try {

            this.media = (n1 + n2 + n3 + n4) / 4;

            return this.media;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return 0.00;
    }

    /**
     * Metodo que verifica se o aluno esta aprovado ou nao,
     * verificando se a media do aluno esta acima,igual ou abaixo da media
     *
     * @param valorMedia double - valor da media do aluno
     * @return Aprovado(se acima ou igual a media) ou Reprovado(se abaixo da
     * media)
     * @throws ArithmeticException
     */
    public String calculaAcimaMedia(double valorMedia)
            throws ArithmeticException {
        try {
            if (valorMedia >= 6) {
                return "Aprovado";
            } else {
                return "Reprovado";
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
            return "Erro na execução";
        }

    }

}
