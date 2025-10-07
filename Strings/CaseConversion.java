class CaseConversion{
    public static void main(String[] args){
        String str = "Hello World";
        StringBuilder upperStr = new StringBuilder();
        StringBuilder lowerStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                upperStr.append((char)(ch - ('a' - 'A')));
                lowerStr.append(ch);
            } else if(ch >= 'A' && ch <= 'Z'){
                lowerStr.append((char)(ch + ('a' - 'A')));
                upperStr.append(ch);
            } else {
                upperStr.append(ch);
                lowerStr.append(ch);
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("Uppercase String: " + upperStr);
        System.out.println("Lowercase String: " + lowerStr);
    }
}