package com.jbk.controller;

public class Quesetion {
	
	private String quesetionText;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String option5;
	private String correctOption;
	private String explanations;
	
	public Quesetion() {
		super();
	}

	public Quesetion(String quesetionText, String option1, String option2, String option3, String option4,
			String option5, String correctOption, String explanations) {
		super();
		this.quesetionText = quesetionText;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
		this.correctOption = correctOption;
		this.explanations = explanations;
	}

	public String getQuesetionText() {
		return quesetionText;
	}

	public void setQuesetionText(String quesetionText) {
		this.quesetionText = quesetionText;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getOption5() {
		return option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

	public String getCorrectOption() {
		return correctOption;
	}

	public void setCorrectOption(String correctOption) {
		this.correctOption = correctOption;
	}

	public String getExplanations() {
		return explanations;
	}

	public void setExplanations(String explanations) {
		this.explanations = explanations;
	}
	
	//for unique quesetion, we have implemented hashCode and equals method here.
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((correctOption == null) ? 0 : correctOption.hashCode());
		result = prime * result + ((explanations == null) ? 0 : explanations.hashCode());
		result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
		result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
		result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
		result = prime * result + ((option4 == null) ? 0 : option4.hashCode());
		result = prime * result + ((option5 == null) ? 0 : option5.hashCode());
		result = prime * result + ((quesetionText == null) ? 0 : quesetionText.hashCode());
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
		Quesetion other = (Quesetion) obj;
		if (correctOption == null) {
			if (other.correctOption != null)
				return false;
		} else if (!correctOption.equals(other.correctOption))
			return false;
		if (explanations == null) {
			if (other.explanations != null)
				return false;
		} else if (!explanations.equals(other.explanations))
			return false;
		if (option1 == null) {
			if (other.option1 != null)
				return false;
		} else if (!option1.equals(other.option1))
			return false;
		if (option2 == null) {
			if (other.option2 != null)
				return false;
		} else if (!option2.equals(other.option2))
			return false;
		if (option3 == null) {
			if (other.option3 != null)
				return false;
		} else if (!option3.equals(other.option3))
			return false;
		if (option4 == null) {
			if (other.option4 != null)
				return false;
		} else if (!option4.equals(other.option4))
			return false;
		if (option5 == null) {
			if (other.option5 != null)
				return false;
		} else if (!option5.equals(other.option5))
			return false;
		if (quesetionText == null) {
			if (other.quesetionText != null)
				return false;
		} else if (!quesetionText.equals(other.quesetionText))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Quesetion [quesetionText=" + quesetionText + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", option5=" + option5 + ", correctOption="
				+ correctOption + ", explanations=" + explanations + "]";
	}

}
