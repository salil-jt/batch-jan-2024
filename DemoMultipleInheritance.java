class DemoMultipleInheritance{
public static void main(String arg[])
    {
    }

}

class VehicleTest{


}


class RegisteredVehicleTest extends VehicleTest{


}


class NonRegisteredVehicleTest extends VehicleTest{


}


class SubVehicle extends RegisteredVehicleTest,NonRegisteredVehicleTest{



}