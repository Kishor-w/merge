package jsonexample;


import java.io.*;

public class Json {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       // FileReader fr = new FileReader("/Users/admin/Documents/File/file1.json");
       // FileReader fr1 = new FileReader("/Users/admin/Documents/File/file2.json");
       // FileReader fr2 = new FileReader("/Users/admin/Documents/File/file3.json");
        PrintWriter my_pw = new PrintWriter("C:\\Users\\91909\\Desktop\\File\\output.json");
        BufferedReader my_br = new BufferedReader(new FileReader("C:\\Users\\91909\\Desktop\\File\\file1.json"));
        String my_line = my_br.readLine();
        while (my_line != null) {
           my_pw.println(my_line);
           my_line = my_br.readLine();
        }
        my_br = new BufferedReader(new FileReader("C:\\Users\\91909\\Desktop\\File\\file2.json"));
        my_line = my_br.readLine();
        while(my_line != null) {
           my_pw.println(my_line);
           my_line = my_br.readLine();
        }
        my_br = new BufferedReader(new FileReader("C:\\Users\\91909\\Desktop\\File\\file3.json"));
        my_line = my_br.readLine();
        while(my_line != null) {
           my_pw.println(my_line);
           my_line = my_br.readLine();
        }
        my_pw.flush();
        my_br.close();
        my_pw.close();
        System.out.println("file mergeed  successfully."+my_pw);
    } 
}

