package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class n2 extends v2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315182f = AtomicIntegerFieldUpdater.newUpdater(n2.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<Throwable, Unit> f315183e;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f315183e = function1;
    }

    private final /* synthetic */ int G() {
        return this._invoked$volatile;
    }

    private final /* synthetic */ void I(int i10) {
        this._invoked$volatile = i10;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        if (f315182f.compareAndSet(this, 0, 1)) {
            this.f315183e.invoke(th2);
        }
    }
}
