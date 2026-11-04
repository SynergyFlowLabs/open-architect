package com.planner5d.library.widget.editor.popup.itemproperties;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.w0;
import androidx.core.view.d0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.planner5d.library.services.utility.h3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public final class a extends com.google.android.material.bottomsheet.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f257272v = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, int i10) {
        super(context, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void A(int i10) {
        int iA = h3.A(getContext());
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR = r();
        if (i10 != 2) {
            iA /= 2;
        }
        bottomSheetBehaviorR.p1(iA);
    }

    private final void B() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(com.planner5d.library.f.g.f166945e1);
        Window window = getWindow();
        if (window != null) {
            if (dimensionPixelSize == 0) {
                dimensionPixelSize = -1;
            }
            window.setLayout(dimensionPixelSize, -1);
        }
    }

    public final void C(int i10) {
        B();
        A(i10);
    }

    @Override // com.google.android.material.bottomsheet.e, androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = d0.f48643b;
            window.clearFlags(2);
            window.setAttributes(attributes);
        }
        B();
        A(getContext().getResources().getConfiguration().orientation);
    }
}
