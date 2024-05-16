//Command concreate class

public class TurnACOnCommand implements ICommand{

    AirConditioner ac;

    TurnACOnCommand( AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }
    
}
