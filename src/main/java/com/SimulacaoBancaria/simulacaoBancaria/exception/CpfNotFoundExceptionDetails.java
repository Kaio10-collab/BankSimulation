package com.SimulacaoBancaria.simulacaoBancaria.exception;

public class CpfNotFoundExceptionDetails {

    public String title;
    public String details;

    public CpfNotFoundExceptionDetails() {
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public static final class CpfNotFoundExceptionDetailsBuilder {

        public String title;
        public String details;

        private CpfNotFoundExceptionDetailsBuilder() {
        }

        public static CpfNotFoundExceptionDetailsBuilder newBuilder() {
            return new CpfNotFoundExceptionDetailsBuilder();
        }

        public CpfNotFoundExceptionDetailsBuilder title(String title) {
            this.title = title;
            return this;
        }

        public CpfNotFoundExceptionDetailsBuilder details(String details) {
            this.details = details;
            return this;
        }

        public CpfNotFoundExceptionDetails build () {

            CpfNotFoundExceptionDetails cpfNotFoundExceptionDetails = new CpfNotFoundExceptionDetails() ;
            cpfNotFoundExceptionDetails.title = this.title;
            cpfNotFoundExceptionDetails.details = this.details;
            return cpfNotFoundExceptionDetails;
        }
    }
}