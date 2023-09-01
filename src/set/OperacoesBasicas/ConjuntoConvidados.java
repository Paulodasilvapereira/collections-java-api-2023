package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convidoConvite) {
        convidadoSet.add(new Convidado(nome, convidoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int condigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == condigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                System.out.println("Não existe um convidado com o código de convite informado");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1" , 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2" , 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3" , 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4" , 1237);

        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Exitem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
