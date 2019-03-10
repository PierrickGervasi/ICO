import java.util.ArrayList;
import java.util.List;


public class Ordonnancement {

	/**************************************************************************/
    /*                      ATTRIBUTS                                           /                            
    /**************************************************************************/
    
	private Tache [] ordonnancement;
	int dureeOrdonnancement;
	
	/**************************************************************************/
    /*                      CONSTRUCTEURS                                      /                            
    /**************************************************************************/
    
	public Ordonnancement() {
		this.ordonnancement = new Tache [10];
		this.dureeOrdonnancement=0;
	}

	public Ordonnancement(Tache [] ordonnancement) {
		this.ordonnancement=ordonnancement;
		this.dureeOrdonnancement=0;
	}
	
	/**************************************************************************/
    /*                      GETTERS                                           /                            
    /**************************************************************************/
    
	public Tache[] getOrdonnancement() {
		return this.ordonnancement;
	}
	
	public int getDureeOrdonnancement() {
		return dureeOrdonnancement;
	}

	/**************************************************************************/
    /*                      SETTERS                                           /                            
    /**************************************************************************/
    
	public void setOrdonnancement(Tache[] ordonnancement) {
		this.ordonnancement = ordonnancement;
	}
		
	/**
	 * @return ************************************************************************/
    /*                      METHODS                                           /                            
    /***********************************************************************/
    
	public int max(int a, int b) {
		if (a>=b) return a;
		else return b;
	}
	
	
	public int calculCoût() {
		this.ordonnancement[0].setDatesDebutSurMachines(1,0);
		this.ordonnancement[0].setDatesFinSurMachines(1, this.ordonnancement[0].getDatesDebutSurMachines(1)+this.ordonnancement[0].getDurees(1));
		
		this.ordonnancement[0].setDatesDebutSurMachines(2,this.ordonnancement[0].getDatesFinSurMachines(1));
		this.ordonnancement[0].setDatesFinSurMachines(2, this.ordonnancement[0].getDatesDebutSurMachines(2)+this.ordonnancement[0].getDurees(2));

		this.ordonnancement[0].setDatesDebutSurMachines(3,this.ordonnancement[0].getDatesFinSurMachines(2));
		this.ordonnancement[0].setDatesFinSurMachines(3, this.ordonnancement[0].getDatesDebutSurMachines(3)+this.ordonnancement[0].getDurees(3));
		
		for (int i=1; i<10;i++) {
			
			this.ordonnancement[i].setDatesDebutSurMachines(1,this.ordonnancement[i-1].getDatesFinSurMachines(1));
			this.ordonnancement[i].setDatesFinSurMachines(1, this.ordonnancement[i].getDatesDebutSurMachines(1)+this.ordonnancement[i].getDurees(1));
			
			this.ordonnancement[i].setDatesDebutSurMachines(2,max(this.ordonnancement[i].getDatesFinSurMachines(1), this.ordonnancement[i-1].getDatesFinSurMachines(2)));
			this.ordonnancement[i].setDatesFinSurMachines(2, this.ordonnancement[i].getDatesDebutSurMachines(2)+this.ordonnancement[i].getDurees(2));

			this.ordonnancement[i].setDatesDebutSurMachines(3,max(this.ordonnancement[i].getDatesFinSurMachines(2), this.ordonnancement[i-1].getDatesFinSurMachines(3)));
			this.ordonnancement[i].setDatesFinSurMachines(3, this.ordonnancement[i].getDatesDebutSurMachines(3)+this.ordonnancement[i].getDurees(3));
			
		}		
		return (this.ordonnancement[9].getDatesFinSurMachines(3));
	}
	

	/**************************************************************************/
    /*                      TOSTRING                                           /                            
    /**************************************************************************/
    
	

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
        
        Ordonnancement Ordo1=new Ordonnancement(new Tache [] {T1,T2,T3,T4,T5,T6,T7,T8,T9,T10});
         
        System.out.println("Le coût de cet ordonnancement est de :");
        System.out.println(Ordo1.calculCoût());
        System.out.println("\n");
        
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
