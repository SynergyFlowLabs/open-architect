package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.w0;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 {

    @w0(23)
    private static class a {
        private a() {
        }

        public static void a(@NonNull PendingIntent pendingIntent, @NonNull Context context, int i10, @NonNull Intent intent, @androidx.annotation.p0 PendingIntent.OnFinished onFinished, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 String str, @androidx.annotation.p0 Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i10, intent, onFinished, handler, str, bundle);
        }
    }

    @w0(26)
    private static class b {
        private b() {
        }

        public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
            return PendingIntent.getForegroundService(context, i10, intent, i11);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private PendingIntent.OnFinished f47035b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f47034a = new CountDownLatch(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f47036c = false;

        d(@androidx.annotation.p0 PendingIntent.OnFinished onFinished) {
            this.f47035b = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
            boolean z10 = false;
            while (true) {
                try {
                    this.f47034a.await();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i10 = i10;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th2) {
                    if (!z10) {
                        throw th2;
                    }
                    Thread.currentThread().interrupt();
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.f47035b;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i10, str, bundle);
                this.f47035b = null;
            }
        }

        public void b() {
            this.f47036c = true;
        }

        @androidx.annotation.p0
        public PendingIntent.OnFinished c() {
            if (this.f47035b == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.i0
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i10, String str, Bundle bundle) {
                    this.f47039a.d(pendingIntent, intent, i10, str, bundle);
                }
            };
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f47036c) {
                this.f47035b = null;
            }
            this.f47034a.countDown();
        }
    }

    private h0() {
    }

    private static int a(boolean z10, int i10) {
        int i11;
        if (!z10) {
            i11 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i10;
            }
            i11 = com.google.api.client.googleapis.media.a.f115410j;
        }
        return i11 | i10;
    }

    @NonNull
    public static PendingIntent b(@NonNull Context context, int i10, @NonNull @e.a({"ArrayReturn"}) Intent[] intentArr, int i11, @androidx.annotation.p0 Bundle bundle, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11), bundle);
    }

    @NonNull
    public static PendingIntent c(@NonNull Context context, int i10, @NonNull @e.a({"ArrayReturn"}) Intent[] intentArr, int i11, boolean z10) {
        return PendingIntent.getActivities(context, i10, intentArr, a(z10, i11));
    }

    @androidx.annotation.p0
    public static PendingIntent d(@NonNull Context context, int i10, @NonNull Intent intent, int i11, @androidx.annotation.p0 Bundle bundle, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11), bundle);
    }

    @androidx.annotation.p0
    public static PendingIntent e(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getActivity(context, i10, intent, a(z10, i11));
    }

    @androidx.annotation.p0
    public static PendingIntent f(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getBroadcast(context, i10, intent, a(z10, i11));
    }

    @NonNull
    @w0(26)
    public static PendingIntent g(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return b.a(context, i10, intent, a(z10, i11));
    }

    @androidx.annotation.p0
    public static PendingIntent h(@NonNull Context context, int i10, @NonNull Intent intent, int i11, boolean z10) {
        return PendingIntent.getService(context, i10, intent, a(z10, i11));
    }

    @e.a({"LambdaLast"})
    public static void i(@NonNull PendingIntent pendingIntent, int i10, @androidx.annotation.p0 PendingIntent.OnFinished onFinished, @androidx.annotation.p0 Handler handler) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            pendingIntent.send(i10, dVar.c(), handler);
            dVar.b();
            dVar.close();
        } catch (Throwable th2) {
            try {
                dVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @e.a({"LambdaLast"})
    public static void j(@NonNull PendingIntent pendingIntent, @NonNull @e.a({"ContextFirst"}) Context context, int i10, @NonNull Intent intent, @androidx.annotation.p0 PendingIntent.OnFinished onFinished, @androidx.annotation.p0 Handler handler) throws PendingIntent.CanceledException {
        k(pendingIntent, context, i10, intent, onFinished, handler, null, null);
    }

    @e.a({"LambdaLast"})
    public static void k(@NonNull PendingIntent pendingIntent, @NonNull @e.a({"ContextFirst"}) Context context, int i10, @NonNull Intent intent, @androidx.annotation.p0 PendingIntent.OnFinished onFinished, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 String str, @androidx.annotation.p0 Bundle bundle) throws PendingIntent.CanceledException {
        d dVar = new d(onFinished);
        try {
            a.a(pendingIntent, context, i10, intent, onFinished, handler, str, bundle);
            dVar.b();
            dVar.close();
        } catch (Throwable th2) {
            try {
                dVar.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
