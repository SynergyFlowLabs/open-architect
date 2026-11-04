package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface d1 {

    public interface a {
        void L(d1 d1Var, long j10);

        void P(d1 d1Var, long j10, boolean z10);

        void l(d1 d1Var, long j10);
    }

    void a(a aVar);

    void b(@androidx.annotation.p0 long[] jArr, @androidx.annotation.p0 boolean[] zArr, int i10);

    void c(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setKeyCountIncrement(int i10);

    void setKeyTimeIncrement(long j10);

    void setPosition(long j10);
}
