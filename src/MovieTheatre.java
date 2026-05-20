


// Author: Christopher Britten
// Course: DSA

/** Instructions
 *
 * You are required to simulate a movie theater seating system using a 2D array
 * in Java. Each element of the array will represent a seat in the theater.
 *
 * Your program should be able to:
 *
 * 1. Display the seating chart & show the initial arrangement of seats
 *    (all available at the start).
 *
 * 2. Reserve a seat then allow a user to book a specific seat.
 *     If the seat is already taken, inform the user and suggest an
 *      available seat instead.
 *
 * 3. Cancel a reservation then allow a user to cancel a previously reserved
 *    seat and mark it as available again.
 *
 * 4. Retrieve updated seating chart then after any operation, display the
 *    current state of the seating chart.
 */

/**
 * NOTES
 * using a 2D array for this problem ( due to our classes reenforcing the understanding of rows and columns in 2d theory )
 *
 *  decided to use char and not boolean for planning as its going to be printed regardless I wont need to handle T/F
 *
 * thought process for the loop
 * filling every seat with A for available
 * nested for loop visits every cell in the grid
 *
 *
 *

**/



public class MovieTheatre {

    public static void main(String[] args) {


        char[][] seats = new char[5][6];


        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 6; column++) {
                seats[row][column] = 'A';
            }

        }





        }

    }

}
