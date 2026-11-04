package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes4.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] W;
    private static final int[] X;

    @p0
    private final AccessibilityManager T;
    private boolean U;

    @p0
    private BaseTransientBottomBar.s<Snackbar> V;

    @b1({b1.a.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.w {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int i12 = 6 ^ 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@p0 Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@p0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@p0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@p0 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class a extends BaseTransientBottomBar.s<Snackbar> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f113921f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f113922g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f113923h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f113924i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f113925j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i10) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i10 = r6.a.c.Ig;
        W = new int[]{i10};
        X = new int[]{i10, r6.a.c.Kg};
    }

    private Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.T = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static boolean A0(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @NonNull
    public static Snackbar B0(@NonNull Context context, @NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return E0(context, view, charSequence, i10);
    }

    @NonNull
    public static Snackbar C0(@NonNull View view, @f1 int i10, int i11) {
        return D0(view, view.getResources().getText(i10), i11);
    }

    @NonNull
    public static Snackbar D0(@NonNull View view, @NonNull CharSequence charSequence, int i10) {
        return E0(null, view, charSequence, i10);
    }

    @NonNull
    private static Snackbar E0(@p0 Context context, @NonNull View view, @NonNull CharSequence charSequence, int i10) {
        ViewGroup viewGroupV0 = v0(view);
        if (viewGroupV0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupV0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(A0(context) ? r6.a.k.F0 : r6.a.k.G, viewGroupV0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupV0, snackbarContentLayout, snackbarContentLayout);
        snackbar.P0(charSequence);
        snackbar.h0(i10);
        return snackbar;
    }

    public static /* synthetic */ void u0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.B(1);
    }

    @p0
    private static ViewGroup v0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button w0() {
        return x0().getActionView();
    }

    private SnackbarContentLayout x0() {
        return (SnackbarContentLayout) this.f113863i.getChildAt(0);
    }

    private TextView y0() {
        return x0().getMessageView();
    }

    @Deprecated
    protected static boolean z0(@NonNull Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(W);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void A() {
        super.A();
    }

    @NonNull
    @z7.a
    public Snackbar F0(@f1 int i10, View.OnClickListener onClickListener) {
        return G0(G().getText(i10), onClickListener);
    }

    @NonNull
    @z7.a
    public Snackbar G0(@p0 CharSequence charSequence, @p0 final View.OnClickListener onClickListener) {
        Button buttonW0 = w0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.U = true;
            buttonW0.setVisibility(0);
            buttonW0.setText(charSequence);
            buttonW0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.u0(this.f113930a, onClickListener, view);
                }
            });
            return this;
        }
        buttonW0.setVisibility(8);
        buttonW0.setOnClickListener(null);
        this.U = false;
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int H() {
        int iH = super.H();
        if (iH == -2) {
            return -2;
        }
        return this.T.getRecommendedTimeoutMillis(iH, (this.U ? 4 : 0) | 3);
    }

    @NonNull
    @z7.a
    public Snackbar H0(@l int i10) {
        w0().setTextColor(i10);
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar I0(ColorStateList colorStateList) {
        w0().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar J0(@l int i10) {
        return K0(ColorStateList.valueOf(i10));
    }

    @NonNull
    @z7.a
    public Snackbar K0(@p0 ColorStateList colorStateList) {
        this.f113863i.setBackgroundTintList(colorStateList);
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar L0(@p0 PorterDuff.Mode mode) {
        this.f113863i.setBackgroundTintMode(mode);
        return this;
    }

    @NonNull
    @z7.a
    @Deprecated
    public Snackbar M0(@p0 a aVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.V;
        if (sVar != null) {
            b0(sVar);
        }
        if (aVar != null) {
            u(aVar);
        }
        this.V = aVar;
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar N0(@r int i10) {
        x0().setMaxInlineActionWidth(i10);
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar O0(@f1 int i10) {
        return P0(G().getText(i10));
    }

    @NonNull
    @z7.a
    public Snackbar P0(@NonNull CharSequence charSequence) {
        y0().setText(charSequence);
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar Q0(@l int i10) {
        y0().setTextColor(i10);
        return this;
    }

    @NonNull
    @z7.a
    public Snackbar R0(ColorStateList colorStateList) {
        y0().setTextColor(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean S() {
        return super.S();
    }

    @NonNull
    @z7.a
    public Snackbar S0(int i10) {
        y0().setMaxLines(i10);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void m0() {
        super.m0();
    }
}
