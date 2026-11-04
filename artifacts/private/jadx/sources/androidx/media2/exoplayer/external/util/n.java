package androidx.media2.exoplayer.external.util;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface n {
    Message a(int what);

    Message b(int what, @androidx.annotation.p0 Object obj);

    void c(@androidx.annotation.p0 Object token);

    Message d(int what, int arg1, int arg2);

    Message e(int what, int arg1, int arg2, @androidx.annotation.p0 Object obj);

    Looper f();

    boolean g(Runnable runnable);

    boolean h(Runnable runnable, long delayMs);

    boolean i(int what);

    boolean j(int what, long uptimeMs);

    void k(int what);
}
