package androidx.activity.result;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final int a(@NotNull ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "<this>");
        return activityResult.b();
    }

    @Nullable
    public static final Intent b(@NotNull ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(activityResult, "<this>");
        return activityResult.a();
    }
}
