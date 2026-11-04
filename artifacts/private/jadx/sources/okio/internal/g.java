package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.b0;
import okio.e1;
import okio.l0;
import okio.p0;
import okio.s0;
import okio.v0;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
@oj.i(name = "-RealBufferedSource")
public final class g {
    @NotNull
    public static final String A(@NotNull v0 v0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(j10);
        return v0Var.f335120b.u5(j10);
    }

    public static final int B(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(1L);
        byte bI = v0Var.f335120b.I(0L);
        if ((bI & org.msgpack.core.h.a.K) == 192) {
            v0Var.q1(2L);
        } else if ((bI & 240) == 224) {
            v0Var.q1(3L);
        } else if ((bI & 248) == 240) {
            v0Var.q1(4L);
        }
        return v0Var.f335120b.k7();
    }

    @Nullable
    public static final String C(@NotNull v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        long jJ5 = v0Var.j5((byte) 10);
        if (jJ5 != -1) {
            return a.j0(v0Var.f335120b, jJ5);
        }
        if (v0Var.f335120b.size() != 0) {
            return v0Var.u5(v0Var.f335120b.size());
        }
        return null;
    }

    @NotNull
    public static final String D(@NotNull v0 v0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jJ9 = v0Var.J9((byte) 10, 0L, j11);
        if (jJ9 != -1) {
            return a.j0(v0Var.f335120b, jJ9);
        }
        if (j11 < Long.MAX_VALUE && v0Var.request(j11) && v0Var.f335120b.I(j11 - 1) == 13 && v0Var.request(j11 + 1) && v0Var.f335120b.I(j11) == 10) {
            return a.j0(v0Var.f335120b, j11);
        }
        okio.l lVar = new okio.l();
        okio.l lVar2 = v0Var.f335120b;
        lVar2.o(lVar, 0L, Math.min(32, lVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(v0Var.f335120b.size(), j10) + " content=" + lVar.r7().N() + b0.F);
    }

    public static final boolean E(@NotNull v0 v0Var, long j10) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (v0Var.f335120b.size() < j10) {
            if (v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void F(@NotNull v0 v0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (!v0Var.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int G(@NotNull v0 v0Var, @NotNull p0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        do {
            int iL0 = a.l0(v0Var.f335120b, options, true);
            if (iL0 != -2) {
                if (iL0 == -1) {
                    return -1;
                }
                v0Var.f335120b.skip(options.i()[iL0].v0());
                return iL0;
            }
        } while (v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) != -1);
        return -1;
    }

    public static final void H(@NotNull v0 v0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (j10 > 0) {
            if (v0Var.f335120b.size() == 0 && v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, v0Var.f335120b.size());
            v0Var.f335120b.skip(jMin);
            j10 -= jMin;
        }
    }

    @NotNull
    public static final e1 I(@NotNull v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        return v0Var.f335119a.timeout();
    }

    @NotNull
    public static final String J(@NotNull v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        return "buffer(" + v0Var.f335119a + ')';
    }

    public static final void a(@NotNull v0 v0Var) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (v0Var.f335121c) {
            return;
        }
        v0Var.f335121c = true;
        v0Var.f335119a.close();
        v0Var.f335120b.c();
    }

    public static final boolean b(@NotNull v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return v0Var.f335120b.y1() && v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1;
    }

    public static final long c(@NotNull v0 v0Var, byte b10, long j10, long j11) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jJ9 = v0Var.f335120b.J9(b11, jMax, j12);
            if (jJ9 != -1) {
                return jJ9;
            }
            long size = v0Var.f335120b.size();
            if (size >= j12 || v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    public static final long d(@NotNull v0 v0Var, @NotNull okio.o bytes, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (true) {
            long jV1 = v0Var.f335120b.V1(bytes, j10);
            if (jV1 != -1) {
                return jV1;
            }
            long size = v0Var.f335120b.size();
            if (v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) bytes.v0())) + 1);
        }
    }

    public static final long e(@NotNull v0 v0Var, @NotNull okio.o targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (true) {
            long jF5 = v0Var.f335120b.f5(targetBytes, j10);
            if (jF5 != -1) {
                return jF5;
            }
            long size = v0Var.f335120b.size();
            if (v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @NotNull
    public static final okio.n f(@NotNull v0 v0Var) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        return l0.e(new s0(v0Var));
    }

    public static final boolean g(@NotNull v0 v0Var, long j10, @NotNull okio.o bytes, int i10, int i11) {
        int i12;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.v0() - i10 < i11) {
            return false;
        }
        for (0; i12 < i11; i12 + 1) {
            long j11 = ((long) i12) + j10;
            i12 = (v0Var.request(1 + j11) && v0Var.f335120b.I(j11) == bytes.E(i10 + i12)) ? i12 + 1 : 0;
            return false;
        }
        return true;
    }

    public static final int h(@NotNull v0 v0Var, @NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = i11;
        okio.i.e(sink.length, i10, j10);
        if (v0Var.f335120b.size() == 0 && v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
            return -1;
        }
        return v0Var.f335120b.read(sink, i10, (int) Math.min(j10, v0Var.f335120b.size()));
    }

    public static final long i(@NotNull v0 v0Var, @NotNull okio.l sink, long j10) {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (v0Var.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (v0Var.f335120b.size() == 0 && v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
            return -1L;
        }
        return v0Var.f335120b.read(sink, Math.min(j10, v0Var.f335120b.size()));
    }

    public static final long j(@NotNull v0 v0Var, @NotNull z0 sink) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) != -1) {
            long jE = v0Var.f335120b.e();
            if (jE > 0) {
                j10 += jE;
                sink.Ga(v0Var.f335120b, jE);
            }
        }
        if (v0Var.f335120b.size() <= 0) {
            return j10;
        }
        long size = j10 + v0Var.f335120b.size();
        okio.l lVar = v0Var.f335120b;
        sink.Ga(lVar, lVar.size());
        return size;
    }

