package week10.farmsimulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.SimpleTimeZone;

public class Farm {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner,  Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<>();
    }

    public String getOwner() {
        return this.owner;
    }

    public void addCow(Cow cow){
        this.cows.add(cow);
    }

    public void liveHour(){
        for(Cow cow : this.cows){
            cow.liveHour();
        }
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }

    public BulkTank getBulkTank(){
        return this.barn.getBulkTank();
    }

    public String toString(){
        String animals = "";
        if(this.cows.isEmpty()){
            animals += "No cows.";
        } else {
            animals += "Animals: \n";
            for(Cow cow : this.cows){
                animals += "\t\t" + cow.toString() + "\n";
            }
        }
        return "Farm owner: " + this.getOwner() + "\n"
                + "Barn bulk tank: " + barn.toString() + "\n"
                + animals;
    }

    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
}
