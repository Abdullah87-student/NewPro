import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Testing1
{
    public static void main(String[]args) throws IOException {

        CharStream Firstret= CharStreams.fromFileName("./src/Experimental.txt");
        ExprLexer lexer= new ExprLexer(Firstret);
        CommonTokenStream token=new CommonTokenStream(lexer);
        ExprParser parser=new ExprParser(token);
        ExprParser.ExprContext parseTree=parser.expr();
        System.out.println(parseTree.toStringTree());




    }


}
