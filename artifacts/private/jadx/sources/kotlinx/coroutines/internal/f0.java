package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@k2
@SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315047a = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315048b = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315049c = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    private final /* synthetic */ void A(Object obj) {
        this._removedRef$volatile = obj;
    }

    private final f0 g() {
        f0 f0Var;
        Object obj;
        while (true) {
            f0 f0Var2 = (f0) f315048b.get(this);
            f0Var = f0Var2;
            while (true) {
                f0 f0Var3 = null;
                while (true) {
                    obj = f315047a.get(f0Var);
                    if (obj == this) {
                        if (f0Var2 != f0Var && !androidx.concurrent.futures.b.a(f315048b, this, f0Var2, f0Var)) {
                            break;
                        }
                        break;
                    }
                    if (t()) {
                        return null;
                    }
                    if (!(obj instanceof t0)) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        f0Var3 = f0Var;
                        f0Var = (f0) obj;
                    } else {
                        if (f0Var3 != null) {
                            break;
                        }
                        f0Var = (f0) f315048b.get(f0Var);
                    }
                }
                if (!androidx.concurrent.futures.b.a(f315047a, f0Var3, f0Var, ((t0) obj).f315124a)) {
                    break;
                }
                f0Var = f0Var3;
            }
        }
        return f0Var;
    }

    private final f0 h(f0 f0Var) {
        while (f0Var.t()) {
            f0Var = (f0) f315048b.get(f0Var);
        }
        return f0Var;
    }

    private final void i(f0 f0Var) {
        f0 f0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315048b;
        do {
            f0Var2 = (f0) atomicReferenceFieldUpdater.get(f0Var);
            if (j() != f0Var) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f315048b, f0Var, f0Var2, this));
        if (t()) {
            f0Var.g();
        }
    }

    private final /* synthetic */ Object m() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object o() {
        return this._prev$volatile;
    }

    private final /* synthetic */ Object q() {
        return this._removedRef$volatile;
    }

    private final /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final t0 x() {
        t0 t0Var = (t0) f315049c.get(this);
        if (t0Var != null) {
            return t0Var;
        }
        t0 t0Var2 = new t0(this);
        f315049c.set(this, t0Var2);
        return t0Var2;
    }

    private final /* synthetic */ void y(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void z(Object obj) {
        this._prev$volatile = obj;
    }

    public final void B(@NotNull f0 f0Var, @NotNull f0 f0Var2) {
    }

    public final boolean b(@NotNull f0 f0Var, int i10) {
        f0 f0VarL;
        do {
            f0VarL = l();
            if (f0VarL instanceof b0) {
                return (((b0) f0VarL).f315038d & i10) == 0 && f0VarL.b(f0Var, i10);
            }
        } while (!f0VarL.d(f0Var, this));
        return true;
    }

    @kotlin.a1
    public final boolean d(@NotNull f0 f0Var, @NotNull f0 f0Var2) {
        f315048b.set(f0Var, this);
        f315047a.set(f0Var, f0Var2);
        if (!androidx.concurrent.futures.b.a(f315047a, this, f0Var2, f0Var)) {
            return false;
        }
        f0Var.i(f0Var2);
        return true;
    }

    public final boolean e(@NotNull f0 f0Var) {
        f315048b.set(f0Var, this);
        f315047a.set(f0Var, this);
        while (j() == this) {
            if (androidx.concurrent.futures.b.a(f315047a, this, this, f0Var)) {
                f0Var.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        b(new b0(i10), i10);
    }

    @NotNull
    public final Object j() {
        return f315047a.get(this);
    }

    @NotNull
    public final f0 k() {
        f0 f0Var;
        Object objJ = j();
        t0 t0Var = objJ instanceof t0 ? (t0) objJ : null;
        if (t0Var != null && (f0Var = t0Var.f315124a) != null) {
            return f0Var;
        }
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (f0) objJ;
    }

    @NotNull
    public final f0 l() {
        f0 f0VarG = g();
        return f0VarG == null ? h((f0) f315048b.get(this)) : f0VarG;
    }

    public boolean t() {
        return j() instanceof t0;
    }

    @NotNull
    public String toString() {
        return new kotlin.jvm.internal.c1(this) { // from class: kotlinx.coroutines.internal.f0.a
            @Override // kotlin.jvm.internal.c1, kotlin.reflect.p
            public Object get() {
                return kotlinx.coroutines.x0.a(this.receiver);
            }
        } + '@' + kotlinx.coroutines.x0.b(this);
    }

    public boolean v() {
        return w() == null;
    }

    @kotlin.a1
    @Nullable
    public final f0 w() {
        Object objJ;
        f0 f0Var;
        do {
            objJ = j();
            if (objJ instanceof t0) {
                return ((t0) objJ).f315124a;
            }
            if (objJ == this) {
                return (f0) objJ;
            }
            Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            f0Var = (f0) objJ;
        } while (!androidx.concurrent.futures.b.a(f315047a, this, objJ, f0Var.x()));
        f0Var.g();
        return null;
    }
}
