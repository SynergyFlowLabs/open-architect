package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.n4;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.r0;
import androidx.media3.common.util.z0;
import androidx.media3.common.x0;
import androidx.media3.common.z3;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.s0;
import androidx.media3.exoplayer.source.t0;
import androidx.media3.exoplayer.z4;
import com.google.common.collect.l6;
import com.google.common.util.concurrent.a2;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class k extends androidx.media3.exoplayer.mediacodec.v implements x.c {
    private static final long A5 = -30000;
    private static final long B5 = -500000;
    private static final long C5 = 100000;
    private static final int D5 = 0;
    private static boolean E5 = false;
    private static boolean F5 = false;

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    private static final String f66337r5 = "MediaCodecVideoRenderer";

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    private static final String f66338s5 = "crop-left";

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    private static final String f66339t5 = "crop-right";

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    private static final String f66340u5 = "crop-bottom";

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    private static final String f66341v5 = "crop-top";

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    private static final int[] f66342w5 = {1920, 1600, 1440, 1280, 960, 854, 640, com.rabbitmq.client.a.f264853x, 480};

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    private static final float f66343x5 = 1.5f;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    private static final long f66344y5 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    private static final int f66345z5 = 2097152;
    private final Context C4;
    private final boolean D4;
    private final l0.a E4;
    private final int F4;
    private final boolean G4;
    private final x H4;
    private final x.b I4;

    @p0
    private final androidx.media3.exoplayer.video.a J4;
    private final long K4;
    private final PriorityQueue<Long> L4;
    private e M4;
    private boolean N4;
    private boolean O4;
    private m0 P4;
    private boolean Q4;
    private List<androidx.media3.common.p> R4;

    @p0
    private Surface S4;

    @p0
    private PlaceholderSurface T4;
    private r0 U4;
    private boolean V4;
    private int W4;
    private int X4;
    private long Y4;
    private int Z4;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    private int f66346a5;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    private int f66347b5;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    private long f66348c5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    private int f66349d5;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private long f66350e5;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    private n4 f66351f5;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    @p0
    private n4 f66352g5;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    private int f66353h5;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    private boolean f66354i5;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    private int f66355j5;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    @p0
    f f66356k5;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    @p0
    private w f66357l5;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    private long f66358m5;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    private long f66359n5;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    private boolean f66360o5;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    private boolean f66361p5;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    private int f66362q5;

    class a implements m0.b {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void a(m0 m0Var) {
            if (k.this.S4 != null) {
                k.this.O2();
            }
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void b(m0 m0Var, m0.d dVar) {
            k kVar = k.this;
            kVar.O1(kVar.S(dVar, dVar.f66396a, x0.J3));
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void c(m0 m0Var) {
            if (k.this.S4 != null) {
                k.this.l3(0, 1);
            }
        }

        @Override // androidx.media3.exoplayer.video.m0.b
        public void d(m0 m0Var, n4 n4Var) {
        }
    }

    class b implements m0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.media3.exoplayer.mediacodec.q f66364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f66365b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f66366c;

        b(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10) {
            this.f66364a = qVar;
            this.f66365b = i10;
            this.f66366c = j10;
        }

        @Override // androidx.media3.exoplayer.video.m0.c
        public void a() {
            k.this.h3(this.f66364a, this.f66365b, this.f66366c);
        }

        @Override // androidx.media3.exoplayer.video.m0.c
        public void b(long j10) {
            k.this.U2(this.f66364a, this.f66365b, this.f66366c, j10);
        }
    }

    @w0(26)
    private static final class c {
        private c() {
        }

        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i10 == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f66368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f66369b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.q.b f66371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f66372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f66373f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private Handler f66374g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private l0 f66375h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f66376i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private m0 f66378k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f66379l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.exoplayer.mediacodec.z f66370c = androidx.media3.exoplayer.mediacodec.z.f64220a;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private float f66377j = 30.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f66380m = -9223372036854775807L;

        public d(Context context) {
            this.f66368a = context;
            this.f66371d = androidx.media3.exoplayer.mediacodec.q.b.b(context);
        }

        public k m() {
            androidx.media3.common.util.a.i(!this.f66369b);
            Handler handler = this.f66374g;
            androidx.media3.common.util.a.i((handler == null && this.f66375h == null) || !(handler == null || this.f66375h == null));
            this.f66369b = true;
            return new k(this);
        }

        @z7.a
        public d n(long j10) {
            this.f66380m = j10;
            return this;
        }

        @z7.a
        public d o(boolean z10) {
            this.f66379l = z10;
            return this;
        }

        @z7.a
        public d p(long j10) {
            this.f66372e = j10;
            return this;
        }

        @z7.a
        public d q(float f10) {
            this.f66377j = f10;
            return this;
        }

        @z7.a
        public d r(androidx.media3.exoplayer.mediacodec.q.b bVar) {
            this.f66371d = bVar;
            return this;
        }

        @z7.a
        public d s(boolean z10) {
            this.f66373f = z10;
            return this;
        }

        @z7.a
        public d t(@p0 Handler handler) {
            this.f66374g = handler;
            return this;
        }

        @z7.a
        public d u(@p0 l0 l0Var) {
            this.f66375h = l0Var;
            return this;
        }

        @z7.a
        public d v(int i10) {
            this.f66376i = i10;
            return this;
        }

        @z7.a
        public d w(androidx.media3.exoplayer.mediacodec.z zVar) {
            this.f66370c = zVar;
            return this;
        }

        @z7.a
        public d x(@p0 m0 m0Var) {
            this.f66378k = m0Var;
            return this;
        }
    }

    protected static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f66383c;

        public e(int i10, int i11, int i12) {
            this.f66381a = i10;
            this.f66382b = i11;
            this.f66383c = i12;
        }
    }

    @w0(23)
    private final class f implements androidx.media3.exoplayer.mediacodec.q.d, Handler.Callback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f66384c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f66385a;

        public f(androidx.media3.exoplayer.mediacodec.q qVar) {
            Handler handlerI = k1.I(this);
            this.f66385a = handlerI;
            qVar.j(this, handlerI);
        }

        private void b(long j10) {
            k kVar = k.this;
            if (this != kVar.f66356k5 || kVar.O0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                k.this.Q2();
                return;
            }
            try {
                k.this.P2(j10);
            } catch (s0 e10) {
                k.this.O1(e10);
            }
        }

        @Override // androidx.media3.exoplayer.mediacodec.q.d
        public void a(androidx.media3.exoplayer.mediacodec.q qVar, long j10, long j11) {
            if (k1.f61540a >= 30) {
                b(j10);
            } else {
                this.f66385a.sendMessageAtFrontOfQueue(Message.obtain(this.f66385a, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(k1.w2(message.arg1, message.arg2));
            return true;
        }
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.z zVar) {
        this(new d(context).w(zVar));
    }

    @p0
    private Surface A2(androidx.media3.exoplayer.mediacodec.t tVar) {
        m0 m0Var = this.P4;
        if (m0Var != null) {
            return m0Var.b();
        }
        Surface surface = this.S4;
        if (surface != null) {
            return surface;
        }
        if (f3(tVar)) {
            return null;
        }
        androidx.media3.common.util.a.i(g3(tVar));
        PlaceholderSurface placeholderSurface = this.T4;
        if (placeholderSurface != null && placeholderSurface.f66230a != tVar.f64145g) {
            S2();
        }
        if (this.T4 == null) {
            this.T4 = PlaceholderSurface.c(this.C4, tVar.f64145g);
        }
        return this.T4;
    }

    private boolean B2(androidx.media3.exoplayer.mediacodec.t tVar) {
        Surface surface;
        return this.P4 != null || ((surface = this.S4) != null && surface.isValid()) || f3(tVar) || g3(tVar);
    }

    private boolean C2(androidx.media3.decoder.g gVar) {
        return gVar.f62702f < Y();
    }

    private boolean D2(androidx.media3.decoder.g gVar) {
        if (q() || gVar.w() || this.f66359n5 == -9223372036854775807L) {
            return true;
        }
        return this.f66359n5 - (gVar.f62702f - Z0()) <= 100000;
    }

    private void F2() {
        if (this.Z4 > 0) {
            long jB = U().b();
            this.E4.n(this.Z4, jB - this.Y4);
            this.Z4 = 0;
            this.Y4 = jB;
        }
    }

    private void G2() {
        if (this.H4.i() && this.S4 != null) {
            O2();
        }
    }

    private void H2() {
        int i10 = this.f66349d5;
        if (i10 != 0) {
            this.E4.r(this.f66348c5, i10);
            this.f66348c5 = 0L;
            this.f66349d5 = 0;
        }
    }

    private void I2(n4 n4Var) {
        if (n4Var.equals(n4.f60993h) || n4Var.equals(this.f66352g5)) {
            return;
        }
        this.f66352g5 = n4Var;
        this.E4.t(n4Var);
    }

    private void J2() {
        Surface surface = this.S4;
        if (surface == null || !this.V4) {
            return;
        }
        this.E4.q(surface);
    }

    private void K2() {
        n4 n4Var = this.f66352g5;
        if (n4Var != null) {
            this.E4.t(n4Var);
        }
    }

    private void L2(MediaFormat mediaFormat) {
        if (this.P4 != null && !k1.i1(this.C4)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
    }

    private void M2() {
        int i10;
        androidx.media3.exoplayer.mediacodec.q qVarO0;
        if (!this.f66354i5 || (i10 = k1.f61540a) < 23 || (qVarO0 = O0()) == null) {
            return;
        }
        this.f66356k5 = new f(qVarO0);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            qVarO0.a(bundle);
        }
    }

    private void N2(long j10, long j11, androidx.media3.common.w wVar) {
        w wVar2 = this.f66357l5;
        if (wVar2 != null) {
            wVar2.h(j10, j11, wVar, U0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @il.m({"displaySurface"})
    public void O2() {
        this.E4.q(this.S4);
        this.V4 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q2() {
        N1();
    }

    private void R2(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10, androidx.media3.common.w wVar) {
        k kVar;
        long jG = this.I4.g();
        long jF = this.I4.f();
        if (e3() && jG == this.f66350e5) {
            h3(qVar, i10, j10);
            kVar = this;
        } else {
            kVar = this;
            kVar.N2(j10, jG, wVar);
            kVar.V2(qVar, i10, j10, jG);
            jG = jG;
        }
        kVar.o3(jF);
        kVar.f66350e5 = jG;
    }

    private void S2() {
        PlaceholderSurface placeholderSurface = this.T4;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.T4 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10, long j11) {
        V2(qVar, i10, j10, j11);
    }

    @w0(29)
    private static void W2(androidx.media3.exoplayer.mediacodec.q qVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        qVar.a(bundle);
    }

    private void X2(@p0 Object obj) throws s0 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.S4 == surface) {
            if (surface != null) {
                K2();
                J2();
                return;
            }
            return;
        }
        this.S4 = surface;
        if (this.P4 == null) {
            this.H4.q(surface);
        }
        this.V4 = false;
        int state = getState();
        androidx.media3.exoplayer.mediacodec.q qVarO0 = O0();
        if (qVarO0 != null && this.P4 == null) {
            androidx.media3.exoplayer.mediacodec.t tVar = (androidx.media3.exoplayer.mediacodec.t) androidx.media3.common.util.a.g(Q0());
            boolean zB2 = B2(tVar);
            if (k1.f61540a < 23 || !zB2 || this.N4) {
                F1();
                n1();
            } else {
                Y2(qVarO0, A2(tVar));
            }
        }
        if (surface != null) {
            K2();
        } else {
            this.f66352g5 = null;
            m0 m0Var = this.P4;
            if (m0Var != null) {
                m0Var.f();
            }
        }
        if (state == 2) {
            m0 m0Var2 = this.P4;
            if (m0Var2 != null) {
                m0Var2.B(true);
            } else {
                this.H4.e(true);
            }
        }
        M2();
    }

    private void Y2(androidx.media3.exoplayer.mediacodec.q qVar, @p0 Surface surface) {
        int i10 = k1.f61540a;
        if (i10 >= 23 && surface != null) {
            Z2(qVar, surface);
        } else {
            if (i10 < 35) {
                throw new IllegalStateException();
            }
            n2(qVar);
        }
    }

    public static int i3(Context context, androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar) throws androidx.media3.exoplayer.mediacodec.f0.c {
        return j3(context, zVar, wVar);
    }

    private static int j3(Context context, androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar) throws androidx.media3.exoplayer.mediacodec.f0.c {
        boolean z10;
        int i10 = 0;
        if (!androidx.media3.common.s0.v(wVar.f61761o)) {
            return a5.M(0);
        }
        boolean z11 = wVar.f61765s != null;
        List<androidx.media3.exoplayer.mediacodec.t> listV2 = v2(context, zVar, wVar, z11, false);
        if (z11 && listV2.isEmpty()) {
            listV2 = v2(context, zVar, wVar, false, false);
        }
        if (listV2.isEmpty()) {
            return a5.M(1);
        }
        if (!androidx.media3.exoplayer.mediacodec.v.Y1(wVar)) {
            return a5.M(2);
        }
        androidx.media3.exoplayer.mediacodec.t tVar = listV2.get(0);
        boolean zQ = tVar.q(wVar);
        if (!zQ) {
            int i11 = 1;
            while (true) {
                if (i11 >= listV2.size()) {
                    z10 = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.t tVar2 = listV2.get(i11);
                if (tVar2.q(wVar)) {
                    z10 = false;
                    zQ = true;
                    tVar = tVar2;
                    break;
                }
                i11++;
            }
        } else {
            z10 = true;
            break;
        }
        int i12 = zQ ? 4 : 3;
        int i13 = tVar.t(wVar) ? 16 : 8;
        int i14 = tVar.f64146h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (k1.f61540a >= 26 && "video/dolby-vision".equals(wVar.f61761o) && !c.a(context)) {
            i15 = 256;
        }
        if (zQ) {
            List<androidx.media3.exoplayer.mediacodec.t> listV3 = v2(context, zVar, wVar, z11, true);
            if (!listV3.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.t tVar3 = androidx.media3.exoplayer.mediacodec.f0.q(listV3, wVar).get(0);
                if (tVar3.q(wVar) && tVar3.t(wVar)) {
                    i10 = 32;
                }
            }
        }
        return a5.K(i12, i13, i10, i14, i15);
    }

    private void k3() {
        androidx.media3.exoplayer.mediacodec.q qVarO0 = O0();
        if (qVarO0 != null && k1.f61540a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f66353h5));
            qVarO0.a(bundle);
        }
    }

    private void m3(long j10) {
        int i10 = 0;
        while (true) {
            Long lPeek = this.L4.peek();
            if (lPeek == null || lPeek.longValue() >= j10) {
                break;
            }
            i10++;
            this.L4.poll();
        }
        l3(i10, 0);
    }

    private void n3(t0.b bVar) {
        z3 z3VarC0 = c0();
        if (z3VarC0.w()) {
            this.f66359n5 = -9223372036854775807L;
        } else {
            this.f66359n5 = z3VarC0.l(((t0.b) androidx.media3.common.util.a.g(bVar)).f65467a, new z3.b()).m();
        }
    }

    private static boolean o2() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean q2() {
        int i10 = k1.f61540a;
        byte b10 = 7;
        if (i10 <= 28) {
            String str = Build.DEVICE;
            str.getClass();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (i10 <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (i10 <= 26) {
                    String str3 = Build.DEVICE;
                    str3.getClass();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b10 = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b10 = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b10 = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b10 = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b10 = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b10 = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b10 = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b10 = -1;
                            }
                            break;
                        case -1936688066:
                            b10 = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b10 = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b10 = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b10 = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b10 = !str3.equals("XT1663") ? (byte) -1 : com.google.common.base.c.f116461n;
                            break;
                        case -1680025915:
                            b10 = !str3.equals("ComioS1") ? (byte) -1 : com.google.common.base.c.f116462o;
                            break;
                        case -1615810839:
                            b10 = !str3.equals("Phantom6") ? (byte) -1 : com.google.common.base.c.f116463p;
                            break;
                        case -1600724499:
                            b10 = !str3.equals("pacificrim") ? (byte) -1 : com.google.common.base.c.f116464q;
                            break;
                        case -1554255044:
                            b10 = !str3.equals("vernee_M5") ? (byte) -1 : com.google.common.base.c.f116465r;
                            break;
                        case -1481772737:
                            b10 = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b10 = !str3.equals("panell_ds") ? (byte) -1 : com.google.common.base.c.f116468u;
                            break;
                        case -1481772729:
                            b10 = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b10 = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : com.google.common.base.c.f116471x;
                            break;
                        case -1217592143:
                            b10 = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : com.google.common.base.c.f116472y;
                            break;
                        case -1180384755:
                            b10 = !str3.equals("iris60") ? (byte) -1 : com.google.common.base.c.f116473z;
                            break;
                        case -1139198265:
                            b10 = !str3.equals("Slate_Pro") ? (byte) -1 : com.google.common.base.c.A;
                            break;
                        case -1052835013:
                            b10 = !str3.equals("namath") ? (byte) -1 : com.google.common.base.c.B;
                            break;
                        case -993250464:
                            b10 = !str3.equals("A10-70F") ? (byte) -1 : com.google.common.base.c.C;
                            break;
                        case -993250458:
                            b10 = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b10 = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b10 = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b10 = !str3.equals("tcl_eu") ? (byte) -1 : com.google.common.base.c.G;
                            break;
                        case -842500323:
                            b10 = !str3.equals("nicklaus_f") ? (byte) -1 : com.google.common.base.c.H;
                            break;
                        case -821392978:
                            b10 = !str3.equals("A7000-a") ? (byte) -1 : com.google.common.base.c.I;
                            break;
                        case -797483286:
                            b10 = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b10 = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b10 = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b10 = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b10 = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b10 = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b10 = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b10 = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b10 = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b10 = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b10 = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b10 = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b10 = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b10 = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b10 = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b10 = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b10 = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b10 = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b10 = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b10 = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b10 = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b10 = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b10 = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b10 = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b10 = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b10 = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b10 = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b10 = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b10 = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b10 = !str3.equals("flo") ? (byte) -1 : kotlin.io.encoding.a.f312535i;
                            break;
                        case 1513190:
                            b10 = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b10 = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b10 = !str3.equals("1714") ? (byte) -1 : com.google.common.primitives.t.f119782a;
                            break;
                        case 2133089:
                            b10 = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b10 = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b10 = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b10 = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b10 = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b10 = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b10 = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b10 = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b10 = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b10 = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b10 = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b10 = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b10 = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b10 = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b10 = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b10 = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b10 = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b10 = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b10 = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b10 = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b10 = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b10 = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b10 = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b10 = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b10 = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b10 = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b10 = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b10 = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b10 = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b10 = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b10 = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b10 = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b10 = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b10 = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b10 = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b10 = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b10 = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b10 = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b10 = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b10 = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b10 = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b10 = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b10 = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b10 = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b10 = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b10 = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b10 = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b10 = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b10 = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b10 = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b10 = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b10 = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b10 = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b10 = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b10 = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b10 = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b10 = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b10 = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b10 = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b10 = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b10 = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b10 = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b10 = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b10 = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b10 = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b10 = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b10 = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b10 = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b10 = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b10 = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b10 = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b10 = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b10 = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b10 = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b10 = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    switch (b10) {
                        default:
                            str2.getClass();
                            if (!str2.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case com.planner5d.library.engine.input.f.b.f160729t0 /* 56 */:
                        case com.planner5d.library.engine.input.f.b.f160707m /* 57 */:
                        case com.planner5d.library.engine.input.f.b.f160710n /* 58 */:
                        case com.planner5d.library.engine.input.f.b.D0 /* 59 */:
                        case 60:
                        case 61:
                        case com.planner5d.library.engine.input.f.b.I0 /* 62 */:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case com.planner5d.library.engine.input.f.b.V /* 68 */:
                        case com.planner5d.library.engine.input.f.b.f160708m0 /* 69 */:
                        case 70:
                        case 71:
                        case 72:
                        case com.planner5d.library.engine.input.f.b.f160725s /* 73 */:
                        case com.planner5d.library.engine.input.f.b.C0 /* 74 */:
                        case 75:
                        case 76:
                        case com.planner5d.library.engine.input.f.b.f160716p /* 77 */:
                        case 78:
                        case com.planner5d.library.engine.input.f.b.X /* 79 */:
                        case 80:
                        case com.planner5d.library.engine.input.f.b.f160732u0 /* 81 */:
                        case com.planner5d.library.engine.input.f.b.f160705l0 /* 82 */:
                        case com.planner5d.library.engine.input.f.b.f160717p0 /* 83 */:
                        case com.planner5d.library.engine.input.f.b.B0 /* 84 */:
                        case 85:
                        case com.planner5d.library.engine.input.f.b.f160702k0 /* 86 */:
                        case com.planner5d.library.engine.input.f.b.f160690g0 /* 87 */:
                        case com.planner5d.library.engine.input.f.b.f160696i0 /* 88 */:
                        case 89:
                        case 90:
                        case com.planner5d.library.engine.input.f.b.f160711n0 /* 91 */:
                        case com.planner5d.library.engine.input.f.b.f160697i1 /* 92 */:
                        case com.planner5d.library.engine.input.f.b.f160700j1 /* 93 */:
                        case com.planner5d.library.engine.input.f.b.f160703k1 /* 94 */:
                        case com.planner5d.library.engine.input.f.b.f160706l1 /* 95 */:
                        case 96:
                        case com.planner5d.library.engine.input.f.b.f160715o1 /* 97 */:
                        case com.planner5d.library.engine.input.f.b.f160718p1 /* 98 */:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case com.planner5d.library.engine.input.f.b.f160733u1 /* 103 */:
                        case 104:
                        case 105:
                        case com.planner5d.library.engine.input.f.b.f160742x1 /* 106 */:
                        case com.planner5d.library.engine.input.f.b.f160745y1 /* 107 */:
                        case 108:
                        case 109:
                        case 110:
                        case com.rabbitmq.client.impl.k.b.p.f265340a /* 111 */:
                        case com.planner5d.library.engine.input.f.b.B /* 112 */:
                        case 113:
                        case 114:
                        case 115:
                        case androidx.media3.extractor.metadata.dvbsi.b.f67479d /* 116 */:
                        case me.relex.circleindicator.a.f332619e /* 117 */:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case okhttp3.internal.ws.g.f334652s /* 126 */:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case androidx.media2.widget.f.i.f59767c0 /* 137 */:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    public static int s2(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar) {
        int i10 = wVar.f61768v;
        int i11 = wVar.f61769w;
        if (i10 != -1 && i11 != -1) {
            String str = (String) androidx.media3.common.util.a.g(wVar.f61761o);
            if ("video/dolby-vision".equals(str)) {
                Pair<Integer, Integer> pairL = androidx.media3.exoplayer.mediacodec.f0.l(wVar);
                if (pairL == null) {
                    str = "video/hevc";
                } else {
                    int iIntValue = ((Integer) pairL.first).intValue();
                    if (iIntValue == 512 || iIntValue == 1 || iIntValue == 2) {
                        str = "video/avc";
                    } else if (iIntValue == 1024) {
                        str = "video/av01";
                    } else {
                        str = "video/hevc";
                    }
                }
            }
            str.getClass();
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return x2(i10 * i11, 2);
                case "video/hevc":
                    return Math.max(2097152, x2(i10 * i11, 2));
                case "video/avc":
                    String str2 = Build.MODEL;
                    if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(Build.MANUFACTURER) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && tVar.f64145g)))) {
                        return -1;
                    }
                    return x2(k1.q(i10, 16) * k1.q(i11, 16) * 256, 2);
                case "video/x-vnd.on2.vp9":
                    return x2(i10 * i11, 4);
                default:
                    return -1;
            }
        }
        return -1;
    }

    @p0
    private static Point t2(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar) {
        int i10 = wVar.f61769w;
        int i11 = wVar.f61768v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f66342w5) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point pointC = tVar.c(i15, i13);
            float f11 = wVar.f61770x;
            if (pointC != null && tVar.w(pointC.x, pointC.y, f11)) {
                return pointC;
            }
        }
        return null;
    }

    private static List<androidx.media3.exoplayer.mediacodec.t> v2(Context context, androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar, boolean z10, boolean z11) throws androidx.media3.exoplayer.mediacodec.f0.c {
        String str = wVar.f61761o;
        if (str == null) {
            return l6.F();
        }
        if (k1.f61540a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<androidx.media3.exoplayer.mediacodec.t> listJ = androidx.media3.exoplayer.mediacodec.f0.j(zVar, wVar, z10, z11);
            if (!listJ.isEmpty()) {
                return listJ;
            }
        }
        return androidx.media3.exoplayer.mediacodec.f0.p(zVar, wVar, z10, z11);
    }

    protected static int w2(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar) {
        if (wVar.f61762p == -1) {
            return s2(tVar, wVar);
        }
        int size = wVar.f61764r.size();
        int length = 0;
        for (int i10 = 0; i10 < size; i10++) {
            length += wVar.f61764r.get(i10).length;
        }
        return wVar.f61762p + length;
    }

    private static int x2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    @Override // androidx.media3.exoplayer.video.x.c
    public boolean A(long j10, long j11) {
        return d3(j10, j11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected androidx.media3.exoplayer.mediacodec.s B0(Throwable th2, @p0 androidx.media3.exoplayer.mediacodec.t tVar) {
        return new j(th2, tVar, this.S4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected boolean B1(long j10, long j11, @p0 androidx.media3.exoplayer.mediacodec.q qVar, @p0 ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, androidx.media3.common.w wVar) throws s0 {
        androidx.media3.common.util.a.g(qVar);
        long jZ0 = j12 - Z0();
        m3(j12);
        if (this.P4 != null) {
            if (!z10 || z11) {
                return this.P4.r(r2() + j12, z11, new b(qVar, i10, jZ0));
            }
            h3(qVar, i10, jZ0);
            return true;
        }
        int iC = this.H4.c(j12, j10, j11, a1(), z10, z11, this.I4);
        if (iC == 0) {
            long jA = U().a();
            N2(jZ0, jA, wVar);
            U2(qVar, i10, jZ0, jA);
            o3(this.I4.f());
            return true;
        }
        if (iC == 1) {
            R2((androidx.media3.exoplayer.mediacodec.q) androidx.media3.common.util.a.k(qVar), i10, jZ0, wVar);
            return true;
        }
        if (iC == 2) {
            p2(qVar, i10, jZ0);
            o3(this.I4.f());
            return true;
        }
        if (iC == 3) {
            h3(qVar, i10, jZ0);
            o3(this.I4.f());
            return true;
        }
        if (iC == 4 || iC == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(iC));
    }

    @Override // androidx.media3.exoplayer.video.x.c
    public boolean E(long j10, long j11, boolean z10) {
        return c3(j10, j11, z10);
    }

    protected boolean E2(long j10, boolean z10) throws s0 {
        int iR0 = r0(j10);
        if (iR0 == 0) {
            return false;
        }
        if (z10) {
            androidx.media3.exoplayer.j jVar = this.f64176f4;
            int i10 = jVar.f63911d + iR0;
            jVar.f63911d = i10;
            jVar.f63913f += this.f66347b5;
            jVar.f63911d = i10 + this.L4.size();
        } else {
            this.f64176f4.f63917j++;
            l3(iR0 + this.L4.size(), this.f66347b5);
        }
        L0();
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.z(false);
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void G1() {
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.h();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @androidx.annotation.i
    protected void H1() {
        super.H1();
        this.L4.clear();
        this.f66361p5 = false;
        this.f66347b5 = 0;
        this.f66362q5 = 0;
        androidx.media3.exoplayer.video.a aVar = this.J4;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.video.x.c
    public boolean N(long j10, long j11, long j12, boolean z10, boolean z11) throws s0 {
        long j13 = this.K4;
        if (j13 != -9223372036854775807L) {
            this.f66361p5 = j10 < j13;
        }
        return b3(j10, j12, z10) && E2(j11, z11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected int P0(androidx.media3.decoder.g gVar) {
        return (k1.f61540a >= 34 && this.f66354i5 && C2(gVar)) ? 32 : 0;
    }

    protected void P2(long j10) throws s0 {
        c2(j10);
        I2(this.f66351f5);
        this.f64176f4.f63912e++;
        G2();
        w1(j10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.z4
    public void R(float f10, float f11) throws s0 {
        super.R(f10, f11);
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.G(f10);
        } else {
            this.H4.r(f10);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected boolean R0() {
        return this.f66354i5 && k1.f61540a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected boolean S1(androidx.media3.decoder.g gVar) {
        ByteBuffer byteBuffer;
        if (D2(gVar) || gVar.I()) {
            return false;
        }
        boolean zC2 = C2(gVar);
        if ((zC2 || this.f66361p5) && !gVar.r()) {
            if (gVar.x()) {
                gVar.o();
                if (zC2) {
                    this.f64176f4.f63911d++;
                } else if (this.f66361p5) {
                    this.L4.add(Long.valueOf(gVar.f62702f));
                    this.f66362q5++;
                }
                return true;
            }
            if (this.J4 != null && ((androidx.media3.exoplayer.mediacodec.t) androidx.media3.common.util.a.g(Q0())).f64140b.equals("video/av01") && (byteBuffer = gVar.f62700d) != null) {
                boolean z10 = zC2 || this.f66362q5 <= 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                byteBufferAsReadOnlyBuffer.flip();
                int iD = this.J4.d(byteBufferAsReadOnlyBuffer, z10);
                boolean z11 = ((e) androidx.media3.common.util.a.g(this.M4)).f66383c + iD < byteBufferAsReadOnlyBuffer.capacity();
                if (iD != byteBufferAsReadOnlyBuffer.limit() && z11) {
                    ((ByteBuffer) androidx.media3.common.util.a.g(gVar.f62700d)).position(iD);
                    if (zC2) {
                        this.f64176f4.f63911d++;
                    } else if (this.f66361p5) {
                        this.L4.add(Long.valueOf(gVar.f62702f));
                        this.f66362q5++;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected float T0(float f10, androidx.media3.common.w wVar, androidx.media3.common.w[] wVarArr) {
        float fMax = -1.0f;
        for (androidx.media3.common.w wVar2 : wVarArr) {
            float f11 = wVar2.f61770x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected boolean T1(androidx.media3.exoplayer.mediacodec.t tVar) {
        return B2(tVar);
    }

    @Deprecated
    protected void T2(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10) {
        z0.a("releaseOutputBuffer");
        qVar.h(i10, true);
        z0.b();
        this.f64176f4.f63912e++;
        this.f66346a5 = 0;
        if (this.P4 == null) {
            I2(this.f66351f5);
            G2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected List<androidx.media3.exoplayer.mediacodec.t> V0(androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar, boolean z10) throws androidx.media3.exoplayer.mediacodec.f0.c {
        return androidx.media3.exoplayer.mediacodec.f0.q(v2(this.C4, zVar, wVar, z10, this.f66354i5), wVar);
    }

    protected void V2(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10, long j11) {
        z0.a("releaseOutputBuffer");
        qVar.f(i10, j11);
        z0.b();
        this.f64176f4.f63912e++;
        this.f66346a5 = 0;
        if (this.P4 == null) {
            I2(this.f66351f5);
            G2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected int X1(androidx.media3.exoplayer.mediacodec.z zVar, androidx.media3.common.w wVar) throws androidx.media3.exoplayer.mediacodec.f0.c {
        return j3(this.C4, zVar, wVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected androidx.media3.exoplayer.mediacodec.q.a Y0(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar, @p0 MediaCrypto mediaCrypto, float f10) {
        String str = tVar.f64141c;
        e eVarU2 = u2(tVar, wVar, a0());
        this.M4 = eVarU2;
        MediaFormat mediaFormatY2 = y2(wVar, str, eVarU2, f10, this.G4, this.f66354i5 ? this.f66355j5 : 0);
        Surface surfaceA2 = A2(tVar);
        L2(mediaFormatY2);
        return androidx.media3.exoplayer.mediacodec.q.a.b(tVar, mediaFormatY2, wVar, surfaceA2, mediaCrypto);
    }

    @w0(23)
    protected void Z2(androidx.media3.exoplayer.mediacodec.q qVar, Surface surface) {
        qVar.n(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.z4
    public boolean a() {
        if (!super.a()) {
            return false;
        }
        m0 m0Var = this.P4;
        return m0Var == null || m0Var.a();
    }

    public void a3(List<androidx.media3.common.p> list) {
        this.R4 = list;
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.L(list);
        }
    }

    protected boolean b3(long j10, long j11, boolean z10) {
        return j10 < B5 && !z10;
    }

    protected boolean c3(long j10, long j11, boolean z10) {
        return j10 < A5 && !z10;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @e.b(29)
    protected void d1(androidx.media3.decoder.g gVar) throws s0 {
        if (this.O4) {
            ByteBuffer byteBuffer = (ByteBuffer) androidx.media3.common.util.a.g(gVar.f62703g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        W2((androidx.media3.exoplayer.mediacodec.q) androidx.media3.common.util.a.g(O0()), bArr);
                    }
                }
            }
        }
    }

    protected boolean d3(long j10, long j11) {
        return j10 < A5 && j11 > 100000;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void e0() {
        this.f66352g5 = null;
        this.f66359n5 = -9223372036854775807L;
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.y();
        } else {
            this.H4.g();
        }
        M2();
        this.V4 = false;
        this.f66356k5 = null;
        try {
            super.e0();
            this.E4.m(this.f64176f4);
            this.E4.t(n4.f60993h);
        } catch (Throwable th2) {
            this.E4.m(this.f64176f4);
            this.E4.t(n4.f60993h);
            throw th2;
        }
    }

    protected boolean e3() {
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void f0(boolean z10, boolean z11) throws s0 {
        super.f0(z10, z11);
        boolean z12 = V().f63544b;
        androidx.media3.common.util.a.i((z12 && this.f66355j5 == 0) ? false : true);
        if (this.f66354i5 != z12) {
            this.f66354i5 = z12;
            F1();
        }
        this.E4.o(this.f64176f4);
        if (!this.Q4) {
            if (this.R4 != null && this.P4 == null) {
                o oVarH = new o.b(this.C4, this.H4).i(U()).h();
                oVarH.S(1);
                this.P4 = oVarH.g(0);
            }
            this.Q4 = true;
        }
        m0 m0Var = this.P4;
        if (m0Var == null) {
            this.H4.o(U());
            this.H4.h(z11);
            return;
        }
        m0Var.q(new a(), a2.c());
        w wVar = this.f66357l5;
        if (wVar != null) {
            this.P4.k(wVar);
        }
        if (this.S4 != null && !this.U4.equals(r0.f61638c)) {
            this.P4.c(this.S4, this.U4);
        }
        this.P4.n(this.X4);
        this.P4.G(b1());
        List<androidx.media3.common.p> list = this.R4;
        if (list != null) {
            this.P4.L(list);
        }
        this.P4.m(z11);
        z4.c cVarC1 = c1();
        if (cVarC1 != null) {
            this.P4.t(cVarC1);
        }
    }

    protected boolean f3(androidx.media3.exoplayer.mediacodec.t tVar) {
        return k1.f61540a >= 35 && tVar.f64149k;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.z4
    @androidx.annotation.i
    public void g(long j10, long j11) throws s0 {
        m0 m0Var = this.P4;
        if (m0Var != null) {
            try {
                m0Var.g(j10, j11);
            } catch (m0.d e10) {
                throw S(e10, e10.f66396a, x0.J3);
            }
        }
        super.g(j10, j11);
    }

    @Override // androidx.media3.exoplayer.i
    protected void g0() {
        super.g0();
    }

    protected boolean g3(androidx.media3.exoplayer.mediacodec.t tVar) {
        return k1.f61540a >= 23 && !this.f66354i5 && !m2(tVar.f64139a) && (!tVar.f64145g || PlaceholderSurface.b(this.C4));
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public String getName() {
        return f66337r5;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) throws s0 {
        m0 m0Var = this.P4;
        if (m0Var != null) {
            if (!z10) {
                m0Var.z(true);
            }
            this.P4.s(a1(), r2());
            this.f66360o5 = true;
        }
        super.h0(j10, z10);
        if (this.P4 == null) {
            this.H4.m();
        }
        if (z10) {
            m0 m0Var2 = this.P4;
            if (m0Var2 != null) {
                m0Var2.B(false);
            } else {
                this.H4.e(false);
            }
        }
        M2();
        this.f66346a5 = 0;
    }

    protected void h3(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10) {
        z0.a("skipVideoBuffer");
        qVar.h(i10, false);
        z0.b();
        this.f64176f4.f63913f++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @p0 Object obj) throws s0 {
        if (i10 == 1) {
            X2(obj);
            return;
        }
        if (i10 == 7) {
            w wVar = (w) androidx.media3.common.util.a.g(obj);
            this.f66357l5 = wVar;
            m0 m0Var = this.P4;
            if (m0Var != null) {
                m0Var.k(wVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) androidx.media3.common.util.a.g(obj)).intValue();
            if (this.f66355j5 != iIntValue) {
                this.f66355j5 = iIntValue;
                if (this.f66354i5) {
                    F1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            this.W4 = ((Integer) androidx.media3.common.util.a.g(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.q qVarO0 = O0();
            if (qVarO0 != null) {
                qVarO0.b(this.W4);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue2 = ((Integer) androidx.media3.common.util.a.g(obj)).intValue();
            this.X4 = iIntValue2;
            m0 m0Var2 = this.P4;
            if (m0Var2 != null) {
                m0Var2.n(iIntValue2);
                return;
            } else {
                this.H4.n(iIntValue2);
                return;
            }
        }
        if (i10 == 13) {
            a3((List) androidx.media3.common.util.a.g(obj));
            return;
        }
        if (i10 == 14) {
            r0 r0Var = (r0) androidx.media3.common.util.a.g(obj);
            if (r0Var.b() == 0 || r0Var.a() == 0) {
                return;
            }
            this.U4 = r0Var;
            m0 m0Var3 = this.P4;
            if (m0Var3 != null) {
                m0Var3.c((Surface) androidx.media3.common.util.a.k(this.S4), r0Var);
                return;
            }
            return;
        }
        if (i10 == 16) {
            this.f66353h5 = ((Integer) androidx.media3.common.util.a.g(obj)).intValue();
            k3();
        } else {
            if (i10 != 17) {
                super.i(i10, obj);
                return;
            }
            Surface surface = this.S4;
            X2(null);
            ((k) androidx.media3.common.util.a.g(obj)).i(1, surface);
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void i0() {
        super.i0();
        m0 m0Var = this.P4;
        if (m0Var == null || !this.D4) {
            return;
        }
        m0Var.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.z4
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        m0 m0Var = this.P4;
        if (m0Var != null) {
            return m0Var.v(zIsReady);
        }
        if (zIsReady && (O0() == null || this.f66354i5)) {
            return true;
        }
        return this.H4.d(zIsReady);
    }

    @Override // androidx.media3.exoplayer.z4
    public void j() {
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.j();
        } else {
            this.H4.a();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void k0() {
        try {
            super.k0();
        } finally {
            this.Q4 = false;
            this.f66358m5 = -9223372036854775807L;
            S2();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void l0() {
        super.l0();
        this.Z4 = 0;
        this.Y4 = U().b();
        this.f66348c5 = 0L;
        this.f66349d5 = 0;
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.w();
        } else {
            this.H4.k();
        }
    }

    protected void l2(m0 m0Var, int i10, androidx.media3.common.w wVar) {
        List<androidx.media3.common.p> listF = this.R4;
        if (listF == null) {
            listF = l6.F();
        }
        m0Var.x(i10, wVar, listF);
    }

    protected void l3(int i10, int i11) {
        androidx.media3.exoplayer.j jVar = this.f64176f4;
        jVar.f63915h += i10;
        int i12 = i10 + i11;
        jVar.f63914g += i12;
        this.Z4 += i12;
        int i13 = this.f66346a5 + i12;
        this.f66346a5 = i13;
        jVar.f63916i = Math.max(i13, jVar.f63916i);
        int i14 = this.F4;
        if (i14 <= 0 || this.Z4 < i14) {
            return;
        }
        F2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void m0() {
        F2();
        H2();
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.i();
        } else {
            this.H4.l();
        }
        super.m0();
    }

    protected boolean m2(String str) {
        if (str.startsWith("OMX.google")) {
            int i10 = 6 >> 0;
            return false;
        }
        synchronized (k.class) {
            try {
                if (!E5) {
                    F5 = q2();
                    E5 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return F5;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v, androidx.media3.exoplayer.i
    protected void n0(androidx.media3.common.w[] wVarArr, long j10, long j11, t0.b bVar) throws s0 {
        super.n0(wVarArr, j10, j11, bVar);
        if (this.f66358m5 == -9223372036854775807L) {
            this.f66358m5 = j10;
        }
        n3(bVar);
    }

    @w0(35)
    protected void n2(androidx.media3.exoplayer.mediacodec.q qVar) {
        qVar.l();
    }

    protected void o3(long j10) {
        this.f64176f4.a(j10);
        this.f66348c5 += j10;
        this.f66349d5++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @androidx.annotation.i
    protected boolean p1(androidx.media3.common.w wVar) throws s0 {
        m0 m0Var = this.P4;
        if (m0Var == null || m0Var.Z()) {
            return true;
        }
        try {
            return this.P4.l(wVar);
        } catch (m0.d e10) {
            throw S(e10, wVar, 7000);
        }
    }

    protected void p2(androidx.media3.exoplayer.mediacodec.q qVar, int i10, long j10) {
        z0.a("dropVideoBuffer");
        qVar.h(i10, false);
        z0.b();
        l3(0, 1);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void q1(Exception exc) {
        androidx.media3.common.util.z.e(f66337r5, "Video codec error", exc);
        this.E4.s(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void r1(String str, androidx.media3.exoplayer.mediacodec.q.a aVar, long j10, long j11) {
        this.E4.k(str, j10, j11);
        this.N4 = m2(str);
        this.O4 = ((androidx.media3.exoplayer.mediacodec.t) androidx.media3.common.util.a.g(Q0())).r();
        M2();
    }

    protected long r2() {
        return -this.f66358m5;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void s1(String str) {
        this.E4.l(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @p0
    protected androidx.media3.exoplayer.k t1(p3 p3Var) throws s0 {
        androidx.media3.exoplayer.k kVarT1 = super.t1(p3Var);
        this.E4.p((androidx.media3.common.w) androidx.media3.common.util.a.g(p3Var.f64600b), kVarT1);
        return kVarT1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void u1(androidx.media3.common.w wVar, @p0 MediaFormat mediaFormat) {
        int integer;
        int i10;
        androidx.media3.exoplayer.mediacodec.q qVarO0 = O0();
        if (qVarO0 != null) {
            qVarO0.b(this.W4);
        }
        if (this.f66354i5) {
            i10 = wVar.f61768v;
            integer = wVar.f61769w;
        } else {
            androidx.media3.common.util.a.g(mediaFormat);
            boolean z10 = mediaFormat.containsKey(f66339t5) && mediaFormat.containsKey(f66338s5) && mediaFormat.containsKey(f66340u5) && mediaFormat.containsKey(f66341v5);
            int integer2 = z10 ? (mediaFormat.getInteger(f66339t5) - mediaFormat.getInteger(f66338s5)) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger(f66340u5) - mediaFormat.getInteger(f66341v5)) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = wVar.f61772z;
        int i11 = wVar.f61771y;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f66351f5 = new n4(i10, integer, f10);
        m0 m0Var = this.P4;
        if (m0Var == null || !this.f66360o5) {
            this.H4.p(wVar.f61770x);
        } else {
            l2(m0Var, 1, wVar.b().B0(i10).d0(integer).q0(f10).N());
        }
        this.f66360o5 = false;
    }

    protected e u2(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar, androidx.media3.common.w[] wVarArr) {
        int iS2;
        int iMax = wVar.f61768v;
        int iMax2 = wVar.f61769w;
        int iW2 = w2(tVar, wVar);
        if (wVarArr.length == 1) {
            if (iW2 != -1 && (iS2 = s2(tVar, wVar)) != -1) {
                iW2 = Math.min((int) (iW2 * f66343x5), iS2);
            }
            return new e(iMax, iMax2, iW2);
        }
        int length = wVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            androidx.media3.common.w wVarN = wVarArr[i10];
            if (wVar.C != null && wVarN.C == null) {
                wVarN = wVarN.b().T(wVar.C).N();
            }
            if (tVar.e(wVar, wVarN).f63950d != 0) {
                int i11 = wVarN.f61768v;
                z10 |= i11 == -1 || wVarN.f61769w == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, wVarN.f61769w);
                iW2 = Math.max(iW2, w2(tVar, wVarN));
            }
        }
        if (z10) {
            androidx.media3.common.util.z.n(f66337r5, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointT2 = t2(tVar, wVar);
            if (pointT2 != null) {
                iMax = Math.max(iMax, pointT2.x);
                iMax2 = Math.max(iMax2, pointT2.y);
                iW2 = Math.max(iW2, s2(tVar, wVar.b().B0(iMax).d0(iMax2).N()));
                androidx.media3.common.util.z.n(f66337r5, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new e(iMax, iMax2, iW2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected androidx.media3.exoplayer.k v0(androidx.media3.exoplayer.mediacodec.t tVar, androidx.media3.common.w wVar, androidx.media3.common.w wVar2) {
        androidx.media3.exoplayer.k kVarE = tVar.e(wVar, wVar2);
        int i10 = kVarE.f63951e;
        e eVar = (e) androidx.media3.common.util.a.g(this.M4);
        if (wVar2.f61768v > eVar.f66381a || wVar2.f61769w > eVar.f66382b) {
            i10 |= 256;
        }
        if (w2(tVar, wVar2) > eVar.f66383c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new androidx.media3.exoplayer.k(tVar.f64139a, wVar, wVar2, i11 != 0 ? 0 : kVarE.f63950d, i11);
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @androidx.annotation.i
    protected void w1(long j10) {
        super.w1(j10);
        if (this.f66354i5) {
            return;
        }
        this.f66347b5--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void x1() {
        super.x1();
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.h();
            this.P4.s(a1(), r2());
        } else {
            this.H4.j();
        }
        this.f66360o5 = true;
        M2();
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    @androidx.annotation.i
    protected void y1(androidx.media3.decoder.g gVar) throws s0 {
        ByteBuffer byteBuffer;
        if (this.J4 != null && ((androidx.media3.exoplayer.mediacodec.t) androidx.media3.common.util.a.g(Q0())).f64140b.equals("video/av01") && (byteBuffer = gVar.f62700d) != null) {
            this.J4.b(byteBuffer);
        }
        this.f66362q5 = 0;
        boolean z10 = this.f66354i5;
        if (!z10) {
            this.f66347b5++;
        }
        if (k1.f61540a < 23 && z10) {
            P2(gVar.f62702f);
        }
    }

    @e.a({"InlinedApi"})
    protected MediaFormat y2(androidx.media3.common.w wVar, String str, e eVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> pairL;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", wVar.f61768v);
        mediaFormat.setInteger("height", wVar.f61769w);
        androidx.media3.common.util.c0.y(mediaFormat, wVar.f61764r);
        androidx.media3.common.util.c0.s(mediaFormat, "frame-rate", wVar.f61770x);
        androidx.media3.common.util.c0.t(mediaFormat, "rotation-degrees", wVar.f61771y);
        androidx.media3.common.util.c0.r(mediaFormat, wVar.C);
        if ("video/dolby-vision".equals(wVar.f61761o) && (pairL = androidx.media3.exoplayer.mediacodec.f0.l(wVar)) != null) {
            androidx.media3.common.util.c0.t(mediaFormat, "profile", ((Integer) pairL.first).intValue());
        }
        mediaFormat.setInteger("max-width", eVar.f66381a);
        mediaFormat.setInteger("max-height", eVar.f66382b);
        androidx.media3.common.util.c0.t(mediaFormat, "max-input-size", eVar.f66383c);
        int i11 = k1.f61540a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f66353h5));
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.v
    protected void z1(z4.c cVar) {
        m0 m0Var = this.P4;
        if (m0Var != null) {
            m0Var.t(cVar);
        }
    }

    @p0
    protected Surface z2() {
        return this.S4;
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.z zVar, long j10) {
        this(new d(context).w(zVar).p(j10));
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.z zVar, long j10, @p0 Handler handler, @p0 l0 l0Var, int i10) {
        this(new d(context).w(zVar).p(j10).t(handler).u(l0Var).v(i10));
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.z zVar, long j10, boolean z10, @p0 Handler handler, @p0 l0 l0Var, int i10) {
        this(new d(context).w(zVar).p(j10).s(z10).t(handler).u(l0Var).v(i10));
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.q.b bVar, androidx.media3.exoplayer.mediacodec.z zVar, long j10, boolean z10, @p0 Handler handler, @p0 l0 l0Var, int i10) {
        this(new d(context).w(zVar).r(bVar).p(j10).s(z10).t(handler).u(l0Var).v(i10));
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.q.b bVar, androidx.media3.exoplayer.mediacodec.z zVar, long j10, boolean z10, @p0 Handler handler, @p0 l0 l0Var, int i10, float f10) {
        this(new d(context).w(zVar).r(bVar).p(j10).s(z10).t(handler).u(l0Var).v(i10).q(f10));
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.q.b bVar, androidx.media3.exoplayer.mediacodec.z zVar, long j10, boolean z10, @p0 Handler handler, @p0 l0 l0Var, int i10, float f10, @p0 n0 n0Var) {
        this(new d(context).w(zVar).r(bVar).p(j10).s(z10).t(handler).u(l0Var).v(i10).q(f10).x(n0Var == null ? null : n0Var.g(0)));
    }

    @Deprecated
    public k(Context context, androidx.media3.exoplayer.mediacodec.q.b bVar, androidx.media3.exoplayer.mediacodec.z zVar, long j10, boolean z10, @p0 Handler handler, @p0 l0 l0Var, int i10, float f10, @p0 m0 m0Var) {
        this(new d(context).w(zVar).r(bVar).p(j10).s(z10).t(handler).u(l0Var).v(i10).q(f10).x(m0Var));
    }

    protected k(d dVar) {
        super(2, dVar.f66371d, dVar.f66370c, dVar.f66373f, dVar.f66377j);
        Context applicationContext = dVar.f66368a.getApplicationContext();
        this.C4 = applicationContext;
        this.F4 = dVar.f66376i;
        this.P4 = dVar.f66378k;
        this.E4 = new l0.a(dVar.f66374g, dVar.f66375h);
        this.D4 = this.P4 == null;
        this.H4 = new x(applicationContext, this, dVar.f66372e);
        this.I4 = new x.b();
        this.G4 = o2();
        this.U4 = r0.f61638c;
        this.W4 = 1;
        this.X4 = 0;
        this.f66351f5 = n4.f60993h;
        this.f66355j5 = 0;
        this.f66352g5 = null;
        this.f66353h5 = -1000;
        this.f66358m5 = -9223372036854775807L;
        this.f66359n5 = -9223372036854775807L;
        this.J4 = dVar.f66379l ? new androidx.media3.exoplayer.video.a() : null;
        this.L4 = new PriorityQueue<>();
        this.K4 = dVar.f66380m != -9223372036854775807L ? -dVar.f66380m : -9223372036854775807L;
    }
}
