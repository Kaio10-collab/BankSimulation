package com.SimulacaoBancaria.simulacaoBancaria.exception;

public class AccountNotFoundExceptionDetails {

    public String title;
    public String details;

    public AccountNotFoundExceptionDetails() {
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public static final class AccountNotFoundExceptionDetailsBuilder {

        public String title;
        public String details;

        private AccountNotFoundExceptionDetailsBuilder() { }

        public static AccountNotFoundExceptionDetailsBuilder newBuilder() {
            return new AccountNotFoundExceptionDetailsBuilder();
        }

        public AccountNotFoundExceptionDetailsBuilder title(String title){
            this.title = title;
            return this;
        }

        public AccountNotFoundExceptionDetailsBuilder details(String details){
            this.details = details;
            return this;
    }

    public AccountNotFoundExceptionDetails build() {

            AccountNotFoundExceptionDetails accountNotFoundExceptionDetails = new AccountNotFoundExceptionDetails();

            accountNotFoundExceptionDetails.title = this.title;
            accountNotFoundExceptionDetails.details = this.details;
            return accountNotFoundExceptionDetails;
        }
    }
}