package androidx.media3.exoplayer.source;

import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.f5;
import androidx.media3.exoplayer.t3;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface s0 extends t1 {

    public interface a extends t1.a<s0> {
        void j(s0 s0Var);
    }

    @Override // androidx.media3.exoplayer.source.t1
    long b();

    @Override // androidx.media3.exoplayer.source.t1
    void c(long j10);

    @Override // androidx.media3.exoplayer.source.t1
    boolean d();

    @Override // androidx.media3.exoplayer.source.t1
    long e();

    default List<StreamKey> f(List<androidx.media3.exoplayer.trackselection.c0> list) {
        return Collections.EMPTY_LIST;
    }

    long g(long j10, f5 f5Var);

    long h(long j10);

    long i();

    @Override // androidx.media3.exoplayer.source.t1
    boolean k(t3 t3Var);

    h2 m();

    void o() throws IOException;

    void p(long j10, boolean z10);

    long t(androidx.media3.exoplayer.trackselection.c0[] c0VarArr, boolean[] zArr, s1[] s1VarArr, boolean[] zArr2, long j10);

    void v(a aVar, long j10);
}
