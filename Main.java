abstract class Energysource{
    int sid;
    String sname;
    int energy;

    Energysource(int a,String b,int c){
        this.sid=a;
        this.sname=b;
        this.energy=c;
    }

    abstract double efficiency();

    void display(){
        System.out.println("\nSource ID : "+this.sid);
        System.out.println("\nSource name : "+ this.sname);
        System.out.println("\nEnergy generated : "+ this.energy);
    }

}

class Solarenergy extends Energysource{
    Solarenergy(int a,String b,int c){
        super(a,b,c);
    }
    double efficiency(){
        return (this.energy/5000)*100;
    }
}
class windenergy extends Energysource{
    windenergy(int a,String b,int c){
        super(a,b,c);
    }
    double efficiency(){
        return (this.energy/8000)*100;
    }
}

class Main{
public static void main(String args[]){
    Energysource a=new Solarenergy(5,"test1",5000);
    Energysource b=new windenergy(6,"test2",7000);
    a.display();
    b.display();
    a.efficiency();
    b.efficiency();
}
}