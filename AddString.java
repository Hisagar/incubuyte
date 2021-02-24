import java.util.Scanner; 
class AddString{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String strNumber = in.nextLine();
        int no = add(strNumber);
        System.out.println(no);
    }
    public static int add(String strNumber){
        int res=0;
        if(strNumber!=null){
            String []splitedString = SplitString(strNumber);
            res= sumOfString(splitedString);
        }
       return res;
    }
    public static String[] SplitString(String strNumber){
        return strNumber.split(",");
    }
    public static int sumOfString(String []splitedString){
        int sum =0;
        for(int i=0;i<splitedString.length;i++){
            try{
                int n = Integer.parseInt(splitedString[i]);
                sum += n;
            }catch(NumberFormatException e){
                System.out.println("Wrong number!!");
            }
        }
        return sum;
    }
}