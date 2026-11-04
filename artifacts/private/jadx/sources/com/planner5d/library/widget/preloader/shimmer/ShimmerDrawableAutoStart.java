package com.planner5d.library.widget.preloader.shimmer;

import androidx.compose.runtime.internal.w0;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 1)
public class ShimmerDrawableAutoStart extends ShimmerDrawable {
    public static final int $stable = 0;

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        if (z10) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z10, z11);
    }
}
