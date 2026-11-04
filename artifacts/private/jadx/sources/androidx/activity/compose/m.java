package androidx.activity.compose;

import androidx.activity.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class m extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private s0 f9843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private Function2<? super kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f9844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private l f9845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f9846d;

    public m(boolean z10, @NotNull s0 s0Var, @NotNull Function2<? super kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        super(z10);
        this.f9843a = s0Var;
        this.f9844b = function2;
    }

    @NotNull
    public final Function2<kotlinx.coroutines.flow.i<androidx.activity.d>, kotlin.coroutines.d<? super Unit>, Object> d() {
        return this.f9844b;
    }

    @NotNull
    public final s0 e() {
        return this.f9843a;
    }

    public final void f(@NotNull Function2<? super kotlinx.coroutines.flow.i<androidx.activity.d>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f9844b = function2;
    }

    public final void g(boolean z10) {
        l lVar;
        if (!z10 && !this.f9846d && isEnabled() && (lVar = this.f9845c) != null) {
            lVar.a();
        }
        setEnabled(z10);
    }

    public final void h(@NotNull s0 s0Var) {
        this.f9843a = s0Var;
    }

    @Override // androidx.activity.i0
    public void handleOnBackCancelled() {
        super.handleOnBackCancelled();
        l lVar = this.f9845c;
        if (lVar != null) {
            lVar.a();
        }
        l lVar2 = this.f9845c;
        if (lVar2 != null) {
            lVar2.g(false);
        }
        this.f9846d = false;
    }

    @Override // androidx.activity.i0
    public void handleOnBackPressed() {
        l lVar = this.f9845c;
        if (lVar != null && !lVar.e()) {
            lVar.a();
            this.f9845c = null;
        }
        if (this.f9845c == null) {
            this.f9845c = new l(this.f9843a, false, this.f9844b, this);
        }
        l lVar2 = this.f9845c;
        if (lVar2 != null) {
            lVar2.b();
        }
        l lVar3 = this.f9845c;
        if (lVar3 != null) {
            lVar3.g(false);
        }
        this.f9846d = false;
    }

    @Override // androidx.activity.i0
    public void handleOnBackProgressed(@NotNull androidx.activity.d dVar) {
        super.handleOnBackProgressed(dVar);
        l lVar = this.f9845c;
        if (lVar != null) {
            t.b(lVar.f(dVar));
        }
    }

    @Override // androidx.activity.i0
    public void handleOnBackStarted(@NotNull androidx.activity.d dVar) {
        super.handleOnBackStarted(dVar);
        l lVar = this.f9845c;
        if (lVar != null) {
            lVar.a();
        }
        if (isEnabled()) {
            this.f9845c = new l(this.f9843a, true, this.f9844b, this);
        }
        this.f9846d = true;
    }
}
