/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */
package org.hibernate.model;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable
public class Employee {
	@Id
	private String name;

	private long oca;

	private String title;

	public Employee(String name, String title) {
		this();
		setName( name );
		setTitle( title );
	}

	public String getName() {
		return name;
	}

	public long getOca() {
		return oca;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setOca(long oca) {
		this.oca = oca;
	}

	protected Employee() {
		// this form used by Hibernate
	}

	protected void setName(String name) {
		this.name = name;
	}
}
