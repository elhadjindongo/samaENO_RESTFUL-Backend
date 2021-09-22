package com.elhadjindongo.samaENO;

import com.elhadjindongo.samaENO.entities.*;
import com.elhadjindongo.samaENO.models.RessourceType;
import com.elhadjindongo.samaENO.models.UserRole;
import com.elhadjindongo.samaENO.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class SamaEnoApplication implements CommandLineRunner {

    @Autowired
    private EtudiantRepository etudiantRepository;
    @Autowired
    private PersonnelAdministratifRepository personnelAdministratifRepository;
    @Autowired
    private PersonnelBENORepository personnelBENORepository;
    @Autowired
    private AnnonceRepository annonceRepository;
    @Autowired
    private BenoClubRepository benoClubRepository;
    @Autowired
    private ElectionRepository electionRepository;
    @Autowired
    private SalleDeCoursRepository salleDeCoursRepository;
    @Autowired
    private PosteInformatiqueRepository posteInformatiqueRepository;
    @Autowired
    private RessourceBureautiqueRepository ressourceBureautiqueRepository;

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
        System.out.println("********************Personnel BENO******************************");
        PersonnelBENO membreBENO1 = new PersonnelBENO();
        membreBENO1.setPosteOccuppe("Presidente BENO Thies");
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
            System.out.println(pB.getRole());
        }
        System.out.println("********************Annonce******************************");
        Annonce annonce1 = new Annonce(
                null, "Retrait des Cartes Etudiant pour la P8", new String[]{"link1", "link2"}, "Lorem ipsum", new Date(), "cheminPhot", membre1
        );
        annonceRepository.save(annonce1);
        List<Annonce> annonces = annonceRepository.findAll();
        for (Annonce a : annonces) {
            System.out.println(a.getTitre());
            System.out.println(a.getAuteur().getPrenom());
            System.out.println(a.getAuteur().getNom());
        }

        System.out.println("********************BenoClub******************************");

        BenoClub club1 = new BenoClub(null, "BENO", "Bureau des Etudiants de l'ENO", "slogan1", "description1", null);
        List<PersonnelBENO> membreClub = new ArrayList<PersonnelBENO>();
        membreClub.add(membreBENO1);
        club1.setMembres(membreClub);
        benoClubRepository.save(club1);
        List<BenoClub> clubs = benoClubRepository.findAll();
        for (BenoClub c : clubs) {
            System.out.println(c.getDescription());
            for (PersonnelBENO m : c.getMembres()) {
                System.out.println(m.getNom());
            }
        }

        System.out.println("********************Election******************************");

        Election election = new Election(null, "Presidence BENO", new Date(), new Date(), null);
        electionRepository.save(election);
        System.out.println("election : " + electionRepository.findAll().get(0));

        System.out.println("******************** Salle de Cours ******************************");

        SalleDeCours salleDeCours = new SalleDeCours(null,"Salle 1A","capacite","description");
        salleDeCoursRepository.save(salleDeCours);
        System.out.println("salle de cours : " + salleDeCoursRepository.findAll().get(0));

        System.out.println("******************** Ressources Bureautique ******************************");

        RessourceBureautique ressourceBureautique = new RessourceBureautique(null,"ressourceName","photoLink", RessourceType.CABLE_HDMI,true);
        ressourceBureautiqueRepository.save(ressourceBureautique);
        System.out.println("ressource bureautique : " + ressourceBureautiqueRepository.findAll().get(0));

        System.out.println("******************** Poste Informatique ******************************");
        PosteInformatique posteInformatique = new PosteInformatique(null,"post1",true);
        posteInformatiqueRepository.save(posteInformatique);
        System.out.println("poste informatique: " + posteInformatiqueRepository.findAll().get(0));
    }
}
