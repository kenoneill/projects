package ie.kenoneill.coops.training;

public class Reverse {
    public String reverse(String astring) {
        String method1 = usingLibraryMethods(astring);
        String method2 = insertingAtStartOfStringBuilder(astring);
        String method3 = usingArrayToHoldResultAndFillingFromEndOfStringBackwards(astring);
        String method4 = traversingStringFromEnd(astring);
        String method5 = deletingCharsUntilStringIsEmpty(astring);
        String method6 = tailRecursionMethod(astring);
        String method7 = headRecursionMethod(astring);
        if(method1.equals(method2) && method2.equals(method3) && method3.equals(method4) && method4.equals(method5) && method5.equals(method6) && method6.equals(method7))
            return method7;
        return "";
    }

    private String usingLibraryMethods(String astring) {
        return new StringBuilder(astring).reverse().toString();
    }

    private String insertingAtStartOfStringBuilder(String astring) {
        StringBuilder sb = new StringBuilder();
        for (String letter : astring.split("")) {
            sb.insert(0, letter);
        }
        return sb.toString();
    }

    private String usingArrayToHoldResultAndFillingFromEndOfStringBackwards(String astring) {
        char[] words = new char[astring.length()];
        for (int x = words.length, y = 0; x > 0; x--, y++) {
            words[y] = astring.charAt(x - 1);
        }
        return new String(words);
    }

    private String traversingStringFromEnd(String astring) {
        String result = "";
        for (int x = astring.length(); x > 0; x--) {
            result += astring.charAt(x - 1);
        }
        return result;
    }


    private String deletingCharsUntilStringIsEmpty(String astring) {
        String result = "";
        while (astring.length() >0){
            result = astring.charAt(0) + result;
            astring = astring.substring(1);
        }
        return result;
    }

    private String tailRecursionMethod(String astring) {
        if(astring.length() == 0){
            return "";
        }
        return  tailRecursionMethod(astring.substring(1)) + astring.charAt(0);
    }


    private String headRecursionMethod(String astring) {
        if(astring.length() == 1){
            return astring;
        }
        String result = headRecursionMethod(astring.substring(1));

        return  result + astring.charAt(0);
    }
}
