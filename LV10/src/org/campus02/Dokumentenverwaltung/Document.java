package org.campus02.Dokumentenverwaltung;

public class Document {

	protected String fileName;

	public Document(String fileName) {
		super();
		this.fileName = fileName;
	}
	

	public void printDocument()
	{
		System.out.println("Document: "+ fileName);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (fileName == null) {
			if (other.fileName != null)
				return false;
		} else if (!fileName.equals(other.fileName))
			return false;
		return true;
	}
	
	
}
