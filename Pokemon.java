class Pokemon{
    //Attribuite
    private String name;
    private final int power, level, stamina;
    private int berry;


    //DefaultConstructure
    public Pokemon(){
        this.power =10;
        this.level =1;
        this.stamina =100;
    }


    // Method
    public void setName(final String name) {
        this.name = name;

    }
    
    public void displayStatus(){
         System.out.print("\n\t   ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"
                                +"\n\t\t  Your Pokemon Name is "+this.name
                                +"\n\t\t    Level : "+this.level
                                +"\n\t\t    Power : "+this.power
                                +"\n\t\t    Stamina : "+this.stamina
                                +"\n\n\t  ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }

 /*   public int eatBerry(int berry){
        this.power = power+berry;
        this.stamina = stamina+berry;

    }*/


    

}