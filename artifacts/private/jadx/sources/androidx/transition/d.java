package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d extends g0 {
    private static final String J3 = "android:changeBounds:bounds";
    private static final String K3 = "android:changeBounds:clip";
    private static final String L3 = "android:changeBounds:parent";
    private static final String M3 = "android:changeBounds:windowX";
    private static final String N3 = "android:changeBounds:windowY";
    private static final String[] O3 = {J3, K3, L3, M3, N3};
    private static final Property<i, PointF> P3 = new a(PointF.class, "topLeft");
    private static final Property<i, PointF> Q3 = new b(PointF.class, "bottomRight");
    private static final Property<View, PointF> R3 = new c(PointF.class, "bottomRight");
    private static final Property<View, PointF> S3 = new C0761d(PointF.class, "topLeft");
    private static final Property<View, PointF> T3 = new e(PointF.class, "position");
    private static final b0 U3 = new b0();
    private boolean I3;

    class a extends Property<i, PointF> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.c(pointF);
        }
    }

    class b extends Property<i, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(i iVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(i iVar, PointF pointF) {
            iVar.a(pointF);
        }
    }

    class c extends Property<View, PointF> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            z0.e(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* JADX INFO: renamed from: androidx.transition.d$d, reason: collision with other inner class name */
    class C0761d extends Property<View, PointF> {
        C0761d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            z0.e(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            z0.e(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f75528a;
        private final i mViewBounds;

        f(i iVar) {
            this.f75528a = iVar;
            this.mViewBounds = iVar;
        }
    }

    private static class g extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f75530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f75531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f75532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f75533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f75534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f75535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f75536g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f75537h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f75538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f75539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final int f75540k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f75541l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f75542m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f75543n;

        g(View view, Rect rect, boolean z10, Rect rect2, boolean z11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f75530a = view;
            this.f75531b = rect;
            this.f75532c = z10;
            this.f75533d = rect2;
            this.f75534e = z11;
            this.f75535f = i10;
            this.f75536g = i11;
            this.f75537h = i12;
            this.f75538i = i13;
            this.f75539j = i14;
            this.f75540k = i15;
            this.f75541l = i16;
            this.f75542m = i17;
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            Rect rect = (Rect) this.f75530a.getTag(a0.a.f75498f);
            this.f75530a.setTag(a0.a.f75498f, null);
            this.f75530a.setClipBounds(rect);
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            this.f75530a.setTag(a0.a.f75498f, this.f75530a.getClipBounds());
            this.f75530a.setClipBounds(this.f75534e ? null : this.f75533d);
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            onAnimationStart(animator, false);
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
            this.f75543n = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f75543n) {
                return;
            }
            Rect rect = null;
            if (z10) {
                if (!this.f75532c) {
                    rect = this.f75531b;
                }
            } else if (!this.f75534e) {
                rect = this.f75533d;
            }
            this.f75530a.setClipBounds(rect);
            if (z10) {
                z0.e(this.f75530a, this.f75535f, this.f75536g, this.f75537h, this.f75538i);
            } else {
                z0.e(this.f75530a, this.f75539j, this.f75540k, this.f75541l, this.f75542m);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z10) {
            int iMax = Math.max(this.f75537h - this.f75535f, this.f75541l - this.f75539j);
            int iMax2 = Math.max(this.f75538i - this.f75536g, this.f75542m - this.f75540k);
            int i10 = z10 ? this.f75539j : this.f75535f;
            int i11 = z10 ? this.f75540k : this.f75536g;
            z0.e(this.f75530a, i10, i11, iMax + i10, iMax2 + i11);
            this.f75530a.setClipBounds(z10 ? this.f75533d : this.f75531b);
        }
    }

    private static class h extends o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f75544a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ViewGroup f75545b;

        h(@NonNull ViewGroup viewGroup) {
            this.f75545b = viewGroup;
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            y0.c(this.f75545b, true);
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            y0.c(this.f75545b, false);
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            if (!this.f75544a) {
                y0.c(this.f75545b, false);
            }
            g0Var.u0(this);
        }

        @Override // androidx.transition.o0, androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
            y0.c(this.f75545b, false);
            this.f75544a = true;
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f75546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f75547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f75548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f75549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final View f75550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f75551f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f75552g;

        i(View view) {
            this.f75550e = view;
        }

        private void b() {
            z0.e(this.f75550e, this.f75546a, this.f75547b, this.f75548c, this.f75549d);
            this.f75551f = 0;
            this.f75552g = 0;
        }

        void a(PointF pointF) {
            this.f75548c = Math.round(pointF.x);
            this.f75549d = Math.round(pointF.y);
            int i10 = this.f75552g + 1;
            this.f75552g = i10;
            if (this.f75551f == i10) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f75546a = Math.round(pointF.x);
            this.f75547b = Math.round(pointF.y);
            int i10 = this.f75551f + 1;
            this.f75551f = i10;
            if (i10 == this.f75552g) {
                b();
            }
        }
    }

    public d() {
        this.I3 = false;
    }

    private void N0(u0 u0Var) {
        View view = u0Var.f75776b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        u0Var.f75775a.put(J3, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        u0Var.f75775a.put(L3, u0Var.f75776b.getParent());
        if (this.I3) {
            u0Var.f75775a.put(K3, view.getClipBounds());
        }
    }

    public boolean O0() {
        return this.I3;
    }

    public void P0(boolean z10) {
        this.I3 = z10;
    }

    @Override // androidx.transition.g0
    @NonNull
    public String[] b0() {
        return O3;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        N0(u0Var);
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        Rect rect;
        N0(u0Var);
        if (!this.I3 || (rect = (Rect) u0Var.f75776b.getTag(a0.a.f75498f)) == null) {
            return;
        }
        u0Var.f75775a.put(K3, rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        int i10;
        int i11;
        Rect rect;
        ObjectAnimator objectAnimatorOfObject;
        Animator animatorC;
        if (u0Var == null || u0Var2 == null) {
            return null;
        }
        Map<String, Object> map = u0Var.f75775a;
        Map<String, Object> map2 = u0Var2.f75775a;
        ViewGroup viewGroup2 = (ViewGroup) map.get(L3);
        ViewGroup viewGroup3 = (ViewGroup) map2.get(L3);
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = u0Var2.f75776b;
        Rect rect2 = (Rect) u0Var.f75775a.get(J3);
        Rect rect3 = (Rect) u0Var2.f75775a.get(J3);
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) u0Var.f75775a.get(K3);
        Rect rect5 = (Rect) u0Var2.f75775a.get(K3);
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 <= 0) {
            return null;
        }
        if (this.I3) {
            z0.e(view, i12, i14, Math.max(i20, i22) + i12, i14 + Math.max(i21, i23));
            ObjectAnimator objectAnimatorA = (i12 == i13 && i14 == i15) ? null : v.a(view, T3, Q().a(i12, i14, i13, i15));
            boolean z10 = rect4 == null;
            if (z10) {
                i11 = 0;
                rect = new Rect(0, 0, i20, i21);
            } else {
                i11 = 0;
                rect = rect4;
            }
            int i25 = rect5 == null ? 1 : i11;
            Rect rect6 = i25 != 0 ? new Rect(i11, i11, i22, i23) : rect5;
            if (rect.equals(rect6)) {
                objectAnimatorOfObject = null;
            } else {
                view.setClipBounds(rect);
                objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", U3, rect, rect6);
                g gVar = new g(view, rect, z10, rect6, i25, i12, i14, i16, i18, i13, i15, i17, i19);
                objectAnimatorOfObject.addListener(gVar);
                c(gVar);
            }
            animatorC = t0.c(objectAnimatorA, objectAnimatorOfObject);
        } else {
            z0.e(view, i12, i14, i16, i18);
            if (i24 != 2) {
                animatorC = (i12 == i13 && i14 == i15) ? v.a(view, R3, Q().a(i16, i18, i17, i19)) : v.a(view, S3, Q().a(i12, i14, i13, i15));
            } else if (i20 == i22 && i21 == i23) {
                animatorC = v.a(view, T3, Q().a(i12, i14, i13, i15));
            } else {
                i iVar = new i(view);
                ObjectAnimator objectAnimatorA2 = v.a(iVar, P3, Q().a(i12, i14, i13, i15));
                ObjectAnimator objectAnimatorA3 = v.a(iVar, Q3, Q().a(i16, i18, i17, i19));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                animatorSet.addListener(new f(iVar));
                animatorC = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            y0.c(viewGroup4, true);
            T().c(new h(viewGroup4));
        }
        return animatorC;
    }

    public d(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I3 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75567d);
        boolean zE = androidx.core.content.res.n.e(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        typedArrayObtainStyledAttributes.recycle();
        P0(zE);
    }
}
