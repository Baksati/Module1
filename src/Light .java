class Light {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days, seconds, distance;

        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}