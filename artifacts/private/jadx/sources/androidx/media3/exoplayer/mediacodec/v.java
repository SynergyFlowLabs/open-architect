package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.v0;
import androidx.media3.common.util.z0;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.analytics.j4;
import androidx.media3.exoplayer.audio.q0;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.z4;
import androidx.media3.extractor.m0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
@b1
public abstract class v extends androidx.media3.exoplayer.i {
    private static final byte[] A4 = {0, 0, 1, 103, 66, org.msgpack.core.h.a.f339269e, 11, org.msgpack.core.h.a.E, 37, org.msgpack.core.h.a.f339267c, 0, 0, 1, 104, org.msgpack.core.h.a.f339283s, com.google.common.base.c.f116464q, 19, 32, 0, 0, 1, 101, -120, -124, com.google.common.base.c.f116462o, org.msgpack.core.h.a.f339283s, 113, com.google.common.base.c.B, org.msgpack.core.h.a.f339268d, 0, 47, com.fasterxml.jackson.core.json.a.f102489k, com.google.common.base.c.F, 49, org.msgpack.core.h.a.f339272h, 39, 93, 120};
    private static final int B4 = 32;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    protected static final float f64155k4 = -1.0f;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final String f64156l4 = "MediaCodecRenderer";

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final long f64157m4 = 1000;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final int f64158n4 = 0;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final int f64159o4 = 1;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final int f64160p4 = 2;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private static final int f64161q4 = 0;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private static final int f64162r4 = 1;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private static final int f64163s4 = 2;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private static final int f64164t4 = 0;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final int f64165u4 = 1;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final int f64166v4 = 2;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final int f64167w4 = 3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private static final int f64168x4 = 0;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private static final int f64169y4 = 1;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private static final int f64170z4 = 2;
    private boolean A3;
    private boolean B3;
    private boolean C3;
    private boolean D3;
    private boolean E3;
    private boolean F3;
    private long G3;
    private final i H1;
    private boolean H3;
    private long I3;
    private int J3;
    private int K3;

    @p0
    private ByteBuffer L3;
    private boolean M3;
    private boolean N3;
    private boolean O3;
    private boolean P3;
    private boolean Q3;
    private boolean R3;
    private int S3;
    private int T3;
    private int U3;
    private boolean V3;
    private boolean W3;
    private final boolean X;
    private boolean X3;
    private final float Y;
    private long Y3;
    private final androidx.media3.decoder.g Z;
    private long Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private boolean f64171a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private boolean f64172b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private boolean f64173c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private boolean f64174d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    @p0
    private s0 f64175e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    protected androidx.media3.exoplayer.j f64176f4;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final ArrayDeque<e> f64177g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private e f64178g4;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final q0 f64179h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private long f64180h4;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private androidx.media3.common.w f64181i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private boolean f64182i4;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private androidx.media3.common.w f64183j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private boolean f64184j4;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @p0
    private androidx.media3.exoplayer.drm.m f64185k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private androidx.media3.exoplayer.drm.m f64186l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private z4.c f64187m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @p0
    private MediaCrypto f64188n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private long f64189o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final androidx.media3.decoder.g f64190p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final androidx.media3.decoder.g f64191p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final MediaCodec.BufferInfo f64192p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private float f64193p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private float f64194q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    @p0
    private q f64195r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @p0
    private androidx.media3.common.w f64196s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @p0
    private MediaFormat f64197t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private boolean f64198u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final q.b f64199v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private float f64200v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final z f64201w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    @p0
    private ArrayDeque<t> f64202w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    @p0
    private c f64203x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    @p0
    private t f64204y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f64205z3;

    @w0(31)
    private static final class b {
        private b() {
        }

        public static void a(q.a aVar, j4 j4Var) {
            LogSessionId logSessionIdA = j4Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f64128b.setString("log-session-id", logSessionIdA.getStringId());
        }
    }

    private final class d implements q.c {
        private d() {
        }

