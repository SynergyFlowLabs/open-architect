package androidx.media2.exoplayer.external.util;

import android.os.SystemClock;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f57531a;

    public synchronized void a() throws InterruptedException {
        while (!this.f57531a) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized boolean b(long timeout) throws InterruptedException {
        boolean z10;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = timeout + jElapsedRealtime;
            while (true) {
                z10 = this.f57531a;
                if (z10 || jElapsedRealtime >= j10) {
                    break;
                }
                wait(j10 - jElapsedRealtime);
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return z10;
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f57531a;
        this.f57531a = false;
        return z10;
    }

    public synchronized boolean d() {
        try {
            if (this.f57531a) {
                return false;
            }
            this.f57531a = true;
            notifyAll();
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
