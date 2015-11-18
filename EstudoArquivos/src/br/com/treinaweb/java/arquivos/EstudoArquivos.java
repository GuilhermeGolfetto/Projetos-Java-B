package br.com.treinaweb.java.arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EstudoArquivos {

	public static void main(String[] args) {
		 
		String texto = "Conteúdo escrito nos arquivos";
		EscreverArquivosComOutputStream(texto);
		escreverArquivocomFiles(texto); //MELHOR OPÇÃO
		escreverArquivoComBufferedWriter(texto);
		escreverArquivocomFileWriter(texto);
		System.out.println("Terminei de escrever os arquivos");
		
		lerArquivoComImputStream();
		lerArquivoComFiles();
		lerArquivoComBufferedReader();
		lerArquivoComFileReader();
		
		System.out.println("Terminei de ler os arquivos");
	}

	private static void EscreverArquivosComOutputStream(String texto){
		File arquivo = new File("arquivo_outputstrema.txt");
		if(!arquivo.exists()){
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		OutputStream stream = null;
		try {
			stream = new FileOutputStream(arquivo);
			stream.write(texto.getBytes(), 0 ,texto.length());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(stream != null){
				try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	private static void lerArquivoComImputStream(){
		File arquivo = new File("arquivo_outputstrema.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(arquivo);
			byte[] conteudo = new byte[100];
			is.read(conteudo);
			String conteudoArquivo = new String(conteudo); //o que estiver dentro do arquivo
			System.out.println("* *** Lendo com InputStream *** *");
			System.out.println(conteudoArquivo);
			System.out.println(" **** ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(is != null){
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	private static void escreverArquivocomFiles(String texto){
		File arquivo = new File("arquivo_files.txt");
		if(!arquivo.exists()){
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		try {
			Files.write(Paths.get(arquivo.getAbsolutePath()), texto.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void lerArquivoComFiles(){
		File arquivo = new File("arquivo_files.txt");
		try {
			String conteudoArquivo = new String(Files.readAllBytes(Paths.get(arquivo.getAbsolutePath())));
			System.out.println("****Lendo o Arquivo com Files ****");
			System.out.println(conteudoArquivo);
			System.out.println(" ***** ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	private static void escreverArquivoComBufferedWriter(String texto){
		File arquivo = new File("arquivo_bufferedwrited.txt");
		if(!arquivo.exists()){
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(arquivo);
			bw = new BufferedWriter(fw);
			bw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(bw != null){
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null){
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	private static void lerArquivoComBufferedReader(){
		File arquivo = new File("arquivo_bufferedwrited.txt");
		BufferedReader bf = null;
		try {
			bf = new BufferedReader(new FileReader(arquivo));
			String linha = "";
			System.out.println("* **** Lendo com Buffered Reader **** *");
			while((linha = bf.readLine()) != null){
				System.out.println(linha);
			}
			System.out.println("* **** *");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(bf != null){
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	
	
	
	
	
	private static void escreverArquivocomFileWriter(String texto){
		File arquivo = new File("arquivo_filewrited.txt");
		if(!arquivo.exists()){
			try {
				arquivo.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Writer fw = null;
		try {
			fw = new FileWriter(arquivo);
			fw.write(texto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				if(fw != null){
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	private static void lerArquivoComFileReader(){
		File arquivo = new File("arquivo_filewrited.txt");
		char[] conteudo = new char[100];
		Reader reader = null;
		try {
			reader = new FileReader(arquivo);
			System.out.println("**** Lendo com File Reader **");
			while(reader.read(conteudo) != -1){
				System.out.println(String.copyValueOf(conteudo));
			}
			System.out.println("*** *** **");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
