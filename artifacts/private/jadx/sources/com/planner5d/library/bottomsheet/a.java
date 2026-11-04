package com.planner5d.library.bottomsheet;

import android.view.View;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdvancedBottomSheetBehavior.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f148350a;

    public a(@NotNull Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f148350a = onClose;
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void b(@NotNull View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void c(@NotNull View bottomSheet, int i10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i10 == 5) {
            this.f148350a.invoke();
        }
    }
}
