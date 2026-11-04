package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.annotation.p0;
import io.sentry.ILogger;
import io.sentry.android.core.u0;
import io.sentry.y7;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f304345a = 1000;

    public static /* synthetic */ void a(View view, Canvas canvas, ILogger iLogger, CountDownLatch countDownLatch) {
        try {
            view.draw(canvas);
            countDownLatch.countDown();
        } catch (Throwable th2) {
            try {
                iLogger.a(y7.ERROR, "Taking screenshot failed (view.draw).", th2);
                countDownLatch.countDown();
            } catch (Throwable th3) {
                countDownLatch.countDown();
                throw th3;
            }
        }
    }

    public static /* synthetic */ void b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i10) {
        atomicBoolean.set(i10 == 0);
        countDownLatch.countDown();
    }

    @p0
    public static Bitmap c(@NotNull Activity activity, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        return d(activity, h.h(), iLogger, u0Var);
    }

    @e.a({"NewApi"})
    @p0
    public static Bitmap d(@NotNull Activity activity, @NotNull io.sentry.util.thread.a aVar, @NotNull final ILogger iLogger, @NotNull u0 u0Var) {
        boolean z10 = false;
        if (!f(activity)) {
            iLogger.c(y7.DEBUG, "Activity isn't valid, not taking screenshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(y7.DEBUG, "Activity window is null, not taking screenshot.", new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(y7.DEBUG, "DecorView is null, not taking screenshot.", new Object[0]);
            return null;
        }
        final View rootView = viewPeekDecorView.getRootView();
        if (rootView == null) {
            iLogger.c(y7.DEBUG, "Root view is null, not taking screenshot.", new Object[0]);
            return null;
        }
        if (rootView.getWidth() <= 0 || rootView.getHeight() <= 0) {
            iLogger.c(y7.DEBUG, "View's width and height is zeroed, not taking screenshot.", new Object[0]);
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            if (u0Var.d() >= 26) {
                HandlerThread handlerThread = new HandlerThread("SentryScreenshot");
                handlerThread.start();
                try {
                    Handler handler = new Handler(handlerThread.getLooper());
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    PixelCopy.request(window, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.core.internal.util.t
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            v.b(atomicBoolean, countDownLatch, i10);
                        }
                    }, handler);
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS) && atomicBoolean.get()) {
                        z10 = true;
                    }
                } catch (Throwable th2) {
                    try {
                        iLogger.a(y7.ERROR, "Taking screenshot using PixelCopy failed.", th2);
                    } catch (Throwable th3) {
                        handlerThread.quit();
                        throw th3;
                    }
                }
                handlerThread.quit();
                if (!z10) {
                    return null;
                }
            } else {
                final Canvas canvas = new Canvas(bitmapCreateBitmap);
                if (aVar.a()) {
                    rootView.draw(canvas);
                    countDownLatch.countDown();
                } else {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.internal.util.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.a(rootView, canvas, iLogger, countDownLatch);
                        }
                    });
                }
                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                    return null;
                }
            }
            return bitmapCreateBitmap;
        } catch (Throwable th4) {
            iLogger.a(y7.ERROR, "Taking screenshot failed.", th4);
            return null;
        }
    }

    @p0
    public static byte[] e(@p0 Bitmap bitmap, @NotNull ILogger iLogger) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                    bitmap.recycle();
                    if (byteArrayOutputStream.size() <= 0) {
                        iLogger.c(y7.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                        byteArrayOutputStream.close();
                        return null;
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                iLogger.a(y7.ERROR, "Compressing bitmap failed.", th4);
            }
        }
        return null;
    }

    private static boolean f(@NotNull Activity activity) {
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    @p0
    public static byte[] g(@NotNull Activity activity, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        return h(activity, h.h(), iLogger, u0Var);
    }

    @e.a({"NewApi"})
    @p0
    public static byte[] h(@NotNull Activity activity, @NotNull io.sentry.util.thread.a aVar, @NotNull ILogger iLogger, @NotNull u0 u0Var) {
        return e(d(activity, aVar, iLogger, u0Var), iLogger);
    }
}
