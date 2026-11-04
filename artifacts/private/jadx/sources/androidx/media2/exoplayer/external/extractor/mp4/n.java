package androidx.media2.exoplayer.external.extractor.mp4;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f54531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f54532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f54534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f54537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f54538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f54539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f54540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f54541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean[] f54542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f54543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f54544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public m f54545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f54546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x f54547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f54548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f54549s;

    n() {
    }

    public void a(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        input.readFully(this.f54547q.f57720a, 0, this.f54546p);
        this.f54547q.Q(0);
        this.f54548r = false;
    }

    public void b(x source) {
        source.i(this.f54547q.f57720a, 0, this.f54546p);
        this.f54547q.Q(0);
        this.f54548r = false;
    }

    public long c(int index) {
        return this.f54541k[index] + ((long) this.f54540j[index]);
    }

    public void d(int length) {
        x xVar = this.f54547q;
        if (xVar == null || xVar.d() < length) {
            this.f54547q = new x(length);
        }
        this.f54546p = length;
        this.f54543m = true;
        this.f54548r = true;
    }

    public void e(int trunCount, int sampleCount) {
        this.f54535e = trunCount;
        this.f54536f = sampleCount;
        int[] iArr = this.f54538h;
        if (iArr == null || iArr.length < trunCount) {
            this.f54537g = new long[trunCount];
            this.f54538h = new int[trunCount];
        }
        int[] iArr2 = this.f54539i;
        if (iArr2 == null || iArr2.length < sampleCount) {
            int i10 = (sampleCount * 125) / 100;
            this.f54539i = new int[i10];
            this.f54540j = new int[i10];
            this.f54541k = new long[i10];
            this.f54542l = new boolean[i10];
            this.f54544n = new boolean[i10];
        }
    }

    public void f() {
        this.f54535e = 0;
        this.f54549s = 0L;
        this.f54543m = false;
        this.f54548r = false;
        this.f54545o = null;
    }

    public boolean g(int index) {
        return this.f54543m && this.f54544n[index];
    }
}
