package kotlinx.io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nJvmCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmCore.kt\nkotlinx/io/InputStreamSource\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,112:1\n52#2:113\n53#2:115\n107#2:122\n1#3:114\n195#4,6:116\n203#4,20:123\n*S KotlinDebug\n*F\n+ 1 JvmCore.kt\nkotlinx/io/InputStreamSource\n*L\n80#1:113\n80#1:115\n84#1:122\n80#1:114\n83#1:116,6\n83#1:123,20\n*E\n"})
class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final InputStream f315771a;

    public j(@NotNull InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f315771a = input;
    }

    @Override // kotlinx.io.p, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f315771a.close();
    }

    @Override // kotlinx.io.p
    public long hd(@NotNull b sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 == 0) {
            return 0L;
        }
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") < 0").toString());
        }
        try {
            kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
            t tVarR = sink.R(1);
            int i10 = 0;
            byte[] bArrB = tVarR.b(false);
            int iD = tVarR.d();
            long j11 = this.f315771a.read(bArrB, iD, (int) Math.min(j10, bArrB.length - iD));
            if (j11 != -1) {
                i10 = (int) j11;
            }
            if (i10 == 1) {
                tVarR.I(bArrB, i10);
                tVarR.x(tVarR.d() + i10);
                sink.H(sink.l() + ((long) i10));
                return j11;
            }
            if (i10 < 0 || i10 > tVarR.l()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i10 + ". Should be in 0.." + tVarR.l()).toString());
            }
            if (i10 == 0) {
                if (v.d(tVarR)) {
                    sink.y();
                }
                return j11;
            }
            tVarR.I(bArrB, i10);
            tVarR.x(tVarR.d() + i10);
            sink.H(sink.l() + ((long) i10));
            return j11;
        } catch (AssertionError e10) {
            if (l.c(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    @NotNull
    public String toString() {
        return "RawSource(" + this.f315771a + ')';
    }
}
