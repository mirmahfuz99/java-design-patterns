public class File implements FileSystem{

    String fileName;

    File(String name){
        this.fileName = name;
    }

    @Override
    public void ls() {
        System.out.println("File name is " + fileName);;
    }
    
}
