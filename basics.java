
class student{

    int rollno;
    String name;
    float marks;
    

}



public class basics {
    public static void main(String[] args) {
        student[] students=new student[5];
       
        // student puneet;
        // puneet= new student();
        student puneet=new student();


        puneet.name= "hero";
        puneet.rollno=201500534;
        puneet.marks= 20.45f ;
        System.out.println(puneet.rollno);
        System.out.println(puneet.name);
        System.out.println(puneet.marks);
        
        
    }
    
}

