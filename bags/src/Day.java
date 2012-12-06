public enum Day {
	SUNDAY {
		public boolean isWeekday() { return false; }
	},
	MONDAY {
		public boolean isWeekday() { return true; }
	},
	TUESDAY {
		public boolean isWeekday() { return true; }
	},
	WEDNESDAY {
		public boolean isWeekday() { return true; }
	},
	THURSDAY {
		public boolean isWeekday() { return true; }
	},
	FRIDAY {
		public boolean isWeekday() { return true; }
	},
	SATURDAY {
		public boolean isWeekday() { return false; }
	};

	public abstract boolean isWeekday();
}
