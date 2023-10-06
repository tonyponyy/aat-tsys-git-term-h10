
public class main_app {
	public static void main(String[] args) {
		
		Serie arraySerie[] = new Serie[5];
		Videojuego arrayVideojuego[] = new Videojuego[5];
		
		/*Rellenando array de series*/
		
		arraySerie[0]= new Serie(); 
		arraySerie[1]= new Serie("Tokyo Vice", "suspense", 1, "J.T. Rogers");
		arraySerie[2]= new Serie("Naruto", "animación", 9, "Masashi Kishimoto");
		arraySerie[3]= new Serie("Hermanos de sangre","bélica", 1,  "HBO");		
		arraySerie[4]= new Serie("The Big bang Theory", "comedia", 12, "Mark Cendrowski");
		
		/*Rellenando array de videojuegos*/
		
		arrayVideojuego[0]= new Videojuego();
		arrayVideojuego[1]= new Videojuego("Hogwarts Legacy",35, "fantasia", "Avalanche Software");
		arrayVideojuego[2]= new Videojuego("Final Fantasy XVI", 10,"rol de acción", "Square Enix");
		arrayVideojuego[3]= new Videojuego("Mario Kart 8",80, "carreras", "Nintendo");		
		arrayVideojuego[4]= new Videojuego("Alex Kidd in Miracle World", 15, "plataforma", "Sega");
		
		arrayVideojuego[4].entregar();
		arrayVideojuego[2].entregar();
		arraySerie[3].entregar();
		arraySerie[1].entregar();
				
		/*Contaje*/
		int entregados = 0;
		for (int i = 0; i < arrayVideojuego.length; i++) {
			if(arrayVideojuego[i].isEntregado()) {
				entregados=+1;
				arrayVideojuego[i].devolver();
			}
			if(arraySerie[i].isEntregado()) {
				entregados=+1;
				arraySerie[i].devolver();
			}
		} 
		System.out.println("Se entregan: "+entregados);
		
		
	}

}