        @Override // androidx.media3.exoplayer.mediacodec.q.c
        public void a() {
            if (v.this.f64187m3 != null) {
                v.this.f64187m3.b();
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.q.c
        public void b() {
            if (v.this.f64187m3 != null) {
                v.this.f64187m3.b();
            }
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final e f64215e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64218c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final v0<androidx.media3.common.w> f64219d = new v0<>();

        public e(long j10, long j11, long j12) {
            this.f64216a = j10;
            this.f64217b = j11;
            this.f64218c = j12;
        }
    }

    public v(int i10, q.b bVar, z zVar, boolean z10, float f10) {
        super(i10);
        this.f64199v = bVar;
        this.f64201w = (z) androidx.media3.common.util.a.g(zVar);
        this.X = z10;
        this.Y = f10;
        this.Z = androidx.media3.decoder.g.L();
        this.f64190p0 = new androidx.media3.decoder.g(0);
        this.f64191p1 = new androidx.media3.decoder.g(2);
        i iVar = new i();
        this.H1 = iVar;
        this.f64192p2 = new MediaCodec.BufferInfo();
        this.f64193p3 = 1.0f;
        this.f64194q3 = 1.0f;
        this.f64189o3 = -9223372036854775807L;
        this.f64177g3 = new ArrayDeque<>();
        this.f64178g4 = e.f64215e;
        iVar.E(0);
        iVar.f62700d.order(ByteOrder.nativeOrder());
        this.f64179h3 = new q0();
        this.f64200v3 = -1.0f;
        this.f64205z3 = 0;
        this.S3 = 0;
        this.J3 = -1;
        this.K3 = -1;
        this.I3 = -9223372036854775807L;
        this.Y3 = -9223372036854775807L;
        this.Z3 = -9223372036854775807L;
        this.f64180h4 = -9223372036854775807L;
        this.G3 = -9223372036854775807L;
        this.T3 = 0;
        this.U3 = 0;
        this.f64176f4 = new androidx.media3.exoplayer.j();
    }

    private static boolean A0(String str) {
        if (k1.f61540a != 29 || !"c2.android.aac.decoder".equals(str)) {
            return false;
        }
        int i10 = 3 ^ 1;
        return true;
    }

    @e.b(23)
    private void A1() throws s0 {
        int i10 = this.U3;
        if (i10 == 1) {
            K0();
            return;
        }
        if (i10 == 2) {
            K0();
            b2();
        } else if (i10 == 3) {
            E1();
        } else {
            this.f64172b4 = true;
            G1();
        }
    }

    private void C0() {
        this.Q3 = false;
        this.H1.o();
        this.f64191p1.o();
        this.P3 = false;
        this.O3 = false;
        this.f64179h3.d();
    }

    private void C1() {
        this.X3 = true;
        MediaFormat mediaFormatK = ((q) androidx.media3.common.util.a.g(this.f64195r3)).k();
        if (this.f64205z3 != 0 && mediaFormatK.getInteger("width") == 32 && mediaFormatK.getInteger("height") == 32) {
            this.E3 = true;
        } else {
            this.f64197t3 = mediaFormatK;
            this.f64198u3 = true;
        }
    }

    private boolean D0() {
        if (this.V3) {
            this.T3 = 1;
            if (this.B3) {
                this.U3 = 3;
                return false;
            }
            this.U3 = 1;
        }
        return true;
    }

    private boolean D1(int i10) throws s0 {
        p3 p3VarW = W();
        this.Z.o();
        int iP0 = p0(p3VarW, this.Z, i10 | 4);
        int i11 = 4 << 1;
        if (iP0 == -5) {
            t1(p3VarW);
            return true;
        }
        if (iP0 == -4 && this.Z.s()) {
            this.f64171a4 = true;
            A1();
        }
        return false;
    }

    private void E0() throws s0 {
        if (!this.V3) {
            E1();
        } else {
            this.T3 = 1;
            this.U3 = 3;
        }
    }

    private void E1() throws s0 {
        F1();
        n1();
    }

    @e.b(23)
    private boolean F0() throws s0 {
        if (this.V3) {
            this.T3 = 1;
            if (this.B3) {
                this.U3 = 3;
                return false;
            }
            this.U3 = 2;
        } else {
            b2();
        }
        return true;
    }

    private boolean G0(long j10, long j11) throws s0 {
        boolean z10;
        boolean zB1;
        int iG;
        q qVar = (q) androidx.media3.common.util.a.g(this.f64195r3);
        if (!e1()) {
            if (this.C3 && this.W3) {
                try {
                    iG = qVar.g(this.f64192p2);
                } catch (IllegalStateException unused) {
                    A1();
                    if (this.f64172b4) {
                        F1();
                    }
                    return false;
                }
            } else {
                iG = qVar.g(this.f64192p2);
            }
            if (iG < 0) {
                if (iG == -2) {
                    C1();
                    return true;
                }
                if (this.F3 && (this.f64171a4 || this.T3 == 2)) {
                    A1();
                }
                long j12 = this.G3;
                if (j12 != -9223372036854775807L && j12 + 100 < U().currentTimeMillis()) {
                    A1();
                }
                return false;
            }
            if (this.E3) {
                this.E3 = false;
                qVar.h(iG, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f64192p2;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                A1();
                return false;
            }
            this.K3 = iG;
            ByteBuffer byteBufferP = qVar.p(iG);
            this.L3 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(this.f64192p2.offset);
                ByteBuffer byteBuffer = this.L3;
                MediaCodec.BufferInfo bufferInfo2 = this.f64192p2;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            this.M3 = this.f64192p2.presentationTimeUs < Y();
            long j13 = this.Z3;
            this.N3 = j13 != -9223372036854775807L && j13 <= this.f64192p2.presentationTimeUs;
            c2(this.f64192p2.presentationTimeUs);
        }
        if (this.C3 && this.W3) {
            try {
                ByteBuffer byteBuffer2 = this.L3;
                int i10 = this.K3;
                MediaCodec.BufferInfo bufferInfo3 = this.f64192p2;
                z10 = false;
                try {
                    zB1 = B1(j10, j11, qVar, byteBuffer2, i10, bufferInfo3.flags, 1, bufferInfo3.presentationTimeUs, this.M3, this.N3, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64183j3));
                } catch (IllegalStateException unused2) {
                    A1();
                    if (this.f64172b4) {
                        F1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            ByteBuffer byteBuffer3 = this.L3;
            int i11 = this.K3;
            MediaCodec.BufferInfo bufferInfo4 = this.f64192p2;
            zB1 = B1(j10, j11, qVar, byteBuffer3, i11, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.M3, this.N3, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64183j3));
        }
        if (zB1) {
            w1(this.f64192p2.presentationTimeUs);
            boolean z11 = (this.f64192p2.flags & 4) != 0 ? true : z10;
            if (!z11 && this.W3 && this.N3) {
                this.G3 = U().currentTimeMillis();
            }
            K1();
            if (!z11) {
                return true;
            }
            A1();
        }
        return z10;
    }

    private boolean H0(t tVar, androidx.media3.common.w wVar, @p0 androidx.media3.exoplayer.drm.m mVar, @p0 androidx.media3.exoplayer.drm.m mVar2) throws s0 {
        androidx.media3.decoder.b bVarC;
        androidx.media3.decoder.b bVarC2;
        if (mVar == mVar2) {
            return false;
        }
        if (mVar2 != null && mVar != null && (bVarC = mVar2.c()) != null && (bVarC2 = mVar.c()) != null && bVarC.getClass().equals(bVarC2.getClass())) {
            if (!(bVarC instanceof androidx.media3.exoplayer.drm.b0)) {
                return false;
            }
            if (!mVar2.e().equals(mVar.e()) || k1.f61540a < 23) {
                return true;
            }
            UUID uuid = androidx.media3.common.j.f60724o2;
            if (!uuid.equals(mVar.e()) && !uuid.equals(mVar2.e())) {
                return !tVar.f64145g && (mVar2.getState() == 2 || ((mVar2.getState() == 3 || mVar2.getState() == 4) && mVar2.g((String) androidx.media3.common.util.a.g(wVar.f61761o))));
            }
        }
        return true;
    }

    private boolean J0() throws s0 {
        int i10;
        if (this.f64195r3 == null || (i10 = this.T3) == 2 || this.f64171a4) {
            return false;
        }
        if (i10 == 0 && U1()) {
            E0();
        }
        q qVar = (q) androidx.media3.common.util.a.g(this.f64195r3);
        if (this.J3 < 0) {
            int iO = qVar.o();
            this.J3 = iO;
            if (iO < 0) {
                return false;
            }
            this.f64190p0.f62700d = qVar.m(iO);
            this.f64190p0.o();
        }
        if (this.T3 == 1) {
            if (!this.F3) {
                this.W3 = true;
                qVar.c(this.J3, 0, 0, 0L, 4);
                J1();
            }
            this.T3 = 2;
            return false;
        }
        if (this.D3) {
            this.D3 = false;
            ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(this.f64190p0.f62700d);
            byte[] bArr = A4;
            byteBuffer.put(bArr);
            qVar.c(this.J3, 0, bArr.length, 0L, 0);
            J1();
            this.V3 = true;
            return true;
        }
        if (this.S3 == 1) {
            for (int i11 = 0; i11 < ((androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64196s3)).f61764r.size(); i11++) {
                ((ByteBuffer) androidx.media3.common.util.a.g(this.f64190p0.f62700d)).put(this.f64196s3.f61764r.get(i11));
            }
            this.S3 = 2;
        }
        int iPosition = ((ByteBuffer) androidx.media3.common.util.a.g(this.f64190p0.f62700d)).position();
        p3 p3VarW = W();
        try {
            int iP0 = p0(p3VarW, this.f64190p0, 0);
            if (iP0 == -3) {
                if (q()) {
                    this.Z3 = this.Y3;
                }
                return false;
            }
            if (iP0 == -5) {
                if (this.S3 == 2) {
                    this.f64190p0.o();
                    this.S3 = 1;
                }
                t1(p3VarW);
                return true;
            }
            if (this.f64190p0.s()) {
                this.Z3 = this.Y3;
                if (this.S3 == 2) {
                    this.f64190p0.o();
                    this.S3 = 1;
                }
                this.f64171a4 = true;
                if (!this.V3) {
                    A1();
                    return false;
                }
                if (!this.F3) {
                    this.W3 = true;
                    qVar.c(this.J3, 0, 0, 0L, 4);
                    J1();
                }
                return false;
            }
            if (!this.V3 && !this.f64190p0.v()) {
                this.f64190p0.o();
                if (this.S3 == 2) {
                    this.S3 = 1;
                }
                return true;
            }
            if (S1(this.f64190p0)) {
                return true;
            }
            boolean zI = this.f64190p0.I();
            if (zI) {
                this.f64190p0.f62699c.b(iPosition);
            }
            long j10 = this.f64190p0.f62702f;
            if (this.f64173c4) {
                if (this.f64177g3.isEmpty()) {
                    this.f64178g4.f64219d.a(j10, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64181i3));
                } else {
                    this.f64177g3.peekLast().f64219d.a(j10, (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64181i3));
                }
                this.f64173c4 = false;
            }
            this.Y3 = Math.max(this.Y3, j10);
            if (q() || this.f64190p0.w()) {
                this.Z3 = this.Y3;
            }
            this.f64190p0.H();
            if (this.f64190p0.r()) {
                d1(this.f64190p0);
            }
            y1(this.f64190p0);
            int iP1 = P0(this.f64190p0);
            if (zI) {
                ((q) androidx.media3.common.util.a.g(qVar)).d(this.J3, 0, this.f64190p0.f62699c, j10, iP1);
            } else {
                ((q) androidx.media3.common.util.a.g(qVar)).c(this.J3, 0, ((ByteBuffer) androidx.media3.common.util.a.g(this.f64190p0.f62700d)).limit(), j10, iP1);
            }
            J1();
            this.V3 = true;
            this.S3 = 0;
            this.f64176f4.f63910c++;
            return true;
        } catch (androidx.media3.decoder.g.b e10) {
            q1(e10);
            D1(0);
            K0();
            return true;
        }
    }

    private void J1() {
        this.J3 = -1;
        this.f64190p0.f62700d = null;
    }

    private void K0() {
        try {
            ((q) androidx.media3.common.util.a.k(this.f64195r3)).flush();
        } finally {
            H1();
        }
    }

    private void K1() {
        this.K3 = -1;
        this.L3 = null;
    }

    private void L1(@p0 androidx.media3.exoplayer.drm.m mVar) {
        androidx.media3.exoplayer.drm.m.b(this.f64185k3, mVar);
        this.f64185k3 = mVar;
    }

    private void M1(e eVar) {
        this.f64178g4 = eVar;
        long j10 = eVar.f64218c;
        if (j10 != -9223372036854775807L) {
            this.f64182i4 = true;
            v1(j10);
        }
    }

    private List<t> N0(boolean z10) throws f0.c {
        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64181i3);
        List<t> listV0 = V0(this.f64201w, wVar, z10);
        if (!listV0.isEmpty() || !z10) {
            return listV0;
        }
        List<t> listV1 = V0(this.f64201w, wVar, false);
        if (!listV1.isEmpty()) {
            androidx.media3.common.util.z.n(f64156l4, "Drm session requires secure decoder for " + wVar.f61761o + ", but no secure decoder available. Trying to proceed with " + listV1 + ".");
        }
        return listV1;
    }

    private void Q1(@p0 androidx.media3.exoplayer.drm.m mVar) {
        androidx.media3.exoplayer.drm.m.b(this.f64186l3, mVar);
        this.f64186l3 = mVar;
    }

    private boolean R1(long j10) {
        return this.f64189o3 == -9223372036854775807L || U().b() - j10 < this.f64189o3;
    }

    protected static boolean Y1(androidx.media3.common.w wVar) {
        int i10 = wVar.N;
        return i10 == 0 || i10 == 2;
    }

    private boolean a2(@p0 androidx.media3.common.w wVar) throws s0 {
        if (k1.f61540a < 23) {
            return true;
        }
        if (this.f64195r3 != null && this.U3 != 3 && getState() != 0) {
            float fT0 = T0(this.f64194q3, (androidx.media3.common.w) androidx.media3.common.util.a.g(wVar), a0());
            float f10 = this.f64200v3;
            if (f10 == fT0) {
                return true;
            }
            if (fT0 == -1.0f) {
                E0();
                return false;
            }
            if (f10 == -1.0f && fT0 <= this.Y) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fT0);
            ((q) androidx.media3.common.util.a.g(this.f64195r3)).a(bundle);
            this.f64200v3 = fT0;
        }
        return true;
    }

    @w0(23)
    private void b2() throws s0 {
        androidx.media3.decoder.b bVarC = ((androidx.media3.exoplayer.drm.m) androidx.media3.common.util.a.g(this.f64186l3)).c();
        if (bVarC instanceof androidx.media3.exoplayer.drm.b0) {
            try {
                ((MediaCrypto) androidx.media3.common.util.a.g(this.f64188n3)).setMediaDrmSession(((androidx.media3.exoplayer.drm.b0) bVarC).f63592b);
            } catch (MediaCryptoException e10) {
                throw S(e10, this.f64181i3, x0.F3);
            }
        }
        L1(this.f64186l3);
        this.T3 = 0;
        this.U3 = 0;
    }

    private boolean e1() {
        return this.K3 >= 0;
    }

    private boolean f1() {
        if (!this.H1.U()) {
            return true;
        }
        long jY = Y();
        return l1(jY, this.H1.S()) == l1(jY, this.f64191p1.f62702f);
    }

    private void g1(androidx.media3.common.w wVar) {
        C0();
        String str = wVar.f61761o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.H1.V(32);
        } else {
            this.H1.V(1);
        }
        this.O3 = true;
    }

