package androidx.media3.exoplayer.trackselection;

import android.os.SystemClock;
import androidx.annotation.p0;
import androidx.media3.common.b4;
import androidx.media3.common.util.b1;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.source.t0;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g0 extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Random f65697k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f65698l;

    public g0(b4 b4Var, int[] iArr, int i10, Random random) {
        super(b4Var, iArr, i10);
        this.f65697k = random;
        this.f65698l = random.nextInt(this.f65668d);
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int a() {
        return this.f65698l;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    @p0
    public Object n() {
        return null;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public int o() {
        return 3;
    }

    @Override // androidx.media3.exoplayer.trackselection.c0
    public void v(long j10, long j11, long j12, List<? extends androidx.media3.exoplayer.source.chunk.m> list, androidx.media3.exoplayer.source.chunk.n[] nVarArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        for (int i11 = 0; i11 < this.f65668d; i11++) {
            if (!q(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        this.f65698l = this.f65697k.nextInt(i10);
        if (i10 != this.f65668d) {
            int i12 = 0;
            for (int i13 = 0; i13 < this.f65668d; i13++) {
                if (!q(i13, jElapsedRealtime)) {
                    int i14 = i12 + 1;
                    if (this.f65698l == i12) {
                        this.f65698l = i13;
                        return;
                    }
                    i12 = i14;
                }
            }
        }
    }

    public static final class a implements c0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f65699a;

        public a() {
            this.f65699a = new Random();
        }

        public static /* synthetic */ c0 b(a aVar, c0.a aVar2) {
            aVar.getClass();
            return new g0(aVar2.f65676a, aVar2.f65677b, aVar2.f65678c, aVar.f65699a);
        }

        @Override // androidx.media3.exoplayer.trackselection.c0.b
        public c0[] a(c0.a[] aVarArr, androidx.media3.exoplayer.upstream.d dVar, t0.b bVar, z3 z3Var) {
            return j0.d(aVarArr, new j0.a() { // from class: androidx.media3.exoplayer.trackselection.f0
                @Override // androidx.media3.exoplayer.trackselection.j0.a
                public final c0 a(c0.a aVar) {
                    return g0.a.b(this.f65694a, aVar);
                }
            });
        }

        public a(int i10) {
            this.f65699a = new Random(i10);
        }
    }
}
