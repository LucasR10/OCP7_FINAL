package br.com.ocjp7.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.WatchService;

public class WatchServiceTeste {

	/*varifica atualiza��o de arquivos */
	
	public static void main(String[] args) throws IOException {

		WatchService watcher = FileSystems.getDefault().newWatchService();

	}

}
