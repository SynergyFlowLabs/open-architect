package io.sentry.android.replay.util;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f305025b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Handler f305026a;

    /* JADX WARN: Multi-variable type inference failed */
    public j() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Handler a() {
        return this.f305026a;
    }

    public final boolean b(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return this.f305026a.post(runnable);
    }

    public final boolean c(@Nullable Runnable runnable, long j10) {
        Handler handler = this.f305026a;
        if (runnable == null) {
            return false;
        }
        return handler.postDelayed(runnable, j10);
    }

    public final void d(@Nullable Runnable runnable) {
        Handler handler = this.f305026a;
        if (runnable == null) {
            return;
        }
        handler.removeCallbacks(runnable);
    }

    public j(@NotNull Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f305026a = new Handler(looper);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ j(Looper looper, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 1) != 0) {
            looper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(looper, "getMainLooper(...)");
        }
        this(looper);
    }
}
