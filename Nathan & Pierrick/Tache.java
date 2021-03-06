import java.util.LinkedList;

public class Tache {
	
	/**************************************************************************/
    /*                      ATTRIBUTS                                           /                            
    /**************************************************************************/
    
    private int id;
    private int [] durees;
    private int [] datesDebutSurMachines;
    private int [] datesFinSurMachines;
    
    
    /**************************************************************************/
    /*                      CONSTRUCTEURS                                           /                            
    /**************************************************************************/
    
    public Tache(int id, int[] durees) {
		super();
		this.id = id;
		this.durees = durees;
		this.datesDebutSurMachines = new int[3];
		this.datesFinSurMachines = new int[3];
	}

    /**************************************************************************/
    /*                      SETTERS                                           /                            
    /**************************************************************************/
    
	public void setId(int id) {
		this.id = id;
	}
    
	public void setDurees(int machine, int duree) {
		this.durees[machine-1] = duree;
	}
	
	public void setDatesDebutSurMachines(int machine, int dateDebut) {
		this.datesDebutSurMachines[machine-1]=dateDebut;
	}
	
	public void setDatesFinSurMachines(int machine, int dateFin) {
		this.datesFinSurMachines[machine-1]=dateFin;
	}

    /**************************************************************************/
    /*                      GETTERS                                           /                            
    /**************************************************************************/

    public int getId() {
		return id;
	}

	public int getDurees(int machine) {
		return durees[machine-1];
	}

	public int getDatesDebutSurMachines(int machine) {
		return datesDebutSurMachines[machine -1];
	}

	public int getDatesFinSurMachines(int machine) {
		return datesFinSurMachines[machine-1];
	}


	/**************************************************************************/
    /*                      METHODS                                           /                            
    /**************************************************************************/
    

    
    /**************************************************************************/
    /*                      TOSTRING                                           /                            
    /**************************************************************************/
    
    @Override
    public String toString() {
    	return "T�che "+id+" : Machine 1 {dur�e = "+durees[0]+" ; d�but = "+datesDebutSurMachines[0]+" ; fin = "+datesFinSurMachines[0]+" } \n          Machine 2 {dur�e = "+durees[1]+" ; d�but = "+datesDebutSurMachines[1]+" ; fin = "+datesFinSurMachines[1]+" } \n          Machine 3 {dur�e = "+durees[2]+" ; d�but = "+datesDebutSurMachines[2]+" ; fin = "+datesFinSurMachines[2]+" }";
    }

    /**************************************************************************/
    /*                      MAIN                                           /                            
    /**************************************************************************/
    public static void main(String[] args) {
    	Tache T1=new Tache(1,new int [] {6,1,5});
        Tache T2=new Tache(2,new int [] {3,5,8});
        Tache T3=new Tache(3,new int [] {10,4,1});
        Tache T4=new Tache(4,new int [] {14,6,3});
        Tache T5=new Tache(5,new int [] {5,10,6});
        Tache T6=new Tache(6,new int [] {9,6,10});
        Tache T7=new Tache(7,new int [] {7,9,12});
        Tache T8=new Tache(8,new int [] {11,8,9});
        Tache T9=new Tache(9,new int [] {2,6,6});
        Tache T10=new Tache(10,new int [] {3,1,7});
        System.out.println(T1);
        System.out.println(T2);
        System.out.println(T3);
        System.out.println(T4);
        System.out.println(T5);
        System.out.println(T6);
        System.out.println(T7);
        System.out.println(T8);
        System.out.println(T9);
        System.out.println(T10);
    }
    
    
    
}


