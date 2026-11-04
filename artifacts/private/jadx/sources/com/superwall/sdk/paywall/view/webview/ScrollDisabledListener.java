package com.superwall.sdk.paywall.view.webview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class ScrollDisabledListener extends GestureDetector.SimpleOnGestureListener {
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onFling(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e10, "e2");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(@Nullable MotionEvent motionEvent, @NotNull MotionEvent e10, float f10, float f11) {
        Intrinsics.checkNotNullParameter(e10, "e2");
        return true;
    }
}
