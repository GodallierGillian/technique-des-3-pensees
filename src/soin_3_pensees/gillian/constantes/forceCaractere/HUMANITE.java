package soin_3_pensees.gillian.constantes.forceCaractere;

public enum HUMANITE{
	Gentillesse("En termes simples, la gentillesse consiste à être gentil avec les autres. Au fur et à mesure que vous examinez la gentillesse, un certain nombre de dimensions importantes commencent à se dévoiler. La gentillesse, c'est être généreux avec les autres, donner de son temps, de son argent et de son talent pour soutenir ceux qui sont dans le besoin. La gentillesse, c'est être compatissant, ce qui signifie être vraiment là pour quelqu'un, écouter attentivement sa souffrance ou simplement s'asseoir avec lui et le soutenir en silence. Une telle compassion implique une profonde préoccupation pour le bien-être des autres. La gentillesse, c'est aussi nourrir et prendre soin des autres - aimer faire des faveurs pour eux, prendre soin d'eux et accomplir de bonnes actions.\r\n"
			+ "\r\n"
			+ "Les personnes bienveillantes croient que les autres méritent attention et affirmation pour leur propre bien en tant qu'êtres humains, et non par sens du devoir ou par principe. Il existe trois traits de personnalités altruistes :\r\n"
			+ "\r\n"
			+ "Empathie sympathie\r\n"
			+ "Raisonnement moral\r\n"
			+ "Responsabilité sociale"), 
	Amour("Après des millions de chansons et de cartes de vœux, l'amour n'a plus besoin d'être présenté. Cela dit, nous voulons être clairs sur la façon dont le terme est utilisé dans la classification VIA. L'amour en tant que force de caractère, plutôt qu'en tant qu'émotion, fait référence à la mesure dans laquelle vous appréciez les relations étroites avec les gens et contribuez à cette proximité d'une manière chaleureuse et authentique. Là où la gentillesse peut être un modèle de comportement appliqué dans n'importe quelle relation, l'amour en tant que force de caractère fait vraiment référence à la façon dont vous abordez vos relations les plus proches et les plus chaleureuses. L'amour est réciproque, se référant à la fois à l'amour des autres et à la volonté d'accepter l'amour des autres. Il existe quatre types d'amour, chacun ayant une base biologique et évolutive :\r\n"
			+ "\r\n"
			+ "Amour d'attachement : parent pour enfant ; enfant pour parent\r\n"
			+ "Amour compatissant/altruiste : gentillesse\r\n"
			+ "Amour compagnon : amitié\r\n"
			+ "Amour romantique : conjoint/partenaire/petit ami/petite amie"), 
	IntelligenceSociale("Lorsqu'une personne sait ce qui motive les autres, elle fait preuve d'intelligence sociale. Ils sont conscients des motivations et des sentiments d'eux-mêmes et des autres, et comment s'adapter à différentes situations sociales. Ils peuvent se sentir à l'aise et dire la bonne chose, qu'ils soient dans la salle de conférence ou dans la salle de conciergerie, dans une école ou sur un chantier de construction. L'intelligence sociale implique deux composants généraux :\r\n"
			+ "\r\n"
			+ "Conscience sociale : ce que nous ressentons chez les autres\r\n"
			+ "Facilité sociale : ce que nous faisons de notre conscience");
	private String description;
	private HUMANITE(String description) {  
        this.description = description ;  
   }  
     
    public String getDescription() {  
        return  this.description ;  
   } 
}