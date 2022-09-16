package soin_3_pensees.gillian.constantes.forceCaractere;

public enum TEMPERANCE {
	Pardon("Le pardon signifie étendre la compréhension envers ceux qui nous ont fait du tort ou nous ont blessés. Cela signifie lâcher prise. Dans de nombreux cas, il s'agit d'abandonner tout ou partie de la frustration, de la déception, du ressentiment ou d'autres sentiments douloureux associés à une infraction. Le pardon, et la qualité connexe de la miséricorde, impliquent d'accepter les lacunes, les défauts et les imperfections des autres et de leur donner une deuxième (ou troisième) chance. Comme le dit l'expression, il s'agit de laisser passer le passé, plutôt que d'être vengeur. C'est un processus d'humanisation de ceux qui nous ont amenés à nous sentir déshumanisés.\r\n"
			+ "\r\n"
			+ "Il est important de distinguer le pardon de :\r\n"
			+ "\r\n"
			+ "tolérer (supprimer l'infraction)\r\n"
			+ "oubli (enlève la conscience)\r\n"
			+ "réconciliation (restaure la relation)"),
	Humilité("L'humilité signifie évaluer avec précision vos réalisations. Il est facile de décrire ce que l'humilité n'est pas - ce n'est pas se vanter, ne pas faire des choses en excès, ne pas chercher la vedette, ne pas attirer l'attention sur soi, ne pas se considérer comme plus spécial ou important que les autres. D'un autre côté, ce n'est pas se plier à tous les souhaits ou demandes d'une autre personne et ce n'est pas être très autocritique. Les personnes vraiment humbles ont une bonne opinion d'elles-mêmes et ont une bonne idée de qui elles sont, mais elles sont également conscientes de leurs erreurs, de leurs lacunes dans leurs connaissances et de leurs imperfections. Plus important encore, ils sont satisfaits sans être au centre de l'attention ni être félicités pour leurs réalisations.\r\n"
			+ "\r\n"
			+ "Une idée fausse courante est que l'humilité implique d'avoir une faible estime de soi, un sentiment d'indignité et/ou un manque de concentration sur soi. Cependant, la véritable humilité implique une auto-évaluation précise, la reconnaissance des limites, la mise en perspective des réalisations et l'oubli de soi. Les personnes humbles ne déforment pas les informations pour défendre ou vérifier leur propre image, et elles n'ont pas besoin de se voir - ou de se présenter - comme étant meilleures qu'elles ne le sont réellement."),
	Prudence("La prudence, c'est faire attention à ses choix, s'arrêter et réfléchir avant d'agir. C'est une force de retenue. Lorsque vous êtes prudent, vous ne prenez pas de risques inutiles et ne dites ou ne faites pas des choses que vous pourriez regretter plus tard. Si vous êtes très prudent, vous êtes capable de considérer les conséquences à long terme de vos actions. La prudence est une forme de raisonnement pratique, la capacité d'examiner objectivement les conséquences potentielles de vos actions et de vous contrôler sur la base de cet examen. La prudence implique une planification à long terme ainsi qu'une planification à court terme axée sur les objectifs. On parle souvent de sagesse prudente, de sagesse pratique et de raison pratique."),
	Autorégulation("L'autorégulation est une force de caractère complexe. Il s'agit de contrôler vos appétits et vos émotions et de réguler ce que vous faites. Ceux qui ont un niveau élevé d'autorégulation ont un bon niveau de confiance dans leur conviction qu'ils peuvent être efficaces dans ce qu'ils poursuivent et qu'ils sont susceptibles d'atteindre leurs objectifs. Ils sont admirés pour leur capacité à contrôler leurs réactions à la déception et à l'insécurité. L'autorégulation aide à garder un sens de l'équilibre, de l'ordre et du progrès dans la vie. L'autorégulation peut être considérée comme une ressource qui peut être épuisée et épuisée. Une métaphore utile peut être que l'autorégulation agit comme un muscle, qui peut être épuisé par un effort excessif ou renforcé par une pratique régulière.");
	private String description;
	private TEMPERANCE(String description) {  
        this.description = description ;  
   }  
     
    public String getDescription() {  
        return  this.description ;  
   }
	
}
