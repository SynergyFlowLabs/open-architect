package com.planner5d.library.widget;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final w1 f258867a = new w1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f258868b = 0;

    private w1() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[RETURN] */
    public final boolean a(@NotNull View view) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(view, "view");
        int[] drawableState = view.getDrawableState();
        Intrinsics.checkNotNullExpressionValue(drawableState, "getDrawableState(...)");
        for (int i10 : drawableState) {
            if (i10 == 16842908 || i10 == 16842919 || i10 == 16843518) {
                numValueOf = Integer.valueOf(i10);
                if (numValueOf != null) {
                    return true;
                }
                return false;
            }
        }
        numValueOf = null;
        if (numValueOf != null) {
            return true;
        }
        return false;
    }
}
