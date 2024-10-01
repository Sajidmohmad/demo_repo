public class StdMain {
    public static void main(String[] args){

        Std S = new Std();
        Std s1 = new Std();
        Std s2 = s1;
        Std s3 = s2;
        Std s4 = new Std();
        Std s5 = s4;
        Std s6 = s1;
        Std s7 = s6;


        S.Std();
        s1.Std();
        s2.Std();
        s3.Std();
        s4.Std();
        s5.Std();
        s6.Std();
        s7.Std();
        s4.Std();
    }
}
