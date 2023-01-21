package s24256Bank.s24256Bank;

public class TransactionInfo {
        private TransactionStatus transactionStatus;
        private double saldo;

        public TransactionInfo(double saldo,TransactionStatus transactionStatus){
                this.saldo = saldo;
                this.transactionStatus = transactionStatus;
        }

        @Override
        public String toString(){
                return "Transakcja STATUS: " + transactionStatus
                        + " AKTUALNE SALDO KONTA: " + saldo;
        }
}
