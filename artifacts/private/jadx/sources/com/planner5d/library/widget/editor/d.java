package com.planner5d.library.widget.editor;

import android.view.View;
import androidx.compose.runtime.internal.w0;
import com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior;
import com.planner5d.library.services.s;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@w0(parameters = 0)
public final class d extends AdvancedBottomSheetBehavior.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f254722b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f254723a;

    public d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f254723a = view;
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void b(@NotNull View bottomSheet, float f10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
    }

    @Override // com.google.android.material.bottomsheet.AdvancedBottomSheetBehavior.e
    public void c(@NotNull View bottomSheet, int i10) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            s.f(this.f254723a, false);
        }
    }
}
