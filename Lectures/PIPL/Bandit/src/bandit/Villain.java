package bandit;

/*
 * ��������� �� ��������� ��� ���� � �� ���� ����� ������������ ��������. 
 * ��-����� ����� ������������� �������� � ��������� ���� �������, ������ ��������� ��� � ������� ������� �� ������� ��. 
 * �� ���������� ������, ����� ��� �� �� � ��� ������ ��� ����� ��� � ���. 
 * �������� ��������� ������ � ���������� � ����� �������, �� ������ �� ��������� ������ �� �� ���� ���� ����� ����, 
 * � �� �� �����. 
 * ������ 3. �������� ���� �Villain�, ����� �������� ���������� � ������� ��������. ������� �� ���������� �Skrmish� 
 * �� ���� �������� �� �����, ���� ���������� �� ��������� �� ����� ����� �������, ����� �� �� ��������. 
 * ��, �� ���� ������, ������ �� ������� �������� �� �Shoot�, ����� �������� �� ������� �����:
 * �	��� ������� ���� �������, �� ������ ����� 0;
 * �	��� ������� ��� �������, �� ������ ����� ���������� ����� �� 0 �� 100.
 * ������������ ������� �� ������� ����� � ������� ������� ������� � �� ��������� �������, ����� �� ���������� ��������. 
 * ��-�������� ����� ������. ��� �� �� ���� ������ � ��-������ �� 70, �� ���������� � ����, ������������ �� ���������� 
 * � �� ������ �� ������� ����� �� ����������. ��� �� � ��-������ �� 70, �� ������������ ����������, ������ �� �� 
 * ������� ��������� � �� ������� ����������. ��� ��������� ������� � ���� ����, �� �� ������ �� �������, 
 * �� ���� ���������.
 */

@SuppressWarnings("unused")
public class Villain extends Villager {
	private int cartridges;
	private String shortName;
	private double price;

	public Villain() {
		super();
		// TODO Auto-generated constructor stub
		setNouse(NouseKind.Broken);
		cartridges = 0;
		shortName = "";
		price = 0;
	}

	public Villain(int legs, int hands, int eyes, String name,
			String hourse, String whiskey, int cartridges, String shortName,
			double price) {
		super(legs, hands, eyes, name, hourse, whiskey);
		setNouse(NouseKind.Broken);
		// TODO Auto-generated constructor stub
		this.cartridges = cartridges;
		this.shortName = shortName;
		this.price = price;
	}

	public int shoot() {
		if (cartridges > 0) {
			return (int) (Math.random() * 100);
		} else
			return 0;
	}

	public static void Skirmish(Villain a, Villain b) {
		int ca = a.shoot();
		int cb = b.shoot();
		
		System.out.println("First shoot: "+ca);
		System.out.println("Second shoot: "+cb);

		if (ca > cb) {
			if (ca > 70) {
				System.out.println("Finished. " + a.shortName
						+ " is the winner.");
				return;
			}
		} else {
			if (cb > 70) {
				System.out.println("Finished. " + b.shortName
						+ " is the winner.");
				return;
			}
		}
		a.cartridges = (a.cartridges - ca < 0) ? 0 : (a.cartridges - ca);
		b.cartridges = (b.cartridges - cb < 0) ? 0 : (b.cartridges - cb);

		System.out.println("First cartridge: "+a.cartridges);
		System.out.println("Second cartridge: "+b.cartridges+'\n');

		
		if (a.cartridges == 0 && b.cartridges == 0) {
			System.out.println("Finished. No winner!");
			return;
		}

		Skirmish(a, b);
	}
}