    private void h1(t tVar, @p0 MediaCrypto mediaCrypto) throws Exception {
        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64181i3);
        String str = tVar.f64139a;
        int i10 = k1.f61540a;
        float f10 = -1.0f;
        float fT0 = i10 < 23 ? -1.0f : T0(this.f64194q3, wVar, a0());
        if (fT0 > this.Y) {
            f10 = fT0;
        }
        long jB = U().b();
        q.a aVarY0 = Y0(tVar, wVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(aVarY0, Z());
        }
        try {
            z0.a("createCodec:" + str);
            q qVarA = this.f64199v.a(aVarY0);
            this.f64195r3 = qVarA;
            this.H3 = qVarA.i(new d());
            z0.b();
            long jB2 = U().b();
            if (!tVar.q(wVar)) {
                androidx.media3.common.util.z.n(f64156l4, k1.S("Format exceeds selected codec's capabilities [%s, %s]", androidx.media3.common.w.l(wVar), str));
            }
            this.f64204y3 = tVar;
            this.f64200v3 = f10;
            this.f64196s3 = wVar;
            this.f64205z3 = w0(str);
            this.A3 = A0(str);
            this.B3 = x0(str);
            this.C3 = y0(str);
            this.F3 = z0(tVar) || R0();
            if (((q) androidx.media3.common.util.a.g(this.f64195r3)).e()) {
                this.R3 = true;
                this.S3 = 1;
                this.D3 = this.f64205z3 != 0;
            }
            if (getState() == 2) {
                this.I3 = U().b() + 1000;
            }
            this.f64176f4.f63908a++;
            r1(str, aVarY0, jB2, jB2 - jB);
        } catch (Throwable th2) {
            z0.b();
            throw th2;
        }
    }

