import java.io.File;

public class FileList {
    public static void main(String[] args) {
        File file = new File("/Java");

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        } else if (file.isFile()){
            System.out.println(file.getName());
        }else {
            System.out.println("else -- " + file.getName());
        }
    }
}
