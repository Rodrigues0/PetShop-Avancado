import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pet> listaPets = new ArrayList<>();
        List<Banho> listaBanhoPet = new ArrayList<>();
        List<Tosa> listaTosaPet = new ArrayList<>();

        boolean controle = true;
        System.out.println("*************************");
        System.out.println("Seja Bem Vindo");
        System.out.println("*************************");
        do {
            System.out.println("*************************");
            System.out.println("1 - Cadastrar um Pet");
            System.out.println("2 - Mostrar Pets Cadastrados");
            System.out.println("3 - Mostrar Banho Cadastrado");
            System.out.println("4 - Mostrar Tosa Cadastrada");
            System.out.println("5 - Preço do Frete");
            System.out.println("6 - Encerrar Programa");
            System.out.println("*************************");
            int escolha = sc.nextInt();
            sc.nextLine();
            switch (escolha) {
                case 1:
                    cadastrarPet(sc, listaPets, listaBanhoPet, listaTosaPet);
                    break;
                case 2:
                    mostrarPetsCadastrados(listaPets);
                    break;
                case 3:
                    mostrarBanhoCadastrado(listaBanhoPet);
                    break;
                case 4:
                    mostrarTosaPet(listaTosaPet);
                    break;
                case 5:
                    calcularFrete(sc);
                    break;
                case 6:
                    controle = false;
                    break;
            }
        } while (controle);
    }




    public static void cadastrarPet(Scanner sc, List<Pet> listaPets, List<Banho> listaBanhoPet, List<Tosa> listaTosaPet) {
        Pet pet = new Pet("", 0, 0);
        System.out.println("Digite o nome do pet");
        pet.setNome(sc.nextLine());
        System.out.println("Digite a idade do pet");
        pet.setIdade(sc.nextInt());
        System.out.println("Digite o Peso do Pet");
        pet.setPeso(sc.nextDouble());

        listaPets.add(pet);

        System.out.println("*********************");
        System.out.println("Você deseja banho?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("*********************");
        int escolhaBanho = sc.nextInt();
        sc.nextLine();

        int escolhaPelagem = 0;

        if (escolhaBanho == 1) {
            Banho banho = new Banho("", "");
            System.out.println("*********************");
            System.out.println("Qual a pelagem do Pet?");
            System.out.println("1 - Curto - R$ 45,00");
            System.out.println("2 - Medio - R$ 60,00");
            System.out.println("3 - Longo - R$ 90,00");
            System.out.println("*********************");
            escolhaPelagem = sc.nextInt();
            sc.nextLine();



            switch (escolhaPelagem) {
                case 1: banho.setPelagem("Curto"); break;
                case 2: banho.setPelagem("Medio"); break;
                case 3: banho.setPelagem("Longo"); break;
                default: banho.setPelagem("Não Informado");
            }

            System.out.println("Esolha o Porte do Pet");
            System.out.println("*********************");
            System.out.println("1 - Pequeno");
            System.out.println("2 - Médio");
            System.out.println("3 - Grande");
            System.out.println("*********************");
            int escolhaPorte = sc.nextInt();
            sc.nextLine();

            switch (escolhaPorte) {

                case 1: banho.setPorte("Pequeno"); break;
                case 2: banho.setPorte("Médio");   break;
                case 3: banho.setPorte("Grande");  break;
                default: banho.setPorte("Não Informado");
            }
            banho.setNome(pet);
            pet.setBanho(banho);
            listaBanhoPet.add(banho);
            System.out.println("Banho cadastrado para: " + pet.getNome());
        }

        System.out.println("*********************");
        System.out.println("Você deseja Tosa?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("*********************");
        int escolhaTosa = sc.nextInt();
        sc.nextLine();



        if (escolhaTosa == 1) { // ← era 0, troque para 1
            Tosa tosa = new Tosa("", "");

            if (escolhaPelagem == 0) { // usei para que caso nao tenha escolha da pelagem no banho
                System.out.println("*********************");
                System.out.println("Qual a pelagem do Pet?");
                System.out.println("1 - Curto - R$ 70,00");
                System.out.println("2 - Medio - R$ 95,00");
                System.out.println("3 - Longo - R$ 160,00");
                System.out.println("*********************");
                escolhaPelagem = sc.nextInt();
                sc.nextLine();
            }

            switch (escolhaPelagem) {
                case 1: tosa.setTosaPelagem("Curto"); break;
                case 2: tosa.setTosaPelagem("Médio"); break;
                case 3: tosa.setTosaPelagem("Longo"); break;
                default: tosa.setTosaPelagem("Não Informado");
            }

            tosa.setPet(pet);
            pet.setTosa(tosa);
            listaTosaPet.add(tosa);
            System.out.println("Tosa cadastrada para: " + pet.getNome());
        }
    }


    public static void mostrarPetsCadastrados(List<Pet> listaPets) {
        for (Pet pet : listaPets) {
            System.out.println("__________________________");
            System.out.println("Nome: " + pet.getNome());
            System.out.println("Idade: " + pet.getIdade());
            System.out.println("Peso: " + pet.getPeso());
            if (pet.getBanho() != null) {
                System.out.println("Banho: " + pet.getBanho().getPelagem() + " / Porte: " + pet.getBanho().getPorte());
            }
            System.out.println("__________________________");
        }
    }

    public static void mostrarBanhoCadastrado(List<Banho> listaBanhoPet) {
        for (Banho banho : listaBanhoPet) {
            System.out.println("----------------------------------");
            System.out.println("Nome: " + banho.getNome().getNome());
            System.out.println("Pelagem: " + banho.getPelagem());
            System.out.println("Porte: " + banho.getPorte());
           ;
        }
    }

    private static void mostrarTosaPet(List<Tosa> listaTosaPet) {
        for(Tosa tosa : listaTosaPet){
            System.out.println("----------------------------------");
            System.out.println("Nome: " + tosa.getPet(). getNome());
            System.out.println("Pelagem: " + tosa.getTosaPelagem());
        }
    }

    private static void calcularFrete(Scanner sc) {
        System.out.println("*********************");
        System.out.println("O pet é do centro?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.println("*********************");
        int escolha = sc.nextInt();
        sc.nextLine();

        double valorFrete = 15.00;

        if (escolha == 2) {
            valorFrete = valorFrete * 2;
        }

        System.out.println("Valor do frete: R$ " + valorFrete);
    }

}