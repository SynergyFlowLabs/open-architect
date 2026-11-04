package kotlinx.coroutines.flow;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 implements j<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Throwable f314221a;

    public f1(@NotNull Throwable th2) {
        this.f314221a = th2;
    }

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(@Nullable Object obj, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        throw this.f314221a;
    }
}
