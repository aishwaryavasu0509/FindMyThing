package com.example.demo.model;

public class BuisnessModule {
	
		private String nameOfOrganisation;
		Buisnesscentre centre = new Buisnesscentre();
		Industry industry = new Industry();
		
		public Industry getIndustry() {
			return industry;
		}



		public void setIndustry(Industry industry) {
			this.industry = industry;
		}



		public BuisnessModule()
		{
			
		}

		
		
		public Buisnesscentre getCentre() {
			return centre;
		}



		public void setCentre(Buisnesscentre centre) {
			this.centre = centre;
		}



		public String getNameOfOrganisation() {
			return nameOfOrganisation;
		}

		public void setNameOfOrganisation(String nameOfOrganisation) {
			this.nameOfOrganisation = nameOfOrganisation;
		}

}
