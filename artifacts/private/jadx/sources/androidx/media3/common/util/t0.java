package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class t0 implements j {
    protected t0() {
    }

    @Override // androidx.media3.common.util.j
    public long a() {
        return System.nanoTime();
    }

    @Override // androidx.media3.common.util.j
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // androidx.media3.common.util.j
    public long c() {
        return SystemClock.uptimeMillis();
    }

    @Override // androidx.media3.common.util.j
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // androidx.media3.common.util.j
    public u d(Looper looper, @androidx.annotation.p0 Handler.Callback callback) {
        return new u0(new Handler(looper, callback));
    }

    @Override // androidx.media3.common.util.j
    public void e() {
    }
}
