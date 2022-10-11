public class es1client {

    public static void main( String[] args )throws Exception
    {
        Socket s= new Socket("localhost",3000);
        PrintWriter pr = new PrintWriter(s.getOutputStream());

        BufferedReader inputStrem = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        String str = inputStrem.readLine();
        
        BufferedReader altezza =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Server --> "+ str);
        String stringAltezza = altezza.readLine();
        pr.println(stringAltezza);
        pr.flush();

        BufferedReader inputStrem2 = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        String str2 = inputStrem2.readLine();

        BufferedReader peso = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Server --> "+ str2);
        String stringPeso = peso.readLine();
        pr.println(stringPeso);
        pr.flush();

        /*InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);*/

        BufferedReader inputStrem1 = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        String str1 = inputStrem1.readLine();
        System.out.println("Server --> "+ str1);

        BufferedReader inputStrem3 = new BufferedReader(new InputStreamReader(s.getInputStream())); 
        String str3 = inputStrem3.readLine();
        System.out.println("Server --> " + str3);

        s.close();

    }

}