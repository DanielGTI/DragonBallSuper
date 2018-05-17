package dragonballsuper;

public class DragonBallSuper {

    public static void main(String[] args) {
        
        
        // String nome, int poder, int defesa, int nivel, String raca, int vida
        Personagem db1 = new Personagem("Goku", 40000, 30000, 1, "Sayajin", 100000);
        Personagem db2 = new Personagem("Vegeta", 35000, 30000, 1, "Sayajin", 100000);
        
        //db1.transformar(1);
        //db2.transformar(2);
        
        System.out.println(db1.toString());
        System.out.println(db2.toString());
        
        
        db2.defender(db1.atacar(), 3, db2);
        //db2.defender(db1.atacar(), 1, db2);
        
        
        
    }
    
}
