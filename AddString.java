import java.util.Scanner; 
class AddString{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String strNumber = in.nextLine();
        int no = add(strNumber);
        System.out.println(no);
    }
   public static int add(String strNumbers){
	if(strNumbers.equals("")){
            return 0;
	}
	else{
            String div = ",";
            if(strNumbers.matches("//(.*)\n(.*)")){
                div = Character.toString(strNumbers.charAt(2));
                strNumbers = strNumbers.substring(4);
            }
            String strList[] = splitStr(strNumbers, div);
            return sumofstr(strList);
	}
	}

	private static String[] splitStr(String Allnumbers, String div){
	    div = div + "|\n";
	    return Allnumbers.split(div);
	}

	private static int sumofstr(String[] Allnumbers){
 	    int ttl = 0;
 	    String ngstr = "";

        for(int i=0;i<Allnumbers.length;i++){
            String numstr = Allnumbers[i];
            try{
                int no = Integer.parseInt(numstr);
                    if(no < 0){
        	         if(ngstr.equals(""))
        		    	ngstr = numstr;
        		    else
        		    	ngstr += ("," + numstr);
                    }
        	        if(no < 1000)
		    	        ttl += no;
                
            }catch(NumberFormatException e){
                System.out.println("Wrong number detected!!");
            }
        }

		if(!ngstr.equals("")){
			throw new IllegalArgumentException("Negative number detected" + ngstr);
		}

		return ttl;
    }
}