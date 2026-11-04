package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class u {
    private static final int C = 217;
    private static final int D = 167;
    static final int E = 0;
    static final int F = 1;
    static final int G = 2;
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;

    @p0
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f114211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f114212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f114213d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f114214e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f114215f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f114216g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f114217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f114218i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f114219j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f114220k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private Animator f114221l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f114222m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f114223n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f114224o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private CharSequence f114225p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f114226q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private TextView f114227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private CharSequence f114228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f114229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f114230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private ColorStateList f114231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f114232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f114233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private TextView f114234y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f114235z;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f114236a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f114237b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f114238c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f114239d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f114236a = i10;
            this.f114237b = textView;
            this.f114238c = i11;
            this.f114239d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f114223n = this.f114236a;
            u.this.f114221l = null;
            TextView textView = this.f114237b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f114238c == 1 && u.this.f114227r != null) {
                    u.this.f114227r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f114239d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f114239d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f114239d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f114239d.setAlpha(0.0f);
            }
        }
    }

    class b extends View.AccessibilityDelegate {
        b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f114217h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f114216g = context;
        this.f114217h = textInputLayout;
        this.f114222m = context.getResources().getDimensionPixelSize(r6.a.f.L1);
        this.f114210a = com.google.android.material.motion.j.f(context, r6.a.c.Pd, C);
        this.f114211b = com.google.android.material.motion.j.f(context, r6.a.c.Ld, D);
        this.f114212c = com.google.android.material.motion.j.f(context, r6.a.c.Pd, D);
        this.f114213d = com.google.android.material.motion.j.g(context, r6.a.c.Ud, com.google.android.material.animation.b.f111046d);
        int i10 = r6.a.c.Ud;
        TimeInterpolator timeInterpolator = com.google.android.material.animation.b.f111043a;
        this.f114214e = com.google.android.material.motion.j.g(context, i10, timeInterpolator);
        this.f114215f = com.google.android.material.motion.j.g(context, r6.a.c.Xd, timeInterpolator);
    }

    private boolean C(int i10) {
        return (i10 != 1 || this.f114227r == null || TextUtils.isEmpty(this.f114225p)) ? false : true;
    }

    private boolean D(int i10) {
        return (i10 != 2 || this.f114234y == null || TextUtils.isEmpty(this.f114232w)) ? false : true;
    }

    private void I(int i10, int i11) {
        TextView textViewN;
        TextView textViewN2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewN2 = n(i11)) != null) {
            textViewN2.setVisibility(0);
            textViewN2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewN = n(i10)) != null) {
            textViewN.setVisibility(4);
            if (i10 == 1) {
                textViewN.setText((CharSequence) null);
            }
        }
        this.f114223n = i11;
    }

    private void R(@p0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void T(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean U(@p0 TextView textView, @NonNull CharSequence charSequence) {
        return u1.Y0(this.f114217h) && this.f114217h.isEnabled() && !(this.f114224o == this.f114223n && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void X(int i10, int i11, boolean z10) {
        u uVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f114221l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f114233x, this.f114234y, 2, i10, i11);
            uVar.i(arrayList, uVar.f114226q, uVar.f114227r, 1, i10, i11);
            com.google.android.material.animation.c.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i11, uVar.n(i10), i10, uVar.n(i11)));
            animatorSet.start();
        } else {
            uVar = this;
            uVar.I(i10, i11);
        }
        uVar.f114217h.H0();
        uVar.f114217h.M0(z10);
        uVar.f114217h.S0();
    }

    private boolean g() {
        return (this.f114218i == null || this.f114217h.getEditText() == null) ? false : true;
    }

    private void i(@NonNull List<Animator> list, boolean z10, @p0 TextView textView, int i10, int i11, int i12) {
        if (textView != null && z10) {
            if (i10 != i12 && i10 != i11) {
                return;
            }
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f114212c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f114212c);
            list.add(objectAnimatorK);
        }
    }

    private ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f114211b : this.f114212c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f114214e : this.f114215f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f114222m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f114210a);
        objectAnimatorOfFloat.setInterpolator(this.f114213d);
        return objectAnimatorOfFloat;
    }

    @p0
    private TextView n(int i10) {
        if (i10 == 1) {
            return this.f114227r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f114234y;
    }

    private int x(boolean z10, @androidx.annotation.q int i10, int i11) {
        return z10 ? this.f114216g.getResources().getDimensionPixelSize(i10) : i11;
    }

    void A() {
        this.f114225p = null;
        h();
        if (this.f114223n == 1) {
            if (!this.f114233x || TextUtils.isEmpty(this.f114232w)) {
                this.f114224o = 0;
            } else {
                this.f114224o = 2;
            }
        }
        X(this.f114223n, this.f114224o, U(this.f114227r, ""));
    }

    void B() {
        h();
        int i10 = this.f114223n;
        if (i10 == 2) {
            this.f114224o = 0;
        }
        X(i10, this.f114224o, U(this.f114234y, ""));
    }

    boolean E(int i10) {
        boolean z10 = true;
        if (i10 != 0 && i10 != 1) {
            z10 = false;
        }
        return z10;
    }

    boolean F() {
        return this.f114226q;
    }

    boolean G() {
        return this.f114233x;
    }

    void H(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f114218i == null) {
            return;
        }
        if (!E(i10) || (frameLayout = this.f114220k) == null) {
            this.f114218i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f114219j - 1;
        this.f114219j = i11;
        T(this.f114218i, i11);
    }

    void J(int i10) {
        this.f114229t = i10;
        TextView textView = this.f114227r;
        if (textView != null) {
            u1.I1(textView, i10);
        }
    }

    void K(@p0 CharSequence charSequence) {
        this.f114228s = charSequence;
        TextView textView = this.f114227r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void L(boolean z10) {
        if (this.f114226q == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f114216g);
            this.f114227r = appCompatTextView;
            appCompatTextView.setId(r6.a.h.f360622a6);
            this.f114227r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f114227r.setTypeface(typeface);
            }
            M(this.f114230u);
            N(this.f114231v);
            K(this.f114228s);
            J(this.f114229t);
            this.f114227r.setVisibility(4);
            e(this.f114227r, 0);
        } else {
            A();
            H(this.f114227r, 0);
            this.f114227r = null;
            this.f114217h.H0();
            this.f114217h.S0();
        }
        this.f114226q = z10;
    }

    void M(@g1 int i10) {
        this.f114230u = i10;
        TextView textView = this.f114227r;
        if (textView != null) {
            this.f114217h.u0(textView, i10);
        }
    }

    void N(@p0 ColorStateList colorStateList) {
        this.f114231v = colorStateList;
        TextView textView = this.f114227r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    void O(@g1 int i10) {
        this.f114235z = i10;
        TextView textView = this.f114234y;
        if (textView != null) {
            androidx.core.widget.r.D(textView, i10);
        }
    }

    void P(boolean z10) {
        if (this.f114233x == z10) {
            return;
        }
        h();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f114216g);
            this.f114234y = appCompatTextView;
            appCompatTextView.setId(r6.a.h.f360630b6);
            this.f114234y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f114234y.setTypeface(typeface);
            }
            this.f114234y.setVisibility(4);
            u1.I1(this.f114234y, 1);
            O(this.f114235z);
            Q(this.A);
            e(this.f114234y, 1);
            this.f114234y.setAccessibilityDelegate(new b());
        } else {
            B();
            H(this.f114234y, 1);
            this.f114234y = null;
            this.f114217h.H0();
            this.f114217h.S0();
        }
        this.f114233x = z10;
    }

    void Q(@p0 ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f114234y;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    void S(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            R(this.f114227r, typeface);
            R(this.f114234y, typeface);
        }
    }

    void V(CharSequence charSequence) {
        h();
        this.f114225p = charSequence;
        this.f114227r.setText(charSequence);
        int i10 = this.f114223n;
        if (i10 != 1) {
            this.f114224o = 1;
        }
        X(i10, this.f114224o, U(this.f114227r, charSequence));
    }

    void W(CharSequence charSequence) {
        h();
        this.f114232w = charSequence;
        this.f114234y.setText(charSequence);
        int i10 = this.f114223n;
        if (i10 != 2) {
            this.f114224o = 2;
        }
        X(i10, this.f114224o, U(this.f114234y, charSequence));
    }

    void e(TextView textView, int i10) {
        if (this.f114218i == null && this.f114220k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f114216g);
            this.f114218i = linearLayout;
            linearLayout.setOrientation(0);
            this.f114217h.addView(this.f114218i, -1, -2);
            this.f114220k = new FrameLayout(this.f114216g);
            this.f114218i.addView(this.f114220k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f114217h.getEditText() != null) {
                f();
            }
        }
        if (E(i10)) {
            this.f114220k.setVisibility(0);
            this.f114220k.addView(textView);
        } else {
            this.f114218i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f114218i.setVisibility(0);
        this.f114219j++;
    }

    void f() {
        if (g()) {
            EditText editText = this.f114217h.getEditText();
            boolean zJ = com.google.android.material.resources.c.j(this.f114216g);
            u1.m2(this.f114218i, x(zJ, r6.a.f.f360141ca, u1.n0(editText)), x(zJ, r6.a.f.f360157da, this.f114216g.getResources().getDimensionPixelSize(r6.a.f.f360125ba)), x(zJ, r6.a.f.f360141ca, u1.m0(editText)), 0);
        }
    }

    void h() {
        Animator animator = this.f114221l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean l() {
        return C(this.f114223n);
    }

    boolean m() {
        return C(this.f114224o);
    }

    int o() {
        return this.f114229t;
    }

    @p0
    CharSequence p() {
        return this.f114228s;
    }

    @p0
    CharSequence q() {
        return this.f114225p;
    }

    @androidx.annotation.l
    int r() {
        TextView textView = this.f114227r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @p0
    ColorStateList s() {
        TextView textView = this.f114227r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence t() {
        return this.f114232w;
    }

    @p0
    View u() {
        return this.f114234y;
    }

    @p0
    ColorStateList v() {
        TextView textView = this.f114234y;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @androidx.annotation.l
    int w() {
        TextView textView = this.f114234y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean y() {
        return D(this.f114223n);
    }

    boolean z() {
        return D(this.f114224o);
    }
}
