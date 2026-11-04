package androidx.media3.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.t0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f68105b = 1751476579;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f68106c = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f68104a = 1903435808;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f68107d = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, f68104a, 1297305174, 1684175153, 1769172332, 1885955686};

    private u() {
    }

    private static boolean a(int i10, boolean z10) {
        if ((i10 >>> 8) == 3368816) {
            return true;
        }
        if (i10 == 1751476579 && z10) {
            return true;
        }
        for (int i11 : f68107d) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    @p0
    public static t0 b(androidx.media3.extractor.s sVar) throws IOException {
        return c(sVar, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0136  */
    /* JADX WARN: Code duplicated, block: B:80:0x0139  */
    /* JADX WARN: Code duplicated, block: B:82:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x013f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0142  */
    /* JADX WARN: Code duplicated, block: B:87:0x0145 A[RETURN] */
    @p0
    private static t0 c(androidx.media3.extractor.s sVar, boolean z10, boolean z11) throws IOException {
        t0 t0Var;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        long length = sVar.getLength();
        long j10 = -1;
        long j11 = PlaybackStateCompat.H1;
        if (length != -1 && length <= PlaybackStateCompat.H1) {
            j11 = length;
        }
        int i13 = (int) j11;
        o0 o0Var = new o0(64);
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i15 < i13) {
                o0Var.W(8);
                boolean z13 = true;
                if (sVar.k(o0Var.e(), i14, 8, true)) {
                    long jN = o0Var.N();
                    int iS = o0Var.s();
                    if (jN == 1) {
                        j10 = j10;
                        sVar.i(o0Var.e(), 8, 8);
                        i11 = 16;
                        o0Var.Z(16);
                        jN = o0Var.E();
                        i15 = i15;
                    } else {
                        j10 = j10;
                        if (jN == 0) {
                            long length2 = sVar.getLength();
                            if (length2 != j10) {
                                jN = (length2 - sVar.m()) + ((long) 8);
                            }
                        }
                        i11 = 8;
                    }
                    long j12 = jN;
                    long j13 = i11;
                    if (j12 < j13) {
                        return new a(iS, j12, i11);
                    }
                    int i16 = i15 + i11;
                    t0Var = null;
                    if (iS == 1836019574) {
                        i13 += (int) j12;
                        if (length != -1 && i13 > length) {
                            i13 = (int) length;
                        }
                        i15 = i16;
                        i14 = 0;
                    } else if (iS == 1836019558 || iS == 1836475768) {
                        i10 = 1;
                    } else {
                        if (iS == 1835295092) {
                            z12 = true;
                        }
                        long j14 = length;
                        if ((((long) i16) + j12) - j13 >= i13) {
                            i10 = 0;
                        } else {
                            int i17 = (int) (j12 - j13);
                            i15 = i16 + i17;
                            if (iS != 1718909296) {
                                i12 = 0;
                                if (i17 != 0) {
                                    sVar.n(i17);
                                }
                            } else {
                                if (i17 < 8) {
                                    return new a(iS, i17, 8);
                                }
                                o0Var.W(i17);
                                i12 = 0;
                                sVar.i(o0Var.e(), 0, i17);
                                int iS2 = o0Var.s();
                                if (a(iS2, z11)) {
                                    z12 = true;
                                }
                                o0Var.b0(4);
                                int iA = o0Var.a() / 4;
                                if (!z12 && iA > 0) {
                                    iArr = new int[iA];
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= iA) {
                                            z13 = z12;
                                            break;
                                        }
                                        int iS3 = o0Var.s();
                                        iArr[i18] = iS3;
                                        if (a(iS3, z11)) {
                                            break;
                                        }
                                        i18++;
                                    }
                                } else {
                                    z13 = z12;
                                    iArr = null;
                                }
                                if (!z13) {
                                    return new z(iS2, iArr);
                                }
                                z12 = z13;
                            }
                            i14 = i12;
                            length = j14;
                        }
                    }
                }
                if (!z12) {
                    return q.f68067a;
                }
                if (z10 != i10) {
                    return i10 != 0 ? j.f68008b : j.f68009c;
                }
                return t0Var;
            }
            t0Var = null;
            i10 = i14;
            if (!z12) {
                return q.f68067a;
            }
            if (z10 != i10) {
                if (i10 != 0) {
                }
            }
            return t0Var;
        }
    }

    @p0
    public static t0 d(androidx.media3.extractor.s sVar, boolean z10) throws IOException {
        return c(sVar, false, z10);
    }
}
