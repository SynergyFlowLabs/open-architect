package androidx.media2.exoplayer.external.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f57511a = new h0();

    long b();

    long c();

    n d(Looper looper, @androidx.annotation.p0 Handler.Callback callback);

    void e(long sleepTimeMs);
}
