package androidx.media3.exoplayer.metadata;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.w;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.source.t0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import xl.e;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class c extends i implements Handler.Callback {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final String f64223i3 = "MetadataRenderer";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f64224j3 = 1;
    private boolean H1;

    @p0
    private final Handler X;
    private final androidx.media3.extractor.metadata.b Y;
    private final boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @p0
    private r0 f64225g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private long f64226h3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @p0
    private androidx.media3.extractor.metadata.a f64227p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f64228p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private long f64229p2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final a f64230v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final b f64231w;

    public c(b bVar, @p0 Looper looper) {
        this(bVar, looper, a.f64222a);
    }

    private void s0(r0 r0Var, List<r0.a> list) {
        for (int i10 = 0; i10 < r0Var.e(); i10++) {
            w wVarO0 = r0Var.d(i10).O0();
            if (wVarO0 == null || !this.f64230v.b(wVarO0)) {
                list.add(r0Var.d(i10));
            } else {
                androidx.media3.extractor.metadata.a aVarA = this.f64230v.a(wVarO0);
                byte[] bArr = (byte[]) androidx.media3.common.util.a.g(r0Var.d(i10).Y());
                this.Y.o();
                this.Y.E(bArr.length);
                ((ByteBuffer) k1.o(this.Y.f62700d)).put(bArr);
                this.Y.H();
                r0 r0VarA = aVarA.a(this.Y);
                if (r0VarA != null) {
                    s0(r0VarA, list);
                }
            }
        }
    }

    @e
    private long t0(long j10) {
        int i10 = 5 & 1;
        androidx.media3.common.util.a.i(j10 != -9223372036854775807L);
        androidx.media3.common.util.a.i(this.f64226h3 != -9223372036854775807L);
        return j10 - this.f64226h3;
    }

    private void u0(r0 r0Var) {
        Handler handler = this.X;
        if (handler != null) {
            handler.obtainMessage(1, r0Var).sendToTarget();
        } else {
            v0(r0Var);
        }
    }

    private void v0(r0 r0Var) {
        this.f64231w.F(r0Var);
    }

    private boolean w0(long j10) {
        boolean z10;
        r0 r0Var = this.f64225g3;
        if (r0Var == null || (!this.Z && r0Var.f61177b > t0(j10))) {
            z10 = false;
        } else {
            u0(this.f64225g3);
            this.f64225g3 = null;
            z10 = true;
        }
        if (this.f64228p1 && this.f64225g3 == null) {
            this.H1 = true;
        }
        return z10;
    }

    private void x0() {
        if (!this.f64228p1 && this.f64225g3 == null) {
            this.Y.o();
            p3 p3VarW = W();
            int iP0 = p0(p3VarW, this.Y, 0);
            if (iP0 == -4) {
                if (this.Y.s()) {
                    this.f64228p1 = true;
                    return;
                }
                if (this.Y.f62702f >= Y()) {
                    androidx.media3.extractor.metadata.b bVar = this.Y;
                    bVar.f67471m = this.f64229p2;
                    bVar.H();
                    r0 r0VarA = ((androidx.media3.extractor.metadata.a) k1.o(this.f64227p0)).a(this.Y);
                    if (r0VarA != null) {
                        ArrayList arrayList = new ArrayList(r0VarA.e());
                        s0(r0VarA, arrayList);
                        if (!arrayList.isEmpty()) {
                            this.f64225g3 = new r0(t0(this.Y.f62702f), arrayList);
                        }
                    }
                }
            } else if (iP0 == -5) {
                this.f64229p2 = ((w) androidx.media3.common.util.a.g(p3VarW.f64600b)).f61766t;
            }
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return this.H1;
    }

    @Override // androidx.media3.exoplayer.a5
    public int b(w wVar) {
        if (this.f64230v.b(wVar)) {
            return a5.M(wVar.N == 0 ? 4 : 2);
        }
        return a5.M(0);
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        this.f64225g3 = null;
        this.f64227p0 = null;
        this.f64226h3 = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) {
        boolean zW0 = true;
        while (zW0) {
            x0();
            zW0 = w0(j10);
        }
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public String getName() {
        return f64223i3;
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) {
        this.f64225g3 = null;
        this.f64228p1 = false;
        this.H1 = false;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        v0((r0) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.i
    protected void n0(w[] wVarArr, long j10, long j11, t0.b bVar) {
        this.f64227p0 = this.f64230v.a(wVarArr[0]);
        r0 r0Var = this.f64225g3;
        if (r0Var != null) {
            this.f64225g3 = r0Var.c((r0Var.f61177b + this.f64226h3) - j11);
        }
        this.f64226h3 = j11;
    }

    public c(b bVar, @p0 Looper looper, a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, @p0 Looper looper, a aVar, boolean z10) {
        super(5);
        this.f64231w = (b) androidx.media3.common.util.a.g(bVar);
        this.X = looper == null ? null : k1.G(looper, this);
        this.f64230v = (a) androidx.media3.common.util.a.g(aVar);
        this.Z = z10;
        this.Y = new androidx.media3.extractor.metadata.b();
        this.f64226h3 = -9223372036854775807L;
    }
}
