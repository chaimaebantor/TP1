package ma.education.tp1.introduction;

public class TestHeritage {
public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
	Salle s1=new SalleCours(1, "Salle 1", 20);
	SalleCours s2= new SalleCours(2, "Salle 2", 20);
	SalleCours s3=(SalleCours)s1;
	//6)- erreur de compilation il est impossible de declarer un objet de la class fille et le mettre dans la class mere.
	SalleCours s4=s2; 

	System.out.println(s4.id);
	System.out.println(s3.id + " " + s3.nom + " " + s3.nombre_de_places );
	
	Salle s5=new Laboratoire(2, "LABO", "CHIMIE"); 
	SalleCours s6= new SalleCours(2, "Salle 2", 20);
	//SalleCours s7=s5 ; 
	SalleCours s8=s6;
	
	
}
}