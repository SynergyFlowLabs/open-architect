package androidx.media3.exoplayer;

import android.os.SystemClock;
import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class u4 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final androidx.media3.exoplayer.source.t0.b f65816u = new androidx.media3.exoplayer.source.t0.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.common.z3 f65817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.t0.b f65818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f65819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f65820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f65821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final s0 f65822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f65823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.h2 f65824h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.trackselection.l0 f65825i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<androidx.media3.common.r0> f65826j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.t0.b f65827k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f65828l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f65829m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f65830n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final androidx.media3.common.y0 f65831o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f65832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f65833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f65834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile long f65835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile long f65836t;

    public u4(androidx.media3.common.z3 z3Var, androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11, int i10, @androidx.annotation.p0 s0 s0Var, boolean z10, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.l0 l0Var, List<androidx.media3.common.r0> list, androidx.media3.exoplayer.source.t0.b bVar2, boolean z11, int i11, int i12, androidx.media3.common.y0 y0Var, long j12, long j13, long j14, long j15, boolean z12) {
        this.f65817a = z3Var;
        this.f65818b = bVar;
        this.f65819c = j10;
        this.f65820d = j11;
        this.f65821e = i10;
        this.f65822f = s0Var;
        this.f65823g = z10;
        this.f65824h = h2Var;
        this.f65825i = l0Var;
        this.f65826j = list;
        this.f65827k = bVar2;
        this.f65828l = z11;
        this.f65829m = i11;
        this.f65830n = i12;
        this.f65831o = y0Var;
        this.f65833q = j12;
        this.f65834r = j13;
        this.f65835s = j14;
        this.f65836t = j15;
        this.f65832p = z12;
    }

    public static u4 k(androidx.media3.exoplayer.trackselection.l0 l0Var) {
        androidx.media3.common.z3 z3Var = androidx.media3.common.z3.f61958a;
        androidx.media3.exoplayer.source.t0.b bVar = f65816u;
        return new u4(z3Var, bVar, -9223372036854775807L, 0L, 1, null, false, androidx.media3.exoplayer.source.h2.f65074e, l0Var, l6.F(), bVar, false, 1, 0, androidx.media3.common.y0.f61871d, 0L, 0L, 0L, 0L, false);
    }

    public static androidx.media3.exoplayer.source.t0.b l() {
        return f65816u;
    }

    @androidx.annotation.j
    public u4 a() {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, m(), SystemClock.elapsedRealtime(), this.f65832p);
    }

    @androidx.annotation.j
    public u4 b(boolean z10) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, z10, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    @androidx.annotation.j
    public u4 c(androidx.media3.exoplayer.source.t0.b bVar) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, bVar, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    @androidx.annotation.j
    public u4 d(androidx.media3.exoplayer.source.t0.b bVar, long j10, long j11, long j12, long j13, androidx.media3.exoplayer.source.h2 h2Var, androidx.media3.exoplayer.trackselection.l0 l0Var, List<androidx.media3.common.r0> list) {
        return new u4(this.f65817a, bVar, j11, j12, this.f65821e, this.f65822f, this.f65823g, h2Var, l0Var, list, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, j13, j10, SystemClock.elapsedRealtime(), this.f65832p);
    }

    @androidx.annotation.j
    public u4 e(boolean z10, int i10, int i11) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, z10, i10, i11, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    @androidx.annotation.j
    public u4 f(@androidx.annotation.p0 s0 s0Var) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, s0Var, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    @androidx.annotation.j
    public u4 g(androidx.media3.common.y0 y0Var) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, y0Var, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    @androidx.annotation.j
    public u4 h(int i10) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, i10, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    @androidx.annotation.j
    public u4 i(boolean z10) {
        return new u4(this.f65817a, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, z10);
    }

    @androidx.annotation.j
    public u4 j(androidx.media3.common.z3 z3Var) {
        return new u4(z3Var, this.f65818b, this.f65819c, this.f65820d, this.f65821e, this.f65822f, this.f65823g, this.f65824h, this.f65825i, this.f65826j, this.f65827k, this.f65828l, this.f65829m, this.f65830n, this.f65831o, this.f65833q, this.f65834r, this.f65835s, this.f65836t, this.f65832p);
    }

    public long m() {
        long j10;
        long j11;
        if (!n()) {
            return this.f65835s;
        }
        do {
            j10 = this.f65836t;
            j11 = this.f65835s;
        } while (j10 != this.f65836t);
        return androidx.media3.common.util.k1.D1(androidx.media3.common.util.k1.A2(j11) + ((long) ((SystemClock.elapsedRealtime() - j10) * this.f65831o.f61874a)));
    }

    public boolean n() {
        return this.f65821e == 3 && this.f65828l && this.f65830n == 0;
    }

    public void o(long j10) {
        this.f65835s = j10;
        this.f65836t = SystemClock.elapsedRealtime();
    }
}
