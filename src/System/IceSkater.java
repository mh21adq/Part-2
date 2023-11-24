package System;

public class IceSkater extends Competitor {
    private LevelString level;
    public IceSkater(Name name,String dob,String country,String category,String lev)
    {
        super(name,dob,country,category);
        this.level= LevelString.valueOf(lev.toUpperCase());

    }

    @Override
    public String getFullDetails() {
        String s = "\nCompetitor Number:"+this.getID()+"\nName:" + this.name.getName()+"\nAge:"+this.calculateAge()+"\nScores"+this.getScores()+"Level:"+this.level;
        return s;
    }

    @Override
    public void updateInformation() {

    }

    @Override
    public  String getLevel() {
        return ""+this.level;
    }
}
