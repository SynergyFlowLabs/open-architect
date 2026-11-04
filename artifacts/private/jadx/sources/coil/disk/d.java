package coil.disk;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okio.l;
import okio.x;
import okio.z0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<IOException, Unit> f87288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f87289c;

    /* JADX WARN: Multi-variable type inference failed */
    public d(@NotNull z0 z0Var, @NotNull Function1<? super IOException, Unit> function1) {
        super(z0Var);
        this.f87288b = function1;
    }

    @Override // okio.x, okio.z0
    public void Ga(@NotNull l lVar, long j10) throws EOFException {
        if (this.f87289c) {
            lVar.skip(j10);
            return;
        }
        try {
            super.Ga(lVar, j10);
        } catch (IOException e10) {
            this.f87289c = true;
            this.f87288b.invoke(e10);
        }
    }

    @Override // okio.x, okio.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f87289c = true;
            this.f87288b.invoke(e10);
        }
    }

    @Override // okio.x, okio.z0, java.io.Flushable
    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f87289c = true;
            this.f87288b.invoke(e10);
        }
    }
}
