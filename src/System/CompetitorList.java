package System;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompetitorList {
    private ArrayList<Competitor> competitors;

    public CompetitorList() {
        this.competitors = new ArrayList<>();
    }

    public void addCompetitor(Competitor competitor) {
        this.competitors.add(competitor);
    }

    public void removeCompetitor(Competitor competitor) {
        this.competitors.remove(competitor);
    }
    public ArrayList<Competitor> getCompetitorList() {
        return new ArrayList<>(competitors); // Return a copy of the competitors list
    }

    public ArrayList<Competitor> getCompetitorsByLevel(String lev) {
        ArrayList<Competitor> CompetitorByLevel=new ArrayList<>();

        for(Competitor competitor:this.getCompetitorList())
        {
            if(competitor.getLevel().equals(lev))
            {
                CompetitorByLevel.add(competitor);
            }

        }
        return CompetitorByLevel;
    }


}
