package conversion;

public class Main {

	public static void main(String[] args) {
		
		// Type a convertir
		byte bValue;
		short sValue;
		int iValue;
		long lValue;
		float fValue;
		double dValue;
		char cValue;
		boolean blValue;
		String stValue;
		
		// Tampon de conversion
		byte bTmp;
		short sTmp;
		int iTmp;
		long lTmp;
		float fTmp;
		double dTmp;
		char cTmp;
		boolean blTmp;
		String stTmp;
		
		bValue = 127;
		sValue = 32767;
		iValue = 2147483647; 
		lValue = 9223372036854775807l;
		fValue = 3.4028235E38f;
		dValue = 1.7976931348623157E308;
		cValue = 255;
		blValue = false;
		
		//stValue = "255";
		//stValue = "9223372036854775808";
		stValue = "2.7976931348623157E308";
		
		System.out.println("Conversion de byte vers les autres types :");
		System.out.println("Valeur du byte : " + bValue);
		sTmp = (short) bValue;
		System.out.println("Conversion en short : " +  (( ( (byte) sTmp ) == bValue ) ? sTmp : "approximatif"));
		iTmp = (int) bValue;
		System.out.println("Conversion en integer : " + (( ( (byte) iTmp ) == bValue ) ? iTmp : "approximatif"));
		lTmp = (long) bValue;
		System.out.println("Conversion en long : " + (( ( (byte) lTmp ) == bValue ) ? lTmp : "approximatif"));
		fTmp = (float) bValue;
		System.out.println("Conversion en float : " + (( ( (byte) fTmp ) == bValue ) ? fTmp : "approximatif"));
		dTmp = (double) bValue;
		System.out.println("Conversion en double : " + (( ( (byte) dTmp ) == bValue ) ? dTmp : "approximatif"));
		cTmp = (char) bValue;
		System.out.println("Conversion en char : " + (( ( (byte) cTmp ) == bValue ) ? cTmp : "approximatif"));
		// blTmp = (boolean) bValue;
		System.out.println("Conversion en booléen : Impossible");
		//stTmp = (String) bValue;
		System.out.println("Conversion en string : " + bValue);
		System.out.println();
		
		System.out.println("Conversion de short vers les autres types :");
		System.out.println("Valeur du short : " + sValue);
		bTmp = (byte) bValue;
		System.out.println("Conversion en byte : " +  (( ( (short) bTmp ) == sValue ) ? bTmp : "approximatif"));
		iTmp = (int) sValue;
		System.out.println("Conversion en integer : " + (( ( (short) iTmp ) == sValue ) ? iTmp : "approximatif"));
		lTmp = (long) sValue;
		System.out.println("Conversion en long : " + (( ( (short) lTmp ) == sValue ) ? lTmp : "approximatif"));
		fTmp = (float) sValue;
		System.out.println("Conversion en float : " + (( ( (short) fTmp ) == sValue ) ? fTmp : "approximatif"));
		dTmp = (double) sValue;
		System.out.println("Conversion en double : " + (( ( (short) dTmp ) == sValue ) ? dTmp : "approximatif"));
		cTmp = (char) sValue;
		System.out.println("Conversion en char : " + (( ( (short) cTmp ) == sValue ) ? cTmp : "approximatif"));
		// blTmp = (boolean) sValue;
		System.out.println("Conversion en booléen : Impossible");
		// stTmp = (String) sValue;
		System.out.println("Conversion en string : " + sValue);
		System.out.println();
		
		System.out.println("Conversion de int vers les autres types :");
		System.out.println("Valeur du int : " + iValue);
		bTmp = (byte) iValue;
		System.out.println("Conversion en byte : " +  (( ( (int) bTmp ) == iValue ) ? bTmp : "approximatif"));
		sTmp = (short) iValue;
		System.out.println("Conversion en short : " + (( ( (int) sTmp ) == iValue ) ? sTmp : "approximatif"));
		lTmp = (long) iValue;
		System.out.println("Conversion en long : " + (( ( (int) lTmp ) == iValue ) ? lTmp : "approximatif"));
		fTmp = (float) iValue;
		System.out.println("Conversion en float : " + (( ( (int) fTmp ) == iValue ) ? fTmp : "approximatif"));
		dTmp = (double) iValue;
		System.out.println("Conversion en double : " + (( ( (int) dTmp ) == iValue ) ? dTmp : "approximatif"));
		cTmp = (char) iValue;
		System.out.println("Conversion en char : " + (( ( (int) cTmp ) == iValue ) ? cTmp : "approximatif"));
		// blTmp = (boolean) sValue;
		System.out.println("Conversion en booléen : Impossible");
		// stTmp = (String) sValue;
		System.out.println("Conversion en string : " + iValue);
		System.out.println();
		
		System.out.println("Conversion de long vers les autres types :");
		System.out.println("Valeur du long : " + lValue);
		bTmp = (byte) lValue;
		System.out.println("Conversion en byte : " +  (( ( (long) bTmp ) == lValue ) ? bTmp : "approximatif"));
		sTmp = (short) lValue;
		System.out.println("Conversion en short : " + (( ( (long) sTmp ) == lValue ) ? sTmp : "approximatif"));
		iTmp = (int) lValue;
		System.out.println("Conversion en int : " + (( ( (long) iTmp ) == lValue ) ? iTmp : "approximatif"));
		fTmp = (float) lValue;
		System.out.println("Conversion en float : " + (( ( (long) fTmp ) == lValue ) ? fTmp : "approximatif"));
		dTmp = (double) lValue;
		System.out.println("Conversion en double : " + (( ( (long) dTmp ) == lValue ) ? dTmp : "approximatif"));
		cTmp = (char) lValue;
		System.out.println("Conversion en char : " + (( ( (long) cTmp ) == lValue ) ? cTmp : "approximatif"));
		// blTmp = (boolean) sValue;
		System.out.println("Conversion en booléen : Impossible");
		// stTmp = (String) sValue;
		System.out.println("Conversion en string : " + lValue);
		System.out.println();
		
		System.out.println("Conversion de float vers les autres types :");
		System.out.println("Valeur du float : " + fValue);
		bTmp = (byte) fValue;
		System.out.println("Conversion en byte : " +  (( ( (float) bTmp ) == fValue ) ? bTmp : "approximatif"));
		sTmp = (short) fValue;
		System.out.println("Conversion en short : " + (( ( (float) sTmp ) == fValue ) ? sTmp : "approximatif"));
		iTmp = (int) fValue;
		System.out.println("Conversion en int : " + (( ( (float) iTmp ) == fValue ) ? iTmp : "approximatif"));
		lTmp = (long) fValue;
		System.out.println("Conversion en long : " + (( ( (float) lTmp ) == fValue ) ? lTmp : "approximatif"));
		dTmp = (double) fValue;
		System.out.println("Conversion en double : " + (( ( (float) dTmp ) == fValue ) ? dTmp : "approximatif"));
		cTmp = (char) fValue;
		System.out.println("Conversion en char : " + (( ( (float) cTmp ) == fValue ) ? cTmp : "approximatif"));
		// blTmp = (boolean) sValue;
		System.out.println("Conversion en booléen : Impossible");
		// stTmp = (String) sValue;
		System.out.println("Conversion en string : " + fValue);
		System.out.println();
		
		System.out.println("Conversion de double vers les autres types :");
		System.out.println("Valeur du double : " + dValue);
		bTmp = (byte) dValue;
		System.out.println("Conversion en byte : " +  (( ( (double) bTmp ) == dValue ) ? bTmp : "approximatif"));
		sTmp = (short) dValue;
		System.out.println("Conversion en short : " + (( ( (double) sTmp ) == dValue ) ? sTmp : "approximatif"));
		iTmp = (int) dValue;
		System.out.println("Conversion en int : " + (( ( (double) iTmp ) == dValue ) ? iTmp : "approximatif"));
		lTmp = (long) dValue;
		System.out.println("Conversion en long : " + (( ( (double) lTmp ) == dValue ) ? lTmp : "approximatif"));
		fTmp = (float) dValue;
		System.out.println("Conversion en float : " + (( ( (double) fTmp ) == dValue ) ? fTmp : "approximatif"));
		cTmp = (char) dValue;
		System.out.println("Conversion en char : " + (( ( (double) cTmp ) == dValue ) ? cTmp : "approximatif"));
		// blTmp = (boolean) sValue;
		System.out.println("Conversion en booléen : Impossible");
		// stTmp = (String) sValue;
		System.out.println("Conversion en string : " + dValue);
		System.out.println();
		
		System.out.println("Conversion de char vers les autres types :");
		System.out.println("Valeur du char : " + cValue);
		bTmp = (byte) cValue;
		System.out.println("Conversion en byte : " +  (( ( (char) bTmp ) == cValue ) ? bTmp : "approximatif"));
		sTmp = (short) cValue;
		System.out.println("Conversion en short : " + (( ( (char) sTmp ) == cValue ) ? sTmp : "approximatif"));
		iTmp = (int) cValue;
		System.out.println("Conversion en int : " + (( ( (char) iTmp ) == cValue ) ? iTmp : "approximatif"));
		lTmp = (long) cValue;
		System.out.println("Conversion en long : " + (( ( (char) lTmp ) == cValue ) ? lTmp : "approximatif"));
		fTmp = (float) cValue;
		System.out.println("Conversion en float : " + (( ( (char) fTmp ) == cValue ) ? fTmp : "approximatif"));
		dTmp = (double) cValue;
		System.out.println("Conversion en double : " + (( ( (char) dTmp ) == cValue ) ? dTmp : "approximatif"));
		// blTmp = (boolean) cValue;
		System.out.println("Conversion en booléen : Impossible");
		// stTmp = (String) cValue;
		System.out.println("Conversion en string : " + cValue);
		System.out.println();
		
		System.out.println("Conversion de booléen vers les autres types :");
		System.out.println("Valeur du boléen : " + blValue);
		// bTmp = (byte) blValue;
		System.out.println("Conversion en byte : Impossible");
		// sTmp = (short) blValue;
		System.out.println("Conversion en short : Impossible");
		// iTmp = (int) blValue;
		System.out.println("Conversion en int : Impossible");
		// lTmp = (long) blValue;
		System.out.println("Conversion en long : Impossible");
		// fTmp = (float) blValue;
		System.out.println("Conversion en float : Impossible");
		// dTmp = (double) blValue;
		System.out.println("Conversion en double : Impossible");
		// cTmp = (char) blValue;
		System.out.println("Conversion en char : Impossible");
		// stTmp = (String) blValue;
		System.out.println("Conversion en string : " + blValue);
		System.out.println();
		
		System.out.println("Conversion de string vers les autres types :");
		System.out.println("Valeur du string : " + stValue);
		String tampon;
		
		try {
			bTmp = Byte.parseByte(stValue);
			tampon = " " + bTmp;
			System.out.println("Conversion en byte : " +  bTmp);
		} catch (NumberFormatException e) {
			System.out.println("Conversion en byte : approximatif");
		}
		
		try {
			sTmp = Short.parseShort(stValue);
			tampon = " " + sTmp;
			System.out.println("Conversion en short : " + sTmp);
		} catch (NumberFormatException e) {
			System.out.println("Conversion en short : approximatif");
		}
		
		try {
			iTmp = Integer.parseInt(stValue);
			tampon = " " + iTmp;
			System.out.println("Conversion en int : " + iTmp);
		} catch (NumberFormatException e) {
			System.out.println("Conversion en int : approximatif");
		}
		
		try {
			lTmp = Long.parseLong(stValue);
			tampon = " " + lTmp;
			System.out.println("Conversion en long : " + lTmp);
		} catch (NumberFormatException e) {
			System.out.println("Conversion en long : approximatif");
		}
		
		try {
			fTmp = Float.parseFloat(stValue);
			tampon = " " + fTmp;
			if (tampon.equals(" Infinity"))
				System.out.println("Conversion en float : approximatif");
			else
				System.out.println("Conversion en float : " + fTmp);
		} catch (NumberFormatException e) {
			System.out.println("Conversion en float : approximatif");
		}
		
		try {
			dTmp = Double.parseDouble(stValue);
			tampon = " " + dTmp;
			if (tampon.equals(" Infinity"))
				System.out.println("Conversion en double : approximatif");
			else
				System.out.println("Conversion en double : " + dTmp);
		} catch (NumberFormatException e) {
			System.out.println("Conversion en double : approximatif");
		}
		
		// cTmp = (char) stValue;
		System.out.println("Conversion en char : Impossible");
		// blTmp = (String) stValue;
		System.out.println("Conversion en booléen : Impossible");
		System.out.println();
	}

}
