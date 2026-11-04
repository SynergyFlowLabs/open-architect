package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.v;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    static final String P = "KeyAttribute";
    private static final String Q = "KeyAttributes";
    private static final boolean R = false;
    public static final int S = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f43665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43666z = -1;
    private int A = 0;
    private float B = Float.NaN;
    private float C = Float.NaN;
    private float D = Float.NaN;
    private float E = Float.NaN;
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

    public c() {
        this.f43663k = 1;
        this.f43664l = new HashMap<>();
    }

    private float w(int i10) {
        if (i10 == 100) {
            return this.f43660h;
        }
        switch (i10) {
            case 303:
                return this.B;
            case 304:
                return this.L;
            case 305:
                return this.M;
            case 306:
                return this.N;
            case 307:
                return this.C;
            case 308:
                return this.E;
            case 309:
                return this.F;
            case 310:
                return this.D;
            case 311:
                return this.J;
            case 312:
                return this.K;
            case 313:
                return this.G;
            case 314:
                return this.H;
            case 315:
                return this.O;
            case v.a.f43974q /* 316 */:
                return this.I;
            default:
                return Float.NaN;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return v.a.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 == 100) {
            this.f43660h = i11;
        } else if (i10 == 301) {
            this.f43666z = i11;
        } else if (i10 == 302) {
            this.A = i11;
        } else if (!b(i10, i11)) {
            return super.b(i10, i11);
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (i10 != 100) {
            switch (i10) {
                case 303:
                    this.B = f10;
                    break;
                case 304:
                    this.L = f10;
                    break;
                case 305:
                    this.M = f10;
                    break;
                case 306:
                    this.N = f10;
                    break;
                case 307:
                    this.C = f10;
                    break;
                case 308:
                    this.E = f10;
                    break;
                case 309:
                    this.F = f10;
                    break;
                case 310:
                    this.D = f10;
                    break;
                case 311:
                    this.J = f10;
                    break;
                case 312:
                    this.K = f10;
                    break;
                case 313:
                    this.G = f10;
                    break;
                case 314:
                    this.H = f10;
                    break;
                case 315:
                    this.O = f10;
                    break;
                case v.a.f43974q /* 316 */:
                    this.I = f10;
                    break;
                default:
                    return super.c(i10, f10);
            }
        } else {
            this.I = f10;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 == 101) {
            this.f43662j = str;
        } else {
            if (i10 != 317) {
                return super.e(i10, str);
            }
            this.f43665y = str;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x004e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
        for (String str : map.keySet()) {
            o oVar = map.get(str);
            if (oVar != null) {
                byte b10 = 7;
                if (!str.startsWith("CUSTOM")) {
                    switch (str.hashCode()) {
                        case -1249320806:
                            if (str.equals("rotationX")) {
                                b10 = 0;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1249320805:
                            if (str.equals("rotationY")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1249320804:
                            if (str.equals("rotationZ")) {
                                b10 = 2;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497657:
                            if (str.equals("translationX")) {
                                b10 = 3;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497656:
                            if (str.equals("translationY")) {
                                b10 = 4;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1225497655:
                            if (str.equals("translationZ")) {
                                b10 = 5;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -1001078227:
                            if (str.equals("progress")) {
                                b10 = 6;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -987906986:
                            if (!str.equals("pivotX")) {
                                b10 = -1;
                            }
                            break;
                        case -987906985:
                            if (str.equals("pivotY")) {
                                b10 = 8;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -908189618:
                            if (str.equals("scaleX")) {
                                b10 = 9;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -908189617:
                            if (str.equals("scaleY")) {
                                b10 = 10;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case -4379043:
                            if (str.equals("elevation")) {
                                b10 = 11;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 92909918:
                            if (str.equals("alpha")) {
                                b10 = com.google.common.base.c.f116461n;
                            } else {
                                b10 = -1;
                            }
                            break;
                        case 803192288:
                            if (str.equals("pathRotate")) {
                                b10 = com.google.common.base.c.f116462o;
                            } else {
                                b10 = -1;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        case 0:
                            if (!Float.isNaN(this.E)) {
                                oVar.g(this.f43660h, this.E);
                            }
                            break;
                        case 1:
                            if (!Float.isNaN(this.F)) {
                                oVar.g(this.f43660h, this.F);
                            }
                            break;
                        case 2:
                            if (!Float.isNaN(this.D)) {
                                oVar.g(this.f43660h, this.D);
                            }
                            break;
                        case 3:
                            if (!Float.isNaN(this.L)) {
                                oVar.g(this.f43660h, this.L);
                            }
                            break;
                        case 4:
                            if (!Float.isNaN(this.M)) {
                                oVar.g(this.f43660h, this.M);
                            }
                            break;
                        case 5:
                            if (!Float.isNaN(this.N)) {
                                oVar.g(this.f43660h, this.N);
                            }
                            break;
                        case 6:
                            if (!Float.isNaN(this.O)) {
                                oVar.g(this.f43660h, this.O);
                            }
                            break;
                        case 7:
                            if (!Float.isNaN(this.E)) {
                                oVar.g(this.f43660h, this.G);
                            }
                            break;
                        case 8:
                            if (!Float.isNaN(this.F)) {
                                oVar.g(this.f43660h, this.H);
                            }
                            break;
                        case 9:
                            if (!Float.isNaN(this.J)) {
                                oVar.g(this.f43660h, this.J);
                            }
                            break;
                        case 10:
                            if (!Float.isNaN(this.K)) {
                                oVar.g(this.f43660h, this.K);
                            }
                            break;
                        case 11:
                            if (!Float.isNaN(this.C)) {
                                oVar.g(this.f43660h, this.C);
                            }
                            break;
                        case 12:
                            if (!Float.isNaN(this.B)) {
                                oVar.g(this.f43660h, this.B);
                            }
                            break;
                        case 13:
                            if (!Float.isNaN(this.I)) {
                                oVar.g(this.f43660h, this.I);
                            }
                            break;
                        default:
                            System.err.println("not supported by KeyAttributes " + str);
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.b bVar = this.f43664l.get(str.substring(7));
                    if (bVar != null) {
                        ((o.c) oVar).k(this.f43660h, bVar);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.B)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("progress");
        }
        if (this.f43664l.size() > 0) {
            Iterator<String> it = this.f43664l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void q(HashMap<String, Integer> map) {
        if (!Float.isNaN(this.B)) {
            map.put("alpha", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.C)) {
            map.put("elevation", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.D)) {
            map.put("rotationZ", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.E)) {
            map.put("rotationX", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.F)) {
            map.put("rotationY", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.G)) {
            map.put("pivotX", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.H)) {
            map.put("pivotY", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.L)) {
            map.put("translationX", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.M)) {
            map.put("translationY", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.N)) {
            map.put("translationZ", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.I)) {
            map.put("pathRotate", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.J)) {
            map.put("scaleX", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.K)) {
            map.put("scaleY", Integer.valueOf(this.f43666z));
        }
        if (!Float.isNaN(this.O)) {
            map.put("progress", Integer.valueOf(this.f43666z));
        }
        if (this.f43664l.size() > 0) {
            Iterator<String> it = this.f43664l.keySet().iterator();
            while (it.hasNext()) {
                map.put("CUSTOM," + it.next(), Integer.valueOf(this.f43666z));
            }
        }
    }

    public int v() {
        return this.f43666z;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        System.out.println(" ------------- " + this.f43660h + " -------------");
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int iA = v.a.a(strArr[i10]);
            System.out.println(strArr[i10] + ":" + w(iA));
        }
    }
}
