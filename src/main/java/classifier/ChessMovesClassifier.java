package classifier;

import classifier.instance.ChessMovesInstance;
import classifier.instance.attribute.*;
import classifier.model.ClassifierModel;
import weka.core.Instance;
import weka.core.Instances;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ChessMovesClassifier {
    private Instances dataSet;
    private ClassifierModel classifier;

    public ChessMovesClassifier(String dataSetFileName) throws IOException {
        this.dataSet = ClassifierModel.loadDataSetFrom(dataSetFileName);
        this.dataSet.setClassIndex(dataSet.numAttributes() - 1);
    }

    public ChessMovesClassifier loadModel(String fileName) throws Exception {
        classifier = new ClassifierModel(
                ClassifierModel.loadModelFrom(fileName),
                dataSet
        );

        return this;
    }

    public ChessMovesClassifier buildModel() throws Exception {
        classifier = new ClassifierModel(
                new String[]{"-U", "-M", "2"},
                dataSet
        );

        return this;
    }

    public ChessMovesClassifier evaluate() throws Exception {
        classifier.evaluate();

        return this;
    }

    public void save(String fileName) throws Exception {
        classifier.saveToFile(fileName);
    }

    private Instance setUpInstance(ChessMovesInstance chessMovesInstance) {
        Instance instance = chessMovesInstance.getInstance(dataSet);

        System.out.println();
        System.out.print("INSTANCE: ");
        System.out.println(instance);

        return instance;
    }

    public void classifyInstance(String fileName) throws Exception {
        ChessMovesInstance chessMovesInstance = ChessMovesInstance.deserializeFromJson(fileName);
        Instance instance = setUpInstance(chessMovesInstance);
        classifyInstance(instance);
    }

    public void classifyInstance(ChessMovesInstance chessMovesInstance) {
        Instance instance = setUpInstance(chessMovesInstance);

        try {
            classifyInstance(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void classifyInstance(Instance instance) throws Exception {
        HashMap<Integer, EndGame> diagnosisMap = new HashMap<>();
        diagnosisMap.put(0, EndGame.WON);
        diagnosisMap.put(1, EndGame.NO_WIN);

        System.out.println();
        System.out.println("CLASS: END-GAME");
        System.out.println();
        System.out.print("DIAGNOSIS: ");
        System.out.println(diagnosisMap.get((int) classifier.get().classifyInstance(instance)).getValue());

        double[] distributionForInstance = classifier.get().distributionForInstance(instance);
        diagnosisMap.forEach((index, diagnosis) ->
                System.out.println(diagnosis.getValue() + "\t-> " + distributionForInstance[index])
        );
    }

    public List<ChessMovesInstance> generateRandomInstances(int numberOfInstances) {
        List<ChessMovesInstance> randomIntances = new ArrayList<>();

        for (int i = 0; i < numberOfInstances; i++) {
            randomIntances.add(
                    new ChessMovesInstance(
                            Bkblk.getRandomValue(),
                            Bknwy.getRandomValue(),
                            Bkon8.getRandomValue(),
                            Bkona.getRandomValue(),
                            Bkspr.getRandomValue(),
                            Bkxbq.getRandomValue(),
                            Bkxcr.getRandomValue(),
                            Bkxwp.getRandomValue(),
                            Blxwp.getRandomValue(),
                            Bxqsq.getRandomValue(),
                            Cntxt.getRandomValue(),
                            Dsopp.getRandomValue(),
                            Dwipd.getRandomValue(),
                            Hdchk.getRandomValue(),
                            Katri.getRandomValue(),
                            Mulch.getRandomValue(),
                            Qxmsq.getRandomValue(),
                            R2ar8.getRandomValue(),
                            Reskd.getRandomValue(),
                            Reskr.getRandomValue(),
                            Rimmx.getRandomValue(),
                            Rkxwp.getRandomValue(),
                            Rxmsq.getRandomValue(),
                            Simpl.getRandomValue(),
                            Skach.getRandomValue(),
                            Skewr.getRandomValue(),
                            Skrxp.getRandomValue(),
                            Spcop.getRandomValue(),
                            Stlmt.getRandomValue(),
                            Thrsk.getRandomValue(),
                            Wkcti.getRandomValue(),
                            Wkna8.getRandomValue(),
                            Wknck.getRandomValue(),
                            Wkovl.getRandomValue(),
                            Wkpos.getRandomValue(),
                            Wtoeg.getRandomValue()
                    )
            );
        }

        return Collections.unmodifiableList(randomIntances);
    }
}
