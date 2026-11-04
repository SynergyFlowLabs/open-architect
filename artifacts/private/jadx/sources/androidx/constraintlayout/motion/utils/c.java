package androidx.constraintlayout.motion.utils;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends androidx.constraintlayout.core.motion.utils.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44957i = "ViewOscillator";

    static class a extends c {
        a() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    static class b extends c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float[] f44958j = new float[1];

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        protected androidx.constraintlayout.widget.a f44959k;

        b() {
        }

        @Override // androidx.constraintlayout.core.motion.utils.h
        protected void e(Object obj) {
            this.f44959k = (androidx.constraintlayout.widget.a) obj;
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            this.f44958j[0] = a(f10);
            androidx.constraintlayout.motion.utils.a.b(this.f44959k, view, this.f44958j);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.utils.c$c, reason: collision with other inner class name */
    static class C0364c extends c {
        C0364c() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    public static class d extends c {
        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
        }

        public void n(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    static class e extends c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f44960j = false;

        e() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f44960j) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f44960j = true;
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

    static class f extends c {
        f() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    static class g extends c {
        g() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    static class h extends c {
        h() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    static class i extends c {
        i() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    static class j extends c {
        j() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    static class k extends c {
        k() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    static class l extends c {
        l() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    static class m extends c {
        m() {
        }

        @Override // androidx.constraintlayout.motion.utils.c
        public void m(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static c l(String str) {
        if (str.startsWith("CUSTOM")) {
            return new b();
        }
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
            case -40300674:
                if (str.equals(androidx.constraintlayout.motion.widget.f.f45124i)) {
                    b10 = 9;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = 10;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 11;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = com.google.common.base.c.f116461n;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = com.google.common.base.c.f116462o;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new g();
            case 1:
                return new h();
            case 2:
                return new k();
            case 3:
                return new l();
            case 4:
                return new m();
            case 5:
                return new e();
            case 6:
                return new i();
            case 7:
                return new j();
            case 8:
                return new a();
            case 9:
                return new f();
            case 10:
                return new C0364c();
            case 11:
                return new d();
            case 12:
                return new a();
            case 13:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f10);
}
