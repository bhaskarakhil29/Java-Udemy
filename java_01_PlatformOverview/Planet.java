package java_01_PlatformOverview;

class Planet{
    void revolve() {
        System.out.println("Super");
    }

    public static void main(String args[]) {
        Planet earth = new Planet();
        earth.revolve();
    }
}