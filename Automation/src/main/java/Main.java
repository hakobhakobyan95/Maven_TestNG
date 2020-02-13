    public class Main {
        public static void main(String [] args){
            Audi audi = new Audi("Karen",BodyType.Sedan);
            Audi bmw = new Audi("Karen",BodyType.Sedan);
            Audi merc = new Audi("Karen",BodyType.Sedan);
            Audi kia = new Audi("Karen",BodyType.Sedan);


//        audi.changeEngineState(true);
//        audi.changeSpeed(200);
//        audi.changeSpeed(100);
//        audi.changeSpeed(100);
//        audi.getInfo();
            Park a = new Park();
//            a.addCar(audi);
            a.removeCar(BodyType.Sedan,0);
//        a.removeCar(BodyType.Sedan,0);


        }
    }

