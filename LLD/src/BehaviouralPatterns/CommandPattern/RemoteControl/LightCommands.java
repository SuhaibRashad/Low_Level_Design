package BehaviouralPatterns.CommandPattern.RemoteControl;


public class LightCommands {

    public static class LightOnCommand implements Command {

        private Light light;

        public LightOnCommand(Light light) {
            this.light = light;
        }

        //TODO: Override the execute() method from the Command interface and Implement the logic to turn on the light when this command is executed.
        @Override
        public void execute(){
            this.light.turnOn();
        }


    }

    public static class LightOffCommand implements Command {

        private Light light;

        public LightOffCommand(Light light) {
            this.light = light;
        }

        //TODO: Override the execute() method from the Command interface and Implement the logic to turn off the light when this command is executed.
        @Override
        public void execute(){
            this.light.turnOff();
        }

    }
}