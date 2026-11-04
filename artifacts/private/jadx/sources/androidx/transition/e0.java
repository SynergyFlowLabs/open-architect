package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class e0 extends f1 {
    private static final String T3 = "android:slide:screenPosition";
    private g P3;
    private int Q3;
    private static final TimeInterpolator R3 = new DecelerateInterpolator();
    private static final TimeInterpolator S3 = new AccelerateInterpolator();
    private static final g U3 = new a();
    private static final g V3 = new b();
    private static final g W3 = new c();
    private static final g X3 = new d();
    private static final g Y3 = new e();
    private static final g Z3 = new f();

    class a extends h {
        a() {
            super(null);
        }

        @Override // androidx.transition.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class b extends h {
        b() {
            super(null);
        }

        @Override // androidx.transition.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    class c extends i {
        c() {
            super(null);
        }

        @Override // androidx.transition.e0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    class d extends h {
        d() {
            super(null);
        }

        @Override // androidx.transition.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class e extends h {
        e() {
            super(null);
        }

        @Override // androidx.transition.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    class f extends i {
        f() {
            super(null);
        }

        @Override // androidx.transition.e0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    private interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    private static abstract class h implements g {
        private h() {
        }

        @Override // androidx.transition.e0.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static abstract class i implements g {
        private i() {
        }

        @Override // androidx.transition.e0.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ i(a aVar) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface j {
    }

    public e0() {
        this.P3 = Z3;
        this.Q3 = 80;
        X0(80);
    }

    private void N0(u0 u0Var) {
        int[] iArr = new int[2];
        u0Var.f75776b.getLocationOnScreen(iArr);
        u0Var.f75775a.put(T3, iArr);
    }

    @Override // androidx.transition.f1
    @androidx.annotation.p0
    public Animator R0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) u0Var2.f75775a.get(T3);
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return w0.a(view, u0Var2, iArr[0], iArr[1], this.P3.b(viewGroup, view), this.P3.a(viewGroup, view), translationX, translationY, R3, this);
    }

    @Override // androidx.transition.f1
    @androidx.annotation.p0
    public Animator T0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var == null) {
            return null;
        }
        int[] iArr = (int[]) u0Var.f75775a.get(T3);
        return w0.a(view, u0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.P3.b(viewGroup, view), this.P3.a(viewGroup, view), S3, this);
    }

    public int W0() {
        return this.Q3;
    }

    public void X0(int i10) {
        if (i10 == 3) {
            this.P3 = U3;
        } else if (i10 == 5) {
            this.P3 = X3;
        } else if (i10 == 48) {
            this.P3 = W3;
        } else if (i10 == 80) {
            this.P3 = Z3;
        } else if (i10 == 8388611) {
            this.P3 = V3;
        } else {
            if (i10 != 8388613) {
                throw new IllegalArgumentException("Invalid slide direction");
            }
            this.P3 = Y3;
        }
        this.Q3 = i10;
        d0 d0Var = new d0();
        d0Var.k(i10);
        J0(d0Var);
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.f1, androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        super.l(u0Var);
        N0(u0Var);
    }

    @Override // androidx.transition.f1, androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        super.p(u0Var);
        N0(u0Var);
    }

    public e0(int i10) {
        this.P3 = Z3;
        this.Q3 = 80;
        X0(i10);
    }

    public e0(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P3 = Z3;
        this.Q3 = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75571h);
        int iK = androidx.core.content.res.n.k(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        X0(iK);
    }
}
