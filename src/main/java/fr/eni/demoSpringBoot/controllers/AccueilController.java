package fr.eni.demoSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccueilController {

	@GetMapping({"/","/accueil"}) //Route : Faire correspondre l'url à la méthode java
	public String afficherAccueil() {
		System.out.println("Dans afficherAccueil !");
		
		return "accueil"; //retourner le nom de la vue à afficher à l'utilisateur
		
	}
	
	@GetMapping({"/bonjour"}) //Route : Faire correspondre l'url à la méthode java
	public String afficherBonjour() {
		System.out.println("Dans afficherBonjour !!!");
		
		return "bonjour"; //retourner le nom de la vue à afficher à l'utilisateur
		
	}
	
	@PostMapping({"/bonjour"}) //Route : Faire correspondre l'url à la méthode java
	public String afficherBonjour2() {
		System.out.println("Dans afficherBonjour !!!");
		
		return "bonjour"; //retourner le nom de la vue à afficher à l'utilisateur
		
	}
}
