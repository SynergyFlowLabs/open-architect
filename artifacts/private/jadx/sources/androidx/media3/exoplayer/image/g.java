package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.z0;
import androidx.media3.common.w;
import androidx.media3.common.x0;
import androidx.media3.exoplayer.a5;
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.p3;
import androidx.media3.exoplayer.s0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class g extends i {

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final String f63881r3 = "ImageRenderer";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final int f63882s3 = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final int f63883t3 = 2;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f63884u3 = 3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final long f63885v3 = 30000;
    private long H1;
    private final ArrayDeque<a> X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f63886g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @p0
    private w f63887h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private d f63888i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @p0
    private androidx.media3.decoder.g f63889j3;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private ImageOutput f63890k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @p0
    private Bitmap f63891l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private boolean f63892m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    @p0
    private b f63893n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @p0
    private b f63894o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private a f63895p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private long f63896p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f63897p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private int f63898p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f63899q3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final d.a f63900v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final androidx.media3.decoder.g f63901w;

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f63902c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f63903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f63904b;

        public a(long j10, long j11) {
            this.f63903a = j10;
            this.f63904b = j11;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f63905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f63906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f63907c;

        public b(int i10, long j10) {
            this.f63905a = i10;
            this.f63906b = j10;
        }

        public long a() {
            return this.f63906b;
        }

        @p0
        public Bitmap b() {
            return this.f63907c;
        }

        public int c() {
            return this.f63905a;
        }

        public boolean d() {
            return this.f63907c != null;
        }

        public void e(Bitmap bitmap) {
            this.f63907c = bitmap;
        }
    }

    public g(d.a aVar, @p0 ImageOutput imageOutput) {
        super(4);
        this.f63900v = aVar;
        this.f63890k3 = w0(imageOutput);
        this.f63901w = androidx.media3.decoder.g.L();
        this.f63895p0 = a.f63902c;
        this.X = new ArrayDeque<>();
        this.H1 = -9223372036854775807L;
        this.f63896p1 = -9223372036854775807L;
        int i10 = 3 & 0;
        this.f63897p2 = 0;
        this.f63886g3 = 1;
    }

    private boolean A0() throws s0 {
        if (!B0()) {
            return false;
        }
        if (!this.f63899q3) {
            return true;
        }
        if (!s0((w) androidx.media3.common.util.a.g(this.f63887h3))) {
            throw S(new e("Provided decoder factory can't create decoder for format."), this.f63887h3, x0.f61842t3);
        }
        d dVar = this.f63888i3;
        if (dVar != null) {
            dVar.release();
        }
        this.f63888i3 = this.f63900v.a();
        this.f63899q3 = false;
        return true;
    }

    private void C0(long j10) {
        this.f63896p1 = j10;
        while (!this.X.isEmpty() && j10 >= this.X.peek().f63903a) {
            this.f63895p0 = this.X.removeFirst();
        }
    }

    private void E0() {
        this.f63889j3 = null;
        this.f63897p2 = 0;
        this.H1 = -9223372036854775807L;
        d dVar = this.f63888i3;
        if (dVar != null) {
            dVar.release();
            this.f63888i3 = null;
        }
    }

    private void F0(@p0 ImageOutput imageOutput) {
        this.f63890k3 = w0(imageOutput);
    }

    private boolean G0() {
        boolean z10 = getState() == 2;
        int i10 = this.f63886g3;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean s0(w wVar) {
        int iB = this.f63900v.b(wVar);
        return iB == a5.M(4) || iB == a5.M(3);
    }

    private Bitmap t0(int i10) {
        androidx.media3.common.util.a.k(this.f63891l3);
        int width = this.f63891l3.getWidth() / ((w) androidx.media3.common.util.a.k(this.f63887h3)).L;
        int height = this.f63891l3.getHeight() / ((w) androidx.media3.common.util.a.k(this.f63887h3)).M;
        int i11 = this.f63887h3.L;
        return Bitmap.createBitmap(this.f63891l3, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean u0(long j10, long j11) throws s0, e {
        if (this.f63891l3 != null && this.f63893n3 == null) {
            return false;
        }
        if (this.f63886g3 == 0 && getState() != 2) {
            return false;
        }
        if (this.f63891l3 == null) {
            androidx.media3.common.util.a.k(this.f63888i3);
            f fVarA = this.f63888i3.a();
            if (fVarA == null) {
                return false;
            }
            if (((f) androidx.media3.common.util.a.k(fVarA)).s()) {
                if (this.f63897p2 == 3) {
                    E0();
                    androidx.media3.common.util.a.k(this.f63887h3);
                    A0();
                } else {
                    ((f) androidx.media3.common.util.a.k(fVarA)).D();
                    if (this.X.isEmpty()) {
                        this.Z = true;
                    }
                }
                return false;
            }
            androidx.media3.common.util.a.l(fVarA.f63880e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f63891l3 = fVarA.f63880e;
            ((f) androidx.media3.common.util.a.k(fVarA)).D();
        }
        if (!this.f63892m3 || this.f63891l3 == null || this.f63893n3 == null) {
            return false;
        }
        androidx.media3.common.util.a.k(this.f63887h3);
        w wVar = this.f63887h3;
        int i10 = wVar.L;
        boolean z10 = ((i10 == 1 && wVar.M == 1) || i10 == -1 || wVar.M == -1) ? false : true;
        if (!this.f63893n3.d()) {
            b bVar = this.f63893n3;
            bVar.e(z10 ? t0(bVar.c()) : (Bitmap) androidx.media3.common.util.a.k(this.f63891l3));
        }
        if (!D0(j10, j11, (Bitmap) androidx.media3.common.util.a.k(this.f63893n3.b()), this.f63893n3.a())) {
            return false;
        }
        C0(((b) androidx.media3.common.util.a.k(this.f63893n3)).a());
        this.f63886g3 = 3;
        if (!z10 || ((b) androidx.media3.common.util.a.k(this.f63893n3)).c() == (((w) androidx.media3.common.util.a.k(this.f63887h3)).M * ((w) androidx.media3.common.util.a.k(this.f63887h3)).L) - 1) {
            this.f63891l3 = null;
        }
        this.f63893n3 = this.f63894o3;
        this.f63894o3 = null;
        return true;
    }

    private boolean v0(long j10) throws androidx.media3.decoder.f {
        if (this.f63892m3 && this.f63893n3 != null) {
            return false;
        }
        p3 p3VarW = W();
        d dVar = this.f63888i3;
        if (dVar == null || this.f63897p2 == 3 || this.Y) {
            return false;
        }
        if (this.f63889j3 == null) {
            androidx.media3.decoder.g gVarC = dVar.c();
            this.f63889j3 = gVarC;
            if (gVarC == null) {
                return false;
            }
        }
        if (this.f63897p2 == 2) {
            androidx.media3.common.util.a.k(this.f63889j3);
            this.f63889j3.z(4);
            ((d) androidx.media3.common.util.a.k(this.f63888i3)).b(this.f63889j3);
            this.f63889j3 = null;
            this.f63897p2 = 3;
            return false;
        }
        int iP0 = p0(p3VarW, this.f63889j3, 0);
        if (iP0 == -5) {
            this.f63887h3 = (w) androidx.media3.common.util.a.k(p3VarW.f64600b);
            this.f63899q3 = true;
            this.f63897p2 = 2;
            return true;
        }
        if (iP0 != -4) {
            if (iP0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.f63889j3.H();
        ByteBuffer byteBuffer = this.f63889j3.f62700d;
        boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((androidx.media3.decoder.g) androidx.media3.common.util.a.k(this.f63889j3)).s();
        if (z10) {
            ((d) androidx.media3.common.util.a.k(this.f63888i3)).b((androidx.media3.decoder.g) androidx.media3.common.util.a.k(this.f63889j3));
            this.f63898p3 = 0;
        }
        z0(j10, (androidx.media3.decoder.g) androidx.media3.common.util.a.k(this.f63889j3));
        if (((androidx.media3.decoder.g) androidx.media3.common.util.a.k(this.f63889j3)).s()) {
            this.Y = true;
            this.f63889j3 = null;
            return false;
        }
        this.H1 = Math.max(this.H1, ((androidx.media3.decoder.g) androidx.media3.common.util.a.k(this.f63889j3)).f62702f);
        if (z10) {
            this.f63889j3 = null;
        } else {
            ((androidx.media3.decoder.g) androidx.media3.common.util.a.k(this.f63889j3)).o();
        }
        return !this.f63892m3;
    }

    private static ImageOutput w0(@p0 ImageOutput imageOutput) {
        if (imageOutput == null) {
            imageOutput = ImageOutput.f63866a;
        }
        return imageOutput;
    }

    private boolean x0(b bVar) {
        return ((w) androidx.media3.common.util.a.k(this.f63887h3)).L == -1 || this.f63887h3.M == -1 || bVar.c() == (((w) androidx.media3.common.util.a.k(this.f63887h3)).M * this.f63887h3.L) - 1;
    }

    private void y0(int i10) {
        this.f63886g3 = Math.min(this.f63886g3, i10);
    }

    private void z0(long j10, androidx.media3.decoder.g gVar) {
        boolean z10 = true;
        if (gVar.s()) {
            this.f63892m3 = true;
            return;
        }
        b bVar = new b(this.f63898p3, gVar.f62702f);
        this.f63894o3 = bVar;
        this.f63898p3++;
        if (!this.f63892m3) {
            long jA = bVar.a();
            boolean z11 = jA - 30000 <= j10 && j10 <= 30000 + jA;
            b bVar2 = this.f63893n3;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < jA;
            boolean zX0 = x0((b) androidx.media3.common.util.a.k(this.f63894o3));
            if (!z11 && !z12 && !zX0) {
                z10 = false;
            }
            this.f63892m3 = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.f63893n3 = this.f63894o3;
        this.f63894o3 = null;
    }

    protected boolean B0() throws s0 {
        return true;
    }

    protected boolean D0(long j10, long j11, Bitmap bitmap, long j12) throws s0 {
        long j13 = j12 - j10;
        if (!G0() && j13 >= 30000) {
            return false;
        }
        this.f63890k3.onImageAvailable(j12 - this.f63895p0.f63904b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean a() {
        return this.Z;
    }

    @Override // androidx.media3.exoplayer.a5
    public int b(w wVar) {
        return this.f63900v.b(wVar);
    }

    @Override // androidx.media3.exoplayer.i
    protected void e0() {
        this.f63887h3 = null;
        this.f63895p0 = a.f63902c;
        this.X.clear();
        E0();
        this.f63890k3.a();
    }

    @Override // androidx.media3.exoplayer.i
    protected void f0(boolean z10, boolean z11) throws s0 {
        this.f63886g3 = z11 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d A[LOOP:0: B:21:0x0056->B:23:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[LOOP:1: B:24:0x005e->B:26:0x0064, LOOP_END] */
    @Override // androidx.media3.exoplayer.z4
    public void g(long j10, long j11) throws s0 {
        if (!this.Z) {
            if (this.f63887h3 != null) {
                if (this.f63888i3 == null) {
                }
                z0.a("drainAndFeedDecoder");
                while (u0(j10, j11)) {
                }
                while (v0(j10)) {
                }
                z0.b();
            }
            p3 p3VarW = W();
            this.f63901w.o();
            int iP0 = p0(p3VarW, this.f63901w, 2);
            if (iP0 == -5) {
                this.f63887h3 = (w) androidx.media3.common.util.a.k(p3VarW.f64600b);
                this.f63899q3 = true;
                if (this.f63888i3 == null || A0()) {
                    try {
                        z0.a("drainAndFeedDecoder");
                        while (u0(j10, j11)) {
                        }
                        while (v0(j10)) {
                        }
                        z0.b();
                    } catch (e e10) {
                        throw S(e10, null, x0.f61838r3);
                    }
                }
            } else if (iP0 == -4) {
                androidx.media3.common.util.a.i(this.f63901w.s());
                this.Y = true;
                this.Z = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.z4, androidx.media3.exoplayer.a5
    public String getName() {
        return f63881r3;
    }

    @Override // androidx.media3.exoplayer.i
    protected void h0(long j10, boolean z10) throws s0 {
        y0(1);
        this.Z = false;
        this.Y = false;
        this.f63891l3 = null;
        this.f63893n3 = null;
        this.f63894o3 = null;
        this.f63892m3 = false;
        this.f63889j3 = null;
        d dVar = this.f63888i3;
        if (dVar != null) {
            dVar.flush();
        }
        this.X.clear();
    }

    @Override // androidx.media3.exoplayer.i, androidx.media3.exoplayer.w4.b
    public void i(int i10, @p0 Object obj) throws s0 {
        if (i10 != 15) {
            super.i(i10, obj);
        } else {
            F0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    @Override // androidx.media3.exoplayer.i
    protected void i0() {
        E0();
    }

    @Override // androidx.media3.exoplayer.z4
    public boolean isReady() {
        int i10 = this.f63886g3;
        return i10 == 3 || (i10 == 0 && this.f63892m3);
    }

    @Override // androidx.media3.exoplayer.i
    protected void k0() {
        E0();
        y0(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void n0(androidx.media3.common.w[] r6, long r7, long r9, androidx.media3.exoplayer.source.t0.b r11) throws androidx.media3.exoplayer.s0 {
        /*
            r5 = this;
            super.n0(r6, r7, r9, r11)
            r4 = 7
            androidx.media3.exoplayer.image.g$a r6 = r5.f63895p0
            long r6 = r6.f63904b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L3b
            java.util.ArrayDeque<androidx.media3.exoplayer.image.g$a> r6 = r5.X
            boolean r6 = r6.isEmpty()
            r4 = 7
            if (r6 == 0) goto L2e
            r4 = 4
            long r6 = r5.H1
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r4 = 6
            if (r8 == 0) goto L3b
            r4 = 6
            long r2 = r5.f63896p1
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L2e
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2e
            goto L3b
        L2e:
            java.util.ArrayDeque<androidx.media3.exoplayer.image.g$a> r6 = r5.X
            androidx.media3.exoplayer.image.g$a r7 = new androidx.media3.exoplayer.image.g$a
            long r0 = r5.H1
            r7.<init>(r0, r9)
            r6.add(r7)
            return
        L3b:
            androidx.media3.exoplayer.image.g$a r6 = new androidx.media3.exoplayer.image.g$a
            r6.<init>(r0, r9)
            r5.f63895p0 = r6
            r4 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.g.n0(androidx.media3.common.w[], long, long, androidx.media3.exoplayer.source.t0$b):void");
    }
}
