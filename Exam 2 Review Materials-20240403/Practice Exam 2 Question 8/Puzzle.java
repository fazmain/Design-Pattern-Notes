package puzzlerChecker;

/*
 *  Abstract parent class of the three difficulty level of puzzles.
 *  Ensures that each puzzle can access an object that can check its
 *  validity
 *  
 *  Author: D. Palmer	Date: April 11, 2021 (Not part of the original implementation)
 */

public abstract class Puzzle {

	public abstract PuzzleChecker getPuzzleChecker();
}
