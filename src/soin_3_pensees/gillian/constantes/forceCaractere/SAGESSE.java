package soin_3_pensees.gillian.constantes.forceCaractere;

public enum SAGESSE
{
     Créativité("La créativité, c'est penser à de nouvelles façons de faire les choses. \n Il s'agit de produire des idées ou des comportements originaux. Cependant, l'originalité ne suffit pas : tout ce qui est créé, qu'il s'agisse d'une idée ou d'un produit, doit aussi être utile ou adaptable. \n Par exemple, vous pourriez écrire un article de blog qui est unique parce qu'il est entièrement charabia. \n Cela ne va pas être utile, donc ce ne serait pas considéré comme créatif.\r\n"
     		+ "\r\n"
     		+ "Il y a deux composantes essentielles à la créativité : l'originalité et l'adaptabilité. \n Un individu créatif génère des idées ou des comportements qui sont nouveaux ou inhabituels et ceux-ci apportent une contribution positive à la vie de l'individu ou à la vie d'autres groupes)."), 
     Curiosité("Être curieux, c'est explorer et découvrir, s'intéresser à l'expérience en cours pour elle-même. La curiosité est souvent décrite comme une recherche de nouveauté et une ouverture à l'expérience, et elle est associée au désir naturel d'acquérir des connaissances. Il est gratifiant de cheminer vers une réponse, de s'engager dans une nouvelle expérience ou d'apprendre un nouveau fait. Aller dans un nouveau restaurant, visiter une nouvelle ville, rencontrer une nouvelle personne dans votre classe ou effectuer une recherche en ligne pour une question peuvent chacun répondre à votre quête de nouvelles expériences et de nouvelles informations.\r\n"
     		+ "\r\n"
     		+ "Les personnes curieuses ont deux éléments clés : elles sont intéressées à explorer de nouvelles idées, activités et expériences, et elles ont également un fort désir d'accroître leurs propres connaissances personnelles."), 
     Jugement("Le jugement implique de faire des choix rationnels et logiques et d'évaluer analytiquement les idées, les opinions et les faits. Pour utiliser un terme qui vient à l'origine de l'extérieur du domaine du personnage : c'est la pensée critique, peser les preuves équitablement, réfléchir et examiner les preuves de tous les côtés plutôt que de sauter aux conclusions. Le jugement implique également d'être ouvert d'esprit et capable de changer d'avis à la lumière des preuves, en restant ouvert à d'autres arguments et perspectives. Il devrait être clair à ce stade que le jugement est une «force de la tête» essentielle - c'est une force de caractère très axée sur la réflexion.\r\n"
     		+ "\r\n"
     		+ "La force du jugement est une force corrective en ce sens qu'elle neutralise les pensées erronées, telles que favoriser vos opinions actuelles ou favoriser des idées considérées comme dominantes, et donc accorder moins d'attention à la vue la moins dominante. C'est la volonté de rechercher activement des preuves contre vos croyances, plans ou objectifs préférés et de peser équitablement toutes les preuves lorsqu'elles sont disponibles."),
     LamourDApprendre("L'amour d'apprendre signifie une passion pour l'apprentissage, un désir d'apprendre juste pour apprendre. En fait, la curiosité et l'amour de l'apprentissage sont parmi les forces les plus étroitement liées dans la classification VIA. Ils peuvent tout de même être distingués. Alors que la curiosité est la force motrice qui vous amène à rechercher de nouvelles informations, l'amour de l'apprentissage fait référence au désir de conserver et d'approfondir ces informations. La personne curieuse est motivée par la poursuite de la connaissance ; la personne qui aime apprendre est motivée par l'expansion de son fonds de connaissances. Là où la curiosité est souvent associée à beaucoup d'énergie et à la volonté de recueillir des informations, l'amateur d'apprendre est souvent plus contemplatif. L'amour de l'apprentissage décrit la manière dont une personne engage de nouvelles informations et compétences. L'amour de l'apprentissage est une force que les enseignants aimeraient voir chez leurs élèves, que les parents veulent encourager chez leurs enfants, que les thérapeutes soutiennent leurs clients et que les employeurs essaient de favoriser chez leurs employés. Elle a des conséquences importantes sur la motivation car elle aide les gens à persévérer à travers les défis, les revers et les commentaires négatifs."), 
     Perspective("La perspective signifie la capacité de voir la situation dans son ensemble dans la vie. La perspective consiste à pouvoir voir la forêt ainsi que les arbres, pour éviter de se perdre dans les petits détails lorsqu'il y a des problèmes plus importants à prendre en compte. Tout en écoutant les autres, la perspective vous aide à réfléchir simultanément aux leçons de vie, à la bonne conduite et à ce qui convient le mieux à la situation discutée. Cette capacité à considérer les systèmes dans leur ensemble, ou à penser en termes généraux, vous aide à offrir de bons conseils. La perspective est distincte de l'intelligence mais représente un niveau élevé de connaissances, la capacité de donner des conseils et de reconnaître et de peser plusieurs côtés avant de prendre des décisions. Il permet à l'individu d'aborder des questions importantes sur la conduite et le sens de la vie");
	
	private String description;
	private SAGESSE(String description) {  
        this.description = description ;  
   }  
     
    public String getDescription() {  
        return  this.description ;  
   }  
}