package com.planner5d.library.widget;

import android.content.Context;
import android.util.AttributeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public class TabLayout extends com.google.android.material.tabs.TabLayout {

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final int f249526g4 = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TabLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(TabLayout tabLayout, int i10) {
        com.google.android.material.badge.a aVarJ;
        com.google.android.material.tabs.TabLayout.i iVarD = tabLayout.D(i10);
        if (iVarD != null && (aVarJ = iVarD.j()) != null) {
            aVarJ.k0(tabLayout.getContext().getColor(c1.e.f250431eg));
            aVarJ.G0((int) tabLayout.getResources().getDimension(c1.f.Ud));
            aVarJ.w0((int) tabLayout.getResources().getDimension(c1.f.Td));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(TabLayout tabLayout, int i10) {
        com.google.android.material.tabs.TabLayout.i iVarD = tabLayout.D(i10);
        if (iVarD != null) {
            iVarD.p();
        }
    }

    public final void g0(final int i10) {
        post(new Runnable() { // from class: com.planner5d.library.widget.o1
            @Override // java.lang.Runnable
            public final void run() {
                TabLayout.h0(this.f258424a, i10);
            }
        });
    }

    public final boolean i0(final int i10) {
        return post(new Runnable() { // from class: com.planner5d.library.widget.p1
            @Override // java.lang.Runnable
            public final void run() {
                TabLayout.j0(this.f258432a, i10);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TabLayout(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @oj.j
    public TabLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
