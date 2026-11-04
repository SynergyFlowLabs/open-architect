package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.core.view.v3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @w0(16)
    public static final int f112892a = 768;

    class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f112893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f112894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f112895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f112896d;

        a(boolean z10, boolean z11, boolean z12, d dVar) {
            this.f112893a = z10;
            this.f112894b = z11;
            this.f112895c = z12;
            this.f112896d = dVar;
        }

        @Override // com.google.android.material.internal.p0.d
        @NonNull
        public g3 a(View view, @NonNull g3 g3Var, @NonNull e eVar) {
            if (this.f112893a) {
                eVar.f112902d += g3Var.o();
            }
            boolean zS = p0.s(view);
            if (this.f112894b) {
                if (zS) {
                    eVar.f112901c += g3Var.p();
                } else {
                    eVar.f112899a += g3Var.p();
                }
            }
            if (this.f112895c) {
                if (zS) {
                    eVar.f112899a += g3Var.q();
                } else {
                    eVar.f112901c += g3Var.q();
                }
            }
            eVar.a(view);
            d dVar = this.f112896d;
            return dVar != null ? dVar.a(view, g3Var, eVar) : g3Var;
        }
    }

    class b implements androidx.core.view.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f112897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f112898b;

        b(d dVar, e eVar) {
            this.f112897a = dVar;
            this.f112898b = eVar;
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            return this.f112897a.a(view, g3Var, new e(this.f112898b));
        }
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NonNull View view) {
            view.removeOnAttachStateChangeListener(this);
            u1.A1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface d {
        g3 a(View view, g3 g3Var, e eVar);
    }

    private p0() {
    }

    public static void A(@NonNull View view) {
        B(view, true);
    }

    public static void B(@NonNull View view, boolean z10) {
        v3 v3VarE0;
        if (!z10 || (v3VarE0 = u1.E0(view)) == null) {
            n(view).showSoftInput(view, 1);
        } else {
            v3VarE0.k(g3.m.d());
        }
    }

    public static void b(@androidx.annotation.p0 View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @NonNull
    public static Rect c(@NonNull View view, @NonNull View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        boolean z10 = false;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i12 = i10 - iArr2[0];
        int i13 = i11 - iArr2[1];
        return new Rect(i12, i13, view2.getWidth() + i12, view2.getHeight() + i13);
    }

    @NonNull
    public static Rect d(@NonNull View view) {
        return e(view, 0);
    }

    @NonNull
    public static Rect e(@NonNull View view, int i10) {
        return new Rect(view.getLeft(), view.getTop() + i10, view.getRight(), view.getBottom() + i10);
    }

    public static void f(@NonNull View view, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11) {
        g(view, attributeSet, i10, i11, null);
    }

    public static void g(@NonNull View view, @androidx.annotation.p0 AttributeSet attributeSet, int i10, int i11, @androidx.annotation.p0 d dVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, r6.a.o.Uh, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.Yh, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.Zh, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361616ai, false);
        typedArrayObtainStyledAttributes.recycle();
        h(view, new a(z10, z11, z12, dVar));
    }

    public static void h(@NonNull View view, @NonNull d dVar) {
        u1.j2(view, new b(dVar, new e(u1.n0(view), view.getPaddingTop(), u1.m0(view), view.getPaddingBottom())));
        w(view);
    }

    public static float i(@NonNull Context context, @androidx.annotation.r(unit = 0) int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    @androidx.annotation.p0
    public static Integer j(@NonNull View view) {
        ColorStateList colorStateListG = com.google.android.material.drawable.a.g(view.getBackground());
        if (colorStateListG != null) {
            return Integer.valueOf(colorStateListG.getDefaultColor());
        }
        return null;
    }

    @NonNull
    public static List<View> k(@androidx.annotation.p0 View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                arrayList.add(viewGroup.getChildAt(i10));
            }
        }
        return arrayList;
    }

    @androidx.annotation.p0
    public static ViewGroup l(@androidx.annotation.p0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @androidx.annotation.p0
    public static n0 m(@NonNull View view) {
        return o(l(view));
    }

    @androidx.annotation.p0
    private static InputMethodManager n(@NonNull View view) {
        return (InputMethodManager) androidx.core.content.d.s(view.getContext(), InputMethodManager.class);
    }

    @androidx.annotation.p0
    public static n0 o(@androidx.annotation.p0 View view) {
        if (view == null) {
            return null;
        }
        return new m0(view);
    }

    public static float p(@NonNull View view) {
        float fT = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fT += u1.T((View) parent);
        }
        return fT;
    }

    public static void q(@NonNull View view) {
        r(view, true);
    }

    public static void r(@NonNull View view, boolean z10) {
        v3 v3VarE0;
        if (z10 && (v3VarE0 = u1.E0(view)) != null) {
            v3VarE0.d(g3.m.d());
            return;
        }
        InputMethodManager inputMethodManagerN = n(view);
        if (inputMethodManagerN != null) {
            inputMethodManagerN.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean s(View view) {
        return u1.c0(view) == 1;
    }

    public static PorterDuff.Mode t(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void u(@androidx.annotation.p0 View view, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            v(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void v(@NonNull ViewTreeObserver viewTreeObserver, @NonNull ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void w(@NonNull View view) {
        if (u1.R0(view)) {
            u1.A1(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void x(@NonNull View view) {
        y(view, true);
    }

    public static void y(@NonNull final View view, final boolean z10) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.B(view, z10);
            }
        });
    }

    public static void z(@NonNull View view, @NonNull Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f112900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f112901c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f112902d;

        public e(int i10, int i11, int i12, int i13) {
            this.f112899a = i10;
            this.f112900b = i11;
            this.f112901c = i12;
            this.f112902d = i13;
        }

        public void a(View view) {
            u1.m2(view, this.f112899a, this.f112900b, this.f112901c, this.f112902d);
        }

        public e(@NonNull e eVar) {
            this.f112899a = eVar.f112899a;
            this.f112900b = eVar.f112900b;
            this.f112901c = eVar.f112901c;
            this.f112902d = eVar.f112902d;
        }
    }
}
