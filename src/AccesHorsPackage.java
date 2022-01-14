import ma.education.tp1.introduction.Salle;


public class AccesHorsPackage extends Salle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Salle SalleB=new Salle();
      
      System.out.println(SalleB.id + " "  + SalleB.nom);
     
      
      
      
	}
	public  void afficher(Salle s) { 
		System.out.println(s.id );
		System.out.println(s.nom );
		System.out.println(id ); 
		System.out.println(nom );


}
}