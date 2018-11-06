
import java.util.Scanner;


public class encryption {

    protected String plaintext;
    protected String cyphertext;
    protected String Key;

    public String GetPlainText()
    {

        Scanner s = new Scanner(System.in);
        while (true)
        {
            String data = s.nextLine();
            if (data.length() > 0)
            {
                System.out.println(data);

                plaintext = data;

            }
        }
    }

    public  String GetCypherText(){
        {

            Scanner s = new Scanner(System.in);
            while (true)
            {
                String data = s.nextLine();
                if (data.length() > 0)
                {
                    System.out.println(data);

                    cyphertext = data;

                }
            }
        }
    }

    public void Encrypt(){
        for (int x = 0; x < plaintext.length(); x ++)
        {

        }

    }

    public void Decrypt(){}

    protected void EncryptCharacterNumber( int whichOne){}

    protected void GetKey(String message)
    {
            while (true)
            {
                Scanner s = new Scanner(System.in);

                System.out.println(message);

                String data = s.nextLine();


                try{ int Key = Integer.parseInt(data);
                    break;

                } catch(Exception e){

                    System.out.println(e.getMessage());
                    continue;
                }



            }
    }

    public void ShowPlainText()
    {
        System.out.println(plaintext);
    }

    public void ShowCypherText()
    {
        System.out.println(cyphertext);
    }
}
