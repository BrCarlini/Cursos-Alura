package br.com.magnaFormacao.servidorTarefas;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTarefas {

	public static void main(String[] args) throws Exception {
		
		System.out.println("--- iniciando servidor ---");
		ServerSocket servidor = new ServerSocket(12345);
		
		while(true) {
			Socket socket = servidor.accept();
			
			System.out.println("Aceitando novo cliente na porta: " + socket.getPort());
			Thread.sleep(20000);
		}

	}

}
