package soin_3_pensees.gillian.constantes.forceCaractere;

public enum COURAGE{
	Bravoure("Être courageux, c'est affronter ses défis, ses menaces ou ses difficultés. Cela implique de valoriser un objectif ou une conviction et d'agir en conséquence, qu'ils soient populaires ou non. Un élément central consiste à affronter – plutôt qu'à éviter – les peurs.\r\n"
			+ "\r\n"
			+ "Il existe trois types de bravoure (un individu peut en posséder un ou une combinaison) :\r\n"
			+ "\r\n"
			+ "Courage physique (p. ex., pompiers, policiers, soldats)\r\n"
			+ "Courage psychologique (par exemple, faire face à des aspects douloureux de soi)\r\n"
			+ "Bravoure morale (par exemple, défendre ce qui est juste, même s'il s'agit d'une opinion défavorable à un groupe)"), 
	Honnêteté("Quand vous êtes honnête, vous dites la vérité. Plus largement, vous vous présentez de manière authentique et sincère, sans faux-semblant, et en assumant la responsabilité de vos sentiments et de vos actes. Vous êtes une personne intègre - vous êtes qui vous dites être - et vous agissez de manière cohérente dans tous les domaines de votre vie plutôt que d'être à sens unique dans la communauté et d'une manière complètement différente dans votre famille. En conséquence, vous pensez que vous êtes toujours fidèle à vous-même.\r\n"
			+ "\r\n"
			+ "Cette force implique de représenter avec précision vos états internes, vos intentions et vos engagements, tant en public qu'en privé. La force de l'honnêteté est souvent liée à la concordance de soi - la mesure dans laquelle vos objectifs représentent avec précision vos intérêts et valeurs implicites. L'honnêteté permet aux gens d'assumer la responsabilité de leurs sentiments et de leurs comportements, de les posséder et d'en tirer des bénéfices."), 
	Persévérance("La persévérance, c'est s'en tenir aux choses. Cela signifie travailler dur et terminer ce qui est commencé, malgré les barrières et les obstacles qui se présentent. Le plaisir que procure la réalisation de tâches et de projets est très important pour ceux qui sont très persévérants. Parfois, il ou elle doit creuser profondément et rassembler la volonté de surmonter les pensées d'abandon. La persévérance implique de s'organiser pour soutenir les activités (par exemple, planifier des pauses et s'y tenir, récompenser de petites manières en cours de route), mais quand tout le reste échoue, cette force aide la personne à foncer jusqu'à ce que le projet soit terminé. Cela aide à renforcer la confiance pour les succès futurs et la réalisation des objectifs. La persévérance implique la poursuite volontaire d'une action dirigée vers un but malgré la présence de défis, de difficultés et de découragement. Il existe deux vecteurs de persévérance."), 
	Vitalité("Zest signifie aborder une situation, ou la vie en général, avec enthousiasme et énergie, ne pas aborder des tâches ou des activités à mi-chemin ou sans enthousiasme. Les personnes qui ont le zeste sont ravies de se lever le matin et vivent leur vie comme une aventure. Le zeste est une force dynamique qui est directement liée au bien-être physique et psychologique. Cette force a les liens les plus étroits avec la satisfaction globale de la vie et une vie d'engagement.");
	private String description;
	private COURAGE(String description) {  
        this.description = description ;  
   }  
     
    public String getDescription() {  
        return  this.description ;  
   }  
}
