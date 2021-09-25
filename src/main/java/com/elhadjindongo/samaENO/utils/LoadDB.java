/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 9/22/2021 ************************************/
/****** Project: samaENO *********************/
/****************************************************/

package com.elhadjindongo.samaENO.utils;

import com.elhadjindongo.samaENO.entities.*;
import com.elhadjindongo.samaENO.models.RessourceType;
import com.elhadjindongo.samaENO.models.UserRole;
import com.elhadjindongo.samaENO.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class LoadDB {

    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);
    private PersonnelAdministratif personnelAdministratif1;
    private PersonnelBENO membreBENO1;

    @Bean
    CommandLineRunner initSalleDeCoursData(SalleDeCoursRepository salleDeCoursRepository) {

        return args -> {
            log.info("Preloading Salle de cours " + salleDeCoursRepository.save(
                    new SalleDeCours(null, "Salle 1A", "150 places", "La salle peut acceuillir 350 places.Elle dispose d'une ecran de projection.Elle dispose de 25 prises electrique.Elle est elairee")
            ));
            log.info("Preloading Salle de cours " + salleDeCoursRepository.save(
                    new SalleDeCours(null, "Salle 1A", "150 places", "La salle peut acceuillir 150 places.Elle dispose d'une climatisseur.Elle dispose de 10 prises electrique.")
            ));
            log.info("Preloading Salle de cours " + salleDeCoursRepository.save(
                    new SalleDeCours(null, "Salle 1A", "150 places", "La salle peut acceuillir 200 places.Elle dispose d'une ecran de projection et d'un tableaux.")
            ));
        };
    }

    @Bean
    CommandLineRunner initRessourceBureautiqueData(RessourceBureautiqueRepository ressourceBureautiqueRepository) {

        return args -> {
            log.info("Preloading RessourcesBureautique " + ressourceBureautiqueRepository.save(
                    new RessourceBureautique(null, "CableHDMi_23B", "img/CableHDMi_23B.jpg", RessourceType.CABLE_HDMI, true)
            ));
            log.info("Preloading RessourcesBureautique " + ressourceBureautiqueRepository.save(
                    new RessourceBureautique(null, "CableRJ45_89Q", "img/CableRJ45_89Q.jpg", RessourceType.CABLE_Rj45, true)
            ));
            log.info("Preloading RessourcesBureautique " + ressourceBureautiqueRepository.save(
                    new RessourceBureautique(null, "CableVGA_67K", "img/CableVGA_67K,jpg", RessourceType.CABLE_VGA, true)
            ));
        };
    }

    @Bean
    CommandLineRunner initPosteInformatiqueData(PosteInformatiqueRepository posteInformatiqueRepository) {

        return args -> {
            log.info("Preloading PosteInformatique " + posteInformatiqueRepository.save(
                    new PosteInformatique(null, "poste 1", true)
            ));
            log.info("Preloading PosteInformatique " + posteInformatiqueRepository.save(
                    new PosteInformatique(null, "poste 2", false)
            ));
            log.info("Preloading PosteInformatique " + posteInformatiqueRepository.save(
                    new PosteInformatique(null, "poste 3", true)
            ));
        };
    }

    @Bean
    CommandLineRunner initPersonnelBENOData(PersonnelBENORepository personnelBENORepository) {
        this.membreBENO1 = new PersonnelBENO();
        membreBENO1.setPosteOccuppe("Presidente BENO Thies");
        membreBENO1.setNom("Ndiaye");
        membreBENO1.setPrenom("Fatou");
        membreBENO1.setEmailInstitutionnelle("fatou.ndiaye@uvs.edu.sn");
        membreBENO1.setPhoto("img/photo.jpg");
        membreBENO1.setMotsDePasse("mots de passe fatou ndiaye");
        membreBENO1.setTelephone("221770987654");
        membreBENO1.setRole(UserRole.PERSONNEL_BENO);
        PersonnelBENO membreBENO2 = new PersonnelBENO();
        membreBENO2.setPosteOccuppe("Vice Presidente BENO Thies");
        membreBENO2.setNom("Sarr");
        membreBENO2.setPrenom("Demba");
        membreBENO2.setEmailInstitutionnelle("demba.sarr@uvs.edu.sn");
        membreBENO2.setPhoto("img/photo.jpg");
        membreBENO2.setMotsDePasse("mots de pass demba sarr");
        membreBENO2.setTelephone("221779876543");
        membreBENO2.setRole(UserRole.PERSONNEL_BENO);
        PersonnelBENO membreBENO3 = new PersonnelBENO();
        membreBENO3.setPosteOccuppe("Tresorier BENO Thies");
        membreBENO3.setNom("Fall");
        membreBENO3.setPrenom("Ousmane");
        membreBENO3.setEmailInstitutionnelle("ousmane.fall@uvs.edu.sn");
        membreBENO3.setPhoto("img/photo.jpg");
        membreBENO3.setMotsDePasse("mots de passe ousmane fall");
        membreBENO3.setTelephone("221771234567");
        membreBENO3.setRole(UserRole.PERSONNEL_BENO);
        return args -> {
            log.info("Preloading PersonnelBENO " + personnelBENORepository.save(
                    membreBENO1
            ));
            log.info("Preloading PersonnelBENO " + personnelBENORepository.save(
                    membreBENO2
            ));
            log.info("Preloading PersonnelBENO " + personnelBENORepository.save(
                    membreBENO3
            ));
        };
    }

    @Bean
    CommandLineRunner initPersonnelAdministratifData(PersonnelAdministratifRepository personnelAdministratifRepository) {
        this.personnelAdministratif1 = new PersonnelAdministratif();
        personnelAdministratif1.setPosteOccuppe("Administrateur ENO Thies");
        personnelAdministratif1.setNom("Fall");
        personnelAdministratif1.setPrenom("Modou");
        personnelAdministratif1.setEmailInstitutionnelle("modou.fall@uvs.edu.sn");
        personnelAdministratif1.setPhoto("img/photoModouFall.jpg");
        personnelAdministratif1.setMotsDePasse("mots de passe modou fall");
        personnelAdministratif1.setTelephone("221779806543");
        personnelAdministratif1.setRole(UserRole.PERSONNEL_ADMINISTRATIF);
        PersonnelAdministratif personnelAdministratif2 = new PersonnelAdministratif();
        personnelAdministratif2.setPosteOccuppe("Assistant Administratif ENO Thies");
        personnelAdministratif2.setNom("Diop");
        personnelAdministratif2.setPrenom("Ablaye");
        personnelAdministratif2.setEmailInstitutionnelle("ablay.diop@uvs.edu.sn");
        personnelAdministratif2.setPhoto("img/photoAblayeDiop.jpg");
        personnelAdministratif2.setMotsDePasse("mots de passe ablaye diop");
        personnelAdministratif2.setTelephone("221778909809");
        personnelAdministratif2.setRole(UserRole.PERSONNEL_ADMINISTRATIF);
        PersonnelAdministratif personnelAdministratif3 = new PersonnelAdministratif();
        personnelAdministratif3.setPosteOccuppe("Responsable Pedagogique ENO Thies");
        personnelAdministratif3.setNom("Kone");
        personnelAdministratif3.setPrenom("Fama");
        personnelAdministratif3.setEmailInstitutionnelle("Fama.kone@uvs.edu.sn");
        personnelAdministratif3.setPhoto("img/photo.jpg");
        personnelAdministratif3.setMotsDePasse("mots de passe Fama Kone");
        personnelAdministratif3.setTelephone("221776578798");
        personnelAdministratif3.setRole(UserRole.PERSONNEL_ADMINISTRATIF);
        return args -> {
            log.info("Preloading PersonnelAdministratif " + personnelAdministratifRepository.save(
                    personnelAdministratif1
            ));
            log.info("Preloading PersonnelAdministratif " + personnelAdministratifRepository.save(
                    personnelAdministratif2
            ));
            log.info("Preloading PersonnelAdministratif " + personnelAdministratifRepository.save(
                    personnelAdministratif3
            ));
        };
    }

    @Bean
    CommandLineRunner initEtudiantData(EtudiantRepository etudiantRepository) {
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setIne("N0389209298");
        etudiant1.setNom("Ndiaye");
        etudiant1.setPrenom("Marieme");
        etudiant1.setEmailInstitutionnelle("marieme.ndiaye@uvs.edu.sn");
        etudiant1.setPhoto("img/photoMariemeNdiaye.jpg");
        etudiant1.setMotsDePasse("mots de passe MariemeNdiaye");
        etudiant1.setTelephone("221779089900");
        etudiant1.setRole(UserRole.ETUDIANT);
        Etudiant etudiant2 = new Etudiant();
        etudiant2.setIne("N0890980098");
        etudiant2.setNom("Kebe");
        etudiant2.setPrenom("Ousseynou");
        etudiant2.setEmailInstitutionnelle("ousseynou.kebe@uvs.edu.sn");
        etudiant2.setPhoto("img/ousseynou.jpg");
        etudiant2.setMotsDePasse("mots de passe Ousseynou");
        etudiant2.setTelephone("221771232211");
        etudiant2.setRole(UserRole.ETUDIANT);
        Etudiant etudiant3 = new Etudiant();
        etudiant3.setIne("N089072018");
        etudiant3.setNom("Seck");
        etudiant3.setPrenom("Awa");
        etudiant3.setEmailInstitutionnelle("awa.seck@uvs.edu.sn");
        etudiant3.setPhoto("img/photoAwa.jpg");
        etudiant3.setMotsDePasse("mots de passe Awa");
        etudiant3.setTelephone("221777778899");
        etudiant3.setRole(UserRole.ETUDIANT);
        return args -> {
            log.info("Preloading Etudiant" + etudiantRepository.save(
                    etudiant1
            ));
            log.info("Preloading Etudiant " + etudiantRepository.save(
                    etudiant2
            ));
            log.info("Preloading Etudiant " + etudiantRepository.save(
                    etudiant3
            ));
        };
    }

    @Bean
    CommandLineRunner initElectionData(ElectionRepository electionRepository) {

        return args -> {
            log.info("Preloading Election " + electionRepository.save(new Election(null, "election Precidence BENO 2021", new Date(), new Date(), null)));
            log.info("Preloading Election " + electionRepository.save(new Election(null, "election Bureau Club Information 2021", new Date(), new Date(), null)));
            log.info("Preloading Election " + electionRepository.save(new Election(null, "election Representant Equipe Debatons ENO-TH", new Date(), new Date(), null)));
        };
    }

    @Bean
    CommandLineRunner initBenoClubData(BenoClubRepository benoClubRepository) {

        return args -> {
            log.info("Preloading BENOClub " + benoClubRepository.save(new BenoClub(null, "BENO", "Bureau des Etudiants de l'ENO", "slogan BENO", "Description BENO", null)));
            log.info("Preloading BENOClub " + benoClubRepository.save(new BenoClub(null, "IPT", "Informatique Pour Tous", "slogan IPT", "Description IPT", null)));
            log.info("Preloading BENOClub " + benoClubRepository.save(new BenoClub(null, "EL", "English Lovers", "slogan English Lovers", "Description English Lovers", null)));
        };
    }

    @Bean
    CommandLineRunner initAnnonceData(AnnonceRepository annonceRepository) {

        return args -> {
            log.info("Preloading Annonce " + annonceRepository.save(new Annonce(
                    null, "Lancement des Activites sociopedagique", new String[]{"link1", "link2"}, "Lorem ipsum communique1", new Date(), "communique1.pdf", this.personnelAdministratif1
            )));
            log.info("Preloading Annonce " + annonceRepository.save(new Annonce(
                    null, "Demarrage des Examens des Etudiants pour la P8", new String[]{"link1", "link2"}, "Lorem ipsum communique2", new Date(), "communique2.pdf", this.personnelAdministratif1
            )));
            log.info("Preloading Annonce " + annonceRepository.save(new Annonce(
                    null, "Retrait des Cartes Etudiant pour la P8", new String[]{"link1", "link2"}, "Lorem ipsum communique3", new Date(), "communique3.pdf", this.membreBENO1
            )));
        };
    }
}
