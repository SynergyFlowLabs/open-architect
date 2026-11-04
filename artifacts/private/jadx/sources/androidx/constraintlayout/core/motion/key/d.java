package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.h;
import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class d extends b {
    private static final String R = "KeyCycle";
    static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f43667a0 = 3;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f43668b0 = 4;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f43669c0 = 5;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f43670d0 = 6;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f43671e0 = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f43672y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43673z = 0;
    private int A = -1;
    private String B = null;
    private float C = Float.NaN;
    private float D = 0.0f;
    private float E = 0.0f;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;

    public d() {
        this.f43663k = 4;
        this.f43664l = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        byte b10;
        str.getClass();
        switch (str.hashCode()) {
            case -1581616630:
                if (!str.equals(v.c.P)) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case -1310311125:
                if (!str.equals("easing")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            case -1249320806:
                if (!str.equals("rotationX")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -1249320805:
                if (!str.equals("rotationY")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1249320804:
                if (!str.equals("rotationZ")) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case -1225497657:
                if (!str.equals("translationX")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case -1225497656:
                if (!str.equals("translationY")) {
                    b10 = -1;
                } else {
                    b10 = 6;
                }
                break;
            case -1225497655:
                if (!str.equals("translationZ")) {
                    b10 = -1;
                } else {
                    b10 = 7;
                }
                break;
            case -1019779949:
                if (!str.equals(v.c.R)) {
                    b10 = -1;
                } else {
                    b10 = 8;
                }
                break;
            case -1001078227:
                if (!str.equals("progress")) {
                    b10 = -1;
                } else {
                    b10 = 9;
                }
                break;
            case -991726143:
                if (!str.equals(v.c.Q)) {
                    b10 = -1;
                } else {
                    b10 = 10;
                }
                break;
            case -987906986:
                if (!str.equals("pivotX")) {
                    b10 = -1;
                } else {
                    b10 = 11;
                }
                break;
            case -987906985:
                if (!str.equals("pivotY")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case -908189618:
                if (!str.equals("scaleX")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case -908189617:
                if (!str.equals("scaleY")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 92909918:
                if (!str.equals("alpha")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
            case 106629499:
                if (!str.equals(v.c.S)) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116465r;
                }
                break;
            case 579057826:
                if (!str.equals("curveFit")) {
                    b10 = -1;
                } else {
                    b10 = 17;
                }
                break;
            case 803192288:
                if (!str.equals("pathRotate")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116468u;
                }
                break;
            case 1532805160:
                if (!str.equals("waveShape")) {
                    b10 = -1;
                } else {
                    b10 = 19;
                }
                break;
            case 1941332754:
                if (!str.equals("visibility")) {
                    b10 = -1;
                } else {
                    b10 = com.google.common.base.c.f116471x;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                return 422;
            case 1:
                return v.c.f44017r;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case 8:
                return v.c.f44021v;
            case 9:
                return 315;
            case 10:
                return v.c.f44020u;
            case 11:
                return 313;
            case 12:
                return 314;
            case 13:
                return 311;
            case 14:
                return 312;
            case 15:
                return 403;
            case 16:
                return v.c.f44022w;
            case 17:
                return 401;
            case 18:
                return v.c.f44016q;
            case 19:
                return 421;
            case 20:
                return 402;
            default:
                return -1;
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 == 401) {
            this.f43673z = i11;
            return true;
        }
        if (i10 == 421) {
            this.A = i11;
            return true;
        }
        if (c(i10, i11)) {
            return true;
        }
        return super.b(i10, i11);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (i10 == 315) {
            this.F = f10;
        } else if (i10 == 403) {
            this.G = f10;
        } else if (i10 != 416) {
            switch (i10) {
                case 304:
                    this.O = f10;
                    break;
                case 305:
                    this.P = f10;
                    break;
                case 306:
                    this.Q = f10;
                    break;
                case 307:
                    this.H = f10;
                    break;
                case 308:
                    this.K = f10;
                    break;
                case 309:
                    this.L = f10;
                    break;
                case 310:
                    this.I = f10;
                    break;
                case 311:
                    this.M = f10;
                    break;
                case 312:
                    this.N = f10;
                    break;
                default:
                    switch (i10) {
                        case v.c.f44020u /* 423 */:
                            this.C = f10;
                            break;
                        case v.c.f44021v /* 424 */:
                            this.D = f10;
                            break;
                        case v.c.f44022w /* 425 */:
                            this.E = f10;
                            break;
                        default:
                            return super.c(i10, f10);
                    }
                    break;
            }
        } else {
            this.J = f10;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 == 420) {
            this.f43672y = str;
            return true;
        }
        if (i10 != 422) {
            return super.e(i10, str);
        }
        this.B = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.G)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationZ");
        }
        if (this.f43664l.size() > 0) {
            Iterator<String> it = this.f43664l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, h> map) {
        h hVar;
        h hVar2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.core.motion.b bVar = this.f43664l.get(str.substring(7));
                if (bVar != null && bVar.m() == 901 && (hVar = map.get(str)) != null) {
                    hVar.g(this.f43660h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, bVar.n(), bVar);
                }
            } else {
                float fX = x(str);
                if (!Float.isNaN(fX) && (hVar2 = map.get(str)) != null) {
                    hVar2.f(this.f43660h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, fX);
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + AbstractJsonLexerKt.END_OBJ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public float x(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 1;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    b10 = 2;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 3;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 4;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 5;
                }
                break;
            case -1019779949:
                if (str.equals(v.c.R)) {
                    b10 = 6;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 7;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 8;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = 11;
                }
                break;
            case 106629499:
                if (str.equals(v.c.S)) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
        }
        switch (b10) {
            case 0:
                return this.K;
            case 1:
                return this.L;
            case 2:
                return this.I;
            case 3:
                return this.O;
            case 4:
                return this.P;
            case 5:
                return this.Q;
            case 6:
                return this.D;
            case 7:
                return this.F;
            case 8:
                return this.M;
            case 9:
                return this.N;
            case 10:
                return this.H;
            case 11:
                return this.G;
            case 12:
                return this.E;
            case 13:
                return this.J;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        w.c(" ------------- " + this.f43660h + " -------------");
        w.c("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + AbstractJsonLexerKt.END_OBJ);
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            w.c(strArr[i10] + ":" + x(strArr[i10]));
        }
    }
}
