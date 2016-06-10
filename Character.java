import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;

public class Character implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String charName = "";
	private String metaType = "";
	private String alias = "";
	private String ethnicity = "";
	private int age;
	private int curKarma;
	private int totalKarma;
	
	private int body;
	private int agility;
	private int reaction;
	private int strength;
	private int willpower;
	private int logic;
	private int intuition;
	private int charisma;
	
	private int maxBody;
	private int maxAgility;
	private int maxReaction;
	private int maxStrength;
	private int maxWillpower;
	private int maxLogic;
	private int maxIntuition;
	private int maxCharisma;
	
	private int physLimit;
	private int mentLimit;
	private int socLimit;
	
	private int edge;
	private int maxEdge;
	private int essence;
	private int magic;
	private String magicType;
	
	private ArrayList<Quality> qualities = new ArrayList<Quality>();
	private ArrayList<Skill> skills = new ArrayList<Skill>();
	private ArrayList<Weapon> weapons = new ArrayList<Weapon>();
	
	///character constructors
	public Character(){}
	public Character(String nName, String nAlias, String nMeta, String nEthnicity, int nAge,
			int nKarma, int nTotalKarma, int nBody, int nAgility, int nReaction, int nStrength,
			int nWillpower, int nLogic, int nIntuition, int nCharisma, int nEdge, int nMagic, String nMagicType)
	{
		this.setCharName(nName);
		this.setAlias(nAlias);
		this.setMetaType(nMeta);
		this.setEthnicity(nEthnicity);
		
		this.setAge(nAge);
		this.setCurKarma(nKarma);
		this.setTotalKarma(nTotalKarma);
	
		this.setBody(nBody);
		this.setAgility(nAgility);
		this.setReaction(nReaction);
		this.setStrength(nStrength);
		this.setWillpower(nWillpower);
		this.setLogic(nLogic);
		this.setIntuition(nIntuition);
		this.setCharisma(nCharisma);
		
		this.setMaxBody(6);
		this.setMaxAgility(6);
		this.setMaxReaction(6);
		this.setMaxStrength(6);
		this.setMaxWillpower(6);
		this.setMaxLogic(6);
		this.setMaxIntuition(6);
		this.setMaxCharisma(6);
		
		this.setEdge(nEdge);
		this.setMaxEdge(6);
		this.setEssence(6);
		this.setMagic(nMagic);
		this.setMagicType(nMagicType);
		
		this.physLimit = Math.round(((this.strength * 2) + this.body + this.reaction)/3);
		this.mentLimit = Math.round(((this.logic * 2) + this.willpower + this.intuition)/3);
		this.physLimit = Math.round(((this.charisma * 2) + this.willpower + this.essence)/3);
		
	}
	
////CHARCTER CREATION METHOD/////////
	public static void createCharacter()
	{
		Scanner userScan = new Scanner(System.in);
		
		//Character Constructor: Name, Alias, Meta, Ethnicity, age, karma, totalKarma, body, agility, reaction, strength, willpower, logic, intuition,
		//charisma, edge, magic, magicType
		Character tempChar = new Character();
		int tempInt;
		
		//////////GENERAL INFORMATION////////////
		System.out.println("Please enter your meta: ");
		tempChar.setMetaType(userScan.next());
		
		System.out.println("Please enter your name: ");
		tempChar.setCharName(userScan.next());
		
		System.out.println("Please enter your alias (Retype your name if you don't have one");
		tempChar.setAlias(userScan.next());
		
		System.out.println("Enter your ethnicity: ");
		tempChar.setEthnicity(userScan.next());
		
		System.out.println("Enter your age: ");
		tempChar.setAge(userScan.nextInt());
		
		System.out.println("Enter your Karma (0 if you have none): ");
		tempInt = userScan.nextInt();
		tempChar.setCurKarma(tempInt);
		
		if (tempInt > 0)
		{
			System.out.println("Enter your total karma: ");
			tempChar.setTotalKarma(userScan.nextInt());
		}
		else
			tempChar.setTotalKarma(tempInt);
		
		/////////////CHARACTER ATTRIBUTES///////////////
		System.out.println("Please enter your stats in the following order (make sure to press enter after each):\nBody:\nAgility:\nReaction:\nStrength:\nWillpower:\nLogic:\nIntuition:\nCharisma:\nEdge:");
		tempChar.setBody(userScan.nextInt());
		tempChar.setAgility(userScan.nextInt());
		tempChar.setReaction(userScan.nextInt());
		tempChar.setStrength(userScan.nextInt());
		tempChar.setWillpower(userScan.nextInt());
		tempChar.setLogic(userScan.nextInt());
		tempChar.setIntuition(userScan.nextInt());
		tempChar.setCharisma(userScan.nextInt());
		tempChar.setEdge(userScan.nextInt());
		tempInt = userScan.nextInt();
		
		System.out.println("Are you an aspected magician, magician, mystic adept, adept, technomancer, or mundane?");
		tempChar.setMagicType(userScan.next());
		
		if (!tempChar.getMagicType().toLowerCase().equals("mundane"))
		{
			System.out.println("What is your magic/resonance rating?");
			tempChar.setMagic(userScan.nextInt());
		}
		else
			tempChar.setMagic(0);
		
		/////////////QUALITIES///////////
		System.out.println("Do you have any qualities?");
		if (userScan.next().toLowerCase().equals("yes"))
		{
			System.out.println("How many?");
			tempInt = userScan.nextInt();
			String tempQuality;
			
			for (int i = 0; i < tempInt; i++)
			{
				System.out.println("Please enter the name of the quality (enter \"end\" to cancel): ");
				tempQuality = userScan.next();
				if (tempQuality.toLowerCase().equals("cancel"))
					break;
				else
				{
					boolean errorMessage = true;
					for (int j = 0; j < tempInt; j++)
					{
						errorMessage = true;
						if (Quality.getQualityList().get(i).getName().equals(tempQuality))
						{
							tempChar.getQualities().add(Quality.getQualityList().get(i));
							errorMessage = false;
						}
	
					}
					if (errorMessage)
					{
						System.out.println("Error://0010: Quality does not exist. Please try again or contact developer at jade.na.marshall@gmail.com.");
						i = -1;
					}
				}
			}
		}
		userScan.close();
		
	}
	
