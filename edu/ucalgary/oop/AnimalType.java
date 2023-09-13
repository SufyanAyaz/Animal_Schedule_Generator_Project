/** 
 * @author Sufyan Ayaz <a>
 * href="mailto:sufyan.ayaz@ucalgary.ca">sufyan.ayaz@ucalgary.ca</a>
 * @author Taha Khan <a>
 * href="mailto:Taha.khan1@uaclgary.ca">Taha.khan1@uaclgary.ca</a>
 * @author Hashir Naeem <a>
 * href="mailto:hashir.naeem@ucalgary.ca">hashir.naeem@ucalgary.ca</a>
 * @author Haris Kashif <a>
 * href="mailto:muhammadharis.kashif@ucalgary.ca">muhammadharis.kashif@ucalgary.ca</a>
 * @version 1.1
 * @since 1.0
 */

package edu.ucalgary.oop;

public enum AnimalType {

    /**
     * Represents a coyote.
     */
    COYOTE {
        /**
         * Returns a string representation of a coyote.
         * 
         * @return String "coyote"
         */
        public String toString() {
            return "coyote";
        }
    },
    /**
     * Represents a fox.
     */
    FOX {
        /**
         * Returns a string representation of a fox.
         * 
         * @return String "fox"
         */
        public String toString() {
            return "fox";
        }
    },
    /**
     * Represents a porcupine.
     */
    PORCUPINE {
        /**
         * Returns a string representation of a porcupine.
         * 
         * @return String "porcupine"
         */
        public String toString() {
            return "porcupine";
        }
    },
    /**
     * Represents a raccoon.
     */
    RACCOON {
        /**
         * Returns a string representation of a raccoon.
         * 
         * @return String "raccoon"
         */
        public String toString() {
            return "raccoon";
        }
    },
    /**
     * Represents a beaver.
     */
    BEAVER {
        /**
         * Returns a string representation of a beaver.
         * 
         * @return String "beaver"
         */
        public String toString() {
            return "beaver";
        }
    };

    /**
     * Creates an abstract function.
     * 
     * @return String
     */
    public abstract String toString();

}
