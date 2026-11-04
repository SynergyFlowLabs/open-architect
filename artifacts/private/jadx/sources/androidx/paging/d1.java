package androidx.paging;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMutableCombinedLoadStateCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1#2:171\n230#3,5:172\n1855#4,2:177\n*S KotlinDebug\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n*L\n98#1:172,5\n108#1:177,2\n*E\n"})
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<Function1<n, Unit>> f71747a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<n> f71748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.z0<n> f71749c;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<n, n> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z0 f71751b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z0 f71752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z0 z0Var, z0 z0Var2) {
            super(1);
            this.f71751b = z0Var;
            this.f71752c = z0Var2;
            boolean z10 = !true;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n invoke(@Nullable n nVar) {
            return d1.this.d(nVar, this.f71751b, this.f71752c);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<n, n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f71753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f71754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x0 f71755c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d1 f71756d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z10, a1 a1Var, x0 x0Var, d1 d1Var) {
            super(1);
            this.f71753a = z10;
            this.f71754b = a1Var;
            this.f71755c = x0Var;
            this.f71756d = d1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final n invoke(@Nullable n nVar) {
            z0 z0VarA;
            if (nVar == null || (z0VarA = nVar.f()) == null) {
                z0VarA = z0.f72792f.a();
            }
            z0 z0VarC = nVar != null ? nVar.c() : null;
            if (this.f71753a) {
                z0VarC = z0.f72792f.a().n(this.f71754b, this.f71755c);
            } else {
                z0VarA = z0VarA.n(this.f71754b, this.f71755c);
            }
            return this.f71756d.d(nVar, z0VarA, z0VarC);
        }
    }

    public d1() {
        kotlinx.coroutines.flow.k0<n> k0VarA = kotlinx.coroutines.flow.b1.a(null);
        this.f71748b = k0VarA;
        this.f71749c = kotlinx.coroutines.flow.k.n(k0VarA);
    }

    private final x0 c(x0 x0Var, x0 x0Var2, x0 x0Var3, x0 x0Var4) {
        if (x0Var4 == null) {
            return x0Var3;
        }
        if (x0Var instanceof x0.b) {
            return (((x0Var2 instanceof x0.c) && (x0Var4 instanceof x0.c)) || (x0Var4 instanceof x0.a)) ? x0Var4 : x0Var;
        }
        return x0Var4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n d(n nVar, z0 z0Var, z0 z0Var2) {
        x0 x0VarB;
        x0 x0VarB2;
        x0 x0VarB3;
        if (nVar == null || (x0VarB = nVar.e()) == null) {
            x0VarB = x0.c.f72693b.b();
        }
        x0 x0VarC = c(x0VarB, z0Var.k(), z0Var.k(), z0Var2 != null ? z0Var2.k() : null);
        if (nVar == null || (x0VarB2 = nVar.d()) == null) {
            x0VarB2 = x0.c.f72693b.b();
        }
        x0 x0VarC2 = c(x0VarB2, z0Var.k(), z0Var.j(), z0Var2 != null ? z0Var2.j() : null);
        if (nVar == null || (x0VarB3 = nVar.b()) == null) {
            x0VarB3 = x0.c.f72693b.b();
        }
        return new n(x0VarC, x0VarC2, c(x0VarB3, z0Var.k(), z0Var.i(), z0Var2 != null ? z0Var2.i() : null), z0Var, z0Var2);
    }

    private final void e(Function1<? super n, n> function1) {
        n value;
        n nVarInvoke;
        kotlinx.coroutines.flow.k0<n> k0Var = this.f71748b;
        do {
            value = k0Var.getValue();
            n nVar = value;
            nVarInvoke = function1.invoke(nVar);
            if (Intrinsics.areEqual(nVar, nVarInvoke)) {
                return;
            }
        } while (!k0Var.compareAndSet(value, nVarInvoke));
        if (nVarInvoke != null) {
            Iterator<T> it = this.f71747a.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(nVarInvoke);
            }
        }
    }

    public final void b(@NotNull Function1<? super n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71747a.add(listener);
        n value = this.f71748b.getValue();
        if (value != null) {
            listener.invoke(value);
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0018  */
    @Nullable
    public final x0 f(@NotNull a1 type, boolean z10) {
        z0 z0VarF;
        Intrinsics.checkNotNullParameter(type, "type");
        n value = this.f71748b.getValue();
        if (z10) {
            if (value != null) {
                z0VarF = value.c();
            } else {
                z0VarF = null;
            }
        } else if (value != null) {
            z0VarF = value.f();
        } else {
            z0VarF = null;
        }
        if (z0VarF != null) {
            return z0VarF.h(type);
        }
        return null;
    }

    @NotNull
    public final kotlinx.coroutines.flow.z0<n> g() {
        return this.f71749c;
    }

    public final void h(@NotNull Function1<? super n, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f71747a.remove(listener);
    }

    public final void i(@NotNull z0 sourceLoadStates, @Nullable z0 z0Var) {
        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
        e(new a(sourceLoadStates, z0Var));
    }

    public final void j(@NotNull a1 type, boolean z10, @NotNull x0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        e(new b(z10, type, state, this));
    }
}
