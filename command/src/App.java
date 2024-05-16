public class App {
    public static void main(String[] args) throws Exception {

        //AC object
        AirConditioner airConditioner = new AirConditioner();

        //remote object
        RemoteControl remoteControl = new RemoteControl();

        //Create the command and press the button
        // remoteControl.setCommand(new TurnACOnCommand(airConditioner));
        remoteControl.setCommand(new TurnACOffCommand(airConditioner));
        remoteControl.pressButton();
    }
}