    public static final byte k(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(1L);
        return v0Var.f335120b.readByte();
    }

    @NotNull
    public static final byte[] l(@NotNull v0 v0Var) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.f335120b.Ma(v0Var.f335119a);
        return v0Var.f335120b.Y5();
    }

    @NotNull
    public static final byte[] m(@NotNull v0 v0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(j10);
        return v0Var.f335120b.tb(j10);
    }

    @NotNull
    public static final okio.o n(@NotNull v0 v0Var) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.f335120b.Ma(v0Var.f335119a);
        return v0Var.f335120b.r7();
    }

    @NotNull
    public static final okio.o o(@NotNull v0 v0Var, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(j10);
        return v0Var.f335120b.E5(j10);
    }

    public static final long p(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!v0Var.request(j11)) {
                break;
            }
            byte bI = v0Var.f335120b.I(j10);
            if ((bI < 48 || bI > 57) && !(j10 == 0 && bI == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a digit or '-' but was 0x");
                String string = Integer.toString(bI, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return v0Var.f335120b.dd();
    }

    public static final void q(@NotNull v0 v0Var, @NotNull okio.l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            v0Var.q1(j10);
            v0Var.f335120b.H9(sink, j10);
        } catch (EOFException e10) {
            sink.Ma(v0Var.f335120b);
            throw e10;
        }
    }

    public static final void r(@NotNull v0 v0Var, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            v0Var.q1(sink.length);
            v0Var.f335120b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (v0Var.f335120b.size() > 0) {
                okio.l lVar = v0Var.f335120b;
                int i11 = lVar.read(sink, i10, (int) lVar.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    public static final long s(@NotNull v0 v0Var) throws EOFException {
        int i10;
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(1L);
        while (true) {
            int i11 = i10 + 1;
            if (!v0Var.request(i11)) {
                break;
            }
            byte bI = v0Var.f335120b.I(i10);
            i10 = ((bI >= 48 && bI <= 57) || (bI >= 97 && bI <= 102) || (bI >= 65 && bI <= 70)) ? i11 : 0;
            if (i10 != 0) {
                break;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected leading [0-9a-fA-F] character but was 0x");
            String string = Integer.toString(bI, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            sb2.append(string);
            throw new NumberFormatException(sb2.toString());
        }
        return v0Var.f335120b.J8();
    }

    public static final int t(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(4L);
        return v0Var.f335120b.readInt();
    }

    public static final int u(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(4L);
        return v0Var.f335120b.fe();
    }

    public static final long v(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(8L);
        return v0Var.f335120b.readLong();
    }

    public static final long w(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(8L);
        return v0Var.f335120b.M4();
    }

    public static final short x(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(2L);
        return v0Var.f335120b.readShort();
    }

    public static final short y(@NotNull v0 v0Var) throws EOFException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.q1(2L);
        return v0Var.f335120b.B4();
    }

    @NotNull
    public static final String z(@NotNull v0 v0Var) throws IOException {
        Intrinsics.checkNotNullParameter(v0Var, "<this>");
        v0Var.f335120b.Ma(v0Var.f335119a);
        return v0Var.f335120b.O7();
    }
}
