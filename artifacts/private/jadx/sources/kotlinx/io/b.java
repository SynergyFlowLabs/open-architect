package kotlinx.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.a1;
import kotlin.e2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nkotlinx/io/Buffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n+ 4 Buffer.kt\nkotlinx/io/BufferKt\n+ 5 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,686:1\n628#1,14:689\n630#1,12:743\n1#2:687\n1#2:729\n1#2:734\n1#2:737\n1#2:741\n95#3:688\n52#3:728\n53#3:730\n107#3:731\n38#3:732\n52#3:733\n53#3:735\n52#3:736\n53#3:738\n38#3:739\n52#3:740\n53#3:742\n110#3:755\n89#3:759\n95#3:760\n659#4,25:703\n378#5,3:756\n381#5,3:761\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nkotlinx/io/Buffer\n*L\n228#1:689,14\n484#1:743,12\n290#1:729\n322#1:734\n330#1:737\n388#1:741\n118#1:688\n290#1:728\n290#1:730\n295#1:731\n307#1:732\n322#1:733\n322#1:735\n330#1:736\n330#1:738\n376#1:739\n388#1:740\n388#1:742\n562#1:755\n572#1:759\n573#1:760\n270#1:703,25\n566#1:756,3\n566#1:761,3\n*E\n"})
public final class b implements c0, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private t f315742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private t f315743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f315744c;

    @k
    public static /* synthetic */ void K1() {
    }

    private final Void N(long j10) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + j() + ", required: " + j10 + ')');
    }

    public static /* synthetic */ void e(b bVar, b bVar2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = bVar.j();
        }
        bVar.d(bVar2, j12, j11);
    }

    @a1
    public static /* synthetic */ void h() {
    }

    @a1
    public static /* synthetic */ void m() {
    }

    @a1
    public static /* synthetic */ void q() {
    }

    private final void r(t tVar, boolean z10) {
        if (g() == null) {
            E(tVar);
            I(tVar);
            return;
        }
        if (!z10) {
            t tVarO = o();
            Intrinsics.checkNotNull(tVarO);
            I(tVarO.q(tVar));
            return;
        }
        t tVarO2 = o();
        Intrinsics.checkNotNull(tVarO2);
        I(tVarO2.q(tVar).a());
        t tVarO3 = o();
        Intrinsics.checkNotNull(tVarO3);
        if (tVarO3.j() == null) {
            E(o());
        }
    }

    static /* synthetic */ void t(b bVar, t tVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if (bVar.g() == null) {
            bVar.E(tVar);
            bVar.I(tVar);
            return;
        }
        if (!z10) {
            t tVarO = bVar.o();
            Intrinsics.checkNotNull(tVarO);
            bVar.I(tVarO.q(tVar));
            return;
        }
        t tVarO2 = bVar.o();
        Intrinsics.checkNotNull(tVarO2);
        bVar.I(tVarO2.q(tVar).a());
        t tVarO3 = bVar.o();
        Intrinsics.checkNotNull(tVarO3);
        if (tVarO3.j() == null) {
            bVar.E(bVar.o());
        }
    }

    public final /* synthetic */ void E(t tVar) {
        this.f315742a = tVar;
    }

    public final /* synthetic */ void H(long j10) {
        this.f315744c = j10;
    }

    public final /* synthetic */ void I(t tVar) {
        this.f315743b = tVar;
    }

    @a1
    public final /* synthetic */ t R(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException(("unexpected capacity (" + i10 + "), should be in range [1, 8192]").toString());
        }
        t tVar = this.f315743b;
        if (tVar == null) {
            t tVarJ = w.j();
            this.f315742a = tVarJ;
            this.f315743b = tVarJ;
            return tVarJ;
        }
        Intrinsics.checkNotNull(tVar);
        if (tVar.d() + i10 <= 8192 && tVar.f315796e) {
            return tVar;
        }
        t tVarQ = tVar.q(w.j());
        this.f315743b = tVarQ;
        return tVarQ;
    }

    @Override // kotlinx.io.c0
    public int Rc(@NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        k0.e(sink.length, i10, i11);
        t tVar = this.f315742a;
        if (tVar == null) {
            return -1;
        }
        int iMin = Math.min(i11 - i10, tVar.n());
        tVar.v(sink, i10, i10 + iMin);
        this.f315744c -= (long) iMin;
        if (v.d(tVar)) {
            x();
        }
        return iMin;
    }

    @Override // kotlinx.io.x
    public void Rd(@NotNull p source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            long jHd = source.hd(this, j11);
            if (jHd == -1) {
                throw new EOFException("Source exhausted before reading " + j10 + " bytes. Only " + (j10 - j11) + " were read.");
            }
            j11 -= jHd;
        }
    }

    @Override // kotlinx.io.c0
    public long T8(@NotNull o sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = j();
        if (j10 > 0) {
            sink.V5(this, j10);
        }
        return j10;
    }

    @Override // kotlinx.io.o
    public void V5(@NotNull b source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        k0.g(source.f315744c, 0L, j10);
        while (j10 > 0) {
            t tVar = source.f315742a;
            Intrinsics.checkNotNull(tVar);
            if (j10 < tVar.n()) {
                t tVar2 = this.f315743b;
                if (tVar2 != null && tVar2.f315796e) {
                    if ((((long) tVar2.d()) + j10) - ((long) (tVar2.m() ? 0 : tVar2.h())) <= PlaybackStateCompat.f9665p2) {
                        t tVar3 = source.f315742a;
                        Intrinsics.checkNotNull(tVar3);
                        tVar3.N(tVar2, (int) j10);
                        source.f315744c -= j10;
                        this.f315744c += j10;
                        return;
                    }
                }
                t tVar4 = source.f315742a;
                Intrinsics.checkNotNull(tVar4);
                source.f315742a = tVar4.G((int) j10);
            }
            t tVar5 = source.f315742a;
            Intrinsics.checkNotNull(tVar5);
            long jN = tVar5.n();
            t tVarP = tVar5.p();
            source.f315742a = tVarP;
            if (tVarP == null) {
                source.f315743b = null;
            }
            if (g() == null) {
                E(tVar5);
                I(tVar5);
            } else {
                t tVarO = o();
                Intrinsics.checkNotNull(tVarO);
                I(tVarO.q(tVar5).a());
                t tVarO2 = o();
                Intrinsics.checkNotNull(tVarO2);
                if (tVarO2.j() == null) {
                    E(o());
                }
            }
            source.f315744c -= jN;
            this.f315744c += jN;
            j10 -= jN;
        }
    }

    @Override // kotlinx.io.x
    @k
    public void Z3() {
    }

    public final void a() throws EOFException {
        skip(j());
    }

    public final long b() {
        long j10 = j();
        if (j10 == 0) {
            return 0L;
        }
        t tVar = this.f315743b;
        Intrinsics.checkNotNull(tVar);
        return (tVar.d() >= 8192 || !tVar.f315796e) ? j10 : j10 - ((long) (tVar.d() - tVar.h()));
    }

    @NotNull
    public final b c() {
        b bVar = new b();
        if (j() == 0) {
            return bVar;
        }
        t tVar = this.f315742a;
        Intrinsics.checkNotNull(tVar);
        t tVarF = tVar.F();
        bVar.f315742a = tVarF;
        bVar.f315743b = tVarF;
        for (t tVarF2 = tVar.f(); tVarF2 != null; tVarF2 = tVarF2.f()) {
            t tVar2 = bVar.f315743b;
            Intrinsics.checkNotNull(tVar2);
            bVar.f315743b = tVar2.q(tVarF2.F());
        }
        bVar.f315744c = j();
        return bVar;
    }

    @Override // kotlinx.io.p, java.lang.AutoCloseable
    public void close() {
    }

    public final void d(@NotNull b out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(out, "out");
        k0.e(j(), j10, j11);
        if (j10 == j11) {
            return;
        }
        long jD = j11 - j10;
        out.f315744c += jD;
        t tVarF = this.f315742a;
        long jD2 = j10;
        while (true) {
            Intrinsics.checkNotNull(tVarF);
            if (jD2 < tVarF.d() - tVarF.h()) {
                break;
            }
            jD2 -= (long) (tVarF.d() - tVarF.h());
            tVarF = tVarF.f();
        }
        while (jD > 0) {
            Intrinsics.checkNotNull(tVarF);
            t tVarF2 = tVarF.F();
            tVarF2.z(tVarF2.h() + ((int) jD2));
            tVarF2.x(Math.min(tVarF2.h() + ((int) jD), tVarF2.d()));
            if (out.g() == null) {
                out.E(tVarF2);
                out.I(tVarF2);
            } else {
                t tVarO = out.o();
                Intrinsics.checkNotNull(tVarO);
                out.I(tVarO.q(tVarF2));
            }
            jD -= (long) (tVarF2.d() - tVarF2.h());
            tVarF = tVarF.f();
            jD2 = 0;
        }
    }

    public final byte f(long j10) {
        long j11 = 0;
        if (j10 < 0 || j10 >= j()) {
            throw new IndexOutOfBoundsException("position (" + j10 + ") is not within the range [0..size(" + j() + "))");
        }
        if (j10 == 0) {
            t tVar = this.f315742a;
            Intrinsics.checkNotNull(tVar);
            return tVar.o(0);
        }
        if (g() == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (j() - j10 >= j10) {
            t tVarG = g();
            while (tVarG != null) {
                long jD = ((long) (tVarG.d() - tVarG.h())) + j11;
                if (jD > j10) {
                    break;
                }
                tVarG = tVarG.f();
                j11 = jD;
            }
            Intrinsics.checkNotNull(tVarG);
            return tVarG.o((int) (j10 - j11));
        }
        t tVarO = o();
        long j12 = j();
        while (tVarO != null && j12 > j10) {
            j12 -= (long) (tVarO.d() - tVarO.h());
            if (j12 <= j10) {
                break;
            }
            tVarO = tVarO.j();
        }
        Intrinsics.checkNotNull(tVarO);
        return tVarO.o((int) (j10 - j12));
    }

    @Override // kotlinx.io.x
    public void f1() {
    }

    @Override // kotlinx.io.x, kotlinx.io.o, java.io.Flushable
    public void flush() {
    }

    public final /* synthetic */ t g() {
        return this.f315742a;
    }

    @Override // kotlinx.io.p
    public long hd(@NotNull b sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        if (j() == 0) {
            return -1L;
        }
        if (j10 > j()) {
            j10 = j();
        }
        sink.V5(this, j10);
        return j10;
    }

    @Override // kotlinx.io.c0
    public void ic(@NotNull o sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        if (j() >= j10) {
            sink.V5(this, j10);
            return;
        }
        sink.V5(this, j());
        throw new EOFException("Buffer exhausted before writing " + j10 + " bytes. Only " + j() + " bytes were written.");
    }

    public final long j() {
        return this.f315744c;
    }

    public final /* synthetic */ long l() {
        return this.f315744c;
    }

    @Override // kotlinx.io.x
    public long la(@NotNull p source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long jHd = source.hd(this, PlaybackStateCompat.f9665p2);
            if (jHd == -1) {
                return j10;
            }
            j10 += jHd;
        }
    }

    @Override // kotlinx.io.x
    public void m6(byte b10) {
        R(1).J(b10);
        this.f315744c++;
    }

    @Override // kotlinx.io.c0, kotlinx.io.x
    @NotNull
    public b n() {
        return this;
    }

    public final /* synthetic */ t o() {
        return this.f315743b;
    }

    @Override // kotlinx.io.x
    public void oc(short s10) {
        R(2).M(s10);
        this.f315744c += 2;
    }

    @Override // kotlinx.io.c0
    @NotNull
    public c0 peek() {
        return g.b(new n(this));
    }

    @Override // kotlinx.io.c0
    public void q1(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (j() >= j10) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + j() + ", required: " + j10 + ')');
    }

    @Override // kotlinx.io.c0
    public byte readByte() throws EOFException {
        t tVar = this.f315742a;
        if (tVar == null) {
            N(1L);
            throw new kotlin.a0();
        }
        int iN = tVar.n();
        if (iN == 0) {
            x();
            return readByte();
        }
        byte bR = tVar.r();
        this.f315744c--;
        if (iN == 1) {
            x();
        }
        return bR;
    }

    @Override // kotlinx.io.c0
    public int readInt() throws EOFException {
        t tVar = this.f315742a;
        if (tVar == null) {
            N(4L);
            throw new kotlin.a0();
        }
        int iN = tVar.n();
        if (iN >= 4) {
            int iS = tVar.s();
            this.f315744c -= 4;
            if (iN == 4) {
                x();
            }
            return iS;
        }
        q1(4L);
        if (iN == 0) {
            x();
            return readInt();
        }
        return (readShort() & e2.f312492d) | (readShort() << 16);
    }

    @Override // kotlinx.io.c0
    public long readLong() throws EOFException {
        t tVar = this.f315742a;
        if (tVar == null) {
            N(8L);
            throw new kotlin.a0();
        }
        int iN = tVar.n();
        if (iN < 8) {
            q1(8L);
            if (iN != 0) {
                return (((long) readInt()) << 32) | (((long) readInt()) & com.rabbitmq.client.k0.f265952a);
            }
            x();
            return readLong();
        }
        long jT = tVar.t();
        this.f315744c -= 8;
        if (iN == 8) {
            x();
        }
        return jT;
    }

    @Override // kotlinx.io.c0
    public short readShort() throws EOFException {
        t tVar = this.f315742a;
        if (tVar == null) {
            N(2L);
            throw new kotlin.a0();
        }
        int iN = tVar.n();
        if (iN >= 2) {
            short sU = tVar.u();
            this.f315744c -= 2;
            if (iN == 2) {
                x();
            }
            return sU;
        }
        q1(2L);
        if (iN == 0) {
            x();
            return readShort();
        }
        return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
    }

    @Override // kotlinx.io.c0
    public boolean request(long j10) {
        if (j10 >= 0) {
            return j() >= j10;
        }
        throw new IllegalArgumentException(("byteCount: " + j10 + " < 0").toString());
    }

    @Override // kotlinx.io.c0
    public void skip(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            t tVar = this.f315742a;
            if (tVar == null) {
                throw new EOFException("Buffer exhausted before skipping " + j10 + " bytes.");
            }
            int iMin = (int) Math.min(j11, tVar.d() - tVar.h());
            long j12 = iMin;
            this.f315744c -= j12;
            j11 -= j12;
            tVar.z(tVar.h() + iMin);
            if (tVar.h() == tVar.d()) {
                x();
            }
        }
    }

    @NotNull
    public String toString() {
        if (j() == 0) {
            return "Buffer(size=0)";
        }
        long j10 = 64;
        int iMin = (int) Math.min(j10, j());
        StringBuilder sb2 = new StringBuilder((iMin * 2) + (j() > j10 ? 1 : 0));
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        int i10 = 0;
        for (t tVarG = g(); tVarG != null; tVarG = tVarG.f()) {
            kotlinx.io.unsafe.b bVar = kotlinx.io.unsafe.f.f315800a;
            int i11 = 0;
            while (i10 < iMin && i11 < tVarG.n()) {
                int i12 = i11 + 1;
                byte b10 = bVar.b(tVarG, i11);
                i10++;
                sb2.append(k0.h()[(b10 >> 4) & 15]);
                sb2.append(k0.h()[b10 & com.google.common.base.c.f116464q]);
                i11 = i12;
            }
        }
        if (j() > j10) {
            sb2.append(kotlin.text.b0.F);
        }
        return "Buffer(size=" + j() + " hex=" + ((Object) sb2) + ')';
    }

    @Override // kotlinx.io.x
    public void write(@NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(source, "source");
        k0.e(source.length, i10, i11);
        int i12 = i10;
        while (i12 < i11) {
            t tVarR = R(1);
            int iMin = Math.min(i11 - i12, tVarR.l()) + i12;
            tVarR.H(source, i12, iMin);
            i12 = iMin;
        }
        this.f315744c += (long) (i11 - i10);
    }

    @Override // kotlinx.io.x
    public void writeInt(int i10) {
        R(4).K(i10);
        this.f315744c += 4;
    }

    @Override // kotlinx.io.x
    public void writeLong(long j10) {
        R(8).L(j10);
        this.f315744c += 8;
    }

    public final void x() {
        t tVar = this.f315742a;
        Intrinsics.checkNotNull(tVar);
        t tVarF = tVar.f();
        this.f315742a = tVarF;
        if (tVarF == null) {
            this.f315743b = null;
        } else {
            tVarF.A(null);
        }
        tVar.y(null);
        w.h(tVar);
    }

    @a1
    public final /* synthetic */ void y() {
        t tVar = this.f315743b;
        Intrinsics.checkNotNull(tVar);
        t tVarJ = tVar.j();
        this.f315743b = tVarJ;
        int i10 = 2 & 0;
        if (tVarJ == null) {
            this.f315742a = null;
        } else {
            tVarJ.y(null);
        }
        tVar.A(null);
        w.h(tVar);
    }

    @Override // kotlinx.io.c0
    public boolean y1() {
        return j() == 0;
    }
}
