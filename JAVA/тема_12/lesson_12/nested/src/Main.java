public class Main {
    public static void main(String[] args) {

        Transport auto = new Transport("Автомобиль", "РУ777С");
        auto.printInfo();
        auto.id.printId();
        Transport.Id id = auto.new Id("РО000Р");
        id.printId();
        auto.printInfo();
        auto.id.printId();

    }
}


class Transport {
    private String name;
    Id id;

    Transport(String name, String id) {
        this.name = name;
        this.id = new Id(id);
    }

    public void printInfo() {
        System.out.println(name + " " + id.getIdRUS());
    }

    public class Id {
        private String idRUS;

        public Id(String idRUS) {
            this.idRUS = idRUS;
        }

        public String getIdRUS() {
            return idRUS;
        }

        public void setIdRUS(String idRUS) {
            this.idRUS = idRUS;
        }

        public void printId() {
            System.out.println(Transport.this.name + " " + idRUS);
        }
    }
}