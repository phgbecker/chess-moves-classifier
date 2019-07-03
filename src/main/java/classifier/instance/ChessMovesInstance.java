package classifier.instance;

import classifier.instance.attribute.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class ChessMovesInstance {
    private Bkblk bkblk;
    private Bknwy bknwy;
    private Bkon8 bkon8;
    private Bkona bkona;
    private Bkspr bkspr;
    private Bkxbq bkxbq;
    private Bkxcr bkxcr;
    private Bkxwp bkxwp;
    private Blxwp blxwp;
    private Bxqsq bxqsq;
    private Cntxt cntxt;
    private Dsopp dsopp;
    private Dwipd dwipd;
    private Hdchk hdchk;
    private Katri katri;
    private Mulch mulch;
    private Qxmsq qxmsq;
    private R2ar8 r2ar8;
    private Reskd reskd;
    private Reskr reskr;
    private Rimmx rimmx;
    private Rkxwp rkxwp;
    private Rxmsq rxmsq;
    private Simpl simpl;
    private Skach skach;
    private Skewr skewr;
    private Skrxp skrxp;
    private Spcop spcop;
    private Stlmt stlmt;
    private Thrsk thrsk;
    private Wkcti wkcti;
    private Wkna8 wkna8;
    private Wknck wknck;
    private Wkovl wkovl;
    private Wkpos wkpos;
    private Wtoeg wtoeg;

    public ChessMovesInstance() {
    }

    public ChessMovesInstance(Bkblk bkblk, Bknwy bknwy, Bkon8 bkon8, Bkona bkona, Bkspr bkspr, Bkxbq bkxbq, Bkxcr bkxcr, Bkxwp bkxwp, Blxwp blxwp, Bxqsq bxqsq, Cntxt cntxt, Dsopp dsopp, Dwipd dwipd, Hdchk hdchk, Katri katri, Mulch mulch, Qxmsq qxmsq, R2ar8 r2ar8, Reskd reskd, Reskr reskr, Rimmx rimmx, Rkxwp rkxwp, Rxmsq rxmsq, Simpl simpl, Skach skach, Skewr skewr, Skrxp skrxp, Spcop spcop, Stlmt stlmt, Thrsk thrsk, Wkcti wkcti, Wkna8 wkna8, Wknck wknck, Wkovl wkovl, Wkpos wkpos, Wtoeg wtoeg) {
        this.bkblk = bkblk;
        this.bknwy = bknwy;
        this.bkon8 = bkon8;
        this.bkona = bkona;
        this.bkspr = bkspr;
        this.bkxbq = bkxbq;
        this.bkxcr = bkxcr;
        this.bkxwp = bkxwp;
        this.blxwp = blxwp;
        this.bxqsq = bxqsq;
        this.cntxt = cntxt;
        this.dsopp = dsopp;
        this.dwipd = dwipd;
        this.hdchk = hdchk;
        this.katri = katri;
        this.mulch = mulch;
        this.qxmsq = qxmsq;
        this.r2ar8 = r2ar8;
        this.reskd = reskd;
        this.reskr = reskr;
        this.rimmx = rimmx;
        this.rkxwp = rkxwp;
        this.rxmsq = rxmsq;
        this.simpl = simpl;
        this.skach = skach;
        this.skewr = skewr;
        this.skrxp = skrxp;
        this.spcop = spcop;
        this.stlmt = stlmt;
        this.thrsk = thrsk;
        this.wkcti = wkcti;
        this.wkna8 = wkna8;
        this.wknck = wknck;
        this.wkovl = wkovl;
        this.wkpos = wkpos;
        this.wtoeg = wtoeg;
    }

    public void serializeToJson(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
        objectWriter.writeValue(
                new File(fileName),
                this
        );
    }

    public static ChessMovesInstance deserializeFromJson(String fileName) throws IOException {
        return new ObjectMapper().readValue(
                new File(fileName),
                ChessMovesInstance.class
        );
    }

    @JsonIgnore
    public Instance getInstance(Instances dataSet) {
        Instance chessMovesInstance = new DenseInstance(36);
        chessMovesInstance.setDataset(dataSet);

        try {
            chessMovesInstance.setValue(0, bkblk.getValue());
            chessMovesInstance.setValue(1, bknwy.getValue());
            chessMovesInstance.setValue(2, bkon8.getValue());
            chessMovesInstance.setValue(3, bkona.getValue());
            chessMovesInstance.setValue(4, bkspr.getValue());
            chessMovesInstance.setValue(5, bkxbq.getValue());
            chessMovesInstance.setValue(6, bkxcr.getValue());
            chessMovesInstance.setValue(7, bkxwp.getValue());
            chessMovesInstance.setValue(8, blxwp.getValue());
            chessMovesInstance.setValue(9, bxqsq.getValue());
            chessMovesInstance.setValue(10, cntxt.getValue());
            chessMovesInstance.setValue(11, dsopp.getValue());
            chessMovesInstance.setValue(12, dwipd.getValue());
            chessMovesInstance.setValue(13, hdchk.getValue());
            chessMovesInstance.setValue(14, katri.getValue());
            chessMovesInstance.setValue(15, mulch.getValue());
            chessMovesInstance.setValue(16, qxmsq.getValue());
            chessMovesInstance.setValue(17, r2ar8.getValue());
            chessMovesInstance.setValue(18, reskd.getValue());
            chessMovesInstance.setValue(19, reskr.getValue());
            chessMovesInstance.setValue(20, rimmx.getValue());
            chessMovesInstance.setValue(21, rkxwp.getValue());
            chessMovesInstance.setValue(22, rxmsq.getValue());
            chessMovesInstance.setValue(23, simpl.getValue());
            chessMovesInstance.setValue(24, skach.getValue());
            chessMovesInstance.setValue(25, skewr.getValue());
            chessMovesInstance.setValue(26, skrxp.getValue());
            chessMovesInstance.setValue(27, spcop.getValue());
            chessMovesInstance.setValue(28, stlmt.getValue());
            chessMovesInstance.setValue(29, thrsk.getValue());
            chessMovesInstance.setValue(30, wkcti.getValue());
            chessMovesInstance.setValue(31, wkna8.getValue());
            chessMovesInstance.setValue(32, wknck.getValue());
            chessMovesInstance.setValue(33, wkovl.getValue());
            chessMovesInstance.setValue(34, wkpos.getValue());
            chessMovesInstance.setValue(35, wtoeg.getValue());
        } catch (NullPointerException e) {
            throw new NullPointerException("Oops, a attribute has not been set. Setup the instance and try again!");
        }

        return chessMovesInstance;
    }

    public Bkblk getBkblk() {
        return bkblk;
    }

    public Bknwy getBknwy() {
        return bknwy;
    }

    public Bkon8 getBkon8() {
        return bkon8;
    }

    public Bkona getBkona() {
        return bkona;
    }

    public Bkspr getBkspr() {
        return bkspr;
    }

    public Bkxbq getBkxbq() {
        return bkxbq;
    }

    public Bkxcr getBkxcr() {
        return bkxcr;
    }

    public Bkxwp getBkxwp() {
        return bkxwp;
    }

    public Blxwp getBlxwp() {
        return blxwp;
    }

    public Bxqsq getBxqsq() {
        return bxqsq;
    }

    public Cntxt getCntxt() {
        return cntxt;
    }

    public Dsopp getDsopp() {
        return dsopp;
    }

    public Dwipd getDwipd() {
        return dwipd;
    }

    public Hdchk getHdchk() {
        return hdchk;
    }

    public Katri getKatri() {
        return katri;
    }

    public Mulch getMulch() {
        return mulch;
    }

    public Qxmsq getQxmsq() {
        return qxmsq;
    }

    public R2ar8 getR2ar8() {
        return r2ar8;
    }

    public Reskd getReskd() {
        return reskd;
    }

    public Reskr getReskr() {
        return reskr;
    }

    public Rimmx getRimmx() {
        return rimmx;
    }

    public Rkxwp getRkxwp() {
        return rkxwp;
    }

    public Rxmsq getRxmsq() {
        return rxmsq;
    }

    public Simpl getSimpl() {
        return simpl;
    }

    public Skach getSkach() {
        return skach;
    }

    public Skewr getSkewr() {
        return skewr;
    }

    public Skrxp getSkrxp() {
        return skrxp;
    }

    public Spcop getSpcop() {
        return spcop;
    }

    public Stlmt getStlmt() {
        return stlmt;
    }

    public Thrsk getThrsk() {
        return thrsk;
    }

    public Wkcti getWkcti() {
        return wkcti;
    }

    public Wkna8 getWkna8() {
        return wkna8;
    }

    public Wknck getWknck() {
        return wknck;
    }

    public Wkovl getWkovl() {
        return wkovl;
    }

    public Wkpos getWkpos() {
        return wkpos;
    }

    public Wtoeg getWtoeg() {
        return wtoeg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChessMovesInstance that = (ChessMovesInstance) o;
        return bkblk == that.bkblk &&
                bknwy == that.bknwy &&
                bkon8 == that.bkon8 &&
                bkona == that.bkona &&
                bkspr == that.bkspr &&
                bkxbq == that.bkxbq &&
                bkxcr == that.bkxcr &&
                bkxwp == that.bkxwp &&
                blxwp == that.blxwp &&
                bxqsq == that.bxqsq &&
                cntxt == that.cntxt &&
                dsopp == that.dsopp &&
                dwipd == that.dwipd &&
                hdchk == that.hdchk &&
                katri == that.katri &&
                mulch == that.mulch &&
                qxmsq == that.qxmsq &&
                r2ar8 == that.r2ar8 &&
                reskd == that.reskd &&
                reskr == that.reskr &&
                rimmx == that.rimmx &&
                rkxwp == that.rkxwp &&
                rxmsq == that.rxmsq &&
                simpl == that.simpl &&
                skach == that.skach &&
                skewr == that.skewr &&
                skrxp == that.skrxp &&
                spcop == that.spcop &&
                stlmt == that.stlmt &&
                thrsk == that.thrsk &&
                wkcti == that.wkcti &&
                wkna8 == that.wkna8 &&
                wknck == that.wknck &&
                wkovl == that.wkovl &&
                wkpos == that.wkpos &&
                wtoeg == that.wtoeg;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bkblk, bknwy, bkon8, bkona, bkspr, bkxbq, bkxcr, bkxwp, blxwp, bxqsq, cntxt, dsopp, dwipd, hdchk, katri, mulch, qxmsq, r2ar8, reskd, reskr, rimmx, rkxwp, rxmsq, simpl, skach, skewr, skrxp, spcop, stlmt, thrsk, wkcti, wkna8, wknck, wkovl, wkpos, wtoeg);
    }
}
