package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class o2 extends v2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f315186e;

    /* JADX WARN: Multi-variable type inference failed */
    public o2(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f315186e = function1;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return false;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        this.f315186e.invoke(th2);
    }
}
