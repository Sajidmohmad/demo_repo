public class getsetrMain {
    public static void main(String[] args) {
getsetr g = new getsetr("Sajid",33,"Male");
String name=g.getName();
int age=g.getAge();
String gender=g.getGender();
g.setAge(26);

g.display();

getsetr g1=new getsetr("Safwan",4);
g1.display();

    }
}
