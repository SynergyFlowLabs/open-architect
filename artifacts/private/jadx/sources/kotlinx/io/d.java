package kotlinx.io;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nBuffersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuffersJvm.kt\nkotlinx/io/BuffersJvmKt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 5 Buffer.kt\nkotlinx/io/BufferKt\n+ 6 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsKt\n*L\n1#1,207:1\n52#2:208\n53#2:210\n107#2:217\n107#2:242\n110#2:260\n1#3:209\n1#3:239\n1#3:250\n1#3:286\n195#4,6:211\n203#4,20:218\n99#4:238\n100#4,2:240\n102#4,6:243\n347#4:249\n348#4,5:251\n353#4:258\n354#4:262\n355#4:284\n99#4:285\n100#4,8:287\n195#4,28:295\n659#5,2:256\n663#5,21:263\n434#6:259\n435#6:261\n*S KotlinDebug\n*F\n+ 1 BuffersJvm.kt\nkotlinx/io/BuffersJvmKt\n*L\n57#1:208\n57#1:210\n68#1:217\n101#1:242\n138#1:260\n57#1:209\n100#1:239\n133#1:250\n160#1:286\n67#1:211,6\n67#1:218,20\n100#1:238\n100#1:240,2\n100#1:243,6\n133#1:249\n133#1:251,5\n133#1:258\n133#1:262\n133#1:284\n160#1:285\n160#1:287,8\n180#1:295,28\n133#1:256,2\n133#1:263,21\n137#1:259\n137#1:261\n*E\n"})
public final class d {

    public static final class a implements ByteChannel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f315753a;

        a(b bVar) {
            this.f315753a = bVar;
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return true;
        }

