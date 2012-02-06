package fr.ybo.etalab.modele;

import fr.ybo.moteurcsv.adapter.AdapterCsv;

public class AdapterLong implements AdapterCsv<Long> {

	public Long parse(String chaine) {
		if (chaine == null || chaine.length() == 0) {
			return null;
		}
		try {
			return Long.parseLong(chaine);
		} catch (NumberFormatException exception) {
			System.err.println(exception);
			return null;
		}
	}

	public String toString(Long objet) {
		if (objet == null) {
			return null;
		}
		return objet.toString();
	}
	

}
