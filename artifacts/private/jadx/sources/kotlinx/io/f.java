package kotlinx.io;

import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nByteStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStrings.kt\nkotlinx/io/ByteStringsKt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 Sinks.kt\nkotlinx/io/SinksKt\n+ 4 UnsafeByteStringOperations.kt\nkotlinx/io/bytestring/unsafe/UnsafeByteStringOperations\n+ 5 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Buffer.kt\nkotlinx/io/BufferKt\n*L\n1#1,167:1\n38#2:168\n374#3:169\n375#3,2:200\n42#4:170\n43#4:199\n42#4:203\n43#4:229\n195#5,28:171\n1#6:202\n659#7,25:204\n*S KotlinDebug\n*F\n+ 1 ByteStrings.kt\nkotlinx/io/ByteStringsKt\n*L\n31#1:168\n36#1:169\n36#1:200,2\n39#1:170\n39#1:199\n128#1:203\n128#1:229\n42#1:171,28\n129#1:204,25\n*E\n"})
public final class f {
    public static final long a(@NotNull b bVar, @NotNull kotlinx.io.bytestring.c byteString, long j10) {
        long j11;
        long j12;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (j10 > bVar.j()) {
            throw new IllegalArgumentException(("startIndex (" + j10 + ") should not exceed size (" + bVar.j() + ')').toString());
        }
        long jN = 0;
        if (kotlinx.io.bytestring.g.p(byteString)) {
            return 0L;
        }
        if (j10 > bVar.j() - ((long) byteString.r())) {
            return -1L;
        }
        ek.b bVar2 = ek.b.f274886a;
        byte[] bArrQ = byteString.q();
        if (bVar.g() == null) {
            return -1L;
        }
        if (bVar.j() - j10 >= j10) {
            t tVarG = bVar.g();
            while (tVarG != null) {
                long jD = ((long) (tVarG.d() - tVarG.h())) + jN;
                if (jD > j10) {
                    break;
                }
                tVarG = tVarG.f();
                jN = jD;
            }
            if (jN == -1) {
                return -1L;
            }
            do {
                Intrinsics.checkNotNull(tVarG);
                int iMax = Math.max((int) (j10 - jN), 0);
                int iB = v.b(tVarG, bArrQ, iMax);
                if (iB == -1) {
                    int iC = v.c(tVarG, bArrQ, Math.max(iMax, (tVarG.n() - bArrQ.length) + 1));
                    if (iC == -1) {
                        jN += (long) tVarG.n();
                        tVarG = tVarG.f();
                        if (tVarG == null) {
                            break;
                        }
                    } else {
                        j11 = iC;
                    }
                } else {
                    j11 = iB;
                }
                return jN + j11;
            } while (((long) byteString.r()) + jN <= bVar.j());
            return -1L;
        }
        t tVarO = bVar.o();
        long j13 = bVar.j();
        while (tVarO != null && j13 > j10) {
            j13 -= (long) (tVarO.d() - tVarO.h());
            if (j13 <= j10) {
                break;
            }
            tVarO = tVarO.j();
        }
        if (j13 == -1) {
            return -1L;
        }
        do {
            Intrinsics.checkNotNull(tVarO);
            int iMax2 = Math.max((int) (j10 - j13), 0);
            int iB2 = v.b(tVarO, bArrQ, iMax2);
            if (iB2 == -1) {
                int iC2 = v.c(tVarO, bArrQ, Math.max(iMax2, (tVarO.n() - bArrQ.length) + 1));
                if (iC2 == -1) {
                    j13 += (long) tVarO.n();
                    tVarO = tVarO.f();
                    if (tVarO == null) {
                        break;
                    }
                } else {
                    j12 = iC2;
                }
            } else {
                j12 = iB2;
            }
            return j13 + j12;
        } while (((long) byteString.r()) + j13 <= bVar.j());
        return -1L;
    }

    public static final long b(@NotNull c0 c0Var, @NotNull kotlinx.io.bytestring.c byteString, long j10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (j10 < 0) {
            throw new IllegalArgumentException(("startIndex: " + j10).toString());
        }
        if (kotlinx.io.bytestring.g.p(byteString)) {
            return 0L;
        }
        while (c0Var.request(((long) byteString.r()) + j10)) {
            long jA = a(c0Var.n(), byteString, j10);
            if (jA >= 0) {
                return jA;
            }
            j10 = (c0Var.n().j() - ((long) byteString.r())) + 1;
        }
        return -1L;
    }

    public static /* synthetic */ long c(b bVar, kotlinx.io.bytestring.c cVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return a(bVar, cVar, j10);
    }

    public static /* synthetic */ long d(c0 c0Var, kotlinx.io.bytestring.c cVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return b(c0Var, cVar, j10);
    }

    @NotNull
    public static final kotlinx.io.bytestring.c e(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return ek.b.f274886a.b(g0.c(c0Var));
    }

    @NotNull
    public static final kotlinx.io.bytestring.c f(@NotNull c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return ek.b.f274886a.b(g0.d(c0Var, i10));
    }

    public static final void g(@NotNull x xVar, @NotNull kotlinx.io.bytestring.c byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        k0.e(byteString.r(), i10, i11);
        if (i11 == i10) {
            return;
        }
        b bVarN = xVar.n();
        ek.b bVar = ek.b.f274886a;
        byte[] bArrQ = byteString.q();
        while (i10 < i11) {
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            t tVarR = bVarN.R(1);
            byte[] bArrB = tVarR.b(false);
            int iD = tVarR.d();
            int iMin = Math.min(i11 - i10, bArrB.length - iD);
            int i12 = i10 + iMin;
            ArraysKt.copyInto(bArrQ, bArrB, iD, i10, i12);
            if (iMin == 1) {
                tVarR.I(bArrB, iMin);
                tVarR.x(tVarR.d() + iMin);
                bVarN.H(bVarN.l() + ((long) iMin));
            } else {
                if (iMin < 0 || iMin > tVarR.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + iMin + ". Should be in 0.." + tVarR.l()).toString());
                }
                if (iMin != 0) {
                    tVarR.I(bArrB, iMin);
                    tVarR.x(tVarR.d() + iMin);
                    bVarN.H(bVarN.l() + ((long) iMin));
                } else if (v.d(tVarR)) {
                    bVarN.y();
                }
            }
            i10 = i12;
        }
        xVar.Z3();
    }

    public static /* synthetic */ void h(x xVar, kotlinx.io.bytestring.c cVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = cVar.r();
        }
        g(xVar, cVar, i10, i11);
    }
}
