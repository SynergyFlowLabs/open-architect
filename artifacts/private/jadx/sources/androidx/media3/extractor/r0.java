package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class r0 implements r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68294k = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68295l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f68296m = 1024;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68297n = 1024;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f68298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f68299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f68300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f68301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f68302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t f68303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private u0 f68304j;

    public r0(int i10, int i11, String str) {
        this.f68298d = i10;
        this.f68299e = i11;
        this.f68300f = str;
    }

    @il.m({"this.extractorOutput"})
    private void d(String str) {
        u0 u0VarA = this.f68303i.a(1024, 4);
        this.f68304j = u0VarA;
        u0VarA.e(new androidx.media3.common.w.b().U(str).u0(str).N());
        this.f68303i.l();
        this.f68303i.u(new s0(-9223372036854775807L));
        this.f68302h = 1;
    }

    private void e(s sVar) throws IOException {
        int iF = ((u0) androidx.media3.common.util.a.g(this.f68304j)).f(sVar, 1024, true);
        if (iF != -1) {
            this.f68301g += iF;
            return;
        }
        this.f68302h = 2;
        this.f68304j.g(0L, 1, this.f68301g, 0, null);
        this.f68301g = 0;
    }

    @Override // androidx.media3.extractor.r
    public void a(long j10, long j11) {
        if (j10 == 0 || this.f68302h == 1) {
            this.f68302h = 1;
            this.f68301g = 0;
        }
    }

    @Override // androidx.media3.extractor.r
    public int f(s sVar, n0 n0Var) throws IOException {
        int i10 = this.f68302h;
        if (i10 == 1) {
            e(sVar);
            return 0;
        }
        if (i10 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // androidx.media3.extractor.r
    public boolean g(s sVar) throws IOException {
        androidx.media3.common.util.a.i((this.f68298d == -1 || this.f68299e == -1) ? false : true);
        androidx.media3.common.util.o0 o0Var = new androidx.media3.common.util.o0(this.f68299e);
        sVar.i(o0Var.e(), 0, this.f68299e);
        return o0Var.T() == this.f68298d;
    }

    @Override // androidx.media3.extractor.r
    public void h(t tVar) {
        this.f68303i = tVar;
        d(this.f68300f);
    }

    @Override // androidx.media3.extractor.r
    public void release() {
    }
}
