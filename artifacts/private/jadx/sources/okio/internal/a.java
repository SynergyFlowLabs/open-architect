package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import androidx.media3.exoplayer.audio.s0;
import androidx.media3.exoplayer.c4;
import com.rabbitmq.client.k0;
import java.io.EOFException;
import java.io.IOException;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b0;
import okio.b1;
import okio.i1;
import okio.p0;
import okio.w0;
import okio.x0;
import okio.y0;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
@oj.i(name = "-Buffer")
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f334923a = i1.a("0123456789abcdef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f334924b = 4096;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f334925c = -922337203685477580L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f334926d = -7;

    public static final void A(@NotNull okio.l lVar, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = lVar.read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public static final long B(@NotNull okio.l lVar) throws EOFException {
        int i10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            w0 w0Var = lVar.f335034a;
            Intrinsics.checkNotNull(w0Var);
            byte[] bArr = w0Var.f335128a;
            int i12 = w0Var.f335129b;
            int i13 = w0Var.f335130c;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 + org.msgpack.core.h.a.f339285u;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + okio.i.u(b10));
                    }
                    i10 = b10 + org.msgpack.core.h.a.f339278n;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new okio.l().q7(j10).writeByte(b10).O7());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                lVar.f335034a = w0Var.b();
                x0.d(w0Var);
            } else {
                w0Var.f335129b = i12;
            }
            if (z10) {
                break;
            }
        } while (lVar.f335034a != null);
        lVar.B0(lVar.size() - ((long) i11));
        return j10;
    }

    public static final int C(@NotNull okio.l lVar) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() < 4) {
            throw new EOFException();
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        if (i11 - i10 < 4) {
            return (lVar.readByte() & 255) | ((lVar.readByte() & 255) << 24) | ((lVar.readByte() & 255) << 16) | ((lVar.readByte() & 255) << 8);
        }
        byte[] bArr = w0Var.f335128a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        lVar.B0(lVar.size() - 4);
        if (i14 != i11) {
            w0Var.f335129b = i14;
            return i15;
        }
        lVar.f335034a = w0Var.b();
        x0.d(w0Var);
        return i15;
    }

    public static final long D(@NotNull okio.l lVar) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() < 8) {
            throw new EOFException();
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        if (i11 - i10 < 8) {
            return ((((long) lVar.readInt()) & k0.f265952a) << 32) | (k0.f265952a & ((long) lVar.readInt()));
        }
        byte[] bArr = w0Var.f335128a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        lVar.B0(lVar.size() - 8);
        if (i13 != i11) {
            w0Var.f335129b = i13;
            return j11;
        }
        lVar.f335034a = w0Var.b();
        x0.d(w0Var);
        return j11;
    }

    public static final short E(@NotNull okio.l lVar) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() < 2) {
            throw new EOFException();
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        if (i11 - i10 < 2) {
            return (short) ((lVar.readByte() & 255) | ((lVar.readByte() & 255) << 8));
        }
        byte[] bArr = w0Var.f335128a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        lVar.B0(lVar.size() - 2);
        if (i14 == i11) {
            lVar.f335034a = w0Var.b();
            x0.d(w0Var);
        } else {
            w0Var.f335129b = i14;
        }
        return (short) i15;
    }

    @NotNull
    public static final okio.l.a F(@NotNull okio.l lVar, @NotNull okio.l.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.l.a aVarN = okio.i.n(unsafeCursor);
        if (aVarN.f335036a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarN.f335036a = lVar;
        aVarN.f335037b = false;
        return aVarN;
    }

    @NotNull
    public static final String G(@NotNull okio.l lVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (lVar.size() < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        if (((long) i10) + j10 > w0Var.f335130c) {
            return n.c(lVar.tb(j10), 0, 0, 3, null);
        }
        int i11 = (int) j10;
        String strB = n.b(w0Var.f335128a, i10, i10 + i11);
        w0Var.f335129b += i11;
        lVar.B0(lVar.size() - j10);
        if (w0Var.f335129b == w0Var.f335130c) {
            lVar.f335034a = w0Var.b();
            x0.d(w0Var);
        }
        return strB;
    }

    public static final int H(@NotNull okio.l lVar) throws EOFException {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() == 0) {
            throw new EOFException();
        }
        byte bI = lVar.I(0L);
        if ((bI & 128) == 0) {
            i10 = bI & 127;
            i12 = 0;
            i11 = 1;
        } else if ((bI & org.msgpack.core.h.a.K) == 192) {
            i10 = bI & com.google.common.base.c.I;
            i11 = 2;
            i12 = 128;
        } else if ((bI & 240) == 224) {
            i10 = bI & com.google.common.base.c.f116464q;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((bI & 248) != 240) {
                lVar.skip(1L);
                return 65533;
            }
            i10 = bI & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (lVar.size() < j10) {
            throw new EOFException("size < " + i11 + ": " + lVar.size() + " (to read code point prefixed 0x" + okio.i.u(bI) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bI2 = lVar.I(j11);
            if ((bI2 & org.msgpack.core.h.a.f339269e) != 128) {
                lVar.skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bI2 & 63);
        }
        lVar.skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @Nullable
    public static final String I(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        long jJ5 = lVar.j5((byte) 10);
        if (jJ5 != -1) {
            return j0(lVar, jJ5);
        }
        if (lVar.size() != 0) {
            return lVar.u5(lVar.size());
        }
        return null;
    }

    @NotNull
    public static final String J(@NotNull okio.l lVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jJ9 = lVar.J9((byte) 10, 0L, j11);
        if (jJ9 != -1) {
            return j0(lVar, jJ9);
        }
        if (j11 < lVar.size() && lVar.I(j11 - 1) == 13 && lVar.I(j11) == 10) {
            return j0(lVar, j11);
        }
        okio.l lVar2 = new okio.l();
        lVar.o(lVar2, 0L, Math.min(32, lVar.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(lVar.size(), j10) + " content=" + lVar2.r7().N() + b0.F);
    }

    public static final long K(@NotNull okio.l.a aVar, long j10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        okio.l lVar = aVar.f335036a;
        if (lVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!aVar.f335037b) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = lVar.size();
        if (j10 <= size) {
            if (j10 < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
            }
            long j11 = size - j10;
            while (j11 > 0) {
                w0 w0Var = lVar.f335034a;
                Intrinsics.checkNotNull(w0Var);
                w0 w0Var2 = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var2);
                int i10 = w0Var2.f335130c;
                long j12 = i10 - w0Var2.f335129b;
                if (j12 > j11) {
                    w0Var2.f335130c = i10 - ((int) j11);
                    break;
                }
                lVar.f335034a = w0Var2.b();
                x0.d(w0Var2);
                j11 -= j12;
            }
            aVar.f(null);
            aVar.f335039d = j10;
            aVar.f335040e = null;
            aVar.f335041f = -1;
            aVar.f335042g = -1;
        } else if (j10 > size) {
            long j13 = j10 - size;
            boolean z10 = true;
            while (j13 > 0) {
                w0 w0VarT0 = lVar.T0(1);
                int iMin = (int) Math.min(j13, 8192 - w0VarT0.f335130c);
                w0VarT0.f335130c += iMin;
                j13 -= (long) iMin;
                if (z10) {
                    aVar.f(w0VarT0);
                    aVar.f335039d = size;
                    aVar.f335040e = w0VarT0.f335128a;
                    int i11 = w0VarT0.f335130c;
                    aVar.f335041f = i11 - iMin;
                    aVar.f335042g = i11;
                    z10 = false;
                }
            }
        }
        lVar.B0(j10);
        return size;
    }

    public static final int L(@NotNull okio.l.a aVar, long j10) {
        w0 w0VarC;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        okio.l lVar = aVar.f335036a;
        if (lVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j10 < -1 || j10 > lVar.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + lVar.size());
        }
        if (j10 == -1 || j10 == lVar.size()) {
            aVar.f(null);
            aVar.f335039d = j10;
            aVar.f335040e = null;
            aVar.f335041f = -1;
            aVar.f335042g = -1;
            return -1;
        }
        long size = lVar.size();
        w0 w0VarB = lVar.f335034a;
        long j11 = 0;
        if (aVar.b() != null) {
            long j12 = aVar.f335039d;
            int i10 = aVar.f335041f;
            w0 w0VarB2 = aVar.b();
            Intrinsics.checkNotNull(w0VarB2);
            long j13 = j12 - ((long) (i10 - w0VarB2.f335129b));
            if (j13 > j10) {
                w0VarC = w0VarB;
                w0VarB = aVar.b();
                size = j13;
            } else {
                w0VarC = aVar.b();
                j11 = j13;
            }
        } else {
            w0VarC = w0VarB;
        }
        if (size - j10 > j10 - j11) {
            while (true) {
                Intrinsics.checkNotNull(w0VarC);
                int i11 = w0VarC.f335130c;
                int i12 = w0VarC.f335129b;
                if (j10 < ((long) (i11 - i12)) + j11) {
                    break;
                }
                j11 += (long) (i11 - i12);
                w0VarC = w0VarC.f335133f;
            }
        } else {
            while (size > j10) {
                Intrinsics.checkNotNull(w0VarB);
                w0VarB = w0VarB.f335134g;
                Intrinsics.checkNotNull(w0VarB);
                size -= (long) (w0VarB.f335130c - w0VarB.f335129b);
            }
            j11 = size;
            w0VarC = w0VarB;
        }
        if (aVar.f335037b) {
            Intrinsics.checkNotNull(w0VarC);
            if (w0VarC.f335131d) {
                w0 w0VarF = w0VarC.f();
                if (lVar.f335034a == w0VarC) {
                    lVar.f335034a = w0VarF;
                }
                w0VarC = w0VarC.c(w0VarF);
                w0 w0Var = w0VarC.f335134g;
                Intrinsics.checkNotNull(w0Var);
                w0Var.b();
            }
        }
        aVar.f(w0VarC);
        aVar.f335039d = j10;
        Intrinsics.checkNotNull(w0VarC);
        aVar.f335040e = w0VarC.f335128a;
        int i13 = w0VarC.f335129b + ((int) (j10 - j11));
        aVar.f335041f = i13;
        int i14 = w0VarC.f335130c;
        aVar.f335042g = i14;
        return i14 - i13;
    }

    public static final int M(@NotNull okio.l lVar, @NotNull p0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int i10 = 7 ^ 2;
        int iM0 = m0(lVar, options, false, 2, null);
        if (iM0 == -1) {
            return -1;
        }
        lVar.skip(options.i()[iM0].v0());
        return iM0;
    }

    public static final void N(@NotNull okio.l lVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        while (j10 > 0) {
            w0 w0Var = lVar.f335034a;
            if (w0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, w0Var.f335130c - w0Var.f335129b);
            long j11 = iMin;
            lVar.B0(lVar.size() - j11);
            j10 -= j11;
            int i10 = w0Var.f335129b + iMin;
            w0Var.f335129b = i10;
            if (i10 == w0Var.f335130c) {
                lVar.f335034a = w0Var.b();
                x0.d(w0Var);
            }
        }
    }

    @NotNull
    public static final okio.o O(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() <= g3.f12256c) {
            return lVar.R0((int) lVar.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + lVar.size()).toString());
    }

    @NotNull
    public static final okio.o P(@NotNull okio.l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (i10 == 0) {
            return okio.o.f335048f;
        }
        okio.i.e(lVar.size(), 0L, i10);
        w0 w0Var = lVar.f335034a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(w0Var);
            int i14 = w0Var.f335130c;
            int i15 = w0Var.f335129b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            w0Var = w0Var.f335133f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        w0 w0Var2 = lVar.f335034a;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(w0Var2);
            bArr[i16] = w0Var2.f335128a;
            i11 += w0Var2.f335130c - w0Var2.f335129b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = w0Var2.f335129b;
            w0Var2.f335131d = true;
            i16++;
            w0Var2 = w0Var2.f335133f;
        }
        return new y0(bArr, iArr);
    }

    @NotNull
    public static final w0 Q(@NotNull okio.l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w0 w0Var = lVar.f335034a;
        if (w0Var != null) {
            Intrinsics.checkNotNull(w0Var);
            w0 w0Var2 = w0Var.f335134g;
            Intrinsics.checkNotNull(w0Var2);
            return (w0Var2.f335130c + i10 > 8192 || !w0Var2.f335132e) ? w0Var2.c(x0.e()) : w0Var2;
        }
        w0 w0VarE = x0.e();
        lVar.f335034a = w0VarE;
        w0VarE.f335134g = w0VarE;
        w0VarE.f335133f = w0VarE;
        return w0VarE;
    }

    @NotNull
    public static final okio.l R(@NotNull okio.l lVar, @NotNull okio.o byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.I0(lVar, i10, i11);
        return lVar;
    }

    @NotNull
    public static final okio.l S(@NotNull okio.l lVar, @NotNull b1 source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(lVar, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return lVar;
    }

    @NotNull
    public static final okio.l T(@NotNull okio.l lVar, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return lVar.write(source, 0, source.length);
    }

    @NotNull
    public static final okio.l U(@NotNull okio.l lVar, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        okio.i.e(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            w0 w0VarT0 = lVar.T0(1);
            int iMin = Math.min(i12 - i10, 8192 - w0VarT0.f335130c);
            int i13 = i10 + iMin;
            ArraysKt.copyInto(source, w0VarT0.f335128a, w0VarT0.f335130c, i10, i13);
            w0VarT0.f335130c += iMin;
            i10 = i13;
        }
        lVar.B0(lVar.size() + j10);
        return lVar;
    }

    public static final void V(@NotNull okio.l lVar, @NotNull okio.l source, long j10) {
        w0 w0Var;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == lVar) {
            throw new IllegalArgumentException("source == this");
        }
        okio.i.e(source.size(), 0L, j10);
        while (j10 > 0) {
            w0 w0Var2 = source.f335034a;
            Intrinsics.checkNotNull(w0Var2);
            int i10 = w0Var2.f335130c;
            w0 w0Var3 = source.f335034a;
            Intrinsics.checkNotNull(w0Var3);
            if (j10 < i10 - w0Var3.f335129b) {
                w0 w0Var4 = lVar.f335034a;
                if (w0Var4 != null) {
                    Intrinsics.checkNotNull(w0Var4);
                    w0Var = w0Var4.f335134g;
                } else {
                    w0Var = null;
                }
                if (w0Var != null && w0Var.f335132e) {
                    if ((((long) w0Var.f335130c) + j10) - ((long) (w0Var.f335131d ? 0 : w0Var.f335129b)) <= PlaybackStateCompat.f9665p2) {
                        w0 w0Var5 = source.f335034a;
                        Intrinsics.checkNotNull(w0Var5);
                        w0Var5.g(w0Var, (int) j10);
                        source.B0(source.size() - j10);
                        lVar.B0(lVar.size() + j10);
                        return;
                    }
                }
                w0 w0Var6 = source.f335034a;
                Intrinsics.checkNotNull(w0Var6);
                source.f335034a = w0Var6.e((int) j10);
            }
            w0 w0Var7 = source.f335034a;
            Intrinsics.checkNotNull(w0Var7);
            long j11 = w0Var7.f335130c - w0Var7.f335129b;
            source.f335034a = w0Var7.b();
            w0 w0Var8 = lVar.f335034a;
            if (w0Var8 == null) {
                lVar.f335034a = w0Var7;
                w0Var7.f335134g = w0Var7;
                w0Var7.f335133f = w0Var7;
            } else {
                Intrinsics.checkNotNull(w0Var8);
                w0 w0Var9 = w0Var8.f335134g;
                Intrinsics.checkNotNull(w0Var9);
                w0Var9.c(w0Var7).a();
            }
            source.B0(source.size() - j11);
            lVar.B0(lVar.size() + j11);
            j10 -= j11;
        }
    }

    public static /* synthetic */ okio.l W(okio.l lVar, okio.o byteString, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteString.v0();
        }
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.I0(lVar, i10, i11);
        return lVar;
    }

    public static final long X(@NotNull okio.l lVar, @NotNull b1 source) throws IOException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(lVar, PlaybackStateCompat.f9665p2);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @NotNull
    public static final okio.l Y(@NotNull okio.l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        int i11 = 2 | 1;
        w0 w0VarT0 = lVar.T0(1);
        byte[] bArr = w0VarT0.f335128a;
        int i12 = w0VarT0.f335130c;
        w0VarT0.f335130c = i12 + 1;
        bArr[i12] = (byte) i10;
        lVar.B0(lVar.size() + 1);
        return lVar;
    }

    @NotNull
    public static final okio.l Z(@NotNull okio.l lVar, long j10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 == 0) {
            return lVar.writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return lVar.pa("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < s0.f63372z ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < c4.f63520s) {
            if (j10 < okhttp3.internal.connection.f.f334128w) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        w0 w0VarT0 = lVar.T0(i10);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = g0()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        w0VarT0.f335130c += i10;
        lVar.B0(lVar.size() + ((long) i10));
        return lVar;
    }

    public static final void a(@NotNull okio.l lVar) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        lVar.skip(lVar.size());
    }

    @NotNull
    public static final okio.l a0(@NotNull okio.l lVar, long j10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 == 0) {
            return lVar.writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        w0 w0VarT0 = lVar.T0(i10);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = g0()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        w0VarT0.f335130c += i10;
        lVar.B0(lVar.size() + ((long) i10));
        return lVar;
    }

    public static final void b(@NotNull okio.l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar.f335036a == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        aVar.f335036a = null;
        aVar.f(null);
        aVar.f335039d = -1L;
        aVar.f335040e = null;
        aVar.f335041f = -1;
        aVar.f335042g = -1;
    }

    @NotNull
    public static final okio.l b0(@NotNull okio.l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        w0 w0VarT0 = lVar.T0(4);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        w0VarT0.f335130c = i11 + 4;
        lVar.B0(lVar.size() + 4);
        return lVar;
    }

    public static final long c(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        long size = lVar.size();
        if (size == 0) {
            return 0L;
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        w0 w0Var2 = w0Var.f335134g;
        Intrinsics.checkNotNull(w0Var2);
        int i10 = w0Var2.f335130c;
        return (i10 >= 8192 || !w0Var2.f335132e) ? size : size - ((long) (i10 - w0Var2.f335129b));
    }

    @NotNull
    public static final okio.l c0(@NotNull okio.l lVar, long j10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        w0 w0VarT0 = lVar.T0(8);
        byte[] bArr = w0VarT0.f335128a;
        int i10 = w0VarT0.f335130c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        w0VarT0.f335130c = i10 + 8;
        lVar.B0(lVar.size() + 8);
        return lVar;
    }

    @NotNull
    public static final okio.l d(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        okio.l lVar2 = new okio.l();
        if (lVar.size() == 0) {
            return lVar2;
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        w0 w0VarD = w0Var.d();
        lVar2.f335034a = w0VarD;
        w0VarD.f335134g = w0VarD;
        w0VarD.f335133f = w0VarD;
        for (w0 w0Var2 = w0Var.f335133f; w0Var2 != w0Var; w0Var2 = w0Var2.f335133f) {
            w0 w0Var3 = w0VarD.f335134g;
            Intrinsics.checkNotNull(w0Var3);
            Intrinsics.checkNotNull(w0Var2);
            w0Var3.c(w0Var2.d());
        }
        lVar2.B0(lVar.size());
        return lVar2;
    }

    @NotNull
    public static final okio.l d0(@NotNull okio.l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        w0 w0VarT0 = lVar.T0(2);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        w0VarT0.f335130c = i11 + 2;
        lVar.B0(lVar.size() + 2);
        return lVar;
    }

    @NotNull
    public static final okio.l e(@NotNull okio.l lVar, @NotNull okio.l out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        okio.i.e(lVar.size(), j12, j11);
        if (j11 != 0) {
            out.B0(out.size() + j11);
            w0 w0Var = lVar.f335034a;
            while (true) {
                Intrinsics.checkNotNull(w0Var);
                int i10 = w0Var.f335130c;
                int i11 = w0Var.f335129b;
                if (j12 < i10 - i11) {
                    break;
                }
                j12 -= (long) (i10 - i11);
                w0Var = w0Var.f335133f;
            }
            w0 w0Var2 = w0Var;
            long j13 = j11;
            while (j13 > 0) {
                Intrinsics.checkNotNull(w0Var2);
                w0 w0VarD = w0Var2.d();
                int i12 = w0VarD.f335129b + ((int) j12);
                w0VarD.f335129b = i12;
                w0VarD.f335130c = Math.min(i12 + ((int) j13), w0VarD.f335130c);
                w0 w0Var3 = out.f335034a;
                if (w0Var3 == null) {
                    w0VarD.f335134g = w0VarD;
                    w0VarD.f335133f = w0VarD;
                    out.f335034a = w0VarD;
                } else {
                    Intrinsics.checkNotNull(w0Var3);
                    w0 w0Var4 = w0Var3.f335134g;
                    Intrinsics.checkNotNull(w0Var4);
                    w0Var4.c(w0VarD);
                }
                j13 -= (long) (w0VarD.f335130c - w0VarD.f335129b);
                w0Var2 = w0Var2.f335133f;
                j12 = 0;
            }
        }
        return lVar;
    }

    @NotNull
    public static final okio.l e0(@NotNull okio.l lVar, @NotNull String string, int i10, int i11) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                w0 w0VarT0 = lVar.T0(1);
                byte[] bArr = w0VarT0.f335128a;
                int i12 = w0VarT0.f335130c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = w0VarT0.f335130c;
                int i15 = (i12 + i10) - i14;
                w0VarT0.f335130c = i14 + i15;
                lVar.B0(lVar.size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    w0 w0VarT1 = lVar.T0(2);
                    byte[] bArr2 = w0VarT1.f335128a;
                    int i16 = w0VarT1.f335130c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    w0VarT1.f335130c = i16 + 2;
                    lVar.B0(lVar.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    w0 w0VarT2 = lVar.T0(3);
                    byte[] bArr3 = w0VarT2.f335128a;
                    int i17 = w0VarT2.f335130c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    w0VarT2.f335130c = i17 + 3;
                    lVar.B0(lVar.size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        lVar.writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        w0 w0VarT3 = lVar.T0(4);
                        byte[] bArr4 = w0VarT3.f335128a;
                        int i20 = w0VarT3.f335130c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        w0VarT3.f335130c = i20 + 4;
                        lVar.B0(lVar.size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return lVar;
    }

    public static final boolean f(@NotNull okio.l lVar, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar == obj) {
            return true;
        }
        if (!(obj instanceof okio.l)) {
            return false;
        }
        okio.l lVar2 = (okio.l) obj;
        if (lVar.size() != lVar2.size()) {
            return false;
        }
        if (lVar.size() == 0) {
            return true;
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        w0 w0Var2 = lVar2.f335034a;
        Intrinsics.checkNotNull(w0Var2);
        int i10 = w0Var.f335129b;
        int i11 = w0Var2.f335129b;
        long j10 = 0;
        while (j10 < lVar.size()) {
            long jMin = Math.min(w0Var.f335130c - i10, w0Var2.f335130c - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (w0Var.f335128a[i10] != w0Var2.f335128a[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == w0Var.f335130c) {
                w0Var = w0Var.f335133f;
                Intrinsics.checkNotNull(w0Var);
                i10 = w0Var.f335129b;
            }
            if (i11 == w0Var2.f335130c) {
                w0Var2 = w0Var2.f335133f;
                Intrinsics.checkNotNull(w0Var2);
                i11 = w0Var2.f335129b;
            }
            j10 += jMin;
        }
        return true;
    }

    @NotNull
    public static final okio.l f0(@NotNull okio.l lVar, int i10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (i10 < 128) {
            lVar.writeByte(i10);
            return lVar;
        }
        if (i10 < 2048) {
            w0 w0VarT0 = lVar.T0(2);
            byte[] bArr = w0VarT0.f335128a;
            int i11 = w0VarT0.f335130c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            w0VarT0.f335130c = i11 + 2;
            lVar.B0(lVar.size() + 2);
            return lVar;
        }
        if (55296 <= i10 && i10 < 57344) {
            lVar.writeByte(63);
            return lVar;
        }
        if (i10 < 65536) {
            w0 w0VarT1 = lVar.T0(3);
            byte[] bArr2 = w0VarT1.f335128a;
            int i12 = w0VarT1.f335130c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            w0VarT1.f335130c = i12 + 3;
            lVar.B0(lVar.size() + 3);
            return lVar;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + okio.i.v(i10));
        }
        w0 w0VarT2 = lVar.T0(4);
        byte[] bArr3 = w0VarT2.f335128a;
        int i13 = w0VarT2.f335130c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        w0VarT2.f335130c = i13 + 4;
        lVar.B0(lVar.size() + 4);
        return lVar;
    }

    public static final long g(@NotNull okio.l.a aVar, int i10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (i10 <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i10).toString());
        }
        if (i10 > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i10).toString());
        }
        okio.l lVar = aVar.f335036a;
        if (lVar == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!aVar.f335037b) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = lVar.size();
        w0 w0VarT0 = lVar.T0(i10);
        int i11 = 8192 - w0VarT0.f335130c;
        w0VarT0.f335130c = 8192;
        long j10 = i11;
        lVar.B0(size + j10);
        aVar.f(w0VarT0);
        aVar.f335039d = size;
        aVar.f335040e = w0VarT0.f335128a;
        aVar.f335041f = 8192 - i11;
        aVar.f335042g = 8192;
        return j10;
    }

    @NotNull
    public static final byte[] g0() {
        return f334923a;
    }

    public static final byte h(@NotNull okio.l lVar, long j10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        okio.i.e(lVar.size(), j10, 1L);
        w0 w0Var = lVar.f335034a;
        if (w0Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (lVar.size() - j10 < j10) {
            long size = lVar.size();
            while (size > j10) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            Intrinsics.checkNotNull(w0Var);
            return w0Var.f335128a[(int) ((((long) w0Var.f335129b) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (w0Var.f335130c - w0Var.f335129b)) + j11;
            if (j12 > j10) {
                Intrinsics.checkNotNull(w0Var);
                return w0Var.f335128a[(int) ((((long) w0Var.f335129b) + j10) - j11)];
            }
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            j11 = j12;
        }
    }

    public static /* synthetic */ void h0() {
    }

    public static final int i(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        w0 w0Var = lVar.f335034a;
        if (w0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = w0Var.f335130c;
            for (int i12 = w0Var.f335129b; i12 < i11; i12++) {
                i10 = (i10 * 31) + w0Var.f335128a[i12];
            }
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
        } while (w0Var != lVar.f335034a);
        return i10;
    }

    public static final boolean i0(@NotNull w0 segment, int i10, @NotNull byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f335130c;
        byte[] bArr = segment.f335128a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f335133f;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.f335128a;
                bArr = bArr2;
                i10 = segment.f335129b;
                i13 = segment.f335130c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final long j(@NotNull okio.l lVar, byte b10, long j10, long j11) {
        w0 w0Var;
        int i10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + lVar.size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > lVar.size()) {
            j11 = lVar.size();
        }
        if (j10 == j11 || (w0Var = lVar.f335034a) == null) {
            return -1L;
        }
        if (lVar.size() - j10 < j10) {
            size = lVar.size();
            while (size > j10) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            while (size < j11) {
                byte[] bArr = w0Var.f335128a;
                int iMin = (int) Math.min(w0Var.f335130c, (((long) w0Var.f335129b) + j11) - size);
                i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (w0Var.f335130c - w0Var.f335129b);
                w0Var = w0Var.f335133f;
                Intrinsics.checkNotNull(w0Var);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (w0Var.f335130c - w0Var.f335129b)) + size;
            if (j12 > j10) {
                break;
            }
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = w0Var.f335128a;
            int iMin2 = (int) Math.min(w0Var.f335130c, (((long) w0Var.f335129b) + j11) - size);
            i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (w0Var.f335130c - w0Var.f335129b);
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - w0Var.f335129b)) + size;
    }

    @NotNull
    public static final String j0(@NotNull okio.l lVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (lVar.I(j11) == 13) {
                String strU5 = lVar.u5(j11);
                lVar.skip(2L);
                return strU5;
            }
        }
        String strU6 = lVar.u5(j10);
        lVar.skip(1L);
        return strU6;
    }

    public static final long k(@NotNull okio.l lVar, @NotNull okio.o bytes, long j10) {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.v0() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        w0 w0Var = lVar.f335034a;
        if (w0Var == null) {
            return -1L;
        }
        if (lVar.size() - j11 < j11) {
            size = lVar.size();
            while (size > j11) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            byte[] bArrA0 = bytes.a0();
            byte b10 = bArrA0[0];
            int iV0 = bytes.v0();
            long size2 = (lVar.size() - ((long) iV0)) + 1;
            while (size < size2) {
                byte[] bArr = w0Var.f335128a;
                int iMin = (int) Math.min(w0Var.f335130c, (((long) w0Var.f335129b) + size2) - size);
                i10 = (int) ((((long) w0Var.f335129b) + j11) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10 || !i0(w0Var, i10 + 1, bArrA0, 1, iV0)) {
                        i10++;
                    }
                }
                size += (long) (w0Var.f335130c - w0Var.f335129b);
                w0Var = w0Var.f335133f;
                Intrinsics.checkNotNull(w0Var);
                j11 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (w0Var.f335130c - w0Var.f335129b)) + size;
            if (j12 > j11) {
                break;
            }
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            size = j12;
        }
        byte[] bArrA1 = bytes.a0();
        byte b11 = bArrA1[0];
        int iV1 = bytes.v0();
        long size3 = (lVar.size() - ((long) iV1)) + 1;
        while (size < size3) {
            byte[] bArr2 = w0Var.f335128a;
            long j13 = size3;
            int iMin2 = (int) Math.min(w0Var.f335130c, (((long) w0Var.f335129b) + size3) - size);
            i10 = (int) ((((long) w0Var.f335129b) + j11) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] == b11 && i0(w0Var, i10 + 1, bArrA1, 1, iV1)) {
                }
                i10++;
            }
            size += (long) (w0Var.f335130c - w0Var.f335129b);
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            size3 = j13;
            j11 = size;
        }
        return -1L;
        return ((long) (i10 - w0Var.f335129b)) + size;
    }

    public static final <T> T k0(@NotNull okio.l lVar, long j10, @NotNull Function2<? super w0, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        w0 w0Var = lVar.f335034a;
        if (w0Var == null) {
            return lambda.invoke(null, -1L);
        }
        if (lVar.size() - j10 < j10) {
            long size = lVar.size();
            while (size > j10) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            return lambda.invoke(w0Var, Long.valueOf(size));
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (w0Var.f335130c - w0Var.f335129b)) + j11;
            if (j12 > j10) {
                return lambda.invoke(w0Var, Long.valueOf(j11));
            }
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            j11 = j12;
        }
    }

    public static final long l(@NotNull okio.l lVar, @NotNull okio.o targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        w0 w0Var = lVar.f335034a;
        if (w0Var == null) {
            return -1L;
        }
        if (lVar.size() - j10 < j10) {
            size = lVar.size();
            while (size > j10) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            if (targetBytes.v0() == 2) {
                byte bE = targetBytes.E(0);
                byte bE2 = targetBytes.E(1);
                while (size < lVar.size()) {
                    byte[] bArr = w0Var.f335128a;
                    i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
                    int i12 = w0Var.f335130c;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (w0Var.f335130c - w0Var.f335129b);
                            w0Var = w0Var.f335133f;
                            Intrinsics.checkNotNull(w0Var);
                            j10 = size;
                        } else {
                            byte b10 = bArr[i10];
                            if (b10 == bE || b10 == bE2) {
                                i11 = w0Var.f335129b;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrA0 = targetBytes.a0();
                while (size < lVar.size()) {
                    byte[] bArr2 = w0Var.f335128a;
                    i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
                    int i13 = w0Var.f335130c;
                    while (true) {
                        if (i10 < i13) {
                            byte b11 = bArr2[i10];
                            int length = bArrA0.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b11 == bArrA0[i14]) {
                                    i11 = w0Var.f335129b;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (w0Var.f335130c - w0Var.f335129b);
                            w0Var = w0Var.f335133f;
                            Intrinsics.checkNotNull(w0Var);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (w0Var.f335130c - w0Var.f335129b)) + size;
            if (j11 > j10) {
                break;
            }
            w0Var = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var);
            size = j11;
        }
        if (targetBytes.v0() == 2) {
            byte bE3 = targetBytes.E(0);
            byte bE4 = targetBytes.E(1);
            while (size < lVar.size()) {
                byte[] bArr3 = w0Var.f335128a;
                i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
                int i15 = w0Var.f335130c;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (w0Var.f335130c - w0Var.f335129b);
                        w0Var = w0Var.f335133f;
                        Intrinsics.checkNotNull(w0Var);
                        j10 = size;
                    } else {
                        byte b12 = bArr3[i10];
                        if (b12 == bE3 || b12 == bE4) {
                            i11 = w0Var.f335129b;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrA1 = targetBytes.a0();
            while (size < lVar.size()) {
                byte[] bArr4 = w0Var.f335128a;
                i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
                int i16 = w0Var.f335130c;
                while (true) {
                    if (i10 < i16) {
                        byte b13 = bArr4[i10];
                        int length2 = bArrA1.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b13 == bArrA1[i17]) {
                                i11 = w0Var.f335129b;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (w0Var.f335130c - w0Var.f335129b);
                        w0Var = w0Var.f335133f;
                        Intrinsics.checkNotNull(w0Var);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[LOOP:0: B:8:0x002a->B:46:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2 A[SYNTHETIC] */
    public static final int l0(@NotNull okio.l lVar, @NotNull p0 options, boolean z10) {
        int i10;
        int i11;
        w0 w0Var;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        w0 w0Var2 = lVar.f335034a;
        if (w0Var2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = w0Var2.f335128a;
        int i14 = w0Var2.f335129b;
        int i15 = w0Var2.f335130c;
        int[] iArrK = options.k();
        w0 w0Var3 = w0Var2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = iArrK[i17];
            int i20 = i17 + 2;
            int i21 = iArrK[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (w0Var3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == iArrK[i20]) {
                        i11 = iArrK[i20 + i19];
                        if (i10 == i15) {
                            w0Var3 = w0Var3.f335133f;
                            Intrinsics.checkNotNull(w0Var3);
                            i10 = w0Var3.f335129b;
                            bArr = w0Var3.f335128a;
                            i15 = w0Var3.f335130c;
                            if (w0Var3 == w0Var2) {
                                w0Var3 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) == iArrK[i20]) {
                    boolean z11 = i26 == i24;
                    if (i25 == i15) {
                        Intrinsics.checkNotNull(w0Var3);
                        w0 w0Var4 = w0Var3.f335133f;
                        Intrinsics.checkNotNull(w0Var4);
                        i13 = w0Var4.f335129b;
                        byte[] bArr2 = w0Var4.f335128a;
                        i12 = w0Var4.f335130c;
                        if (w0Var4 != w0Var2) {
                            w0Var = w0Var4;
                            bArr = bArr2;
                        } else {
                            if (!z11) {
                                break loop0;
                            }
                            bArr = bArr2;
                            w0Var = null;
                        }
                    } else {
                        w0Var = w0Var3;
                        i12 = i15;
                        i13 = i25;
                    }
                    if (z11) {
                        i11 = iArrK[i26];
                        i10 = i13;
                        i15 = i12;
                        w0Var3 = w0Var;
                        break;
                    }
                    i14 = i13;
                    i15 = i12;
                    w0Var3 = w0Var;
                    i20 = i26;
                }
                return i16;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static final int m(@NotNull okio.l.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        long j10 = aVar.f335039d;
        okio.l lVar = aVar.f335036a;
        Intrinsics.checkNotNull(lVar);
        if (j10 == lVar.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j11 = aVar.f335039d;
        return aVar.e(j11 == -1 ? 0L : j11 + ((long) (aVar.f335042g - aVar.f335041f)));
    }

    public static /* synthetic */ int m0(okio.l lVar, p0 p0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return l0(lVar, p0Var, z10);
    }

    public static final boolean n(@NotNull okio.l lVar, long j10, @NotNull okio.o bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 >= 0 && i10 >= 0 && i11 >= 0 && lVar.size() - j10 >= i11 && bytes.v0() - i10 >= i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                if (lVar.I(((long) i12) + j10) != bytes.E(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static final int o(@NotNull okio.l lVar, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return lVar.read(sink, 0, sink.length);
    }

    public static final int p(@NotNull okio.l lVar, @NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        okio.i.e(sink.length, i10, i11);
        w0 w0Var = lVar.f335034a;
        if (w0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, w0Var.f335130c - w0Var.f335129b);
        byte[] bArr = w0Var.f335128a;
        int i12 = w0Var.f335129b;
        ArraysKt.copyInto(bArr, sink, i10, i12, i12 + iMin);
        w0Var.f335129b += iMin;
        lVar.B0(lVar.size() - ((long) iMin));
        if (w0Var.f335129b == w0Var.f335130c) {
            lVar.f335034a = w0Var.b();
            x0.d(w0Var);
        }
        return iMin;
    }

    public static final long q(@NotNull okio.l lVar, @NotNull okio.l sink, long j10) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (lVar.size() == 0) {
            return -1L;
        }
        if (j10 > lVar.size()) {
            j10 = lVar.size();
        }
        sink.Ga(lVar, j10);
        return j10;
    }

    public static final long r(@NotNull okio.l lVar, @NotNull z0 sink) throws IOException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = lVar.size();
        if (size > 0) {
            sink.Ga(lVar, size);
        }
        return size;
    }

    @NotNull
    public static final okio.l.a s(@NotNull okio.l lVar, @NotNull okio.l.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.l.a aVarN = okio.i.n(unsafeCursor);
        if (aVarN.f335036a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        aVarN.f335036a = lVar;
        aVarN.f335037b = true;
        return aVarN;
    }

    public static final byte t(@NotNull okio.l lVar) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (lVar.size() == 0) {
            throw new EOFException();
        }
        w0 w0Var = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        int i12 = i10 + 1;
        byte b10 = w0Var.f335128a[i10];
        lVar.B0(lVar.size() - 1);
        if (i12 != i11) {
            w0Var.f335129b = i12;
            return b10;
        }
        lVar.f335034a = w0Var.b();
        x0.d(w0Var);
        return b10;
    }

    @NotNull
    public static final byte[] u(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return lVar.tb(lVar.size());
    }

    @NotNull
    public static final byte[] v(@NotNull okio.l lVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (lVar.size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        lVar.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final okio.o w(@NotNull okio.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return lVar.E5(lVar.size());
    }

    @NotNull
    public static final okio.o x(@NotNull okio.l lVar, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (lVar.size() < j10) {
            throw new EOFException();
        }
        if (j10 < PlaybackStateCompat.H1) {
            return new okio.o(lVar.tb(j10));
        }
        okio.o oVarR0 = lVar.R0((int) j10);
        lVar.skip(j10);
        return oVarR0;
    }

    public static final long y(@NotNull okio.l lVar) throws EOFException {
        long j10;
        byte b10;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        long j11 = 0;
        if (lVar.size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            w0 w0Var = lVar.f335034a;
            Intrinsics.checkNotNull(w0Var);
            byte[] bArr = w0Var.f335128a;
            int i11 = w0Var.f335129b;
            int i12 = w0Var.f335130c;
            while (true) {
                if (i11 >= i12) {
                    j10 = j11;
                    break;
                }
                b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j12 < -922337203685477580L) {
                        break loop0;
                    }
                    j10 = j11;
                    if (j12 == -922337203685477580L && i13 < j13) {
                        break loop0;
                    }
                    j12 = (j12 * 10) + ((long) i13);
                } else {
                    j10 = j11;
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j13--;
                    z10 = true;
                }
                i11++;
                i10++;
                j11 = j10;
            }
            if (i11 == i12) {
                lVar.f335034a = w0Var.b();
                x0.d(w0Var);
            } else {
                w0Var.f335129b = i11;
            }
            if (z11 || lVar.f335034a == null) {
                lVar.B0(lVar.size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (lVar.size() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + okio.i.u(lVar.I(j10)));
            }
            j11 = j10;
        }
        okio.l lVarH1 = new okio.l().h5(j12).writeByte(b10);
        if (!z10) {
            lVarH1.readByte();
        }
        throw new NumberFormatException("Number too large: " + lVarH1.O7());
    }

    public static final void z(@NotNull okio.l lVar, @NotNull okio.l sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (lVar.size() >= j10) {
            sink.Ga(lVar, j10);
        } else {
            sink.Ga(lVar, lVar.size());
            throw new EOFException();
        }
    }
}
