package aps02;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LerArquivoCSV {

	public static void main(String[] args) throws IOException {
		
		
		     LerArquivoCSV CSV = new LerArquivoCSV();
		          CSV.procura();
		
		
	    }
	    
	public void procura() {
 String csvArquivo = "C:/Users/mathe/workspace/aps02/src/aps02/participantes.csv";
		 
		 BufferedReader conteudoCSV = null;
		 
		 String linha = "";
		 
		 String separador = ",";
		 
		 try{
	            
	          conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
	            
	            
	            while((linha = conteudoCSV.readLine()) != null){
	            
	                String[] ContatoPart = linha.split(separador);
	                
	                Participante parts = new Participante(ContatoPart[ContatoPart.length - 2],ContatoPart[ContatoPart.length - 2]);
	                
	                System.out.println("Nome" + parts.getNome() + "Email" + parts.getEmail());
	            }
	        
	        }catch(FileNotFoundException e){
	        	System.out.println("Arquivo não encontrado: \n "+ e.getMessage());
	            
	        }
		 
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("IndexOutOfBounds: \n "+ e.getMessage());
		 }
		 
		 catch(IOException e) {
			 System.out.println("IO erro: \n "+ e.getMessage());
		 }
		 
		 finally {
			 if (conteudoCSV != null) {
				 try {
					 conteudoCSV.close();
				 } catch (IOException e) {
					 System.out.println("IO erro: \n "+ e.getMessage());
				 }
			 }
		 }
	}


	}