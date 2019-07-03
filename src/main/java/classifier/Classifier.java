package classifier;

public class Classifier {

    public static void main(String[] args) throws Exception {

        /*
         * Build, evaluate, and saves the Model
         */
        new ChessMovesClassifier("chess-moves.csv")
                .buildModel()
                .evaluate()
                .save("chess-moves.model");

        /*
         * Classifies a single Instance from a JSON file
         */
        new ChessMovesClassifier("chess-moves.csv")
                .loadModel("chess-moves.model")
                .classifyInstance("chess-moves-instance.json");


        /*
         * Classifies some random generated Instancesgit
         */
        ChessMovesClassifier classifier = new ChessMovesClassifier("chess-moves.csv")
                .loadModel("chess-moves.model");

        classifier
                .generateRandomInstances(100)
                .forEach(classifier::classifyInstance);
    }
}
