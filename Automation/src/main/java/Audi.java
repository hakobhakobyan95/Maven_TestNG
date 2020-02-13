    public class Audi implements Car {
        private int speed;
        private String owner;
        private boolean engineState;
        BodyType bodyType;

        Audi (String owner,BodyType bodyType){
            this.owner = owner;
            this.bodyType = bodyType;

        }
        @Override
        public void changeEngineState(boolean engineState) {
            this.engineState = engineState;
            if (engineState){
                System.out.print("Engine is turn on");
            }else {
                System.out.print("Please turn on engine");
            }
        }

        @Override
        public void changeSpeed(int speed) {
            if (engineState == true){
                this.speed = this.speed + speed;
                if(this.speed <= maxSpeed){
                    System.out.println(this.speed);
                }else {
                    System.out.println("Speed is more than" + maxSpeed);
                }
            }else {
                System.out.println("Please turn on engine");
            }
        }

        @Override
        public void getInfo() {
            System.out.println("Body: " + this.bodyType + "Owner: " + this.owner);
        }

        @Override
        public BodyType bodyType() {
            return this.bodyType;
        }
    }


