package paketti;
import java.util.Random;
import java.util.Scanner;

public class Peli {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        //pelaajan parametrit
	        int health = 100;
	        int damage = 0;	        
	        int healthpotionAmount = 0;		           
	        int money = 0;
			//tarinan intro
	        System.out.println("Welcome to the world of Estiriel, a world steeped in history, culture, trade and war.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();		
			System.out.println("Once a world of peace and prosperity, Estiriel is now a land of fear and suffering.");
			System.out.println("Estiriel consists of one large super continent called Zeataes, which is surrounded by numerous small islands and a large ocean.");
			System.out.println("For centuries, The nations of Estiriel coexisted in relative harmony bound together by treaties, alliances and mutual trade.");
			System.out.println("Life in Estiriel was characterized by agriculture, commerce, and culture, with festivals celebrating the changing seasons and bountiful harvests.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine(); //teksti jatkuu kun käyttäjä paina enteriä
			System.out.println("However, the peace was shattered when a coup took place in The Empire of Trinem.");
			System.out.println("The Empire of Trinem was known for its endless mountain scapes and prosperous mining industry.");
			System.out.println("However the citizens of The Empire were poor and the current caste in rule spent the money in the treasury for their own material gain and to strenghten their own rule. ");
			System.out.println("The rising unrest gave an ample opportunity for a coup and Emperor Balbus was removed from the throne and Emperor Glycias rose to power with support from the military.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("The new emperor promised a new age of wealth and prosperity and gained the support of the people.");
			System.out.println("He also blamed the last emperor and the international cartel that supposedly controlled him for the empires bad situation.");
			System.out.println("He promised to bring the empire back to its former glory and vowed revenge on the supposed international cartel.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("The emperor set his sights to the lands south of the empire.");
			System.out.println("The Ivory Federation was a land known for its lush agriculture and best universities in Estiriel.");
			System.out.println("The new emperor was also interested in The Kingdom of Wepia, which was known for its fishing industry and beatiful nature. ");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("The emperor launched a simultaneous surprise attack against both nations and achieved rapid success.");
			System.out.println("The democratic process of Ivory Federation did not react quickly enough to the rising threat of The Trinem Empire and was gravely underprepared.");
			System.out.println("Trinemian heavy cavalry quickly outflanked the few defensive positions that Ivory Federations army had set up and quickly continued their march toward the capital.  ");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("Trinemian army layed siege to the Ivory Federations capital of Maplebay and after a few days of bombardment with cannons and mortars, Ivory Federations government succumbed and Ivory Federation was annexed. ");
			System.out.println("Kingdom of Wepia was not so easy target.");
			System.out.println("Wepian spies had uncovered Trinemian plans 2 weeks before the attack and The king had ordered Wepian army in defensive positions.");
			System.out.println("Inityally Trinemians gained some succes and captured small town and villages along the border, but Wepians were able to stop them 20 miles from the border.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("After 3 weeks of intense fighting, Trinemians broke through in the middle of Wepian defenses in daysby plains and surrounded Wepian forces that were hunkered down in dense forests.");
			System.out.println("Wepian forces were in complete disarray and those that didn't get destroyed or captured fleed the defend the capital city Crine");
			System.out.println("Alas, the military might of Temeria was too strong for Wepians to handle and they too fell.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("This triggered a chain reaction of other nations declaring a tarde embargo egainst Temeria.");
			System.out.println("Emperor Glycias gave a speech to his people infront of his palace and stated that other nations are out to destroy the mighty empire and he shall give a swift response to these hostile acts.");
			System.out.println("Thus began the Eternal War, a conflict that would last 20 years, claiming countless lives and laying waste to once thriving lands.");
			System.out.println("The nations of Estiriel found themselves united in a desperate struggle against the enroaching darkness, forming alliances of necessity in the face of a common foe.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("But despite their valor and resilience, the forces of the alliance were outmatched by the overwhelming military force of the empire.");
			System.out.println("All neighbouring countries of the empire were either outright occupied or vassalized. Thankfully the empire did not manage to get into the economic hearth lands of Estiriel");
			System.out.println("And so, as the sun sets on the shattered remnants of Estiriel, a new chapter begins.");
			System.out.println("Press ENTER to continue");
			scanner.nextLine();
			System.out.println("It is a chapter of resistance, defiance, and hope in the face of oppression.");
			System.out.println("And amidst the chaos and turmoil, one soul rises from the ashes, determined to carve a path to freedom amidst the shadows of tyranny. ");
			System.out.println("That soul, dear adventurer, is yours.");
			System.out.println("Press ENTER to continue");
	        scanner.nextLine();	        
	        System.out.println("You were a farmer in Kingdom of Drastealon when the Eternal war broke out. ");
	        System.out.println("Kingdom of Drastealon was annexed and you and your farm was considered as a government asset and Trinemian national guard took you to imperial prison to await trial for conspiracy against the emperor.");
	        System.out.println("You spent your days counting bricks and preparing for a death sentence.");
	        System.out.println("Then you heard a loud bang and smoke and rubble filled your prison cell.");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("As you regained your senses you realized that a cannon ball had blasted through your cell and destroyed the cell door.");
	        System.out.println("You slowly peeked outside and realised that all the guards were rushing outside.");
	        System.out.println("This is your chance to escape.");
	        System.out.println("As you made your way outside you picked up a sword from a fallen imperial soldier.");
	        System.out.println("You have picked up imperial iron sword (" +  Weapons.ImperialIronSword() + " damage)" );
	        damage = Weapons.ImperialIronSword();
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("As you make your way to the courtyard you see utter chaos. The walls have been breached and cannon fire blasts against the outlook towers.");
	        System.out.println("You see a partially collapsed section of the wall away from the fighting and make a dash towards it.");
	        System.out.println("An injured imperial soldier who was leaning against the wall stands up and says:");
	        System.out.println("\"You aren't going anywhere prisoner! Get back into your cell!\"");
	        System.out.println("You hold on to your sword and prepare for a fight");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("You are now fighting injured imperial soldier (" +Enemies.InjuredImperialSoldierDamage() + " damage and " +Enemies.InjuredImperialSoldierHealth() + " health)");
	        System.out.println("You deal " +damage+ " damage and have " +health+ " health left out of 100");
	        System.out.println("Press 1 to attack or 2 to use a health potion");
	        int enemyHp1= Enemies.InjuredImperialSoldierHealth();
	        //taistelu looppi
	        while(true) {
	            int battle1 = 0;	            	            	           	            
	            try {
	                
	            	battle1 = scanner.nextInt();
	                scanner.nextLine(); 
	            } catch (Exception e) {
	                scanner.nextLine(); 
	                System.out.println("Invalid input.");	                
	            }
	            //pelaajan hyökkäys
	            if (battle1 == 1 && health > 0 && enemyHp1 > 0) {
	                health = health - Enemies.InjuredImperialSoldierDamage();
	                enemyHp1 = enemyHp1 - damage;             
	                System.out.println("You have  "  + health + " health left. The enemy dealt " + Enemies.InjuredImperialSoldierDamage() + " damage");
	                System.out.println("The enemy has " + enemyHp1 + " health left. You dealt " + damage + " damage");
	                System.out.println("Press 1 to attack and 2 to drink health potion");                  	                	                
	            } else if (enemyHp1 <= 0) {
	                System.out.println("You won");
	            break;
	            } else if (health <= 0) { 
	                System.out.println("Game over");
	            	
	               //terveysjuoman käyttö 
	            } else if (battle1 == 2 && health < 100 && healthpotionAmount > 0) {	                
	                health = Math.min(100, health + 20);
	            	healthpotionAmount = healthpotionAmount - 1;
	            	System.out.println("You used a health potion");
	            	System.out.println("You now have " + health + " out of 100 health left");
	            	System.out.println("You have " + healthpotionAmount + " health potions left");
	            } else if (battle1 == 2 && health >=100 || healthpotionAmount <=0) {
	            System.out.println("You already have full health or don't have health potions left");
	            
	            } else {
	                System.out.println("Invalid input");	            
	            }
	        } //tarina jatkuu
	  System.out.println("Press ENTER to continue");
	  scanner.nextLine();
	  System.out.println("You defeat the guard and now have an unobstructed path towards freedom.");
	  System.out.println("Tired and out of breath you find a small road with a sign that says\"Blencathra\"");
	  System.out.println("It is a small imperial town about 10 miles from the occupied zone.");
	  System.out.println("You still have your own clothes because imperial prisons are overfilled and are low on all kinds of supplies.");
	  System.out.println("You decide to continue to Blencanthra.");
	  System.out.println("Press ENTER to continue");
	  scanner.nextLine();	 
	  System.out.println("As the sun begins to set you arrive at the outskirts of the town");
	  System.out.println("People are starting to wander towards what seems to be a local tavern. You are desperate for food and rest so you decide to follow them.");
	  System.out.println("As you enter inside you see people dancing like no tomorrow, bard playing songs and delicious food.");
	  System.out.println("As you look around a man behind the counter yells at you:");
	  System.out.println("Press ENTER to continue");
	  scanner.nextLine();
	  System.out.println("\"Oi lad, you new here?\"");
	  System.out.println("You approach the man.");
	  System.out.println("\"I have plenty of wares for an adventurer like you. Have a look.\"");
	  //keskustelu kauppiaan kanssa
	  while (true) {
		  System.out.println("Press 1 = What is this place? Press 2 = Who are you? Press = 3 Just show me your wares.");
		  int tavern = 0; //alustetaan valinta
		  try {          //virheiden käsittely virheellisen syötteen varalle.
	        	tavern = scanner.nextInt();
	            scanner.nextLine(); // jos tätä ei ole niin invalid input tulostuu ikuisesti
	        } catch (Exception e) {
	            scanner.nextLine(); 
	            System.out.println("Invalid input.");	                
	        }
	  if (tavern == 1) {
		System.out.println("\"Well lad, this is the Nice Falcons, best tavern in Esteriel\"");
	continue;
	  }
	  else if (tavern == 2) {
		  System.out.println("\"My name is Serder Bustim, the owner of this humble establishment, at your service sir.\"");
	 continue;
	  }
	  else if	 (tavern == 3)   {
		  System.out.println("\"Please have a look.\"");
		  break;
	  }
	  else {
		  System.out.println("Invalid input");	  
	  }
	  }
	 //kauppa looppi     	        	        			
    int ornateSwordPrice = 2;
    int healthPotionPrice = 1;
    System.out.println("Purchase health potion press 1 (costs " + healthPotionPrice + " coin), press 2 to purchase ornate sword " +Weapons.ImperialOrnateSword() + "  (costs " + ornateSwordPrice + " coins), or to continue your journey press 3");
    while (true) {
        
     int shop=0;
        try {
        	shop = scanner.nextInt();
            scanner.nextLine(); 
        } catch (Exception e) {
            scanner.nextLine(); 
            System.out.println("Invalid input.");	                
        }
            
            if (shop == 1 && money >= healthPotionPrice) {
                healthpotionAmount= healthpotionAmount + 1;
                money = money - healthPotionPrice;
                System.out.println("You now have " + healthpotionAmount + " health potions");
                System.out.println("You now have " + money + " coins");
                
                
            } else if (shop == 2 && money >= ornateSwordPrice) {
                damage = Weapons.ImperialOrnateSword();
                System.out.println("You have equipped imperial ornate sword");
                money = money - ornateSwordPrice;
                System.out.println("You now have " + money + " coins");
                
            } else if (shop == 3) {
                System.out.println("You continue your journey.");
                break;
            } else {
                System.out.println("Invalid input or not enough coins.");
            }
    }
            
             //tarina jatkuu
            System.out.println("As you think of what to do next, a shady character pulls you aside.");
            System.out.println("\"Follow me. \" she says");
            System.out.println("She takes you to a room in the back and says:");
            System.out.println("\"Look, im not stupid. I know you escaped the prison during the resent attack\"");
            System.out.println("Press ENTER to continue");
            scanner.nextLine();
            System.out.println("\"Not everyone here supports our current expansionist policies\"");
            System.out.println("\"Im with the local resistance\"");
            System.out.println("\"We attacked the prison today and we aim to overthrow the emperor\"");
            System.out.println("\"I can get you out of imperial territory so you dont have to witness this chaos\"");
            System.out.println("Press ENTER to continue");
            scanner.nextLine();
            System.out.println("My wagon driver is waiting on the outskirts of this village. I will give you 5 coins for the journey.");
            money = money + 5;
            System.out.println("You now have " + money + " coins");
            System.out.println("\"Do you want to head out or buy something from Serder and stock up?\"");
            System.out.println("Press 1 to head out 2 to buy something");
            
            while(true) { //valitaan jatketaanko tarinaa vai ostetaanko jotain
            int choice=0;
            try {
            	choice = scanner.nextInt();
                scanner.nextLine(); 
            } catch (Exception e) {
                scanner.nextLine(); 
                System.out.println("Invalid input.");	                
            }
            if (choice == 1) { //jatketaan tarinaa
            	System.out.println("You decide to head out");
            break;
            }
            else if (choice == 2) { //kauppa looppi
            	System.out.println("You decide to go shopping");
            	 int ornateSwordPrice2 = 2;
            	    int healthPotionPrice2 = 1;
            	    System.out.println("Purchase health potion press 1 (costs " + healthPotionPrice2 + " coin), press 2 to purchase ornate sword (" +Weapons.ImperialOrnateSword() + " damage and costs " + ornateSwordPrice2 + " coins), or to continue your journey press 3");
            	    while (true) {
            	        
            	     int shop=0;
            	        try {
            	        	shop = scanner.nextInt();
            	            scanner.nextLine(); 
            	        } catch (Exception e) {
            	            scanner.nextLine(); 
            	            System.out.println("Invalid input.");	                
            	        }
            	            
            	            if (shop == 1 && money >= healthPotionPrice) {
            	                healthpotionAmount= healthpotionAmount + 1;
            	                money = money - healthPotionPrice;
            	                System.out.println("You now have " + healthpotionAmount + " health potions");
            	                System.out.println("You now have " + money + " coins");
            	                
            	                
            	            } else if (shop == 2 && money >= ornateSwordPrice) {
            	                damage = Weapons.ImperialOrnateSword();
            	                System.out.println("You have equipped imperial ornate sword");
            	                money = money - ornateSwordPrice;
            	                System.out.println("You now have " + money + " coins");
            	                
            	            } else if (shop == 3) {
            	                System.out.println("You continue your journey.");
            	                break;
            	            } else {
            	                System.out.println("Invalid input or not enough coins.");
            	            }
            	            
            	    }
            	    
    break;
            
            }
	  }     //tarina jatkuu
            System.out.println("The woman takes you to the carriage.");
            System.out.println("\"My driver will take you outside core imperial territory to the occupied zone.\"she says.");
            System.out.println("\"You should try to get to the Free City of Adamouth, I heard they help refugees there\"she continues.");
            System.out.println("Press ENTER to continue");
            scanner.nextLine();
            System.out.println("You board the carriage and continue towards freedom.");
            System.out.println("\"Psst. We are now at a small checkpoint on a road towards the occupied zone\" says the driver");
            System.out.println("\"Papers please!\"says the guard");
            System.out.println("Press ENTER to continue");
            scanner.nextLine();
            System.out.println("You start to panick. You dont have any identification papers.");
            System.out.println("\"What's the matter with you? Papers i said!\"shouts the guard, pointing at you");
            System.out.println("\"I think i lost them...\"you reply");
            System.out.println("\"Sorry buddy, but that is a criminal offence. We will have to lock you up\"says the guard.");
            System.out.println("You jump out of the wagon and draw your sword.");
            System.out.println("Press ENTER to continue");
            scanner.nextLine();
            System.out.println("You are now fighting guard (" +Enemies.GuardHealth()+ " health and " +Enemies.GuardDamage()+ " damage)");
            System.out.println("You are also fighting guard officer (" +Enemies.GuardOfficerHealth()+ " health and " +Enemies.GuardOfficerDamage()+ " damage");
            System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion");           
            int enemyHp2 = Enemies.GuardHealth();
            int enemyhp3 = Enemies.GuardOfficerHealth();
           	        
           	        while(true) { //tasitelu looppi
           	            int battle2 = 0;	            	            	           	            
           	            try {
           	                
           	            	battle2 = scanner.nextInt();
           	                scanner.nextLine(); 
           	            } catch (Exception e) {
           	                scanner.nextLine(); 
           	                System.out.println("Invalid input.");	                
           	            }
           	            if (battle2 == 1 && health > 0 && enemyHp2 > 0 && enemyhp3 > 0) { //pelaajan hyökkäys
           	                health = health - Enemies.GuardDamage();
           	                enemyHp2 = enemyHp2 - damage;             
           	                System.out.println("You have  "  + health + " health left. Guard dealt " + Enemies.GuardDamage() + " damage");
           	                System.out.println(" Guard has " + enemyHp2 + " health left. You dealt " + damage + " damage");	                                  	                	                
           	                health = health - Enemies.GuardOfficerDamage();	            	
           	            	System.out.println("You have " +health+ " health left. Guard officer dealt " +Enemies.GuardOfficerDamage()+ " damage");
           	            	System.out.println("Guard officer has " +enemyhp3+ " health left. ");
           	            	System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion"); 
           	            	
           	            
           	            }
           	         
           	            
           	            else if (battle2 == 2 && health > 0 && enemyhp3 > 0 && enemyHp2 > 0) {
           	            	health = health - Enemies.GuardOfficerDamage();
           	            	enemyhp3 = enemyhp3 - damage;
           	            	System.out.println("You have " +health+ " health left. Guard officer dealt " +Enemies.GuardOfficerDamage()+ " damage");
           	            	System.out.println("Guard officer has " +enemyhp3+ " health left. You dealt " +damage+ " damage");	            	 
           	            	health = health - Enemies.GuardDamage();	                          
           	                System.out.println("You have  "  + health + " health left. Guard dealt " + Enemies.GuardDamage() + " damage");
           	                System.out.println("Guard has " + enemyHp2 + " health left.");
           	                System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion"); 
           	            	}
           	            	 else if (battle2 == 3 && (health < 100 && healthpotionAmount > 0)) {           //health potionin käyttö	 	                
           	 	                health = Math.min(100, health + 20);
           	 	            	healthpotionAmount = healthpotionAmount - 1;
           	 	            	System.out.println("You used a health potion");
           	 	            	System.out.println("You now have " + health + " out of 100 health left");
           	 	            	System.out.println("You have " + healthpotionAmount + " health potions left");
           	 	            	System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion");
           	            	 }
           	            	 else if (battle2 == 3 && (health >=100 || healthpotionAmount <=0)) {
           	     	            System.out.println("You already have full health or don't have health potions left");
           	     	            System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion");
           	            	 }
           	            	 else  if (battle2 == 2 && health > 0 && enemyHp2 <= 0 && enemyhp3 > 0) {
           	            System.out.println("You have defeated guard.");
           	            health = health - Enemies.GuardOfficerDamage();
                       	enemyhp3 = enemyhp3 - damage;
                       	System.out.println("You have " +health+ " health left. Guard officer dealt " +Enemies.GuardOfficerDamage()+ " damage");
                       	System.out.println("Guard officer has " +enemyhp3+ " health left. You dealt " +damage+ " damage");
                       	System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion"); 
           	            }
           	            	 else if (battle2 ==1 && health > 0 && enemyhp3 <=0 && enemyHp2 > 0) {
                       	System.out.println("You have defeated guard officer");
           	            health = health - Enemies.GuardDamage();
                           enemyHp2 = enemyHp2 - damage;             
                           System.out.println("You have  "  + health + " health left. Guard dealt " + Enemies.GuardDamage() + " damage");
                           System.out.println("Guard has " + enemyHp2 + " health left. You dealt " + damage + " damage");
                           System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion"); 
                       	}
                       	
                       	
                       	else {
           	                System.out.println("Invalid input");	
                       	}
           	                if (enemyHp2 <=0 && enemyhp3 <= 0) {
           	                System.out.println("You won");
           	            break;
           	            }  if (health <= 0) { 
           	                System.out.println("Game over");
           	            	
           	                
           	            
           	            } 	                                  	            
           	        }
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("Exhausted from the fight you return to the carriage.");
	        System.out.println("You lean towards the driver and say:");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        //keskustelu looppi
	        while (true) {
	        	System.out.println("Press 1 = Why didn't you help? Press 2 = Who were those guys? Press 3 = Lets get going.");
	       int choice = 0;
	       try {
	    	   choice = scanner.nextInt();
	    	   scanner.nextLine();
	       } catch (Exception e) {
	       scanner.nextLine();
	       System.out.println("Invalid input");
	       }
	       if (choice == 1) {
	    	   System.out.println("\"Well I can't take the risk if we lose! I have much bigger problems than some lost refugee!\"");
	       continue;
	       }
	    	   
	       else if (choice == 2) {
	    	   System.out.println("\"Just some imperial guards guarding this checkpoint\"");
	       continue;
	       }
	       else if (choice == 3) {
	    	   System.out.println("\"Well buckle up then!\"");
	       break;
	       }
	       else {
	    	   System.out.println("Invalid input");
	    	   
	        }
	        
	        
	        } //tarina jatkuu
	        System.out.println("You succesfully cross the border to the occupied zones.");
	        System.out.println("The carriage driver says to you:");
	        System.out.println("I'll be dropping you off in couple of miles.");
	        System.out.println("You just nod.");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("You eventually arrive at a town with a sign that says \"Umberthain\"");
	        System.out.println("A dirty looking man leads the carriage behind a collapsed barn and says: ");
	        System.out.println("\"Issac! What the hell are you doing here?!\"");
	        System.out.println("Your carriage driver responds:");
	        System.out.println("I'm driving this goddamned refugee around!");
	        System.out.println("\"Unbeliavable! We are fighting a revolution and I am only good for some menial tasks!\"");
	        System.out.println("\"But what about you Otto? What are you up to?\"");
	        System.out.println("The dirty man responds: \"Oh you know, just trying to survive\"");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("You disembark the carriage head to a cottage down the road.");
	        System.out.println("\"Look Issac you really shouldn't have come here. You know there is a big brigant problem here.\"");
	        System.out.println("\"Relax Otto, this was the only safe place to sleep.\"");
	        System.out.println("\"Fine\" Otto replies. \"But you must leave as soon as the sun becomes to rise.\"");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("\"Did you guys have any trouble coming here?\" Otto asks");
	        System.out.println("\"We met two guards at a checkpoint but nothing too crazy\" Issac replies");
	        System.out.println("You guys injured?\" asks Otto");
	        System.out.println("\"I'm not, but maybe our crazy guy is. He took them down all by himself!\" Issac says");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("\"Refugee, do you want some healing drinks?\" Otto asks.");
	        System.out.println("\"These are the latest innovation of the empire! Made in universities of occupied Ivory Federation!");
	        System.out.println("\"The boy has used them before!\" Yells Issac.");
	        System.out.println("\"Oh, okay. Well I have some to spare, would you like some?");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("1 = Yes please! 2 = You should keep them.");
	        //keskustelu
	        while (true) {
	        	
	        	int ottoChoice = 0;
	        	try {
	        		ottoChoice = scanner.nextInt();
	        		scanner.nextLine();
	        	} catch (Exception e) {
	        	scanner.nextLine();
	        	System.out.println("Invalid input");
	        	}
	        if (ottoChoice == 1) {
	        	System.out.println("Here you go!");
	        ;
	        System.out.println("You recieve 5 health potions");
	        healthpotionAmount = healthpotionAmount + 5;
	        System.out.println("You now have " +healthpotionAmount+ " health potions");
	        break;
	        }
	        if (ottoChoice == 2) {
	        	System.out.println("\"Okay then\"");
	        	break;
	        }
	        else {
	        	System.out.println("Invalid input");
	        }
	        } //tarina jatkuu
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("Otto leads you to guest room and you prepare to get some sleep.");
	        System.out.println("What an adventure it has been.");
	        System.out.println("Free city of Adamouth is not far away.");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("You wake up and hear shouting from outside.");
	        System.out.println("You carefully peek from the door and you see Otto and Issac arguing with some men.");
	        System.out.println("\"Your debt is due! Give us what you got\" Yells one of the men.");
	        System.out.println("As you step out, the men separates you, Otto and Issac and draw their swords.");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("You are now fighting:");
	        System.out.println("Brigand boss (" +Enemies.BriganBossHealth() +" health and " +Enemies.BrigandBossDamage()+ " damage)");
	        System.out.println("Brigand brawler (" +Enemies.BrigandBrawlerHealth()+" health and " +Enemies.BrigandBrawlerDamage()+ " damage)");
	        System.out.println("Brigand recruit (" +Enemies.BrigandRecruitHealth()+ " health and " +Enemies.BrigandRecruitDamage()+ " damage)");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
	  int bBossHealth = Enemies.BriganBossHealth();
	  int bBrawlerHealth = Enemies.BrigandBrawlerHealth();
	  int bRecruitHealth = Enemies.BrigandRecruitHealth();
	        
	        while (true) { //tappelu looppi
		  int battle3 = 0;
	  
	  try {
		  battle3 = scanner.nextInt();
		  scanner.nextLine();
	  } catch (Exception e) {
		  scanner.nextLine();
		  System.out.println("Invalid input");
		  	  }
	  if (battle3 == 1 && health > 0 && bBossHealth > 0 && bBrawlerHealth > 0 && bRecruitHealth > 0) {
		  health = health - (Enemies.BrigandBossDamage() + Enemies.BrigandBrawlerDamage() + Enemies.BrigandRecruitDamage());
		  bBossHealth = bBossHealth - damage;
		  System.out.println("You dealt " +damage+ " damage");
		  System.out.println("Brigadier boss has " +bBossHealth+ " health left");
		  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
		  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");
		  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
		  System.out.println("You have " +health+ "health left");		  
		  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");  
	  }
	  else if (battle3 == 2 && health > 0 && bBossHealth > 0 && bBrawlerHealth > 0 && bRecruitHealth > 0) {
		  health = health - (Enemies.BrigandBossDamage() + Enemies.BrigandBrawlerDamage() + Enemies.BrigandRecruitDamage());
		  bBrawlerHealth = bBrawlerHealth - damage;
		  System.out.println("You dealt " +damage+ " damage");
		  System.out.println("Brigadier brawler has " +bBrawlerHealth+ "health left");
		  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
		  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");
		  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
		  System.out.println("You have " +health+ "health left");		  
		  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
	  }
	  else if (battle3 == 3 && health > 0 && bBossHealth > 0 && bBrawlerHealth > 0 && bRecruitHealth > 0) {
		  health = health - (Enemies.BrigandBossDamage() + Enemies.BrigandBrawlerDamage() + Enemies.BrigandRecruitDamage());
		  bRecruitHealth = bRecruitHealth - damage;
		  System.out.println("You dealt " +damage+ " damage");
		  System.out.println("Brigadier recruit has " +bRecruitHealth+ " health left");		  
		  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
		  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");
		  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
		  System.out.println("You have " +health+ "health left");		   
		  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");  
	        }
	  else if (battle3 == 4 && (health < 100 && healthpotionAmount > 0)) {
		health = Math.min(100, health + 20);
	
      	healthpotionAmount = healthpotionAmount - 1;
      	System.out.println("You used a health potion");
      	System.out.println("You now have " + health + " out of 100 health left");
      	System.out.println("You have " + healthpotionAmount + " health potions left");
      	System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
	  }
      	else if (battle3 == 4 && (health >=100 || healthpotionAmount <=0)) {
      		System.out.println("You already have full health or don't have health potions left");
      		System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
      	}
      	else if (battle3 == 1 && bBossHealth > 0 && bBrawlerHealth > 0 && bRecruitHealth <= 0) {
      health = health - (Enemies.BrigandBossDamage() + Enemies.BrigandBrawlerDamage());
	  bBossHealth = bBossHealth - damage;
	  System.out.println("You have defeated brigadier recruit");
	  System.out.println("You dealt " +damage+ " damage");
	  System.out.println("Brigadier boss has " +bBossHealth+ " health left");
	  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
	  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");	  
	  System.out.println("You have " +health+ "health left");		  
	  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
	        
	  }
      	else if (battle3 == 1 && bBossHealth > 0 && bBrawlerHealth <=0 && bRecruitHealth > 0) {
      		health = health - (Enemies.BrigandBossDamage() + Enemies.BrigandRecruitDamage());
	  bBossHealth = bBossHealth - damage;
	  System.out.println("You have defeated brigadier brawler");
	  System.out.println("You dealt " +damage+ " damage");
	  System.out.println("Brigadier boss has " +bBossHealth+ " health left");
	  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
	  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");	  
	  System.out.println("You have " +health+ "health left");		  
	  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
	        }
      	else if (battle3 == 1 && bBossHealth > 0 && bBrawlerHealth <=0 && bRecruitHealth <= 0 ) {
      		health = health - Enemies.BrigandBossDamage();
      	  bBossHealth = bBossHealth - damage;
      	  System.out.println("You have defeated brigadier brawler and brigadier recruit");
      	  System.out.println("You dealt " +damage+ " damage");
      	  System.out.println("Brigadier boss has " +bBossHealth+ " health left");
      	  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");      	  	  
      	  System.out.println("You have " +health+ "health left");		  
      	  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
      	}
      	else if (battle3 == 2 && health > 0 && bBossHealth <= 0 && bBrawlerHealth > 0 && bRecruitHealth > 0) {
      		health = health - (Enemies.BrigandBrawlerDamage() + Enemies.BrigandRecruitDamage());
	  bBrawlerHealth = bBrawlerHealth - damage;
	  System.out.println("You have defeated brigadier boss.");
	  System.out.println("You dealt " +damage+ " damage");
	  System.out.println("Brigadier brawler has " +bBrawlerHealth+ "health left");	  
	  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");
	  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
	  System.out.println("You have " +health+ "health left");		  
	  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");
	        }
	        else if (battle3 == 2 && health > 0 && bBossHealth <= 0 && bBrawlerHealth > 0 && bRecruitHealth <= 0) {
	        	health = health - Enemies.BrigandBrawlerDamage();
	      	  bBrawlerHealth = bBrawlerHealth - damage;
	      	  System.out.println("You have defeated brigadier recruit and brigadier boss.");
	      	  System.out.println("You dealt " +damage+ " damage");
	      	  System.out.println("Brigadier brawler has " +bBrawlerHealth+ "health left");	  
	      	  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");	      	  
	      	  System.out.println("You have " +health+ "health left");		  
	      	  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");	
	        }
	        else if (battle3 == 2 && health > 0 && bBossHealth > 0 && bBrawlerHealth > 0 && bRecruitHealth <= 0) {
	        	health = health - (Enemies.BrigandBrawlerDamage() + Enemies.BrigandBossDamage());
	      	  bBrawlerHealth = bBrawlerHealth - damage;
	      	  System.out.println("You have defeated brigadier recruit.");
	      	  System.out.println("You dealt " +damage+ " damage");
	      	  System.out.println("Brigadier brawler has " +bBrawlerHealth+ "health left");	  
	      	  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");
	      	  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
	      	  System.out.println("You have " +health+ "health left");		  
	      	  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");	
	        }
	        else if (battle3 == 3 && health > 0 && bBossHealth < 0 && bBrawlerHealth > 0 && bRecruitHealth > 0) {
	  		  health = health - ( Enemies.BrigandBrawlerDamage() + Enemies.BrigandRecruitDamage());
			  bRecruitHealth = bRecruitHealth - damage;
			  System.out.println("You have defeated brigadier boss");
			  System.out.println("You dealt " +damage+ " damage");
			  System.out.println("Brigadier recruit has " +bRecruitHealth+ " health left");		  			  
			  System.out.println("Brigadier brawler deals " +Enemies.BrigandBrawlerDamage()+ " damage");
			  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
			  System.out.println("You have " +health+ "health left");		   
			  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");  
		        }
	        else if (battle3 == 3 && health > 0 && bBossHealth <= 0 && bBrawlerHealth <= 0 && bRecruitHealth > 0) {
		  		  health = health - Enemies.BrigandRecruitDamage();
				  bRecruitHealth = bRecruitHealth - damage;
				  System.out.println("You have defeated brigadier boss and brigadier brawler");
				  System.out.println("You dealt " +damage+ " damage");
				  System.out.println("Brigadier recruit has " +bRecruitHealth+ " health left");		  			  				  
				  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
				  System.out.println("You have " +health+ "health left");		   
				  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");  
			        }
	        else if (battle3 == 3 && health > 0 && bBossHealth > 0 && bBrawlerHealth <= 0 && bRecruitHealth > 0) {
		  		  health = health - ( Enemies.BrigandBossDamage() + Enemies.BrigandRecruitDamage());
				  bRecruitHealth = bRecruitHealth - damage;
				  System.out.println("You have defeated brigadier brawler");
				  System.out.println("You dealt " +damage+ " damage");
				  System.out.println("Brigadier recruit has " +bRecruitHealth+ " health left");		  			  				  
				  System.out.println("Brigadier recruit deals " +Enemies.BrigandRecruitDamage()+ " damage");
				  System.out.println("Brigadier boss deals " +Enemies.BrigandBossDamage()+ " damage");
				  System.out.println("You have " +health+ "health left");		   
				  System.out.println("Press 1 to attack brigadier boss, 2 to attack brigadier brawler, 3 to attack brigadier recruit and 4 to use healing potion");  
			        }
    
	        else {
	        	System.out.println("Invalid input");
	        }
	   if (health < 0) {
		  System.out.println("Game over");
	  
   
	  }
    if (bBossHealth <= 0 && bBrawlerHealth <= 0 && bRecruitHealth <= 0) {
    	System.out.println("You won");
    break;
    }
	        }
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();	        
	        System.out.println("\"Oh for fucks sake!\" Otto yells.");
	        System.out.println("\"I told you guy that you should not stay here!\"");
	        System.out.println("\"Calm the fuck down Otto!\" replies Issac");
	        System.out.println("As those two yell at each other you spot a coin pouch on one of the brigadiers.");
	        int coinpouch = random.nextInt(10) + 15;
	        money = money + coinpouch;
	        System.out.println("You loot the body and you now have " +money+ " coins");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("\"Come now refugee, it is time to go!\" Yells Issac");
	        System.out.println("\"We are heading towards the free city, it will be our last stop.\"");
	        System.out.println("Issac and you start to prepare the carriage and are soon rolling towards your destination.");
	        System.out.println("The free city is couple hundred miles away now. You can almost taste the freedom.");
	        System.out.println("Press ENTER to continue");
	        scanner.nextLine();
	        System.out.println("\"Look refugee, a merchant on the side of the road! If you want to stock up we can stop and have a look.\" Issac says.");
	        System.out.println("Press 1 keep going or 2 to go shopping");
	        while(true) { //kauppa looppi
	            int merchantchoice=0;
	            try {
	            	merchantchoice = scanner.nextInt();
	                scanner.nextLine(); 
	            } catch (Exception e) {
	                scanner.nextLine(); 
	                System.out.println("Invalid input.");	                
	            }
	            if (merchantchoice == 1) {
	            	System.out.println("You decide to keep going");
	            break;
	            }
	            else if (merchantchoice == 2) {
	            	System.out.println("You decide to go shopping");
	            	int royalFalchionprice = 20;
	            	int ivoryHalberdprice = 10;
	            	int wepianRapierprice = 5;
	                int healthPotionPrice3 = 1;
	            	    System.out.println("Press 1 to purchase health potion (costs " + healthPotionPrice3 + " coins and heals 20), press 2 to purchase Wepian rapier (" +Weapons.Wepianrapier() + " damage and costs " + wepianRapierprice + " coins), or to continue your journey press 3");
	            	    System.out.println("Press 2 to purchase Wepian rapier (" +Weapons.Wepianrapier() + " damage and costs " + wepianRapierprice + " coins)");
	            	    System.out.println("Press 3 to purchase ivory halberd (" +Weapons.Ivoryhalberd() + " damage and costs " +ivoryHalberdprice+ " coins)");
	            	    System.out.println("Press 4 to purchase royal falchion of the free city (" +Weapons.RoyalFalchionOfTheFreeCity()+ "damage and costs " +royalFalchionprice+ " coins)");
	            	    System.out.println("Press 5 to continue your journey");
	            	    while (true) {
	            	        
	            	     int merchant=0;
	            	        try {
	            	        	merchant = scanner.nextInt();
	            	            scanner.nextLine(); 
	            	        } catch (Exception e) {
	            	            scanner.nextLine(); 
	            	            System.out.println("Invalid input.");	                
	            	        }
	            	            
	            	            if (merchant == 1 && money >= healthPotionPrice) {
	            	                healthpotionAmount= healthpotionAmount + 1;
	            	                money = money - healthPotionPrice3;
	            	                System.out.println("You now have " + healthpotionAmount + " health potions");
	            	                System.out.println("You now have " + money + " coins");
	            	                
	            	                
	            	            } else if (merchant == 2 && money >= wepianRapierprice) {
	            	                damage = Weapons.Wepianrapier();
	            	                System.out.println("You have equipped Wepian rapier");
	            	                money = money - wepianRapierprice;
	            	                System.out.println("You now have " + money + " coins");
	            	            }   
	            	                else if (merchant == 3 && money >= ivoryHalberdprice)  {
	            	                	damage = Weapons.Ivoryhalberd();
	            	                	System.out.println("You have equipped ivory halberd");
	            	                	money = money - ivoryHalberdprice;
	            	                	System.out.println("You now have " +money+ " coins");
	            	                }
	            	                else if (merchant == 4 && money >= royalFalchionprice) {
	            	                	damage = Weapons.RoyalFalchionOfTheFreeCity();
	            	                    System.out.println("You have equipped royal falchion of the free city");
	            	                	money = money - royalFalchionprice;
	            	                	System.out.println("You now have " +money+ " coins");
	            	                }
	            	                		            	           	            	            	            	            
	            	             else if (merchant == 5) {
	            	                System.out.println("You continue your journey.");
	            	                break;
	            	            } else {
	            	                System.out.println("Invalid input or not enough coins.");
	            	            }
	            	            
	            	    }	            	    
	break;
	        	
	        }
	        
	  }
	        System.out.println("Press ENTER to continue");
	    	scanner.nextLine();  
	    	System.out.println("\"We still have a long journey ahead so I suggest you get some sleep\" Issac says to you.");
	    	System.out.println("You nod and start fading away");
	    	System.out.println("What a journey this has been!");
	    	System.out.println("You overcame every obstacle and freedom is within reach!");
	    	System.out.println("Press ENTER to continue");
	    	scanner.nextLine();
	    	System.out.println("\"Hey, wakeup. WAKE UP!\"");
	    	System.out.println("You wake up startled and confused");
	    	System.out.println("\"LOOK!\" Issac says");
	    	System.out.println("Press ENTER to continue");
	    	scanner.nextLine();
	    	System.out.println("You have now arrived at the Free city of Adamouth but the imperial army has blocked entry");
	    	System.out.println("Tensions are high and adamouthian army has gathered at the walls and demand that the imperials stop with the aggressive behaviour.");
	    	System.out.println("Some imperial general is shouting propaganda saying that there is no need to fear and people who return volunteraly have nothing to fear.");
	    	System.out.println("There are tens of thousands of people awating entry to the city clearly disgruntled with the empire.");
	    	System.out.println("The people need someone to light the spark.");
	    	System.out.println("Press ENTER to continue");
	    	scanner.nextLine();
	    	System.out.println("You clearly outnumber the imperial forces, but is that enough?");
	    	System.out.println("And are you willing to risk the fragile peace between one of the remaining free nations and the empire?");
	    	System.out.println("Press ENTER to continue");
	    	scanner.nextLine();
	    	System.out.println("Press 1 to give up");
	    	System.out.println("Press 2 to fight");
	    	
	    	while (true) { //valitaan luovetetaanko vai taistellaanko
	    		int endchoice = 0;
	    		try {
	    			endchoice = scanner.nextInt();
	    			scanner.nextLine();
	    		}
	    		catch (Exception e) {
	    			scanner.nextLine();
	    			System.out.println("Invalid input");
	    		}
	    			if (endchoice == 1) { //valinta 1 = ei taistella. peli päättyy
					System.out.println("You decide not to risk it and tell Issac that you should head back");
				
	    		System.out.println("Unfortanetely unbeknownst to you since the prison attack imperial forces have been tracking the escaped prioners and you run into them.");
	    		System.out.println("There is nothing you can do. A few soldiers wouldn't be a problem but there are hundreds of them.");
	    		System.out.println("They lock you in prison and you await your inevitable death");
	    		System.out.println("Press ENTER to continue");
	    		scanner.nextLine();
	    		System.out.println("The refugees didn't find solace at the free city.");
	    		System.out.println("Too afraid to act they were transfered back to imperial territory, their ultimate fate is unknown");
	    		System.out.println("This was a huge propaganda victory for the emperor and resistance movements failed to gain any meaningful traction.");
	    		System.out.println("Trinemian empire continued to gain power and focused on conquering the rest of Estiriel");
	    		break;
	    		}
	    		else if (endchoice == 2) { //valinta = taistellaan
	    		
	    		System.out.println("You decide that youd rather die than let tyranny rule the world");
	    		System.out.println("You take a deep breath and shout.");
	    		System.out.println("\"FOR FREEDOM!!\"");
	    		System.out.println("You draw your weapon and charge forward.");
	    		System.out.println("And then suddenly all hell breaks loose");
	    		System.out.println("Press ENTER to continue");
	    		scanner.nextLine();
	    		System.out.println("The people gain the courage of five lions and attack the imperial soldiers");
	    		System.out.println("The ground is soon painted in red but the imperials finally fall into disarray when Adamouthian soldiers join the battle.");
	    		System.out.println("The general orders an immediate retreat but the chaos is too strong among his troops.");
	    		System.out.println("With one of his royal guards he flees the battlefield but not before he faces you.");
	    		System.out.println("Press ENTER to continue");
	    		scanner.nextLine();
	    		System.out.println("You are now fighting imperial general (" +Enemies.ImperialGeneralDamage()+ " damage and " +Enemies.ImperialGeneralHealth()+ " health)");
	    		System.out.println("You are now fighting royal guard (" +Enemies.RoyalGuardDamage()+ " damage and " +Enemies.RoyalGuardHealth()+ " health)");
	    		System.out.println("Press 1 to attack imperial general, press 2 to attack royal guard and press 3 to use health potion");
	    		}
	    			int generalHealth = Enemies.ImperialGeneralHealth();
		    		int royalGuardhealth = Enemies.RoyalGuardHealth();
	    			while (true) {  //taistelu looppi
	    	    		int endbattle = 0;
	    	    		try {
	    	    			endbattle = scanner.nextInt();
	    	    			scanner.nextLine();
	    	    		}
	    	    		catch (Exception e) {
	    	    			scanner.nextLine();
	    	    			System.out.println("Invalid input");
	    	    		}
	    	    			
	    			
	    		
	    		 if (endbattle == 1 && health > 0 && generalHealth > 0 && royalGuardhealth > 0) {
    	                health = health - (Enemies.ImperialGeneralDamage() + Enemies.RoyalGuardDamage());
    	                generalHealth = generalHealth - damage;             
    	                System.out.println("General dealt " + Enemies.ImperialGeneralDamage() + " damage");
    	                System.out.println("General has " + generalHealth + " health left. You dealt " + damage + " damage");	                                  	                	                    	                            	
    	            	System.out.println("Royal Guard officer dealt " +Enemies.GuardOfficerDamage()+ " damage");
    	            	System.out.println("You have " +health+ " health left");
    	            	System.out.println("Press 1 to attack imperial general, press 2 to attack royal guard and press 3 to use health potion"); 
    	            	
    	            
    	            }
    	         
    	            
    	            else if (endbattle == 2 && health > 0 && royalGuardhealth > 0 && generalHealth > 0) {
    	            	health = health - (Enemies.ImperialGeneralDamage() + Enemies.RoyalGuardDamage());
    	            	royalGuardhealth = royalGuardhealth - damage;
    	            	 System.out.println("Royal guard dealt " + Enemies.RoyalGuardDamage() + " damage");
     	                System.out.println("Royal guard has " + royalGuardhealth + " health left. You dealt " + damage + " damage");	                                  	                	                    	                            	
     	            	System.out.println("General dealt " +Enemies.ImperialGeneralDamage()+ " damage");
     	            	System.out.println("You have " +health+ " health left");
     	            	System.out.println("Press 1 to attack imperial general, press 2 to attack royal guard and press 3 to use health potion");
    	            	}
    	            	 else if (endbattle == 3 && (health < 100 && healthpotionAmount > 0)) {           	 	                
    	 	                health = Math.min(100, health + 20);
    	 	            	healthpotionAmount = healthpotionAmount - 1;
    	 	            	System.out.println("You used a health potion");
    	 	            	System.out.println("You now have " + health + " out of 100 health left");
    	 	            	System.out.println("You have " + healthpotionAmount + " health potions left");
    	 	            	System.out.println("Press 1 to attack imperial general, 2 to attack royal guard or 3 to use a health potion");
    	            	 }
    	            	 else if (endbattle == 3 && (health >=100 || healthpotionAmount <=0)) {
    	     	            System.out.println("You already have full health or don't have health potions left");
    	     	            System.out.println("Press 1 to attack guard, 2 to attack guard officer or 3 to use a health potion");
    	            	 }
    	            	 else  if (endbattle == 2 && health > 0 && generalHealth <= 0 && royalGuardhealth > 0) {
    	            System.out.println("You have defeated general.");
    	            health = health - Enemies.RoyalGuardDamage();
                	royalGuardhealth = royalGuardhealth - damage;
                	System.out.println("Royal guard dealt " + Enemies.RoyalGuardDamage() + " damage");
 	                System.out.println("Royal guard has " + royalGuardhealth + " health left. You dealt " + damage + " damage");	                                  	                	                    	                            	 	            	
 	            	System.out.println("You have " +health+ " health left");
 	            	System.out.println("Press 1 to attack imperial general, press 2 to attack royal guard and press 3 to use health potion");
    	            }
    	            	 else if (endbattle == 1 && health > 0 && royalGuardhealth <=0 && generalHealth > 0) {
                	System.out.println("You have defeated royal guard");
    	            health = health - Enemies.ImperialGeneralDamage();
                    generalHealth = generalHealth - damage;             
                    System.out.println("General dealt " + Enemies.ImperialGeneralDamage() + " damage");
	                System.out.println("General has " + generalHealth + " health left. You dealt " + damage + " damage");	                                  	                	                    	                            		            	
	            	System.out.println("You have " +health+ " health left");
	            	System.out.println("Press 1 to attack imperial general, press 2 to attack royal guard and press 3 to use health potion"); 
                	}
                	
                	
                	else {
    	                System.out.println("Invalid input");	
                	}
    	                if (generalHealth <=0 && royalGuardhealth <= 0) { //jos pelaaja voittaa niin se on yksi pelin lopetuksista
    	                System.out.println("You won");
    	                System.out.println("As you deal your final blow, the imperial forces are in complete disarray.");
    	                System.out.println("The few remaining soldiers are driven back far from the gates and refugees start to pour inside the city.");
    	                System.out.println("Adamouthian council quickly sends the message to other nations what had happened and revolutionary forces began to activate in Trinemian empire");
    	                System.out.println("This sparked a civil war in Trinemia which the imperials ultimately lost.");
    	                break;
    	            }  if (health <= 0) { //jos pelaaja häviää niin se on yksi pelin lopetuksista
    	                System.out.println("You lost");
    	            	System.out.println("The general can now flee unobstructed and he will bring imperial reinforcements");
    	            	System.out.println("As the reinforcements come to aid the refugees stand no chanche");
    	            	System.out.println("Refugees are slaughtered and Adamouthian soldiers are driven inside their walls.");
    	            	System.out.println("Enraged of the Adamouthian involvement, the emperor orders immediate attack and annexation of the free city.");
    	            	System.out.println("With no one alive but those loyal to the empire, word spreads that Adamouthians started to slaughter the refugees and the empire intervened.");
    	            	System.out.println("Resistance forces who were sceptical of this gained medium success for their efforts, but nothing the empire could not recover from.");
    	                break;
    	            
    	            } 	                                  	            
    	        }
	    			System.out.println("Thanks for playing!");
 	    		    System.out.println("Press 1 to exit the game");
 	    		   while (true) { 
 	  	    		int exitgame = 0;
 	  	    		try {
 	  	    			exitgame = scanner.nextInt();
 	  	    			scanner.nextLine();
 	  	    		}
 	  	    		catch (Exception e) {
 	  	    			scanner.nextLine();
 	  	    			System.out.println("Invalid input");
 	  	    		}
 	  	    			if (exitgame == 1) { 
 	  					System.exit(0);
	    			scanner.close();
 	    		
	    		}
 	  	    			
 	    		   }
 	    		  
	    	}
	    	scanner.close();
	  }
	  
}

	  
	  

 