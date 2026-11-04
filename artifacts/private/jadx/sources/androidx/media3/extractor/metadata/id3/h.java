package androidx.media3.extractor.metadata.id3;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.n0;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.z;
import com.google.common.collect.l6;
import com.rabbitmq.client.k0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h extends androidx.media3.extractor.metadata.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f67554b = new a() { // from class: androidx.media3.extractor.metadata.id3.g
        @Override // androidx.media3.extractor.metadata.id3.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            return h.c(i10, i11, i12, i13, i14);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f67555c = "Id3Decoder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f67556d = 4801587;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f67557e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67558f = 128;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67559g = 64;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67560h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f67561i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67562j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67563k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f67564l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f67565m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67566n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f67567o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f67568p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f67569q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final a f67570a;

    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f67571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f67572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f67573c;

        public b(int i10, boolean z10, int i11) {
            this.f67571a = i10;
            this.f67572b = z10;
            this.f67573c = i11;
        }
    }

    public h() {
        this(null);
    }

    private static int A(o0 o0Var, int i10) {
        byte[] bArrE = o0Var.e();
        int iF = o0Var.f();
        int i11 = iF;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= iF + i10) {
                return i10;
            }
            if ((bArrE[i11] & 255) == 255 && bArrE[i12] == 0) {
                System.arraycopy(bArrE, i11 + 2, bArrE, i12, (i10 - (i11 - iF)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0081 A[PHI: r3
      0x0081: PHI (r3v17 int) = (r3v6 int), (r3v21 int) binds: [B:42:0x008e, B:33:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean B(o0 o0Var, int i10, int i11, boolean z10) {
        int iO;
        long jO;
        int iT;
        int i12;
        int iF = o0Var.f();
        while (true) {
            try {
                boolean z11 = true;
                if (o0Var.a() < i11) {
                    o0Var.a0(iF);
                    return true;
                }
                if (i10 >= 3) {
                    iO = o0Var.s();
                    jO = o0Var.N();
                    iT = o0Var.T();
                } else {
                    iO = o0Var.O();
                    jO = o0Var.O();
                    iT = 0;
                }
                if (iO == 0 && jO == 0 && iT == 0) {
                    o0Var.a0(iF);
                    return true;
                }
                if (i10 == 4 && !z10) {
                    if ((8421504 & jO) != 0) {
                        o0Var.a0(iF);
                        return false;
                    }
                    jO = (((jO >> 24) & 255) << 21) | (jO & 255) | (((jO >> 8) & 255) << 7) | (((jO >> 16) & 255) << 14);
                }
                if (i10 == 4) {
                    i12 = (iT & 64) != 0 ? 1 : 0;
                    if ((iT & 1) == 0) {
                        z11 = false;
                    }
                } else if (i10 == 3) {
                    i12 = (iT & 32) != 0 ? 1 : 0;
                    if ((iT & 128) == 0) {
                        z11 = false;
                    }
                } else {
                    i12 = 0;
                    z11 = false;
                }
                if (z11) {
                    i12 += 4;
                }
                if (jO < i12) {
                    o0Var.a0(iF);
                    return false;
                }
                if (o0Var.a() < jO) {
                    o0Var.a0(iF);
                    return false;
                }
                o0Var.b0((int) jO);
            } catch (Throwable th2) {
                o0Var.a0(iF);
                throw th2;
            }
        }
    }

    public static /* synthetic */ boolean c(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static byte[] d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? k1.f61545f : Arrays.copyOfRange(bArr, i10, i11);
    }

    private static androidx.media3.extractor.metadata.id3.a f(o0 o0Var, int i10, int i11) {
        int iZ;
        String str;
        int iL = o0Var.L();
        Charset charsetW = w(iL);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        o0Var.n(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + com.google.common.base.c.g(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            iZ = 2;
        } else {
            iZ = z(bArr, 0);
            String strG = com.google.common.base.c.g(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
            if (strG.indexOf(47) == -1) {
                str = "image/" + strG;
            } else {
                str = strG;
            }
        }
        int i13 = bArr[iZ + 1] & 255;
        int i14 = iZ + 2;
        int iY = y(bArr, i14, iL);
        return new androidx.media3.extractor.metadata.id3.a(str, new String(bArr, i14, iY - i14, charsetW), i13, d(bArr, iY + v(iL), i12));
    }

    private static androidx.media3.extractor.metadata.id3.b g(o0 o0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        o0Var.n(bArr, 0, i10);
        return new androidx.media3.extractor.metadata.id3.b(str, bArr);
    }

    private static c h(o0 o0Var, int i10, int i11, boolean z10, int i12, @p0 a aVar) throws Throwable {
        int iF = o0Var.f();
        int iZ = z(o0Var.e(), iF);
        String str = new String(o0Var.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        o0Var.a0(iZ + 1);
        int iS = o0Var.s();
        int iS2 = o0Var.s();
        long jN = o0Var.N();
        if (jN == k0.f265952a) {
            jN = -1;
        }
        long jN2 = o0Var.N();
        long j10 = jN2 == k0.f265952a ? -1L : jN2;
        ArrayList arrayList = new ArrayList();
        int i13 = iF + i10;
        while (o0Var.f() < i13) {
            i iVarK = k(i11, o0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new c(str, iS, iS2, jN, j10, (i[]) arrayList.toArray(new i[0]));
    }

    private static d i(o0 o0Var, int i10, int i11, boolean z10, int i12, @p0 a aVar) throws Throwable {
        int iF = o0Var.f();
        int iZ = z(o0Var.e(), iF);
        String str = new String(o0Var.e(), iF, iZ - iF, StandardCharsets.ISO_8859_1);
        o0Var.a0(iZ + 1);
        int iL = o0Var.L();
        boolean z11 = (iL & 2) != 0;
        boolean z12 = (iL & 1) != 0;
        int iL2 = o0Var.L();
        String[] strArr = new String[iL2];
        for (int i13 = 0; i13 < iL2; i13++) {
            int iF2 = o0Var.f();
            int iZ2 = z(o0Var.e(), iF2);
            strArr[i13] = new String(o0Var.e(), iF2, iZ2 - iF2, StandardCharsets.ISO_8859_1);
            o0Var.a0(iZ2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iF + i10;
        while (o0Var.f() < i14) {
            i iVarK = k(i11, o0Var, z10, i12, aVar);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new d(str, z11, z12, strArr, (i[]) arrayList.toArray(new i[0]));
    }

    @p0
    private static e j(o0 o0Var, int i10) {
        if (i10 < 4) {
            return null;
        }
        int iL = o0Var.L();
        Charset charsetW = w(iL);
        byte[] bArr = new byte[3];
        o0Var.n(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        o0Var.n(bArr2, 0, i11);
        int iY = y(bArr2, 0, iL);
        String str2 = new String(bArr2, 0, iY, charsetW);
        int iV = iY + v(iL);
        return new e(str, str2, p(bArr2, iV, y(bArr2, iV, iL), charsetW));
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0259  */
    /* JADX WARN: Instruction removed from duplicated block: B:184:0x0259, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.media3.extractor.metadata.id3.i] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [androidx.media3.common.util.o0] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [androidx.media3.common.util.o0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.media3.common.util.o0] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @p0
    private static i k(int i10, o0 o0Var, boolean z10, int i11, @p0 a aVar) throws Throwable {
        int iP;
        ?? r10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        ?? r11;
        Throwable th2;
        ?? r12;
        int i12;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? r16;
        i iVarG;
        int i13 = i10;
        o0 o0Var2 = o0Var;
        int iL = o0Var2.L();
        int iL2 = o0Var2.L();
        int iL3 = o0Var2.L();
        boolean z15 = false;
        int iL4 = i13 >= 3 ? o0Var2.L() : 0;
        if (i13 == 4) {
            iP = o0Var2.P();
            if (!z10) {
                iP = (((iP >> 24) & 255) << 21) | (iP & 255) | (((iP >> 8) & 255) << 7) | (((iP >> 16) & 255) << 14);
            }
        } else {
            iP = i13 == 3 ? o0Var2.P() : o0Var2.O();
        }
        int iA = iP;
        int iT = i13 >= 3 ? o0Var2.T() : 0;
        if (iL == 0 && iL2 == 0 && iL3 == 0 && iL4 == 0 && iA == 0 && iT == 0) {
            o0Var2.a0(o0Var2.g());
            return null;
        }
        int iF = o0Var2.f() + iA;
        if (iF > o0Var2.g()) {
            z.n(f67555c, "Frame size exceeds remaining tag data");
            o0Var2.a0(o0Var2.g());
            return null;
        }
        if (aVar != null) {
            boolean zA = aVar.a(i13, iL, iL2, iL3, iL4);
            r10 = iL;
            iA = iL2;
            if (!zA) {
                i13 = i13;
                o0Var2.a0(iF);
                return null;
            }
        } else {
            iA = iL2;
            r10 = iL;
        }
        i13 = i13;
        if (i13 == 3) {
            z11 = (iT & 128) != 0;
            z13 = (iT & 64) != 0;
            z12 = (iT & 32) != 0;
            z14 = false;
            z15 = z11;
        } else if (i13 == 4) {
            boolean z16 = (iT & 64) != 0;
            boolean z17 = (iT & 8) != 0;
            boolean z18 = (iT & 4) != 0;
            z14 = (iT & 2) != 0;
            z15 = (iT & 1) != 0;
            z12 = z16;
            z11 = z15;
            z15 = z17;
            z13 = z18;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z15 || z13) {
            z.n(f67555c, "Skipping unsupported compressed or encrypted frame");
            o0Var2.a0(iF);
            return null;
        }
        if (z12) {
            iA--;
            o0Var2.b0(1);
        }
        if (z11) {
            iA -= 4;
            o0Var2.b0(4);
        }
        if (z14) {
            iA = A(o0Var2, iA);
        }
        try {
            try {
                if (r10 == 84 && iA == 88 && iL3 == 88 && (i13 == 2 || iL4 == 88)) {
                    iVarG = s(o0Var2, iA);
                } else if (r10 == 84) {
                    iVarG = q(o0Var2, iA, x(i13, r10, iA, iL3, iL4));
                } else if (r10 == 87 && iA == 88 && iL3 == 88 && (i13 == 2 || iL4 == 88)) {
                    iVarG = u(o0Var2, iA);
                } else if (r10 == 87) {
                    iVarG = t(o0Var2, iA, x(i13, r10, iA, iL3, iL4));
                } else {
                    if (r10 != 80 || iA != 82 || iL3 != 73 || iL4 != 86) {
                        if (r10 == 71 && iA == 69 && iL3 == 79 && (iL4 == 66 || i13 == 2)) {
                            iVarG = l(o0Var2, iA);
                        } else {
                            th2 = null;
                            try {
                                if (i13 != 2 ? r10 == 65 && iA == 80 && iL3 == 73 && iL4 == 67 : r10 == 80 && iA == 73 && iL3 == 67) {
                                    iVarG = f(o0Var2, iA, i13);
                                } else {
                                    if (r10 != 67 || iA != 79 || iL3 != 77 || (iL4 != 77 && i13 != 2)) {
                                        if (r10 == 67 && iA == 72 && iL3 == 65 && iL4 == 80) {
                                            r10 = r10;
                                            iA = iA;
                                            iL4 = iL4;
                                            iA = iA;
                                            i12 = iL3;
                                            try {
                                                iVarG = h(o0Var2, iA, i13, z10, i11, aVar);
                                                i13 = i10;
                                                r10 = o0Var;
                                            } catch (Exception | OutOfMemoryError e10) {
                                                e = e10;
                                                i13 = i10;
                                                r14 = o0Var;
                                                r13 = r10;
                                                r14.a0(iF);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                r12 = o0Var;
                                                r12.a0(iF);
                                                throw th;
                                            }
                                        } else {
                                            r10 = r10;
                                            iA = iA;
                                            iL4 = iL4;
                                            iA = iA;
                                            i12 = iL3;
                                            try {
                                                if (r10 == 67 && iA == 84 && i12 == 79 && iL4 == 67) {
                                                    i13 = i10;
                                                    o0 o0Var3 = o0Var;
                                                    iVarG = i(o0Var3, iA, i13, z10, i11, aVar);
                                                    r10 = o0Var3;
                                                } else {
                                                    i13 = i10;
                                                    o0 o0Var4 = o0Var;
                                                    if (r10 == 77 && iA == 76 && i12 == 76 && iL4 == 84) {
                                                        iVarG = n(o0Var4, iA);
                                                        r10 = o0Var4;
                                                    } else {
                                                        iVarG = g(o0Var4, iA, x(i13, r10, iA, i12, iL4));
                                                        r10 = o0Var4;
                                                    }
                                                }
                                            } catch (Exception | OutOfMemoryError e11) {
                                                e = e11;
                                                r14 = r10;
                                                r13 = r10;
                                                r14.a0(iF);
                                                r15 = th2;
                                                r16 = r13;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                r12 = r10;
                                                r12.a0(iF);
                                                throw th;
                                            }
                                        }
                                        if (r15 == 0) {
                                            z.o(f67555c, "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                                        }
                                        return r15;
                                    }
                                    iVarG = j(o0Var2, iA);
                                }
                                r10 = o0Var2;
                                iA = iA;
                                r10 = r10;
                                i12 = iL3;
                            } catch (Exception | OutOfMemoryError e12) {
                                e = e12;
                                r11 = r10;
                                iA = iA;
                                i12 = iL3;
                                r14 = o0Var2;
                                r13 = r11;
                                r14.a0(iF);
                                r15 = th2;
                                r16 = r13;
                                if (r15 == 0) {
                                    z.o(f67555c, "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                                }
                                return r15;
                            }
                        }
                        r10.a0(iF);
                        r15 = iVarG;
                        e = th2;
                        r16 = r10;
                        if (r15 == 0) {
                            z.o(f67555c, "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
                        }
                        return r15;
                    }
                    iVarG = o(o0Var2, iA);
                }
                r10 = o0Var2;
                iA = iA;
                th2 = null;
                r10 = r10;
                i12 = iL3;
                r10.a0(iF);
                r15 = iVarG;
                e = th2;
                r16 = r10;
            } catch (Throwable th5) {
                th = th5;
                r12 = o0Var2;
            }
        } catch (Exception | OutOfMemoryError e13) {
            e = e13;
            r11 = r10;
            iA = iA;
            th2 = null;
        }
        if (r15 == 0) {
            z.o(f67555c, "Failed to decode frame: id=" + x(i13, r16, iA, i12, iL4) + ", frameSize=" + iA, e);
        }
        return r15;
    }

    private static f l(o0 o0Var, int i10) {
        int iL = o0Var.L();
        Charset charsetW = w(iL);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        o0Var.n(bArr, 0, i11);
        int iZ = z(bArr, 0);
        String strW = s0.w(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1));
        int i12 = iZ + 1;
        int iY = y(bArr, i12, iL);
        String strP = p(bArr, i12, iY, charsetW);
        int iV = iY + v(iL);
        int iY2 = y(bArr, iV, iL);
        return new f(strW, strP, p(bArr, iV, iY2, charsetW), d(bArr, iY2 + v(iL), i11));
    }

    @p0
    private static b m(o0 o0Var) {
        if (o0Var.a() < 10) {
            z.n(f67555c, "Data too short to be an ID3 tag");
            return null;
        }
        int iO = o0Var.O();
        if (iO != 4801587) {
            z.n(f67555c, "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(iO)));
            return null;
        }
        int iL = o0Var.L();
        o0Var.b0(1);
        int iL2 = o0Var.L();
        int iK = o0Var.K();
        if (iL == 2) {
            if ((iL2 & 64) != 0) {
                z.n(f67555c, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iL == 3) {
            if ((iL2 & 64) != 0) {
                int iS = o0Var.s();
                o0Var.b0(iS);
                iK -= iS + 4;
            }
        } else {
            if (iL != 4) {
                z.n(f67555c, "Skipped ID3 tag with unsupported majorVersion=" + iL);
                return null;
            }
            if ((iL2 & 64) != 0) {
                int iK2 = o0Var.K();
                o0Var.b0(iK2 - 4);
                iK -= iK2;
            }
            if ((iL2 & 16) != 0) {
                iK -= 10;
            }
        }
        return new b(iL, iL < 4 && (iL2 & 128) != 0, iK);
    }

    private static l n(o0 o0Var, int i10) {
        int iT = o0Var.T();
        int iO = o0Var.O();
        int iO2 = o0Var.O();
        int iL = o0Var.L();
        int iL2 = o0Var.L();
        n0 n0Var = new n0();
        n0Var.n(o0Var);
        int i11 = ((i10 - 10) * 8) / (iL + iL2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int iH = n0Var.h(iL);
            int iH2 = n0Var.h(iL2);
            iArr[i12] = iH;
            iArr2[i12] = iH2;
        }
        return new l(iT, iO, iO2, iArr, iArr2);
    }

    private static m o(o0 o0Var, int i10) {
        byte[] bArr = new byte[i10];
        o0Var.n(bArr, 0, i10);
        int iZ = z(bArr, 0);
        return new m(new String(bArr, 0, iZ, StandardCharsets.ISO_8859_1), d(bArr, iZ + 1, i10));
    }

    private static String p(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    @p0
    private static n q(o0 o0Var, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int iL = o0Var.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        o0Var.n(bArr, 0, i11);
        return new n(str, (String) null, r(bArr, iL, 0));
    }

    private static l6<String> r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return l6.G("");
        }
        l6.a aVarS = l6.s();
        int iY = y(bArr, i11, i10);
        while (i11 < iY) {
            aVarS.a(new String(bArr, i11, iY - i11, w(i10)));
            i11 = v(i10) + iY;
            iY = y(bArr, i11, i10);
        }
        l6<String> l6VarE = aVarS.e();
        return l6VarE.isEmpty() ? l6.G("") : l6VarE;
    }

    @p0
    private static n s(o0 o0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iL = o0Var.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        o0Var.n(bArr, 0, i11);
        int iY = y(bArr, 0, iL);
        return new n("TXXX", new String(bArr, 0, iY, w(iL)), r(bArr, iL, iY + v(iL)));
    }

    private static o t(o0 o0Var, int i10, String str) {
        byte[] bArr = new byte[i10];
        o0Var.n(bArr, 0, i10);
        return new o(str, null, new String(bArr, 0, z(bArr, 0), StandardCharsets.ISO_8859_1));
    }

    @p0
    private static o u(o0 o0Var, int i10) {
        if (i10 < 1) {
            return null;
        }
        int iL = o0Var.L();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        o0Var.n(bArr, 0, i11);
        int iY = y(bArr, 0, iL);
        String str = new String(bArr, 0, iY, w(iL));
        int iV = iY + v(iL);
        return new o("WXXX", str, p(bArr, iV, z(bArr, iV), StandardCharsets.ISO_8859_1));
    }

    private static int v(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    private static Charset w(int i10) {
        if (i10 == 1) {
            return StandardCharsets.UTF_16;
        }
        if (i10 != 2) {
            return i10 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8;
        }
        return StandardCharsets.UTF_16BE;
    }

    private static String x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static int y(byte[] bArr, int i10, int i11) {
        int iZ = z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return iZ;
        }
        while (iZ < bArr.length - 1) {
            if ((iZ - i10) % 2 == 0 && bArr[iZ + 1] == 0) {
                return iZ;
            }
            iZ = z(bArr, iZ + 1);
        }
        return bArr.length;
    }

    private static int z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // androidx.media3.extractor.metadata.c
    @p0
    protected r0 b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        return e(byteBuffer.array(), byteBuffer.limit());
    }

    @p0
    public r0 e(byte[] bArr, int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        o0 o0Var = new o0(bArr, i10);
        b bVarM = m(o0Var);
        if (bVarM == null) {
            return null;
        }
        int iF = o0Var.f();
        int i11 = bVarM.f67571a == 2 ? 6 : 10;
        int iA = bVarM.f67573c;
        if (bVarM.f67572b) {
            iA = A(o0Var, bVarM.f67573c);
        }
        o0Var.Z(iF + iA);
        boolean z10 = false;
        if (!B(o0Var, bVarM.f67571a, i11, false)) {
            if (bVarM.f67571a != 4 || !B(o0Var, 4, i11, true)) {
                z.n(f67555c, "Failed to validate ID3 tag with majorVersion=" + bVarM.f67571a);
                return null;
            }
            z10 = true;
        }
        while (o0Var.a() >= i11) {
            i iVarK = k(bVarM.f67571a, o0Var, z10, i11, this.f67570a);
            if (iVarK != null) {
                arrayList.add(iVarK);
            }
        }
        return new r0(arrayList);
    }

    public h(@p0 a aVar) {
        this.f67570a = aVar;
    }
}
