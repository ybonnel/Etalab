package fr.ybo.etalab.modele;

import fr.ybo.moteurcsv.adapter.AdapterDouble;
import fr.ybo.moteurcsv.adapter.AdapterInteger;
import fr.ybo.moteurcsv.annotation.BaliseCsv;
import fr.ybo.moteurcsv.annotation.FichierCsv;

@FichierCsv(value = "accidents.csv", separateur = ",")
public class Accident {

	@BaliseCsv(value = "org", adapter = AdapterInteger.class, ordre = 0)
	private Integer organisation;

	@BaliseCsv(value = "com", adapter = AdapterInteger.class, ordre = 1)
	private Integer commune;

	/**
	 * 1 caractère indiquant la zone :
	 * <ul>
	 * <li>M = Métropole</li>
	 * <li>A = Antilles (Martinique ou Guadeloupe)</li>
	 * <li>G = Guyane</li>
	 * <li>R = Réunion</li>
	 * <li>S = St Pierre et Miquelon</li>
	 * <li>Y = Mayotte</li>
	 * <li>P = Polynésie française</li>
	 * <li>W = Wallis et Futuna</li>
	 * <li>C = Nouvelle Calédonie</li>
	 * <li>T = Terres austr. et antarct. Françaises</li>
	 * </ul>
	 */
	@BaliseCsv(value = "gps", ordre = 2)
	private String gps;

	@BaliseCsv(value = "lat", adapter = AdapterLong.class, ordre = 3)
	private Long latitude;

	@BaliseCsv(value = "long", adapter = AdapterLong.class, ordre = 4)
	private Long longitude;

	@BaliseCsv(value = "dep", ordre = 5)
	private String departements;

	/**
	 * Catégorie de route :
	 * <ul>
	 * <li>1 - Autoroute</li>
	 * <li>2 - Route Nationale</li>
	 * <li>3 - Route Départementale</li>
	 * <li>4 - Voie Communale</li>
	 * <li>5 - Hors réseau public</li>
	 * <li>6 - Parc de stationnement ouvert à la circulation publique</li>
	 * <li>9 – autre</li>
	 * </ul>
	 */
	@BaliseCsv(value = "catr", adapter = AdapterInteger.class, ordre = 6)
	private Integer categorieRoute;

	@BaliseCsv(value = "voie", ordre = 7)
	private String voie;

	@BaliseCsv(value = "v1", ordre = 8)
	private String v1;

	@BaliseCsv(value = "v2", ordre = 9)
	private String v2;

	@BaliseCsv(value = "pr", ordre = 10)
	private String pr;

	@BaliseCsv(value = "pr1", ordre = 11)
	private String pr1;

	@BaliseCsv(value = "ttue", adapter = AdapterInteger.class, ordre = 12)
	private Integer nombreTues;

	@BaliseCsv(value = "tbg", adapter = AdapterInteger.class, ordre = 13)
	private Integer nombreBlessesGraves;

	@BaliseCsv(value = "tbl", adapter = AdapterInteger.class, ordre = 14)
	private Integer nombreBlessesLeges;

	@BaliseCsv(value = "tindm", adapter = AdapterInteger.class, ordre = 15)
	private Integer nombreIndemnes;

	@BaliseCsv(value = "typenumero", adapter = AdapterInteger.class, ordre = 16)
	private Integer typeNumero;

	@BaliseCsv(value = "numero", ordre = 17)
	private String numero;

	@BaliseCsv(value = "distancemetre", adapter = AdapterDouble.class, ordre = 18)
	private Double distanceNumero;

	@BaliseCsv(value = "libellevoie", ordre = 19)
	private String libelleVoie;

	@BaliseCsv(value = "coderivoli", ordre = 20)
	private String codeRivoli;

	@BaliseCsv(value = "grav", adapter = AdapterDouble.class, ordre = 21)
	private Double gravite;

	public Integer getOrganisation() {
		return organisation;
	}

	public void setOrganisation(Integer organisation) {
		this.organisation = organisation;
	}

	public Integer getCommune() {
		return commune;
	}

	public void setCommune(Integer commune) {
		this.commune = commune;
	}

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getDepartements() {
		return departements;
	}

	public void setDepartements(String departements) {
		this.departements = departements;
	}

	public Integer getCategorieRoute() {
		return categorieRoute;
	}

	public void setCategorieRoute(Integer categorieRoute) {
		this.categorieRoute = categorieRoute;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getV1() {
		return v1;
	}

	public void setV1(String v1) {
		this.v1 = v1;
	}

	public String getV2() {
		return v2;
	}

	public void setV2(String v2) {
		this.v2 = v2;
	}

	public String getPr() {
		return pr;
	}

	public void setPr(String pr) {
		this.pr = pr;
	}

	public String getPr1() {
		return pr1;
	}

	public void setPr1(String pr1) {
		this.pr1 = pr1;
	}

	public Integer getNombreTues() {
		return nombreTues;
	}

	public void setNombreTues(Integer nombreTues) {
		this.nombreTues = nombreTues;
	}

	public Integer getNombreBlessesGraves() {
		return nombreBlessesGraves;
	}

	public void setNombreBlessesGraves(Integer nombreBlessesGraves) {
		this.nombreBlessesGraves = nombreBlessesGraves;
	}

	public Integer getNombreBlessesLeges() {
		return nombreBlessesLeges;
	}

	public void setNombreBlessesLeges(Integer nombreBlessesLeges) {
		this.nombreBlessesLeges = nombreBlessesLeges;
	}

	public Integer getNombreIndemnes() {
		return nombreIndemnes;
	}

	public void setNombreIndemnes(Integer nombreIndemnes) {
		this.nombreIndemnes = nombreIndemnes;
	}

	public Integer getTypeNumero() {
		return typeNumero;
	}

	public void setTypeNumero(Integer typeNumero) {
		this.typeNumero = typeNumero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getDistanceNumero() {
		return distanceNumero;
	}

	public void setDistanceNumero(Double distanceNumero) {
		this.distanceNumero = distanceNumero;
	}

	public String getLibelleVoie() {
		return libelleVoie;
	}

	public void setLibelleVoie(String libelleVoie) {
		this.libelleVoie = libelleVoie;
	}

	public String getCodeRivoli() {
		return codeRivoli;
	}

	public void setCodeRivoli(String codeRivoli) {
		this.codeRivoli = codeRivoli;
	}

	public Double getGravite() {
		return gravite;
	}

	public void setGravite(Double gravite) {
		this.gravite = gravite;
	}
}
