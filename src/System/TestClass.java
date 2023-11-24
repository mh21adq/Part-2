package System;

public class TestClass {
    public static void main(String[] args) {
        Name name = new Name("Numan");
        //System.out.println(name.getName());
        IceSkater ice=new IceSkater(name,"01/02/1998","bd","IceSkating","beginner");
        //System.out.println(ice.calculateAge());
        //ice.enterScore(1);
        //ice.enterScore(1);
        //System.out.println(ice.getFullDetails());

        Name name1 = new Name("hussain" );
        IceSkater ice1=new IceSkater(name,"01/02/1998","uk","IceSkating","beginner");
       // System.out.println(ice1.calculateAge());
        //System.out.println(ice1.getFullDetails());


        Name name2 = new Name("x" );
        IceSkater ice2=new IceSkater(name2,"01/02/1998","uk","IceSkating","beginner");
        Name name3 = new Name("y" );
        IceSkater ice3=new IceSkater(name3,"01/02/1998","uk","IceSkating","INTERMEDIATE");

        //chheck competiotor list methods
        CompetitorList list=new CompetitorList();
        list.addCompetitor(ice);
        list.addCompetitor(ice1);
        list.addCompetitor(ice2);
        list.addCompetitor(ice3);

        for(Competitor l:list.getCompetitorList())
        {

            System.out.print(","+l.getFullDetails());
        }

        list.removeCompetitor(ice);
       /* for(Competitor l:list.getCompetitorList())
        {

            System.out.print(","+l.getID());
        }

        */
        System.out.println("\n");
        for(Competitor l:list.getCompetitorsByLevel("INTERMEDIATE"))
        {

            System.out.print(","+l.getID());
        }
    }
}
