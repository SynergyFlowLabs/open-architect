package kotlinx.io;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRealSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealSource.kt\nkotlinx/io/RealSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,162:1\n159#1:163\n160#1:165\n159#1:167\n160#1:169\n159#1:170\n160#1:172\n159#1:176\n160#1:178\n159#1:180\n160#1:182\n1#2:164\n1#2:166\n1#2:168\n1#2:171\n1#2:173\n1#2:177\n1#2:179\n1#2:181\n1#2:183\n38#3:174\n110#3:175\n*S KotlinDebug\n*F\n+ 1 RealSource.kt\nkotlinx/io/RealSource\n*L\n38#1:163\n38#1:165\n51#1:167\n51#1:169\n60#1:170\n60#1:172\n127#1:176\n127#1:178\n144#1:180\n144#1:182\n38#1:164\n51#1:168\n60#1:171\n127#1:177\n144#1:181\n74#1:174\n80#1:175\n*E\n"})
public final class r implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f315783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public boolean f315784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final b f315785c;

    public r(@NotNull p source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f315783a = source;
        this.f315785c = new b();
    }

    @k
    public static /* synthetic */ void K1() {
    }

    private final void a() {
        if (this.f315784b) {
            throw new IllegalStateException("Source is closed.");
        }
    }

    @Override // kotlinx.io.c0
    public int Rc(@NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        k0.e(sink.length, i10, i11);
        if (this.f315785c.j() == 0 && this.f315783a.hd(this.f315785c, PlaybackStateCompat.f9665p2) == -1) {
            return -1;
        }
        return this.f315785c.Rc(sink, i10, ((int) Math.min(i11 - i10, this.f315785c.j())) + i10);
    }

    @Override // kotlinx.io.c0
    public long T8(@NotNull o sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (this.f315783a.hd(this.f315785c, PlaybackStateCompat.f9665p2) != -1) {
            long jB = this.f315785c.b();
            if (jB > 0) {
                j10 += jB;
                sink.V5(this.f315785c, jB);
            }
        }
        if (this.f315785c.j() <= 0) {
            return j10;
        }
        long j11 = j10 + this.f315785c.j();
        b bVar = this.f315785c;
        sink.V5(bVar, bVar.j());
        return j11;
    }

    @NotNull
    public final p b() {
        return this.f315783a;
    }

    @Override // kotlinx.io.p, java.lang.AutoCloseable
    public void close() throws EOFException {
        if (this.f315784b) {
            return;
        }
        this.f315784b = true;
        this.f315783a.close();
        this.f315785c.a();
    }

    @Override // kotlinx.io.p
    public long hd(@NotNull b sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f315784b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.f315785c.j() == 0 && this.f315783a.hd(this.f315785c, PlaybackStateCompat.f9665p2) == -1) {
            return -1L;
        }
        return this.f315785c.hd(sink, Math.min(j10, this.f315785c.j()));
    }

    @Override // kotlinx.io.c0
    public void ic(@NotNull o sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            q1(j10);
            this.f315785c.ic(sink, j10);
        } catch (EOFException e10) {
            sink.V5(this.f315785c, this.f315785c.j());
            throw e10;
        }
    }

    @Override // kotlinx.io.c0, kotlinx.io.x
    @NotNull
    public b n() {
        return this.f315785c;
    }

    @Override // kotlinx.io.c0
    @NotNull
    public c0 peek() {
        if (this.f315784b) {
            throw new IllegalStateException("Source is closed.");
        }
        return g.b(new n(this));
    }

    @Override // kotlinx.io.c0
    public void q1(long j10) throws EOFException {
        if (request(j10)) {
            return;
        }
        throw new EOFException("Source doesn't contain required number of bytes (" + j10 + ").");
    }

    @Override // kotlinx.io.c0
    public byte readByte() throws EOFException {
        q1(1L);
        return this.f315785c.readByte();
    }

    @Override // kotlinx.io.c0
    public int readInt() throws EOFException {
        q1(4L);
        return this.f315785c.readInt();
    }

    @Override // kotlinx.io.c0
    public long readLong() throws EOFException {
        q1(8L);
        return this.f315785c.readLong();
    }

    @Override // kotlinx.io.c0
    public short readShort() throws EOFException {
        q1(2L);
        return this.f315785c.readShort();
    }

    @Override // kotlinx.io.c0
    public boolean request(long j10) {
        if (this.f315784b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        while (this.f315785c.j() < j10) {
            if (this.f315783a.hd(this.f315785c, PlaybackStateCompat.f9665p2) == -1) {
                boolean z10 = true;
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.io.c0
    public void skip(long j10) throws EOFException {
        if (this.f315784b) {
            throw new IllegalStateException("Source is closed.");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        long j11 = j10;
        while (j11 > 0) {
            if (this.f315785c.j() == 0 && this.f315783a.hd(this.f315785c, PlaybackStateCompat.f9665p2) == -1) {
                throw new EOFException("Source exhausted before skipping " + j10 + " bytes (only " + (j11 - j10) + " bytes were skipped).");
            }
            long jMin = Math.min(j11, this.f315785c.j());
            this.f315785c.skip(jMin);
            j11 -= jMin;
        }
    }

    @NotNull
    public String toString() {
        return "buffered(" + this.f315783a + ')';
    }

    @Override // kotlinx.io.c0
    public boolean y1() {
        if (this.f315784b) {
            throw new IllegalStateException("Source is closed.");
        }
        return this.f315785c.y1() && this.f315783a.hd(this.f315785c, PlaybackStateCompat.f9665p2) == -1;
    }
}
