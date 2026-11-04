package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.Intrinsics;
import okio.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FileChannel f334023a;

    public a(@NotNull FileChannel fileChannel) {
        Intrinsics.checkNotNullParameter(fileChannel, "fileChannel");
        this.f334023a = fileChannel;
    }

    public final void a(long j10, @NotNull l sink, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferTo = this.f334023a.transferTo(j12, j13, sink);
            j12 += jTransferTo;
            j13 -= jTransferTo;
        }
    }

    public final void b(long j10, @NotNull l source, long j11) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j11 < 0 || j11 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferFrom = this.f334023a.transferFrom(source, j12, j13);
            j12 += jTransferFrom;
            j13 -= jTransferFrom;
        }
    }
}
