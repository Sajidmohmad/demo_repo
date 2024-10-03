public class Percentage {
   private double obtainedMarks;
   private double totalMarks;
    private double percentage;

public double setObtainedMarks(double obtainedMarks){
    this.obtainedMarks=obtainedMarks;
    return obtainedMarks;
}
    public double setTotalMarks(double totalMarks){
        this.totalMarks=totalMarks;
        return totalMarks;
    }
public void getMarks(){
        System.out.println("Obtained Marks ="+obtainedMarks);
}
public void toDisplay(){
        System.out.println("Obtained Marks="+obtainedMarks);
        System.out.println("Total Marks ="+totalMarks);
        System.out.println("Percentage="+percentage+"%");
}

public double getPercantage(){
 percentage=(obtainedMarks/totalMarks)*100;
 return percentage;
}


}
