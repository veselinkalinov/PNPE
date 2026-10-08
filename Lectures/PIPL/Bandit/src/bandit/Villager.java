package bandit;
/*
 * ������ ���� � ��������� ���������� ���� ��� �����, ��� ����, ��� ��� � ����� ���. 
 * �� �� ���� ���, ��� ��� ��������� ��� � �������� ���� �� ����� �����. 
 * ��� ����� ������ ������ �� ����� ��, �� ��� �� �� �� ����. 
 * ���� ���� ��������� �� ������� ������ ����� ������ �� �����. 
 * �������� ����� ������ ������ � ���������� � ����� � �������� � �� ������� ���������. 
 * ����  � �������� ����� �� ������ ������� ��� ���, ��� ��� �� ������ ��� ������ ���.
 * ������ 2. ����������� �������� ��-���� ���� �Villager�.
 */
enum NouseKind {Broken,Healthy} ; 

@SuppressWarnings("unused")
public class Villager {
	private int legs;
	private int hands;
	private int eyes;
	private NouseKind nouse;
	private String name;
	private String hourse;
	private String whiskey;

	public Villager() {
		super();
		// TODO Auto-generated constructor stub
		legs = 2;
		hands = 2;
		eyes = 2;
		nouse = NouseKind.Healthy;
		name = "";
		hourse = "";
		whiskey = "";
	}

	public Villager(int legs, int hands, int eyes, 
			String name, String hourse, String whiskey) {
		super();
		this.legs = legs;
		this.hands = hands;
		this.eyes = eyes;
		this.nouse = NouseKind.Healthy;
		this.name = name;
		this.hourse = hourse;
		this.whiskey = whiskey;
	}

	public String getName() {
		return name;
	}

	public String getWhiskey() {
		return whiskey;
	}

	public int getLegs() {
		return legs;
	}

	public int getHands() {
		return hands;
	}

	public int getEyes() {
		return eyes;
	}

	public String getHourse() {
		return hourse;
	}

	public void setNouse(NouseKind nouse) {
		this.nouse = nouse;
	}
}
