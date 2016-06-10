
public class Ork extends Character
{
	 
	
	public Ork(String nName, String nAlias, String nMeta, String nEthnicity, int nAge, int nKarma, int nTotalKarma, int nBody, int nAgility,
			int nReaction, int nStrength, int nWillpower, int nLogic, int nIntuition, int nCharisma, int nEdge, int nMagic,
			String nMagicType)
	{
		super(nName, nAlias, nMeta, nEthnicity, nAge, nKarma, nTotalKarma, nBody, nAgility, nReaction, nStrength,
				nWillpower, nLogic, nIntuition, nCharisma, nEdge,nMagic, nMagicType);
		
		this.setMaxBody(9);
		this.setMaxStrength(8);
		this.setMaxLogic(5);
		this.setMaxCharisma(5);
	}

	

}
