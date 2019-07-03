package classifier.instance;

import classifier.instance.attribute.*;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ChessMovesInstanceTest {
    private ChessMovesInstance chessMovesInstance;

    @Before
    public void setUp() {
        chessMovesInstance = new ChessMovesInstance(
                Bkblk.T,
                Bknwy.T,
                Bkon8.T,
                Bkona.T,
                Bkspr.T,
                Bkxbq.T,
                Bkxcr.T,
                Bkxwp.T,
                Blxwp.T,
                Bxqsq.T,
                Cntxt.T,
                Dsopp.T,
                Dwipd.G,
                Hdchk.T,
                Katri.B,
                Mulch.T,
                Qxmsq.T,
                R2ar8.T,
                Reskd.T,
                Reskr.T,
                Rimmx.T,
                Rkxwp.T,
                Rxmsq.T,
                Simpl.T,
                Skach.T,
                Skewr.F,
                Skrxp.F,
                Spcop.F,
                Stlmt.F,
                Thrsk.F,
                Wkcti.F,
                Wkna8.F,
                Wknck.F,
                Wkovl.T,
                Wkpos.T,
                Wtoeg.N
        );
    }

    @Test
    public void givenAcuteInflammationsInstance_thenSerializeToJson() throws IOException {
        chessMovesInstance.serializeToJson("chess-moves-instance.json");
    }

    @Test
    public void givenJsonFile_whenDeserialize_thenIsEquals() throws IOException {
        assertThat(
                ChessMovesInstance.deserializeFromJson("chess-moves-instance.json")
        ).isEqualTo(chessMovesInstance);
    }

}