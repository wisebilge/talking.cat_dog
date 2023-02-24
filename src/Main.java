public class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Poppy");
        myDog.voice();
        Cat myCat = new Cat("Manny");
        myCat.voice();


        //abstract class yerine mypet interface de olabilirdi o zaman extends yerine implements yazardık
        //ancak interface constructor içermez bu yüzden abstract classta constructor içinde başlangıç değeri
        //istediğimiz için interface tercih etmedik

    }
}
