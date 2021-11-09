package guru.springframework.sfgpetclinic.model;

public class PetType extends BaseEntity{

    private String PetTypeName;

    public String getPetTypeName() {
        return PetTypeName;
    }

    public void setPetTypeName(String petTypeName) {
        PetTypeName = petTypeName;
    }
}
