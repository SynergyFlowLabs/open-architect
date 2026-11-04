package kotlinx.coroutines.android;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.l;
import kotlin.n;
import kotlinx.coroutines.a3;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class g extends a3 implements c1 {
    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract g R0();

    @NotNull
    public o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return c1.a.b(this, j10, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.c1
    @l(level = n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return c1.a.a(this, j10, dVar);
    }

    private g() {
    }
}
