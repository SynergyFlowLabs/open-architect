package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class h1<T> extends kotlinx.coroutines.internal.v0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315033e = AtomicIntegerFieldUpdater.newUpdater(h1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public h1(@NotNull CoroutineContext coroutineContext, @NotNull kotlin.coroutines.d<? super T> dVar) {
        super(coroutineContext, dVar);
    }

    private final /* synthetic */ int k2() {
        return this._decision$volatile;
    }

    private final /* synthetic */ void m2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void n2(int i10) {
        this._decision$volatile = i10;
    }

    private final boolean o2() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315033e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f315033e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean p2() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315033e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f315033e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.v0, kotlinx.coroutines.w2
    protected void a0(@Nullable Object obj) {
        d2(obj);
    }

    @Override // kotlinx.coroutines.internal.v0, kotlinx.coroutines.a
    protected void d2(@Nullable Object obj) {
        if (o2()) {
            return;
        }
        kotlinx.coroutines.internal.n.d(kotlin.coroutines.intrinsics.b.e(this.f315130d), f0.a(obj, this.f315130d));
    }

    @Nullable
    public final Object j2() {
        if (p2()) {
            return kotlin.coroutines.intrinsics.b.l();
        }
        Object objH = x2.h(c1());
        if (objH instanceof c0) {
            throw ((c0) objH).f313551a;
        }
        return objH;
    }
}
