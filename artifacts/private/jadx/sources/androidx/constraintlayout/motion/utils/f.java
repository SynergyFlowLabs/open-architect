package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.t;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f extends t {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f44971p = "ViewTimeCycle";

    static class a extends f {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setAlpha(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f44972q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f44973r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        SparseArray<float[]> f44974s = new SparseArray<>();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float[] f44975t;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f44972q = str.split(",")[1];
            this.f44973r = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void c(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override // androidx.constraintlayout.core.motion.utils.t
        public void f(int i10) {
            int size = this.f44973r.size();
            int iP = this.f44973r.valueAt(0).p();
            double[] dArr = new double[size];
            int i11 = iP + 2;
            this.f44975t = new float[i11];
            this.f43921g = new float[iP];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = this.f44973r.keyAt(i12);
                androidx.constraintlayout.widget.a aVarValueAt = this.f44973r.valueAt(i12);
                float[] fArrValueAt = this.f44974s.valueAt(i12);
                dArr[i12] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.l(this.f44975t);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.f44975t;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                double[] dArr3 = dArr2[i12];
                dArr3[iP] = fArrValueAt[0];
                dArr3[iP + 1] = fArrValueAt[1];
            }
            this.f43915a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            this.f43915a.e(f10, this.f44975t);
            float[] fArr = this.f44975t;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f43923i;
            if (Float.isNaN(this.f43924j)) {
                float fA = gVar.a(view, this.f44972q, 0);
                this.f43924j = fA;
                if (Float.isNaN(fA)) {
                    this.f43924j = 0.0f;
                }
            }
            float f13 = (float) ((((double) this.f43924j) + ((j11 * 1.0E-9d) * ((double) f11))) % 1.0d);
            this.f43924j = f13;
            this.f43923i = j10;
            float fA2 = a(f13);
            this.f43922h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f43921g;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f43922h;
                float f14 = this.f44975t[i10];
                this.f43922h = z10 | (((double) f14) != 0.0d);
                fArr2[i10] = (f14 * fA2) + f12;
                i10++;
            }
            androidx.constraintlayout.motion.utils.a.b(this.f44973r.valueAt(0), view, this.f43921g);
            if (f11 != 0.0f) {
                this.f43922h = true;
            }
            return this.f43922h;
        }

        public void k(int i10, androidx.constraintlayout.widget.a aVar, float f10, int i11, float f11) {
            this.f44973r.append(i10, aVar);
            this.f44974s.append(i10, new float[]{f10, f11});
            this.f43916b = Math.max(this.f43916b, i11);
        }
    }

    static class c extends f {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setElevation(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    public static class d extends f {
        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            return this.f43922h;
        }

        public boolean k(View view, androidx.constraintlayout.core.motion.utils.g gVar, float f10, long j10, double d10, double d11) {
            view.setRotation(g(f10, j10, view, gVar) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
            return this.f43922h;
        }
    }

    static class e extends f {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f44976q = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(g(f10, j10, view, gVar));
            } else {
                if (this.f44976q) {
                    return false;
                }
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f44976q = true;
                    method = null;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(g(f10, j10, view, gVar)));
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                }
            }
            return this.f43922h;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.f$f, reason: collision with other inner class name */
    static class C0366f extends f {
        C0366f() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotation(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class g extends f {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationX(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class h extends f {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setRotationY(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class i extends f {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleX(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class j extends f {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setScaleY(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class k extends f {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationX(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class l extends f {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationY(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    static class m extends f {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.f
        public boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar) {
            view.setTranslationZ(g(f10, j10, view, gVar));
            return this.f43922h;
        }
    }

    public static f h(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    public static f i(String str, long j10) {
        f gVar;
        str.getClass();
        switch (str) {
            case "rotationX":
                gVar = new g();
                break;
            case "rotationY":
                gVar = new h();
                break;
            case "translationX":
                gVar = new k();
                break;
            case "translationY":
                gVar = new l();
                break;
            case "translationZ":
                gVar = new m();
                break;
            case "progress":
                gVar = new e();
                break;
            case "scaleX":
                gVar = new i();
                break;
            case "scaleY":
                gVar = new j();
                break;
            case "rotation":
                gVar = new C0366f();
                break;
            case "elevation":
                gVar = new c();
                break;
            case "transitionPathRotate":
                gVar = new d();
                break;
            case "alpha":
                gVar = new a();
                break;
            default:
                return null;
        }
        gVar.d(j10);
        return gVar;
    }

    public float g(float f10, long j10, View view, androidx.constraintlayout.core.motion.utils.g gVar) {
        this.f43915a.e(f10, this.f43921g);
        float[] fArr = this.f43921g;
        float f11 = fArr[1];
        if (f11 == 0.0f) {
            this.f43922h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f43924j)) {
            float fA = gVar.a(view, this.f43920f, 0);
            this.f43924j = fA;
            if (Float.isNaN(fA)) {
                this.f43924j = 0.0f;
            }
        }
        float f12 = (float) ((((double) this.f43924j) + (((j10 - this.f43923i) * 1.0E-9d) * ((double) f11))) % 1.0d);
        this.f43924j = f12;
        gVar.b(view, this.f43920f, 0, f12);
        this.f43923i = j10;
        float f13 = this.f43921g[0];
        float fA2 = (a(this.f43924j) * f13) + this.f43921g[2];
        this.f43922h = (f13 == 0.0f && f11 == 0.0f) ? false : true;
        return fA2;
    }

    public abstract boolean j(View view, float f10, long j10, androidx.constraintlayout.core.motion.utils.g gVar);
}
