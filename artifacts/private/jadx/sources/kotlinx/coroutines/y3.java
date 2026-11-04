package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class y3 extends v2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315729g = AtomicIntegerFieldUpdater.newUpdater(y3.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Thread f315730e = Thread.currentThread();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private o1 f315731f;

    private final /* synthetic */ int H() {
        return this._state$volatile;
    }

    private final Void J(int i10) {
        throw new IllegalStateException(("Illegal state " + i10).toString());
    }

    private final /* synthetic */ void K(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void L(int i10) {
        this._state$volatile = i10;
    }

    @Override // kotlinx.coroutines.v2
    public boolean D() {
        return true;
    }

    @Override // kotlinx.coroutines.v2
    public void E(@Nullable Throwable th2) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315729g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    return;
                }
                J(i10);
                throw new kotlin.a0();
            }
        } while (!f315729g.compareAndSet(this, i10, 2));
        this.f315730e.interrupt();
        f315729g.set(this, 3);
    }

    public final void G() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315729g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        J(i10);
                        throw new kotlin.a0();
                    }
                }
            } else if (f315729g.compareAndSet(this, i10, 1)) {
                o1 o1Var = this.f315731f;
                if (o1Var != null) {
                    o1Var.dispose();
                    return;
                }
                return;
            }
        }
    }

    public final void M(@NotNull p2 p2Var) {
        int i10;
        this.f315731f = u2.B(p2Var, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315729g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                J(i10);
                throw new kotlin.a0();
            }
        } while (!f315729g.compareAndSet(this, i10, 0));
    }
}
