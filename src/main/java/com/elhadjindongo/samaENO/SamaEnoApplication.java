package com.elhadjindongo.samaENO;

import com.elhadjindongo.samaENO.entities.Etudiant;
import com.elhadjindongo.samaENO.entities.PersonnelAdministratif;
import com.elhadjindongo.samaENO.entities.PersonnelBENO;
import com.elhadjindongo.samaENO.models.UserRole;
import com.elhadjindongo.samaENO.repository.EtudiantRepository;
import com.elhadjindongo.samaENO.repository.PersonnelAdministratifRepository;
import com.elhadjindongo.samaENO.repository.PersonnelBENORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SamaEnoApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private PersonnelAdministratifRepository personnelAdministratifRepository;
    @Autowired
    private PersonnelBENORepository personnelBENORepository;

    public static void main(String[] args) {
        SpringApplication.run(SamaEnoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********************Test Etudiants ***********************");
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setIne("NO3893320131SN");
        etudiant1.setNom("Ndongo");
        etudiant1.setPrenom("El Hadji Magatte");
        etudiant1.setEmailInstitutionnelle("elhadjimagatte.ndongo@uvs.edu.sn");
        etudiant1.setPhoto("photo1");
        etudiant1.setMotsDePasse("mots de passe");
        etudiant1.setTelephone("221775194594");
        etudiant1.setRole(UserRole.ETUDIANT);

        etudiantRepository.save(etudiant1);

        List<Etudiant> etudiantList = etudiantRepository.findAll();
        for (Etudiant e : etudiantList) {
            System.out.println(e);
        }
        System.out.println("********************Personnel Administratif");
        PersonnelAdministratif membre1 = new PersonnelAdministratif();
        membre1.setPosteOccuppe("Administrateur ENO Thies");
        membre1.setNom("Fall");
        membre1.setPrenom("Modou");
        membre1.setEmailInstitutionnelle("modou.fall@uvs.edu.sn");
        membre1.setPhoto("photo1");
        membre1.setMotsDePasse("mots de passe");
        membre1.setTelephone("22177xxxxxx");
        membre1.setRole(UserRole.PERSONNEL_ADMINISTRATIF);
        personnelAdministratifRepository.save(membre1);

        List<PersonnelAdministratif> personelAdminList = personnelAdministratifRepository.findAll();
        for (PersonnelAdministratif p : personelAdminList) {
            System.out.println(p.getNom());
            System.out.println(p.getPrenom());
            System.out.println(p.getPosteOccuppe());
        }
        System.out.println("********************Personnel BENO");
        PersonnelBENO membreBENO1 = new PersonnelBENO();
        membreBENO1.setPosteOccuppe("Presidente BENO Thies");
        membreBENO1.setIntituleClub("Bureau des Etudiant");
        membreBENO1.setNom("Ndiaye");
        membreBENO1.setPrenom("Fatou");
        membreBENO1.setEmailInstitutionnelle("fatou.ndiaye@uvs.edu.sn");
        membreBENO1.setPhoto("photo4");
        membreBENO1.setMotsDePasse("mots de passe");
        membreBENO1.setTelephone("221779876");
        membreBENO1.setRole(UserRole.PERSONNEL_BENO);
        personnelBENORepository.save(membreBENO1);

        List<PersonnelBENO> personelBENO = personnelBENORepository.findAll();
        for (PersonnelBENO pB : personelBENO) {
            System.out.println(pB.getNom());
            System.out.println(pB.getPrenom());
            System.out.println(pB.getPosteOccuppe());
            System.out.println(pB.getIntituleClub());
            System.out.println(pB.getRole());
        }
    }
}
