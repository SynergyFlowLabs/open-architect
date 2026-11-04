package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channel.kt\nkotlinx/coroutines/reactive/SubscriptionChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
final class q<T> extends kotlinx.coroutines.channels.n<T> implements v<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315302n = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_subscription$volatile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315303o = AtomicIntegerFieldUpdater.newUpdater(q.class, "_requested$volatile");
    private volatile /* synthetic */ int _requested$volatile;
    private volatile /* synthetic */ Object _subscription$volatile;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f315304m;

    public q(int i10) {
        super(Integer.MAX_VALUE, null, 2, null);
        this.f315304m = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Invalid request size: " + i10).toString());
    }

    private final /* synthetic */ int F2() {
        return this._requested$volatile;
    }

    private final /* synthetic */ Object H2() {
        return this._subscription$volatile;
    }

    private final /* synthetic */ void J2(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final /* synthetic */ void K2(int i10) {
        this._requested$volatile = i10;
    }

    private final /* synthetic */ void L2(Object obj) {
        this._subscription$volatile = obj;
    }

    @Override // kotlinx.coroutines.channels.n
    protected void C1() {
        f315303o.incrementAndGet(this);
    }

    @Override // kotlinx.coroutines.channels.n
    protected void D1() {
        w wVar;
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315303o;
        while (true) {
            int i11 = atomicIntegerFieldUpdater.get(this);
            wVar = (w) f315302n.get(this);
            i10 = i11 - 1;
            if (wVar == null || i10 >= 0) {
                if (f315303o.compareAndSet(this, i11, i10)) {
                    return;
                }
            } else if (i11 == this.f315304m || f315303o.compareAndSet(this, i11, this.f315304m)) {
                break;
            }
        }
        wVar.request(this.f315304m - i10);
    }

    @Override // org.reactivestreams.v
    public void l(@NotNull w wVar) {
        f315302n.set(this, wVar);
        while (!B()) {
            int i10 = f315303o.get(this);
            if (i10 >= this.f315304m) {
                return;
            }
            if (f315303o.compareAndSet(this, i10, this.f315304m)) {
                wVar.request(this.f315304m - i10);
                return;
            }
        }
        wVar.cancel();
    }

    @Override // org.reactivestreams.v
    public void onComplete() {
        F(null);
    }

    @Override // org.reactivestreams.v
    public void onError(@NotNull Throwable th2) {
        F(th2);
    }

    @Override // org.reactivestreams.v
    public void onNext(T t10) {
        f315303o.decrementAndGet(this);
        p(t10);
    }

    @Override // kotlinx.coroutines.channels.n
    protected void v1() {
        w wVar = (w) f315302n.getAndSet(this, null);
        if (wVar != null) {
            wVar.cancel();
        }
    }
}
