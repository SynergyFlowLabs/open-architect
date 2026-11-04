package androidx.media2.exoplayer.external.metadata.id3;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.d;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import androidx.media2.exoplayer.external.util.w;
import androidx.media2.exoplayer.external.util.x;
import com.rabbitmq.client.k0;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b implements androidx.media2.exoplayer.external.metadata.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f55527b = androidx.media2.exoplayer.external.metadata.id3.a.f55526a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f55528c = "Id3Decoder";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f55529d = 4801587;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f55530e = 10;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f55531f = 128;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f55532g = 64;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f55533h = 32;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f55534i = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f55535j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f55536k = 64;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f55537l = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f55538m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f55539n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f55540o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f55541p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f55542q = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final a f55543a;

    public interface a {
        boolean a(int majorVersion, int id0, int id1, int id2, int id3);
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.metadata.id3.b$b, reason: collision with other inner class name */
    private static final class C0514b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f55544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f55545b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f55546c;

        public C0514b(int majorVersion, boolean isUnsynchronized, int framesSize) {
            this.f55544a = majorVersion;
            this.f55545b = isUnsynchronized;
            this.f55546c = framesSize;
        }
    }

    public b() {
        this(null);
    }

    private static byte[] b(byte[] data, int from, int to) {
        return to <= from ? q0.f57631f : Arrays.copyOfRange(data, from, to);
    }

    private static ApicFrame d(x id3Data, int frameSize, int majorVersion) throws UnsupportedEncodingException {
        int iW;
        String strV0;
        int iD = id3Data.D();
        String strT = t(iD);
        int i10 = frameSize - 1;
        byte[] bArr = new byte[i10];
        id3Data.i(bArr, 0, i10);
        if (majorVersion == 2) {
            String strValueOf = String.valueOf(q0.V0(new String(bArr, 0, 3, "ISO-8859-1")));
            strV0 = strValueOf.length() != 0 ? "image/".concat(strValueOf) : new String("image/");
            if ("image/jpg".equals(strV0)) {
                strV0 = "image/jpeg";
            }
            iW = 2;
        } else {
            iW = w(bArr, 0);
            strV0 = q0.V0(new String(bArr, 0, iW, "ISO-8859-1"));
            if (strV0.indexOf(47) == -1) {
                strV0 = strV0.length() != 0 ? "image/".concat(strV0) : new String("image/");
            }
        }
        int i11 = bArr[iW + 1] & 255;
        int i12 = iW + 2;
        int iV = v(bArr, i12, iD);
        return new ApicFrame(strV0, new String(bArr, i12, iV - i12, strT), i11, b(bArr, iV + s(iD), i10));
    }

    private static BinaryFrame e(x id3Data, int frameSize, String id2) {
        byte[] bArr = new byte[frameSize];
        id3Data.i(bArr, 0, frameSize);
        return new BinaryFrame(id2, bArr);
    }

    private static ChapterFrame f(x id3Data, int frameSize, int majorVersion, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @p0 a framePredicate) throws Throwable {
        int iC = id3Data.c();
        int iW = w(id3Data.f57720a, iC);
        String str = new String(id3Data.f57720a, iC, iW - iC, "ISO-8859-1");
        id3Data.Q(iW + 1);
        int iL = id3Data.l();
        int iL2 = id3Data.l();
        long jF = id3Data.F();
        if (jF == k0.f265952a) {
            jF = -1;
        }
        long jF2 = id3Data.F();
        long j10 = jF2 == k0.f265952a ? -1L : jF2;
        ArrayList arrayList = new ArrayList();
        int i10 = iC + frameSize;
        while (id3Data.c() < i10) {
            Id3Frame id3FrameI = i(majorVersion, id3Data, unsignedIntFrameSizeHack, frameHeaderSize, framePredicate);
            if (id3FrameI != null) {
                arrayList.add(id3FrameI);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iL, iL2, jF, j10, id3FrameArr);
    }

    private static ChapterTocFrame g(x id3Data, int frameSize, int majorVersion, boolean unsignedIntFrameSizeHack, int frameHeaderSize, @p0 a framePredicate) throws Throwable {
        int iC = id3Data.c();
        int iW = w(id3Data.f57720a, iC);
        String str = new String(id3Data.f57720a, iC, iW - iC, "ISO-8859-1");
        id3Data.Q(iW + 1);
        int iD = id3Data.D();
        boolean z10 = (iD & 2) != 0;
        boolean z11 = (iD & 1) != 0;
        int iD2 = id3Data.D();
        String[] strArr = new String[iD2];
        for (int i10 = 0; i10 < iD2; i10++) {
            int iC2 = id3Data.c();
            int iW2 = w(id3Data.f57720a, iC2);
            strArr[i10] = new String(id3Data.f57720a, iC2, iW2 - iC2, "ISO-8859-1");
            id3Data.Q(iW2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i11 = iC + frameSize;
        while (id3Data.c() < i11) {
            Id3Frame id3FrameI = i(majorVersion, id3Data, unsignedIntFrameSizeHack, frameHeaderSize, framePredicate);
            if (id3FrameI != null) {
                arrayList.add(id3FrameI);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z10, z11, strArr, id3FrameArr);
    }

    @p0
    private static CommentFrame h(x id3Data, int frameSize) throws UnsupportedEncodingException {
        if (frameSize < 4) {
            return null;
        }
        int iD = id3Data.D();
        String strT = t(iD);
        byte[] bArr = new byte[3];
        id3Data.i(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i10 = frameSize - 4;
        byte[] bArr2 = new byte[i10];
        id3Data.i(bArr2, 0, i10);
        int iV = v(bArr2, 0, iD);
        String str2 = new String(bArr2, 0, iV, strT);
        int iS = iV + s(iD);
        return new CommentFrame(str, str2, n(bArr2, iS, v(bArr2, iS, iD), strT));
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0230 A[Catch: all -> 0x020d, UnsupportedEncodingException -> 0x025e, TRY_LEAVE, TryCatch #3 {all -> 0x020d, blocks: (B:174:0x0230, B:177:0x025e, B:162:0x0208, B:171:0x0221, B:172:0x0226), top: B:185:0x0114 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v18 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8, types: [androidx.media2.exoplayer.external.metadata.id3.Id3Frame] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.media2.exoplayer.external.util.x] */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.media2.exoplayer.external.util.x] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25, types: [androidx.media2.exoplayer.external.util.x] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @p0
    private static Id3Frame i(int i10, x xVar, boolean z10, int i11, @p0 a aVar) throws Throwable {
        int iH;
        ?? r10;
        boolean z11;
        boolean z12;
        ?? r15;
        boolean z13;
        ?? r16;
        ?? r11;
        ?? r12;
        int i12;
        x xVar2;
        Id3Frame id3FrameE;
        ?? r13;
        ?? r17;
        int i13 = i10;
        x xVar3 = xVar;
        int iD = xVar3.D();
        int iD2 = xVar3.D();
        int iD3 = xVar3.D();
        boolean z14 = false;
        int iD4 = i13 >= 3 ? xVar3.D() : 0;
        if (i13 == 4) {
            iH = xVar3.H();
            if (!z10) {
                iH = (((iH >> 24) & 255) << 21) | (iH & 255) | (((iH >> 8) & 255) << 7) | (((iH >> 16) & 255) << 14);
            }
        } else {
            iH = i13 == 3 ? xVar3.H() : xVar3.G();
        }
        int iY = iH;
        int iJ = i13 >= 3 ? xVar3.J() : 0;
        if (iD == 0 && iD2 == 0 && iD3 == 0 && iD4 == 0 && iY == 0 && iJ == 0) {
            xVar3.Q(xVar3.d());
            return null;
        }
        int iC = xVar3.c() + iY;
        if (iC > xVar3.d()) {
            p.l(f55528c, "Frame size exceeds remaining tag data");
            xVar3.Q(xVar3.d());
            return null;
        }
        if (aVar != null) {
            r10 = iD2;
            if (!aVar.a(i13, iD, iD2, iD3, iD4)) {
                i13 = i13;
                xVar3.Q(iC);
                return null;
            }
        } else {
            r10 = iD2;
        }
        i13 = i13;
        if (i13 == 3) {
            z11 = (iJ & 128) != 0;
            boolean z15 = (iJ & 64) != 0;
            z12 = (iJ & 32) != 0;
            z13 = false;
            z14 = z11;
            r15 = z15;
        } else if (i13 == 4) {
            boolean z16 = (iJ & 64) != 0;
            boolean z17 = (iJ & 8) != 0;
            r16 = (iJ & 4) != 0 ? 1 : 0;
            z13 = (iJ & 2) != 0;
            z14 = (iJ & 1) != 0;
            z12 = z16;
            z11 = z14;
            z14 = z17;
            r15 = r16;
        } else {
            z11 = false;
            z12 = false;
            r15 = 0;
            z13 = false;
        }
        if (z14 || r15 != 0) {
            p.l(f55528c, "Skipping unsupported compressed or encrypted frame");
            xVar3.Q(iC);
            return null;
        }
        if (z12) {
            iY--;
            xVar3.R(1);
        }
        if (z11) {
            iY -= 4;
            xVar3.R(4);
        }
        if (z13) {
            iY = y(xVar3, iY);
        }
        try {
            try {
                try {
                    try {
                        if (iD == 84 && r10 == 88 && iD3 == 88 && (i13 == 2 || iD4 == 88)) {
                            id3FrameE = p(xVar3, iY);
                        } else if (iD == 84) {
                            id3FrameE = o(xVar3, iY, u(i13, iD, r10, iD3, iD4));
                        } else if (iD == 87 && r10 == 88 && iD3 == 88 && (i13 == 2 || iD4 == 88)) {
                            id3FrameE = r(xVar3, iY);
                        } else if (iD == 87) {
                            id3FrameE = q(xVar3, iY, u(i13, iD, r10, iD3, iD4));
                        } else {
                            if (iD != 80 || r10 != 82 || iD3 != 73 || iD4 != 86) {
                                if (iD == 71 && r10 == 69 && iD3 == 79 && (iD4 == 66 || i13 == 2)) {
                                    id3FrameE = j(xVar3, iY);
                                } else {
                                    r16 = 0;
                                    try {
                                        if (i13 != 2 ? iD == 65 && r10 == 80 && iD3 == 73 && iD4 == 67 : iD == 80 && r10 == 73 && iD3 == 67) {
                                            id3FrameE = d(xVar3, iY, i13);
                                        } else if (iD == 67 && r10 == 79 && iD3 == 77 && (iD4 == 77 || i13 == 2)) {
                                            id3FrameE = h(xVar3, iY);
                                        } else if (iD == 67 && r10 == 72 && iD3 == 65 && iD4 == 80) {
                                            r13 = r10;
                                            iD3 = iD3;
                                            iY = iY;
                                            i12 = iD4;
                                            try {
                                                id3FrameE = f(xVar3, iY, i13, z10, i11, aVar);
                                                i13 = i10;
                                                r10 = xVar;
                                                r16 = r16;
                                            } catch (UnsupportedEncodingException unused) {
                                                r10 = xVar;
                                                p.l(f55528c, "Unsupported character encoding");
                                                r10.Q(iC);
                                                return r16;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r11 = xVar;
                                                r11.Q(iC);
                                                throw th;
                                            }
                                        } else {
                                            r12 = r10;
                                            iD3 = iD3;
                                            iY = iY;
                                            i12 = iD4;
                                            if (iD == 67 && r12 == 84 && iD3 == 79 && i12 == 67) {
                                                i13 = i10;
                                                x xVar4 = xVar;
                                                id3FrameE = g(xVar4, iY, i13, z10, i11, aVar);
                                                r10 = xVar4;
                                                r13 = r12;
                                                r16 = r16;
                                            } else {
                                                i13 = i10;
                                                xVar2 = xVar;
                                                if (iD == 77 && r12 == 76 && iD3 == 76 && i12 == 84) {
                                                    id3FrameE = l(xVar2, iY);
                                                } else {
                                                    id3FrameE = e(xVar2, iY, u(i13, iD, r12, iD3, i12));
                                                    r10 = xVar2;
                                                    r13 = r12;
                                                    r16 = r16;
                                                }
                                            }
                                        }
                                        r17 = r16;
                                        i12 = iD4;
                                        r10 = xVar3;
                                        r13 = r10;
                                        r16 = r17;
                                    } catch (UnsupportedEncodingException unused2) {
                                        r10 = xVar3;
                                    }
                                }
                                if (id3FrameE == null) {
                                    r10 = xVar2;
                                    r13 = r12;
                                    r16 = r16;
                                    String strU = u(i13, iD, r13, iD3, i12);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(strU).length() + 50);
                                    sb2.append("Failed to decode frame: id=");
                                    sb2.append(strU);
                                    sb2.append(", frameSize=");
                                    sb2.append(iY);
                                    p.l(f55528c, sb2.toString());
                                }
                                r10 = xVar2;
                                r13 = r12;
                                r16 = r16;
                                r10.Q(iC);
                                return id3FrameE;
                            }
                            id3FrameE = m(xVar3, iY);
                        }
                        r17 = 0;
                        i12 = iD4;
                        r10 = xVar3;
                        r13 = r10;
                        r16 = r17;
                        if (id3FrameE == null) {
                            r10 = xVar2;
                            r13 = r12;
                            r16 = r16;
                            String strU2 = u(i13, iD, r13, iD3, i12);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(strU2).length() + 50);
                            sb3.append("Failed to decode frame: id=");
                            sb3.append(strU2);
                            sb3.append(", frameSize=");
                            sb3.append(iY);
                            p.l(f55528c, sb3.toString());
                        }
                        r10 = xVar2;
                        r13 = r12;
                        r16 = r16;
                        r10.Q(iC);
                        return id3FrameE;
                    } catch (UnsupportedEncodingException unused3) {
                        r10 = xVar3;
                        r16 = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r11 = r10;
                }
            } catch (Throwable th4) {
                th = th4;
                r11 = xVar3;
            }
        } catch (UnsupportedEncodingException unused4) {
        }
    }

    private static GeobFrame j(x id3Data, int frameSize) throws UnsupportedEncodingException {
        int iD = id3Data.D();
        String strT = t(iD);
        int i10 = frameSize - 1;
        byte[] bArr = new byte[i10];
        id3Data.i(bArr, 0, i10);
        int iW = w(bArr, 0);
        String str = new String(bArr, 0, iW, "ISO-8859-1");
        int i11 = iW + 1;
        int iV = v(bArr, i11, iD);
        String strN = n(bArr, i11, iV, strT);
        int iS = iV + s(iD);
        int iV2 = v(bArr, iS, iD);
        return new GeobFrame(str, strN, n(bArr, iS, iV2, strT), b(bArr, iV2 + s(iD), i10));
    }

    @p0
    private static C0514b k(x data) {
        if (data.a() < 10) {
            p.l(f55528c, "Data too short to be an ID3 tag");
            return null;
        }
        int iG = data.G();
        if (iG != 4801587) {
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Unexpected first three bytes of ID3 tag header: ");
            sb2.append(iG);
            p.l(f55528c, sb2.toString());
            return null;
        }
        int iD = data.D();
        data.R(1);
        int iD2 = data.D();
        int iC = data.C();
        if (iD == 2) {
            if ((iD2 & 64) != 0) {
                p.l(f55528c, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (iD == 3) {
            if ((iD2 & 64) != 0) {
                int iL = data.l();
                data.R(iL);
                iC -= iL + 4;
            }
        } else {
            if (iD != 4) {
                StringBuilder sb3 = new StringBuilder(57);
                sb3.append("Skipped ID3 tag with unsupported majorVersion=");
                sb3.append(iD);
                p.l(f55528c, sb3.toString());
                return null;
            }
            if ((iD2 & 64) != 0) {
                int iC2 = data.C();
                data.R(iC2 - 4);
                iC -= iC2;
            }
            if ((iD2 & 16) != 0) {
                iC -= 10;
            }
        }
        return new C0514b(iD, iD < 4 && (iD2 & 128) != 0, iC);
    }

    private static MlltFrame l(x id3Data, int frameSize) {
        int iJ = id3Data.J();
        int iG = id3Data.G();
        int iG2 = id3Data.G();
        int iD = id3Data.D();
        int iD2 = id3Data.D();
        w wVar = new w();
        wVar.k(id3Data);
        int i10 = ((frameSize - 10) * 8) / (iD + iD2);
        int[] iArr = new int[i10];
        int[] iArr2 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = wVar.h(iD);
            int iH2 = wVar.h(iD2);
            iArr[i11] = iH;
            iArr2[i11] = iH2;
        }
        return new MlltFrame(iJ, iG, iG2, iArr, iArr2);
    }

    private static PrivFrame m(x id3Data, int frameSize) throws UnsupportedEncodingException {
        byte[] bArr = new byte[frameSize];
        id3Data.i(bArr, 0, frameSize);
        int iW = w(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iW, "ISO-8859-1"), b(bArr, iW + 1, frameSize));
    }

    private static String n(byte[] data, int from, int to, String charsetName) throws UnsupportedEncodingException {
        if (to > from && to <= data.length) {
            return new String(data, from, to - from, charsetName);
        }
        return "";
    }

    @p0
    private static TextInformationFrame o(x id3Data, int frameSize, String id2) throws UnsupportedEncodingException {
        if (frameSize < 1) {
            return null;
        }
        int iD = id3Data.D();
        String strT = t(iD);
        int i10 = frameSize - 1;
        byte[] bArr = new byte[i10];
        id3Data.i(bArr, 0, i10);
        return new TextInformationFrame(id2, null, new String(bArr, 0, v(bArr, 0, iD), strT));
    }

    @p0
    private static TextInformationFrame p(x id3Data, int frameSize) throws UnsupportedEncodingException {
        if (frameSize < 1) {
            return null;
        }
        int iD = id3Data.D();
        String strT = t(iD);
        int i10 = frameSize - 1;
        byte[] bArr = new byte[i10];
        id3Data.i(bArr, 0, i10);
        int iV = v(bArr, 0, iD);
        String str = new String(bArr, 0, iV, strT);
        int iS = iV + s(iD);
        return new TextInformationFrame("TXXX", str, n(bArr, iS, v(bArr, iS, iD), strT));
    }

    private static UrlLinkFrame q(x id3Data, int frameSize, String id2) throws UnsupportedEncodingException {
        byte[] bArr = new byte[frameSize];
        id3Data.i(bArr, 0, frameSize);
        return new UrlLinkFrame(id2, null, new String(bArr, 0, w(bArr, 0), "ISO-8859-1"));
    }

    @p0
    private static UrlLinkFrame r(x id3Data, int frameSize) throws UnsupportedEncodingException {
        if (frameSize < 1) {
            return null;
        }
        int iD = id3Data.D();
        String strT = t(iD);
        int i10 = frameSize - 1;
        byte[] bArr = new byte[i10];
        id3Data.i(bArr, 0, i10);
        int iV = v(bArr, 0, iD);
        String str = new String(bArr, 0, iV, strT);
        int iS = iV + s(iD);
        return new UrlLinkFrame("WXXX", str, n(bArr, iS, w(bArr, iS), "ISO-8859-1"));
    }

    private static int s(int encodingByte) {
        return (encodingByte == 0 || encodingByte == 3) ? 1 : 2;
    }

    private static String t(int encodingByte) {
        if (encodingByte == 1) {
            return "UTF-16";
        }
        if (encodingByte != 2) {
            return encodingByte != 3 ? "ISO-8859-1" : "UTF-8";
        }
        return "UTF-16BE";
    }

    private static String u(int majorVersion, int frameId0, int frameId1, int frameId2, int frameId3) {
        return majorVersion == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(frameId0), Integer.valueOf(frameId1), Integer.valueOf(frameId2)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(frameId0), Integer.valueOf(frameId1), Integer.valueOf(frameId2), Integer.valueOf(frameId3));
    }

    private static int v(byte[] data, int fromIndex, int encoding) {
        int iW = w(data, fromIndex);
        if (encoding == 0 || encoding == 3) {
            return iW;
        }
        while (iW < data.length - 1) {
            if (iW % 2 == 0 && data[iW + 1] == 0) {
                return iW;
            }
            iW = w(data, iW + 1);
        }
        return data.length;
    }

    private static int w(byte[] data, int fromIndex) {
        while (fromIndex < data.length) {
            if (data[fromIndex] == 0) {
                return fromIndex;
            }
            fromIndex++;
        }
        return data.length;
    }

    static final /* synthetic */ boolean x(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    private static int y(x data, int length) {
        byte[] bArr = data.f57720a;
        int iC = data.c();
        int i10 = iC;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= iC + length) {
                return length;
            }
            if ((bArr[i10] & 255) == 255 && bArr[i11] == 0) {
                System.arraycopy(bArr, i10 + 2, bArr, i11, (length - (i10 - iC)) - 2);
                length--;
            }
            i10 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[PHI: r3
      0x0083: PHI (r3v17 int) = (r3v6 int), (r3v20 int) binds: [B:42:0x0091, B:33:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    private static boolean z(x id3Data, int majorVersion, int frameHeaderSize, boolean unsignedIntFrameSizeHack) {
        int iG;
        long jG;
        int iJ;
        int i10;
        int iC = id3Data.c();
        while (true) {
            try {
                boolean z10 = true;
                if (id3Data.a() < frameHeaderSize) {
                    id3Data.Q(iC);
                    return true;
                }
                if (majorVersion >= 3) {
                    iG = id3Data.l();
                    jG = id3Data.F();
                    iJ = id3Data.J();
                } else {
                    iG = id3Data.G();
                    jG = id3Data.G();
                    iJ = 0;
                }
                if (iG == 0 && jG == 0 && iJ == 0) {
                    id3Data.Q(iC);
                    return true;
                }
                if (majorVersion == 4 && !unsignedIntFrameSizeHack) {
                    if ((8421504 & jG) != 0) {
                        id3Data.Q(iC);
                        return false;
                    }
                    jG = (((jG >> 24) & 255) << 21) | (jG & 255) | (((jG >> 8) & 255) << 7) | (((jG >> 16) & 255) << 14);
                }
                if (majorVersion == 4) {
                    i10 = (iJ & 64) != 0 ? 1 : 0;
                    if ((iJ & 1) == 0) {
                        z10 = false;
                    }
                } else if (majorVersion == 3) {
                    i10 = (iJ & 32) != 0 ? 1 : 0;
                    if ((iJ & 128) == 0) {
                        z10 = false;
                    }
                } else {
                    i10 = 0;
                    z10 = false;
                }
                if (z10) {
                    i10 += 4;
                }
                if (jG < i10) {
                    id3Data.Q(iC);
                    return false;
                }
                if (id3Data.a() < jG) {
                    id3Data.Q(iC);
                    return false;
                }
                id3Data.R((int) jG);
            } catch (Throwable th2) {
                id3Data.Q(iC);
                throw th2;
            }
        }
    }

    @Override // androidx.media2.exoplayer.external.metadata.b
    @p0
    public Metadata a(d inputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media2.exoplayer.external.util.a.g(inputBuffer.f53789c);
        return c(byteBuffer.array(), byteBuffer.limit());
    }

    @p0
    public Metadata c(byte[] data, int size) throws Throwable {
        ArrayList arrayList = new ArrayList();
        x xVar = new x(data, size);
        C0514b c0514bK = k(xVar);
        if (c0514bK == null) {
            return null;
        }
        int iC = xVar.c();
        int i10 = c0514bK.f55544a == 2 ? 6 : 10;
        int iY = c0514bK.f55546c;
        if (c0514bK.f55545b) {
            iY = y(xVar, c0514bK.f55546c);
        }
        xVar.P(iC + iY);
        boolean z10 = false;
        if (!z(xVar, c0514bK.f55544a, i10, false)) {
            if (c0514bK.f55544a != 4 || !z(xVar, 4, i10, true)) {
                int i11 = c0514bK.f55544a;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Failed to validate ID3 tag with majorVersion=");
                sb2.append(i11);
                p.l(f55528c, sb2.toString());
                return null;
            }
            z10 = true;
        }
        while (xVar.a() >= i10) {
            Id3Frame id3FrameI = i(c0514bK.f55544a, xVar, z10, i10, this.f55543a);
            if (id3FrameI != null) {
                arrayList.add(id3FrameI);
            }
        }
        return new Metadata(arrayList);
    }

    public b(@p0 a framePredicate) {
        this.f55543a = framePredicate;
    }
}
