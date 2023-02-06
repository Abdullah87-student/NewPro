import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {






    public static void main(String[] args) throws IOException {


        System.out.println("Enter G4 file name with extension");
        Scanner input = new Scanner(System.in);
        File file1 = new File(input.nextLine());
        input = new Scanner(file1);

        System.out.println("Enter Error comparison file name with extension");
        Scanner input2 = new Scanner(System.in);
        File fileerrordata = new File(input2.nextLine());
        input2 = new Scanner(fileerrordata);


        while (input.hasNextLine()) {
            String Line = input.nextLine();
            //System.out.println(Line);
        }


        String Line2 = null;
        while (input2.hasNextLine()) {
            Line2 = input2.nextLine();
           // System.out.println(Line2);
        }
        input.close();


        File Fileupload = new File(fileerrordata.getPath());

        CharStream Firstret = CharStreams.fromFileName(String.valueOf(Fileupload));
        //ExprLexer lexer = new ExprLexer(Firstret);
       // CommonTokenStream token = new CommonTokenStream(lexer);
       // ExprParser parser = new ExprParser(token);
        // ExprParser.ExprContext parseTree = parser.expr();
        //System.out.println(Firstret);

        String Text = String.valueOf(Firstret);
        //System.out.println(Text);

             /// Security Issue 1 Thread.sleep()
        Pattern pattern1 = Pattern.compile("thread.sleep()", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern1.matcher(Text);
        boolean matchFound = matcher.find();







        int count=1;
       if(matchFound) {
            System.out.println("Error found");


           while (matcher.find()) {

               count++;
              // System.out.println(matchFound);

           }


        }
       else {
            System.out.println("Error not detected");
            count=0;

        }
        System.out.println("There are "+count+"  instances of the threading error present present");


           /// Security Vulnerability 2 Dynamic Loading
        Pattern pattern2 = Pattern.compile("GET", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(Text);
        boolean matchFound2 = matcher2.find();


        int count2=1;
        if(matchFound2) {
            System.out.println("Error found");


            while (matcher2.find()) {

                count2++;
                // System.out.println(matchFound);

            }


        }
        else {
            System.out.println("Error not detected");
            count2=0;

        }
        System.out.println("There are "+count2+"  instances of the error present");




        /*
        /// Security Vulnerability 2 Cleartext
        Pattern pattern2 = Pattern.compile("thread.sleep()", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(Text);
        boolean matchFound2 = matcher2.find();



        /// Security Vulnerability 3 SQL
        Pattern pattern2 = Pattern.compile("thread.sleep()", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(Text);
        boolean matchFound2 = matcher2.find();

        /// Security Vulnerability 4 Plaintext Storing
        Pattern pattern2 = Pattern.compile("thread.sleep()", Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern2.matcher(Text);
        boolean matchFound2 = matcher2.find();

*/

}
}