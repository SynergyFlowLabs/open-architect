package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import okio.l;
import okio.o;
import okio.r;
import okio.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f334575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f334576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Deflater f334577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final r f334578d;

    public a(boolean z10) {
        this.f334575a = z10;
        l lVar = new l();
        this.f334576b = lVar;
        Deflater deflater = new Deflater(-1, true);
        this.f334577c = deflater;
        this.f334578d = new r((z0) lVar, deflater);
    }

    private final boolean b(l lVar, o oVar) {
        return lVar.u3(lVar.size() - ((long) oVar.v0()), oVar);
    }

    public final void a(@NotNull l buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (this.f334576b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f334575a) {
            this.f334577c.reset();
        }
        this.f334578d.Ga(buffer, buffer.size());
        this.f334578d.flush();
        if (b(this.f334576b, b.f334579a)) {
            long size = this.f334576b.size() - ((long) 4);
            l.a aVarJ0 = l.j0(this.f334576b, null, 1, null);
            try {
                aVarJ0.d(size);
                kotlin.io.c.a(aVarJ0, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(aVarJ0, th2);
                    throw th3;
                }
            }
        } else {
            this.f334576b.writeByte(0);
        }
        l lVar = this.f334576b;
        buffer.Ga(lVar, lVar.size());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f334578d.close();
    }
}
