
public class Vanzator extends Utilizator
{
	public Vanzator() 
	{
		super();
		this.utilizator = TipUtilizator.VANZATOR;
	}
	
	public Vanzator(String nume, String prenume, String username, String parola, String parolaRescrisa,
			String email) 
	{
		super(nume, prenume, username , parola,  parolaRescrisa,
			 email, TipUtilizator.VANZATOR); 
		
	}
}
