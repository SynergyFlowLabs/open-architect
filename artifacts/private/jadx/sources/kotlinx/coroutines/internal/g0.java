package kotlinx.coroutines.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class g0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315050a = AtomicReferenceFieldUpdater.newUpdater(g0.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public g0(boolean z10) {
        this._cur$volatile = new h0(8, z10);
    }

    private final /* synthetic */ Object d() {
        return this._cur$volatile;
    }

    private final /* synthetic */ void h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void k(Object obj) {
        this._cur$volatile = obj;
    }

    public final boolean a(@NotNull E e10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315050a;
        while (true) {
            h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            int iA = h0Var.a(e10);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                androidx.concurrent.futures.b.a(f315050a, this, h0Var, h0Var.r());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315050a;
        while (true) {
            h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            if (h0Var.d()) {
                return;
            } else {
                androidx.concurrent.futures.b.a(f315050a, this, h0Var, h0Var.r());
            }
        }
    }

    public final int c() {
        return ((h0) f315050a.get(this)).g();
    }

    public final boolean f() {
        return ((h0) f315050a.get(this)).l();
    }

    public final boolean g() {
        return ((h0) f315050a.get(this)).m();
    }

    @NotNull
    public final <R> List<R> i(@NotNull Function1<? super E, ? extends R> function1) {
        return ((h0) f315050a.get(this)).p(function1);
    }

    @Nullable
    public final E j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315050a;
        while (true) {
            h0 h0Var = (h0) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) h0Var.s();
            if (e10 != h0.f315067t) {
                return e10;
            }
            androidx.concurrent.futures.b.a(f315050a, this, h0Var, h0Var.r());
        }
    }
}
