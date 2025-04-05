public class Owner {
    int cpf;
    char gender;
    String type_of_propriety;

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setType_of_propriety(String type_of_propriety) {
        this.type_of_propriety = type_of_propriety;
    }

    public Owner(int cpf, char gender, String type_of_propriety) {
        this.cpf = cpf;
        this.gender = gender;
        this.type_of_propriety = type_of_propriety;
    }
}
