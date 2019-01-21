package challenge;

import java.time.LocalDate;
import java.util.Date;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class Jogador {

	@CsvBindByName(column = "ID")
	private String id;
	
	@CsvBindByName(column = "name")
	private String name;

	@CsvBindByName(column = "full_name")
	private String fullName;
	
	@CsvBindByName(column = "club")
	private String club;
	
	@CsvBindByName(column = "birth_date")
    @CsvDate("yyyy-MM-dd")
	private Date birthDate;
	
	@CsvBindByName(column = "nationality")
	private String nationality;
	
	@CsvBindByName(column = "eur_wage")
	private Double eurWage;
	
	@CsvBindByName(column = "eur_release_clause")
	private Double eurReleaseClause;
	
	public Jogador() {}

	public Jogador(String id, String name, String fullName, String club, Date birthDate, String nationality,
			Double eurWage, Double eurReleaseClause) {
		super();
		this.id = id;
		this.name = name;
		this.fullName = fullName;
		this.club = club;
		this.birthDate = birthDate;
		this.nationality = nationality;
		this.eurWage = eurWage;
		this.eurReleaseClause = eurReleaseClause;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	public Double getEurWage() {
		return eurWage;
	}
	
	public void setEurWage(Double eurWage) {
		this.eurWage = eurWage;
	}

	public Double getEurReleaseClause() {
		return eurReleaseClause;
	}

	public void setEurReleaseClause(Double eurReleaseClause) {
		this.eurReleaseClause = eurReleaseClause;
	}
}