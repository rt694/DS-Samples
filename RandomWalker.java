public class RandomWalker {
    public static void main(String[] args) {
        int randomnumber = 0;
        double distanceBetweenPoints = 0.0;
        int pointX = 0;
        int pointY = 0;
        int newpointX = pointX;
        int newpointY = pointY;

        int number = Integer.parseInt(args[0]);

        int count = 0;
        System.out.println("(" + newpointX + "," + newpointY + ")");
        while (count < number) {
            randomnumber = (int) (System.currentTimeMillis() * 4) + 1;

            if (randomnumber == 1)
                newpointX += 1;
            else if (randomnumber == 2)
                newpointX -= 1;
            else if (randomnumber == 3)
                newpointY += 1;
            else
                newpointY -= 1;

            System.out.println("(" + newpointX + "," + newpointY + ")");
            count++;
        }
        distanceBetweenPoints = (newpointX - pointY) * (newpointY - pointX)
                + (newpointY - pointY) * (newpointY - pointY);
        System.out.println("Squared distance = " + distanceBetweenPoints);

    }
}
