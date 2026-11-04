package androidx.media2.exoplayer.external.extractor.amr;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.extractor.d;
import androidx.media2.exoplayer.external.extractor.i;
import androidx.media2.exoplayer.external.extractor.j;
import androidx.media2.exoplayer.external.extractor.k;
import androidx.media2.exoplayer.external.extractor.l;
import androidx.media2.exoplayer.external.extractor.p;
import androidx.media2.exoplayer.external.extractor.q;
import androidx.media2.exoplayer.external.extractor.s;
import androidx.media2.exoplayer.external.k0;
import androidx.media2.exoplayer.external.util.q0;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements i {
    private static final int A = 16000;
    private static final int B = 8000;
    private static final int C = 20000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f53964t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int[] f53966v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f53969y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f53970z = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f53971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f53972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f53973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f53974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53976i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f53977j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f53978k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53979l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f53981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k f53982o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private s f53983p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private q f53984q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f53985r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f53963s = androidx.media2.exoplayer.external.extractor.amr.a.f53962a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int[] f53965u = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f53967w = q0.i0("#!AMR\n");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final byte[] f53968x = q0.i0("#!AMR-WB\n");

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f53966v = iArr;
        f53969y = iArr[8];
    }

    public b() {
        this(0);
    }

    static byte[] d() {
        byte[] bArr = f53967w;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static byte[] e() {
        byte[] bArr = f53968x;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static int g(int frameType) {
        return f53965u[frameType];
    }

    static int h(int frameType) {
        return f53966v[frameType];
    }

    private static int i(int frameSize, long durationUsPerFrame) {
        return (int) ((((long) (frameSize * 8)) * 1000000) / durationUsPerFrame);
    }

    private q j(long inputLength) {
        return new d(inputLength, this.f53978k, i(this.f53979l, 20000L), this.f53979l);
    }

    private int k(int frameType) throws k0 {
        if (m(frameType)) {
            return this.f53973f ? f53966v[frameType] : f53965u[frameType];
        }
        String str = this.f53973f ? "WB" : "NB";
        StringBuilder sb2 = new StringBuilder(str.length() + 35);
        sb2.append("Illegal AMR ");
        sb2.append(str);
        sb2.append(" frame type ");
        sb2.append(frameType);
        throw new k0(sb2.toString());
    }

    private boolean l(int frameType) {
        return !this.f53973f && (frameType < 12 || frameType > 14);
    }

    private boolean m(int frameType) {
        return frameType >= 0 && frameType <= 15 && (n(frameType) || l(frameType));
    }

    private boolean n(int frameType) {
        return this.f53973f && (frameType < 10 || frameType > 13);
    }

    static final /* synthetic */ i[] o() {
        return new i[]{new b()};
    }

    private void p() {
        if (this.f53985r) {
            return;
        }
        this.f53985r = true;
        boolean z10 = this.f53973f;
        this.f53983p.c(Format.r(null, z10 ? "audio/amr-wb" : "audio/3gpp", null, -1, f53969y, 1, z10 ? 16000 : 8000, -1, null, null, 0, null));
    }

    private void q(long inputLength, int sampleReadResult) {
        int i10;
        if (this.f53977j) {
            return;
        }
        if ((this.f53972e & 1) == 0 || inputLength == -1 || !((i10 = this.f53979l) == -1 || i10 == this.f53975h)) {
            q.b bVar = new q.b(-9223372036854775807L);
            this.f53984q = bVar;
            this.f53982o.q(bVar);
            this.f53977j = true;
            return;
        }
        if (this.f53980m >= 20 || sampleReadResult == -1) {
            q qVarJ = j(inputLength);
            this.f53984q = qVarJ;
            this.f53982o.q(qVarJ);
            this.f53977j = true;
        }
    }

    private boolean r(j input, byte[] amrSignature) throws InterruptedException, IOException {
        input.l();
        byte[] bArr = new byte[amrSignature.length];
        input.i(bArr, 0, amrSignature.length);
        return Arrays.equals(bArr, amrSignature);
    }

    private int s(j extractorInput) throws InterruptedException, IOException {
        extractorInput.l();
        extractorInput.i(this.f53971d, 0, 1);
        byte b10 = this.f53971d[0];
        if ((b10 & 131) <= 0) {
            return k((b10 >> 3) & 15);
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append((int) b10);
        throw new k0(sb2.toString());
    }

    private boolean t(j input) throws InterruptedException, IOException {
        byte[] bArr = f53967w;
        if (r(input, bArr)) {
            this.f53973f = false;
            input.o(bArr.length);
            return true;
        }
        byte[] bArr2 = f53968x;
        if (!r(input, bArr2)) {
            return false;
        }
        this.f53973f = true;
        input.o(bArr2.length);
        return true;
    }

    private int u(j extractorInput) throws InterruptedException, IOException {
        if (this.f53976i == 0) {
            try {
                int iS = s(extractorInput);
                this.f53975h = iS;
                this.f53976i = iS;
                if (this.f53979l == -1) {
                    this.f53978k = extractorInput.getPosition();
                    this.f53979l = this.f53975h;
                }
                if (this.f53979l == this.f53975h) {
                    this.f53980m++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f53983p.a(extractorInput, this.f53976i, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f53976i - iA;
        this.f53976i = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f53983p.b(this.f53981n + this.f53974g, 1, this.f53975h, 0, null);
        this.f53974g += 20000;
        return 0;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void a(long position, long timeUs) {
        this.f53974g = 0L;
        int i10 = 4 << 0;
        this.f53975h = 0;
        this.f53976i = 0;
        if (position != 0) {
            q qVar = this.f53984q;
            if (qVar instanceof d) {
                this.f53981n = ((d) qVar).b(position);
                return;
            }
        }
        this.f53981n = 0L;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public boolean b(j input) throws InterruptedException, IOException {
        return t(input);
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void c(k extractorOutput) {
        this.f53982o = extractorOutput;
        this.f53983p = extractorOutput.a(0, 1);
        extractorOutput.l();
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public int f(j input, p seekPosition) throws InterruptedException, IOException {
        if (input.getPosition() == 0 && !t(input)) {
            throw new k0("Could not find AMR header.");
        }
        p();
        int iU = u(input);
        q(input.getLength(), iU);
        return iU;
    }

    @Override // androidx.media2.exoplayer.external.extractor.i
    public void release() {
    }

    public b(int flags) {
        this.f53972e = flags;
        this.f53971d = new byte[1];
        this.f53979l = -1;
    }
}
