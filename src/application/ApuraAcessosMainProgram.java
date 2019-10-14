package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import model.entities.LogAcessos;

public class ApuraAcessosMainProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Set<LogAcessos> logs = new HashSet<>();
		System.out.print("Informe o nome do arquivo:");
		String path = sc.next();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			String[] campos = null;
			while (linha != null) {
				 campos = linha.split(" ");
				String nome = campos[0];
				Date acesso = Date.from(Instant.parse(campos[1]));
				
				logs.add(new LogAcessos(nome, acesso));
				linha = br.readLine();
			}
			System.out.println("Total de Usuários Distintos que acessaram o Site: " + logs.size());
			for (LogAcessos log : logs) {
				System.out.println(log.getNome() + " - " + log.getDataAcesso());
				
			}
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
		

	}

}
