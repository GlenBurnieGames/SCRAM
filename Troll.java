
public class Troll extends Character
{

	public Troll(String nName, String nAlias, String nMeta, String nEthnicity, int nAge, int nKarma, int nTotalKarma, int nBody, int nAgility,
			int nReaction, int nStrength, int nWillpower, int nLogic, int nIntuition, int nCharisma, int nEdge, int nMagic,
			String nMagicType)
	{
		super(nName, nAlias, nMeta, nEthnicity, nAge, nKarma, nTotalKarma, nBody, nAgility, nReaction, nStrength,
				nWillpower, nLogic, nIntuition, nCharisma, nEdge,nMagic, nMagicType);
	
		this.setMaxBody(10);
		this.setMaxAgility(5);
		this.setMaxStrength(10);
		this.setMaxLogic(5);
		this.setMaxIntuition(5);
		this.setMaxCharisma(4);
	}
	

}
