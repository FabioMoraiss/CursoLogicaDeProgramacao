public class primitivas {
    public static void main(String[] args) {
        byte variavelByte = 127;
        short variavelShort = 300;
        System.out.println(variavelByte);

        float minhavariavelfloat1 = 0.1f;
        float minhavariavelfloat2 = 0.2f;
        float resultado = minhavariavelfloat1 + minhavariavelfloat2;
        System.out.printf("%.12f", resultado);
        System.out.println();

        byte byte1 = 44;
        short short1 = byte1;
        System.out.println(short1);

        short shortzao = 129;
        byte bytezao = (byte) shortzao;
        System.out.println(bytezao);

        char meuchar = '+';
        System.out.println(meuchar);

        String minhaString = "meu texto querido";

    }
}