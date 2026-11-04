package kotlinx.io;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmCore.kt\nkotlinx/io/OutputStreamSink\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,112:1\n99#2:113\n100#2,2:115\n102#2,6:118\n1#3:114\n107#4:117\n*S KotlinDebug\n*F\n+ 1 JvmCore.kt\nkotlinx/io/OutputStreamSink\n*L\n48#1:113\n48#1:115,2\n48#1:118,6\n48#1:114\n49#1:117\n*E\n"})
class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final OutputStream f315773a;

    public m(@NotNull OutputStream out) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f315773a = out;
    }

    @Override // kotlinx.io.o
    public void V5(@NotNull b source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        k0.g(source.j(), 0L, j10);
        while (j10 > 0) {
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            if (source.y1()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            t tVarG = source.g();
            Intrinsics.checkNotNull(tVarG);
            byte[] bArrB = tVarG.b(true);
            int iH = tVarG.h();
            int iMin = (int) Math.min(j10, tVarG.d() - iH);
            this.f315773a.write(bArrB, iH, iMin);
            long j11 = iMin;
            j10 -= j11;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > tVarG.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                source.skip(j11);
            }
        }
    }

    @Override // kotlinx.io.o, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f315773a.close();
    }

    @Override // kotlinx.io.o, java.io.Flushable
    public void flush() throws IOException {
        this.f315773a.flush();
    }

    @NotNull
    public String toString() {
        return "RawSink(" + this.f315773a + ')';
    }
}
