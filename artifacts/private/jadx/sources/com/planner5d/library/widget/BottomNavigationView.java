package com.planner5d.library.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.navigation.NavigationBarView;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBottomNavigationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigationView.kt\ncom/planner5d/library/widget/BottomNavigationView\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n+ 3 Menu.kt\nandroidx/core/view/MenuKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n48#2:96\n57#3,4:97\n1#4:101\n*S KotlinDebug\n*F\n+ 1 BottomNavigationView.kt\ncom/planner5d/library/widget/BottomNavigationView\n*L\n33#1:96\n59#1:97,4\n*E\n"})
public final class BottomNavigationView extends com.google.android.material.bottomnavigation.c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f249427o = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f249428s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f249429t = 10;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private Integer f249430m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private NavigationBarView.d f249431n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public BottomNavigationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @e.a({"RestrictedApi"})
    private final void p(com.google.android.material.bottomnavigation.a aVar, View view) {
        int iIntValue;
        int dimensionPixelSize = getResources().getDimensionPixelSize(c1.f.Rd);
        Drawable drawableL = androidx.core.content.d.l(getContext(), c1.g.M5);
        ImageView imageView = new ImageView(getContext());
        Integer num = this.f249430m;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            int iGenerateViewId = View.generateViewId();
            this.f249430m = Integer.valueOf(iGenerateViewId);
            iIntValue = iGenerateViewId;
        }
        imageView.setId(iIntValue);
        imageView.setImageDrawable(drawableL);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = view.getTop() - dimensionPixelSize;
        layoutParams.leftMargin = (view.getRight() - (drawableL != null ? drawableL.getIntrinsicWidth() : 0)) + dimensionPixelSize;
        Unit unit = Unit.f312394a;
        aVar.addView(imageView, layoutParams);
    }

    @e.a({"RestrictedApi"})
    private final void r(com.google.android.material.bottomnavigation.a aVar) {
        Integer num = this.f249430m;
        if (num != null) {
            aVar.removeView(aVar.findViewById(num.intValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(BottomNavigationView bottomNavigationView, com.google.android.material.bottomnavigation.a aVar, boolean z10, FrameLayout frameLayout) {
        bottomNavigationView.r(aVar);
        if (z10) {
            bottomNavigationView.p(aVar, frameLayout);
        }
    }

    @Override // com.google.android.material.bottomnavigation.c, com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 10;
    }

    @Nullable
    public final NavigationBarView.d getOnItemSelectedListener() {
        return this.f249431n;
    }

    public final void q(boolean z10) {
        boolean z11 = !z10;
        Menu menu = getMenu();
        Intrinsics.checkNotNullExpressionValue(menu, "getMenu(...)");
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = menu.getItem(i10);
            if (item.isEnabled() != z11) {
                item.setEnabled(z11);
            }
        }
    }

    @e.a({"RestrictedApi"})
    public final void s(int i10, final boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        com.google.android.material.bottomnavigation.b bVar = childAt instanceof com.google.android.material.bottomnavigation.b ? (com.google.android.material.bottomnavigation.b) childAt : null;
        if (bVar == null) {
            return;
        }
        for (View view : androidx.core.view.a2.e(bVar)) {
            final com.google.android.material.bottomnavigation.a aVar = view instanceof com.google.android.material.bottomnavigation.a ? (com.google.android.material.bottomnavigation.a) view : null;
            if (aVar != null && aVar.getId() == i10) {
                for (View view2 : androidx.core.view.a2.e(aVar)) {
                    final FrameLayout frameLayout = view2 instanceof FrameLayout ? (FrameLayout) view2 : null;
                    if (frameLayout != null) {
                        frameLayout.post(new Runnable() { // from class: com.planner5d.library.widget.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                BottomNavigationView.t(this.f254288a, aVar, z10, frameLayout);
                            }
                        });
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public void setOnItemSelectedListener(@Nullable NavigationBarView.d dVar) {
        super.setOnItemSelectedListener(dVar);
        this.f249431n = dVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public BottomNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
        int i10 = 6 << 0;
    }

    public /* synthetic */ BottomNavigationView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public BottomNavigationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
