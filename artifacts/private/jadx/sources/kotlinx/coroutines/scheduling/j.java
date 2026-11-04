package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.x0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class j extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Runnable f315486c;

    public j(@NotNull Runnable runnable, long j10, boolean z10) {
        super(j10, z10);
        this.f315486c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f315486c.run();
    }

    @NotNull
    public String toString() {
        return "Task[" + x0.a(this.f315486c) + '@' + x0.b(this.f315486c) + ", " + this.f315484a + ", " + k.d(this.f315485b) + AbstractJsonLexerKt.END_LIST;
    }
}
