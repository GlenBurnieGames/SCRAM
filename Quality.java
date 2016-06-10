import java.util.ArrayList;


public class Quality
{
	private static ArrayList<Quality> qualityList = new ArrayList<Quality>();
	
	private String name = "";
	private String description = "";
	private boolean isPositive;
	private int cost;
	
	public Quality()
	{
	}
	public Quality(String nName, String nDescription, boolean nPositive, int nCost)
	{
		this.name = nName;
		this.description = nDescription;
		this.isPositive = nPositive;
		this.cost = nCost;
	}
	
	
	
	
	//////LIST OF ALL AVAILABLE QUALITIES FROM RUN & GUN, CORE, RUN FASTER, STREET GRIMIORE, BULLETS AND BANDAGES, AND SHADOW SPELLS//////////////
	
	Quality p1 = new Quality("Ambidextrous", "The Ambidextrous character can handle objects equally well with either hand. Without this quality, any action performed solely with the off–hand (i.e., firing a gun) suffers a –2 dice pool modifier (see Attacker Using Off-Hand Weapon, p. 178).", true, 4);
	Quality p2 = new Quality("Analytical Mind", "Analytical Mind describes the uncanny ability to logically analyze information, deduce solutions to problems, or separate vital information from distractions and noise. It’s useful in cracking cyphers, solving puzzles, figuring out traps, and sifting through data. This quality gives the character a +2 dice pool modifier to any Logic Tests involving pattern recognition, evidence analysis, clue hunting, or solving puzzles. This quality also reduces the time it takes the character to solve a problem by half.", true, 5);
	Quality p3 = new Quality("Aptitude", "This quality is how you become even better than the best in the world. The standard limit for skills is 12. Every so often, there is a character who can exceed limitations and be truly exceptional in a particular skill. With this particular quality, the character can have one skill rated at 7 at character creation, and may eventually build that skill up to rating 13. Characters may only take the Aptitude quality once.", true, 14);
	Quality p4 = new Quality("Astral Chameleon", "With the Astral Chameleon quality, the character’s astral signature blends into the background of astral space and is difficult to detect. All signatures left by the character lastonly half as long as other astral signatures. Any individuals assensing astral signatures left behind by a character with this quality receive a –2 dice pool modifier for the Assensing Test. Only characters with a Magic rating and capable of leaving astral signatures may have this quality.", true, 10);
	Quality p5 = new Quality("Bilingual", "A character with this quality reads, writes, and speaks a second language fluently. They can list a second language as a native tongue (see Language Skills, p. 150). This quality can only be acquired at character creation; selecting it gives the character a second free language skill during Step Five: Purchase Active, Knowledge, and Language Skills, (p. 88).", true, 5);
	Quality p6 = new Quality("Blandness", "This character blends into a crowd; he’s seldom noticed and easily forgotten. He is unremarkable in every aspect of physical appearance. Anyone attempting to describe the character cannot come up with anything more precise than “average height, average build, average hair, etc.” Increase the threshold for anyone to recall specific details about the character by 1. This means a Memory Test with a difficulty of Average (threshold of 2) becomes a Hard test (threshold of 3). Individuals attempting to shadow or physically locate a character with the Blandness quality in a populated setting receive a –2 dice pool modifier on all tests related to their search. The same penalty applies if they’re asking around about the person based on the individual’s physical appearance. The modifier does not, however, apply to magical or Matrix searches. If the character acquires any visible tattoos, scars, obvious cyberware, or other distinguishing features, the bonuses from the Blandness quality go away until the distinctive features are removed from the character’s appearance. In certain circumstances and specific situations, the gamemaster may determine that Blandness does not apply. For example, a troll with the Blandness quality still towers head and shoulders over a crowd of humans and so still stands out, no matter how average their horns may be. The character only regains his bonus by leaving the situation where he stands out.", true, 8);
	Quality p7 = new Quality("Catlike", "A character with the Catlike quality is gifted with an uncanny elegance, a stealthy gait, and an almost preternatural ability to move without making a sound. They also claim they land on their feet when dropped, though they tend not to let people test this. This quality adds a +2 dice pool modifier to Sneaking skill tests.", true, 7);
	Quality p8 = new Quality("Codeslinger", "Ones and zeroes are practically a native language to a Codeslinger. The character is adept at performing a particular Matrix action (which she selects when she selects this quality) and receives a +2 dice pool modifier to that Matrix action. This can only be selected for Matrix Actions (p. 237) that have a test associated with them.", true, 10);
	Quality p9 = new Quality("Double-Jointed", "A Double-Jointed character has unusually flexible joints and can bend and contort his body into extreme positions. The character receives a +2 dice pool modifier for Escape Artist tests. The character may also be able to squeeze into small, cramped spaces where less limber characters cannot. They’re also great at parties and bars.", true, 6);
	Quality p10 = new Quality("Exceptional Attribute", "The Exceptional Attribute quality is how you get to be the charismatic troll, or the agile dwarf. It allows you to possess one attribute at a level one point above the metatype maximum limit. For example, an ork character with the Exceptional Attribute quality for Strength could take his Strength attribute up to 10 before augmentations are applied, instead of the normal limit of 9. Exceptional Attribute also applies toward Special Attributes such as Magic and Resonance. Edge cannot affected by the Exceptional Attribute (Edge is raised by another quality called Lucky). A character may only take Exceptional Attribute once, and only with the gamemaster’s approval.", true, 14);
	


	///////////GET TO DESCRIPTIONS FOR FOLLOWING QUALITIES//////
	Quality p11 = new Quality("First Impression", "", true, 11);
	Quality p12 = new Quality();
	Quality p13 = new Quality();
	Quality p14 = new Quality();
	Quality p15 = new Quality();
	Quality p16 = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	Quality xxxxxxxxxxx = new Quality();
	
	
	
	
	
	/////////////////////////////////GETTER AND SETTER METHODS/////////////////////////////
	public String getName()
	{
		return name;
	}
	public void setName(String nName)
	{
		this.name = nName;
	}
	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public boolean isPositive()
	{
		return isPositive;
	}

	public void setPositive(boolean isPositive)
	{
		this.isPositive = isPositive;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public static ArrayList<Quality> getQualityList()
	{
		return qualityList;
	}

	public static void setQualityList(ArrayList<Quality> qualityList)
	{
		Quality.qualityList = qualityList;
	}
}
