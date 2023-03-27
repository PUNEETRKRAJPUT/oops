class A{
    private int x;
    int getx() {   // this defaut method can only allow you to access the private member inside the class
        return x;
    }
}

public class private_access_modifier {
    public static void main(String[] args) {
        A t=new A();
        //System.out.println(t.x);
        System.out.println(t.getx());  // o/p = 0
    }
}
