import java.util.ArrayList;
import java.util.List;


//Create a container class to represent complex elements.

public class Directory implements FileSystem{

    String directoryName;
    List<FileSystem> fileSystemList;

    Directory(String name){
        this.directoryName = name;
        this.fileSystemList = new ArrayList<>();
    }


    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }


    @Override
    public void ls() {
        System.out.println("Directory name" + directoryName);
        for( FileSystem fileSystem : fileSystemList){
            fileSystem.ls();
        }
    }
    
}
