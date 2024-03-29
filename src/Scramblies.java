public class Scramblies {

    /**
     * Complete the function scramble(str1, str2) that returns true if a portion of str1 characters can be rearranged to match str2, otherwise returns false.
     *
     * Notes:
     *
     * Only lower case letters will be used (a-z). No punctuation or digits will be included.
     * Performance needs to be considered
     * Input strings s1 and s2 are null terminated.
     * Examples
     * scramble('rkqodlw', 'world') ==> True
     * scramble('cedewaraaossoqqyt', 'codewars') ==> True
     * scramble('katas', 'steak') ==> False
     */

    public static void main(String[] args) {
        try {
            System.out.println("longestConsec Fixed Tests");
            testing(Scramblies.scramble("rkqodlw","world"), true);
            testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
            testing(Scramblies.scramble("katas","steak"),false);
            testing(Scramblies.scramble("scriptjavx","javascript"),false);
            testing(Scramblies.scramble("scriptingjava","javascript"),true);
            testing(Scramblies.scramble("scriptsjava","javascripts"),true);
            testing(Scramblies.scramble("javscripts","javascript"),false);
            testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
            testing(Scramblies.scramble("commas","commas"),true);
            testing(Scramblies.scramble("sammoc","commas"),true);
            System.out.println("TESTS PASSED!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static boolean scramble(String str1, String str2) {
        for(char c : str1.toCharArray()) {
            str2 = str2.replaceFirst(c+"","");
        }
        return str2.length() == 0;
    }

    private static void testing(Boolean actual, Boolean expected) throws Exception{
        if(!expected.equals(actual)) {
            throw new Exception("\nExpected:"+ expected + "\nbut found actual:"+actual);
        }
    }
}
