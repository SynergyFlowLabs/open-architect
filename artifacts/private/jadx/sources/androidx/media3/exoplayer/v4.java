package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f66220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private Looper f66221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private HandlerThread f66222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    private int f66223d;

    public v4() {
        this(null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f66220a) {
            try {
                if (this.f66221b == null) {
                    androidx.media3.common.util.a.i(this.f66223d == 0 && this.f66222c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f66222c = handlerThread;
                    handlerThread.start();
                    this.f66221b = this.f66222c.getLooper();
                }
                this.f66223d++;
                looper = this.f66221b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f66220a) {
            try {
                androidx.media3.common.util.a.i(this.f66223d > 0);
                int i10 = this.f66223d - 1;
                this.f66223d = i10;
                if (i10 == 0 && (handlerThread = this.f66222c) != null) {
                    handlerThread.quit();
                    this.f66222c = null;
                    this.f66221b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public v4(Looper looper) {
        this.f66220a = new Object();
        this.f66221b = looper;
        this.f66222c = null;
        boolean z10 = true | false;
        this.f66223d = 0;
    }
}
