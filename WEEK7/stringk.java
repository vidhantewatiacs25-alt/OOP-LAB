import java.util.Scanner;
public class stringk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Enter email : ");
        String email=sc.nextLine();
        System.out.println("Length : "+email.length());

        int at=email.indexOf('@');
        if(at!=-1){
            String username=email.substring(0,at);
            String domain=email.substring(at+1);
            System.out.println("Username : "+username);
            System.out.println("domain : "+domain);

            if(domain=="bmsce.ac.in"){
                System.out.println("belongs to BMSCE");
            }else {
                System.out.println("does no belong to BMSCE ");
            }
        }else{
            System.out.println("Invalid email!");
        }

        System.out.println("Lower email : "+ email.toLowerCase());

        System.out.print("Enter prefix : ");
        String prefix=sc.nextLine();
        if(email.startsWith(prefix)){
            System.out.println("Matched");
        }else{
            System.out.println("not matched");
        }

        System.out.println("updated email : "+email.replace("bmsce.ac.in","cse.bmsce.ac.in"));

        System.out.print("Enter sequence : ");
        String sequence=sc.nextLine();
        if(email.contains(sequence)){
            System.out.println("matched");
        }else{
            System.out.println("not found");
        }

        System.out.println("trimmed email : "+email.trim());

        System.out.print("Enter other mail : ");
        String e2=sc.nextLine();
        if(email.trim().equalsIgnoreCase(e2.trim())){
            System.out.println("identical");
        }else {
            System.out.println("diffrent");
        }
        sc.close();
    }
}