    @il.m({"this.codecDrmSession"})
    private boolean i1() throws s0 {
        androidx.media3.common.util.a.i(this.f64188n3 == null);
        androidx.media3.exoplayer.drm.m mVar = this.f64185k3;
        androidx.media3.decoder.b bVarC = mVar.c();
        if (androidx.media3.exoplayer.drm.b0.f63590d && (bVarC instanceof androidx.media3.exoplayer.drm.b0)) {
            int state = mVar.getState();
            if (state == 1) {
                androidx.media3.exoplayer.drm.m.a aVar = (androidx.media3.exoplayer.drm.m.a) androidx.media3.common.util.a.g(mVar.T());
                throw S(aVar, this.f64181i3, aVar.f63701a);
            }
            if (state != 4) {
                return false;
            }
        }
        if (bVarC == null) {
            return mVar.T() != null;
        }
        if (bVarC instanceof androidx.media3.exoplayer.drm.b0) {
            androidx.media3.exoplayer.drm.b0 b0Var = (androidx.media3.exoplayer.drm.b0) bVarC;
            try {
                this.f64188n3 = new MediaCrypto(b0Var.f63591a, b0Var.f63592b);
            } catch (MediaCryptoException e10) {
                throw S(e10, this.f64181i3, x0.F3);
            }
        }
        return true;
    }

