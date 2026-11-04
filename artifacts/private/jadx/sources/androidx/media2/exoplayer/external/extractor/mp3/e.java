package androidx.media2.exoplayer.external.extractor.mp3;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.i;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.extractor.k;
import androidx.media2.exoplayer.external.extractor.l;
import androidx.media2.exoplayer.external.extractor.m;
import androidx.media2.exoplayer.external.extractor.n;
import androidx.media2.exoplayer.external.extractor.o;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.id3.MlltFrame;
import androidx.media2.exoplayer.external.util.x;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class e implements i {
    private static final int A = 1483304551;
    private static final int B = 1231971951;
    private static final int C = 1447187017;
    private static final int D = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f54261t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f54262u = 2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f54264w = 131072;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f54265x = 16384;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f54266y = 10;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f54267z = -128000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f54269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final x f54270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final o f54271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f54272h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f54273i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k f54274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s f54275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f54276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Metadata f54277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f54278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f54279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f54280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f54281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f54282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f54260s = c.f54258a;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final androidx.media2.exoplayer.external.metadata.id3.b.a f54263v = d.f54259a;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    interface b extends q {
        long d();

        long e(long position);
    }

    public e() {
        this(0);
    }

    private b d(j input) throws InterruptedException, IOException {
        int i10 = 1 >> 0;
        input.i(this.f54270f.f57720a, 0, 4);
        this.f54270f.Q(0);
        o.b(this.f54270f.l(), this.f54271g);
        return new androidx.media2.exoplayer.external.extractor.mp3.a(input.getLength(), input.getPosition(), this.f54271g);
    }

    private static int e(x frame, int xingBase) {
        if (frame.d() >= xingBase + 4) {
            frame.Q(xingBase);
            int iL = frame.l();
            if (iL == A || iL == B) {
                return iL;
            }
        }
        if (frame.d() >= 40) {
            frame.Q(36);
            if (frame.l() == C) {
                return C;
            }
        }
        return 0;
    }

    private static boolean g(int headerA, long headerB) {
        return ((long) (headerA & f54267z)) == (headerB & (-128000));
    }

    static final /* synthetic */ i[] h() {
        int i10 = 3 & 0;
        return new i[]{new e()};
    }

    static final /* synthetic */ boolean i(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        return i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2);
    }

    @p0
    private static androidx.media2.exoplayer.external.extractor.mp3.b j(Metadata metadata, long firstFramePosition) {
        if (metadata != null) {
            int iE = metadata.e();
            for (int i10 = 0; i10 < iE; i10++) {
                Metadata.Entry entryC = metadata.c(i10);
                if (entryC instanceof MlltFrame) {
                    return androidx.media2.exoplayer.external.extractor.mp3.b.a(firstFramePosition, (MlltFrame) entryC);
                }
            }
        }
        return null;
    }

    private b k(j input) throws InterruptedException, IOException {
        x xVar = new x(this.f54271g.f54569c);
        input.i(xVar.f57720a, 0, this.f54271g.f54569c);
        o oVar = this.f54271g;
        int i10 = 21;
        if ((oVar.f54567a & 1) != 0) {
            if (oVar.f54571e != 1) {
                i10 = 36;
            }
        } else if (oVar.f54571e == 1) {
            i10 = 13;
        }
        int i11 = i10;
        int iE = e(xVar, i11);
        if (iE != A && iE != B) {
            if (iE != C) {
                input.l();
                return null;
            }
            f fVarA = f.a(input.getLength(), input.getPosition(), this.f54271g, xVar);
            input.o(this.f54271g.f54569c);
            return fVarA;
        }
        g gVarA = g.a(input.getLength(), input.getPosition(), this.f54271g, xVar);
        if (gVarA != null && !this.f54272h.a()) {
            input.l();
            input.n(i11 + androidx.media2.widget.f.i.f59775g0);
            input.i(this.f54270f.f57720a, 0, 3);
            this.f54270f.Q(0);
            this.f54272h.d(this.f54270f.G());
        }
        input.o(this.f54271g.f54569c);
        return (gVarA == null || gVarA.S1() || iE != B) ? gVarA : d(input);
    }

    private boolean l(j extractorInput) throws InterruptedException, IOException {
        b bVar = this.f54278n;
        if (bVar != null) {
            long jD = bVar.d();
            if (jD != -1 && extractorInput.m() > jD - 4) {
                return true;
            }
        }
        try {
            return !extractorInput.k(this.f54270f.f57720a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int m(j extractorInput) throws InterruptedException, IOException {
        if (this.f54282r == 0) {
            extractorInput.l();
            if (l(extractorInput)) {
                return -1;
            }
            this.f54270f.Q(0);
            int iL = this.f54270f.l();
            if (!g(iL, this.f54276l) || o.a(iL) == -1) {
                extractorInput.o(1);
                this.f54276l = 0;
                return 0;
            }
            o.b(iL, this.f54271g);
            if (this.f54279o == -9223372036854775807L) {
                this.f54279o = this.f54278n.e(extractorInput.getPosition());
                if (this.f54269e != -9223372036854775807L) {
                    this.f54279o += this.f54269e - this.f54278n.e(0L);
                }
            }
            this.f54282r = this.f54271g.f54569c;
        }
        int iA = this.f54275k.a(extractorInput, this.f54282r, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f54282r - iA;
        this.f54282r = i10;
        if (i10 > 0) {
            return 0;
        }
        long j10 = this.f54279o;
        long j11 = this.f54280p * 1000000;
        o oVar = this.f54271g;
        this.f54275k.b(j10 + (j11 / ((long) oVar.f54570d)), 1, oVar.f54569c, 0, null);
        this.f54280p += (long) this.f54271g.f54573g;
        this.f54282r = 0;
        return 0;
    }

    private boolean n(j input, boolean sniffing) throws Throwable {
        int iM;
        int i10;
        int iA;
        int i11 = sniffing ? 16384 : 131072;
        input.l();
        if (input.getPosition() == 0) {
            Metadata metadataA = this.f54273i.a(input, (this.f54268d & 2) == 0 ? null : f54263v);
            this.f54277m = metadataA;
            if (metadataA != null) {
                this.f54272h.c(metadataA);
            }
            iM = (int) input.m();
            if (!sniffing) {
                input.o(iM);
            }
            i10 = 0;
        } else {
            iM = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (l(input)) {
                if (i12 > 0) {
                    break;
                }
                throw new EOFException();
            }
            this.f54270f.Q(0);
            int iL = this.f54270f.l();
            if ((i10 == 0 || g(iL, i10)) && (iA = o.a(iL)) != -1) {
                i12++;
                if (i12 != 1) {
                    if (i12 == 4) {
                        break;
                    }
                } else {
                    o.b(iL, this.f54271g);
                    i10 = iL;
                }
                input.n(iA - 4);
            } else {
                int i14 = i13 + 1;
                if (i13 == i11) {
                    if (sniffing) {
                        return false;
                    }
                    throw new k0("Searched too many bytes.");
                }
                if (sniffing) {
                    input.l();
                    input.n(iM + i14);
                } else {
                    input.o(1);
                }
                i12 = 0;
                i13 = i14;
                i10 = 0;
            }
        }
        if (sniffing) {
            input.o(iM + i13);
        } else {
            input.l();
        }
        this.f54276l = i10;
        return true;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f54276l = 0;
        this.f54279o = -9223372036854775807L;
        this.f54280p = 0L;
        this.f54282r = 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(j input) throws InterruptedException, IOException {
        return n(input, true);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(k output) {
        this.f54274j = output;
        this.f54275k = output.a(0, 1);
        this.f54274j.l();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(j input, p seekPosition) throws Throwable {
        if (this.f54276l == 0) {
            try {
                n(input, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f54278n == null) {
            b bVarK = k(input);
            androidx.media2.exoplayer.external.extractor.mp3.b bVarJ = j(this.f54277m, input.getPosition());
            if (bVarJ != null) {
                this.f54278n = bVarJ;
            } else if (bVarK != null) {
                this.f54278n = bVarK;
            }
            b bVar = this.f54278n;
            if (bVar == null || (!bVar.S1() && (this.f54268d & 1) != 0)) {
                this.f54278n = d(input);
            }
            this.f54274j.q(this.f54278n);
            s sVar = this.f54275k;
            o oVar = this.f54271g;
            String str = oVar.f54568b;
            int i10 = oVar.f54571e;
            int i11 = oVar.f54570d;
            m mVar = this.f54272h;
            sVar.c(Format.q(null, str, null, -1, 4096, i10, i11, -1, mVar.f54081a, mVar.f54082b, null, null, 0, null, (this.f54268d & 2) != 0 ? null : this.f54277m));
            this.f54281q = input.getPosition();
        } else if (this.f54281q != 0) {
            long position = input.getPosition();
            long j10 = this.f54281q;
            if (position < j10) {
                input.o((int) (j10 - position));
            }
        }
        return m(input);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public e(int flags) {
        this(flags, -9223372036854775807L);
    }

    public e(int flags, long forcedFirstSampleTimestampUs) {
        this.f54268d = flags;
        this.f54269e = forcedFirstSampleTimestampUs;
        this.f54270f = new x(10);
        this.f54271g = new o();
        this.f54272h = new m();
        this.f54279o = -9223372036854775807L;
        this.f54273i = new n();
    }
}
