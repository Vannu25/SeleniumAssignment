import java.io.File;
public class ChangeFilePermission{

       public static void main(String[] args)throws SecurityException {

        File file = new File("C:/setExecuteTest.txt");

        if (file.exists()) {
            boolean bval = file.setExecutable(true);
            System.out.println("set the owner's execute permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }

       if (file.exists()) {
            boolean bval = file.setExecutable(true,false);
            System.out.println("set the everybody execute permission: "+ bval);
        } else {
            System.out.println("File cannot exists: ");
        }
    }
}



