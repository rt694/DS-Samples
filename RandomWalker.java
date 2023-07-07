/*************************************************************************
 * Compilation: javac RandomWalker.java
 * Execution: java RandomWalker 10
 *
 * @author:
 *
 *          The program RandomWalker that takes an int command-line argument n
 *          and simulates the motion of a random walk for n steps. Print the
 *          location at each step (including the starting point), treating the
 *          starting point as the origin (0, 0). Also, print the square of the
 *          final Euclidean distance from the origin.
 *
 *          % java RandomWalker 10
 *          (0,0)
 *          (-1,0)
 *          (-1,-1)
 *          (-1,-2)
 *          (-1,-3)
 *          (-1,-4)
 *          (-1,-5)
 *          (0,-5)
 *          (-1,-5)
 *          (-2,-5)
 *          (-2,-4)
 *          Squared distance = 20.0
 *
 *************************************************************************/
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
