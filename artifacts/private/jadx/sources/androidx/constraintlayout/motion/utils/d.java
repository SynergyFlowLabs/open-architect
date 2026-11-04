package androidx.constraintlayout.motion.utils;

import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d extends androidx.constraintlayout.core.motion.utils.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f44961g = "ViewSpline";

    static class a extends d {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    public static class b extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f44962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        SparseArray<androidx.constraintlayout.widget.a> f44963i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f44964j;

        public b(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
            this.f44962h = str.split(",")[1];
            this.f44963i = sparseArray;
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void g(int i10, float f10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // androidx.constraintlayout.core.motion.utils.o
        public void j(int i10) {
            int size = this.f44963i.size();
            int iP = this.f44963i.valueAt(0).p();
            double[] dArr = new double[size];
            this.f44964j = new float[iP];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iP);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.f44963i.keyAt(i11);
                androidx.constraintlayout.widget.a aVarValueAt = this.f44963i.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.l(this.f44964j);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f44964j;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f43859a = androidx.constraintlayout.core.motion.utils.b.a(i10, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            this.f43859a.e(f10, this.f44964j);
            androidx.constraintlayout.motion.utils.a.b(this.f44963i.valueAt(0), view, this.f44964j);
        }

        public void n(int i10, androidx.constraintlayout.widget.a aVar) {
            this.f44963i.append(i10, aVar);
        }
    }

    static class c extends d {
        c() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.d$d, reason: collision with other inner class name */
    public static class C0365d extends d {
        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
        }

        public void n(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    static class e extends d {
        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    static class f extends d {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    static class g extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f44965h = false;

        g() {
            int i10 = 4 >> 0;
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f44965h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f44965h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
    }

    static class h extends d {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    static class i extends d {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    static class j extends d {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    static class k extends d {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    static class l extends d {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    static class m extends d {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    static class n extends d {
        n() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    static class o extends d {
        o() {
        }

        @Override // androidx.constraintlayout.motion.utils.d
        public void m(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static d k(String str, SparseArray<androidx.constraintlayout.widget.a> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static d l(String str) {
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
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 7;
                }
                break;
            case -797520672:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f45135t)) {
                    b10 = 8;
                }
                break;
            case -760884510:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f45127l)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f45128m)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f45124i)) {
                    b10 = 11;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = com.google.common.base.c.f116463p;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = com.google.common.base.c.f116464q;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new a();
            case 9:
                return new e();
            case 10:
                return new f();
            case 11:
                return new h();
            case 12:
                return new c();
            case 13:
                return new C0365d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f10);
}
