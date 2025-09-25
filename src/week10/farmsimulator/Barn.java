package week10.farmsimulator;

import java.util.Collection;

public class Barn {
    BulkTank tank;
    MilkingRobot milkingRobot;

    public Barn(BulkTank tank){
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            this.milkingRobot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        if(this.milkingRobot == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        } else {
            for (Cow cow : cows) {
                this.milkingRobot.milk(cow);
            }
        }
    }

    public String toString(){
        return this.tank.toString();
    }
}
