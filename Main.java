import java.util.ArrayList;
import java.util.List;

class Pessoa {
    String nome, email, telefone;

    Pessoa(String name, String dotCom, String phone) {
        nome = name;
        email = dotCom;
        telefone = phone;
    }
}

class Departamento {
    String nomeDpt;
    List<Pessoa> funcionarios;

    Departamento(String nomeDoDpt) {
        nomeDpt = nomeDoDpt;
        funcionarios = new ArrayList<>();
    }

    void contratar(Pessoa funcNovo) {
        funcionarios.add(funcNovo);
    }

    void showName() {
        System.out.println(nomeDpt);
    }

    void showFuncs() {
        System.out.println(nomeDpt);
        for (Pessoa i : funcionarios) {
            System.out.println(i.nome);
            System.out.println(i.email);
            System.out.println(i.telefone);
        }
        System.out.println();
    }

    private void getName() {
        System.out.println("Qual será o nome do departamento? ");
        // O método getName não será utilizado, pois o nome do departamento é passado no construtor.
    }
}

class Universidade {
    String nome;
    List<Departamento> departamentos;

    Universidade(String name) {
        nome = name;
        departamentos = new ArrayList<>();
    }

    void infoNome() {
        System.out.println("O nome da universidade é: " + nome);
    }

    void addDepartamento(Departamento nomeDpt) {
        departamentos.add(nomeDpt);
    }

    void showDepartaments() {
        for (Departamento i : departamentos) {
            i.showName();
        }
    }

    void infoUniversidade() {
        for (Departamento i : departamentos) {
            i.showFuncs();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Universidade UFPA = new Universidade("Universidade Federal do Pará");

        // Criando departamentos
        Departamento icen = new Departamento("Instituto de Ciências Exatas e Naturais");
        Departamento itec = new Departamento("Instituto de Tecnologia");
        Departamento ilc = new Departamento("Instituto de Letras");
        Departamento ics = new Departamento("Instituto de Ciências da Saúde");

        // Criando pessoas
        Pessoa ana = new Pessoa("Ana Souza", "ana.souza@email.com", "(00)90000-0000");
        Pessoa carlos = new Pessoa("Carlos Silva", "carlos@email.com", "(00)99999-9999");
        Pessoa joao = new Pessoa("João Pereira", "joao.pereira@email.com", "(00)98888-7777");
        Pessoa maria = new Pessoa("Maria Costa", "maria.costa@email.com", "(00)97777-6666");
        Pessoa pedro = new Pessoa("Pedro Oliveira", "pedro.oliveira@email.com", "(00)96666-5555");
        Pessoa paula = new Pessoa("Paula Lima", "paula.lima@email.com", "(00)95555-4444");
        Pessoa carros = new Pessoa("Carlos Almeida", "carlos.almeida@email.com", "(00)95555-4444");
        Pessoa luciana = new Pessoa("Luciana Silva", "luciana.silva@email.com", "(00)95555-4444");

        // Adicionando pessoas aos departamentos
        icen.contratar(ana);
        icen.contratar(carlos);
        itec.contratar(joao);
        itec.contratar(maria);
        ilc.contratar(pedro);
        ilc.contratar(paula);
        ics.contratar(luciana);
        ics.contratar(carros);

        // Adicionando departamentos à universidade
        UFPA.addDepartamento(icen);
        UFPA.addDepartamento(itec);
        UFPA.addDepartamento(ilc);
        UFPA.addDepartamento(ics);

        // Exibindo as informações da universidade, departamentos e pessoas
        UFPA.infoUniversidade();
    }
}
