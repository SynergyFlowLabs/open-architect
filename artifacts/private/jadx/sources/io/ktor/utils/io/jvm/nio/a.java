package io.ktor.utils.io.jvm.nio;

import androidx.collection.g3;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.p;
import kotlinx.io.t;
import kotlinx.io.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nReading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reading.kt\nio/ktor/utils/io/jvm/nio/ReadableByteChannelSource\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,78:1\n195#2,28:79\n*S KotlinDebug\n*F\n+ 1 Reading.kt\nio/ktor/utils/io/jvm/nio/ReadableByteChannelSource\n*L\n62#1:79,28\n*E\n"})
class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReadableByteChannel f296927a;

    public a(@NotNull ReadableByteChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f296927a = channel;
    }

    @Override // kotlinx.io.p, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f296927a.close();
    }

    @Override // kotlinx.io.p
    public long hd(@NotNull kotlinx.io.b sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j10, g3.f12256c);
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        t tVarR = sink.R(1);
        byte[] bArrB = tVarR.b(false);
        int iD = tVarR.d();
        int i10 = this.f296927a.read(ByteBuffer.wrap(bArrB, iD, Math.min(iMin, bArrB.length - iD)));
        int iMax = Math.max(i10, 0);
        if (iMax == 1) {
            tVarR.I(bArrB, iMax);
            tVarR.x(tVarR.d() + iMax);
            sink.H(sink.l() + ((long) iMax));
        } else {
            if (iMax < 0 || iMax > tVarR.l()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + iMax + ". Should be in 0.." + tVarR.l()).toString());
            }
            if (iMax != 0) {
                tVarR.I(bArrB, iMax);
                tVarR.x(tVarR.d() + iMax);
                sink.H(sink.l() + ((long) iMax));
            } else if (v.d(tVarR)) {
                sink.y();
            }
        }
        return i10;
    }

    @NotNull
    public String toString() {
        return "ReadableByteChannelSource(" + this.f296927a + ')';
    }
}