        @Override // java.nio.channels.ReadableByteChannel
        public int read(ByteBuffer sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return d.d(this.f315753a, sink);
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer source) {
            Intrinsics.checkNotNullParameter(source, "source");
            long j10 = this.f315753a.j();
            d.h(this.f315753a, source);
            return (int) (this.f315753a.j() - j10);
        }
    }

    @NotNull
    public static final ByteChannel a(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new a(bVar);
    }

    public static final void b(@NotNull b bVar, @NotNull OutputStream out, long j10, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        k0.e(bVar.j(), j10, j11);
        if (j10 == j11) {
            return;
        }
        long j12 = j11 - j10;
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        if (j10 < 0) {
            throw new IllegalArgumentException(("Offset must be non-negative: " + j10).toString());
        }
        if (j10 >= bVar.j()) {
            throw new IndexOutOfBoundsException("Offset should be less than buffer's size (" + bVar.j() + "): " + j10);
        }
        if (bVar.g() == null) {
            kotlinx.io.unsafe.a aVar = kotlinx.io.unsafe.f.f315802c;
            t tVarA = null;
            Intrinsics.checkNotNull(null);
            int i10 = (int) (j10 - (-1));
            while (j12 > 0) {
                byte[] bArrB = tVarA.b(true);
                int iH = tVarA.h();
                int iMin = (int) Math.min((tVarA.d() - iH) - i10, j12);
                out.write(bArrB, iH + i10, iMin);
                j12 -= (long) iMin;
                tVarA = aVar.a(tVarA);
                if (tVarA == null) {
                    return;
                } else {
                    i10 = 0;
                }
            }
            return;
        }
        if (bVar.j() - j10 < j10) {
            t tVarO = bVar.o();
            long j13 = bVar.j();
            while (tVarO != null && j13 > j10) {
                j13 -= (long) (tVarO.d() - tVarO.h());
                if (j13 <= j10) {
                    break;
                } else {
                    tVarO = tVarO.j();
                }
            }
            kotlinx.io.unsafe.a aVar2 = kotlinx.io.unsafe.f.f315802c;
            Intrinsics.checkNotNull(tVarO);
            int i11 = (int) (j10 - j13);
            while (j12 > 0) {
                byte[] bArrB2 = tVarO.b(true);
                int iH2 = tVarO.h();
                int iMin2 = (int) Math.min((tVarO.d() - iH2) - i11, j12);
                out.write(bArrB2, iH2 + i11, iMin2);
                j12 -= (long) iMin2;
                tVarO = aVar2.a(tVarO);
                if (tVarO == null) {
                    return;
                } else {
                    i11 = 0;
                }
            }
            return;
        }
        t tVarG = bVar.g();
        long j14 = 0;
        while (tVarG != null) {
            long jD = ((long) (tVarG.d() - tVarG.h())) + j14;
            if (jD > j10) {
                break;
            }
            tVarG = tVarG.f();
            j14 = jD;
        }
        kotlinx.io.unsafe.a aVar3 = kotlinx.io.unsafe.f.f315802c;
        Intrinsics.checkNotNull(tVarG);
        int i12 = (int) (j10 - j14);
        while (j12 > 0) {
            byte[] bArrB3 = tVarG.b(true);
            int iH3 = tVarG.h();
            int iMin3 = (int) Math.min((tVarG.d() - iH3) - i12, j12);
            out.write(bArrB3, iH3 + i12, iMin3);
            j12 -= (long) iMin3;
            tVarG = aVar3.a(tVarG);
            if (tVarG == null) {
                return;
            } else {
                i12 = 0;
            }
        }
    }

    public static /* synthetic */ void c(b bVar, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = bVar.j();
        }
        b(bVar, outputStream, j12, j11);
    }

    public static final int d(@NotNull b bVar, @NotNull ByteBuffer sink) throws EOFException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (bVar.y1()) {
            return -1;
        }
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        if (bVar.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t tVarG = bVar.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        int iMin = Math.min(sink.remaining(), tVarG.d() - iH);
        sink.put(bArrB, iH, iMin);
        if (iMin == 0) {
            return iMin;
        }
        if (iMin < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (iMin > tVarG.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        bVar.skip(iMin);
        return iMin;
    }

    public static final void e(@NotNull b bVar, @NotNull OutputStream out, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        k0.g(bVar.j(), 0L, j10);
        while (j10 > 0) {
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            if (bVar.y1()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            t tVarG = bVar.g();
            Intrinsics.checkNotNull(tVarG);
            byte[] bArrB = tVarG.b(true);
            int iH = tVarG.h();
            int iMin = (int) Math.min(j10, tVarG.d() - iH);
            out.write(bArrB, iH, iMin);
            long j11 = iMin;
            j10 -= j11;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > tVarG.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                bVar.skip(j11);
            }
        }
    }

    public static /* synthetic */ void f(b bVar, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = bVar.j();
        }
        e(bVar, outputStream, j10);
    }

    @NotNull
    public static final b g(@NotNull b bVar, @NotNull InputStream input) throws IOException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        j(bVar, input, Long.MAX_VALUE, true);
        return bVar;
    }

    @NotNull
    public static final b h(@NotNull b bVar, @NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int iRemaining = source.remaining();
        while (iRemaining > 0) {
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            t tVarR = bVar.R(1);
            byte[] bArrB = tVarR.b(false);
            int iD = tVarR.d();
            int iMin = Math.min(iRemaining, bArrB.length - iD);
            source.get(bArrB, iD, iMin);
            iRemaining -= iMin;
            if (iMin == 1) {
                tVarR.I(bArrB, iMin);
                tVarR.x(tVarR.d() + iMin);
                bVar.H(bVar.l() + ((long) iMin));
            } else {
                if (iMin < 0 || iMin > tVarR.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + iMin + ". Should be in 0.." + tVarR.l()).toString());
                }
                if (iMin != 0) {
                    tVarR.I(bArrB, iMin);
                    tVarR.x(tVarR.d() + iMin);
                    bVar.H(bVar.l() + ((long) iMin));
                } else if (v.d(tVarR)) {
                    bVar.y();
                }
            }
        }
        return bVar;
    }

    @NotNull
    public static final b i(@NotNull b bVar, @NotNull InputStream input, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(input, "input");
        if (j10 >= 0) {
            j(bVar, input, j10, false);
            return bVar;
        }
        throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
    }

    private static final void j(b bVar, InputStream inputStream, long j10, boolean z10) throws IOException {
        long j11 = j10;
        boolean z11 = false;
        while (!z11) {
            if (j11 <= 0 && !z10) {
                return;
            }
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            t tVarR = bVar.R(1);
            byte[] bArrB = tVarR.b(false);
            int iD = tVarR.d();
            int i10 = inputStream.read(bArrB, iD, (int) Math.min(j11, bArrB.length - iD));
            if (i10 != -1) {
                j11 -= (long) i10;
            } else {
                if (!z10) {
                    throw new EOFException("Stream exhausted before " + j10 + " bytes were read.");
                }
                i10 = 0;
                z11 = true;
            }
            if (i10 == 1) {
                tVarR.I(bArrB, i10);
                tVarR.x(tVarR.d() + i10);
                bVar.H(bVar.l() + ((long) i10));
            } else {
                if (i10 < 0 || i10 > tVarR.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + i10 + ". Should be in 0.." + tVarR.l()).toString());
                }
                if (i10 != 0) {
                    tVarR.I(bArrB, i10);
                    tVarR.x(tVarR.d() + i10);
                    bVar.H(bVar.l() + ((long) i10));
                } else if (v.d(tVarR)) {
                    bVar.y();
                }
            }
        }
    }
}
