public class boleanoOR {
    public static void main(String[] args) {
        boolean passouCartao = true;
        boolean passouDigital = true;
        boolean podeEntrar = (passouCartao ||passouDigital ||
        passouDigital || passouDigital || passouDigital ||
        passouDigital );

        if(podeEntrar) {
            System.out.println("SEJA BEM VINDO MORADOR");
        } else {
            System.out.println("NAO PODE ENTAR, SAIA DAQUI AGORA !");
        }
        System.out.println();
    }
}
