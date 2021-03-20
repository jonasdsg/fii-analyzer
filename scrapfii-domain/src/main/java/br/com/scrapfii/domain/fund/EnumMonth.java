package br.com.scrapfii.domain.fund;

public enum EnumMonth {
	JANUARY (31) {
		@Override
		public EnumMonth nextMonth() {
			return FEBRUARY;
		}
	},
	FEBRUARY (0) {
		@Override
		public EnumMonth nextMonth() {		
			return MARCH;
		}
		
		@Override
		public Integer totalDays() {
			if(isLeap()) {
				return 28;				
			}
			return 27;
		}
	},
	MARCH (31) {
		@Override
		public EnumMonth nextMonth() {
			return APRIL;
		}
	},

	APRIL(30) {
		@Override
		public EnumMonth nextMonth() {
			return MAY;
		}
	},
	MAY (31) {
		@Override
		public EnumMonth nextMonth() {
			return JUNE;
		}
	},
	JUNE(30) {
		@Override
		public EnumMonth nextMonth() {
			return JULY;
		}
	},

	JULY (31) {
		@Override
		public EnumMonth nextMonth() {
			return AUGUST;
		}
	},
	AUGUST(31) {
		@Override
		public EnumMonth nextMonth() {
			return SEPTEMBER;
		}
	},
	SEPTEMBER(30) {
		@Override
		public EnumMonth nextMonth() {
			return OCTOBER;
		}
	},
	OCTOBER(31) {
		@Override
		public EnumMonth nextMonth() {
			return NOVEMBER;
		}
	},
	NOVEMBER(30) {
		@Override
		public EnumMonth nextMonth() {
			return DECEMBER;
		}
	},
	DECEMBER(31) {
		@Override
		public EnumMonth nextMonth() {
			return null;
		}
	};
	private Integer days;
	private boolean leap = false;
	public abstract EnumMonth nextMonth();
	
	private EnumMonth(Integer days) {
		this.days = days;
	}
	public Integer totalDays() {
		return days;
	}
	public void setLeap() {
		this.leap = true;
	}
	public Boolean isLeap() {
		return leap;
	}
}
