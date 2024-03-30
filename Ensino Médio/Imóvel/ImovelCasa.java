package Imóvel;
public class ImovelCasa extends Imovel {
	private boolean mobilia;
	
	public void qtdAndar(int andares){
		System.out.println("Quantidade de andares: " + andares);
	}
	public void setMobilia(boolean mobilia) {
		this.mobilia = mobilia;
	}
	public boolean getMobilia() {
		return mobilia;
	}
	public static void main(String[] args) {
		ImovelCasa casa = new ImovelCasa();
		casa.area = 360;
		casa.mobilia = true;
		
		casa.qtdAndar(1);
		
	}
}
