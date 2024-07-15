package edu.icet.crm;


public class Main {

    public static void startVehicle(Vehicle vehicle) {
        vehicle.start();
    }

    public static void stopVehicle(EngineCode engineCode) {
        engineCode.stop("0123456789");
    }

    public static void main(String[] args) {
//        //Method 01
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Method 01");
//            }
//        }).start();
//
//        //Method 02
//        VehicleTask vehicleTask = new VehicleTask();
//        new Thread(vehicleTask).start();
//
//        //Method 03
//        new Thread(()->{
//            System.out.println("Method 03");
//        }).start();
//
//        //Method 04-since Runnable interface contains only one abstract method we can use labda expression
//        // since the logic contains one codeline , no need to use curly braces
//        Runnable runnable = ()-> System.out.println("Method 04");
//        new Thread(runnable).start();


        //Method 01
        startVehicle(new Car()); //Car Started

        //Method 02
        startVehicle(new Van()); //Van Started

        //Method 03
        startVehicle(new Vehicle() {
            @Override
            public void start() {
                System.out.println("Lorry Started");
            }
        }); //Lorry Started

        //Method 04
        Vehicle vehicle = () -> System.out.println("Bus Started");
        startVehicle(vehicle); //Bus Started

        //Method 05
        EngineCode engineCode = (code)-> System.out.println(code);
        stopVehicle(engineCode); //0123456789

        //Method 06
        EngineCode engineCode2 = code2-> System.out.println(code2);
        stopVehicle(engineCode); //0123456789

        //Method 07
        stopVehicle((code3)-> System.out.println(code3)); //0123456789

        //Java Method Referencing
        //Method 08
        stopVehicle(System.out::println); //0123456789
    }
}