public class Aplicacao {
	public static void main(String[] args){
		Tanque t1 = new Tanque( );
		Tanque t2 = new Tanque( );
		t1.setNivel(400.0);
		t2.setNivel(120.0);
		System.out.println("Nivel de t1: " + t1.getNivel( ) + ", Nivel de t2: " + t2.getNivel( ));
		t1 = t2;
		System.out.println("Nivel de t1: " + t1.getNivel( ) + ", Nivel de t2: " + t2.getNivel( ));
		t1.setNivel(500.0);
		System.out.println("Nivel de t1: " + t1.getNivel( ) + ", Nivel de t2: " + t2.getNivel( ));
	}
}



/*
Saídas do console nas linhas 07, 09 e 11, respectivamente:
Nivel de t1: 400.0, Nivel de t2: 120.0
Nivel de t1: 120.0, Nivel de t2: 120.0
Nivel de t1: 500.0, Nivel de t2: 500.0
 */