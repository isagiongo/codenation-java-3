package challenge;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class LeitorCSV {

	/*public void leDadosArquivo() throws IOException {
		String fileName = "../java-3/src/main/resources/data.csv";

		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
			stream
			.skip(1)
		    .map(line -> line.split(","))
		    .map(str -> new Jogador(Long.parseLong(str[0]), str[1], str[2], str[3], str[4], 
		    		Integer.parseInt(str[5]), Integer.parseInt(str[6]), str[7], LocalDate.parse(str[8], 
		    				DateTimeFormatter.ofPattern("yyyy-MM-dd")), Double.parseDouble(str[9]), 
		    				Double.parseDouble(str[10]), str[11], Boolean.parseBoolean(str[12]),
		    				str[13], str[14], str[15], new BigDecimal(str[16]), new BigDecimal(str[17]), 
		    				new BigDecimal(str[18])))
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}*/
}
