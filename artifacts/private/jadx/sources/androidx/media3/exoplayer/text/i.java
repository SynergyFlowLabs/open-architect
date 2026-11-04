package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.p0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import androidx.media3.common.w;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.extractor.text.k;
import androidx.media3.extractor.text.l;
import androidx.media3.extractor.text.o;
import androidx.media3.extractor.text.p;
import com.google.common.collect.l6;
import il.m;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i extends androidx.media3.exoplayer.i implements Handler.Callback {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final String f65619s3 = "TextRenderer";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f65620t3 = 0;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f65621u3 = 1;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int f65622v3 = 2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int f65623w3 = 1;

    @p0
    private o H1;
    private a X;
    private final g Y;
    private boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @p0
    private p f65624g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f65625h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private final Handler f65626i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private final h f65627j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private final p3 f65628k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f65629l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f65630m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @p0
    private w f65631n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private long f65632o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f65633p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private k f65634p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @p0
    private p f65635p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private long f65636p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f65637q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @p0
    private IOException f65638r3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final androidx.media3.extractor.text.a f65639v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.media3.decoder.g f65640w;

    public i(h hVar, @p0 Looper looper) {
        this(hVar, looper, g.f65617a);
    }

    private void A0() {
        this.Z = true;
        k kVarA = this.Y.a((w) androidx.media3.common.util.a.g(this.f65631n3));
        this.f65634p1 = kVarA;
        kVarA.e(Y());
    }

    private void B0(androidx.media3.common.text.d dVar) {
        this.f65627j3.i(dVar.f61412a);
        this.f65627j3.E(dVar);
    }

    @xl.e
    private static boolean C0(w wVar) {
        return Objects.equals(wVar.f61761o, s0.T0);
    }

    @m({"this.cuesResolver"})
    private boolean D0(long j10) {
        if (this.f65629l3 || p0(this.f65628k3, this.f65640w, 0) != -4) {
            return false;
        }
        if (this.f65640w.s()) {
            this.f65629l3 = true;
            return false;
        }
        this.f65640w.H();
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(this.f65640w.f62700d);
        androidx.media3.extractor.text.d dVarA = this.f65639v.a(this.f65640w.f62702f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f65640w.o();
        return this.X.d(dVarA, j10);
    }

    private void E0() {
        this.H1 = null;
        this.f65625h3 = -1;
        p pVar = this.f65635p2;
        if (pVar != null) {
            pVar.D();
            this.f65635p2 = null;
        }
        p pVar2 = this.f65624g3;
        if (pVar2 != null) {
            pVar2.D();
            this.f65624g3 = null;
        }
    }

    private void F0() {
        E0();
        ((k) androidx.media3.common.util.a.g(this.f65634p1)).release();
        this.f65634p1 = null;
        this.f65633p0 = 0;
    }

    @m({"this.cuesResolver"})
    private void G0(long j10) {
        boolean zD0 = D0(j10);
        long jB = this.X.b(this.f65632o3);
        if (jB == Long.MIN_VALUE && this.f65629l3 && !zD0) {
            this.f65630m3 = true;
        }
        if (jB != Long.MIN_VALUE && jB <= j10) {
            zD0 = true;
        }
        if (zD0) {
            l6<androidx.media3.common.text.a> l6VarA = this.X.a(j10);
            long jE = this.X.e(j10);
            K0(new androidx.media3.common.text.d(l6VarA, x0(jE)));
            this.X.c(jE);
        }
        this.f65632o3 = j10;
    }

    private void H0(long j10) throws androidx.media3.decoder.f {
        boolean z10;
        this.f65632o3 = j10;
        if (this.f65624g3 == null) {
            ((k) androidx.media3.common.util.a.g(this.f65634p1)).d(j10);
            try {
                this.f65624g3 = ((k) androidx.media3.common.util.a.g(this.f65634p1)).a();
            } catch (l e10) {
                y0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f65635p2 != null) {
            long jW0 = w0();
            z10 = false;
            while (jW0 <= j10) {
                this.f65625h3++;
                jW0 = w0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        p pVar = this.f65624g3;
        if (pVar != null) {
            if (pVar.s()) {
                if (!z10 && w0() == Long.MAX_VALUE) {
                    if (this.f65633p0 == 2) {
                        I0();
                    } else {
                        E0();
                        this.f65630m3 = true;
                    }
                }
            } else if (pVar.f62708b <= j10) {
                p pVar2 = this.f65635p2;
                if (pVar2 != null) {
                    pVar2.D();
                }
                this.f65625h3 = pVar.l(j10);
                this.f65635p2 = pVar;
                this.f65624g3 = null;
                z10 = true;
            }
        }
        if (z10) {
            androidx.media3.common.util.a.g(this.f65635p2);
            K0(new androidx.media3.common.text.d(this.f65635p2.n(j10), x0(v0(j10))));
        }
        if (this.f65633p0 == 2) {
            return;
        }
        while (!this.f65629l3) {
            try {
                o oVarC = this.H1;
                if (oVarC == null) {
                    oVarC = ((k) androidx.media3.common.util.a.g(this.f65634p1)).c();
                    if (oVarC == null) {
                        return;
                    } else {
                        this.H1 = oVarC;
                    }
                }
                if (this.f65633p0 == 1) {
                    int i10 = 3 | 4;
                    oVarC.z(4);
                    ((k) androidx.media3.common.util.a.g(this.f65634p1)).b(oVarC);
                    this.H1 = null;
                    this.f65633p0 = 2;
                    return;
                }
                int iP0 = p0(this.f65628k3, oVarC, 0);
                if (iP0 == -4) {
                    if (oVarC.s()) {
                        this.f65629l3 = true;
                        this.Z = false;
                    } else {
                        w wVar = this.f65628k3.f64600b;
                        if (wVar == null) {
                            return;
                        }
                        oVarC.f68548m = wVar.f61766t;
                        oVarC.H();
                        this.Z &= !oVarC.v();
                    }
                    if (!this.Z) {
                        ((k) androidx.media3.common.util.a.g(this.f65634p1)).b(oVarC);
                        this.H1 = null;
                    }
                } else if (iP0 == -3) {
                    return;
                }
            } catch (l e11) {
                y0(e11);
                return;
            }
        }
    }

    private void I0() {
        F0();
        A0();
    }

    private void K0(androidx.media3.common.text.d dVar) {
        Handler handler = this.f65626i3;
        if (handler != null) {
            handler.obtainMessage(1, dVar).sendToTarget();
        } else {
            B0(dVar);
        }
    }

    @m({"streamFormat"})
    private void s0() {
        androidx.media3.common.util.a.j(this.f65637q3 || Objects.equals(this.f65631n3.f61761o, "application/cea-608") || Objects.equals(this.f65631n3.f61761o, "application/x-mp4-cea-608") || Objects.equals(this.f65631n3.f61761o, "application/cea-708"), "Legacy decoding is disabled, can't handle " + this.f65631n3.f61761o + " samples (expected " + s0.T0 + ").");
    }

    private void t0() {
        K0(new androidx.media3.common.text.d(l6.F(), x0(this.f65632o3)));
    }

    @xl.e
    @m({"subtitle"})
    private long v0(long j10) {
        int iL = this.f65635p2.l(j10);
        if (iL == 0 || this.f65635p2.k() == 0) {
            return this.f65635p2.f62708b;
        }
        if (iL != -1) {
            return this.f65635p2.b(iL - 1);
        }
        p pVar = this.f65635p2;
        return pVar.b(pVar.k() - 1);
    }

    private long w0() {
        if (this.f65625h3 == -1) {
            return Long.MAX_VALUE;
        }
        androidx.media3.common.util.a.g(this.f65635p2);
        if (this.f65625h3 >= this.f65635p2.k()) {
            return Long.MAX_VALUE;
        }
        return this.f65635p2.b(this.f65625h3);
    }

    @xl.e
    private long x0(long j10) {
        androidx.media3.common.util.a.i(j10 != -9223372036854775807L);
        return j10 - b0();
    }

    private void y0(l lVar) {
        z.e(f65619s3, "Subtitle decoding failed. streamFormat=" + this.f65631n3, lVar);
        t0();
        I0();
    }

    private static boolean z0(@p0 androidx.media3.extractor.text.j jVar, long j10) {
        return jVar == null || jVar.b(jVar.k() - 1) <= j10;
    }

    public void J0(long j10) {
        androidx.media3.common.util.a.i(r());
        this.f65636p3 = j10;
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return this.f65630m3;
    }

    @Override // androidx.media3.exoplayer.a5
    public int b(w wVar) {
        if (C0(wVar) || this.Y.b(wVar)) {
            return a5.M(wVar.N == 0 ? 4 : 2);
        }
        return s0.u(wVar.f61761o) ? a5.M(1) : a5.M(0);
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        this.f65631n3 = null;
        this.f65636p3 = -9223372036854775807L;
        t0();
        this.f65632o3 = -9223372036854775807L;
        if (this.f65634p1 != null) {
            F0();
        }
    }

    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) throws androidx.media3.decoder.f {
        if (r()) {
            long j12 = this.f65636p3;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                E0();
                this.f65630m3 = true;
            }
        }
        if (this.f65630m3) {
            return;
        }
        if (C0((w) androidx.media3.common.util.a.g(this.f65631n3))) {
            androidx.media3.common.util.a.g(this.X);
            G0(j10);
        } else {
            s0();
            H0(j10);
        }
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public String getName() {
        return f65619s3;
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) {
        this.f65632o3 = j10;
        a aVar = this.X;
        if (aVar != null) {
            aVar.clear();
        }
        t0();
        this.f65629l3 = false;
        this.f65630m3 = false;
        this.f65636p3 = -9223372036854775807L;
        w wVar = this.f65631n3;
        if (wVar == null || C0(wVar)) {
            return;
        }
        if (this.f65633p0 != 0) {
            I0();
            return;
        }
        E0();
        k kVar = (k) androidx.media3.common.util.a.g(this.f65634p1);
        kVar.flush();
        kVar.e(Y());
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        B0((androidx.media3.common.text.d) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        if (this.f65631n3 == null) {
            return true;
        }
        if (this.f65638r3 == null) {
            try {
                x();
            } catch (IOException e10) {
                this.f65638r3 = e10;
            }
        }
        if (this.f65638r3 != null) {
            if (C0((w) androidx.media3.common.util.a.g(this.f65631n3))) {
                return ((a) androidx.media3.common.util.a.g(this.X)).b(this.f65632o3) != Long.MIN_VALUE;
            }
            if (this.f65630m3 || (this.f65629l3 && z0(this.f65635p2, this.f65632o3) && z0(this.f65624g3, this.f65632o3) && this.H1 != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.i
    protected void n0(w[] wVarArr, long j10, long j11, t0.b bVar) {
        w wVar = wVarArr[0];
        this.f65631n3 = wVar;
        if (C0(wVar)) {
            this.X = this.f65631n3.K == 1 ? new e() : new f();
            return;
        }
        s0();
        if (this.f65634p1 != null) {
            this.f65633p0 = 1;
        } else {
            A0();
        }
    }

    @Deprecated
    public void u0(boolean z10) {
        this.f65637q3 = z10;
    }

    public i(h hVar, @p0 Looper looper, g gVar) {
        Handler handlerG;
        super(3);
        this.f65627j3 = (h) androidx.media3.common.util.a.g(hVar);
        if (looper == null) {
            handlerG = null;
            int i10 = 4 & 0;
        } else {
            handlerG = k1.G(looper, this);
        }
        this.f65626i3 = handlerG;
        this.Y = gVar;
        this.f65639v = new androidx.media3.extractor.text.a();
        this.f65640w = new androidx.media3.decoder.g(1);
        this.f65628k3 = new p3();
        this.f65636p3 = -9223372036854775807L;
        this.f65632o3 = -9223372036854775807L;
        this.f65637q3 = false;
    }
}
