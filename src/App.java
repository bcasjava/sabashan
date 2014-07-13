import com.daoimpl.PersonDaoImpl;
import com.entities.Person;

import java.util.List;


public class App {

	public static void main(String [] args) {
		PersonDaoImpl pdi = new PersonDaoImpl();
//
//		/**Create table**/
//		pdi.createPersonTable();
//
//		/**Insert a new record**/
//		Person person = new Person("Mathi","Malar");
//		pdi.insert(person);

		/**Select by id**/
		Person personSelect = pdi.selectById(22);
		System.out.println(personSelect.getId()+", "+personSelect.getFirstName()+", "+personSelect.getLastName());

		/**Delete person by id**/
		pdi.delete(3);

		/**Update person**/
		Person personUpdate = new Person("Tom","Johnson");
		pdi.update(personUpdate,5);

		/**Select all persons**/
		List<Person> persons = pdi.selectAll();
		for(Person p : persons) {
			System.out.println(p.getId()+", "+p.getFirstName()+", "+p.getLastName());
		}

	}
}
