package enumerations;

public enum OrderStatus {
	ordered,
	cancelled,
	pending,
	refused,
	delivered;
	
	
	public static OrderStatus fromInt(int a) {
		switch (a) {
		case 1:
			return ordered;
		case 2:
			return cancelled;
		case 3:
			return pending;
		case 4:
			return refused;
		case 5:
			return delivered;
		default:
			return cancelled;
		}
	}

	public static int toInt(OrderStatus os) {
		switch (os) {
		case ordered:
			return 1;
		case cancelled:
			return 2;
		case pending:
			return 3;
		case refused:
			return 4;
		case delivered:
			return 5;
		default:
			return 2;
		}
	}
}