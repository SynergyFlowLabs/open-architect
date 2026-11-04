package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BufferedSource.kt\nokio/internal/-BufferedSource\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,186:1\n62#1:192\n62#1:202\n62#1:209\n62#1:215\n62#1:217\n62#1:221\n62#1:226\n62#1:244\n62#1:248\n62#1:255\n62#1:268\n62#1:276\n62#1:277\n62#1:278\n62#1:284\n62#1:292\n62#1:305\n62#1:309\n62#1:310\n62#1:311\n62#1:312\n62#1:317\n62#1:329\n62#1:345\n62#1:355\n62#1:358\n62#1:361\n62#1:364\n62#1:367\n62#1:370\n62#1:376\n62#1:393\n62#1:413\n62#1:428\n62#1:445\n62#1:458\n62#1:479\n62#1:486\n38#2:187\n39#2,3:189\n42#2,6:193\n51#2:199\n52#2:201\n56#2,2:203\n60#2:205\n61#2,2:207\n63#2,3:210\n69#2,2:213\n74#2:216\n75#2:218\n79#2,2:219\n84#2:222\n86#2,2:224\n88#2,13:227\n107#2:243\n108#2:245\n112#2,2:246\n117#2,6:249\n123#2,9:256\n134#2,3:265\n137#2,5:269\n142#2:275\n146#2,5:279\n151#2,5:285\n158#2,2:290\n160#2,11:293\n174#2:304\n175#2:306\n179#2,2:307\n184#2,4:313\n188#2,6:318\n198#2:324\n199#2,3:326\n202#2,8:330\n210#2,3:339\n217#2,3:342\n220#2,7:346\n230#2,2:353\n235#2,2:356\n240#2,2:359\n245#2,2:362\n250#2,2:365\n255#2,2:368\n260#2,5:371\n265#2,11:377\n279#2,5:388\n284#2,14:394\n301#2,2:408\n303#2,2:411\n305#2,7:414\n314#2,2:421\n316#2,4:424\n320#2,11:429\n334#2,2:440\n337#2,2:443\n339#2,7:446\n350#2,2:453\n353#2,2:456\n355#2,7:459\n371#2:466\n373#2,11:468\n385#2:480\n389#2:481\n393#2,4:482\n397#2:487\n399#2:488\n401#2:489\n1#3:188\n1#3:200\n1#3:206\n1#3:223\n1#3:325\n1#3:410\n1#3:423\n1#3:442\n1#3:455\n1#3:467\n26#4,3:240\n89#5:274\n89#5:338\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:192\n67#1:202\n69#1:209\n70#1:215\n71#1:217\n72#1:221\n73#1:226\n75#1:244\n76#1:248\n78#1:255\n80#1:268\n83#1:276\n84#1:277\n88#1:278\n91#1:284\n92#1:292\n93#1:305\n94#1:309\n97#1:310\n98#1:311\n103#1:312\n106#1:317\n108#1:329\n109#1:345\n110#1:355\n111#1:358\n112#1:361\n113#1:364\n114#1:367\n115#1:370\n116#1:376\n117#1:393\n118#1:413\n122#1:428\n125#1:445\n128#1:458\n142#1:479\n182#1:486\n66#1:187\n66#1:189,3\n66#1:193,6\n67#1:199\n67#1:201\n68#1:203,2\n69#1:205\n69#1:207,2\n69#1:210,3\n70#1:213,2\n71#1:216\n71#1:218\n72#1:219,2\n73#1:222\n73#1:224,2\n73#1:227,13\n75#1:243\n75#1:245\n76#1:246,2\n78#1:249,6\n78#1:256,9\n80#1:265,3\n80#1:269,5\n80#1:275\n91#1:279,5\n91#1:285,5\n92#1:290,2\n92#1:293,11\n93#1:304\n93#1:306\n94#1:307,2\n106#1:313,4\n106#1:318,6\n108#1:324\n108#1:326,3\n108#1:330,8\n108#1:339,3\n109#1:342,3\n109#1:346,7\n110#1:353,2\n111#1:356,2\n112#1:359,2\n113#1:362,2\n114#1:365,2\n115#1:368,2\n116#1:371,5\n116#1:377,11\n117#1:388,5\n117#1:394,14\n118#1:408,2\n118#1:411,2\n118#1:414,7\n122#1:421,2\n122#1:424,4\n122#1:429,11\n125#1:440,2\n125#1:443,2\n125#1:446,7\n128#1:453,2\n128#1:456,2\n128#1:459,7\n142#1:466\n142#1:468,11\n142#1:480\n144#1:481\n182#1:482,4\n182#1:487\n183#1:488\n184#1:489\n66#1:188\n67#1:200\n69#1:206\n73#1:223\n108#1:325\n118#1:410\n122#1:423\n125#1:442\n128#1:455\n142#1:467\n74#1:240,3\n80#1:274\n108#1:338\n*E\n"})
public final class v0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final b1 f335119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @NotNull
    public final l f335120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public boolean f335121c;

    public v0(@NotNull b1 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f335119a = source;
        this.f335120b = new l();
    }

    public static /* synthetic */ void K1() {
    }

    @Override // okio.n
    public short B4() throws EOFException {
        q1(2L);
        return this.f335120b.B4();
    }

    @Override // okio.n
    @NotNull
    public o E5(long j10) throws EOFException {
        q1(j10);
        return this.f335120b.E5(j10);
    }

    @Override // okio.n
    public void H9(@NotNull l sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            q1(j10);
            this.f335120b.H9(sink, j10);
        } catch (EOFException e10) {
            sink.Ma(this.f335120b);
            throw e10;
        }
    }

    @Override // okio.n
    public long J8() throws EOFException {
        q1(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!request(i11)) {
                break;
            }
            byte bI = this.f335120b.I(i10);
            if ((bI < 48 || bI > 57) && ((bI < 97 || bI > 102) && (bI < 65 || bI > 70))) {
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
            i10 = i11;
        }
        return this.f335120b.J8();
    }

    @Override // okio.n
    public long J9(byte b10, long j10, long j11) {
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jJ9 = this.f335120b.J9(b11, jMax, j12);
            if (jJ9 != -1) {
                return jJ9;
            }
            long size = this.f335120b.size();
            if (size >= j12 || this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // okio.n
    public long M2(byte b10, long j10) {
        return J9(b10, j10, Long.MAX_VALUE);
    }

    @Override // okio.n
    public long M4() throws EOFException {
        q1(8L);
        return this.f335120b.M4();
    }

    @Override // okio.n
    @NotNull
    public String O7() throws IOException {
        this.f335120b.Ma(this.f335119a);
        return this.f335120b.O7();
    }

    @Override // okio.n
    public long P2(@NotNull o targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return f5(targetBytes, 0L);
    }

    @Override // okio.n
    @NotNull
    public String R9(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jJ9 = J9((byte) 10, 0L, j11);
        if (jJ9 != -1) {
            return okio.internal.a.j0(this.f335120b, jJ9);
        }
        if (j11 < Long.MAX_VALUE && request(j11) && this.f335120b.I(j11 - 1) == 13 && request(j11 + 1) && this.f335120b.I(j11) == 10) {
            return okio.internal.a.j0(this.f335120b, j11);
        }
        l lVar = new l();
        l lVar2 = this.f335120b;
        lVar2.o(lVar, 0L, Math.min(32, lVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f335120b.size(), j10) + " content=" + lVar.r7().N() + kotlin.text.b0.F);
    }

    @Override // okio.n
    @Nullable
    public String S2() {
        long jJ5 = j5((byte) 10);
        if (jJ5 != -1) {
            return okio.internal.a.j0(this.f335120b, jJ5);
        }
        if (this.f335120b.size() != 0) {
            return u5(this.f335120b.size());
        }
        return null;
    }

    @Override // okio.n
    @NotNull
    public String S7(long j10, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        q1(j10);
        return this.f335120b.S7(j10, charset);
    }

    @Override // okio.n
    public long V1(@NotNull o bytes, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (true) {
            long jV1 = this.f335120b.V1(bytes, j10);
            if (jV1 != -1) {
                return jV1;
            }
            long size = this.f335120b.size();
            if (this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) bytes.v0())) + 1);
        }
    }

    @Override // okio.n
    @NotNull
    public byte[] Y5() throws IOException {
        this.f335120b.Ma(this.f335119a);
        return this.f335120b.Y5();
    }

    @Override // okio.n
    @NotNull
    public String b7(@NotNull Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        this.f335120b.Ma(this.f335119a);
        return this.f335120b.b7(charset);
    }

    @Override // okio.n, okio.m
    @NotNull
    public l c1() {
        return this.f335120b;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f335121c) {
            return;
        }
        this.f335121c = true;
        this.f335119a.close();
        this.f335120b.c();
    }

    @Override // okio.n
    public long dd() throws EOFException {
        q1(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!request(j11)) {
                break;
            }
            byte bI = this.f335120b.I(j10);
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
        return this.f335120b.dd();
    }

    @Override // okio.n
    public long f5(@NotNull o targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (true) {
            long jF5 = this.f335120b.f5(targetBytes, j10);
            if (jF5 != -1) {
                return jF5;
            }
            long size = this.f335120b.size();
            if (this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @Override // okio.n
    public int fe() throws EOFException {
        q1(4L);
        return this.f335120b.fe();
    }

    @Override // okio.n
    public long g8(@NotNull z0 sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = 0;
        while (this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) != -1) {
            long jE = this.f335120b.e();
            if (jE > 0) {
                size += jE;
                sink.Ga(this.f335120b, jE);
            }
        }
        if (this.f335120b.size() > 0) {
            size += this.f335120b.size();
            l lVar = this.f335120b;
            sink.Ga(lVar, lVar.size());
        }
        return size;
    }

    @Override // okio.n
    @Nullable
    public <T> T ha(@NotNull f1<T> options) throws IOException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iXf = xf(options.i());
        if (iXf == -1) {
            return null;
        }
        return options.get(iXf);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f335121c;
    }

    @Override // okio.n
    public long j5(byte b10) {
        return J9(b10, 0L, Long.MAX_VALUE);
    }

    @Override // okio.n
    public int k7() throws EOFException {
        q1(1L);
        byte bI = this.f335120b.I(0L);
        if ((bI & org.msgpack.core.h.a.K) == 192) {
            q1(2L);
        } else if ((bI & 240) == 224) {
            q1(3L);
        } else if ((bI & 248) == 240) {
            q1(4L);
        }
        return this.f335120b.k7();
    }

    @Override // okio.n
    @NotNull
    public String lb() {
        return R9(Long.MAX_VALUE);
    }

    @Override // okio.n, okio.m
    @NotNull
    public l n() {
        return this.f335120b;
    }

    @Override // okio.n
    public boolean ob(long j10, @NotNull o bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.v0() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!request(1 + j11) || this.f335120b.I(j11) != bytes.E(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.n
    @NotNull
    public n peek() {
        return l0.e(new s0(this));
    }

    @Override // okio.n
    public void q1(long j10) throws EOFException {
        if (!request(j10)) {
            throw new EOFException();
        }
    }

    @Override // okio.n
    @NotNull
    public o r7() throws IOException {
        this.f335120b.Ma(this.f335119a);
        return this.f335120b.r7();
    }

    @Override // okio.n
    public int read(@NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.n
    public byte readByte() throws EOFException {
        q1(1L);
        return this.f335120b.readByte();
    }

    @Override // okio.n
    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            q1(sink.length);
            this.f335120b.readFully(sink);
        } catch (EOFException e10) {
            int i10 = 0;
            while (this.f335120b.size() > 0) {
                l lVar = this.f335120b;
                int i11 = lVar.read(sink, i10, (int) lVar.size());
                int i12 = 6 | (-1);
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e10;
        }
    }

    @Override // okio.n
    public int readInt() throws EOFException {
        q1(4L);
        return this.f335120b.readInt();
    }

    @Override // okio.n
    public long readLong() throws EOFException {
        q1(8L);
        return this.f335120b.readLong();
    }

    @Override // okio.n
    public short readShort() throws EOFException {
        q1(2L);
        return this.f335120b.readShort();
    }

    @Override // okio.n
    public boolean request(long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (this.f335120b.size() < j10) {
            if (this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.n
    @NotNull
    public InputStream rf() {
        return new a();
    }

    @Override // okio.n
    public void skip(long j10) {
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        while (j10 > 0) {
            if (this.f335120b.size() == 0 && this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f335120b.size());
            this.f335120b.skip(jMin);
            j10 -= jMin;
        }
    }

    @Override // okio.n
    @NotNull
    public byte[] tb(long j10) throws EOFException {
        q1(j10);
        return this.f335120b.tb(j10);
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return this.f335119a.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.f335119a + ')';
    }

    @Override // okio.n
    public boolean u3(long j10, @NotNull o bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return ob(j10, bytes, 0, bytes.v0());
    }

    @Override // okio.n
    @NotNull
    public String u5(long j10) throws EOFException {
        q1(j10);
        return this.f335120b.u5(j10);
    }

    @Override // okio.n
    public long x2(@NotNull o bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return V1(bytes, 0L);
    }

    @Override // okio.n
    public int xf(@NotNull p0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        do {
            int iL0 = okio.internal.a.l0(this.f335120b, options, true);
            if (iL0 != -2) {
                if (iL0 == -1) {
                    return -1;
                }
                this.f335120b.skip(options.i()[iL0].v0());
                return iL0;
            }
        } while (this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) != -1);
        return -1;
    }

    @Override // okio.n
    public boolean y1() {
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        return this.f335120b.y1() && this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1;
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (this.f335121c) {
            throw new IllegalStateException(MetricTracker.Action.CLOSED);
        }
        if (this.f335120b.size() == 0 && this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
            return -1L;
        }
        return this.f335120b.read(sink, Math.min(j10, this.f335120b.size()));
    }

    @SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,186:1\n62#2:187\n62#2:188\n62#2:189\n62#2:191\n62#2:192\n62#2:193\n62#2:194\n74#3:190\n86#3:195\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n150#1:187\n151#1:188\n154#1:189\n161#1:191\n162#1:192\n166#1:193\n171#1:194\n154#1:190\n171#1:195\n*E\n"})
    public static final class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            v0 v0Var = v0.this;
            if (v0Var.f335121c) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            return (int) Math.min(v0Var.f335120b.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            v0.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            v0 v0Var = v0.this;
            if (v0Var.f335121c) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            if (v0Var.f335120b.size() == 0) {
                v0 v0Var2 = v0.this;
                if (v0Var2.f335119a.read(v0Var2.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                    return -1;
                }
            }
            return v0.this.f335120b.readByte() & 255;
        }

        @NotNull
        public String toString() {
            return v0.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (v0.this.f335121c) {
                throw new IOException(MetricTracker.Action.CLOSED);
            }
            i.e(data.length, i10, i11);
            if (v0.this.f335120b.size() == 0) {
                v0 v0Var = v0.this;
                if (v0Var.f335119a.read(v0Var.f335120b, PlaybackStateCompat.f9665p2) == -1) {
                    return -1;
                }
            }
            return v0.this.f335120b.read(data, i10, i11);
        }
    }

    @Override // okio.n
    public int read(@NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = i11;
        i.e(sink.length, i10, j10);
        if (this.f335120b.size() == 0 && this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
            return -1;
        }
        return this.f335120b.read(sink, i10, (int) Math.min(j10, this.f335120b.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f335120b.size() == 0 && this.f335119a.read(this.f335120b, PlaybackStateCompat.f9665p2) == -1) {
            return -1;
        }
        return this.f335120b.read(sink);
    }
}
