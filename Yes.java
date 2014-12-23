public class Yes{

    public static void main(String[] args){
        if (args.length >= 2){
            System.err.println("usage: Yes "
            + "<something to be printed repeatedly>"); 
            System.exit(-1);
        }
        while(true)
            if (args.length == 1)
                System.out.println(args[0]);
            else
                System.out.println("y");
    }
}
