
public class Utilizator 
{
	protected String nume;
	protected String prenume;
	protected String username;
	protected String parola;
	protected String parolaRescrisa;
	protected String eMail;
	protected TipUtilizator utilizator;
	
	public Utilizator(String nume, String prenume, String username, String parola, String parolaRescrisa,
			String email, TipUtilizator utilizator) 
	{
		this.nume = nume;
		this.prenume = prenume;
		this.username = username;
		this.parola = parola;
		this.parolaRescrisa = parolaRescrisa;
		this.eMail = email;
		this.utilizator = utilizator;
	}
	
	public Utilizator() 
	{
		
	}
	public String getNume()
	{
		return nume;
	}
	public void setNume(String nume) 
	{
		this.nume = nume;
	}
	public String getPrenume() 
	{
		return prenume;
	}
	public void setPrenume(String prenume) 
	{
		this.prenume = prenume;
	}
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getParola() 
	{
		return parola;
	}
	public void setParola(String parola) 
	{
		this.parola = parola;
	}
	public String getParolaRescrisa() 
	{
		return parolaRescrisa;
	}
	public void setParolaRescrisa(String parolaRescrisa) 
	{
		this.parolaRescrisa = parolaRescrisa;
	}
	public String geteMail() 
	{
		return eMail;
	}
	public void seteMail(String eMail) 
	{
		this.eMail = eMail;
	}
	public TipUtilizator getUtilizator() 
	{
		return utilizator;
	}
	public void setUtilizator(TipUtilizator utilizator) 
	{
		this.utilizator = utilizator;
	}
	
	public String toString() 
	{
		return "Utilizator [nume=" + nume + ", prenume=" + prenume + ", username=" + username + ", parola=" + parola
				+ ", parolaRescrisa=" + parolaRescrisa + ", eMail=" + eMail + ", utilizator=" + utilizator + "]";
	}
	
}
