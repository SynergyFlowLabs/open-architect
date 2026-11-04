package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends c0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315433c = AtomicIntegerFieldUpdater.newUpdater(s.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public s(@NotNull kotlin.coroutines.d<?> dVar, @Nullable Throwable th2, boolean z10) {
        if (th2 == null) {
            th2 = new CancellationException("Continuation " + dVar + " was cancelled normally");
        }
        super(th2, z10);
    }

    private final /* synthetic */ int f() {
        return this._resumed$volatile;
    }

    private final /* synthetic */ void i(int i10) {
        this._resumed$volatile = i10;
    }

    public final boolean h() {
        return f315433c.compareAndSet(this, 0, 1);
    }
}
