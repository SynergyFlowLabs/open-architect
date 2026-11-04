package androidx.media3.extractor.mp3;

import androidx.annotation.l1;
import androidx.collection.g3;
import androidx.media3.common.util.k1;
import androidx.media3.extractor.j0;
import androidx.media3.extractor.p0;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
final class b implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final long f67842g = 100000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f67843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f67844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f67845f;

    public b(long j10, long j11, long j12) {
        this.f67845f = new j0(new long[]{j11}, new long[]{0}, j10);
        this.f67843d = j12;
        int i10 = androidx.media3.common.j.f60676f;
        if (j10 == -9223372036854775807L) {
            this.f67844e = androidx.media3.common.j.f60676f;
            return;
        }
        long jA2 = k1.a2(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jA2 > 0 && jA2 <= g3.f12256c) {
            i10 = (int) jA2;
        }
        this.f67844e = i10;
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f67845f.Q1();
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        return this.f67845f.R1(j10);
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return this.f67845f.S1();
    }

    public boolean a(long j10) {
        return this.f67845f.b(j10, 100000L);
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f67845f.a(j10, j11);
    }

    void c(long j10) {
        this.f67845f.c(j10);
    }

    @Override // androidx.media3.extractor.mp3.g
    public long d() {
        return this.f67843d;
    }

    @Override // androidx.media3.extractor.mp3.g
    public long e(long j10) {
        return this.f67845f.e(j10);
    }

    @Override // androidx.media3.extractor.mp3.g
    public int i() {
        return this.f67844e;
    }
}
