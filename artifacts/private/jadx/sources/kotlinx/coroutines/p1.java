package kotlinx.coroutines;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class p1 implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o1 f315193a;

    public p1(@NotNull o1 o1Var) {
        this.f315193a = o1Var;
    }

    @Override // kotlinx.coroutines.m
    public void e(@Nullable Throwable th2) {
        this.f315193a.dispose();
    }

    @NotNull
    public String toString() {
        return "DisposeOnCancel[" + this.f315193a + AbstractJsonLexerKt.END_LIST;
    }
}
