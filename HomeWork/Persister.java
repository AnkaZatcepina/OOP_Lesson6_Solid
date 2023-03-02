public class Persister implements PersisterInterface{	
	public void save(User user, ViewInterface view){
		view.showSaved(user);
	}
}