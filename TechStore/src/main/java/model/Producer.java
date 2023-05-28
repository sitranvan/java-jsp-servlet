package model;

public class Producer {
	private String producerID;
	private String producerName;
	private String producerAddress;
	private String producerIntro;

	public Producer() {
		super();
	}

	public Producer(String producerID, String producerName, String producerAddress, String producerIntro) {
		super();
		this.producerID = producerID;
		this.producerName = producerName;
		this.producerAddress = producerAddress;
		this.producerIntro = producerIntro;
	}

	public String getProducerID() {
		return producerID;
	}

	public void setProducerID(String producerID) {
		this.producerID = producerID;
	}

	public String getProducerName() {
		return producerName;
	}

	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}

	public String getProducerAddress() {
		return producerAddress;
	}

	public void setProducerAddress(String producerAddress) {
		this.producerAddress = producerAddress;
	}

	public String getProducerIntro() {
		return producerIntro;
	}

	public void setProducerIntro(String producerIntro) {
		this.producerIntro = producerIntro;
	}

}
