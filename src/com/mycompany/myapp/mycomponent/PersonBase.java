/**
 * 
 */
package com.mycompany.myapp.mycomponent;

/**
 * @author Silvana
 *
 */
public abstract class PersonBase implements Person {
	
	protected String name;
	private Integer age;
	
	public PersonBase (String _name, Integer _age) {
		name = _name;
		age = _age;
	}
	
	public PersonBase() {
		// TODO Auto-generated constructor stub
	}
	
	/* (non-Javadoc)
	 * @see com.mycompany.myapp.mycomponent.Person#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see com.mycompany.myapp.mycomponent.Person#getAge()
	 */
	@Override
	public Integer getAge() {
		return age;
	}

}
