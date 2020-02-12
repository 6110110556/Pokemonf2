import java.util.Scanner;


class Pokemon{
    Scanner sc = new Scanner(System.in);

    //Attribuite
    private String name;
        //w = Ways
    private String w1;
        // hp = Health Point, mp = Mana Point
    private int power, level, stamina, hp, mp;
    public int maxStamina =100;



    //DefaultConstructure
    public Pokemon(){
        this.power =(int)(((double)Math.random())*50+100);
        this.level =1;
        this.stamina =100;
        this.hp = (int)(this.power*0.5+500);
        this.mp = (int)(this.power*0.2+200);
    }



    // Method
        //Behevier

    public void setName() {
        System.out.print("\n\n\t\t Enter Your name Pokemon Signature : ");
        this.name = sc.nextLine();
        System.out.print("\n\n\n\n\n");

    }
 /*   public void getName()(
        System.out.println(this.name);
    )*/
/*
    public int levelUp(int level){

    }

    public int pSleep(){

        return this.stamina = maxStamina;
    }
*/

        //All Display

    public void displayStatus(){
         System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                            +"\n\t\t  Your Pokemon Name is "+this.name
                            +"\n\t\t    Level : "+this.level
                            +"\n\t\t    HP : "+this.hp
                            +"\n\t\t    MP : "+this.mp
                            +"\n\t\t    Power : "+this.power
                            +"\n\t\t    Stamina : "+this.stamina
                            +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

    public void displayFaceGame(){
        System.out.print("\n\t ************************************************************"
                            +"\n\t\t ===== WELLCOM TO POKEMONNI GAME =====");
    }

    public String displayWayToFunction(){
        System.out.print("\n\n\t ############################################################"
                        +"\n\t\t PokeHouse:(1)"
                        +"\n\t\t Go to Forest [CoE Garden]:(2)"
                        +"\n\t\t Show Your Pokemon Status:(3)"
                        +"\n\t\t Quit Game:(E)"
                        +"\n\n\t\t your ans : ");
        this.w1 = sc.nextLine();
        System.out.print("\n\n ############################################################\n\n\n\n\n");
        return this.w1;

    }

    // SystemAnalysis

    public void quitGame(){
        System.out.print("\n\t\t------------------------------------End Game------------------------------------"
                            +"\n\n\t\t\t\t To Player : Get to Read a Book Pai!!! ");
    }

    

}