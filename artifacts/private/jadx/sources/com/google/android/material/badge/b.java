package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.d0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.accessibility.j;
import androidx.core.view.u1;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.h0;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.material.badge.c
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f111284a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f111285b = "BadgeUtils";

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Toolbar f111286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f111287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f111288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FrameLayout f111289d;

        a(Toolbar toolbar, int i10, com.google.android.material.badge.a aVar, FrameLayout frameLayout) {
            this.f111286a = toolbar;
            this.f111287b = i10;
            this.f111288c = aVar;
            this.f111289d = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView actionMenuItemViewA = h0.a(this.f111286a, this.f111287b);
            if (actionMenuItemViewA != null) {
                b.n(this.f111288c, this.f111286a.getResources());
                b.d(this.f111288c, actionMenuItemViewA, this.f111289d);
                b.b(this.f111288c, actionMenuItemViewA);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.badge.b$b, reason: collision with other inner class name */
    class C0979b extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f111290a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0979b(View.AccessibilityDelegate accessibilityDelegate, com.google.android.material.badge.a aVar) {
            super(accessibilityDelegate);
            this.f111290a = aVar;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(this.f111290a.r());
        }
    }

    class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.badge.a f111291a;

        c(com.google.android.material.badge.a aVar) {
            this.f111291a = aVar;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(this.f111291a.r());
        }
    }

    class d extends androidx.core.view.a {
        d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.o1(null);
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@NonNull com.google.android.material.badge.a aVar, @NonNull View view) {
        if (u1.J0(view)) {
            u1.G1(view, new C0979b(view.getAccessibilityDelegate(), aVar));
        } else {
            u1.G1(view, new c(aVar));
        }
    }

    public static void c(@NonNull com.google.android.material.badge.a aVar, @NonNull View view) {
        d(aVar, view, null);
    }

    public static void d(@NonNull com.google.android.material.badge.a aVar, @NonNull View view, @p0 FrameLayout frameLayout) {
        m(aVar, view, frameLayout);
        if (aVar.s() != null) {
            aVar.s().setForeground(aVar);
        } else {
            if (f111284a) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(aVar);
        }
    }

    public static void e(@NonNull com.google.android.material.badge.a aVar, @NonNull Toolbar toolbar, @d0 int i10) {
        f(aVar, toolbar, i10, null);
    }

    public static void f(@NonNull com.google.android.material.badge.a aVar, @NonNull Toolbar toolbar, @d0 int i10, @p0 FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i10, aVar, frameLayout));
    }

    @NonNull
    public static SparseArray<com.google.android.material.badge.a> g(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<com.google.android.material.badge.a> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i10 = 0; i10 < parcelableSparseArray.size(); i10++) {
            int iKeyAt = parcelableSparseArray.keyAt(i10);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i10);
            sparseArray.put(iKeyAt, state != null ? com.google.android.material.badge.a.h(context, state) : null);
        }
        return sparseArray;
    }

    @NonNull
    public static ParcelableSparseArray h(@NonNull SparseArray<com.google.android.material.badge.a> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            com.google.android.material.badge.a aVarValueAt = sparseArray.valueAt(i10);
            parcelableSparseArray.put(iKeyAt, aVarValueAt != null ? aVarValueAt.G() : null);
        }
        return parcelableSparseArray;
    }

    private static void i(@NonNull View view) {
        if (u1.J0(view)) {
            u1.G1(view, new d(view.getAccessibilityDelegate()));
        } else {
            u1.G1(view, null);
        }
    }

    public static void j(@p0 com.google.android.material.badge.a aVar, @NonNull View view) {
        if (aVar == null) {
            return;
        }
        if (!f111284a && aVar.s() == null) {
            view.getOverlay().remove(aVar);
            return;
        }
        aVar.s().setForeground(null);
    }

    public static void k(@p0 com.google.android.material.badge.a aVar, @NonNull Toolbar toolbar, @d0 int i10) {
        if (aVar == null) {
            return;
        }
        ActionMenuItemView actionMenuItemViewA = h0.a(toolbar, i10);
        if (actionMenuItemViewA != null) {
            l(aVar);
            j(aVar, actionMenuItemViewA);
            i(actionMenuItemViewA);
        }
    }

    @l1
    static void l(com.google.android.material.badge.a aVar) {
        aVar.h0(0);
        aVar.i0(0);
    }

    public static void m(@NonNull com.google.android.material.badge.a aVar, @NonNull View view, @p0 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.P0(view, frameLayout);
    }

    @l1
    static void n(com.google.android.material.badge.a aVar, Resources resources) {
        aVar.h0(resources.getDimensionPixelOffset(r6.a.f.f360429ua));
        aVar.i0(resources.getDimensionPixelOffset(r6.a.f.f360445va));
    }

    public static void o(@NonNull Rect rect, float f10, float f11, float f12, float f13) {
        rect.set((int) (f10 - f12), (int) (f11 - f13), (int) (f10 + f12), (int) (f11 + f13));
    }
}
