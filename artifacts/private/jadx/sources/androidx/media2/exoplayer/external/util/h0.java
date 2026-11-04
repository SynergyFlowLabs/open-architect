package androidx.media2.exoplayer.external.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class h0 implements c {
    h0() {
    }

    @Override // androidx.media2.exoplayer.external.util.c
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.media2.exoplayer.external.util.c
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // androidx.media2.exoplayer.external.util.c
    public n d(Looper looper, @androidx.annotation.p0 Handler.Callback callback) {
        return new i0(new Handler(looper, callback));
    }

    @Override // androidx.media2.exoplayer.external.util.c
    public void e(long sleepTimeMs) {
        SystemClock.sleep(sleepTimeMs);
    }
}
