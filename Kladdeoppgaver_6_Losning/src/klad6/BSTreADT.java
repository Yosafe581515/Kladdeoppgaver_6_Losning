package klad6;

import java.util.*;

public interface BSTreADT<T extends Comparable<T>> {
	// Burde hatt javadoc her
	// anbefaler at du fyller ut med javadoc her

	/*****************************************************************
	 * Returnerer sann hvis dette bin�re trett er tomt og usann ellers.
	 *****************************************************************/

	public int antall();

	/*****************************************************************
	 * Returnerer sann hvis dette bin�re treet er tom og usann ellers.
	 *****************************************************************/
	public boolean erTom();

	/******************************************************************
	 * Legger det spesifiserte elementet p� passende plass i dette bin�re s�ketreet.
	 * Like elementer blir lagt til h�yre.
	 ******************************************************************/
	public void leggTil(T element);

	/**********************************************************************
	 * Returnerer en referanse til det spesifiserte elementet hvis det fins i dette
	 * bin�re treet ellers returneres null./
	 ************************************************************************/
	public T finn(T element);
	
	/*****************************************************************
	 * Returnerer en referanse til minste elementet, null viss tre er tomt.
	 *****************************************************************/
	public T finnMin();
	
	/*****************************************************************
	 * Returnerer en referanse til st�rste elementet, null viss tre er tomt.
	 *****************************************************************/
	public T finnMaks();

	/************************************************************************
	 * Fjerner et element fra dette treet hvis det fins, ellers returneres null
	 ************************************************************************/
	
	// public T fjern( T element);
	// Ikke impelmentert
	
	/************************************************************************
	 * Fjerner minste elementet fra dette treet hvis det fins, ellers returneres null
	 ************************************************************************/
	public T fjernMin();
	
	/************************************************************************
	 * Fjerner st�rste elementet fra dette treet hvis det fins, ellers returneres null
	 ************************************************************************/
	public T fjernMaks();
}
