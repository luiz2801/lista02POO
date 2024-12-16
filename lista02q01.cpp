#include <iostream>
#include <vector>
using namespace std;

class pessoa{
    public:
        string nome, email, telefone;
        pessoa(string name, string dotCom, string phone){
            nome = name;
            email = dotCom;
            telefone = phone;
        };
};


class departamento{
    public:
        string nomeDpt;
        vector<pessoa> funcionarios;
        void contratar(pessoa funcNovo){
            funcionarios.push_back(funcNovo);
        };
        departamento(string nomeDoDpt){
            nomeDpt = nomeDoDpt;
        };
        void showName(){
            std::cout<<nomeDpt<<endl;
        };
        void showFuncs(){
            std::cout<<nomeDpt<<endl;
            for (pessoa i : funcionarios)
            {
                std::cout<<i.nome<<endl;
                std::cout<<i.email<<endl;
                std::cout<<i.telefone<<endl;
            };
            std::cout<<endl;
            
        };
        private:
            void getName(){
                cout<<"Qual será o nome do departamento? "<<endl;
                cin >> nomeDpt;
            };
        
};



class universidade{
    public:
        string nome;
        vector<departamento> departamentos;
        universidade(string name){
            nome = name;
            };
        void infoNome(){
            std::cout<< "O nome da universidade é: "<< nome <<endl;
    };
        void addDepartamento(departamento nomeDpt){
            departamentos.push_back(nomeDpt);
        };
        void showDepartaments(){
            for (departamento i : departamentos){
                i.showName();
            };
        };
        void infoUniversidade(){
            for (departamento i : departamentos){
                i.showFuncs();
            };
        };
        
};




int main(){

    universidade UFPA("Universidade Federal do Pará");

    // Criando departamentos
    departamento icen("Instituto de Ciências Exatas e Naturais");
    departamento itec("Instituto de Tecnologia");
    departamento ilc("Instituto de Letras");
    departamento ics("Instituto de Ciências da Saúde");
    // Criando pessoas
    pessoa ana("Ana Souza", "ana.souza@email.com", "(00)90000-0000");
    pessoa carlos("Carlos Silva", "carlos@email.com", "(00)99999-9999");
    pessoa joao("João Pereira", "joao.pereira@email.com", "(00)98888-7777");
    pessoa maria("Maria Costa", "maria.costa@email.com", "(00)97777-6666");
    pessoa pedro("Pedro Oliveira", "pedro.oliveira@email.com", "(00)96666-5555");
    pessoa paula("Paula Lima", "paula.lima@email.com", "(00)95555-4444");
    pessoa carros("Carlos Almeida", "carlos.almeida@email.com", "(00)95555-4444");
    pessoa luciana("Luciana Silva", "luciana.silva@email.com", "(00)95555-4444");

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


    return 0;
};