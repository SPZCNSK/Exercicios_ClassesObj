package br.com.generations.exercicioclasseobj;

public class EletronicoTeste {

	public static void main(String[] args) {
		
		Eletronico eletronic = new Eletronico();
		
		eletronic.pe�a = "Placa de V�deo (VGA)";
		eletronic.marca = "PC Yes!";
		eletronic.chip = "NVidia";
		eletronic.nome = "Placa de V�deo PC Yes! RTX 3060 8GB 256 bits";
		eletronic.pre�o = 5699.99;	
		
		System.out.println("====== PetaByte SHOP =====");
		System.out.println("CHECKOUT:\n\n");
		System.out.println("Produto: " + eletronic.nome);
		System.out.println("Marca: " + eletronic.marca + " / Chip Gr�fico: " + eletronic.chip + ".");
		System.out.println("Tipo: " + eletronic.pe�a + "\n\n");
		System.out.println("PRE�O TOTAL:" + eletronic.pre�o);

	}

}
