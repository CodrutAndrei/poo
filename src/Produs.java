
public class Produs 
{
	private int cod;
	private String denumire;
	private int cantitate;
	private int pret;
	public int getCod() 
	{
		return cod;
	}
	public void setCod(int cod) 
	{
		this.cod = cod;
	}
	public String getDenumire() 
	{
		return denumire;
	}
	public void setDenumire(String denumire) 
	{
		this.denumire = denumire;
	}
	public int getCantitate() 
	{
		return cantitate;
	}
	public void setCantitate(int cantitate) 
	{
		this.cantitate = cantitate;
	}
	public int getPret() 
	{
		return pret;
	}
	public void setPret(int pret) 
	{
		this.pret = pret;
	}
	
	public String toString() 
	{
		return "Produs [cod=" + cod + ", denumire=" + denumire + ", cantitate=" + cantitate + ", pret=" + pret + "]";
	}
	
	
	
}
