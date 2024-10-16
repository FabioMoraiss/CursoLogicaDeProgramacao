import java.util.ArrayList;

public class lista {
    public static void main(String[] args) {
        ArrayList<String> listaDeNomes = new ArrayList<>();

        listaDeNomes.add("Franciso");
        listaDeNomes.add("Sandra");
        listaDeNomes.add("Fernando");
        listaDeNomes.add(3, "Ana");
        
        System.out.println(listaDeNomes);

        System.out.println(listaDeNomes.get(0));
        System.out.println(listaDeNomes.indexOf("Sandra"));
        System.out.println(listaDeNomes.contains("Sandra"));

        listaDeNomes.set(0, "Paulo");
        System.out.println(listaDeNomes);
        listaDeNomes.remove("Paulo");
        System.out.println(listaDeNomes);

        listaDeNomes.removeFirst();
        listaDeNomes.removeLast();
        //listaDeNomes.add(20);

        ArrayList<Integer> listaDeNunmeros = new ArrayList<>();

        listaDeNunmeros.add(17);
        listaDeNunmeros.add(14);
        listaDeNunmeros.add(21);
        listaDeNunmeros.add(2);
        listaDeNunmeros.add(4);
        listaDeNunmeros.add(3);
        listaDeNunmeros.sort(null);
        System.out.println(listaDeNunmeros);
        ArrayList<Object> listaMista = new ArrayList<>();


        listaMista.add(44);
        listaMista.add("Diogo");
        listaMista.add(44.44);
        System.out.println(listaMista);

        var variavel1 = 10;

        for (Integer qualquerNome : listaDeNunmeros) {
            System.out.println(qualquerNome);
        }



    }
}
