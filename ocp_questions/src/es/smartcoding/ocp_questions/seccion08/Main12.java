/**
 * 
 */
package es.smartcoding.ocp_questions.seccion08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author jmendez
 *
 */
public class Main12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		try (Scanner s = new Scanner(new BufferedReader(new FileReader("file.txt")));) {
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		}
	}

}
