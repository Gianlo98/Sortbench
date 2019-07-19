package dev.emax.sortbench.algorithm;

import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmBubblesort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmHeapsort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmInsertsort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmQuicksort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmRadixsort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmSelectionsort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmShakersort;
import dev.emax.sortbench.algorithm.container.SortbenchAlgorithmShellsort;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Il registro degli algoritmi di ordinamento
 */
@AllArgsConstructor
public enum SortbenchAlgorithmRegistry {

	ALGORITHM_BUBBLESORT(new SortbenchAlgorithmBubblesort()),
	ALGORITHM_COCKTAILSHAKERSORT(new SortbenchAlgorithmShakersort()),
	//ALGORITHM_EMAXSORT(new SortbenchAlgorithmEmaxsort()),
	ALGORITHM_HEAPSORT(new SortbenchAlgorithmHeapsort()),
	ALGORITHM_INSERTSORT(new SortbenchAlgorithmInsertsort()),
	ALGORITHM_QUICKSORT(new SortbenchAlgorithmQuicksort()),
	ALGORITHM_RADIXSORT(new SortbenchAlgorithmRadixsort()),
	ALGORITHM_SELECTIONSORT(new SortbenchAlgorithmSelectionsort()),
	ALGORITHM_SHELLSORT(new SortbenchAlgorithmShellsort());

	/**
	 * L'implementazione dell'algoritmo di ordinamento
	 */
	@Getter
	private SortbenchAlgorithm algorithm;

	/**
	 * Ritorna l'algoritmo all'indice
	 *
	 * @param 	algorithmIndex	L'indice dell'algoritmo da ottenere
	 * @return					L'algoritmo presente all'indice
	 */
	public static SortbenchAlgorithm getAlgorithm(int algorithmIndex) {
		return values()[algorithmIndex].getAlgorithm();
	}

	/**
	 * Ritorna il numero di algoritmi presenti
	 *
	 * @return il numero di algoritmi presenti
	 */
	public static int getAlgorithmsCount() {
		return values().length;
	}

}