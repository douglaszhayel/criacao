package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("digite o nome do arquivo txt");
		String arquivo = sc.nextLine();
		String path = "C:\\temp\\"+arquivo+".txt"  ;
		boolean saida = false;
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			while(saida==false){
				System.out.println("digite a proxima linha ");
				String lines = sc.next();	
				bw.write(lines);
				bw.newLine();
				System.out.print("deseja sair ? s/n");
				String resposta = sc.next();
				if(resposta.equals("s")) {
					saida = true;
				}
								
			}
			
		}
        catch(IOException e) {
        	e.printStackTrace();
        }
		sc.close();
        }

}
