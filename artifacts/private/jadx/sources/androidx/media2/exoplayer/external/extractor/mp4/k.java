package androidx.media2.exoplayer.external.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.x;
import androidx.media3.extractor.mp4.u;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f54510a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f54511b = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, u.f68104a, 1297305174, 1684175153};

    private k() {
    }

    private static boolean a(int brand) {
        if ((brand >>> 8) == 3368816) {
            return true;
        }
        for (int i10 : f54511b) {
            if (i10 == brand) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        return c(input, true);
    }

    private static boolean c(androidx.media2.exoplayer.external.extractor.j jVar, boolean z10) throws InterruptedException, IOException {
        boolean z11;
        int i10;
        long length = jVar.getLength();
        long j10 = -1;
        int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j11 = PlaybackStateCompat.H1;
        if (i11 != 0 && length <= PlaybackStateCompat.H1) {
            j11 = length;
        }
        int i12 = (int) j11;
        x xVar = new x(64);
        boolean z12 = false;
        int i13 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 < i12) {
                xVar.M(8);
                jVar.i(xVar.f57720a, z12 ? 1 : 0, 8);
                long jF = xVar.F();
                int iL = xVar.l();
                if (jF == 1) {
                    jVar.i(xVar.f57720a, 8, 8);
                    xVar.P(16);
                    i10 = 16;
                    jF = xVar.w();
                } else {
                    if (jF == 0) {
                        long length2 = jVar.getLength();
                        if (length2 != j10) {
                            jF = (length2 - jVar.m()) + ((long) 8);
                        }
                    }
                    i10 = 8;
                }
                if (i11 != 0 && ((long) i13) + jF > length) {
                    return z12;
                }
                long j12 = i10;
                if (jF < j12) {
                    return z12;
                }
                i13 += i10;
                if (iL == 1836019574) {
                    i12 += (int) jF;
                    if (i11 != 0 && i12 > length) {
                        i12 = (int) length;
                    }
                    j10 = -1;
                } else {
                    if (iL == 1836019558 || iL == 1836475768) {
                        z11 = true;
                        return z13 && z10 == z11;
                    }
                    int i14 = i11;
                    long j13 = (((long) i13) + jF) - j12;
                    boolean z14 = z12 ? 1 : 0;
                    if (j13 < i12) {
                        int i15 = (int) (jF - j12);
                        i13 += i15;
                        if (iL == 1718909296) {
                            if (i15 < 8) {
                                return z14;
                            }
                            xVar.M(i15);
                            jVar.i(xVar.f57720a, z14 ? 1 : 0, i15);
                            int i16 = i15 / 4;
                            for (int i17 = 0; i17 < i16; i17++) {
                                if (i17 != 1) {
                                    if (a(xVar.l())) {
                                        z13 = true;
                                        break;
                                    }
                                } else {
                                    xVar.R(4);
                                }
                            }
                            if (!z13) {
                                return false;
                            }
                        } else if (i15 != 0) {
                            jVar.n(i15);
                        }
                        i11 = i14;
                        j10 = -1;
                        z12 = false;
                    }
                }
            }
            z11 = false;
            if (z13) {
                return false;
            }
        }
    }

    public static boolean d(androidx.media2.exoplayer.external.extractor.j input) throws InterruptedException, IOException {
        return c(input, false);
    }
}
