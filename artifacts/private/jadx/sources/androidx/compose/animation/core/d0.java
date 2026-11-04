package androidx.compose.animation.core;

import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final int a(@NotNull float[] fArr, float f10) {
        boolean z10 = false;
        return ArraysKt.binarySearch$default(fArr, f10, 0, 0, 6, (Object) null);
    }

    public static final double b(double d10) {
        return Math.toRadians(d10);
    }
}
