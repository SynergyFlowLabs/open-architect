package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.y0;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.u3;
import androidx.media3.exoplayer.z4;
import com.google.common.collect.l6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class p0 extends androidx.media3.exoplayer.mediacodec.v implements u3 {
    private static final String S4 = "MediaCodecAudioRenderer";
    private static final String T4 = "v-bits-per-sample";
    private final Context C4;
    private final w.a D4;
    private final x E4;

    @androidx.annotation.p0
    private final androidx.media3.exoplayer.mediacodec.o F4;
    private int G4;
    private boolean H4;
    private boolean I4;

    @androidx.annotation.p0
    private androidx.media3.common.w J4;

    @androidx.annotation.p0
    private androidx.media3.common.w K4;
    private long L4;
    private boolean M4;
    private boolean N4;
    private boolean O4;
    private int P4;
    private boolean Q4;
    private long R4;

    @androidx.annotation.w0(23)
    private static final class b {
        private b() {
        }

        public static void a(x xVar, @androidx.annotation.p0 Object obj) {
            xVar.setPreferredDevice((AudioDeviceInfo) obj);
        }
    }

    private final class c implements x.d {
        private c() {
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void a(long j10) {
            p0.this.D4.v(j10);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void b(int i10, long j10, long j11) {
            p0.this.D4.x(i10, j10, j11);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void c() {
            p0.this.q2();
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void d() {
            p0.this.O4 = true;
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void e(x.a aVar) {
            p0.this.D4.o(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void f(x.a aVar) {
            p0.this.D4.p(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void g(boolean z10) {
            p0.this.D4.w(z10);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void h(Exception exc) {
            androidx.media3.common.util.z.e(p0.S4, "Audio sink error", exc);
            p0.this.D4.n(exc);
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void i() {
            p0.this.j0();
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void j() {
            z4.c cVarC1 = p0.this.c1();
            if (cVarC1 != null) {
                cVarC1.a();
            }
        }

        @Override // androidx.media3.exoplayer.audio.x.d
        public void k() {
            z4.c cVarC1 = p0.this.c1();
            if (cVarC1 != null) {
                cVarC1.b();
            }
        }
    }

    public p0(Context context, androidx.media3.exoplayer.mediacodec.z zVar) {
        this(context, zVar, null, null);
    }

    private static boolean i2(String str) {
        if (k1.f61540a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(Build.MANUFACTURER)) {
            String str2 = Build.DEVICE;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean j2(String str) {
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            return false;
        }
        return true;
    }

    private static boolean k2() {
        if (k1.f61540a == 23) {
            String str = Build.MODEL;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int l2(androidx.media3.common.w wVar) {
        j jVarV = this.E4.v(wVar);
        if (!jVarV.f63219a) {
            return 0;
        }
        int i10 = jVarV.f63220b ? 1536 : 512;
        return jVarV.f63221c ? i10 | 2048 : i10;
    }

    private int m2(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(tVar.f64139a) || (i10 = k1.f61540a) >= 24 || (i10 == 23 && k1.p1(this.C4))) {
            return wVar.f61762p;
        }
        return -1;
    }

    private static List<androidx.media3.exoplayer.mediacodec.t> o2(androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar, boolean z10, x xVar) throws androidx.media3.exoplayer.mediacodec.f0.c {
        androidx.media3.exoplayer.mediacodec.t tVarT;
        if (wVar.f61761o == null) {
            return l6.F();
        }
        return (!xVar.b(wVar) || (tVarT = androidx.media3.exoplayer.mediacodec.f0.t()) == null) ? androidx.media3.exoplayer.mediacodec.f0.p(zVar, wVar, z10, false) : l6.G(tVarT);
    }

    private void r2(int i10) {
        androidx.media3.exoplayer.mediacodec.o oVar;
        this.E4.g(i10);
        if (k1.f61540a >= 35 && (oVar = this.F4) != null) {
            oVar.e(i10);
        }
    }

    private void s2() {
        androidx.media3.exoplayer.mediacodec.q qVarO0 = O0();
        if (qVarO0 != null && k1.f61540a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.P4));
            qVarO0.a(bundle);
        }
    }

    private void t2() {
        long jL = this.E4.l(a());
        if (jL != Long.MIN_VALUE) {
            if (!this.M4) {
                jL = Math.max(this.L4, jL);
            }
            this.L4 = jL;
            this.M4 = false;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected boolean B1(long j10, long j11, @androidx.annotation.p0 androidx.media3.exoplayer.mediacodec.q qVar, @androidx.annotation.p0 ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, androidx.media3.common.w wVar) throws androidx.media3.exoplayer.s0 {
        androidx.media3.common.util.a.g(byteBuffer);
        this.R4 = -9223372036854775807L;
        if (this.K4 != null && (i11 & 2) != 0) {
            ((androidx.media3.exoplayer.mediacodec.q) androidx.media3.common.util.a.g(qVar)).h(i10, false);
            return true;
        }
        if (z10) {
            if (qVar != null) {
                qVar.h(i10, false);
            }
            this.f64176f4.f63913f += i12;
            this.E4.m();
            return true;
        }
        try {
            if (!this.E4.w(byteBuffer, j12, i12)) {
                this.R4 = j12;
                return false;
            }
            if (qVar != null) {
                qVar.h(i10, false);
            }
            this.f64176f4.f63912e += i12;
            return true;
        } catch (x.c e10) {
            throw T(e10, this.J4, e10.f63447b, (!j1() || V().f63543a == 0) ? androidx.media3.common.x0.f61845v3 : androidx.media3.common.x0.f61849y3);
        } catch (x.h e11) {
            throw T(e11, wVar, e11.f63452b, (!j1() || V().f63543a == 0) ? androidx.media3.common.x0.f61847w3 : androidx.media3.common.x0.f61848x3);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void G1() throws androidx.media3.exoplayer.s0 {
        try {
            this.E4.k();
            if (X0() != -9223372036854775807L) {
                this.R4 = X0();
            }
        } catch (x.h e10) {
            throw T(e10, e10.f63453c, e10.f63452b, j1() ? androidx.media3.common.x0.f61848x3 : androidx.media3.common.x0.f61847w3);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected float T0(float f10, androidx.media3.common.w wVar, androidx.media3.common.w[] wVarArr) {
        int iMax = -1;
        for (androidx.media3.common.w wVar2 : wVarArr) {
            int i10 = wVar2.F;
            if (i10 != -1) {
                iMax = Math.max(iMax, i10);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected List<androidx.media3.exoplayer.mediacodec.t> V0(androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar, boolean z10) throws androidx.media3.exoplayer.mediacodec.f0.c {
        return androidx.media3.exoplayer.mediacodec.f0.q(o2(zVar, wVar, z10, this.E4), wVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected long W0(long j10, long j11, boolean z10) {
        long j12 = this.R4;
        if (j12 == -9223372036854775807L) {
            return super.W0(j10, j11, z10);
        }
        long jD1 = (long) (((j12 - j10) / (c() != null ? c().f61874a : 1.0f)) / 2.0f);
        if (this.Q4) {
            jD1 -= k1.D1(U().b()) - j11;
        }
        return Math.max(10000L, jD1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected boolean W1(androidx.media3.common.w wVar) {
        if (V().f63543a != 0) {
            int iL2 = l2(wVar);
            if ((iL2 & 512) != 0 && (V().f63543a == 2 || (iL2 & 1024) != 0 || (wVar.H == 0 && wVar.I == 0))) {
                return true;
            }
        }
        return this.E4.b(wVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected int X1(androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar) throws androidx.media3.exoplayer.mediacodec.f0.c {
        int iL2;
        boolean z10;
        if (!androidx.media3.common.s0.q(wVar.f61761o)) {
            return a5.M(0);
        }
        boolean z11 = true;
        boolean z12 = wVar.N != 0;
        boolean zY1 = androidx.media3.exoplayer.mediacodec.v.Y1(wVar);
        int i10 = 8;
        if (!zY1 || (z12 && androidx.media3.exoplayer.mediacodec.f0.t() == null)) {
            iL2 = 0;
        } else {
            iL2 = l2(wVar);
            if (this.E4.b(wVar)) {
                return a5.n(4, 8, 32, iL2);
            }
        }
        if ((!"audio/raw".equals(wVar.f61761o) || this.E4.b(wVar)) && this.E4.b(k1.C0(2, wVar.E, wVar.F))) {
            List<androidx.media3.exoplayer.mediacodec.t> listO2 = o2(zVar, wVar, false, this.E4);
            if (listO2.isEmpty()) {
                return a5.M(1);
            }
            if (!zY1) {
                return a5.M(2);
            }
            androidx.media3.exoplayer.mediacodec.t tVar = listO2.get(0);
            boolean zQ = tVar.q(wVar);
            if (!zQ) {
                int i11 = 1;
                while (true) {
                    if (i11 >= listO2.size()) {
                        z10 = true;
                        z11 = zQ;
                        break;
                    }
                    androidx.media3.exoplayer.mediacodec.t tVar2 = listO2.get(i11);
                    if (tVar2.q(wVar)) {
                        z10 = false;
                        tVar = tVar2;
                        break;
                    }
                    i11++;
                }
            } else {
                z10 = true;
                z11 = zQ;
                break;
            }
            int i12 = z11 ? 4 : 3;
            if (z11 && tVar.t(wVar)) {
                i10 = 16;
            }
            return a5.B(i12, i10, 32, tVar.f64146h ? 64 : 0, z10 ? 128 : 0, iL2);
        }
        return a5.M(1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected androidx.media3.exoplayer.mediacodec.q.a Y0(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar, @androidx.annotation.p0 MediaCrypto mediaCrypto, float f10) {
        this.G4 = n2(tVar, wVar, a0());
        this.H4 = i2(tVar.f64139a);
        this.I4 = j2(tVar.f64139a);
        MediaFormat mediaFormatP2 = p2(wVar, tVar.f64141c, this.G4, f10);
        this.K4 = (!"audio/raw".equals(tVar.f64140b) || "audio/raw".equals(wVar.f61761o)) ? null : wVar;
        return androidx.media3.exoplayer.mediacodec.q.a.a(tVar, mediaFormatP2, wVar, mediaCrypto, this.F4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.z4
    public boolean a() {
        return super.a() && this.E4.a();
    }

    @Override // androidx.media3.exoplayer.u3
    public y0 c() {
        return this.E4.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void d1(androidx.media3.decoder.g gVar) {
        androidx.media3.common.w wVar;
        if (k1.f61540a < 29 || (wVar = gVar.f62698b) == null || !Objects.equals(wVar.f61761o, "audio/opus") || !j1()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(gVar.f62703g);
        int i10 = ((androidx.media3.common.w) androidx.media3.common.util.a.g(gVar.f62698b)).H;
        if (byteBuffer.remaining() == 8) {
            this.E4.x(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void e0() {
        this.N4 = true;
        this.J4 = null;
        this.R4 = -9223372036854775807L;
        try {
            this.E4.flush();
            try {
                super.e0();
                this.D4.s(this.f64176f4);
            } catch (Throwable th2) {
                this.D4.s(this.f64176f4);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                super.e0();
                this.D4.s(this.f64176f4);
                throw th3;
            } catch (Throwable th4) {
                this.D4.s(this.f64176f4);
                throw th4;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void f0(boolean z10, boolean z11) throws androidx.media3.exoplayer.s0 {
        super.f0(z10, z11);
        this.D4.t(this.f64176f4);
        if (V().f63544b) {
            this.E4.r();
        } else {
            this.E4.i();
        }
        this.E4.y(Z());
        this.E4.u(U());
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public String getName() {
        return S4;
    }

    @Override // androidx.media3.exoplayer.u3
    public void h(y0 y0Var) {
        this.E4.h(y0Var);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) throws androidx.media3.exoplayer.s0 {
        super.h0(j10, z10);
        this.E4.flush();
        this.L4 = j10;
        this.R4 = -9223372036854775807L;
        this.O4 = false;
        this.M4 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @androidx.annotation.p0 Object obj) throws androidx.media3.exoplayer.s0 {
        if (i10 == 2) {
            this.E4.f(((Float) androidx.media3.common.util.a.g(obj)).floatValue());
            return;
        }
        if (i10 == 3) {
            this.E4.d((androidx.media3.common.d) androidx.media3.common.util.a.g((androidx.media3.common.d) obj));
            return;
        }
        if (i10 == 6) {
            this.E4.t((androidx.media3.common.f) androidx.media3.common.util.a.g((androidx.media3.common.f) obj));
            return;
        }
        if (i10 == 12) {
            if (k1.f61540a >= 23) {
                b.a(this.E4, obj);
            }
        } else if (i10 == 16) {
            this.P4 = ((Integer) androidx.media3.common.util.a.g(obj)).intValue();
            s2();
        } else if (i10 == 9) {
            this.E4.t0(((Boolean) androidx.media3.common.util.a.g(obj)).booleanValue());
        } else if (i10 != 10) {
            super.i(i10, obj);
        } else {
            r2(((Integer) androidx.media3.common.util.a.g(obj)).intValue());
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void i0() {
        androidx.media3.exoplayer.mediacodec.o oVar;
        this.E4.release();
        if (k1.f61540a < 35 || (oVar = this.F4) == null) {
            return;
        }
        oVar.c();
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.z4
    public boolean isReady() {
        return this.E4.j() || super.isReady();
    }

    @Override // androidx.media3.exoplayer.u3
    public long k() {
        if (getState() == 2) {
            t2();
        }
        return this.L4;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void k0() {
        this.O4 = false;
        this.R4 = -9223372036854775807L;
        try {
            super.k0();
        } finally {
            if (this.N4) {
                this.N4 = false;
                this.E4.reset();
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void l0() {
        super.l0();
        this.E4.B();
        this.Q4 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void m0() {
        t2();
        this.Q4 = false;
        this.E4.pause();
        super.m0();
    }

    protected int n2(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar, androidx.media3.common.w[] wVarArr) {
        int iM2 = m2(tVar, wVar);
        if (wVarArr.length == 1) {
            return iM2;
        }
        for (androidx.media3.common.w wVar2 : wVarArr) {
            if (tVar.e(wVar, wVar2).f63950d != 0) {
                iM2 = Math.max(iM2, m2(tVar, wVar2));
            }
        }
        return iM2;
    }

    @e.a({"InlinedApi"})
    protected MediaFormat p2(androidx.media3.common.w wVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", wVar.E);
        mediaFormat.setInteger("sample-rate", wVar.F);
        androidx.media3.common.util.c0.y(mediaFormat, wVar.f61764r);
        androidx.media3.common.util.c0.t(mediaFormat, "max-input-size", i10);
        int i11 = k1.f61540a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !k2()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(wVar.f61761o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.E4.s(k1.C0(4, wVar.E, wVar.F)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.P4));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void q1(Exception exc) {
        androidx.media3.common.util.z.e(S4, "Audio codec error", exc);
        this.D4.m(exc);
    }

    @androidx.annotation.i
    protected void q2() {
        this.M4 = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void r1(String str, androidx.media3.exoplayer.mediacodec.q.a aVar, long j10, long j11) {
        this.D4.q(str, j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void s1(String str) {
        this.D4.r(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @androidx.annotation.p0
    protected androidx.media3.exoplayer.k t1(p3 p3Var) throws androidx.media3.exoplayer.s0 {
        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
        this.J4 = wVar;
        androidx.media3.exoplayer.k kVarT1 = super.t1(p3Var);
        this.D4.u(wVar, kVarT1);
        return kVarT1;
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.z4
    @androidx.annotation.p0
    public u3 u() {
        return this;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void u1(androidx.media3.common.w wVar, @androidx.annotation.p0 MediaFormat mediaFormat) throws androidx.media3.exoplayer.s0 {
        int iB0;
        int i10;
        androidx.media3.common.w wVar2 = this.K4;
        int[] iArrA = null;
        if (wVar2 != null) {
            wVar = wVar2;
        } else if (O0() != null) {
            androidx.media3.common.util.a.g(mediaFormat);
            if ("audio/raw".equals(wVar.f61761o)) {
                iB0 = wVar.G;
            } else if (k1.f61540a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iB0 = mediaFormat.containsKey(T4) ? k1.B0(mediaFormat.getInteger(T4)) : 2;
            } else {
                iB0 = mediaFormat.getInteger("pcm-encoding");
            }
            androidx.media3.common.w wVarN = new androidx.media3.common.w.b().u0("audio/raw").o0(iB0).Z(wVar.H).a0(wVar.I).n0(wVar.f61758l).X(wVar.f61759m).f0(wVar.f61747a).h0(wVar.f61748b).i0(wVar.f61749c).j0(wVar.f61750d).w0(wVar.f61751e).s0(wVar.f61752f).R(mediaFormat.getInteger("channel-count")).v0(mediaFormat.getInteger("sample-rate")).N();
            if (this.H4 && wVarN.E == 6 && (i10 = wVar.E) < 6) {
                iArrA = new int[i10];
                for (int i11 = 0; i11 < wVar.E; i11++) {
                    iArrA[i11] = i11;
                }
            } else if (this.I4) {
                iArrA = androidx.media3.extractor.x0.a(wVarN.E);
            }
            wVar = wVarN;
        }
        try {
            if (k1.f61540a >= 29) {
                if (!j1() || V().f63543a == 0) {
                    this.E4.o(0);
                } else {
                    this.E4.o(V().f63543a);
                }
            }
            this.E4.p(wVar, 0, iArrA);
        } catch (x.b e10) {
            throw S(e10, e10.f63445a, androidx.media3.common.x0.f61845v3);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected androidx.media3.exoplayer.k v0(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        androidx.media3.exoplayer.k kVarE = tVar.e(wVar, wVar2);
        int i10 = kVarE.f63951e;
        if (k1(wVar2)) {
            i10 |= 32768;
        }
        if (m2(tVar, wVar2) > this.G4) {
            i10 |= 64;
        }
        int i11 = i10;
        return new androidx.media3.exoplayer.k(tVar.f64139a, wVar, wVar2, i11 != 0 ? 0 : kVarE.f63950d, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void v1(long j10) {
        this.E4.z(j10);
    }

    @Override // androidx.media3.exoplayer.u3
    public boolean w() {
        boolean z10 = this.O4;
        this.O4 = false;
        return z10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void x1() {
        super.x1();
        this.E4.m();
    }

    public p0(Context context, androidx.media3.exoplayer.mediacodec.z zVar, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar) {
        this(context, zVar, handler, wVar, new j0.h(context).j());
    }

    @Deprecated
    public p0(Context context, androidx.media3.exoplayer.mediacodec.z zVar, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, e eVar, androidx.media3.common.audio.g... gVarArr) {
        this(context, zVar, handler, wVar, new j0.h().k((e) com.google.common.base.b0.a(eVar, e.f63183e)).n(gVarArr).j());
    }

    public p0(Context context, androidx.media3.exoplayer.mediacodec.z zVar, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, x xVar) {
        this(context, androidx.media3.exoplayer.mediacodec.q.b.b(context), zVar, false, handler, wVar, xVar);
    }

    public p0(Context context, androidx.media3.exoplayer.mediacodec.z zVar, boolean z10, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, x xVar) {
        this(context, androidx.media3.exoplayer.mediacodec.q.b.b(context), zVar, z10, handler, wVar, xVar);
    }

    public p0(Context context, androidx.media3.exoplayer.mediacodec.q.b bVar, androidx.media3.exoplayer.mediacodec.z zVar, boolean z10, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, x xVar) {
        this(context, bVar, zVar, z10, handler, wVar, xVar, k1.f61540a >= 35 ? new androidx.media3.exoplayer.mediacodec.o() : null);
    }

    public p0(Context context, androidx.media3.exoplayer.mediacodec.q.b bVar, androidx.media3.exoplayer.mediacodec.z zVar, boolean z10, @androidx.annotation.p0 Handler handler, @androidx.annotation.p0 w wVar, x xVar, @androidx.annotation.p0 androidx.media3.exoplayer.mediacodec.o oVar) {
        super(1, bVar, zVar, z10, 44100.0f);
        this.C4 = context.getApplicationContext();
        this.E4 = xVar;
        this.F4 = oVar;
        this.P4 = -1000;
        this.D4 = new w.a(handler, wVar);
        this.R4 = -9223372036854775807L;
        xVar.n(new c());
    }
}
