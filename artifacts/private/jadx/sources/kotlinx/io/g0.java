package kotlinx.io;

import androidx.collection.g3;
import java.io.EOFException;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.q1;
import kotlin.u1;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sources.kt\nkotlinx/io/SourcesKt\n+ 2 Buffer.kt\nkotlinx/io/BufferKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,465:1\n659#2,25:466\n659#2,25:491\n52#3:516\n53#3:518\n38#3:520\n1#4:517\n1#4:519\n*S KotlinDebug\n*F\n+ 1 Sources.kt\nkotlinx/io/SourcesKt\n*L\n94#1:466,25\n156#1:491,25\n251#1:516\n251#1:518\n291#1:520\n251#1:517\n*E\n"})
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f315769a = -922337203685477580L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f315770b = -7;

    public static final long a(@NotNull c0 c0Var, byte b10, long j10, long j11) {
        String str;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (0 <= j10 && j10 <= j11) {
            if (j10 == j11) {
                return -1L;
            }
            long j12 = j10;
            while (j12 < j11 && c0Var.request(1 + j12)) {
                byte b11 = b10;
                long jA = e.a(c0Var.n(), b11, j12, Math.min(j11, c0Var.n().j()));
                if (jA != -1) {
                    return jA;
                }
                j12 = c0Var.n().j();
                b10 = b11;
            }
            return -1L;
        }
        if (j11 < 0) {
            str = "startIndex (" + j10 + ") and endIndex (" + j11 + ") should be non negative";
        } else {
            str = "startIndex (" + j10 + ") is not within the range [0..endIndex(" + j11 + "))";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static /* synthetic */ long b(c0 c0Var, byte b10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return a(c0Var, b10, j12, j11);
    }

    @NotNull
    public static final byte[] c(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return e(c0Var, -1);
    }

    @NotNull
    public static final byte[] d(@NotNull c0 c0Var, int i10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        long j10 = i10;
        if (j10 >= 0) {
            return e(c0Var, i10);
        }
        throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
    }

    private static final byte[] e(c0 c0Var, int i10) throws EOFException {
        if (i10 == -1) {
            for (long j10 = 2147483647L; c0Var.n().j() < g3.f12256c && c0Var.request(j10); j10 *= (long) 2) {
            }
            if (c0Var.n().j() >= g3.f12256c) {
                throw new IllegalStateException(("Can't create an array of size " + c0Var.n().j()).toString());
            }
            i10 = (int) c0Var.n().j();
        } else {
            c0Var.q1(i10);
        }
        byte[] bArr = new byte[i10];
        p(c0Var.n(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static final long f(@NotNull c0 c0Var) throws EOFException {
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        c0Var.q1(1L);
        byte bF = c0Var.n().f(0L);
        byte b10 = 58;
        byte b11 = 48;
        if (bF == 45) {
            c0Var.q1(2L);
            byte bF2 = c0Var.n().f(1L);
            if (48 > bF2 || bF2 >= 58) {
                throw new NumberFormatException("Expected a digit but was 0x" + k0.q(c0Var.n().f(1L)));
            }
            j11 = -8;
            z10 = true;
            j10 = 0;
        } else {
            if (48 > bF || bF >= 58) {
                throw new NumberFormatException("Expected a digit or '-' but was 0x" + k0.q(bF));
            }
            j10 = 48 - bF;
            j11 = -7;
            z10 = false;
        }
        long j12 = 1;
        while (c0Var.request(j12 + 1)) {
            b bVarN = c0Var.n();
            if (bVarN.g() == null) {
                Intrinsics.checkNotNull(null);
                throw null;
            }
            if (bVarN.j() - j12 < j12) {
                t tVarO = bVarN.o();
                long j13 = bVarN.j();
                while (tVarO != null && j13 > j12) {
                    j13 -= (long) (tVarO.d() - tVarO.h());
                    if (j13 <= j12) {
                        break;
                    }
                    tVarO = tVarO.j();
                }
                Intrinsics.checkNotNull(tVarO);
                int i10 = (int) (j12 - j13);
                int iN = tVarO.n();
                while (true) {
                    if (i10 >= iN) {
                        z11 = false;
                    } else {
                        byte bO = tVarO.o(i10);
                        if (b11 > bO || bO >= b10) {
                            z11 = true;
                        } else {
                            int i11 = 48 - bO;
                            if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i11 < j11)) {
                                b bVar = new b();
                                b0.a(bVar, j10);
                                bVar.m6(bO);
                                if (!z10) {
                                    bVar.readByte();
                                }
                                throw new NumberFormatException("Number too large: " + i0.i(bVar));
                            }
                            j10 = (j10 * 10) + ((long) i11);
                            i10++;
                            j12++;
                            b11 = 48;
                        }
                    }
                }
            } else {
                t tVarG = bVarN.g();
                long j14 = 0;
                while (tVarG != null) {
                    long jD = ((long) (tVarG.d() - tVarG.h())) + j14;
                    if (jD > j12) {
                        break;
                    }
                    tVarG = tVarG.f();
                    j14 = jD;
                }
                Intrinsics.checkNotNull(tVarG);
                int i12 = (int) (j12 - j14);
                int iN2 = tVarG.n();
                while (true) {
                    if (i12 >= iN2) {
                        z11 = false;
                    } else {
                        byte bO2 = tVarG.o(i12);
                        if (48 > bO2 || bO2 >= b10) {
                            z11 = true;
                        } else {
                            int i13 = 48 - bO2;
                            if (j10 < -922337203685477580L || (j10 == -922337203685477580L && i13 < j11)) {
                                b bVar2 = new b();
                                b0.a(bVar2, j10);
                                bVar2.m6(bO2);
                                if (!z10) {
                                    bVar2.readByte();
                                }
                                throw new NumberFormatException("Number too large: " + i0.i(bVar2));
                            }
                            j10 = (j10 * 10) + ((long) i13);
                            i12++;
                            j12++;
                            b10 = 58;
                        }
                    }
                }
            }
            if (z11) {
                break;
            }
            b10 = 58;
            b11 = 48;
        }
        c0Var.skip(j12);
        return z10 ? j10 : -j10;
    }

    public static final double g(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.f312823a;
        return Double.longBitsToDouble(c0Var.readLong());
    }

    public static final double h(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.f312823a;
        return Double.longBitsToDouble(m(c0Var));
    }

    public static final float i(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
        return Float.intBitsToFloat(c0Var.readInt());
    }

    public static final float j(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
        return Float.intBitsToFloat(l(c0Var));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0146 A[LOOP:4: B:54:0x0117->B:70:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x014f A[SYNTHETIC] */
    public static final long k(@NotNull c0 c0Var) {
        int i10;
        long j10;
        byte b10;
        byte b11;
        boolean z10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        c0Var.q1(1L);
        long j11 = 0;
        byte bF = c0Var.n().f(0L);
        byte b12 = 71;
        byte b13 = 65;
        byte b14 = 103;
        if (48 <= bF && bF < 58) {
            i10 = bF - 48;
        } else if (97 <= bF && bF < 103) {
            i10 = bF - 87;
        } else {
            if (65 > bF || bF >= 71) {
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + k0.q(bF));
            }
            i10 = bF + org.msgpack.core.h.a.f339278n;
        }
        long j12 = i10;
        long j13 = 1;
        while (c0Var.request(j13 + 1)) {
            b bVarN = c0Var.n();
            if (bVarN.g() == null) {
                Intrinsics.checkNotNull(null);
                throw null;
            }
            if (bVarN.j() - j13 < j13) {
                t tVarO = bVarN.o();
                long j14 = bVarN.j();
                while (true) {
                    if (tVarO != null && j14 > j13) {
                        j10 = j11;
                        j14 -= (long) (tVarO.d() - tVarO.h());
                        if (j14 <= j13) {
                            break;
                        }
                        tVarO = tVarO.j();
                        j11 = j10;
                    } else {
                        j10 = j11;
                        break;
                    }
                }
                Intrinsics.checkNotNull(tVarO);
                int i13 = (int) (j13 - j14);
                int iN = tVarO.n();
                while (true) {
                    if (i13 >= iN) {
                        z10 = false;
                        break;
                    }
                    byte bO = tVarO.o(i13);
                    if (48 <= bO && bO < 58) {
                        i12 = bO + org.msgpack.core.h.a.f339285u;
                    } else if (97 <= bO && bO < b14) {
                        i12 = bO - 87;
                    } else {
                        if (b13 > bO || bO >= b12) {
                            z10 = true;
                            break;
                        }
                        i12 = bO + org.msgpack.core.h.a.f339278n;
                    }
                    int i14 = i12;
                    if ((j12 & (-1152921504606846976L)) != j10) {
                        b bVar = new b();
                        b0.f(bVar, j12);
                        bVar.m6(bO);
                        throw new NumberFormatException("Number too large: " + i0.i(bVar));
                    }
                    j12 = (j12 << 4) + ((long) i14);
                    j13++;
                    i13++;
                    b12 = 71;
                }
                b10 = b14;
                b11 = 71;
            } else {
                j10 = j11;
                t tVarG = bVarN.g();
                while (tVarG != null) {
                    long jD = ((long) (tVarG.d() - tVarG.h())) + j11;
                    if (jD > j13) {
                        break;
                    }
                    tVarG = tVarG.f();
                    j11 = jD;
                }
                Intrinsics.checkNotNull(tVarG);
                int i15 = (int) (j13 - j11);
                int iN2 = tVarG.n();
                while (true) {
                    if (i15 >= iN2) {
                        b10 = 103;
                        b11 = 71;
                        z10 = false;
                        break;
                    }
                    byte bO2 = tVarG.o(i15);
                    if (48 > bO2 || bO2 >= 58) {
                        b10 = 103;
                        if (97 > bO2 || bO2 >= 103) {
                            b11 = 71;
                            if (65 > bO2 || bO2 >= 71) {
                                z10 = true;
                                break;
                            }
                            i11 = bO2 + org.msgpack.core.h.a.f339278n;
                        } else {
                            i11 = bO2 - 87;
                        }
                        if ((j12 & (-1152921504606846976L)) == j10) {
                            b bVar2 = new b();
                            b0.f(bVar2, j12);
                            bVar2.m6(bO2);
                            throw new NumberFormatException("Number too large: " + i0.i(bVar2));
                        }
                        j12 = (j12 << 4) + ((long) i11);
                        j13++;
                        i15++;
                    } else {
                        i11 = bO2 + org.msgpack.core.h.a.f339285u;
                    }
                    if ((j12 & (-1152921504606846976L)) == j10) {
                        b bVar3 = new b();
                        b0.f(bVar3, j12);
                        bVar3.m6(bO2);
                        throw new NumberFormatException("Number too large: " + i0.i(bVar3));
                    }
                    j12 = (j12 << 4) + ((long) i11);
                    j13++;
                    i15++;
                }
            }
            if (z10) {
                break;
            }
            b12 = b11;
            j11 = j10;
            b14 = b10;
            b13 = 65;
        }
        c0Var.skip(j13);
        return j12;
    }

    public static final int l(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return l0.a(c0Var.readInt());
    }

    public static final long m(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return l0.b(c0Var.readLong());
    }

    public static final short n(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return l0.c(c0Var.readShort());
    }

    public static final void o(@NotNull c0 c0Var, @NotNull byte[] sink, int i10, int i11) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        k0.e(sink.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            int iRc = c0Var.Rc(sink, i12, i11);
            if (iRc == -1) {
                throw new EOFException("Source exhausted before reading " + (i11 - i10) + " bytes. Only " + iRc + " bytes were read.");
            }
            i12 += iRc;
        }
    }

    public static /* synthetic */ void p(c0 c0Var, byte[] bArr, int i10, int i11, int i12, Object obj) throws EOFException {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        o(c0Var, bArr, i10, i11);
    }

    public static final byte q(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return q1.n(c0Var.readByte());
    }

    public static final int r(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return u1.n(c0Var.readInt());
    }

    public static final int s(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return u1.n(l(c0Var));
    }

    public static final long t(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return y1.n(c0Var.readLong());
    }

    public static final long u(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return y1.n(m(c0Var));
    }

    public static final short v(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return e2.n(c0Var.readShort());
    }

    public static final short w(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return e2.n(n(c0Var));
    }

    public static final boolean x(@NotNull c0 c0Var, byte b10) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return c0Var.request(1L) && c0Var.n().f(0L) == b10;
    }
}
