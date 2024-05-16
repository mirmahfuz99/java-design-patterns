//Invoker
public class RemoteControl {

    ICommand command;

    RemoteControl(){

    }


    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
    
}
