package androidx.media3.extractor.mp4;

import androidx.annotation.p0;
import androidx.media3.common.util.o0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f68128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f68129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f68130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f68131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f68132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f68133f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f68139l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    public w f68141n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f68143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f68144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f68145r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f68134g = new long[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f68135h = new int[0];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f68136i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long[] f68137j = new long[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f68138k = new boolean[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean[] f68140m = new boolean[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f68142o = new o0();

    public void a(o0 o0Var) {
        o0Var.n(this.f68142o.e(), 0, this.f68142o.g());
        this.f68142o.a0(0);
        this.f68143p = false;
    }

    public void b(androidx.media3.extractor.s sVar) throws IOException {
        sVar.readFully(this.f68142o.e(), 0, this.f68142o.g());
        this.f68142o.a0(0);
        this.f68143p = false;
    }

    public long c(int i10) {
        return this.f68137j[i10];
    }

    public void d(int i10) {
        this.f68142o.W(i10);
        int i11 = 2 >> 1;
        this.f68139l = true;
        this.f68143p = true;
    }

    public void e(int i10, int i11) {
        this.f68132e = i10;
        this.f68133f = i11;
        if (this.f68135h.length < i10) {
            this.f68134g = new long[i10];
            this.f68135h = new int[i10];
        }
        if (this.f68136i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f68136i = new int[i12];
            this.f68137j = new long[i12];
            this.f68138k = new boolean[i12];
            this.f68140m = new boolean[i12];
        }
    }

    public void f() {
        this.f68132e = 0;
        this.f68144q = 0L;
        this.f68145r = false;
        this.f68139l = false;
        this.f68143p = false;
        this.f68141n = null;
    }

    public boolean g(int i10) {
        return this.f68139l && this.f68140m[i10];
    }
}
