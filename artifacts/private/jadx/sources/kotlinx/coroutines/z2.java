package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class z2 extends n3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f315735d;

    public z2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.f315735d = kotlin.coroutines.intrinsics.b.c(function2, this, this);
    }

    @Override // kotlinx.coroutines.w2
    protected void K1() throws Throwable {
        bk.a.c(this.f315735d, this);
    }
}
