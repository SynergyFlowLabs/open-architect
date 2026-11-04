package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.ja;
import io.sentry.o7;
import io.sentry.y7;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class ScreenshotEventProcessor implements io.sentry.i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f303993d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f303994e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f303995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final u0 f303996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.m f303997c = new io.sentry.android.core.internal.util.m(io.sentry.android.core.internal.util.f.b(), 2000, 3);

    public ScreenshotEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull u0 u0Var) {
        this.f303995a = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f303996b = (u0) io.sentry.util.y.c(u0Var, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            io.sentry.util.q.a("Screenshot");
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    @Override // io.sentry.i0
    @NotNull
    public o7 c(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var) {
        final Bitmap bitmapD;
        if (o7Var.I0()) {
            if (!this.f303995a.isAttachScreenshot()) {
                this.f303995a.getLogger().c(y7.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return o7Var;
            }
            Activity activityC = b1.d().c();
            if (activityC != null && !io.sentry.util.n.i(n0Var)) {
                boolean zA = this.f303997c.a();
                SentryAndroidOptions.b beforeScreenshotCaptureCallback = this.f303995a.getBeforeScreenshotCaptureCallback();
                if (beforeScreenshotCaptureCallback != null) {
                    if (beforeScreenshotCaptureCallback.a(o7Var, n0Var, zA)) {
                        bitmapD = io.sentry.android.core.internal.util.v.d(activityC, this.f303995a.getThreadChecker(), this.f303995a.getLogger(), this.f303996b);
                        if (bitmapD == null) {
                            n0Var.q(io.sentry.b.a(new Callable() { // from class: io.sentry.android.core.b2
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return io.sentry.android.core.internal.util.v.e(bitmapD, this.f304083a.f303995a.getLogger());
                                }
                            }, "screenshot.png", androidx.media3.common.s0.X0, false));
                            n0Var.o(ja.f305664h, activityC);
                        }
                    }
                } else if (!zA) {
                    bitmapD = io.sentry.android.core.internal.util.v.d(activityC, this.f303995a.getThreadChecker(), this.f303995a.getLogger(), this.f303996b);
                    if (bitmapD == null) {
                        n0Var.q(io.sentry.b.a(new Callable() { // from class: io.sentry.android.core.b2
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return io.sentry.android.core.internal.util.v.e(bitmapD, this.f304083a.f303995a.getLogger());
                            }
                        }, "screenshot.png", androidx.media3.common.s0.X0, false));
                        n0Var.o(ja.f305664h, activityC);
                    }
                }
            }
        }
        return o7Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull io.sentry.n0 n0Var) {
        return c0Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 10000L;
    }
}
