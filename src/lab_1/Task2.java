package lab_1;

public class Task2 {
    private String word1 ;
    private String word2 ;
    private String word3 ;
    private String word4;
    private String word5 ;
    private String word6 ;
    private String word7 ;
    private String word8 ;
    private String word9 ;
    private String word10 ;
    private String word11 ;
    private String word12 ;
    public Task2 (String word1, String word2, String word3,String word4,String word5,String word6,String word7,String word8,String word9,String word10,String word11,String word12){
        this.word1=word1;
        this.word2=word2;
        this.word3=word3;
        this.word4=word4;
        this.word5=word5;
        this.word6=word6;
        this.word7=word7;
        this.word8=word8;
        this.word9=word9;
        this.word10=word10;
        this.word11=word11;
        this.word12=word12;
    }
    public String concatWord (){
        String result = word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5 + " " + word6 + " " + word7 + " " + word8 + " " + word9 + " " + word10 + " " + word11 + " " + word12;
        return result;
    }
}
