package question4;
public class TrailingZeros {

    public  String removeLeadingZeros(String str) {

        String regex = "^0+(?!$)";
        String sub="0";
        str = str.replaceAll(regex, "");
        
        if (str.matches(sub)) {
        	throw new IllegalArgumentException("Can't be zeros");

        }
        
        if(str == null || str.isEmpty()){
            throw new RuntimeException("It cannot be null");

        }
    
        char[] chars = str.toCharArray();
        int length, i;
        length = str.length();
        
        for (i = length - 1; i >= 0; i--) {
            if (chars[i] != '0') {
                break;
            }
        }
        return (i == length - 1) ? str : str.substring(0, i + 1);

    }
  }





