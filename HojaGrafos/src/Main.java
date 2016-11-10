import java.io.File;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.RelationshipType;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class Main {
	
	/* Esta clase crea la base de datos y le llena con la informacion del csv 
	 * El codigo de esta clase esta inspirado por un ejemplo posteado en: http://stackoverflow.com/questions/32138194/configure-neo4j-with-java*/
	
	/* Atributos */
	public enum NodeType implements Label{
		Persona;
	}
	
	public enum RelationType implements RelationshipType{
		Mails;
	}
	
	//Inicio main method
	
	 public static void main(String[] args) {
		
		 File rute = new File("/Users/MacBookPro/Documents/Neo4j/datos"); //CAMBIAR RUTA EN OTRA PC
		 GraphDatabaseFactory dbFactory = new GraphDatabaseFactory();
		 GraphDatabaseService dbService = dbFactory.newEmbeddedDatabase(rute);
		 
		 /* Se inicia la insercion de datos con try catch para manejo de fallos */
		 
		 try (Transaction tx = dbService.beginTx()){
			 
			 /* Nodos para Personas */
			 
			 //Persona 1
			 Node Persona_1 = dbService.createNode(NodeType.Persona);
			 Persona_1.setProperty("Nombre", "Persona 1");
			 Persona_1.setProperty("ID", 1);
			 
			//Persona 2
			 Node Persona_2 = dbService.createNode(NodeType.Persona);
			 Persona_2.setProperty("Nombre", "Persona 2");
			 Persona_2.setProperty("ID", 2);
			 
			//Persona 3
			 Node Persona_3 = dbService.createNode(NodeType.Persona);
			 Persona_3.setProperty("Nombre", "Persona 3");
			 Persona_3.setProperty("ID", 3);
			 
			//Persona 4
			 Node Persona_4 = dbService.createNode(NodeType.Persona);
			 Persona_4.setProperty("Nombre", "Persona 4");
			 Persona_4.setProperty("ID", 4);
			 
			//Persona 5
			 Node Persona_5 = dbService.createNode(NodeType.Persona);
			 Persona_5.setProperty("Nombre", "Persona 5");
			 Persona_5.setProperty("ID", 5);
			 
			//Persona 6
			 Node Persona_6 = dbService.createNode(NodeType.Persona);
			 Persona_6.setProperty("Nombre", "Persona 6");
			 Persona_6.setProperty("ID", 6);
			 
			//Persona 7
			 Node Persona_7 = dbService.createNode(NodeType.Persona);
			 Persona_7.setProperty("Nombre", "Persona 7");
			 Persona_7.setProperty("ID", 7);
			 
			//Persona 8
			 Node Persona_8 = dbService.createNode(NodeType.Persona);
			 Persona_8.setProperty("Nombre", "Persona 8");
			 Persona_8.setProperty("ID", 8);
			 
			//Persona 9
			 Node Persona_9 = dbService.createNode(NodeType.Persona);
			 Persona_9.setProperty("Nombre", "Persona 9");
			 Persona_9.setProperty("ID", 9);
			 
			//Persona 10
			 Node Persona_10 = dbService.createNode(NodeType.Persona);
			 Persona_10.setProperty("Nombre", "Persona 10");
			 Persona_10.setProperty("ID", 10);
			 
			//Persona 11
			 Node Persona_11 = dbService.createNode(NodeType.Persona);
			 Persona_11.setProperty("Nombre", "Persona 11");
			 Persona_11.setProperty("ID", 11);
			 
			//Persona 12
			 Node Persona_12 = dbService.createNode(NodeType.Persona);
			 Persona_12.setProperty("Nombre", "Persona 12");
			 Persona_12.setProperty("ID", 12);
			 
			//Persona 13
			 Node Persona_13 = dbService.createNode(NodeType.Persona);
			 Persona_13.setProperty("Nombre", "Persona 13");
			 Persona_13.setProperty("ID", 13);
			 
			//Persona 14
			 Node Persona_14 = dbService.createNode(NodeType.Persona);
			 Persona_14.setProperty("Nombre", "Persona 14");
			 Persona_14.setProperty("ID", 14);
			 
			 /* Se define la cantidad de correos que se han enviado entre ellos */
			 
			 /* *************************** PERSONA 1 *************************************** */
			 
			 // A Persona_2
			 Relationship P1_to_P2 = Persona_1.createRelationshipTo(Persona_2, RelationType.Mails);
			 P1_to_P2.setProperty("Emails", 3);
			 
			// A Persona_3
			 Relationship P1_to_P3 = Persona_1.createRelationshipTo(Persona_3, RelationType.Mails);
			 P1_to_P3.setProperty("Emails", 2);
			 
			// A Persona_9
			 Relationship P1_to_P9 = Persona_1.createRelationshipTo(Persona_9, RelationType.Mails);
			 P1_to_P9.setProperty("Emails", 6);
			 
			// A Persona_14
			 Relationship P1_to_P14 = Persona_1.createRelationshipTo(Persona_14, RelationType.Mails);
			 P1_to_P14.setProperty("Emails", 1);
			 

			 /* *************************** PERSONA 2 *************************************** */
			
			 // A Persona_1
			 Relationship P2_to_P1 = Persona_2.createRelationshipTo(Persona_1, RelationType.Mails);
			 P2_to_P1.setProperty("Emails", 5);
			 
			// A Persona_3
			 Relationship P2_to_P3 = Persona_2.createRelationshipTo(Persona_3, RelationType.Mails);
			 P2_to_P3.setProperty("Emails", 8);
			 
			// A Persona_4
			 Relationship P2_to_P4 = Persona_2.createRelationshipTo(Persona_4, RelationType.Mails);
			 P2_to_P4.setProperty("Emails", 2);
			 
			// A Persona_12
			 Relationship P2_to_P12 = Persona_2.createRelationshipTo(Persona_12, RelationType.Mails);
			 P2_to_P12.setProperty("Emails", 1);
			 
			 /* *************************** PERSONA 3 *************************************** */
			
			 // A Persona_1
			 Relationship P3_to_P1 = Persona_3.createRelationshipTo(Persona_1, RelationType.Mails);
			 P3_to_P1.setProperty("Emails", 5);
			  
			 // A Persona_4
			 Relationship P3_to_P4 = Persona_3.createRelationshipTo(Persona_4, RelationType.Mails);
			 P3_to_P4.setProperty("Emails", 2);
			 
			 /* *************************** PERSONA 4 *************************************** */
			
			 // A Persona_5
			 Relationship P4_to_P5 = Persona_4.createRelationshipTo(Persona_5, RelationType.Mails);
			 P4_to_P5.setProperty("Emails", 5);
			 
			 // A Persona_6
			 Relationship P4_to_P6 = Persona_4.createRelationshipTo(Persona_6, RelationType.Mails);
			 P4_to_P6.setProperty("Emails", 7);
			 
			 // A Persona_11
			 Relationship P4_to_P11 = Persona_4.createRelationshipTo(Persona_11, RelationType.Mails);
			 P4_to_P11.setProperty("Emails", 2);
			 
			 // A Persona_13
			 Relationship P4_to_P13 = Persona_4.createRelationshipTo(Persona_13, RelationType.Mails);
			 P4_to_P13.setProperty("Emails", 3);
			 
			 // A Persona_14
			 Relationship P4_to_P14 = Persona_4.createRelationshipTo(Persona_14, RelationType.Mails);
			 P4_to_P14.setProperty("Emails", 7);
			 
			 /* *************************** PERSONA 5 *************************************** */
			 
			 // A Persona_4
			 Relationship P5_to_P4 = Persona_5.createRelationshipTo(Persona_4, RelationType.Mails);
			 P5_to_P4.setProperty("Emails", 2);
			 
			 // A Persona_6
			 Relationship P5_to_P6 = Persona_5.createRelationshipTo(Persona_6, RelationType.Mails);
			 P5_to_P6.setProperty("Emails", 6);
			 
			 // A Persona_11
			 Relationship P5_to_P11 = Persona_5.createRelationshipTo(Persona_11, RelationType.Mails);
			 P5_to_P11.setProperty("Emails", 4);
			 
			 // A Persona_12
			 Relationship P5_to_P12 = Persona_5.createRelationshipTo(Persona_12, RelationType.Mails);
			 P5_to_P12.setProperty("Emails", 3);
			 
			 // A Persona_13
			 Relationship P5_to_P13 = Persona_5.createRelationshipTo(Persona_13, RelationType.Mails);
			 P5_to_P13.setProperty("Emails", 7);
			 
			 // A Persona_14
			 Relationship P5_to_P14 = Persona_5.createRelationshipTo(Persona_14, RelationType.Mails);
			 P5_to_P14.setProperty("Emails", 9);
			 
			 /* *************************** PERSONA 6 *************************************** */
			 
			 // A Persona_4
			 Relationship P6_to_P4 = Persona_6.createRelationshipTo(Persona_4, RelationType.Mails);
			 P6_to_P4.setProperty("Emails", 6);
			 
			 // A Persona_5
			 Relationship P6_to_P5 = Persona_6.createRelationshipTo(Persona_5, RelationType.Mails);
			 P6_to_P5.setProperty("Emails", 2);
			 
			 // A Persona_12
			 Relationship P6_to_P12 = Persona_6.createRelationshipTo(Persona_12, RelationType.Mails);
			 P6_to_P12.setProperty("Emails", 7);
			 
			 // A Persona_13
			 Relationship P6_to_P13 = Persona_6.createRelationshipTo(Persona_13, RelationType.Mails);
			 P6_to_P13.setProperty("Emails", 7);
			 
			 /* *************************** PERSONA 7 *************************************** */
			 
			 // A Persona_8
			 Relationship P7_to_P8 = Persona_7.createRelationshipTo(Persona_8, RelationType.Mails);
			 P7_to_P8.setProperty("Emails", 12);
			 
			 // A Persona_9
			 Relationship P7_to_P9 = Persona_7.createRelationshipTo(Persona_9, RelationType.Mails);
			 P7_to_P9.setProperty("Emails", 13);
			 
			 // A Persona_11
			 Relationship P7_to_P11 = Persona_7.createRelationshipTo(Persona_11, RelationType.Mails);
			 P7_to_P11.setProperty("Emails", 1);
			 
			 /* *************************** PERSONA 8 *************************************** */
			 
			 // A Persona_6
			 Relationship P8_to_P6 = Persona_8.createRelationshipTo(Persona_6, RelationType.Mails);
			 P8_to_P6.setProperty("Emails", 3);
			 
			 // A Persona_7
			 Relationship P8_to_P7 = Persona_8.createRelationshipTo(Persona_7, RelationType.Mails);
			 P8_to_P7.setProperty("Emails", 14);
			 
			 // A Persona_9
			 Relationship P8_to_P9 = Persona_8.createRelationshipTo(Persona_9, RelationType.Mails);
			 P8_to_P9.setProperty("Emails", 21);
			 
			 // A Persona_10
			 Relationship P8_to_P10 = Persona_8.createRelationshipTo(Persona_10, RelationType.Mails);
			 P8_to_P10.setProperty("Emails", 2);
			 
			 /* *************************** PERSONA 9 *************************************** */
			 
			 // A Persona_5
			 Relationship P9_to_P5 = Persona_9.createRelationshipTo(Persona_5, RelationType.Mails);
			 P9_to_P5.setProperty("Emails", 4);
			 
			 // A Persona_7
			 Relationship P9_to_P7 = Persona_9.createRelationshipTo(Persona_7, RelationType.Mails);
			 P9_to_P7.setProperty("Emails", 12);
			 
			 // A Persona_8
			 Relationship P9_to_P8 = Persona_9.createRelationshipTo(Persona_8, RelationType.Mails);
			 P9_to_P8.setProperty("Emails", 23);
			 
			 /* *************************** PERSONA 10 *************************************** */
			 
			 // A Persona_4
			 Relationship P10_to_P4 = Persona_10.createRelationshipTo(Persona_4, RelationType.Mails);
			 P10_to_P4.setProperty("Emails", 9);
			 
			 // A Persona_5
			 Relationship P10_to_P5 = Persona_10.createRelationshipTo(Persona_5, RelationType.Mails);
			 P10_to_P5.setProperty("Emails", 7);
			 
			 // A Persona_6
			 Relationship P10_to_P6 = Persona_10.createRelationshipTo(Persona_6, RelationType.Mails);
			 P10_to_P6.setProperty("Emails", 1);
			 
			 // A Persona_7
			 Relationship P10_to_P7 = Persona_10.createRelationshipTo(Persona_7, RelationType.Mails);
			 P10_to_P7.setProperty("Emails", 1);
			 
			 // A Persona_11
			 Relationship P10_to_P11 = Persona_10.createRelationshipTo(Persona_11, RelationType.Mails);
			 P10_to_P11.setProperty("Emails", 5);
			 
			 // A Persona_12
			 Relationship P10_to_P12 = Persona_10.createRelationshipTo(Persona_12, RelationType.Mails);
			 P10_to_P12.setProperty("Emails", 4);
			 
			 // A Persona_13
			 Relationship P10_to_P13 = Persona_10.createRelationshipTo(Persona_13, RelationType.Mails);
			 P10_to_P13.setProperty("Emails", 8);
			 
			 // A Persona_14
			 Relationship P10_to_P14 = Persona_10.createRelationshipTo(Persona_14, RelationType.Mails);
			 P10_to_P14.setProperty("Emails", 7);
			 
			 /* *************************** PERSONA 11 *************************************** */
			 
			 // A Persona_4
			 Relationship P11_to_P4 = Persona_11.createRelationshipTo(Persona_4, RelationType.Mails);
			 P11_to_P4.setProperty("Emails", 4);
			 
			 // A Persona_6
			 Relationship P11_to_P6 = Persona_11.createRelationshipTo(Persona_6, RelationType.Mails);
			 P11_to_P6.setProperty("Emails", 1);
			 
			 // A Persona_10
			 Relationship P11_to_P10 = Persona_11.createRelationshipTo(Persona_10, RelationType.Mails);
			 P11_to_P10.setProperty("Emails", 1);
			 
			 // A Persona_13
			 Relationship P11_to_P13 = Persona_11.createRelationshipTo(Persona_13, RelationType.Mails);
			 P11_to_P13.setProperty("Emails", 9);
			 
			 // A Persona_14
			 Relationship P11_to_P14 = Persona_11.createRelationshipTo(Persona_14, RelationType.Mails);
			 P11_to_P14.setProperty("Emails", 1);
			 
			 /* *************************** PERSONA 12 *************************************** */
			 
			 // A Persona_4
			 Relationship P12_to_P4 = Persona_12.createRelationshipTo(Persona_4, RelationType.Mails);
			 P12_to_P4.setProperty("Emails", 4);
			 
			 // A Persona_5
			 Relationship P12_to_P5 = Persona_12.createRelationshipTo(Persona_5, RelationType.Mails);
			 P12_to_P5.setProperty("Emails", 4);
			 
			 // A Persona_6
			 Relationship P12_to_P6 = Persona_12.createRelationshipTo(Persona_6, RelationType.Mails);
			 P12_to_P6.setProperty("Emails", 9);
			 
			 // A Persona_10
			 Relationship P12_to_P10 = Persona_12.createRelationshipTo(Persona_10, RelationType.Mails);
			 P12_to_P10.setProperty("Emails", 2);
			 
			 // A Persona_11
			 Relationship P12_to_P11 = Persona_12.createRelationshipTo(Persona_11, RelationType.Mails);
			 P12_to_P11.setProperty("Emails", 4);
			 
			 // A Persona_13
			 Relationship P12_to_P13 = Persona_12.createRelationshipTo(Persona_13, RelationType.Mails);
			 P12_to_P13.setProperty("Emails", 8);
			 
			 // A Persona_14
			 Relationship P12_to_P14 = Persona_12.createRelationshipTo(Persona_14, RelationType.Mails);
			 P12_to_P14.setProperty("Emails", 9);
			 
			 /* *************************** PERSONA 13 *************************************** */
			 
			 // A Persona_4
			 Relationship P13_to_P4 = Persona_13.createRelationshipTo(Persona_4, RelationType.Mails);
			 P13_to_P4.setProperty("Emails", 1);
			 
			 // A Persona_5
			 Relationship P13_to_P5 = Persona_13.createRelationshipTo(Persona_5, RelationType.Mails);
			 P13_to_P5.setProperty("Emails", 3);
			 
			 // A Persona_10
			 Relationship P13_to_P10 = Persona_13.createRelationshipTo(Persona_10, RelationType.Mails);
			 P13_to_P10.setProperty("Emails", 2);
			 
			 // A Persona_11
			 Relationship P13_to_P11 = Persona_13.createRelationshipTo(Persona_11, RelationType.Mails);
			 P13_to_P11.setProperty("Emails", 3);
			 
			 // A Persona_12
			 Relationship P13_to_P12 = Persona_13.createRelationshipTo(Persona_12, RelationType.Mails);
			 P13_to_P12.setProperty("Emails", 2);
			 
			 /* *************************** PERSONA 14 (finally :O ) *************************************** */
			 
			 // A Persona_4
			 Relationship P14_to_P4 = Persona_14.createRelationshipTo(Persona_4, RelationType.Mails);
			 P14_to_P4.setProperty("Emails", 7);
			 
			 // A Persona_10
			 Relationship P14_to_P10 = Persona_14.createRelationshipTo(Persona_10, RelationType.Mails);
			 P14_to_P10.setProperty("Emails", 6);
			 
			 // A Persona_11
			 Relationship P14_to_P11 = Persona_14.createRelationshipTo(Persona_11, RelationType.Mails);
			 P14_to_P11.setProperty("Emails", 8);
			 
			 // A Persona_12
			 Relationship P14_to_P12 = Persona_14.createRelationshipTo(Persona_12, RelationType.Mails);
			 P14_to_P12.setProperty("Emails", 3);


			 // Se hacen muestran todos los nodos y todas sus relaciones de emails
             resultado1 = graphDb.execute("MATCH (P1:Persona)-[E:Emails]->(P2:Persona) RETURN P1.Nombre");
             resultado2 = graphDb.execute("MATCH (P1:Persona)-[E:Emails]->(P2:Persona) RETURN P2.Nombre");
             resultado3 = graphDb.execute("MATCH (P1:Persona)-[E:Emails]->(P2:Persona) RETURN E.Emails");

             Iterator<String>r1 = resultado1.columnAs("P1.Nombre");
             Iterator<String>r2 = resultado2.columnAs("P2.Nombre");
             Iterator<String>r3 = resultado3.columnAs("E.Emails");
            
             // Se crean las listas para insertar los datos del iterador y se agregan los datos resultantes
			 LinkedList<String> res1 = new LinkedList();
             LinkedList<String> res2 = new LinkedList();
             LinkedList<Object> res3 = new LinkedList();

             while (r1.hasNext()){
                res1.add(r1.next());
             }
             while (r2.hasNext()){
                res2.add(r2.next());
             }
             while (r3.hasNext()){
                res3.add(r3.next());
             }
          
          	 // Se muestran la consulta de todos los correos enviados
             int site1 = res1.site();
             for(int i=0;i<site1;i++){
                System.out.println("La "+res1.get(i)+" envio "+res3.get(i)+" emails a la "+res2.get(i));
             }

             // Se muestra las personas con minimo 6 emails
             resultado4 = graphDb.execute("MATCH (P1:Persona)-[E:Emails]->(P2:Persona) WHERE C.Cantidad > 6 RETURN P1.Nombre");
             resultado5 = graphDb.execute("MATCH (P1:Persona)-[E:Emails]->(P2:Persona) WHERE C.Cantidad > 6 RETURN P2.Nombre");
             resultado6 = graphDb.execute("MATCH (P1:Persona)-[E:Emails]->(P2:Persona) WHERE C.Cantidad > 6 RETURN E.Emails");
            
             Iterator<String>r4=resultado4.columnAs("P1.Nombre");
             Iterator<String>r5=resultado5.columnAs("P2.Nombre");
             Iterator<String>r6=resultado6.columnAs("E.Emails");
            
             LinkedList<String> res4 = new LinkedList();
             LinkedList<String> res5 = new LinkedList();
             LinkedList<Object> res6 = new LinkedList();
            
             while (r4.hasNext()){
             res4.add(r4.next());
             }
             while (r5.hasNext()){
			 res5.add(r5.next());
             }
             while (r6.hasNext()){
             res6.add(r6.next());
             }
           
             int size1 = res4.size(); 
             for(int i=0;i<size1;i++){
             System.out.println("La "+res4.get(i)+" envio "+res6.get(i)+" emails a la "+res5.get(i));
             }

             // Se muestra las personas que mas se comunicaron y las que menos se comunicaron
             int[] tabla= new int[14];
             int[] orden= new int[tabla.length];
             int k=-1;

             for (int i=0; i<tabla.length; i++)
			 tabla[i]=graphDb.getNodeById(i).getDegree(Direction.BOTH);

             for (int i=0; i<tabla.length; i++){
			 int b1=0;
			 for(int j=0; j<tabla.length; j++){
			 int d= tabla[j];
             if (d>=b1){
			 b1=d;
			 k=j;
             }
			 }
             orden[i]=k;
             tabla[k]=0;
             } 
            
             System.out.println("Las tabla muestra las personas más comunicadas a las menos comunicadas: ");

             // Se imprime el nombre de las personas ya ordenado
             for(int t=0; t<tabla.length; t++){
			 System.out.println("Persona "+ (orden[t]+1));
             }


             // Se muestra la cantidad minima de emails enviados desde una persona origen
             Vector<Integer> vectorID= new Vector<>();
             Vector<Long> vectorEmails= new Vector<>();
             for(int i=0; i<196; i++){
             try{
			 Relationship rel= graphDb.getRelationshipById(i);
			 long emails = (long) rel.getProperty("Emails");
			 vectorID.addElement(i);
			 vectorEmails.addElement(emails); 
			 }catch(Exception e){
                    
             }
             }
        
             Scanner input= new Scanner(System.in);
             int indNodo;
             int finNodo;
        
             // Ingreso de la persona origen
             System.out.println("Ingrese el ID de la persona origen: ");
             indNodo = scan.nextInt() - 1;
             int iNodo = indNodo;
        
             // Ingreso de la persona destino
             System.out.println("Ingrese el ID de la persona destino: ");
             finNodo= scan.nextInt() - 1;
				
             // Valores temporales en arrays
             long[] nodos = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
             boolean[] temps ={null,null,null,null,null,null,null,null,null,null,null,null,null,null};
             int[] desde = new int[14];
			
             nodos[indNodo]=0;
             desde[indNodo]=indNodo;
			
             for(int t=0; t<14; t++){
             for(int i=0; i<vectorID.size(); i++){
			 Relationship relation = graphDb.getRelationshipById(vectorID.get(i));
			 int nA= (int)relation.getStartNode().getId();
			 int nB= (int)relation.getEndNode().getId();
			 long l1= (long) relation.getProperty("Emails");
                   
			 // Se almacenan temporalmente las relaciones entre los nodos
			 if(nA==indNodo){
			 if (nodos[nB]>(nodos[indNodo]+l1)){
			 nodos[nB]=nodos[indNodo]+l1;
			 desde[nB]=indNodo;
			 }
			 }
			 }
               
			 // Se busca el menor de los nodos 
			 long b= 10000;
			 int  m =-1;
			 for(int j=0; j<nodos.length; j++){
			 long d= nodos[j];
			 if(temps[j]==null){
			 if (d<=b){
			 b=d;
			 m=j;
			 }
			 }
             }
			 temps[m]=true;
			 indNodo=m;						
             } 
         

			 // Se busca para todos los nodos
             if (finNodo==-1){
			 for (int i=0; i<14; i++){
			 long nds= nodos[i];
			 if(nds==0)
			 System.out.println("La persona "+(iNodo+1)+" no ha mandado correos a la persona "+(i+1));
			 else	
			 System.out.println("La cantidad minima de emails enviados de la persona "+(iNodo+1)+" a la persona"+(i+1)+" son: "+nds);
             }
             }else{

			 // Dado un nodo destino 
			 long ndc=nodos[finNodo];
                
			 // Si la relacion nunca fue modificada
			 if(ndc==0)
			 System.out.println("La persona "+(iNodo+1)+" no ha mandado correos a la persona "+(finNodo+1));
			 else
			 System.out.println("La cantidad minima de correos enviados por la persona "+(iNodo+1)+" a la persona"+(finNodo+1)+" son: "+ndc);
             }
    
			 tx.success();
		 }
		 
		 dbService.shutdown(); //se apaga la base de datos
		 
	 }

}
