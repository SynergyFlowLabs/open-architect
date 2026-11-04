package io.noties.markwon.utils;

import android.text.Layout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f298612a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f298613b = 1.0f;

    private e() {
    }

    public static int a(@NonNull Layout layout, int i10) {
        int lineBottom = layout.getLineBottom(i10);
        boolean z10 = i10 == layout.getLineCount() - 1;
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if ((spacingAdd != 0.0f || spacingMultiplier != 1.0f) && !z10) {
            if (Float.compare(1.0f, spacingMultiplier) != 0) {
                float fB = b(layout, i10);
                spacingAdd = fB - ((fB - spacingAdd) / spacingMultiplier);
            }
            lineBottom = (int) ((lineBottom - spacingAdd) + 0.5f);
        }
        return (z10 && i10 == layout.getLineCount() - 1) ? lineBottom - layout.getBottomPadding() : lineBottom;
    }

    public static int b(@NonNull Layout layout, int i10) {
        return layout.getLineTop(i10 + 1) - layout.getLineTop(i10);
    }

    public static int c(@NonNull Layout layout, int i10) {
        int lineTop = layout.getLineTop(i10);
        return i10 == 0 ? lineTop - layout.getTopPadding() : lineTop;
    }
}
