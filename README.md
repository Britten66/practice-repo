# Hand In Repo
A repo for me to practice as a full stack developer also using this respoitory to hand in projects as they are given out.

# Search and Delete  (done)
Search and delete both work by starting at the head and walking node to node until they hit the value (search returns true/false) or reach the spot to remove (delete relinks the pointers around that node to skip it, then drops the size). I also fixed the single list using = instead of == in a validation that I looked over for the codebase. 


# undoRedoManager  (done)
This code implements an undo/redo tracking system by using a doubly linked list to store a sequence of saved actions as connected nodes. The Redo method specifically functions by moving the currentState pointer forward to the next node in that list, effectively reapplying an action that was just previously undid.

# Array Basic (done)
First project added aims to ask the user for an input of how many days they would like in the array

the program creates an array of this size and request a value per day 
in this case its used as temperature

loops through number given by user and returns the avg and sum of the temps given between the days total.
