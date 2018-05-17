package dragonballsuper;

public class Personagem implements Luta{
    
    // Atributos
    private String nome;
    private int poder;
    private int defesa;
    private int nivel;
    private String raca;
    private int vida;
    
    
    // Método Construtor
    public Personagem(String nome, int poder, int defesa, int nivel, String raca, int vida) {
        this.nome = nome;
        this.poder = poder;
        this.defesa = defesa;
        this.nivel = nivel;
        this.raca = raca;
        this.vida = vida;
    }

    
    // Métodos Acessores e Modificadores
    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private int getPoder() {
        return poder;
    }

    private void setPoder(int poder) {
        this.poder = poder;
    }

    private int getDefesa() {
        return defesa;
    }

    private void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    private int getNivel() {
        return nivel;
    }

    private void setNivel(int nivel) {
        this.nivel = nivel;
    }

    private String getRaca() {
        return raca;
    }

    private void setRaca(String raca) {
        this.raca = raca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    private void status(Personagem x){
    
        System.out.println("--------------------------------------------------------------");
        System.out.print(x.nome + " (Vida = " + x.vida + ") " + 
                "(Nivel = " + x.nivel + ") " +
                "(Poder = " + x.poder + ")" 
        );
        
    }
    
    
    
    @Override
    public void transformar(int x) {
        this.nivel += x;
        this.poder *= this.nivel * 1;
        this.defesa *= this.nivel * 1;
        this.vida *= x * 1.3;
        this.status(this);
        System.out.println("(transformação)");
    }

    @Override
    public int atacar() {
        return this.getPoder();
    }

    @Override
    public void lutar() {
    }

    @Override
    public void desistir() {
    }

    @Override
    public void defender() {
    }
    
    public void defender(int ataque, int x, Personagem n) {
        if (this.defesa < ataque){
            this.vida = this.vida + (this.defesa - ataque) * x;
        }
        
        this.status(n);
        System.out.println("(Defesa)");
        
        //System.out.println(this.nome + " (Vida = " + this.vida + ")");
    }

    @Override
    public String toString() {
        return "Personagem{" + "nome=" + nome + ", poder=" + poder + ", defesa=" + defesa + ", nivel=" + nivel + ", raca=" + raca + ", vida=" + vida + '}';
    }

    
                
}
