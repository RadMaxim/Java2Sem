package CreateClass;
//

import CreateClass.MethodsCheckData.CheckNames;
import CreateClass.MethodsCheckData.CheckPlaces;


public class Ship {
    int places;
    String nameShip;
    double velocity;
    double volume;
    String[] listPerson;

    public Ship(int places, String nameShip, double velocity, double volume, String[] listPerson) {
        this.places = CheckPlaces.checkPlaces(places);
        this.nameShip = CheckNames.checkName(nameShip);
        this.velocity = velocity;
        this.volume = volume;
        this.listPerson = listPerson;
    }
}
