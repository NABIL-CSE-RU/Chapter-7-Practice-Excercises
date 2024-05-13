package Exercise11;

import java.util.Scanner;

public class FilePrint {
    public String driveLetter, path, filename, extension;

    public FilePrint() {
        scan();
    }

    public void scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Drive Letter: ");
         driveLetter = scanner.next();
        System.out.println("Enter Path: ");
       path = scanner.next();
        System.out.println("Enter File Name: ");
        filename = scanner.next();
        System.out.println("Enter Extension : ");
        extension = scanner.next();

    }
    public String getFileLocation(){
        String FileAddress;
        if (System.getProperty("os.name").startsWith("Windows")){
       FileAddress= driveLetter + ":\\" + path + "\\" + filename + "." + extension ;
        }
        else {
            FileAddress = path + "/" + filename + "." + extension;
        }
        return FileAddress;
    }
}
