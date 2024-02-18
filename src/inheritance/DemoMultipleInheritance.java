package inheritance;
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

/*Not allowed
class SubVehicle extends RegisteredVehicleTest,NonRegisteredVehicleTest{



}*/