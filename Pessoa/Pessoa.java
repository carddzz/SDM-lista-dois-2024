public class Pessoa implements Atividade {

    private String nome;

    /**
     * Construtor da classe Pessoa.
     * 
     * @param nome Nome da pessoa
     */
    public Pessoa(String nome) {
        this.nome = nome;
    }

    @Override
    public void acordar() {
        System.out.println(nome + " está acordando.");
    }

    @Override
    public void andar() {
        System.out.println(nome + " está andando.");
    }

    @Override
    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}