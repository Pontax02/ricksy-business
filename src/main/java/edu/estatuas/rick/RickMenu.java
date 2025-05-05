package edu.estatuas.rick;

public class RickMenu implements GuestDispatcher{

        public int stock = 100;
        public double priceMenu = 10;

        public RickMenu(int stock, double priceMenu) {
                this.priceMenu = priceMenu;
                this.stock = stock;
        }

        @Override
        public void dispatch(PaymentMethod card) {
                if(getStock() >= 1 && card.credit() > getPriceMenu()) {
                        buyStock((short) 1);
                        card.pay(getPriceMenu());
                }
        }

        public double getPriceMenu() {
                return this.priceMenu;
        }

        public void buyStock(short quantity) {
                this.stock -= quantity;
        }


        public int getStock() {
                return this.stock;
        }
}
