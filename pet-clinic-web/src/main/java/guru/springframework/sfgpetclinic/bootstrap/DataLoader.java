package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setPetTypeName("Dog");
        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setPetTypeName("Cat");
        PetType savedCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Aditya");
        owner1.setLastName("Pacholi");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Maichel");
        owner2.setLastName("Dada");

        ownerService.save(owner2);

        System.out.println("Loading Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Bixxy");
        vet1.setLastName("Anna");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Santhosh");
        vet2.setLastName("Anna");

        vetService.save(vet2);

        System.out.println("Loading Vets...");

    }
}
