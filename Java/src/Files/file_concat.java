import java.io.FileInputStream;
import java.io.SequenceInputStream;

class file_concat{
        public static void main(String[] args){
            try{
                FileInputStream fis1=new FileInputStream("Files/test_write.txt");
                FileInputStream fis2=new FileInputStream("Files/test.txt");
 	 	        int x;
 	 	        SequenceInputStream sis=new SequenceInputStream(fis1,fis2); 	 	
 	 	        while((x=sis.read())!=-1)
 	 	 	        System.out.print((char)x);
 	 	        
                fis1.close();
                fis2.close();
                sis.close();
 	 	    }
            catch(Exception e){
                System.out.println("Error: "+e);
            }
        }
}