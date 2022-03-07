
/*
 * @purpose :Deck of cards simulation
 * @file : DeckOfCards.java
 * @author : Priyanka Dombale
 */

package com.blz;

public class DeckOfCards {

	static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
	static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
	static String[] deckOfCard = new String[suit.length * rank.length];

	/*
	 * purpose : Ability to Arrange Deck of cards uniquely
	 */
	public void getUniqueCards() {
		int index = 0;// Initializing deck index to zero
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				deckOfCard[index] = suit[i] + " : " + rank[j];
				index++;// incrementing index
			}
		}
	}

	/*
	 * purpose : Display of deck of cards
	 */
	public void printArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Deck of Cards..!!");
		DeckOfCards deckOfCards = new DeckOfCards();
		deckOfCards.getUniqueCards();
		System.out.println("Unique cards are");
		deckOfCards.printArray(deckOfCard);
	}

}
