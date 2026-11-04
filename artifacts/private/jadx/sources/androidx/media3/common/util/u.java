package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface u {

    public interface a {
        void a();

        u y1();
    }

    a a(int i10);

    a b(int i10, @androidx.annotation.p0 Object obj);

    void c(@androidx.annotation.p0 Object obj);

    a d(int i10, int i11, int i12);

    a e(int i10, int i11, int i12, @androidx.annotation.p0 Object obj);

    Looper f();

    boolean g(Runnable runnable);

    boolean h(Runnable runnable, long j10);

    boolean i(int i10);

    boolean j(int i10, long j10);

    void k(int i10);

    boolean l(int i10, int i11);

    boolean m(Runnable runnable);

    boolean n(int i10);

    boolean o(a aVar);
}
