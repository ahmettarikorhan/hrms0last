package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employees")
@Data
@PrimaryKeyJoinColumn(name = "user_id")
public class Employee extends User{

//	@Id
//	@GeneratedValue
//	@Column(name = "user_id")
//	private int userId;
	
	public Employee(String email, String password) {
		super(email, password);
		// TODO Auto-generated constructor stub
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
}
