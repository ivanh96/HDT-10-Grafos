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
		
		 File rute = new File("C:\\Users\\Fredo\\Documents\\Neo4j\\datos"); //CAMBIAR RUTA EN OTRA PC
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
			 P1_to_P2.setProperty("Correos enviados", 3);
			 
			// A Persona_3
			 Relationship P1_to_P3 = Persona_1.createRelationshipTo(Persona_3, RelationType.Mails);
			 P1_to_P3.setProperty("Correos enviados", 2);
			 
			// A Persona_9
			 Relationship P1_to_P9 = Persona_1.createRelationshipTo(Persona_9, RelationType.Mails);
			 P1_to_P9.setProperty("Correos enviados", 6);
			 
			// A Persona_14
			 Relationship P1_to_P14 = Persona_1.createRelationshipTo(Persona_14, RelationType.Mails);
			 P1_to_P14.setProperty("Correos enviados", 1);
			 

			 /* *************************** PERSONA 2 *************************************** */
			
			 // A Persona_1
			 Relationship P2_to_P1 = Persona_2.createRelationshipTo(Persona_1, RelationType.Mails);
			 P2_to_P1.setProperty("Correos enviados", 5);
			 
			// A Persona_3
			 Relationship P2_to_P3 = Persona_2.createRelationshipTo(Persona_3, RelationType.Mails);
			 P2_to_P3.setProperty("Correos enviados", 8);
			 
			// A Persona_4
			 Relationship P2_to_P4 = Persona_2.createRelationshipTo(Persona_4, RelationType.Mails);
			 P2_to_P4.setProperty("Correos enviados", 2);
			 
			// A Persona_12
			 Relationship P2_to_P12 = Persona_2.createRelationshipTo(Persona_12, RelationType.Mails);
			 P2_to_P12.setProperty("Correos enviados", 1);
			 
			 /* *************************** PERSONA 3 *************************************** */
			
			 // A Persona_1
			 Relationship P3_to_P1 = Persona_3.createRelationshipTo(Persona_1, RelationType.Mails);
			 P3_to_P1.setProperty("Correos enviados", 5);
			  
			 // A Persona_4
			 Relationship P3_to_P4 = Persona_3.createRelationshipTo(Persona_4, RelationType.Mails);
			 P3_to_P4.setProperty("Correos enviados", 2);
			 
			 /* *************************** PERSONA 4 *************************************** */
			
			 // A Persona_5
			 Relationship P4_to_P5 = Persona_4.createRelationshipTo(Persona_5, RelationType.Mails);
			 P4_to_P5.setProperty("Correos enviados", 5);
			 
			 // A Persona_6
			 Relationship P4_to_P6 = Persona_4.createRelationshipTo(Persona_6, RelationType.Mails);
			 P4_to_P6.setProperty("Correos enviados", 7);
			 
			 // A Persona_11
			 Relationship P4_to_P11 = Persona_4.createRelationshipTo(Persona_11, RelationType.Mails);
			 P4_to_P11.setProperty("Correos enviados", 2);
			 
			 // A Persona_13
			 Relationship P4_to_P13 = Persona_4.createRelationshipTo(Persona_13, RelationType.Mails);
			 P4_to_P13.setProperty("Correos enviados", 3);
			 
			 // A Persona_14
			 Relationship P4_to_P14 = Persona_4.createRelationshipTo(Persona_14, RelationType.Mails);
			 P4_to_P14.setProperty("Correos enviados", 7);
			 
			 /* *************************** PERSONA 5 *************************************** */
			 
			 // A Persona_4
			 Relationship P5_to_P4 = Persona_5.createRelationshipTo(Persona_4, RelationType.Mails);
			 P5_to_P4.setProperty("Correos enviados", 2);
			 
			 // A Persona_6
			 Relationship P5_to_P6 = Persona_5.createRelationshipTo(Persona_6, RelationType.Mails);
			 P5_to_P6.setProperty("Correos enviados", 6);
			 
			 // A Persona_11
			 Relationship P5_to_P11 = Persona_5.createRelationshipTo(Persona_11, RelationType.Mails);
			 P5_to_P11.setProperty("Correos enviados", 4);
			 
			 // A Persona_12
			 Relationship P5_to_P12 = Persona_5.createRelationshipTo(Persona_12, RelationType.Mails);
			 P5_to_P12.setProperty("Correos enviados", 3);
			 
			 // A Persona_13
			 Relationship P5_to_P13 = Persona_5.createRelationshipTo(Persona_13, RelationType.Mails);
			 P5_to_P13.setProperty("Correos enviados", 7);
			 
			 // A Persona_14
			 Relationship P5_to_P14 = Persona_5.createRelationshipTo(Persona_14, RelationType.Mails);
			 P5_to_P14.setProperty("Correos enviados", 9);
			 
			 /* *************************** PERSONA 6 *************************************** */
			 
			 // A Persona_4
			 Relationship P6_to_P4 = Persona_6.createRelationshipTo(Persona_4, RelationType.Mails);
			 P6_to_P4.setProperty("Correos enviados", 6);
			 
			 // A Persona_5
			 Relationship P6_to_P5 = Persona_6.createRelationshipTo(Persona_5, RelationType.Mails);
			 P6_to_P5.setProperty("Correos enviados", 2);
			 
			 // A Persona_12
			 Relationship P6_to_P12 = Persona_6.createRelationshipTo(Persona_12, RelationType.Mails);
			 P6_to_P12.setProperty("Correos enviados", 7);
			 
			 // A Persona_13
			 Relationship P6_to_P13 = Persona_6.createRelationshipTo(Persona_13, RelationType.Mails);
			 P6_to_P13.setProperty("Correos enviados", 7);
			 
			 /* *************************** PERSONA 7 *************************************** */
			 
			 // A Persona_8
			 Relationship P7_to_P8 = Persona_7.createRelationshipTo(Persona_8, RelationType.Mails);
			 P7_to_P8.setProperty("Correos enviados", 12);
			 
			 // A Persona_9
			 Relationship P7_to_P9 = Persona_7.createRelationshipTo(Persona_9, RelationType.Mails);
			 P7_to_P9.setProperty("Correos enviados", 13);
			 
			 // A Persona_11
			 Relationship P7_to_P11 = Persona_7.createRelationshipTo(Persona_11, RelationType.Mails);
			 P7_to_P11.setProperty("Correos enviados", 1);
			 
			 /* *************************** PERSONA 8 *************************************** */
			 
			 // A Persona_6
			 Relationship P8_to_P6 = Persona_8.createRelationshipTo(Persona_6, RelationType.Mails);
			 P8_to_P6.setProperty("Correos enviados", 3);
			 
			 // A Persona_7
			 Relationship P8_to_P7 = Persona_8.createRelationshipTo(Persona_7, RelationType.Mails);
			 P8_to_P7.setProperty("Correos enviados", 14);
			 
			 // A Persona_9
			 Relationship P8_to_P9 = Persona_8.createRelationshipTo(Persona_9, RelationType.Mails);
			 P8_to_P9.setProperty("Correos enviados", 21);
			 
			 // A Persona_10
			 Relationship P8_to_P10 = Persona_8.createRelationshipTo(Persona_10, RelationType.Mails);
			 P8_to_P10.setProperty("Correos enviados", 2);
			 
			 /* *************************** PERSONA 9 *************************************** */
			 
			 // A Persona_5
			 Relationship P9_to_P5 = Persona_9.createRelationshipTo(Persona_5, RelationType.Mails);
			 P9_to_P5.setProperty("Correos enviados", 4);
			 
			 // A Persona_7
			 Relationship P9_to_P7 = Persona_9.createRelationshipTo(Persona_7, RelationType.Mails);
			 P9_to_P7.setProperty("Correos enviados", 12);
			 
			 // A Persona_8
			 Relationship P9_to_P8 = Persona_9.createRelationshipTo(Persona_8, RelationType.Mails);
			 P9_to_P8.setProperty("Correos enviados", 23);
			 
			 /* *************************** PERSONA 10 *************************************** */
			 
			 // A Persona_4
			 Relationship P10_to_P4 = Persona_10.createRelationshipTo(Persona_4, RelationType.Mails);
			 P10_to_P4.setProperty("Correos enviados", 9);
			 
			 // A Persona_5
			 Relationship P10_to_P5 = Persona_10.createRelationshipTo(Persona_5, RelationType.Mails);
			 P10_to_P5.setProperty("Correos enviados", 7);
			 
			 // A Persona_6
			 Relationship P10_to_P6 = Persona_10.createRelationshipTo(Persona_6, RelationType.Mails);
			 P10_to_P6.setProperty("Correos enviados", 1);
			 
			 // A Persona_7
			 Relationship P10_to_P7 = Persona_10.createRelationshipTo(Persona_7, RelationType.Mails);
			 P10_to_P7.setProperty("Correos enviados", 1);
			 
			 // A Persona_11
			 Relationship P10_to_P11 = Persona_10.createRelationshipTo(Persona_11, RelationType.Mails);
			 P10_to_P11.setProperty("Correos enviados", 5);
			 
			 // A Persona_12
			 Relationship P10_to_P12 = Persona_10.createRelationshipTo(Persona_12, RelationType.Mails);
			 P10_to_P12.setProperty("Correos enviados", 4);
			 
			 // A Persona_13
			 Relationship P10_to_P13 = Persona_10.createRelationshipTo(Persona_13, RelationType.Mails);
			 P10_to_P13.setProperty("Correos enviados", 8);
			 
			 // A Persona_14
			 Relationship P10_to_P14 = Persona_10.createRelationshipTo(Persona_14, RelationType.Mails);
			 P10_to_P14.setProperty("Correos enviados", 7);
			 
			 /* *************************** PERSONA 11 *************************************** */
			 
			 // A Persona_4
			 Relationship P11_to_P4 = Persona_11.createRelationshipTo(Persona_4, RelationType.Mails);
			 P11_to_P4.setProperty("Correos enviados", 4);
			 
			 // A Persona_6
			 Relationship P11_to_P6 = Persona_11.createRelationshipTo(Persona_6, RelationType.Mails);
			 P11_to_P6.setProperty("Correos enviados", 1);
			 
			 // A Persona_10
			 Relationship P11_to_P10 = Persona_11.createRelationshipTo(Persona_10, RelationType.Mails);
			 P11_to_P10.setProperty("Correos enviados", 1);
			 
			 // A Persona_13
			 Relationship P11_to_P13 = Persona_11.createRelationshipTo(Persona_13, RelationType.Mails);
			 P11_to_P13.setProperty("Correos enviados", 9);
			 
			 // A Persona_14
			 Relationship P11_to_P14 = Persona_11.createRelationshipTo(Persona_14, RelationType.Mails);
			 P11_to_P14.setProperty("Correos enviados", 1);
			 
			 /* *************************** PERSONA 12 *************************************** */
			 
			 // A Persona_4
			 Relationship P12_to_P4 = Persona_12.createRelationshipTo(Persona_4, RelationType.Mails);
			 P12_to_P4.setProperty("Correos enviados", 4);
			 
			 // A Persona_5
			 Relationship P12_to_P5 = Persona_12.createRelationshipTo(Persona_5, RelationType.Mails);
			 P12_to_P5.setProperty("Correos enviados", 4);
			 
			 // A Persona_6
			 Relationship P12_to_P6 = Persona_12.createRelationshipTo(Persona_6, RelationType.Mails);
			 P12_to_P6.setProperty("Correos enviados", 9);
			 
			 // A Persona_10
			 Relationship P12_to_P10 = Persona_12.createRelationshipTo(Persona_10, RelationType.Mails);
			 P12_to_P10.setProperty("Correos enviados", 2);
			 
			 // A Persona_11
			 Relationship P12_to_P11 = Persona_12.createRelationshipTo(Persona_11, RelationType.Mails);
			 P12_to_P11.setProperty("Correos enviados", 4);
			 
			 // A Persona_13
			 Relationship P12_to_P13 = Persona_12.createRelationshipTo(Persona_13, RelationType.Mails);
			 P12_to_P13.setProperty("Correos enviados", 8);
			 
			 // A Persona_14
			 Relationship P12_to_P14 = Persona_12.createRelationshipTo(Persona_14, RelationType.Mails);
			 P12_to_P14.setProperty("Correos enviados", 9);
			 
			 /* *************************** PERSONA 13 *************************************** */
			 
			 // A Persona_4
			 Relationship P13_to_P4 = Persona_13.createRelationshipTo(Persona_4, RelationType.Mails);
			 P13_to_P4.setProperty("Correos enviados", 1);
			 
			 // A Persona_5
			 Relationship P13_to_P5 = Persona_13.createRelationshipTo(Persona_5, RelationType.Mails);
			 P13_to_P5.setProperty("Correos enviados", 3);
			 
			 // A Persona_10
			 Relationship P13_to_P10 = Persona_13.createRelationshipTo(Persona_10, RelationType.Mails);
			 P13_to_P10.setProperty("Correos enviados", 2);
			 
			 // A Persona_11
			 Relationship P13_to_P11 = Persona_13.createRelationshipTo(Persona_11, RelationType.Mails);
			 P13_to_P11.setProperty("Correos enviados", 3);
			 
			 // A Persona_12
			 Relationship P13_to_P12 = Persona_13.createRelationshipTo(Persona_12, RelationType.Mails);
			 P13_to_P12.setProperty("Correos enviados", 2);
			 
			 /* *************************** PERSONA 14 (finally :O ) *************************************** */
			 
			 // A Persona_4
			 Relationship P14_to_P4 = Persona_14.createRelationshipTo(Persona_4, RelationType.Mails);
			 P14_to_P4.setProperty("Correos enviados", 7);
			 
			 // A Persona_10
			 Relationship P14_to_P10 = Persona_14.createRelationshipTo(Persona_10, RelationType.Mails);
			 P14_to_P10.setProperty("Correos enviados", 6);
			 
			 // A Persona_11
			 Relationship P14_to_P11 = Persona_14.createRelationshipTo(Persona_11, RelationType.Mails);
			 P14_to_P11.setProperty("Correos enviados", 8);
			 
			 // A Persona_12
			 Relationship P14_to_P12 = Persona_14.createRelationshipTo(Persona_12, RelationType.Mails);
			 P14_to_P12.setProperty("Correos enviados", 3);
			 
			 tx.success();
			 
		 }
		 
		 dbService.shutdown(); //se apaga la base de datos
		 
	 }

}
