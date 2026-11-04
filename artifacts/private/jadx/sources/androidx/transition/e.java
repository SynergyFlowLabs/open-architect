package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public class e extends g0 {
    private static final String J3 = "android:clipBounds:bounds";
    private static final String I3 = "android:clipBounds:clip";
    private static final String[] K3 = {I3};
    static final Rect L3 = new Rect();

    private static class a extends AnimatorListenerAdapter implements g0.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f75556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f75557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f75558c;

        a(View view, Rect rect, Rect rect2) {
            this.f75558c = view;
            this.f75556a = rect;
            this.f75557b = rect2;
        }

        @Override // androidx.transition.g0.j
        public void b(@NonNull g0 g0Var) {
            this.f75558c.setClipBounds((Rect) this.f75558c.getTag(a0.a.f75498f));
            this.f75558c.setTag(a0.a.f75498f, null);
        }

        @Override // androidx.transition.g0.j
        public void j(@NonNull g0 g0Var) {
        }

        @Override // androidx.transition.g0.j
        public void k(@NonNull g0 g0Var) {
            Rect clipBounds = this.f75558c.getClipBounds();
            if (clipBounds == null) {
                clipBounds = e.L3;
            }
            this.f75558c.setTag(a0.a.f75498f, clipBounds);
            this.f75558c.setClipBounds(this.f75557b);
        }

        @Override // androidx.transition.g0.j
        public void o(@NonNull g0 g0Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.g0.j
        public void q(@NonNull g0 g0Var) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                this.f75558c.setClipBounds(this.f75556a);
            } else {
                this.f75558c.setClipBounds(this.f75557b);
            }
        }
    }

    public e() {
    }

    private void N0(u0 u0Var, boolean z10) {
        View view = u0Var.f75776b;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z10 ? (Rect) view.getTag(a0.a.f75498f) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != L3 ? clipBounds : null;
        u0Var.f75775a.put(I3, rect);
        if (rect == null) {
            u0Var.f75775a.put(J3, new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.g0
    @NonNull
    public String[] b0() {
        return K3;
    }

    @Override // androidx.transition.g0
    public boolean e0() {
        return true;
    }

    @Override // androidx.transition.g0
    public void l(@NonNull u0 u0Var) {
        N0(u0Var, false);
    }

    @Override // androidx.transition.g0
    public void p(@NonNull u0 u0Var) {
        N0(u0Var, true);
    }

    @Override // androidx.transition.g0
    @androidx.annotation.p0
    public Animator t(@NonNull ViewGroup viewGroup, @androidx.annotation.p0 u0 u0Var, @androidx.annotation.p0 u0 u0Var2) {
        if (u0Var == null || u0Var2 == null || !u0Var.f75775a.containsKey(I3) || !u0Var2.f75775a.containsKey(I3)) {
            return null;
        }
        Rect rect = (Rect) u0Var.f75775a.get(I3);
        Rect rect2 = (Rect) u0Var2.f75775a.get(I3);
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) u0Var.f75775a.get(J3) : rect;
        Rect rect4 = rect2 == null ? (Rect) u0Var2.f75775a.get(J3) : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        u0Var2.f75776b.setClipBounds(rect);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(u0Var2.f75776b, (Property<View, V>) z0.f75811d, (TypeEvaluator) new b0(new Rect()), (Object[]) new Rect[]{rect3, rect4});
        a aVar = new a(u0Var2.f75776b, rect, rect2);
        objectAnimatorOfObject.addListener(aVar);
        c(aVar);
        return objectAnimatorOfObject;
    }

    public e(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
