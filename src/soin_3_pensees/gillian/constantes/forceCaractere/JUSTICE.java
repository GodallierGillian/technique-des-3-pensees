package soin_3_pensees.gillian.constantes.forceCaractere;

public enum JUSTICE{
	Justice("L'équité consiste à traiter les gens avec justice, à ne pas laisser vos sentiments personnels influencer vos décisions concernant les autres. Vous voulez donner à chacun une chance équitable et pensez qu'il devrait y avoir des chances égales pour tous, même si vous réalisez également que ce qui est juste pour une personne peut ne pas l'être pour une autre.\r\n"
			+ "\r\n"
			+ "L'équité est une capacité de jugement cognitif qui implique de raisonner et de porter des jugements. Elle implique 2 types de raisonnement :\r\n"
			+ "\r\n"
			+ "Raisonnement de justice qui met l'accent sur la logique et les principes de pesée pour déterminer les droits et responsabilités moraux.\r\n"
			+ "Raisonnement de soins qui inclut l'empathie et la compassion ; la capacité de se mettre à la place de quelqu'un d'autre."), 
	Manager("Le leadership peut prendre plusieurs formes. En tant que force de caractère, le leadership fait référence à la tendance à organiser et à encourager un groupe à faire avancer les choses, tout en maintenant de bonnes relations au sein du groupe. Comme le travail d'équipe, le leadership implique de s'engager envers les objectifs du groupe, mais la façon dont cet engagement se manifeste est très différente. Le leadership consiste à fixer des objectifs et à les atteindre, à obtenir une aide efficace, à créer des coalitions et à lisser les plumes ébouriffées. Les leaders efficaces sont capables de fournir une vision ou un message positif qui inspire des suiveurs dévoués qui se sentent responsabilisés et peut-être même inspirés. Le leadership est un phénomène social qui peut être distingué en deux domaines :\r\n"
			+ "\r\n"
			+ "Pratique - définir, établir, identifier ou traduire la direction\r\n"
			+ "Qualité personnelle - la motivation et la capacité de rechercher, d'atteindre et d'exercer des rôles de leader Il existe deux types de leaders :\r\n"
			+ "Leaders transactionnels - ce type de leader clarifie les responsabilités, les attentes et les tâches à accomplir\r\n"
			+ "Leaders transformationnels - ce leader motive ses partisans à performer à un niveau extrêmement élevé, favorisant un climat de confiance et d'engagement envers l'organisation et ses objectifs"), 
	TravailDEquipe("Le travail d'équipe signifie que dans les situations d'équipe, vous vous engagez à contribuer au succès de l'équipe. L'équipe peut être un groupe de travail ou une équipe sportive, mais cela peut aussi faire référence à votre famille, votre mariage ou même un groupe d'amis travaillant ensemble sur un projet. Le travail d'équipe s'étend à être un bon citoyen de votre communauté ou de votre pays, et plus largement à un sens de la responsabilité sociale pour des groupes particuliers de personnes ou même pour l'ensemble de l'humanité. En d'autres termes, la personne élevée dans le travail d'équipe applique une certaine manière d'agir dans n'importe quel contexte où elle se considère engagée pour le bien du groupe dans son ensemble. Le plus souvent, cependant, cette force fait référence au fait que vous êtes un membre dévoué, fiable et contributeur de votre petit groupe ou équipe. Le travail d'équipe est étroitement lié à 3 autres concepts :\r\n"
			+ "\r\n"
			+ "Citoyenneté : responsabilité envers sa communauté\r\n"
			+ "Fidélité : confiance inébranlable pour un groupe\r\n"
			+ "Patriotisme : loyauté envers sa patrie/nation sans hostilité envers les autres nations");
	private String description;
	private JUSTICE(String description) {  
        this.description = description ;  
   }  
     
    public String getDescription() {  
        return  this.description ;  
   } 
}
