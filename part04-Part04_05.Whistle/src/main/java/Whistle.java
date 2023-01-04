public class Whistle {

    private String sound;

    public Whistle(String whistleSound) {
        this.sound = whistleSound;
    }

    public void sound() {
        Whistle duckWhistle = new Whistle("Kvaak");
        Whistle roosterWhistle = new Whistle("Peef");

        System.out.println(sound);
   
    }

    
}
