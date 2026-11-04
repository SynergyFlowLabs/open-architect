package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f61520a = new t0();

    long a();

    long b();

    long c();

    long currentTimeMillis();

    u d(Looper looper, @androidx.annotation.p0 Handler.Callback callback);

    void e();
}
