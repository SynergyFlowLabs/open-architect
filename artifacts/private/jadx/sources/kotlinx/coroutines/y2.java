package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
final class y2<T> extends b1<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<Unit> f315728d;

    public y2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super s0, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.f315728d = kotlin.coroutines.intrinsics.b.c(function2, this, this);
    }

    @Override // kotlinx.coroutines.w2
    protected void K1() throws Throwable {
        bk.a.c(this.f315728d, this);
    }
}
