package com.google.android.filament.android;

import com.google.android.filament.Engine;
import com.google.android.filament.Fence;

/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static void a(Engine engine) {
        Fence fenceP = engine.p();
        fenceP.c(Fence.b.FLUSH, -1L);
        engine.B(fenceP);
    }
}
