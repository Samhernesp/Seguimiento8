package model;

import java.util.Comparator;

public class CountryComparator implements Comparator<Country>{

		@Override
		public int compare(Country o1, Country o2) {
			int result = 0;
			
			result = o2.getOroMasc() - o1.getOroMasc();
			
			if (result == 0) {
				result = o2.getPlataMasc() - o1.getPlataMasc();
			}
			
			if (result == 0) {
				result = o2.getBronceMasc() - o1.getBronceMasc();
			}
			
			if (result==0) {
				result = o2.getName().compareTo(o1.getName());
			}
			return result;
		}

}
