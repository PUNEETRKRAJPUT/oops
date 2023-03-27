

class player{
    String name;
    int id;
    static int playercount = 0; // static variable can be accessed using class name line 12
    player(String naam){
        this.name=naam;
        this.id=++playercount;
    }
    void printDetails(){
        System.out.println(id+";"+name);
    }
    

}


public class static_member {
    public static void main(String[] args) {
        player p1=new player("puneet");
        player p2=new player("vampire");
        player p3=new player("vampire");
        p1.printDetails();
        p2.printDetails();
        p3.printDetails();
        System.out.println(p1.name);  
        System.out.println(player.playercount);
        System.out.println(p3.playercount);
    
    }
}
