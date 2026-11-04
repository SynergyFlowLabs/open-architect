package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.b1;
import okio.e0;
import okio.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f334581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f334582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Inflater f334583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final e0 f334584d;

    public c(boolean z10) {
        this.f334581a = z10;
        l lVar = new l();
        this.f334582b = lVar;
        Inflater inflater = new Inflater(true);
        this.f334583c = inflater;
        this.f334584d = new e0((b1) lVar, inflater);
    }

    public final void a(@NotNull l buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f334582b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f334581a) {
            this.f334583c.reset();
        }
        this.f334582b.Ma(buffer);
        this.f334582b.writeInt(65535);
        long bytesRead = this.f334583c.getBytesRead() + this.f334582b.size();
        do {
            this.f334584d.a(buffer, Long.MAX_VALUE);
        } while (this.f334583c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f334584d.close();
    }
}
