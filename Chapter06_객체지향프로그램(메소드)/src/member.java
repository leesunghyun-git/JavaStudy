import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data 
public class member {
	private String id;
	private String pwd;
	private String naem;
	private String sex;
	private int age;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
