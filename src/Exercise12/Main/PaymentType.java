package Exercise12.Main;

import java.math.BigDecimal;

public enum PaymentType {
    UPFRONT_CASH_PIX(1, "Upfront with cash or 'Pix'"){
        @Override
        public BigDecimal taxCalculator(BigDecimal value){
            return value.multiply(new BigDecimal("0.85"));
        }
    },
    UPFRONT_CREDIT(2, "Upfront with credit card") {
        @Override
        public BigDecimal taxCalculator(BigDecimal value) {
            return value.multiply(new BigDecimal("0.90"));
        }
    },
    CREDIT_2X(3, "In installments, up to 2 months") {
        @Override
        public BigDecimal taxCalculator(BigDecimal value) {
            return value;
        }
    },
    CREDIT_3X_OR_MORE(4, "In installments, 3 months or more"){
        @Override
        public BigDecimal taxCalculator(BigDecimal value){
            return value.multiply(new BigDecimal("1.10"));
        }
    };

    private final int paymentCode;
    private final String messageType;

    PaymentType(int paymentCode, String messageType) {
        this.paymentCode = paymentCode;
        this.messageType = messageType;
    }

    public static PaymentType returnPaymentType(int paymentCode){
        for(PaymentType type: values()){
            if(type.paymentCode == paymentCode){
                return type;
            }
        }
        return null;
    }

    public abstract BigDecimal taxCalculator(BigDecimal value);

    public String getMessageType(){
        return messageType;
    }
}
