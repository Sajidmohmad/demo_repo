public class getsetr {

private String name;
private int age;
private String gender;

public getsetr(String name, int age,String gender){
this.name=name;
this.age=age;
this.gender=gender;
}
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public String getGender(){
    return gender;
}
public void setAge(int age){
    this.age=age;
}
public void display(){
    System.out.println("Name:"+name+""+"age:"+age+""+"Gender:"+gender);
}
public getsetr(String name,int age){
    this.name=name;
    this.age=age;
    gender="NA";
}
}


