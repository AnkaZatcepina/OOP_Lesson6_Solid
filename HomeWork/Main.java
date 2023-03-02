public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		ViewInterface view = new View();
		view.report(user);
		PersisterInterface persister = new Persister();
		persister.save(user, view);
	}
}