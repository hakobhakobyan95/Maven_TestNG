public class Park {
    Car [][] floors = new Car[3][3];
    int count = 0;

    public int getCount() {
        return count;
    }

    public void addCar(Car a){
        count ++;
        int i = 0;
        if(a.bodyType() == BodyType.Sedan) {
            i = 0;
        }
        else if (a.bodyType() == BodyType.Jeep){
            i =1;
        }else if(a.bodyType() == BodyType.Coup){
            i = 2;
        }
        for (int j = 0;j < floors[i].length;j ++){
            if(floors[i][j] == a){
                System.out.print("The car has already parked!");
            }else if (floors[i][j] == null){
                floors[i][j] = a;
                System.out.println("The car parked in " + j);
                break;
            }
        }
//        System.out.println("The park is full!\n Please remove a car");
        return;
    }

    public void removeCar(BodyType bodyType,int index){
        int i = 0;
        if(bodyType == BodyType.Sedan) {
            i = 0;
        }
        else if (bodyType == BodyType.Jeep){
            i =1;
        }else if(bodyType == BodyType.Coup){
            i = 2;
        }
        if(floors[i][index] != null && index <floors[i].length && index >=0){
            floors[i][index] = null;
            System.out.println("The car is removed");
        }else {
            System.out.println("Car is not there");
        }
    }
}