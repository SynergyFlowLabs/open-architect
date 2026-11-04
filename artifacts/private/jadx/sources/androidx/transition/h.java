package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.u1;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
public class h extends g0 {
    private static final String N3 = "android:changeTransform:parent";
    private static final String P3 = "android:changeTransform:intermediateParentMatrix";
    private static final String Q3 = "android:changeTransform:intermediateMatrix";
    boolean I3;
    private boolean J3;
    private Matrix K3;
    private static final String L3 = "android:changeTransform:matrix";
    private static final String M3 = "android:changeTransform:transforms";
    private static final String O3 = "android:changeTransform:parentMatrix";
    private static final String[] R3 = {L3, M3, O3};
    private static final Property<e, float[]> S3 = new a(float[].class, "nonTranslations");
    private static final Property<e, PointF> T3 = new b(PointF.class, "translations");
    private static final boolean U3 = true;

    class a extends Property<e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, float[] fArr) {
            eVar.d(fArr);
        }
    }

    class b extends Property<e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(e eVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, PointF pointF) {
            eVar.c(pointF);
        }
    }

    private static class c extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private View f75685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private o f75686b;

        c(View view, o oVar) {
            this.f75685a = view;
            this.f75686b = oVar;
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            this.f75686b.setVisibility(0);
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            this.f75686b.setVisibility(4);
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            g0Var.u0(this);
            s.b(this.f75685a);
            this.f75685a.setTag(a0.a.f75505m, null);
            this.f75685a.setTag(a0.a.f75495c, null);
        }
    }

    private static class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f75687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Matrix f75688b = new Matrix();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f75689c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f75690d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f75691e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final f f75692f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final e f75693g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Matrix f75694h;

        d(View view, f fVar, e eVar, Matrix matrix, boolean z10, boolean z11) {
            this.f75689c = z10;
            this.f75690d = z11;
            this.f75691e = view;
            this.f75692f = fVar;
            this.f75693g = eVar;
            this.f75694h = matrix;
        }

        private void a(Matrix matrix) {
            this.f75688b.set(matrix);
            this.f75691e.setTag(a0.a.f75505m, this.f75688b);
            this.f75692f.a(this.f75691e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f75687a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i10 = 4 | 0;
            if (!this.f75687a) {
                if (this.f75689c && this.f75690d) {
                    a(this.f75694h);
                } else {
                    this.f75691e.setTag(a0.a.f75505m, null);
                    this.f75691e.setTag(a0.a.f75495c, null);
                }
            }
            z0.d(this.f75691e, null);
            this.f75692f.a(this.f75691e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f75693g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            h.T0(this.f75691e);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Matrix f75695a = new Matrix();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f75696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float[] f75697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f75698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f75699e;

        e(View view, float[] fArr) {
            this.f75696b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f75697c = fArr2;
            this.f75698d = fArr2[2];
            this.f75699e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f75697c;
            fArr[2] = this.f75698d;
            fArr[5] = this.f75699e;
            this.f75695a.setValues(fArr);
            z0.d(this.f75696b, this.f75695a);
        }

        Matrix a() {
            return this.f75695a;
        }

        void c(PointF pointF) {
            this.f75698d = pointF.x;
            this.f75699e = pointF.y;
            b();
        }

        void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f75697c, 0, fArr.length);
            b();
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f75700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f75701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f75702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f75703d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final float f75704e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final float f75705f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final float f75706g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final float f75707h;

        f(View view) {
            this.f75700a = view.getTranslationX();
            this.f75701b = view.getTranslationY();
            this.f75702c = u1.D0(view);
            this.f75703d = view.getScaleX();
            this.f75704e = view.getScaleY();
            this.f75705f = view.getRotationX();
            this.f75706g = view.getRotationY();
            this.f75707h = view.getRotation();
        }

        public void a(View view) {
            h.X0(view, this.f75700a, this.f75701b, this.f75702c, this.f75703d, this.f75704e, this.f75705f, this.f75706g, this.f75707h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f75700a == this.f75700a && fVar.f75701b == this.f75701b && fVar.f75702c == this.f75702c && fVar.f75703d == this.f75703d && fVar.f75704e == this.f75704e && fVar.f75705f == this.f75705f && fVar.f75706g == this.f75706g && fVar.f75707h == this.f75707h;
        }

        public int hashCode() {
            float f10 = this.f75700a;
            int iFloatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
            float f11 = this.f75701b;
            int iFloatToIntBits2 = (iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f75702c;
            int iFloatToIntBits3 = (iFloatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.f75703d;
            int iFloatToIntBits4 = (iFloatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f75704e;
            int iFloatToIntBits5 = (iFloatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f75705f;
            int iFloatToIntBits6 = (iFloatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f75706g;
            int iFloatToIntBits7 = (iFloatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f75707h;
            return iFloatToIntBits7 + (f17 != 0.0f ? Float.floatToIntBits(f17) : 0);
        }
    }

    public h() {
        this.I3 = true;
        this.J3 = true;
        this.K3 = new Matrix();
    }

    private void N0(u0 u0Var) {
        View view = u0Var.f75776b;
        if (view.getVisibility() == 8) {
            return;
        }
        u0Var.f75775a.put(N3, view.getParent());
        u0Var.f75775a.put(M3, new f(view));
        Matrix matrix = view.getMatrix();
        u0Var.f75775a.put(L3, (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.J3) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            z0.h(viewGroup, matrix2);
            matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
            u0Var.f75775a.put(O3, matrix2);
            u0Var.f75775a.put(Q3, view.getTag(a0.a.f75505m));
            u0Var.f75775a.put(P3, view.getTag(a0.a.f75495c));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.transition.g0] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    private void O0(ViewGroup viewGroup, u0 u0Var, u0 u0Var2) {
        View view = u0Var2.f75776b;
        Matrix matrix = new Matrix((Matrix) u0Var2.f75775a.get(O3));
        z0.i(viewGroup, matrix);
        o oVarA = s.a(view, viewGroup, matrix);
        if (oVarA == null) {
            return;
        }
        oVarA.a((ViewGroup) u0Var.f75775a.get(N3), u0Var.f75776b);
        ?? r10 = this;
        while (true) {
            s0 s0Var = r10.f75656v;
            if (s0Var == null) {
                break;
            } else {
                r10 = s0Var;
            }
        }
        r10.c(new c(view, oVarA));
        if (U3) {
            View view2 = u0Var.f75776b;
            if (view2 != u0Var2.f75776b) {
                z0.f(view2, 0.0f);
            }
            z0.f(view, 1.0f);
        }
    }

    private ObjectAnimator P0(u0 u0Var, u0 u0Var2, boolean z10) {
        Matrix matrix = (Matrix) u0Var.f75775a.get(L3);
        Matrix matrix2 = (Matrix) u0Var2.f75775a.get(L3);
        if (matrix == null) {
            matrix = u.f75774a;
        }
        if (matrix2 == null) {
            matrix2 = u.f75774a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) u0Var2.f75775a.get(M3);
        View view = u0Var2.f75776b;
        T0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        e eVar = new e(view, fArr);
        int i10 = 5 >> 2;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, PropertyValuesHolder.ofObject(S3, new l(new float[9]), fArr, fArr2), z.a(T3, Q().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        d dVar = new d(view, fVar, eVar, matrix3, z10, this.I3);
        objectAnimatorOfPropertyValuesHolder.addListener(dVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(dVar);
        return objectAnimatorOfPropertyValuesHolder;
    }

    private boolean S0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (h0(viewGroup) && h0(viewGroup2)) {
            u0 u0VarO = O(viewGroup, true);
            return u0VarO != null && viewGroup2 == u0VarO.f75776b;
        }
        return viewGroup == viewGroup2;
    }

    static void T0(View view) {
        X0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void U0(u0 u0Var, u0 u0Var2) {
        Matrix matrix = (Matrix) u0Var2.f75775a.get(O3);
        u0Var2.f75776b.setTag(a0.a.f75495c, matrix);
        Matrix matrix2 = this.K3;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) u0Var.f75775a.get(L3);
        if (matrix3 == null) {
            matrix3 = new Matrix();
            u0Var.f75775a.put(L3, matrix3);
        }
        matrix3.postConcat((Matrix) u0Var.f75775a.get(O3));
        matrix3.postConcat(matrix2);
    }

    static void X0(View view, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        u1.F2(view, f12);
        view.setScaleX(f13);
        view.setScaleY(f14);
        view.setRotationX(f15);
        view.setRotationY(f16);
        view.setRotation(f17);
    }

    public boolean Q0() {
        return this.J3;
    }

    public boolean R0() {
        return this.I3;
    }

    public void V0(boolean z10) {
        this.J3 = z10;
    }

    public void W0(boolean z10) {
        this.I3 = z10;
    }

    @Override // androidx.transition.g0
    @NonNull
    public String[] b0() {
        return R3;
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        N0(u0Var);
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        N0(u0Var);
        if (U3) {
            return;
        }
        ((ViewGroup) u0Var.f75776b.getParent()).startViewTransition(u0Var.f75776b);
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var != null && u0Var2 != null && u0Var.f75775a.containsKey(N3) && u0Var2.f75775a.containsKey(N3)) {
            ViewGroup viewGroup2 = (ViewGroup) u0Var.f75775a.get(N3);
            boolean z10 = this.J3 && !S0(viewGroup2, (ViewGroup) u0Var2.f75775a.get(N3));
            Matrix matrix = (Matrix) u0Var.f75775a.get(Q3);
            if (matrix != null) {
                u0Var.f75775a.put(L3, matrix);
            }
            Matrix matrix2 = (Matrix) u0Var.f75775a.get(P3);
            if (matrix2 != null) {
                u0Var.f75775a.put(O3, matrix2);
            }
            if (z10) {
                U0(u0Var, u0Var2);
            }
            ObjectAnimator objectAnimatorP0 = P0(u0Var, u0Var2, z10);
            if (z10 && objectAnimatorP0 != null && this.I3) {
                O0(viewGroup, u0Var, u0Var2);
                return objectAnimatorP0;
            }
            if (!U3) {
                viewGroup2.endViewTransition(u0Var.f75776b);
            }
            return objectAnimatorP0;
        }
        return null;
    }

    public h(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I3 = true;
        this.J3 = true;
        this.K3 = new Matrix();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75570g);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.I3 = androidx.core.content.res.n.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.J3 = androidx.core.content.res.n.e(typedArrayObtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
