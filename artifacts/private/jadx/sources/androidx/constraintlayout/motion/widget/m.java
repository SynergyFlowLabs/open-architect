package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class m extends f {
    public static final String Y = "viewTransitionOnCross";
    public static final String Z = "viewTransitionOnPositiveCross";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f45251a0 = "viewTransitionOnNegativeCross";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f45252b0 = "postLayout";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f45253c0 = "triggerSlack";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f45254d0 = "triggerCollisionView";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f45255e0 = "triggerCollisionId";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f45256f0 = "triggerID";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f45257g0 = "positiveCross";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f45258h0 = "negativeCross";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f45259i0 = "triggerReceiver";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f45260j0 = "CROSS";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f45261k0 = 5;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    static final String f45262l0 = "KeyTrigger";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f45263m0 = "KeyTrigger";
    float D = 0.1f;
    int E;
    int F;
    int G;
    RectF H;
    RectF I;
    HashMap<String, Method> J;
    private int K;
    private String L;
    private int M;
    private String N;
    private String O;
    private int P;
    private int Q;
    private View R;
    private boolean S;
    private boolean T;
    private boolean U;
    private float V;
    private float W;
    private boolean X;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final int f45264a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f45265b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f45266c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f45267d = 5;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f45268e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f45269f = 7;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f45270g = 8;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f45271h = 9;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f45272i = 10;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f45273j = 11;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f45274k = 12;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f45275l = 13;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f45276m = 14;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f45277n;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f45277n = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.j.c.Qa, 8);
            f45277n.append(androidx.constraintlayout.widget.j.c.Ua, 4);
            f45277n.append(androidx.constraintlayout.widget.j.c.Va, 1);
            f45277n.append(androidx.constraintlayout.widget.j.c.Wa, 2);
            f45277n.append(androidx.constraintlayout.widget.j.c.Ra, 7);
            f45277n.append(androidx.constraintlayout.widget.j.c.Xa, 6);
            f45277n.append(androidx.constraintlayout.widget.j.c.Za, 5);
            f45277n.append(androidx.constraintlayout.widget.j.c.Ta, 9);
            f45277n.append(androidx.constraintlayout.widget.j.c.Sa, 10);
            f45277n.append(androidx.constraintlayout.widget.j.c.Ya, 11);
            f45277n.append(androidx.constraintlayout.widget.j.c.f46359ab, 12);
            f45277n.append(androidx.constraintlayout.widget.j.c.f46376bb, 13);
            f45277n.append(androidx.constraintlayout.widget.j.c.f46393cb, 14);
        }

        private a() {
        }

        public static void a(m mVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (f45277n.get(index)) {
                    case 1:
                        mVar.N = typedArray.getString(index);
                        break;
                    case 2:
                        mVar.O = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Integer.toHexString(index);
                        f45277n.get(index);
                        break;
                    case 4:
                        mVar.L = typedArray.getString(index);
                        break;
                    case 5:
                        mVar.D = typedArray.getFloat(index, mVar.D);
                        break;
                    case 6:
                        mVar.P = typedArray.getResourceId(index, mVar.P);
                        break;
                    case 7:
                        if (MotionLayout.f44987u4) {
                            int resourceId = typedArray.getResourceId(index, mVar.f45143b);
                            mVar.f45143b = resourceId;
                            if (resourceId == -1) {
                                mVar.f45144c = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            mVar.f45144c = typedArray.getString(index);
                        } else {
                            mVar.f45143b = typedArray.getResourceId(index, mVar.f45143b);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, mVar.f45142a);
                        mVar.f45142a = integer;
                        mVar.V = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        mVar.Q = typedArray.getResourceId(index, mVar.Q);
                        break;
                    case 10:
                        mVar.X = typedArray.getBoolean(index, mVar.X);
                        break;
                    case 11:
                        mVar.M = typedArray.getResourceId(index, mVar.M);
                        break;
                    case 12:
                        mVar.G = typedArray.getResourceId(index, mVar.G);
                        break;
                    case 13:
                        mVar.E = typedArray.getResourceId(index, mVar.E);
                        break;
                    case 14:
                        mVar.F = typedArray.getResourceId(index, mVar.F);
                        break;
                }
            }
        }
    }

    public m() {
        int i10 = f.f45121f;
        this.E = i10;
        this.F = i10;
        this.G = i10;
        this.H = new RectF();
        this.I = new RectF();
        this.J = new HashMap<>();
        this.K = -1;
        this.L = null;
        int i11 = f.f45121f;
        this.M = i11;
        this.N = null;
        this.O = null;
        this.P = i11;
        this.Q = i11;
        this.R = null;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = Float.NaN;
        this.X = false;
        this.f45145d = 5;
        this.f45146e = new HashMap<>();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v11 java.lang.reflect.Method, still in use, count: 2, list:
          (r0v11 java.lang.reflect.Method) from 0x0028: IF  (r0v11 java.lang.reflect.Method) == (null java.lang.reflect.Method)  -> B:13:0x002a A[HIDDEN]
          (r0v11 java.lang.reflect.Method) from 0x002d: PHI (r0 I:??) = (r0v4 java.lang.reflect.Method), (r0v11 java.lang.reflect.Method) binds: [B:15:0x002c, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    private void B(java.lang.String r5, android.view.View r6) {
        /*
            r4 = this;
            java.lang.String r3 = "Androeed.ru"
            if (r5 != 0) goto L5
            goto L2a
        L5:
            java.lang.String r0 = "."
            r3 = 1
            boolean r0 = r5.startsWith(r0)
            r3 = 3
            if (r0 == 0) goto L15
            r3 = 0
            r4.C(r5, r6)
            r3 = 5
            return
        L15:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r0 = r4.J
            boolean r0 = r0.containsKey(r5)
            r1 = 6
            r1 = 0
            if (r0 == 0) goto L2c
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r0 = r4.J
            r3 = 3
            java.lang.Object r0 = r0.get(r5)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 != 0) goto L2d
        L2a:
            r3 = 5
            return
        L2c:
            r0 = r1
        L2d:
            if (r0 != 0) goto L4a
            java.lang.Class r0 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L3d
            java.lang.reflect.Method r0 = r0.getMethod(r5, r1)     // Catch: java.lang.NoSuchMethodException -> L3d
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r2 = r4.J     // Catch: java.lang.NoSuchMethodException -> L3d
            r2.put(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L3d
            goto L4a
        L3d:
            java.util.HashMap<java.lang.String, java.lang.reflect.Method> r4 = r4.J
            r4.put(r5, r1)
            r6.getClass()
            androidx.constraintlayout.motion.widget.c.k(r6)
            r3 = 7
            return
        L4a:
            r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L4f
            r3 = 5
            return
        L4f:
            r6.getClass()
            r3 = 6
            androidx.constraintlayout.motion.widget.c.k(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.m.B(java.lang.String, android.view.View):void");
    }

    private void C(String str, View view) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f45146e.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                androidx.constraintlayout.widget.a aVar = this.f45146e.get(str2);
                if (aVar != null) {
                    aVar.a(view);
                }
            }
        }
    }

    private void E(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ff  */
    public void A(float f10, View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        float f11;
        float f12;
        float f13;
        float f14;
        boolean z13;
        boolean z14 = true;
        boolean z15 = false;
        if (this.Q != f.f45121f) {
            if (this.R == null) {
                this.R = ((ViewGroup) view.getParent()).findViewById(this.Q);
            }
            E(this.H, this.R, this.X);
            E(this.I, view, this.X);
            if (this.H.intersect(this.I)) {
                if (this.S) {
                    this.S = false;
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.U) {
                    this.U = false;
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.T = true;
            } else {
                if (this.S) {
                    z10 = false;
                } else {
                    this.S = true;
                    z10 = true;
                }
                if (this.T) {
                    this.T = false;
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.U = true;
                z15 = z13;
                z12 = false;
            }
        } else {
            if (this.S) {
                float f15 = this.V;
                if ((f10 - f15) * (this.W - f15) < 0.0f) {
                    this.S = false;
                    z10 = true;
                }
                if (this.T) {
                    f13 = this.V;
                    f14 = f10 - f13;
                    if ((this.W - f13) * f14 >= 0.0f && f14 < 0.0f) {
                        this.T = false;
                        z11 = true;
                    }
                    if (this.U) {
                        f11 = this.V;
                        f12 = f10 - f11;
                        if ((this.W - f11) * f12 < 0.0f || f12 <= 0.0f) {
                            z14 = false;
                        } else {
                            this.U = false;
                        }
                        z12 = z14;
                    } else {
                        if (Math.abs(f10 - this.V) > this.D) {
                            this.U = true;
                        }
                        z12 = false;
                    }
                    z15 = z11;
                } else if (Math.abs(f10 - this.V) > this.D) {
                    this.T = true;
                }
                z11 = false;
                if (this.U) {
                    f11 = this.V;
                    f12 = f10 - f11;
                    if ((this.W - f11) * f12 < 0.0f) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    z12 = z14;
                } else {
                    if (Math.abs(f10 - this.V) > this.D) {
                        this.U = true;
                    }
                    z12 = false;
                }
                z15 = z11;
            } else if (Math.abs(f10 - this.V) > this.D) {
                this.S = true;
            }
            z10 = false;
            if (this.T) {
                f13 = this.V;
                f14 = f10 - f13;
                if ((this.W - f13) * f14 >= 0.0f) {
                }
                if (this.U) {
                    f11 = this.V;
                    f12 = f10 - f11;
                    if ((this.W - f11) * f12 < 0.0f) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    z12 = z14;
                } else {
                    if (Math.abs(f10 - this.V) > this.D) {
                        this.U = true;
                    }
                    z12 = false;
                }
                z15 = z11;
            } else if (Math.abs(f10 - this.V) > this.D) {
                this.T = true;
            }
            z11 = false;
            if (this.U) {
                f11 = this.V;
                f12 = f10 - f11;
                if ((this.W - f11) * f12 < 0.0f) {
                    z14 = false;
                } else {
                    z14 = false;
                }
                z12 = z14;
            } else {
                if (Math.abs(f10 - this.V) > this.D) {
                    this.U = true;
                }
                z12 = false;
            }
            z15 = z11;
        }
        this.W = f10;
        if (z15 || z10 || z12) {
            ((MotionLayout) view.getParent()).n0(this.P, z12, f10);
        }
        View viewFindViewById = this.M == f.f45121f ? view : ((MotionLayout) view.getParent()).findViewById(this.M);
        if (z15) {
            String str = this.N;
            if (str != null) {
                B(str, viewFindViewById);
            }
            if (this.E != f.f45121f) {
                ((MotionLayout) view.getParent()).c1(this.E, viewFindViewById);
            }
        }
        if (z12) {
            String str2 = this.O;
            if (str2 != null) {
                B(str2, viewFindViewById);
            }
            if (this.F != f.f45121f) {
                ((MotionLayout) view.getParent()).c1(this.F, viewFindViewById);
            }
        }
        if (z10) {
            String str3 = this.L;
            if (str3 != null) {
                B(str3, viewFindViewById);
            }
            if (this.G != f.f45121f) {
                ((MotionLayout) view.getParent()).c1(this.G, viewFindViewById);
            }
        }
    }

    int D() {
        return this.K;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void a(HashMap<String, androidx.constraintlayout.motion.utils.d> map) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    /* JADX INFO: renamed from: b */
    public f clone() {
        return new m().c(this);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public f c(f fVar) {
        super.c(fVar);
        m mVar = (m) fVar;
        this.K = mVar.K;
        this.L = mVar.L;
        this.M = mVar.M;
        this.N = mVar.N;
        this.O = mVar.O;
        this.P = mVar.P;
        this.Q = mVar.Q;
        this.R = mVar.R;
        this.D = mVar.D;
        this.S = mVar.S;
        this.T = mVar.T;
        this.U = mVar.U;
        this.V = mVar.V;
        this.W = mVar.W;
        this.X = mVar.X;
        this.H = mVar.H;
        this.I = mVar.I;
        this.J = mVar.J;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void d(HashSet<String> hashSet) {
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void f(Context context, AttributeSet attributeSet) {
        a.a(this, context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.c.Pa), context);
    }

    @Override // androidx.constraintlayout.motion.widget.f
    public void j(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "positiveCross":
                this.O = obj.toString();
                break;
            case "viewTransitionOnPositiveCross":
                this.F = n(obj);
                break;
            case "triggerCollisionId":
                this.Q = n(obj);
                break;
            case "triggerID":
                this.P = n(obj);
                break;
            case "negativeCross":
                this.N = obj.toString();
                break;
            case "triggerCollisionView":
                this.R = (View) obj;
                break;
            case "viewTransitionOnNegativeCross":
                this.E = n(obj);
                break;
            case "CROSS":
                this.L = obj.toString();
                break;
            case "triggerSlack":
                this.D = m(obj);
                break;
            case "viewTransitionOnCross":
                this.G = n(obj);
                break;
            case "postLayout":
                this.X = l(obj);
                break;
            case "triggerReceiver":
                this.M = n(obj);
                break;
        }
    }
}
