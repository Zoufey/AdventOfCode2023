import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int total=0;
        int number=0;
        BufferedReader reader=new BufferedReader(new FileReader("src/Input1"));
        String line=reader.readLine();
        while(line!=null){
            line=replaceStringWithInt(line);
            number=calcutateNumber(line);
            total+=number;
            line= reader.readLine();

        }
        System.out.println(total);
    }



    public static int calcutateNumber(String line){
        int firstDigit=-1;
        int lastDigit=-1;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)<58&&line.charAt(i)>47){
                if(firstDigit==-1){
                    firstDigit=Character.getNumericValue(line.charAt(i));
                }else{
                    lastDigit=Character.getNumericValue(line.charAt(i));
                }
            }
        }
        if(lastDigit==-1){
            lastDigit=firstDigit;
        }
        return firstDigit*10+lastDigit;
    }


    //Does not cover cases like sevenine->79
    public static String replaceStringWithInt(String line){
        String newLine=line;
        newLine=newLine.replace("one","1");
        newLine=newLine.replace("two","2");
        newLine=newLine.replace("three","3");
        newLine=newLine.replace("four","4");
        newLine=newLine.replace("five","5");
        newLine=newLine.replace("six","6");
        newLine=newLine.replace("seven","7");
        newLine=newLine.replace("eight","8");
        newLine=newLine.replace("nine","9");
        return newLine;
    }
}