    private boolean l1(long j10, long j11) {
        androidx.media3.common.w wVar;
        return j11 < j10 && !((wVar = this.f64183j3) != null && Objects.equals(wVar.f61761o, "audio/opus") && m0.g(j10, j11));
    }

    private static boolean m1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void o1(@p0 MediaCrypto mediaCrypto, boolean z10) throws s0, c {
        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64181i3);
        if (this.f64202w3 == null) {
            try {
                List<t> listN0 = N0(z10);
                ArrayDeque<t> arrayDeque = new ArrayDeque<>();
                this.f64202w3 = arrayDeque;
                if (this.X) {
                    arrayDeque.addAll(listN0);
                } else if (!listN0.isEmpty()) {
                    this.f64202w3.add(listN0.get(0));
                }
                this.f64203x3 = null;
            } catch (f0.c e10) {
                throw new c(wVar, e10, z10, -49998);
            }
        }
        if (this.f64202w3.isEmpty()) {
            throw new c(wVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) androidx.media3.common.util.a.g(this.f64202w3);
        while (this.f64195r3 == null) {
            t tVar = (t) androidx.media3.common.util.a.g((t) arrayDeque2.peekFirst());
            if (!p1(wVar) || !T1(tVar)) {
                return;
            }
            try {
                h1(tVar, mediaCrypto);
            } catch (Exception e11) {
                androidx.media3.common.util.z.o(f64156l4, "Failed to initialize decoder: " + tVar, e11);
                arrayDeque2.removeFirst();
                c cVar = new c(wVar, e11, z10, tVar);
                q1(cVar);
                if (this.f64203x3 == null) {
                    this.f64203x3 = cVar;
                } else {
                    this.f64203x3 = this.f64203x3.c(cVar);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f64203x3;
                }
            }
        }
        this.f64202w3 = null;
    }

