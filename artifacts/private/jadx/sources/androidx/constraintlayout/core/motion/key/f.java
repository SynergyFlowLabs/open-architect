package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.utils.o;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class f extends b {
    static final String Q = "KeyTimeCycle";
    private static final String R = "KeyTimeCycle";
    public static final int S = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f43676y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f43677z = -1;
    private float A = Float.NaN;
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
    private int M = 0;
    private String N = null;
    private float O = Float.NaN;
    private float P = 0.0f;

    public f() {
        int i10 = 5 | 3;
        this.f43663k = 3;
        this.f43664l = new HashMap<>();
    }

    @Override // androidx.constraintlayout.core.motion.utils.v
    public int a(String str) {
        return v.c.a(str);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean b(int i10, int i11) {
        if (i10 == 100) {
            this.f43660h = i11;
            return true;
        }
        if (i10 != 421) {
            return super.b(i10, i11);
        }
        this.M = i11;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean c(int i10, float f10) {
        if (i10 == 315) {
            this.L = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 401) {
            this.f43677z = u(Float.valueOf(f10));
            return true;
        }
        if (i10 == 403) {
            this.A = f10;
            return true;
        }
        if (i10 == 416) {
            this.F = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 423) {
            this.O = t(Float.valueOf(f10));
            return true;
        }
        if (i10 == 424) {
            this.P = t(Float.valueOf(f10));
            return true;
        }
        switch (i10) {
            case 304:
                this.I = t(Float.valueOf(f10));
                return true;
            case 305:
                this.J = t(Float.valueOf(f10));
                return true;
            case 306:
                this.K = t(Float.valueOf(f10));
                return true;
            case 307:
                this.B = t(Float.valueOf(f10));
                return true;
            case 308:
                this.D = t(Float.valueOf(f10));
                return true;
            case 309:
                this.E = t(Float.valueOf(f10));
                return true;
            case 310:
                this.C = t(Float.valueOf(f10));
                return true;
            case 311:
                this.G = t(Float.valueOf(f10));
                return true;
            case 312:
                this.H = t(Float.valueOf(f10));
                return true;
            default:
                return super.c(i10, f10);
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean d(int i10, boolean z10) {
        return super.d(i10, z10);
    }

    @Override // androidx.constraintlayout.core.motion.key.b, androidx.constraintlayout.core.motion.utils.v
    public boolean e(int i10, String str) {
        if (i10 == 420) {
            this.f43676y = str;
        } else {
            if (i10 != 421) {
                return super.e(i10, str);
            }
            this.M = 7;
            this.N = str;
        }
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void f(HashMap<String, o> map) {
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: g */
    public b clone() {
        return new f().h(this);
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.A)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.B)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.C)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.D)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("translationZ");
        }
        if (this.f43664l.size() > 0) {
            Iterator<String> it = this.f43664l.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    public void v(HashMap<String, t> map) {
        for (String str : map.keySet()) {
            t tVar = map.get(str);
            if (tVar != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.D)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.D, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.E)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.E, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "rotationZ":
                            if (Float.isNaN(this.C)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.C, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.I)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.I, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.J)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.J, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.K, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.L)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.L, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.G)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.G, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.H)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.H, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.K)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.K, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.A)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.A, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        case "pathRotate":
                            if (Float.isNaN(this.F)) {
                                break;
                            } else {
                                tVar.c(this.f43660h, this.F, this.O, this.M, this.P);
                                break;
                            }
                            break;
                        default:
                            w.f("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.core.motion.b bVar = this.f43664l.get(str.substring(7));
                    if (bVar != null) {
                        ((t.b) tVar).g(this.f43660h, bVar, this.O, this.M, this.P);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public f h(b bVar) {
        super.h(bVar);
        f fVar = (f) bVar;
        this.f43676y = fVar.f43676y;
        this.f43677z = fVar.f43677z;
        this.M = fVar.M;
        this.O = fVar.O;
        this.P = fVar.P;
        this.L = fVar.L;
        this.A = fVar.A;
        this.B = fVar.B;
        this.C = fVar.C;
        this.F = fVar.F;
        this.D = fVar.D;
        this.E = fVar.E;
        this.G = fVar.G;
        this.H = fVar.H;
        this.I = fVar.I;
        this.J = fVar.J;
        this.K = fVar.K;
        return this;
    }
}
