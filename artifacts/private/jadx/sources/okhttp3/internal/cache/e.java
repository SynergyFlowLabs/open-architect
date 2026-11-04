package okhttp3.internal.cache;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.l;
import okio.x;
import okio.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public class e extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<IOException, Unit> f334021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f334022c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull z0 delegate, @NotNull Function1<? super IOException, Unit> onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f334021b = onException;
    }

    @Override // okio.x, okio.z0
    public void Ga(@NotNull l source, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f334022c) {
            source.skip(j10);
            return;
        }
        try {
            super.Ga(source, j10);
        } catch (IOException e10) {
            this.f334022c = true;
            this.f334021b.invoke(e10);
        }
    }

    @NotNull
    public final Function1<IOException, Unit> c() {
        return this.f334021b;
    }

    @Override // okio.x, okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f334022c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f334022c = true;
            this.f334021b.invoke(e10);
        }
    }

    @Override // okio.x, okio.z0, java.io.Flushable
    public void flush() {
        if (this.f334022c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f334022c = true;
            this.f334021b.invoke(e10);
        }
    }
}
