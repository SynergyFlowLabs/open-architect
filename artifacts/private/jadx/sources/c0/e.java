package c0;

import androidx.compose.runtime.internal.w0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f82365a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final double[][] f82366b = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final double[][] f82367c = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final double[] f82368d = {0.2126d, 0.7152d, 0.0722d};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final double[] f82369e = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f82370f = 8;

    private e() {
    }

    private final boolean a(double d10, double d11, double d12) {
        return o(d11 - d10) < o(d12 - d10);
    }

    private final int b(double d10, double d11) {
        int iE;
        int iF;
        int i10;
        e eVar = this;
        double[][] dArrC = c(d10, d11);
        double[] dArr = dArrC[0];
        double dH = eVar.h(dArr);
        double[] dArr2 = dArrC[1];
        int i11 = 0;
        while (i11 < 3) {
            double d12 = dArr[i11];
            double d13 = dArr2[i11];
            if (d12 == d13) {
                i10 = i11;
            } else {
                if (d12 < d13) {
                    iE = eVar.f(eVar.r(d12));
                    iF = eVar.e(eVar.r(dArr2[i11]));
                } else {
                    iE = eVar.e(eVar.r(d12));
                    iF = eVar.f(eVar.r(dArr2[i11]));
                }
                int i12 = iE;
                int i13 = 0;
                int i14 = iF;
                double d14 = dH;
                double[] dArr3 = dArr2;
                double[] dArr4 = dArr;
                while (i13 < 8 && Math.abs(i14 - i12) > 1.0d) {
                    int iFloor = (int) Math.floor(((double) (i12 + i14)) / 2.0d);
                    double[] dArrP = eVar.p(dArr4, f82369e[iFloor], dArr3, i11);
                    double[] dArr5 = dArr4;
                    double[] dArr6 = dArr3;
                    int i15 = i11;
                    double dH2 = eVar.h(dArrP);
                    double d15 = d14;
                    if (eVar.a(d15, d11, dH2)) {
                        d14 = d15;
                        i14 = iFloor;
                        dArr3 = dArrP;
                        dArr4 = dArr5;
                    } else {
                        d14 = dH2;
                        i12 = iFloor;
                        dArr4 = dArrP;
                        dArr3 = dArr6;
                    }
                    i13++;
                    eVar = this;
                    i11 = i15;
                }
                i10 = i11;
                dH = d14;
                dArr = dArr4;
                dArr2 = dArr3;
            }
            i11 = i10 + 1;
            eVar = this;
        }
        double d16 = 2;
        return b.f82345a.a((dArr[0] + dArr2[0]) / d16, (dArr[1] + dArr2[1]) / d16, (dArr[2] + dArr2[2]) / d16);
    }

    private final double[][] c(double d10, double d11) {
        double d12;
        char c10 = 0;
        double[] dArr = {-1.0d, -1.0d, -1.0d};
        double[] dArr2 = dArr;
        int i10 = 0;
        boolean z10 = false;
        char c11 = 1;
        double d13 = 0.0d;
        double d14 = 0.0d;
        while (i10 < 12) {
            char c12 = c10;
            double[] dArrM = m(d10, i10);
            if (dArrM[c12] < 0.0d) {
                d12 = d14;
            } else {
                double dH = h(dArrM);
                if (z10) {
                    if (c11 == 0) {
                        d12 = d14;
                        if (a(d13, dH, d14)) {
                        }
                    } else {
                        d12 = d14;
                    }
                    if (a(d13, d11, dH)) {
                        d14 = dH;
                        dArr2 = dArrM;
                        c11 = c12;
                    } else {
                        d13 = dH;
                        dArr = dArrM;
                        c11 = c12;
                    }
                } else {
                    d13 = dH;
                    d14 = d13;
                    dArr = dArrM;
                    dArr2 = dArr;
                    z10 = true;
                }
                i10++;
                c10 = c12;
            }
            d14 = d12;
            i10++;
            c10 = c12;
        }
        return new double[][]{dArr, dArr2};
    }

    private final double d(double d10) {
        double dPow = Math.pow(Math.abs(d10), 0.42d);
        return ((((double) b.f82345a.n(d10)) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    private final int e(double d10) {
        return (int) Math.ceil(d10 - 0.5d);
    }

    private final int f(double d10) {
        return (int) Math.floor(d10 - 0.5d);
    }

    private final int g(double d10, double d11, double d12) {
        double dSqrt = Math.sqrt(d12) * 11.0d;
        c cVarA = c.f82352k.a();
        char c10 = 1;
        double dPow = ((double) 1) / Math.pow(1.64d - Math.pow(0.29d, cVarA.f()), 0.73d);
        double dCos = (Math.cos(d10 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * ((double) cVarA.h()) * ((double) cVarA.i());
        double dSin = Math.sin(d10);
        double dCos2 = Math.cos(d10);
        int i10 = 0;
        while (i10 < 5) {
            char c11 = c10;
            double d13 = dPow;
            double d14 = dSqrt / 100.0d;
            int i11 = i10;
            double d15 = dSqrt;
            double dPow2 = Math.pow(((d11 == 0.0d || dSqrt == 0.0d) ? 0.0d : d11 / Math.sqrt(d14)) * d13, 1.1111111111111112d);
            double dB = (((double) cVarA.b()) * Math.pow(d14, (1.0d / ((double) cVarA.c())) / ((double) cVarA.k()))) / ((double) cVarA.g());
            double d16 = (((0.305d + dB) * 23.0d) * dPow2) / (((23.0d * dCos) + ((((double) 11) * dPow2) * dCos2)) + ((108.0d * dPow2) * dSin));
            double d17 = d16 * dCos2;
            double d18 = d16 * dSin;
            double d19 = 460.0d * dB;
            double d20 = (((451.0d * d17) + d19) + (288.0d * d18)) / 1403.0d;
            c cVar = cVarA;
            double d21 = ((d19 - (891.0d * d17)) - (261.0d * d18)) / 1403.0d;
            double d22 = ((d19 - (220.0d * d17)) - (6300.0d * d18)) / 1403.0d;
            double dJ = j(d20);
            double dJ2 = j(d21);
            double dJ3 = j(d22);
            double[][] dArr = f82367c;
            double[] dArr2 = dArr[0];
            double d23 = (dArr2[0] * dJ) + (dArr2[c11] * dJ2) + (dArr2[2] * dJ3);
            double[] dArr3 = dArr[c11];
            double d24 = (dArr3[0] * dJ) + (dArr3[c11] * dJ2) + (dArr3[2] * dJ3);
            double[] dArr4 = dArr[2];
            double d25 = (dJ * dArr4[0]) + (dJ2 * dArr4[c11]) + (dJ3 * dArr4[2]);
            if (d23 >= 0.0d && d24 >= 0.0d && d25 >= 0.0d) {
                double[] dArr5 = f82368d;
                double d26 = (dArr5[0] * d23) + (dArr5[c11] * d24) + (dArr5[2] * d25);
                if (d26 <= 0.0d) {
                    return 0;
                }
                if (i11 != 4) {
                    double d27 = d26 - d12;
                    if (Math.abs(d27) >= 0.002d) {
                        dSqrt = d15 - ((d27 * d15) / (((double) 2) * d26));
                        i10 = i11 + 1;
                        c10 = c11;
                        dPow = d13;
                        cVarA = cVar;
                    }
                }
                if (d23 <= 100.01d && d24 <= 100.01d && d25 <= 100.01d) {
                    return b.f82345a.a(d23, d24, d25);
                }
            }
            return 0;
        }
        return 0;
    }

    private final double h(double[] dArr) {
        double[][] dArr2 = f82366b;
        double d10 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d11 = dArr3[0] * d10;
        double d12 = dArr[1];
        double d13 = d11 + (dArr3[1] * d12);
        double d14 = dArr[2];
        double d15 = d13 + (dArr3[2] * d14);
        double[] dArr4 = dArr2[1];
        double d16 = (dArr4[0] * d10) + (dArr4[1] * d12) + (dArr4[2] * d14);
        double[] dArr5 = dArr2[2];
        double d17 = (d10 * dArr5[0]) + (d12 * dArr5[1]) + (d14 * dArr5[2]);
        double d18 = d(d15);
        double d19 = d(d16);
        double d20 = d(d17);
        return Math.atan2(((d18 + d19) - (d20 * 2.0d)) / 9.0d, (((d18 * 11.0d) + ((-12.0d) * d19)) + d20) / 11.0d);
    }

    private final double i(double d10, double d11, double d12) {
        return d12 == d10 ? d12 : (d11 - d10) / (d12 - d10);
    }

    private final double j(double d10) {
        double dAbs = Math.abs(d10);
        return ((double) b.f82345a.n(d10)) * Math.pow(Math.max(0.0d, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d);
    }

    private final boolean k(double d10) {
        return 0.0d <= d10 && d10 <= 100.0d;
    }

    private final double[] l(double[] dArr, double d10, double[] dArr2) {
        double d11 = dArr[0];
        double d12 = d11 + ((dArr2[0] - d11) * d10);
        double d13 = dArr[1];
        double d14 = d13 + ((dArr2[1] - d13) * d10);
        double d15 = dArr[2];
        return new double[]{d12, d14, d15 + ((dArr2[2] - d15) * d10)};
    }

    private final double[] m(double d10, int i10) {
        double[] dArr = f82368d;
        double d11 = dArr[0];
        double d12 = dArr[1];
        double d13 = dArr[2];
        double d14 = i10 % 4 <= 1 ? 0.0d : 100.0d;
        double d15 = i10 % 2 == 0 ? 0.0d : 100.0d;
        if (i10 < 4) {
            double d16 = ((d10 - (d12 * d14)) - (d13 * d15)) / d11;
            return k(d16) ? new double[]{d16, d14, d15} : new double[]{-1.0d, -1.0d, -1.0d};
        }
        if (i10 < 8) {
            double d17 = ((d10 - (d11 * d15)) - (d13 * d14)) / d12;
            return k(d17) ? new double[]{d15, d17, d14} : new double[]{-1.0d, -1.0d, -1.0d};
        }
        double d18 = ((d10 - (d11 * d14)) - (d12 * d15)) / d13;
        return k(d18) ? new double[]{d14, d15, d18} : new double[]{-1.0d, -1.0d, -1.0d};
    }

    private final double n(double d10) {
        double d11 = d10 % 360.0d;
        return d11 < 0.0d ? d11 + 360.0d : d11;
    }

    private final double o(double d10) {
        return (d10 + 25.132741228718345d) % 6.283185307179586d;
    }

    private final double[] p(double[] dArr, double d10, double[] dArr2, int i10) {
        return l(dArr, i(dArr[i10], d10, dArr2[i10]), dArr2);
    }

    private final double r(double d10) {
        double d11 = d10 / 100.0d;
        return (d11 <= 0.0031308d ? d11 * 12.92d : (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d) * ((double) 255);
    }

    public final int q(double d10, double d11, double d12) {
        if (d11 >= 1.0E-4d && d12 >= 1.0E-4d && d12 <= 99.9999d) {
            double radians = Math.toRadians(n(d10));
            double dQ = b.f82345a.q(d12);
            int iG = g(radians, d11, dQ);
            return iG != 0 ? iG : b(dQ, radians);
        }
        return b.f82345a.b(d12);
    }
}
