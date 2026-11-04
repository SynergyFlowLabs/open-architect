package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 extends g0 {
    private static final String L3 = "android:visibility:screenLocation";
    public static final int M3 = 1;
    public static final int N3 = 2;
    private int I3;
    static final String J3 = "android:visibility:visibility";
    private static final String K3 = "android:visibility:parent";
    private static final String[] O3 = {J3, K3};

    private static class a extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f75599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f75600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f75601c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f75602d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f75603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f75604f = false;

        a(View view, int i10, boolean z10) {
            this.f75599a = view;
            this.f75600b = i10;
            this.f75601c = (ViewGroup) view.getParent();
            this.f75602d = z10;
            c(true);
        }

        private void a() {
            if (!this.f75604f) {
                z0.g(this.f75599a, this.f75600b);
                ViewGroup viewGroup = this.f75601c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            c(false);
        }

        private void c(boolean z10) {
            ViewGroup viewGroup;
            if (!this.f75602d || this.f75603e == z10 || (viewGroup = this.f75601c) == null) {
                return;
            }
            this.f75603e = z10;
            y0.c(viewGroup, z10);
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            c(true);
            if (this.f75604f) {
                return;
            }
            z0.g(this.f75599a, 0);
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            c(false);
            if (this.f75604f) {
                return;
            }
            z0.g(this.f75599a, this.f75600b);
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            g0Var.u0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f75604f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                z0.g(this.f75599a, 0);
                ViewGroup viewGroup = this.f75601c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }
    }

    @e.a({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    private class c extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f75605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f75606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f75607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f75608d = true;

        c(ViewGroup viewGroup, View view, View view2) {
            this.f75605a = viewGroup;
            this.f75606b = view;
            this.f75607c = view2;
        }

        private void a() {
            this.f75607c.setTag(a0.a.f75497e, null);
            this.f75605a.getOverlay().remove(this.f75606b);
            this.f75608d = false;
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
            g0Var.u0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f75605a.getOverlay().remove(this.f75606b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f75606b.getParent() == null) {
                this.f75605a.getOverlay().add(this.f75606b);
            } else {
                f1.this.cancel();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@NonNull Animator animator, boolean z10) {
            if (z10) {
                this.f75607c.setTag(a0.a.f75497e, this.f75606b);
                this.f75605a.getOverlay().add(this.f75606b);
                this.f75608d = true;
            }
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
            if (this.f75608d) {
                a();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            a();
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f75610a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f75611b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f75612c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f75613d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f75614e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f75615f;

        d() {
        }
    }

    public f1() {
        this.I3 = 3;
    }

    private void N0(u0 u0Var) {
        u0Var.f75775a.put(J3, Integer.valueOf(u0Var.f75776b.getVisibility()));
        u0Var.f75775a.put(K3, u0Var.f75776b.getParent());
        int[] iArr = new int[2];
        u0Var.f75776b.getLocationOnScreen(iArr);
        u0Var.f75775a.put(L3, iArr);
    }

    private d P0(u0 u0Var, u0 u0Var2) {
        d dVar = new d();
        dVar.f75610a = false;
        dVar.f75611b = false;
        if (u0Var == null || !u0Var.f75775a.containsKey(J3)) {
            dVar.f75612c = -1;
            dVar.f75614e = null;
        } else {
            dVar.f75612c = ((Integer) u0Var.f75775a.get(J3)).intValue();
            dVar.f75614e = (ViewGroup) u0Var.f75775a.get(K3);
        }
        if (u0Var2 == null || !u0Var2.f75775a.containsKey(J3)) {
            dVar.f75613d = -1;
            dVar.f75615f = null;
        } else {
            dVar.f75613d = ((Integer) u0Var2.f75775a.get(J3)).intValue();
            dVar.f75615f = (ViewGroup) u0Var2.f75775a.get(K3);
        }
        if (u0Var != null && u0Var2 != null) {
            int i10 = dVar.f75612c;
            int i11 = dVar.f75613d;
            if (i10 != i11 || dVar.f75614e != dVar.f75615f) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        dVar.f75611b = false;
                        dVar.f75610a = true;
                        return dVar;
                    }
                    if (i11 == 0) {
                        dVar.f75611b = true;
                        dVar.f75610a = true;
                        return dVar;
                    }
                } else {
                    if (dVar.f75615f == null) {
                        dVar.f75611b = false;
                        dVar.f75610a = true;
                        return dVar;
                    }
                    if (dVar.f75614e == null) {
                        dVar.f75611b = true;
                        dVar.f75610a = true;
                        return dVar;
                    }
                }
            }
        } else {
            if (u0Var == null && dVar.f75613d == 0) {
                dVar.f75611b = true;
                dVar.f75610a = true;
                return dVar;
            }
            if (u0Var2 == null && dVar.f75612c == 0) {
                dVar.f75611b = false;
                dVar.f75610a = true;
            }
        }
        return dVar;
    }

    public int O0() {
        return this.I3;
    }

    public boolean Q0(@androidx.annotation.p0 u0 u0Var) {
        boolean z10 = false;
        if (u0Var == null) {
            return false;
        }
        int iIntValue = ((Integer) u0Var.f75775a.get(J3)).intValue();
        View view = (View) u0Var.f75775a.get(K3);
        if (iIntValue == 0 && view != null) {
            z10 = true;
        }
        return z10;
    }

    @androidx.annotation.p0
    public Animator R0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        return null;
    }

    @androidx.annotation.p0
    public Animator S0(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, int i10, @androidx.annotation.p0 u0 u0Var2, int i11) {
        if ((this.I3 & 1) != 1 || u0Var2 == null) {
            return null;
        }
        if (u0Var == null) {
            View view = (View) u0Var2.f75776b.getParent();
            if (P0(O(view, false), c0(view, false)).f75610a) {
                return null;
            }
        }
        return R0(viewGroup, u0Var2.f75776b, u0Var, u0Var2);
    }

    @androidx.annotation.p0
    public Animator T0(@NonNull ViewGroup viewGroup, @NonNull View view, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    @androidx.annotation.p0
    public Animator U0(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, int i10, @androidx.annotation.p0 u0 u0Var2, int i11) {
        View view;
        boolean z10;
        View view2;
        boolean z11;
        if ((this.I3 & 2) == 2 && u0Var != null) {
            View view3 = u0Var.f75776b;
            View viewA = u0Var2 != null ? u0Var2.f75776b : null;
            View view4 = (View) view3.getTag(a0.a.f75497e);
            if (view4 != null) {
                view2 = null;
                z11 = true;
            } else {
                if (viewA == null || viewA.getParent() == null) {
                    if (viewA != null) {
                        view = null;
                        z10 = false;
                    } else {
                        viewA = null;
                        view = null;
                        z10 = true;
                    }
                } else if (i11 == 4 || view3 == viewA) {
                    view = viewA;
                    z10 = false;
                    viewA = null;
                } else {
                    viewA = null;
                    view = null;
                    z10 = true;
                }
                if (z10) {
                    if (view3.getParent() != null) {
                        if (view3.getParent() instanceof View) {
                            View view5 = (View) view3.getParent();
                            if (P0(c0(view5, true), O(view5, true)).f75610a) {
                                int id2 = view5.getId();
                                if (view5.getParent() != null || id2 == -1 || viewGroup.findViewById(id2) == null || !this.f75648p0) {
                                }
                            } else {
                                viewA = t0.a(viewGroup, view3, view5);
                            }
                        }
                        View view6 = view;
                        view4 = viewA;
                        view2 = view6;
                        z11 = false;
                    }
                    view2 = view;
                    z11 = false;
                    view4 = view3;
                } else {
                    View view7 = view;
                    view4 = viewA;
                    view2 = view7;
                    z11 = false;
                }
            }
            if (view4 == null) {
                if (view2 == null) {
                    return null;
                }
                int visibility = view2.getVisibility();
                z0.g(view2, 0);
                Animator animatorT0 = T0(viewGroup, view2, u0Var, u0Var2);
                if (animatorT0 == null) {
                    z0.g(view2, visibility);
                    return animatorT0;
                }
                a aVar = new a(view2, i11, true);
                animatorT0.addListener(aVar);
                T().c(aVar);
                return animatorT0;
            }
            if (!z11) {
                int[] iArr = (int[]) u0Var.f75775a.get(L3);
                int i12 = iArr[0];
                int i13 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view4.offsetLeftAndRight((i12 - iArr2[0]) - view4.getLeft());
                view4.offsetTopAndBottom((i13 - iArr2[1]) - view4.getTop());
                viewGroup.getOverlay().add(view4);
            }
            Animator animatorT1 = T0(viewGroup, view4, u0Var, u0Var2);
            if (!z11) {
                if (animatorT1 == null) {
                    viewGroup.getOverlay().remove(view4);
                    return animatorT1;
                }
                view3.setTag(a0.a.f75497e, view4);
                c cVar = new c(viewGroup, view4, view3);
                animatorT1.addListener(cVar);
                animatorT1.addPauseListener(cVar);
                T().c(cVar);
            }
            return animatorT1;
        }
        return null;
    }

    public void V0(int i10) {
        if ((i10 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.I3 = i10;
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public String[] b0() {
        return O3;
    }

    @Override // androidx.transition.g0
    public boolean f0(@androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var == null && u0Var2 == null) {
            return false;
        }
        if (u0Var != null && u0Var2 != null && u0Var2.f75775a.containsKey(J3) != u0Var.f75775a.containsKey(J3)) {
            return false;
        }
        d dVarP0 = P0(u0Var, u0Var2);
        return dVarP0.f75610a && (dVarP0.f75612c == 0 || dVarP0.f75613d == 0);
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        N0(u0Var);
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        N0(u0Var);
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        d dVarP0 = P0(u0Var, u0Var2);
        if (!dVarP0.f75610a) {
            return null;
        }
        if (dVarP0.f75614e == null && dVarP0.f75615f == null) {
            return null;
        }
        return dVarP0.f75611b ? S0(viewGroup, u0Var, dVarP0.f75612c, u0Var2, dVarP0.f75613d) : U0(viewGroup, u0Var, dVarP0.f75612c, u0Var2, dVarP0.f75613d);
    }

    public f1(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I3 = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f0.f75568e);
        int iK = androidx.core.content.res.n.k(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iK != 0) {
            V0(iK);
        }
    }
}
