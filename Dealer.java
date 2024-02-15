import greenfoot.*;
import java.util.ArrayList;

/**
 * This class declares, instantiates, and initializes a new deck.  Students
 * should then implement the sort method at the botton of this class to see
 * if they understanding basic ArrayList sort algorithms.
 *
 * @author IKA
 * @version Feb 13, 2024
 */

public class Dealer extends Actor
{
    private Deck deck;
    private Card[] shuffledDeck;
    private Card[] selectionSort;
    private Card[] insertionSort;
    private Card[] mergeSort;
   
    // Instantiates a new deck
    public Dealer()
    {
        deck = new Deck();
        shuffledDeck = deck.getShuffledDeck();
        initializeSortArrays();
    }
   
    // Adds cards to board after Deck is initialized
    public void addedToWorld(World world)
    {
        showCards(world, shuffledDeck, 80);
        showCards(world, selectionSort(selectionSort, shuffledDeck.length), 220);
        showCards(world, insertionSort(insertionSort, shuffledDeck.length), 360);
        showCards(world, mergeSort(mergeSort, shuffledDeck.length), 500);
    }    
    // Shuffles the unshuffled deck
   
   
    // Sets all the sorted arrays equal to the shuffledCard array
    private void initializeSortArrays()
    {
        selectionSort = new Card[shuffledDeck.length];
        insertionSort = new Card[shuffledDeck.length];
        mergeSort = new Card[shuffledDeck.length];
       
        for(int i = 0; i < shuffledDeck.length; i++)
        {
            Card card1 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card2 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            Card card3 = new Card(shuffledDeck[i].getImageFile(),shuffledDeck[i].getValue());
            selectionSort[i] = card1;
            insertionSort[i] = card2;
            mergeSort[i] = card3;
        }
    }
   
    // Places card on board at y
    private void showCards(World world, Card[] cards, int y)
    {
       
       for(int i = 0; i < cards.length; i++)
       {
           world.addObject(cards[i],58 + 30 * i, y);
       }
    }
   
    /* This is where the students attempt their sort algorithm by taking the
     * cards from the shuffled list and adding them to the sorted list.    
    **/
   
    /* In this space write the pseudocode for your selection sort
     *
     *
     *
     */
    private Card[] selectionSort(Card[] arr, int n)
    {
        //put sort algorithm here
        for(int i = 0; i < n; i++)
        {
            int minIndex = i;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[j].getValue() < arr[minIndex].getValue())
                {
                    minIndex = j;
                }
            }
            if(minIndex != i)
            {
                Card temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
        return selectionSort;
    }
   
    /* In this space write the pseudocode for your insertion sort
     *
     *
     *
     */
    private Card[] insertionSort(Card[] arr, int n)
    {
        ArrayList<Card> sorted = new ArrayList<Card>();
       
        //put sort algorithm here
        for(int i = 0; i < n; i++)
        {
            boolean added = false;
            if(sorted != null)
            {
                for(int j = 0; j < sorted.size(); j++)
                {
                    if (sorted.get(j).getValue() > arr[i].getValue())
                    {
                        sorted.add(j, arr[i]);
                        added = true;
                        break;
                    }
                }
            }
            if(sorted == null || !added)
            {
                sorted.add(arr[i]);
            }
        }
       
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sorted.get(i);
        }
       
        return insertionSort;
    }
   
    /* In this space write the pseudocode for your merge sort
     *
     *
     *
     */
    private Card[] mergeSort(Card[] arr, int n)
     {
       
        //put sort algorithm here
       
        return mergeSort;
    }
}
