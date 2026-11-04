package androidx.media2.exoplayer.external.extractor.ts;

import android.util.Pair;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class n implements m {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f54917q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f54918r = 179;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f54919s = 181;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54920t = 184;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54921u = 178;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final double[] f54922v = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.media2.exoplayer.external.extractor.s f54924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f54925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f54926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0 f54927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.util.x f54928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean[] f54929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f54930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t f54931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f54932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f54933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f54935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f54936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f54937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f54938p;

    private static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final byte[] f54939e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f54940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54941b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f54943d;

        public a(int initialCapacity) {
            this.f54943d = new byte[initialCapacity];
        }

        public void a(byte[] newData, int offset, int limit) {
            if (this.f54940a) {
                int i10 = limit - offset;
                byte[] bArr = this.f54943d;
                int length = bArr.length;
                int i11 = this.f54941b;
                if (length < i11 + i10) {
                    this.f54943d = Arrays.copyOf(bArr, (i11 + i10) * 2);
                }
                System.arraycopy(newData, offset, this.f54943d, this.f54941b, i10);
                this.f54941b += i10;
            }
        }

        public boolean b(int startCodeValue, int bytesAlreadyPassed) {
            if (this.f54940a) {
                int i10 = this.f54941b - bytesAlreadyPassed;
                this.f54941b = i10;
                if (this.f54942c != 0 || startCodeValue != n.f54919s) {
                    this.f54940a = false;
                    return true;
                }
                this.f54942c = i10;
            } else if (startCodeValue == n.f54918r) {
                this.f54940a = true;
            }
            byte[] bArr = f54939e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.f54940a = false;
            this.f54941b = 0;
            this.f54942c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x006c  */
    /* JADX WARN: Code duplicated, block: B:19:0x007b  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    private static Pair<Format, Long> b(a csdBuffer, String formatId) {
        float f10;
        int i10;
        float f11;
        int i11;
        long j10;
        double[] dArr;
        double d10;
        int i12;
        int i13;
        byte[] bArrCopyOf = Arrays.copyOf(csdBuffer.f54943d, csdBuffer.f54941b);
        int i14 = bArrCopyOf[4] & 255;
        byte b10 = bArrCopyOf[5];
        int i15 = (i14 << 4) | ((b10 & 255) >> 4);
        int i16 = ((b10 & com.google.common.base.c.f116464q) << 8) | (bArrCopyOf[6] & 255);
        int i17 = (bArrCopyOf[7] & 240) >> 4;
        if (i17 == 2) {
            f10 = i16 * 4;
            i10 = i15 * 3;
        } else {
            if (i17 != 3) {
                if (i17 != 4) {
                    f11 = 1.0f;
                } else {
                    f10 = i16 * 121;
                    i10 = i15 * 100;
                }
                Format formatH = Format.H(formatId, "video/mpeg2", null, -1, -1, i15, i16, -1.0f, Collections.singletonList(bArrCopyOf), -1, f11, null);
                i11 = (bArrCopyOf[7] & com.google.common.base.c.f116464q) - 1;
                if (i11 >= 0) {
                    dArr = f54922v;
                    if (i11 < dArr.length) {
                        d10 = dArr[i11];
                        byte b11 = bArrCopyOf[csdBuffer.f54942c + 9];
                        i12 = (b11 & 96) >> 5;
                        i13 = b11 & com.google.common.base.c.I;
                        if (i12 != i13) {
                            d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                        }
                        j10 = (long) (1000000.0d / d10);
                    } else {
                        j10 = 0;
                    }
                } else {
                    j10 = 0;
                }
                return Pair.create(formatH, Long.valueOf(j10));
            }
            f10 = i16 * 16;
            i10 = i15 * 9;
        }
        f11 = f10 / i10;
        Format formatH2 = Format.H(formatId, "video/mpeg2", null, -1, -1, i15, i16, -1.0f, Collections.singletonList(bArrCopyOf), -1, f11, null);
        i11 = (bArrCopyOf[7] & com.google.common.base.c.f116464q) - 1;
        if (i11 >= 0) {
            dArr = f54922v;
            if (i11 < dArr.length) {
                d10 = dArr[i11];
                byte b12 = bArrCopyOf[csdBuffer.f54942c + 9];
                i12 = (b12 & 96) >> 5;
                i13 = b12 & com.google.common.base.c.I;
                if (i12 != i13) {
                    d10 *= (((double) i12) + 1.0d) / ((double) (i13 + 1));
                }
                j10 = (long) (1000000.0d / d10);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
        }
        return Pair.create(formatH2, Long.valueOf(j10));
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void a() {
        androidx.media2.exoplayer.external.util.t.a(this.f54929g);
        this.f54930h.c();
        if (this.f54927e != null) {
            this.f54931i.d();
        }
        this.f54932j = 0L;
        this.f54933k = false;
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void c(long pesTimeUs, int flags) {
        this.f54934l = pesTimeUs;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void d(androidx.media2.exoplayer.external.util.x xVar) {
        int i10;
        int iC = xVar.c();
        int iD = xVar.d();
        byte[] bArr = xVar.f57720a;
        this.f54932j += (long) xVar.a();
        this.f54924b.d(xVar, xVar.a());
        while (true) {
            int iC2 = androidx.media2.exoplayer.external.util.t.c(bArr, iC, iD, this.f54929g);
            if (iC2 == iD) {
                break;
            }
            int i11 = iC2 + 3;
            int i12 = xVar.f57720a[i11] & 255;
            int i13 = iC2 - iC;
            if (!this.f54925c) {
                if (i13 > 0) {
                    this.f54930h.a(bArr, iC, iC2);
                }
                if (this.f54930h.b(i12, i13 < 0 ? -i13 : 0)) {
                    Pair<Format, Long> pairB = b(this.f54930h, this.f54923a);
                    this.f54924b.c((Format) pairB.first);
                    this.f54926d = ((Long) pairB.second).longValue();
                    this.f54925c = true;
                }
            }
            if (this.f54927e != null) {
                if (i13 > 0) {
                    this.f54931i.a(bArr, iC, iC2);
                    i10 = 0;
                } else {
                    i10 = -i13;
                }
                if (this.f54931i.b(i10)) {
                    t tVar = this.f54931i;
                    this.f54928f.O(this.f54931i.f55092d, androidx.media2.exoplayer.external.util.t.k(tVar.f55092d, tVar.f55093e));
                    this.f54927e.a(this.f54936n, this.f54928f);
                }
                if (i12 == f54921u && xVar.f57720a[iC2 + 2] == 1) {
                    this.f54931i.e(i12);
                }
            }
            if (i12 == 0 || i12 == f54918r) {
                int i14 = iD - iC2;
                if (this.f54933k && this.f54938p && this.f54925c) {
                    this.f54924b.b(this.f54936n, this.f54937o ? 1 : 0, ((int) (this.f54932j - this.f54935m)) - i14, i14, null);
                }
                boolean z10 = this.f54933k;
                if (!z10 || this.f54938p) {
                    this.f54935m = this.f54932j - ((long) i14);
                    long j10 = this.f54934l;
                    if (j10 == -9223372036854775807L) {
                        j10 = z10 ? this.f54936n + this.f54926d : 0L;
                    }
                    this.f54936n = j10;
                    this.f54937o = false;
                    this.f54934l = -9223372036854775807L;
                    this.f54933k = true;
                }
                this.f54938p = i12 == 0;
            } else if (i12 == f54920t) {
                this.f54937o = true;
            }
            iC = i11;
        }
        if (!this.f54925c) {
            this.f54930h.a(bArr, iC, iD);
        }
        if (this.f54927e != null) {
            this.f54931i.a(bArr, iC, iD);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void e(androidx.media2.exoplayer.external.extractor.k extractorOutput, h0.e idGenerator) {
        idGenerator.a();
        this.f54923a = idGenerator.b();
        this.f54924b = extractorOutput.a(idGenerator.c(), 2);
        j0 j0Var = this.f54927e;
        if (j0Var != null) {
            j0Var.b(extractorOutput, idGenerator);
        }
    }

    @Override // androidx.media2.exoplayer.external.extractor.ts.m
    public void f() {
    }

    n(j0 userDataReader) {
        this.f54927e = userDataReader;
        this.f54929g = new boolean[4];
        this.f54930h = new a(128);
        if (userDataReader != null) {
            this.f54931i = new t(f54921u, 128);
            this.f54928f = new androidx.media2.exoplayer.external.util.x();
        } else {
            this.f54931i = null;
            this.f54928f = null;
        }
    }
}
