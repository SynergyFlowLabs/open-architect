package androidx.work.impl.constraints.trackers;

import androidx.work.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final String f76792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f76793b = 0.15f;

    static {
        String strI = v.i("BatteryNotLowTracker");
        Intrinsics.checkNotNullExpressionValue(strI, "tagWithPrefix(\"BatteryNotLowTracker\")");
        f76792a = strI;
    }
}
