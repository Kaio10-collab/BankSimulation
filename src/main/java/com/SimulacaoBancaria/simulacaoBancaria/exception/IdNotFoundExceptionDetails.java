package com.SimulacaoBancaria.simulacaoBancaria.exception;

public class IdNotFoundExceptionDetails {

    public String title;
    public String details;

    public IdNotFoundExceptionDetails() {
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public static final class IdNotFoundExceptionDetailsBuilder {

        public String title;
        public String details;

        private IdNotFoundExceptionDetailsBuilder() {
        }

        public static IdNotFoundExceptionDetailsBuilder newBuilder() {
            return new IdNotFoundExceptionDetailsBuilder();
        }

        public IdNotFoundExceptionDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public IdNotFoundExceptionDetailsBuilder details(String details) {
            this.details = details;
            return this;
        }

        public IdNotFoundExceptionDetails build () {

            IdNotFoundExceptionDetails idNotFoundExceptionDetails = new IdNotFoundExceptionDetails() ;
            idNotFoundExceptionDetails.title = this.title;
            idNotFoundExceptionDetails.details = this.details;
            return idNotFoundExceptionDetails;
        }
    }
}