package androidx.work.impl.utils;

import androidx.annotation.w0;
import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(26)
@oj.i(name = "DurationApi26Impl")
public final class c {
    @androidx.annotation.u
    public static final long a(@NotNull Duration duration) {
        Intrinsics.checkNotNullParameter(duration, "<this>");
        return duration.toMillis();
    }
}
