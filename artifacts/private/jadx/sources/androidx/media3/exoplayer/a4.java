package androidx.media3.exoplayer;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.t0.b f62779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f62783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f62787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f62788j;

    a4(androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        androidx.media3.common.util.a.a(!z14 || z12);
        androidx.media3.common.util.a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        androidx.media3.common.util.a.a(z15);
        this.f62779a = bVar;
        this.f62780b = j10;
        this.f62781c = j11;
        this.f62782d = j12;
        this.f62783e = j13;
        this.f62784f = z10;
        this.f62785g = z11;
        this.f62786h = z12;
        this.f62787i = z13;
        this.f62788j = z14;
    }

    public a4 a(long j10) {
        return j10 == this.f62781c ? this : new a4(this.f62779a, this.f62780b, j10, this.f62782d, this.f62783e, this.f62784f, this.f62785g, this.f62786h, this.f62787i, this.f62788j);
    }

    public a4 b(long j10) {
        return j10 == this.f62780b ? this : new a4(this.f62779a, j10, this.f62781c, this.f62782d, this.f62783e, this.f62784f, this.f62785g, this.f62786h, this.f62787i, this.f62788j);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a4.class == obj.getClass()) {
            a4 a4Var = (a4) obj;
            if (this.f62780b == a4Var.f62780b && this.f62781c == a4Var.f62781c && this.f62782d == a4Var.f62782d && this.f62783e == a4Var.f62783e && this.f62784f == a4Var.f62784f && this.f62785g == a4Var.f62785g && this.f62786h == a4Var.f62786h && this.f62787i == a4Var.f62787i && this.f62788j == a4Var.f62788j && Objects.equals(this.f62779a, a4Var.f62779a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f62779a.hashCode()) * 31) + ((int) this.f62780b)) * 31) + ((int) this.f62781c)) * 31) + ((int) this.f62782d)) * 31) + ((int) this.f62783e)) * 31) + (this.f62784f ? 1 : 0)) * 31) + (this.f62785g ? 1 : 0)) * 31) + (this.f62786h ? 1 : 0)) * 31) + (this.f62787i ? 1 : 0)) * 31) + (this.f62788j ? 1 : 0);
    }
}
