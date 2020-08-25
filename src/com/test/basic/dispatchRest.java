package com.test.basic;

public class dispatchRest {
	 static class Father {
		public int money = 1;

		public Father() {
			money = 2;
			showMeTheMoney();
		}

		public void showMeTheMoney() {
			System.out.println("I am Father, i have $" + money);
		}
		
		public int getMoney() {
			return money;
		}

		static class Son extends Father {
			public int money = 3;

			public Son() {
				money = 4;
				showMeTheMoney();
			}

			public void showMeTheMoney() {
				System.out.println("I am Son, i have $" + money);
			}
			
			public int getMoney() {
				return money;
			}
		}

		public static void main(String[] args) {
			Father gay = new Son();
			System.out.println("This gay has $" + gay.money);
			System.out.println("This gay has $" + gay.getMoney());
		}
	}
}
