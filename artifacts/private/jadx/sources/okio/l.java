package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import androidx.media3.exoplayer.c4;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 BufferedSource.kt\nokio/internal/-BufferedSource\n*L\n1#1,643:1\n89#2:644\n86#2:677\n86#2:679\n74#2:739\n74#2:765\n83#2:804\n77#2:815\n89#2:1008\n74#2:1023\n86#2:1127\n89#2:1620\n244#3,32:645\n279#3,10:680\n292#3,18:690\n414#3,2:708\n112#3:710\n416#3:711\n114#3,18:712\n313#3,9:730\n322#3,15:740\n340#3,10:755\n350#3,3:766\n348#3,25:769\n376#3,10:794\n386#3:805\n384#3,9:806\n393#3,7:816\n391#3,20:823\n682#3,60:843\n745#3,56:903\n803#3:959\n806#3:960\n807#3,6:962\n817#3,7:968\n827#3,6:978\n835#3,5:984\n867#3,6:989\n877#3:995\n878#3,11:997\n889#3,5:1009\n898#3,9:1014\n908#3,61:1024\n633#3:1085\n636#3:1086\n637#3,5:1088\n644#3:1093\n647#3,7:1094\n656#3,20:1101\n420#3:1121\n423#3,5:1122\n428#3,10:1128\n439#3,7:1138\n444#3,2:1145\n973#3:1147\n974#3,87:1149\n1064#3,48:1236\n603#3:1284\n610#3,21:1285\n1115#3,7:1306\n1125#3,7:1313\n1135#3,4:1320\n1142#3,8:1324\n1153#3,10:1332\n1166#3,14:1342\n449#3,91:1356\n543#3,40:1447\n586#3:1487\n588#3,13:1489\n1183#3:1502\n1234#3:1503\n1235#3,39:1505\n1276#3,2:1544\n1278#3,4:1547\n1285#3,3:1551\n1289#3,4:1555\n112#3:1559\n1293#3,22:1560\n114#3,18:1582\n1319#3,2:1600\n1321#3,3:1603\n112#3:1606\n1324#3,13:1607\n1337#3,13:1621\n114#3,18:1634\n1354#3,2:1652\n1357#3:1655\n112#3:1656\n1358#3,50:1657\n114#3,18:1707\n1417#3,14:1725\n1434#3,32:1739\n1469#3,12:1771\n1484#3,18:1783\n1506#3:1801\n1507#3:1803\n1512#3,34:1804\n1#4:678\n1#4:961\n1#4:996\n1#4:1087\n1#4:1148\n1#4:1488\n1#4:1504\n1#4:1546\n1#4:1554\n1#4:1602\n1#4:1654\n1#4:1802\n26#5,3:975\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:644\n197#1:677\n235#1:679\n261#1:739\n264#1:765\n267#1:804\n267#1:815\n337#1:1008\n340#1:1023\n376#1:1127\n485#1:1620\n181#1:645,32\n252#1:680,10\n255#1:690,18\n258#1:708,2\n258#1:710\n258#1:711\n258#1:712,18\n261#1:730,9\n261#1:740,15\n264#1:755,10\n264#1:766,3\n264#1:769,25\n267#1:794,10\n267#1:805\n267#1:806,9\n267#1:816,7\n267#1:823,20\n279#1:843,60\n282#1:903,56\n284#1:959\n287#1:960\n287#1:962,6\n289#1:968,7\n294#1:978,6\n297#1:984,5\n331#1:989,6\n337#1:995\n337#1:997,11\n337#1:1009,5\n340#1:1014,9\n340#1:1024,61\n342#1:1085\n345#1:1086\n345#1:1088,5\n347#1:1093\n350#1:1094,7\n353#1:1101,20\n373#1:1121\n376#1:1122,5\n376#1:1128,10\n378#1:1138,7\n381#1:1145,2\n386#1:1147\n386#1:1149,87\n389#1:1236,48\n412#1:1284\n418#1:1285,21\n439#1:1306,7\n443#1:1313,7\n445#1:1320,4\n447#1:1324,8\n451#1:1332,10\n455#1:1342,14\n459#1:1356,91\n462#1:1447,40\n465#1:1487\n465#1:1489,13\n467#1:1502\n467#1:1503\n467#1:1505,39\n469#1:1544,2\n469#1:1547,4\n479#1:1551,3\n479#1:1555,4\n479#1:1559\n479#1:1560,22\n479#1:1582,18\n485#1:1600,2\n485#1:1603,3\n485#1:1606\n485#1:1607,13\n485#1:1621,13\n485#1:1634,18\n490#1:1652,2\n490#1:1655\n490#1:1656\n490#1:1657,50\n490#1:1707,18\n500#1:1725,14\n570#1:1739,32\n572#1:1771,12\n580#1:1783,18\n588#1:1801\n588#1:1803\n590#1:1804,34\n287#1:961\n337#1:996\n345#1:1087\n386#1:1148\n465#1:1488\n467#1:1504\n469#1:1546\n479#1:1554\n485#1:1602\n490#1:1654\n588#1:1802\n291#1:975,3\n*E\n"})
public final class l implements n, m, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @Nullable
    public w0 f335034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f335035b;

    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,643:1\n1567#2:644\n1568#2:646\n1572#2:647\n1573#2,68:649\n1644#2:717\n1645#2,32:719\n1677#2,18:752\n1698#2:770\n1699#2,18:772\n1721#2:790\n1723#2,7:792\n1#3:645\n1#3:648\n1#3:718\n1#3:771\n1#3:791\n86#4:751\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n630#1:644\n630#1:646\n632#1:647\n632#1:649,68\n634#1:717\n634#1:719,32\n634#1:752,18\n636#1:770\n636#1:772,18\n639#1:790\n639#1:792,7\n630#1:645\n632#1:648\n634#1:718\n636#1:771\n639#1:791\n634#1:751\n*E\n"})
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @Nullable
        public l f335036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public boolean f335037b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private w0 f335038c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        @Nullable
        public byte[] f335040e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public long f335039d = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @oj.f
        public int f335041f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        public int f335042g = -1;

        public final long a(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i10).toString());
            }
            if (i10 > 8192) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i10).toString());
            }
            l lVar = this.f335036a;
            if (lVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f335037b) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = lVar.size();
            w0 w0VarT0 = lVar.T0(i10);
            int i11 = 8192 - w0VarT0.f335130c;
            w0VarT0.f335130c = 8192;
            long j10 = i11;
            lVar.B0(size + j10);
            f(w0VarT0);
            this.f335039d = size;
            this.f335040e = w0VarT0.f335128a;
            this.f335041f = 8192 - i11;
            this.f335042g = 8192;
            return j10;
        }

        @Nullable
        public final w0 b() {
            return this.f335038c;
        }

        public final int c() {
            long j10 = this.f335039d;
            l lVar = this.f335036a;
            Intrinsics.checkNotNull(lVar);
            if (j10 == lVar.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j11 = this.f335039d;
            return e(j11 == -1 ? 0L : j11 + ((long) (this.f335042g - this.f335041f)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f335036a == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f335036a = null;
            f(null);
            this.f335039d = -1L;
            this.f335040e = null;
            this.f335041f = -1;
            this.f335042g = -1;
        }

        public final long d(long j10) {
            l lVar = this.f335036a;
            if (lVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.f335037b) {
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
                f(null);
                this.f335039d = j10;
                this.f335040e = null;
                this.f335041f = -1;
                this.f335042g = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    w0 w0VarT0 = lVar.T0(1);
                    int iMin = (int) Math.min(j13, 8192 - w0VarT0.f335130c);
                    w0VarT0.f335130c += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        f(w0VarT0);
                        this.f335039d = size;
                        this.f335040e = w0VarT0.f335128a;
                        int i11 = w0VarT0.f335130c;
                        this.f335041f = i11 - iMin;
                        this.f335042g = i11;
                        z10 = false;
                    }
                }
            }
            lVar.B0(j10);
            return size;
        }

        public final int e(long j10) {
            w0 w0VarC;
            l lVar = this.f335036a;
            if (lVar == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (j10 < -1 || j10 > lVar.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + lVar.size());
            }
            if (j10 == -1 || j10 == lVar.size()) {
                f(null);
                this.f335039d = j10;
                this.f335040e = null;
                this.f335041f = -1;
                this.f335042g = -1;
                return -1;
            }
            long size = lVar.size();
            w0 w0VarB = lVar.f335034a;
            long j11 = 0;
            if (b() != null) {
                long j12 = this.f335039d;
                int i10 = this.f335041f;
                w0 w0VarB2 = b();
                Intrinsics.checkNotNull(w0VarB2);
                long j13 = j12 - ((long) (i10 - w0VarB2.f335129b));
                if (j13 > j10) {
                    w0VarC = w0VarB;
                    w0VarB = b();
                    size = j13;
                } else {
                    w0VarC = b();
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
            if (this.f335037b) {
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
            f(w0VarC);
            this.f335039d = j10;
            Intrinsics.checkNotNull(w0VarC);
            this.f335040e = w0VarC.f335128a;
            int i13 = w0VarC.f335129b + ((int) (j10 - j11));
            this.f335041f = i13;
            int i14 = w0VarC.f335130c;
            this.f335042g = i14;
            return i14 - i13;
        }

        public final void f(@Nullable w0 w0Var) {
            this.f335038c = w0Var;
        }
    }

    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @NotNull
        public String toString() {
            return l.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            l.this.writeByte(i10);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] data, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            l.this.write(data, i10, i11);
        }
    }

    private final o N(String str, o oVar) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(oVar.a0(), str));
            w0 w0Var = this.f335034a;
            if (w0Var != null) {
                byte[] bArr = w0Var.f335128a;
                int i10 = w0Var.f335129b;
                mac.update(bArr, i10, w0Var.f335130c - i10);
                w0 w0Var2 = w0Var.f335133f;
                Intrinsics.checkNotNull(w0Var2);
                while (w0Var2 != w0Var) {
                    byte[] bArr2 = w0Var2.f335128a;
                    int i11 = w0Var2.f335129b;
                    mac.update(bArr2, i11, w0Var2.f335130c - i11);
                    w0Var2 = w0Var2.f335133f;
                    Intrinsics.checkNotNull(w0Var2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
            return new o(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static /* synthetic */ l d2(l lVar, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = lVar.f335035b;
        }
        return lVar.c2(outputStream, j10);
    }

    public static /* synthetic */ a j0(l lVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = i.g();
        }
        return lVar.g0(aVar);
    }

    public static /* synthetic */ l q(l lVar, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = lVar.f335035b - j12;
        }
        return lVar.j(outputStream, j12, j11);
    }

    public static /* synthetic */ l r(l lVar, l lVar2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return lVar.l(lVar2, j10);
    }

    private final void r0(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                break;
            }
            w0 w0VarT0 = T0(1);
            int i10 = inputStream.read(w0VarT0.f335128a, w0VarT0.f335130c, (int) Math.min(j10, 8192 - w0VarT0.f335130c));
            if (i10 == -1) {
                if (w0VarT0.f335129b == w0VarT0.f335130c) {
                    this.f335034a = w0VarT0.b();
                    x0.d(w0VarT0);
                }
                if (!z10) {
                    throw new EOFException();
                }
                break;
            }
            w0VarT0.f335130c += i10;
            long j11 = i10;
            this.f335035b += j11;
            j10 -= j11;
        }
    }

    public static /* synthetic */ l t(l lVar, l lVar2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return lVar.o(lVar2, j10, j11);
    }

    private final o x(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        w0 w0Var = this.f335034a;
        if (w0Var != null) {
            byte[] bArr = w0Var.f335128a;
            int i10 = w0Var.f335129b;
            messageDigest.update(bArr, i10, w0Var.f335130c - i10);
            w0 w0Var2 = w0Var.f335133f;
            Intrinsics.checkNotNull(w0Var2);
            while (w0Var2 != w0Var) {
                byte[] bArr2 = w0Var2.f335128a;
                int i11 = w0Var2.f335129b;
                messageDigest.update(bArr2, i11, w0Var2.f335130c - i11);
                w0Var2 = w0Var2.f335133f;
                Intrinsics.checkNotNull(w0Var2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return new o(bArrDigest);
    }

    public static /* synthetic */ a y0(l lVar, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = i.g();
        }
        return lVar.x0(aVar);
    }

    public final void B0(long j10) {
        this.f335035b = j10;
    }

    @Override // okio.n
    public short B4() throws EOFException {
        return i.q(readShort());
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public l f1() {
        return this;
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: E1, reason: merged with bridge method [inline-methods] */
    public l writeShort(int i10) {
        w0 w0VarT0 = T0(2);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        w0VarT0.f335130c = i11 + 2;
        B0(size() + 2);
        return this;
    }

    @Override // okio.n
    @NotNull
    public o E5(long j10) throws EOFException {
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < PlaybackStateCompat.H1) {
            return new o(tb(j10));
        }
        o oVarR0 = R0((int) j10);
        skip(j10);
        return oVarR0;
    }

    @Override // okio.z0
    public void Ga(@NotNull l source, long j10) {
        w0 w0Var;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        i.e(source.size(), 0L, j10);
        while (j10 > 0) {
            w0 w0Var2 = source.f335034a;
            Intrinsics.checkNotNull(w0Var2);
            int i10 = w0Var2.f335130c;
            w0 w0Var3 = source.f335034a;
            Intrinsics.checkNotNull(w0Var3);
            if (j10 < i10 - w0Var3.f335129b) {
                w0 w0Var4 = this.f335034a;
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
                        B0(size() + j10);
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
            w0 w0Var8 = this.f335034a;
            if (w0Var8 == null) {
                this.f335034a = w0Var7;
                w0Var7.f335134g = w0Var7;
                w0Var7.f335133f = w0Var7;
            } else {
                Intrinsics.checkNotNull(w0Var8);
                w0 w0Var9 = w0Var8.f335134g;
                Intrinsics.checkNotNull(w0Var9);
                w0Var9.c(w0Var7).a();
            }
            source.B0(source.size() - j11);
            B0(size() + j11);
            j10 -= j11;
        }
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public l L9() {
        return this;
    }

    @NotNull
    public final o H0() {
        return x(org.apache.commons.codec.digest.g.f335249c);
    }

    @Override // okio.n
    public void H9(@NotNull l sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (size() >= j10) {
            sink.Ga(this, j10);
        } else {
            sink.Ga(this, size());
            throw new EOFException();
        }
    }

    @oj.i(name = "getByte")
    public final byte I(long j10) {
        i.e(size(), j10, 1L);
        w0 w0Var = this.f335034a;
        if (w0Var == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (size() - j10 < j10) {
            long size = size();
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

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: J1, reason: merged with bridge method [inline-methods] */
    public l O6(int i10) {
        return writeShort(i.q((short) i10));
    }

    @Override // okio.n
    public long J8() throws EOFException {
        int i10;
        if (size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            w0 w0Var = this.f335034a;
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
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + i.u(b10));
                    }
                    i10 = b10 + org.msgpack.core.h.a.f339278n;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new l().q7(j10).writeByte(b10).O7());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                this.f335034a = w0Var.b();
                x0.d(w0Var);
            } else {
                w0Var.f335129b = i12;
            }
            if (z10) {
                break;
            }
        } while (this.f335034a != null);
        B0(size() - ((long) i11));
        return j10;
    }

    @Override // okio.n
    public long J9(byte b10, long j10, long j11) {
        w0 w0Var;
        int i10;
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (w0Var = this.f335034a) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
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
    public final o M0() {
        return x(org.apache.commons.codec.digest.g.f335251e);
    }

    @Override // okio.n
    public long M2(byte b10, long j10) {
        return J9(b10, j10, Long.MAX_VALUE);
    }

    @Override // okio.n
    public long M4() throws EOFException {
        return i.p(readLong());
    }

    @Override // okio.m
    public long Ma(@NotNull b1 source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, PlaybackStateCompat.f9665p2);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @NotNull
    public final o O0() {
        return x(org.apache.commons.codec.digest.g.f335253g);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public l c5(@NotNull String string, int i10, int i11, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (i10 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
        }
        if (i11 > string.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + string.length()).toString());
        }
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            return K3(string, i10, i11);
        }
        String strSubstring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return write(bytes, 0, bytes.length);
    }

    @Override // okio.n
    @NotNull
    public String O7() {
        return S7(this.f335035b, Charsets.UTF_8);
    }

    @Override // okio.n
    public long P2(@NotNull o targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return f5(targetBytes, 0L);
    }

    @NotNull
    public final o Q0() {
        if (size() <= g3.f12256c) {
            return R0((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @NotNull
    public final o R0(int i10) {
        if (i10 == 0) {
            return o.f335048f;
        }
        i.e(size(), 0L, i10);
        w0 w0Var = this.f335034a;
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
        w0 w0Var2 = this.f335034a;
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

    @Override // okio.n
    @NotNull
    public String R9(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jJ9 = J9((byte) 10, 0L, j11);
        if (jJ9 != -1) {
            return okio.internal.a.j0(this, jJ9);
        }
        if (j11 < size() && I(j11 - 1) == 13 && I(j11) == 10) {
            return okio.internal.a.j0(this, j11);
        }
        l lVar = new l();
        o(lVar, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + lVar.r7().N() + kotlin.text.b0.F);
    }

    @Override // okio.n
    @Nullable
    public String S2() throws EOFException {
        long jJ5 = j5((byte) 10);
        if (jJ5 != -1) {
            return okio.internal.a.j0(this, jJ5);
        }
        if (size() != 0) {
            return u5(size());
        }
        return null;
    }

    @Override // okio.n
    @NotNull
    public String S7(long j10, @NotNull Charset charset) throws EOFException {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f335035b < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        if (((long) i10) + j10 > w0Var.f335130c) {
            return new String(tb(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(w0Var.f335128a, i10, i11, charset);
        int i12 = w0Var.f335129b + i11;
        w0Var.f335129b = i12;
        this.f335035b -= j10;
        if (i12 == w0Var.f335130c) {
            this.f335034a = w0Var.b();
            x0.d(w0Var);
        }
        return str;
    }

    @NotNull
    public final o T(@NotNull o key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return N("HmacSHA1", key);
    }

    @NotNull
    public final w0 T0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        w0 w0Var = this.f335034a;
        if (w0Var != null) {
            Intrinsics.checkNotNull(w0Var);
            w0 w0Var2 = w0Var.f335134g;
            Intrinsics.checkNotNull(w0Var2);
            return (w0Var2.f335130c + i10 > 8192 || !w0Var2.f335132e) ? w0Var2.c(x0.e()) : w0Var2;
        }
        w0 w0VarE = x0.e();
        this.f335034a = w0VarE;
        w0VarE.f335134g = w0VarE;
        w0VarE.f335133f = w0VarE;
        return w0VarE;
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: T1, reason: merged with bridge method [inline-methods] */
    public l Md(@NotNull String string, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return c5(string, 0, string.length(), charset);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
    public l U7(@NotNull o byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.I0(this, 0, byteString.v0());
        return this;
    }

    @Override // okio.n
    public long V1(@NotNull o bytes, long j10) throws IOException {
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.v0() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
        }
        w0 w0Var = this.f335034a;
        if (w0Var == null) {
            return -1L;
        }
        if (size() - j11 < j11) {
            size = size();
            while (size > j11) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            byte[] bArrA0 = bytes.a0();
            byte b10 = bArrA0[0];
            int iV0 = bytes.v0();
            long size2 = (size() - ((long) iV0)) + 1;
            while (size < size2) {
                byte[] bArr = w0Var.f335128a;
                int iMin = (int) Math.min(w0Var.f335130c, (((long) w0Var.f335129b) + size2) - size);
                i10 = (int) ((((long) w0Var.f335129b) + j11) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10 || !okio.internal.a.i0(w0Var, i10 + 1, bArrA0, 1, iV0)) {
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
        long size3 = (size() - ((long) iV1)) + 1;
        while (size < size3) {
            byte[] bArr2 = w0Var.f335128a;
            long j13 = size3;
            int iMin2 = (int) Math.min(w0Var.f335130c, (((long) w0Var.f335129b) + size3) - size);
            i10 = (int) ((((long) w0Var.f335129b) + j11) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] == b11 && okio.internal.a.i0(w0Var, i10 + 1, bArrA1, 1, iV1)) {
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

    @NotNull
    public final o X(@NotNull o key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return N("HmacSHA256", key);
    }

    @NotNull
    public final o Y(@NotNull o key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return N("HmacSHA512", key);
    }

    @Override // okio.n
    @NotNull
    public byte[] Y5() {
        return tb(size());
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to operator function", replaceWith = @kotlin.b1(expression = "this[index]", imports = {}))
    @oj.i(name = "-deprecated_getByte")
    public final byte a(long j10) {
        return I(j10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "size", imports = {}))
    @oj.i(name = "-deprecated_size")
    public final long b() {
        return this.f335035b;
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public l P5(@NotNull o byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.I0(this, i10, i11);
        return this;
    }

    @oj.j
    @NotNull
    public final l b2(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return d2(this, out, 0L, 2, null);
    }

    @Override // okio.n
    @NotNull
    public String b7(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return S7(this.f335035b, charset);
    }

    public final void c() throws EOFException {
        skip(size());
    }

    @Override // okio.n, okio.m
    @NotNull
    public l c1() {
        return this;
    }

    @oj.j
    @NotNull
    public final l c2(@NotNull OutputStream out, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        i.e(this.f335035b, 0L, j10);
        w0 w0Var = this.f335034a;
        long j11 = j10;
        while (j11 > 0) {
            Intrinsics.checkNotNull(w0Var);
            int iMin = (int) Math.min(j11, w0Var.f335130c - w0Var.f335129b);
            out.write(w0Var.f335128a, w0Var.f335129b, iMin);
            int i10 = w0Var.f335129b + iMin;
            w0Var.f335129b = i10;
            long j12 = iMin;
            this.f335035b -= j12;
            j11 -= j12;
            if (i10 == w0Var.f335130c) {
                w0 w0VarB = w0Var.b();
                this.f335034a = w0VarB;
                x0.d(w0Var);
                w0Var = w0VarB;
            }
        }
        return this;
    }

    @Override // okio.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public l clone() {
        return f();
    }

    @NotNull
    public final o d0() {
        return x("MD5");
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public l C7(@NotNull b1 source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // okio.n
    public long dd() throws EOFException {
        long j10;
        byte b10;
        long j11 = 0;
        if (size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j12 = 0;
        long j13 = -7;
        boolean z11 = false;
        loop0: while (true) {
            w0 w0Var = this.f335034a;
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
                this.f335034a = w0Var.b();
                x0.d(w0Var);
            } else {
                w0Var.f335129b = i11;
            }
            if (z11 || this.f335034a == null) {
                B0(size() - ((long) i10));
                if (i10 >= (z10 ? 2 : 1)) {
                    return z10 ? j12 : -j12;
                }
                if (size() == j10) {
                    throw new EOFException();
                }
                throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + i.u(I(j10)));
            }
            j11 = j10;
        }
        l lVarWriteByte = new l().h5(j12).writeByte(b10);
        if (!z10) {
            lVarWriteByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + lVarWriteByte.O7());
    }

    public final long e() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        w0 w0Var2 = w0Var.f335134g;
        Intrinsics.checkNotNull(w0Var2);
        int i10 = w0Var2.f335130c;
        return (i10 >= 8192 || !w0Var2.f335132e) ? size : size - ((long) (i10 - w0Var2.f335129b));
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
    public l write(@NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return write(source, 0, source.length);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public l pa(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return K3(string, 0, string.length());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (size() != lVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        w0 w0Var2 = lVar.f335034a;
        Intrinsics.checkNotNull(w0Var2);
        int i10 = w0Var.f335129b;
        int i11 = w0Var2.f335129b;
        long j10 = 0;
        while (j10 < size()) {
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
    public final l f() {
        l lVar = new l();
        if (size() == 0) {
            return lVar;
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        w0 w0VarD = w0Var.d();
        lVar.f335034a = w0VarD;
        w0VarD.f335134g = w0VarD;
        w0VarD.f335133f = w0VarD;
        for (w0 w0Var2 = w0Var.f335133f; w0Var2 != w0Var; w0Var2 = w0Var2.f335133f) {
            w0 w0Var3 = w0VarD.f335134g;
            Intrinsics.checkNotNull(w0Var3);
            Intrinsics.checkNotNull(w0Var2);
            w0Var3.c(w0Var2.d());
        }
        lVar.B0(size());
        return lVar;
    }

    @oj.j
    @NotNull
    public final a f0() {
        return j0(this, null, 1, null);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
    public l K3(@NotNull String string, int i10, int i11) {
        char cCharAt;
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
                w0 w0VarT0 = T0(1);
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
                B0(size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    w0 w0VarT1 = T0(2);
                    byte[] bArr2 = w0VarT1.f335128a;
                    int i16 = w0VarT1.f335130c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    w0VarT1.f335130c = i16 + 2;
                    B0(size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    w0 w0VarT2 = T0(3);
                    byte[] bArr3 = w0VarT2.f335128a;
                    int i17 = w0VarT2.f335130c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    w0VarT2.f335130c = i17 + 3;
                    B0(size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        w0 w0VarT3 = T0(4);
                        byte[] bArr4 = w0VarT3.f335128a;
                        int i20 = w0VarT3.f335130c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        w0VarT3.f335130c = i20 + 4;
                        B0(size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return this;
    }

    @Override // okio.n
    public long f5(@NotNull o targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        w0 w0Var = this.f335034a;
        if (w0Var == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                w0Var = w0Var.f335134g;
                Intrinsics.checkNotNull(w0Var);
                size -= (long) (w0Var.f335130c - w0Var.f335129b);
            }
            if (targetBytes.v0() == 2) {
                byte bE = targetBytes.E(0);
                byte bE2 = targetBytes.E(1);
                while (size < size()) {
                    byte[] bArr = w0Var.f335128a;
                    i10 = (int) ((((long) w0Var.f335129b) + j10) - size);
                    int i12 = w0Var.f335130c;
                    while (true) {
                        if (i10 < i12) {
                            byte b10 = bArr[i10];
                            if (b10 == bE || b10 == bE2) {
                                i11 = w0Var.f335129b;
                            } else {
                                i10++;
                            }
                        } else {
                            size += (long) (w0Var.f335130c - w0Var.f335129b);
                            w0Var = w0Var.f335133f;
                            Intrinsics.checkNotNull(w0Var);
                            j10 = size;
                        }
                    }
                }
            } else {
                byte[] bArrA0 = targetBytes.a0();
                while (size < size()) {
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
            while (size < size()) {
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
            while (size < size()) {
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

    @Override // okio.n
    public int fe() throws EOFException {
        return i.o(readInt());
    }

    @Override // okio.m, okio.z0, java.io.Flushable
    public void flush() {
    }

    @oj.j
    @NotNull
    public final l g(@NotNull OutputStream out) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return q(this, out, 0L, 0L, 6, null);
    }

    @oj.j
    @NotNull
    public final a g0(@NotNull a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.a.s(this, unsafeCursor);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public l write(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        i.e(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            w0 w0VarT0 = T0(1);
            int iMin = Math.min(i12 - i10, 8192 - w0VarT0.f335130c);
            int i13 = i10 + iMin;
            ArraysKt.copyInto(source, w0VarT0.f335128a, w0VarT0.f335130c, i10, i13);
            w0VarT0.f335130c += iMin;
            i10 = i13;
        }
        B0(size() + j10);
        return this;
    }

    @Override // okio.n
    public long g8(@NotNull z0 sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.Ga(this, size);
        }
        return size;
    }

    @oj.j
    @NotNull
    public final l h(@NotNull OutputStream out, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        return q(this, out, j10, 0L, 4, null);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public l writeByte(int i10) {
        w0 w0VarT0 = T0(1);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        w0VarT0.f335130c = i11 + 1;
        bArr[i11] = (byte) i10;
        B0(size() + 1);
        return this;
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

    public int hashCode() {
        w0 w0Var = this.f335034a;
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
        } while (w0Var != this.f335034a);
        return i10;
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public l d9(int i10) {
        if (i10 < 128) {
            writeByte(i10);
            return this;
        }
        if (i10 < 2048) {
            w0 w0VarT0 = T0(2);
            byte[] bArr = w0VarT0.f335128a;
            int i11 = w0VarT0.f335130c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            w0VarT0.f335130c = i11 + 2;
            B0(size() + 2);
            return this;
        }
        if (55296 <= i10 && i10 < 57344) {
            writeByte(63);
            return this;
        }
        if (i10 < 65536) {
            w0 w0VarT1 = T0(3);
            byte[] bArr2 = w0VarT1.f335128a;
            int i12 = w0VarT1.f335130c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            w0VarT1.f335130c = i12 + 3;
            B0(size() + 3);
            return this;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + i.v(i10));
        }
        w0 w0VarT2 = T0(4);
        byte[] bArr3 = w0VarT2.f335128a;
        int i13 = w0VarT2.f335130c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        w0VarT2.f335130c = i13 + 4;
        B0(size() + 4);
        return this;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @oj.j
    @NotNull
    public final l j(@NotNull OutputStream out, long j10, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        i.e(this.f335035b, j12, j11);
        if (j11 != 0) {
            w0 w0Var = this.f335034a;
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
                int i12 = (int) (((long) w0Var2.f335129b) + j12);
                int iMin = (int) Math.min(w0Var2.f335130c - i12, j13);
                out.write(w0Var2.f335128a, i12, iMin);
                j13 -= (long) iMin;
                w0Var2 = w0Var2.f335133f;
                j12 = 0;
            }
        }
        return this;
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public l h5(long j10) {
        boolean z10;
        if (j10 == 0) {
            return writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return pa("-9223372036854775808");
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
                i10 = j10 < androidx.media3.exoplayer.audio.s0.f63372z ? 5 : 6;
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
        w0 w0VarT0 = T0(i10);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = okio.internal.a.g0()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        w0VarT0.f335130c += i10;
        B0(size() + ((long) i10));
        return this;
    }

    @Override // okio.n
    public long j5(byte b10) {
        return J9(b10, 0L, Long.MAX_VALUE);
    }

    @NotNull
    public final l k0(@NotNull InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        r0(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.n
    public int k7() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() == 0) {
            throw new EOFException();
        }
        byte bI = I(0L);
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
                skip(1L);
                return 65533;
            }
            i10 = bI & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (size() < j10) {
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + i.u(bI) + ')');
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte bI2 = I(j11);
            if ((bI2 & org.msgpack.core.h.a.f339269e) != 128) {
                skip(j11);
                return 65533;
            }
            i10 = (i10 << 6) | (bI2 & 63);
        }
        skip(j10);
        if (i10 > 1114111) {
            return 65533;
        }
        if ((55296 > i10 || i10 >= 57344) && i10 >= i12) {
            return i10;
        }
        return 65533;
    }

    @NotNull
    public final l l(@NotNull l out, long j10) {
        Intrinsics.checkNotNullParameter(out, "out");
        return o(out, j10, this.f335035b - j10);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
    public l q7(long j10) {
        if (j10 == 0) {
            return writeByte(48);
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
        w0 w0VarT0 = T0(i10);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = okio.internal.a.g0()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        w0VarT0.f335130c += i10;
        B0(size() + ((long) i10));
        return this;
    }

    @Override // okio.n
    @NotNull
    public String lb() throws EOFException {
        return R9(Long.MAX_VALUE);
    }

    @Override // okio.n, okio.m
    @NotNull
    public l n() {
        return this;
    }

    @Override // okio.m
    @NotNull
    public OutputStream nf() {
        return new c();
    }

    @NotNull
    public final l o(@NotNull l out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        long j12 = j10;
        i.e(size(), j12, j11);
        if (j11 != 0) {
            out.B0(out.size() + j11);
            w0 w0Var = this.f335034a;
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
        return this;
    }

    @NotNull
    public final l o0(@NotNull InputStream input, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        if (j10 >= 0) {
            r0(input, j10, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // okio.n
    public boolean ob(long j10, @NotNull o bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || bytes.v0() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (I(((long) i12) + j10) != bytes.E(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public l writeInt(int i10) {
        w0 w0VarT0 = T0(4);
        byte[] bArr = w0VarT0.f335128a;
        int i11 = w0VarT0.f335130c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        w0VarT0.f335130c = i11 + 4;
        B0(size() + 4);
        return this;
    }

    @Override // okio.n
    @NotNull
    public n peek() {
        return l0.e(new s0(this));
    }

    @Override // okio.n
    public void q1(long j10) throws EOFException {
        if (this.f335035b < j10) {
            throw new EOFException();
        }
    }

    @Override // okio.n
    @NotNull
    public o r7() {
        return E5(size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        w0 w0Var = this.f335034a;
        if (w0Var == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), w0Var.f335130c - w0Var.f335129b);
        sink.put(w0Var.f335128a, w0Var.f335129b, iMin);
        int i10 = w0Var.f335129b + iMin;
        w0Var.f335129b = i10;
        this.f335035b -= (long) iMin;
        if (i10 == w0Var.f335130c) {
            this.f335034a = w0Var.b();
            x0.d(w0Var);
        }
        return iMin;
    }

    @Override // okio.n
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        int i12 = i10 + 1;
        byte b10 = w0Var.f335128a[i10];
        B0(size() - 1);
        if (i12 != i11) {
            w0Var.f335129b = i12;
            return b10;
        }
        this.f335034a = w0Var.b();
        x0.d(w0Var);
        return b10;
    }

    @Override // okio.n
    public void readFully(@NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // okio.n
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        if (i11 - i10 < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = w0Var.f335128a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        B0(size() - 4);
        if (i14 != i11) {
            w0Var.f335129b = i14;
            return i15;
        }
        this.f335034a = w0Var.b();
        x0.d(w0Var);
        return i15;
    }

    @Override // okio.n
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        if (i11 - i10 < 8) {
            return ((((long) readInt()) & com.rabbitmq.client.k0.f265952a) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) readInt()));
        }
        byte[] bArr = w0Var.f335128a;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        B0(size() - 8);
        if (i13 != i11) {
            w0Var.f335129b = i13;
            return j11;
        }
        this.f335034a = w0Var.b();
        x0.d(w0Var);
        return j11;
    }

    @Override // okio.n
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        w0 w0Var = this.f335034a;
        Intrinsics.checkNotNull(w0Var);
        int i10 = w0Var.f335129b;
        int i11 = w0Var.f335130c;
        if (i11 - i10 < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = w0Var.f335128a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        B0(size() - 2);
        if (i14 == i11) {
            this.f335034a = w0Var.b();
            x0.d(w0Var);
        } else {
            w0Var.f335129b = i14;
        }
        return (short) i15;
    }

    @Override // okio.n
    public boolean request(long j10) {
        return this.f335035b >= j10;
    }

    @Override // okio.n
    @NotNull
    public InputStream rf() {
        return new b();
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public l f6(int i10) {
        return writeInt(i.o(i10));
    }

    @oj.i(name = "size")
    public final long size() {
        return this.f335035b;
    }

    @Override // okio.n
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            w0 w0Var = this.f335034a;
            if (w0Var == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, w0Var.f335130c - w0Var.f335129b);
            long j11 = iMin;
            B0(size() - j11);
            j10 -= j11;
            int i10 = w0Var.f335129b + iMin;
            w0Var.f335129b = i10;
            if (i10 == w0Var.f335130c) {
                this.f335034a = w0Var.b();
                x0.d(w0Var);
            }
        }
    }

    @Override // okio.n
    @NotNull
    public byte[] tb(long j10) throws EOFException {
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.b1
    @NotNull
    public e1 timeout() {
        return e1.f334887f;
    }

    @NotNull
    public String toString() {
        return Q0().toString();
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public l writeLong(long j10) {
        w0 w0VarT0 = T0(8);
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
        B0(size() + 8);
        return this;
    }

    @Override // okio.n
    public boolean u3(long j10, @NotNull o bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i10 = 1 << 0;
        return ob(j10, bytes, 0, bytes.v0());
    }

    @Override // okio.n
    @NotNull
    public String u5(long j10) throws EOFException {
        return S7(j10, Charsets.UTF_8);
    }

    @oj.j
    @NotNull
    public final a w0() {
        return y0(this, null, 1, null);
    }

    @Override // okio.m
    @NotNull
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public l m2(long j10) {
        return writeLong(i.p(j10));
    }

    @oj.j
    @NotNull
    public final a x0(@NotNull a unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return okio.internal.a.F(this, unsafeCursor);
    }

    @Override // okio.n
    public long x2(@NotNull o bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return V1(bytes, 0L);
    }

    @Override // okio.n
    public int xf(@NotNull p0 options) throws EOFException {
        Intrinsics.checkNotNullParameter(options, "options");
        int iM0 = okio.internal.a.m0(this, options, false, 2, null);
        if (iM0 == -1) {
            return -1;
        }
        skip(options.i()[iM0].v0());
        return iM0;
    }

    @Override // okio.n
    public boolean y1() {
        return this.f335035b == 0;
    }

    @SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,643:1\n74#2:644\n86#2:645\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:644\n136#1:645\n*E\n"})
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(l.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (l.this.size() > 0) {
                return l.this.readByte() & 255;
            }
            return -1;
        }

        @NotNull
        public String toString() {
            return l.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] sink, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return l.this.read(sink, i10, i11);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            w0 w0VarT0 = T0(1);
            int iMin = Math.min(i10, 8192 - w0VarT0.f335130c);
            source.get(w0VarT0.f335128a, w0VarT0.f335130c, iMin);
            i10 -= iMin;
            w0VarT0.f335130c += iMin;
        }
        this.f335035b += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.n
    public int read(@NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.n
    public int read(@NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        i.e(sink.length, i10, i11);
        w0 w0Var = this.f335034a;
        if (w0Var == null) {
            return -1;
        }
        int iMin = Math.min(i11, w0Var.f335130c - w0Var.f335129b);
        byte[] bArr = w0Var.f335128a;
        int i12 = w0Var.f335129b;
        ArraysKt.copyInto(bArr, sink, i10, i12, i12 + iMin);
        w0Var.f335129b += iMin;
        B0(size() - ((long) iMin));
        if (w0Var.f335129b == w0Var.f335130c) {
            this.f335034a = w0Var.b();
            x0.d(w0Var);
        }
        return iMin;
    }

    @Override // okio.b1
    public long read(@NotNull l sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        sink.Ga(this, j10);
        return j10;
    }
}