    private void t0() throws s0 {
        androidx.media3.common.util.a.i(!this.f64171a4);
        p3 p3VarW = W();
        this.f64191p1.o();
        do {
            this.f64191p1.o();
            int iP0 = p0(p3VarW, this.f64191p1, 0);
            if (iP0 == -5) {
                t1(p3VarW);
                return;
            }
            if (iP0 == -4) {
                if (!this.f64191p1.s()) {
                    this.Y3 = Math.max(this.Y3, this.f64191p1.f62702f);
                    if (q() || this.f64190p0.w()) {
                        this.Z3 = this.Y3;
                    }
                    if (this.f64173c4) {
                        androidx.media3.common.w wVar = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64181i3);
                        this.f64183j3 = wVar;
                        if (Objects.equals(wVar.f61761o, "audio/opus") && !this.f64183j3.f61764r.isEmpty()) {
                            this.f64183j3 = this.f64183j3.b().Z(m0.f(this.f64183j3.f61764r.get(0))).N();
                        }
                        u1(this.f64183j3, null);
                        this.f64173c4 = false;
                    }
                    this.f64191p1.H();
                    androidx.media3.common.w wVar2 = this.f64183j3;
                    if (wVar2 != null && Objects.equals(wVar2.f61761o, "audio/opus")) {
                        if (this.f64191p1.r()) {
                            androidx.media3.decoder.g gVar = this.f64191p1;
                            gVar.f62698b = this.f64183j3;
                            d1(gVar);
                        }
                        if (m0.g(Y(), this.f64191p1.f62702f)) {
                            this.f64179h3.a(this.f64191p1, this.f64183j3.f61764r);
                        }
                    }
                    if (!f1()) {
                        break;
                    }
                } else {
                    this.f64171a4 = true;
                    this.Z3 = this.Y3;
                    return;
                }
            } else {
                if (iP0 != -3) {
                    throw new IllegalStateException();
                }
                if (q()) {
                    this.Z3 = this.Y3;
                }
                return;
            }
        } while (this.H1.N(this.f64191p1));
        this.P3 = true;
    }

    private boolean u0(long j10, long j11) throws s0 {
        boolean z10;
        androidx.media3.common.util.a.i(!this.f64172b4);
        if (this.H1.U()) {
            i iVar = this.H1;
            z10 = false;
            if (!B1(j10, j11, null, iVar.f62700d, this.K3, 0, iVar.T(), this.H1.R(), l1(Y(), this.H1.S()), this.H1.s(), (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64183j3))) {
                return false;
            }
            w1(this.H1.S());
            this.H1.o();
        } else {
            z10 = false;
        }
        if (this.f64171a4) {
            this.f64172b4 = true;
            return z10;
        }
        if (this.P3) {
            androidx.media3.common.util.a.i(this.H1.N(this.f64191p1));
            this.P3 = z10;
        }
        if (this.Q3) {
            if (this.H1.U()) {
                return true;
            }
            C0();
            this.Q3 = z10;
            n1();
            if (!this.O3) {
                return z10;
            }
        }
        t0();
        if (this.H1.U()) {
            this.H1.H();
        }
        if (this.H1.U() || this.f64171a4 || this.Q3) {
            return true;
        }
        return z10;
    }

    private int w0(String str) {
        int i10 = k1.f61540a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = Build.MODEL;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = Build.DEVICE;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean x0(String str) {
        return k1.f61540a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    private static boolean y0(String str) {
        return k1.f61540a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean z0(t tVar) {
        String str = tVar.f64139a;
        int i10 = k1.f61540a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && tVar.f64145g);
    }

    protected s B0(Throwable th2, @p0 t tVar) {
        return new s(th2, tVar);
    }

    protected abstract boolean B1(long j10, long j11, @p0 q qVar, @p0 ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, androidx.media3.common.w wVar) throws s0;

    protected void F1() {
        try {
            q qVar = this.f64195r3;
            if (qVar != null) {
                qVar.release();
                this.f64176f4.f63909b++;
                s1(((t) androidx.media3.common.util.a.g(this.f64204y3)).f64139a);
            }
            this.f64195r3 = null;
            try {
                MediaCrypto mediaCrypto = this.f64188n3;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                this.f64188n3 = null;
                L1(null);
            } finally {
                this.f64188n3 = null;
                L1(null);
                I1();
            }
        } catch (Throwable th2) {
            this.f64195r3 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f64188n3;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
                this.f64188n3 = null;
                L1(null);
                I1();
            }
        }
    }

    protected void G1() throws s0 {
    }

    @androidx.annotation.i
    protected void H1() {
        J1();
        K1();
        this.I3 = -9223372036854775807L;
        this.W3 = false;
        this.G3 = -9223372036854775807L;
        this.V3 = false;
        this.D3 = false;
        this.E3 = false;
        this.M3 = false;
        this.N3 = false;
        this.Y3 = -9223372036854775807L;
        this.Z3 = -9223372036854775807L;
        this.f64180h4 = -9223372036854775807L;
        this.T3 = 0;
        this.U3 = 0;
        this.S3 = this.R3 ? 1 : 0;
    }

    public void I0() {
        this.f64184j4 = true;
    }

    @androidx.annotation.i
    protected void I1() {
        H1();
        this.f64175e4 = null;
        this.f64202w3 = null;
        this.f64204y3 = null;
        this.f64196s3 = null;
        this.f64197t3 = null;
        this.f64198u3 = false;
        this.X3 = false;
        this.f64200v3 = -1.0f;
        this.f64205z3 = 0;
        this.A3 = false;
        this.B3 = false;
        this.C3 = false;
        this.F3 = false;
        this.H3 = false;
        this.R3 = false;
        this.S3 = 0;
    }

    protected final boolean L0() throws s0 {
        boolean zM0 = M0();
        if (zM0) {
            n1();
        }
        return zM0;
    }

    protected boolean M0() {
        if (this.f64195r3 == null) {
            return false;
        }
        int i10 = this.U3;
        if (i10 != 3 && ((!this.A3 || this.X3) && (!this.B3 || !this.W3))) {
            if (i10 == 2) {
                int i11 = k1.f61540a;
                androidx.media3.common.util.a.i(i11 >= 23);
                if (i11 >= 23) {
                    try {
                        b2();
                    } catch (s0 e10) {
                        androidx.media3.common.util.z.o(f64156l4, "Failed to update the DRM session, releasing the codec instead.", e10);
                        F1();
                        return true;
                    }
                }
            }
            K0();
            return false;
        }
        F1();
        return true;
    }

    protected final void N1() {
        this.f64174d4 = true;
    }

    @Override // androidx.media3.exoplayer.z4
    public final long O(long j10, long j11) {
        return W0(j10, j11, this.H3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p0
    public final q O0() {
        return this.f64195r3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void O1(s0 s0Var) {
        this.f64175e4 = s0Var;
    }

    protected int P0(androidx.media3.decoder.g gVar) {
        return 0;
    }

    public void P1(long j10) {
        this.f64189o3 = j10;
    }

    @p0
    protected final t Q0() {
        return this.f64204y3;
    }

    @Override // androidx.media3.exoplayer.z4
    public void R(float f10, float f11) throws s0 {
        this.f64193p3 = f10;
        this.f64194q3 = f11;
        a2(this.f64196s3);
    }

    protected boolean R0() {
        return false;
    }

    protected float S0() {
        return this.f64200v3;
    }

    protected boolean S1(androidx.media3.decoder.g gVar) {
        if (!V1(gVar)) {
            return false;
        }
        gVar.o();
        this.f64176f4.f63911d++;
        return true;
    }

    protected float T0(float f10, androidx.media3.common.w wVar, androidx.media3.common.w[] wVarArr) {
        return -1.0f;
    }

    protected boolean T1(t tVar) {
        return true;
    }

    @p0
    protected final MediaFormat U0() {
        return this.f64197t3;
    }

    protected boolean U1() {
        return false;
    }

    protected abstract List<t> V0(z zVar, androidx.media3.common.w wVar, boolean z10) throws f0.c;

    protected boolean V1(androidx.media3.decoder.g gVar) {
        return false;
    }

    protected long W0(long j10, long j11, boolean z10) {
        return super.O(j10, j11);
    }

    protected boolean W1(androidx.media3.common.w wVar) {
        return false;
    }

    protected long X0() {
        return this.Z3;
    }

    protected abstract int X1(z zVar, androidx.media3.common.w wVar) throws f0.c;

    protected abstract q.a Y0(t tVar, androidx.media3.common.w wVar, @p0 MediaCrypto mediaCrypto, float f10);

    protected final long Z0() {
        return this.f64178g4.f64218c;
    }

    protected final boolean Z1() throws s0 {
        return a2(this.f64196s3);
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return this.f64172b4;
    }

    protected final long a1() {
        return this.f64178g4.f64217b;
    }

    @Override // androidx.media3.exoplayer.a5
    public final int b(androidx.media3.common.w wVar) throws s0 {
        try {
            return X1(this.f64201w, wVar);
        } catch (f0.c e10) {
            throw S(e10, wVar, x0.f61837q3);
        }
    }

    protected float b1() {
        return this.f64193p3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p0
    public final z4.c c1() {
        return this.f64187m3;
    }

    protected final void c2(long j10) throws s0 {
        androidx.media3.common.w wVarJ = this.f64178g4.f64219d.j(j10);
        if (wVarJ == null && this.f64182i4 && this.f64197t3 != null) {
            wVarJ = this.f64178g4.f64219d.i();
        }
        if (wVarJ == null) {
            if (this.f64198u3 && this.f64183j3 != null) {
            }
        }
        this.f64183j3 = wVarJ;
        u1((androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64183j3), this.f64197t3);
        this.f64198u3 = false;
        this.f64182i4 = false;
    }

    protected void d1(androidx.media3.decoder.g gVar) throws s0 {
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        this.f64181i3 = null;
        M1(e.f64215e);
        this.f64177g3.clear();
        M0();
    }

    @Override // androidx.media3.exoplayer.i
    protected void f0(boolean z10, boolean z11) throws s0 {
        this.f64176f4 = new androidx.media3.exoplayer.j();
    }

    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) throws s0 {
        boolean z10 = false;
        if (this.f64174d4) {
            this.f64174d4 = false;
            A1();
        }
        s0 s0Var = this.f64175e4;
        if (s0Var != null) {
            this.f64175e4 = null;
            throw s0Var;
        }
        try {
            if (this.f64172b4) {
                G1();
                return;
            }
            if (this.f64181i3 != null || D1(2)) {
                n1();
                if (this.O3) {
                    z0.a("bypassRender");
                    while (u0(j10, j11)) {
                    }
                    z0.b();
                } else if (this.f64195r3 != null) {
                    long jB = U().b();
                    z0.a("drainAndFeed");
                    while (G0(j10, j11) && R1(jB)) {
                    }
                    while (J0() && R1(jB)) {
                    }
                    z0.b();
                } else {
                    this.f64176f4.f63911d += r0(j10);
                    D1(1);
                }
                this.f64176f4.c();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw S(e10, this.f64181i3, k1.t0(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            if (!m1(e11)) {
                throw e11;
            }
            q1(e11);
            if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                F1();
            }
            s sVarB0 = B0(e11, Q0());
            throw T(sVarB0, this.f64181i3, z10, sVarB0.f64136c == 1101 ? x0.f61843u3 : x0.f61838r3);
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) throws s0 {
        this.f64171a4 = false;
        this.f64172b4 = false;
        this.f64174d4 = false;
        if (this.O3) {
            this.H1.o();
            this.f64191p1.o();
            this.P3 = false;
            this.f64179h3.d();
        } else {
            L0();
        }
        if (this.f64178g4.f64219d.l() > 0) {
            this.f64173c4 = true;
        }
        this.f64178g4.f64219d.c();
        this.f64177g3.clear();
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @p0 Object obj) throws s0 {
        if (i10 != 11) {
            super.i(i10, obj);
            return;
        }
        z4.c cVar = (z4.c) androidx.media3.common.util.a.g((z4.c) obj);
        this.f64187m3 = cVar;
        z1(cVar);
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        return this.f64181i3 != null && (d0() || e1() || (this.I3 != -9223372036854775807L && U().b() < this.I3));
    }

    protected final boolean j1() {
        return this.O3;
    }

    @Override // androidx.media3.exoplayer.i
    protected void k0() {
        try {
            C0();
            F1();
            Q1(null);
        } catch (Throwable th2) {
            Q1(null);
            throw th2;
        }
    }

    protected final boolean k1(androidx.media3.common.w wVar) {
        return this.f64186l3 == null && W1(wVar);
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.a5
    public final int l() {
        return 8;
    }

    @Override // androidx.media3.exoplayer.i
    protected void l0() {
    }

    @Override // androidx.media3.exoplayer.i
    protected void m0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // androidx.media3.exoplayer.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void n0(androidx.media3.common.w[] r12, long r13, long r15, androidx.media3.exoplayer.source.t0.b r17) throws androidx.media3.exoplayer.s0 {
        /*
            r11 = this;
            androidx.media3.exoplayer.mediacodec.v$e r12 = r11.f64178g4
            long r0 = r12.f64218c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            androidx.media3.exoplayer.mediacodec.v$e r4 = new androidx.media3.exoplayer.mediacodec.v$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.M1(r4)
            boolean r12 = r11.f64184j4
            if (r12 == 0) goto L5b
            r11.x1()
            return
        L24:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.v$e> r12 = r11.f64177g3
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L5c
            long r0 = r11.Y3
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r4 = r11.f64180h4
            int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r12 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r12 < 0) goto L5c
        L3c:
            androidx.media3.exoplayer.mediacodec.v$e r4 = new androidx.media3.exoplayer.mediacodec.v$e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.M1(r4)
            androidx.media3.exoplayer.mediacodec.v$e r12 = r11.f64178g4
            long r12 = r12.f64218c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L5b
            r11.x1()
        L5b:
            return
        L5c:
            java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.v$e> r12 = r11.f64177g3
            androidx.media3.exoplayer.mediacodec.v$e r0 = new androidx.media3.exoplayer.mediacodec.v$e
            long r1 = r11.Y3
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.v.n0(androidx.media3.common.w[], long, long, androidx.media3.exoplayer.source.t0$b):void");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    protected final void n1() throws s0 {
        androidx.media3.common.w wVar;
        boolean z10;
        if (this.f64195r3 == null && !this.O3 && (wVar = this.f64181i3) != null) {
            if (k1(wVar)) {
                g1(wVar);
                return;
            }
            L1(this.f64186l3);
            if (this.f64185k3 == null || i1()) {
                try {
                    androidx.media3.exoplayer.drm.m mVar = this.f64185k3;
                    if (mVar == null || !(mVar.getState() == 3 || this.f64185k3.getState() == 4)) {
                        z10 = false;
                    } else if (this.f64185k3.g((String) androidx.media3.common.util.a.k(wVar.f61761o))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o1(this.f64188n3, z10);
                } catch (c e10) {
                    throw S(e10, wVar, x0.f61836p3);
                }
            }
            MediaCrypto mediaCrypto = this.f64188n3;
            if (mediaCrypto != null && this.f64195r3 == null) {
                mediaCrypto.release();
                int i10 = 7 << 0;
                this.f64188n3 = null;
            }
        }
    }

    protected boolean p1(androidx.media3.common.w wVar) throws s0 {
        return true;
    }

    protected void q1(Exception exc) {
    }

    protected void r1(String str, q.a aVar, long j10, long j11) {
    }

    protected void s1(String str) {
    }

    @androidx.annotation.i
    @p0
    protected androidx.media3.exoplayer.k t1(p3 p3Var) throws s0 {
        int i10;
        boolean z10 = true;
        this.f64173c4 = true;
        androidx.media3.common.w wVarN = (androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b);
        String str = wVarN.f61761o;
        if (str == null) {
            throw S(new IllegalArgumentException("Sample MIME type is null."), wVarN, x0.f61842t3);
        }
        if (Objects.equals(str, "video/av01") && !wVarN.f61764r.isEmpty()) {
            wVarN = wVarN.b().g0(null).N();
        }
        androidx.media3.common.w wVar = wVarN;
        Q1(p3Var.f64599a);
        this.f64181i3 = wVar;
        if (this.O3) {
            this.Q3 = true;
            return null;
        }
        q qVar = this.f64195r3;
        if (qVar == null) {
            this.f64202w3 = null;
            n1();
            return null;
        }
        t tVar = (t) androidx.media3.common.util.a.g(this.f64204y3);
        androidx.media3.common.w wVar2 = (androidx.media3.common.w) androidx.media3.common.util.a.g(this.f64196s3);
        if (H0(tVar, wVar, this.f64185k3, this.f64186l3)) {
            E0();
            return new androidx.media3.exoplayer.k(tVar.f64139a, wVar2, wVar, 0, 128);
        }
        boolean z11 = this.f64186l3 != this.f64185k3;
        androidx.media3.common.util.a.i(!z11 || k1.f61540a >= 23);
        androidx.media3.exoplayer.k kVarV0 = v0(tVar, wVar2, wVar);
        int i11 = kVarV0.f63950d;
        if (i11 != 0) {
            i10 = 16;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (a2(wVar)) {
                        this.f64196s3 = wVar;
                        if (z11 && !F0()) {
                            i10 = 2;
                        }
                    }
                } else if (a2(wVar)) {
                    this.R3 = true;
                    this.S3 = 1;
                    int i12 = this.f64205z3;
                    if (i12 != 2 && (i12 != 1 || wVar.f61768v != wVar2.f61768v || wVar.f61769w != wVar2.f61769w)) {
                        z10 = false;
                    }
                    this.D3 = z10;
                    this.f64196s3 = wVar;
                    if (z11 && !F0()) {
                        i10 = 2;
                    }
                }
            } else if (a2(wVar)) {
                this.f64196s3 = wVar;
                if (z11) {
                    if (!F0()) {
                        i10 = 2;
                    }
                } else if (!D0()) {
                    i10 = 2;
                }
            }
            return (kVarV0.f63950d != 0 || (this.f64195r3 == qVar && this.U3 != 3)) ? kVarV0 : new androidx.media3.exoplayer.k(tVar.f64139a, wVar2, wVar, 0, i10);
        }
        E0();
        i10 = 0;
        if (kVarV0.f63950d != 0) {
        }
    }

    protected void u1(androidx.media3.common.w wVar, @p0 MediaFormat mediaFormat) throws s0 {
    }

    protected androidx.media3.exoplayer.k v0(t tVar, androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        return new androidx.media3.exoplayer.k(tVar.f64139a, wVar, wVar2, 0, 1);
    }

    protected void v1(long j10) {
    }

    @androidx.annotation.i
    protected void w1(long j10) {
        this.f64180h4 = j10;
        while (!this.f64177g3.isEmpty() && j10 >= this.f64177g3.peek().f64216a) {
            M1((e) androidx.media3.common.util.a.g(this.f64177g3.poll()));
            x1();
        }
    }

    protected void x1() {
    }

    protected void y1(androidx.media3.decoder.g gVar) throws s0 {
    }

    protected void z1(z4.c cVar) {
    }

    public static class c extends Exception {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f64206f = -50000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f64207g = -49999;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f64208h = -49998;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public final String f64209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public final t f64211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        public final String f64212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        public final c f64213e;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(androidx.media3.common.w wVar, @p0 Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + wVar, th2, wVar.f61761o, z10, null, b(i10), null);
            int i11 = 6 ^ 0;
        }

        private static String b(int i10) {
            return "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @androidx.annotation.j
        public c c(c cVar) {
            return new c(getMessage(), getCause(), this.f64209a, this.f64210b, this.f64211c, this.f64212d, cVar);
        }

        public c(androidx.media3.common.w wVar, @p0 Throwable th2, boolean z10, t tVar) {
            this("Decoder init failed: " + tVar.f64139a + ", " + wVar, th2, wVar.f61761o, z10, tVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
        }

        private c(@p0 String str, @p0 Throwable th2, @p0 String str2, boolean z10, @p0 t tVar, @p0 String str3, @p0 c cVar) {
            super(str, th2);
            this.f64209a = str2;
            this.f64210b = z10;
            this.f64211c = tVar;
            this.f64212d = str3;
            this.f64213e = cVar;
        }
    }
}
