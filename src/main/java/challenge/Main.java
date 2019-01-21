package challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.opencsv.bean.CsvToBeanBuilder;

public class Main {

	private List<Jogador> jogadores = new ArrayList<>();

	public Main() {
		try {
			leDados();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private FileReader abreArquivo() throws FileNotFoundException {
		URL url = getClass().getClassLoader().getResource("data.csv");
		return new FileReader(url.getFile());
	}

	private void leDados() throws FileNotFoundException {
		FileReader leitor = abreArquivo();
		jogadores = new CsvToBeanBuilder(leitor).withType(Jogador.class).build().parse();
	}

	// Quantas nacionalidades (coluna `nationality`) diferentes existem no arquivo?
	public int q1() {
		Long nacionalidades = jogadores.stream().map(Jogador::getNationality).distinct().count();
		return nacionalidades.intValue();
	}

	// Quantos clubes (coluna `club`) diferentes existem no arquivo?
	// Obs: Existem jogadores sem clube.
	public int q2() {
		Long clubes = jogadores.stream().filter(vazio -> !vazio.getClub().isEmpty())
				.map(Jogador::getClub).distinct().count();
		return clubes.intValue();
	}

	// Liste o primeiro nome (coluna `full_name`) dos 20 primeiros jogadores.
	public List<String> q3() {
		List<String> primeirosVinte = jogadores.stream().limit(20).map(Jogador::getFullName)
				.collect(Collectors.toList());
		return primeirosVinte;
	}

	// Quem são os top 10 jogadores que possuem as maiores cláusulas de rescisão?
	// (utilize as colunas `full_name` e `eur_release_clause`)
	public List<String> q4() {
		List<String> dezMaiores = jogadores.stream()
				.filter(j -> j.getEurReleaseClause() != null)
				.sorted(Comparator.comparingDouble(Jogador::getEurReleaseClause).reversed())
				.limit(10).map(Jogador::getFullName)
				.collect(Collectors.toList());
		return dezMaiores;
	}

	// Quem são os 10 jogadores mais velhos (use como critério de desempate o campo
	// `eur_wage`)?
	// (utilize as colunas `full_name` e `birth_date`)
	public List<String> q5() {
		List<String> maisVelhos = jogadores.stream().sorted(Comparator.comparing(Jogador::getBirthDate)
				.reversed()).map(Jogador::getFullName).limit(10).collect(Collectors.toList());
		return maisVelhos;
	}

	// Conte quantos jogadores existem por idade. Para isso, construa um mapa onde
	// as chaves são as idades e os valores a contagem.
	// (utilize a coluna `age`)
	public Map<Integer, Integer> q6() {
		return null;
	}

}