/////////////////////////////////////////////GETTER AND SETTER METHODS//////////////////////////////////////
	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getMetaType() {
		return metaType;
	}

	public void setMetaType(String metaType) {
		this.metaType = metaType;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCurKarma() {
		return curKarma;
	}

	public void setCurKarma(int curKarma) {
		this.curKarma = curKarma;
	}

	public int getTotalKarma() {
		return totalKarma;
	}

	public void setTotalKarma(int totalKarma) {
		this.totalKarma = totalKarma;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getReaction() {
		return reaction;
	}

	public void setReaction(int reaction) {
		this.reaction = reaction;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getWillpower() {
		return willpower;
	}

	public void setWillpower(int willpower) {
		this.willpower = willpower;
	}

	public int getLogic() {
		return logic;
	}

	public void setLogic(int logic) {
		this.logic = logic;
	}

	public int getIntuition() {
		return intuition;
	}

	public void setIntuition(int intuition) {
		this.intuition = intuition;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getMaxBody() {
		return maxBody;
	}

	public void setMaxBody(int maxBody) {
		this.maxBody = maxBody;
	}

	public int getMaxAgility() {
		return maxAgility;
	}

	public void setMaxAgility(int maxAgility) {
		this.maxAgility = maxAgility;
	}

	public int getMaxReaction() {
		return maxReaction;
	}

	public void setMaxReaction(int maxReaction) {
		this.maxReaction = maxReaction;
	}

	public int getMaxStrength() {
		return maxStrength;
	}

	public void setMaxStrength(int maxStrength) {
		this.maxStrength = maxStrength;
	}

	public int getMaxWillpower() {
		return maxWillpower;
	}

	public void setMaxWillpower(int maxWillpower) {
		this.maxWillpower = maxWillpower;
	}

	public int getMaxLogic() {
		return maxLogic;
	}

	public void setMaxLogic(int maxLogic) {
		this.maxLogic = maxLogic;
	}

	public int getMaxCharisma() {
		return maxCharisma;
	}

	public void setMaxCharisma(int maxCharisma) {
		this.maxCharisma = maxCharisma;
	}

	public int getMaxIntuition() {
		return maxIntuition;
	}

	public void setMaxIntuition(int maxIntuition) {
		this.maxIntuition = maxIntuition;
	}

	public int getPhysLimit() {
		return physLimit;
	}

	public void setPhysLimit(int physLimit) {
		this.physLimit = physLimit;
	}

	public int getMentLimit() {
		return mentLimit;
	}

	public void setMentLimit(int mentLimit) {
		this.mentLimit = mentLimit;
	}

	public int getSocLimit() {
		return socLimit;
	}

	public void setSocLimit(int socLimit) {
		this.socLimit = socLimit;
	}

	public int getEdge() {
		return edge;
	}

	public void setEdge(int edge) {
		this.edge = edge;
	}
	
	public int getMaxEdge() {
		return maxEdge;
	}

	public void setMaxEdge(int maxEdge) {
		this.maxEdge = maxEdge;
	}

	public int getEssence() {
		return essence;
	}

	public void setEssence(int essence) {
		this.essence = essence;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public String getMagicType() {
		return magicType;
	}

	public void setMagicType(String magicType) {
		this.magicType = magicType;
	}
	public ArrayList<Quality> getQualities() {
		return qualities;
	}
	public void setQualities(ArrayList<Quality> qualities) {
		this.qualities = qualities;
	}
	public ArrayList<Skill> getSkills() {
		return skills;
	}
	public void setSkills(ArrayList<Skill> skills) {
		this.skills = skills;
	}
	public ArrayList<Weapon> getWeapons() {
		return weapons;
	}
	public void setWeapons(ArrayList<Weapon> weapons) {
		this.weapons = weapons;
	}
}