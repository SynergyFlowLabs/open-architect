package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j;
import androidx.core.view.accessibility.m;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
public class h extends AppCompatImageView implements AccessibilityManager.AccessibilityStateChangeListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f111589j = r6.a.n.f361327nf;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final AccessibilityManager f111590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private BottomSheetBehavior<?> f111591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f111593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f111594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f111595f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f111596g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f111597h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final BottomSheetBehavior.g f111598i;

    class a extends BottomSheetBehavior.g {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i10) {
            h.this.k(i10);
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                h.this.h();
            }
        }
    }

    public h(@NonNull Context context) {
        this(context, null);
    }

    private void g(String str) {
        if (this.f111590a == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        accessibilityEventObtain.getText().add(str);
        this.f111590a.sendAccessibilityEvent(accessibilityEventObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h() {
        boolean z10 = false;
        if (!this.f111593d) {
            return false;
        }
        g(this.f111597h);
        if (!this.f111591b.R0() && !this.f111591b.B1()) {
            z10 = true;
        }
        int state = this.f111591b.getState();
        int i10 = 6;
        int i11 = 3;
        if (state == 4) {
            if (!z10) {
                i10 = i11;
            }
        } else if (state != 3) {
            if (!this.f111594e) {
                i11 = 4;
            }
            i10 = i11;
        } else if (!z10) {
            i10 = 4;
        }
        this.f111591b.g(i10);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.material.bottomsheet.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    @p0
    private BottomSheetBehavior<?> i() {
        while (true) {
            this = j(this);
            if (this == 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
                if (cVarF instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) cVarF;
                }
            }
        }
    }

    @p0
    private static View j(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i10) {
        if (i10 == 4) {
            this.f111594e = true;
        } else if (i10 == 3) {
            this.f111594e = false;
        }
        u1.z1(this, j.a.f48547j, this.f111594e ? this.f111595f : this.f111596g, new m() { // from class: com.google.android.material.bottomsheet.g
            @Override // androidx.core.view.accessibility.m
            public final boolean a(View view, m.a aVar) {
                return this.f111588a.h();
            }
        });
    }

    private void l() {
        int i10 = 1;
        this.f111593d = this.f111592c && this.f111591b != null;
        if (this.f111591b == null) {
            i10 = 2;
        }
        u1.Y1(this, i10);
        setClickable(this.f111593d);
    }

    private void setBottomSheetBehavior(@p0 BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.f111591b;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.Y0(this.f111598i);
            this.f111591b.d1(null);
        }
        this.f111591b = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.d1(this);
            k(this.f111591b.getState());
            this.f111591b.h0(this.f111598i);
        }
        l();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z10) {
        this.f111592c = z10;
        l();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(i());
        AccessibilityManager accessibilityManager = this.f111590a;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.f111590a.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.f111590a;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public h(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359394m1);
    }

    public h(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(a7.a.c(context, attributeSet, i10, f111589j), attributeSet, i10);
        this.f111595f = getResources().getString(r6.a.m.E);
        this.f111596g = getResources().getString(r6.a.m.D);
        this.f111597h = getResources().getString(r6.a.m.G);
        this.f111598i = new a();
        this.f111590a = (AccessibilityManager) getContext().getSystemService("accessibility");
        l();
        u1.G1(this, new b());
    }
}
