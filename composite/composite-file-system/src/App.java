public class App {
    public static void main(String[] args) throws Exception {
        

        Directory moviDirectory = new Directory("Movie");

        FileSystem file = new File("Movie One");
        moviDirectory.add(file);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        FileSystem fileTwo = new File("Movie Two");
        comedyMovieDirectory.add(fileTwo);


        moviDirectory.add(comedyMovieDirectory);
        moviDirectory.ls();

    }
}
