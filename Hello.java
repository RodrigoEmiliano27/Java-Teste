
// Java program to demonstrate BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {
    public static void main (String[]args) 
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

        try
        {
            // Reading data using readLine
            String input1 = reader.readLine();
            String input2= reader.readLine();
            System.out.println("Resultado => " + input1 + " + " + input2 + " = " + (Integer.parseInt(input1) +Integer.parseInt(input2)));
        }
        catch(IOException io)
        {
            System.out.println("Erro");

        }
        finally
        {
            
        }
 
        // Printing the read line
        
    }
    
}
