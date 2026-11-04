package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.t3;
import com.google.common.collect.l6;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class i implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l6<a> f65079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65080b;

    private static final class a implements t1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t1 f65081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l6<Integer> f65082b;

        public a(t1 t1Var, List<Integer> list) {
            this.f65081a = t1Var;
            this.f65082b = l6.w(list);
        }

        public l6<Integer> a() {
            return this.f65082b;
        }

        @Override // androidx.media3.exoplayer.source.t1
        public long b() {
            return this.f65081a.b();
        }

        @Override // androidx.media3.exoplayer.source.t1
        public void c(long j10) {
            this.f65081a.c(j10);
        }

        @Override // androidx.media3.exoplayer.source.t1
        public boolean d() {
            return this.f65081a.d();
        }

        @Override // androidx.media3.exoplayer.source.t1
        public long e() {
            return this.f65081a.e();
        }

        @Override // androidx.media3.exoplayer.source.t1
        public boolean k(t3 t3Var) {
            return this.f65081a.k(t3Var);
        }
    }

    @Deprecated
    public i(t1[] t1VarArr) {
        this(l6.B(t1VarArr), Collections.nCopies(t1VarArr.length, l6.G(-1)));
    }

    @Override // androidx.media3.exoplayer.source.t1
    public long b() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f65079a.size(); i10++) {
            a aVar = this.f65079a.get(i10);
            long jB = aVar.b();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
            if (jB != Long.MIN_VALUE) {
                jMin2 = Math.min(jMin2, jB);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f65080b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j10 = this.f65080b;
        return j10 != -9223372036854775807L ? j10 : jMin2;
    }

    @Override // androidx.media3.exoplayer.source.t1
    public void c(long j10) {
        for (int i10 = 0; i10 < this.f65079a.size(); i10++) {
            this.f65079a.get(i10).c(j10);
        }
    }

    @Override // androidx.media3.exoplayer.source.t1
    public boolean d() {
        for (int i10 = 0; i10 < this.f65079a.size(); i10++) {
            if (this.f65079a.get(i10).d()) {
                int i11 = 4 ^ 1;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.t1
    public long e() {
        long jMin = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f65079a.size(); i10++) {
            long jE = this.f65079a.get(i10).e();
            if (jE != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jE);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // androidx.media3.exoplayer.source.t1
    public boolean k(t3 t3Var) {
        boolean zK;
        boolean z10 = false;
        do {
            long jE = e();
            if (jE == Long.MIN_VALUE) {
                return z10;
            }
            zK = false;
            for (int i10 = 0; i10 < this.f65079a.size(); i10++) {
                long jE2 = this.f65079a.get(i10).e();
                boolean z11 = jE2 != Long.MIN_VALUE && jE2 <= t3Var.f65600a;
                if (jE2 == jE || z11) {
                    zK |= this.f65079a.get(i10).k(t3Var);
                }
            }
            z10 |= zK;
        } while (zK);
        return z10;
    }

    public i(List<? extends t1> list, List<List<Integer>> list2) {
        l6.a aVarS = l6.s();
        androidx.media3.common.util.a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            aVarS.a(new a(list.get(i10), list2.get(i10)));
        }
        this.f65079a = aVarS.e();
        this.f65080b = -9223372036854775807L;
    }
}
