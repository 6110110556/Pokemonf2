import java.util.Scanner;

public class PokemonGame{

    public int pokeBag =5;
    //public Char w1; // w = ways

    public static void main(String [] args){
        String w1; // w = ways
       // Scanner sc = new Scanner(System.in);
        PokemonGame user = new PokemonGame();
        //สร้างอิฟเอล แล้วก็เช็ค boolean ว่าจะสร้างไม่สร้าง แล้วก็ ถ้าเต็มก็ไปต่อ
        Pokemon p1 = new Pokemon();
        p1.displayFaceGame();
        p1.setName();
        w1 = p1.displayWayToFunction();
        user.chooseFunction(w1, p1);            



    }

    public void chooseFunction(String w, Pokemon p){
        if(w.equals("1")){
           // p.pokeHouse();
            System.out.println("**********Error (is not doing)**********");

        }
        else if(w.equals("2")){
            //p.goToGarden();
            System.out.println("**********Error (is not doing)**********");

        }
        else if(w.equals("3")){
            p.displayStatus();
            
        }
        else if(w.equals("E")  || w.equals("e")){
            p.quitGame();
        }
        else{
            System.out.println("**********Error (is not doing)**********");
        }
            
    }

}