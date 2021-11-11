package ex3;

public class Client {

	public static void main(String[] args) {
        VueCtalogue vueAge = new VueCtalogue(new VersionAge());
        VueCtalogue vueNormal = new VueCtalogue(new VersionNormal());
        vueAge.affiche();
        vueNormal.affiche();
	}

}