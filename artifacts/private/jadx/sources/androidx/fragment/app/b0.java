package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final FragmentManager f51780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<a> f51781b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final FragmentManager.n f51782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f51783b;

        public a(@NotNull FragmentManager.n callback, boolean z10) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f51782a = callback;
            this.f51783b = z10;
        }

        @NotNull
        public final FragmentManager.n a() {
            return this.f51782a;
        }

        public final boolean b() {
            return this.f51783b;
        }
    }

    public b0(@NotNull FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f51780a = fragmentManager;
        this.f51781b = new CopyOnWriteArrayList<>();
    }

    public final void a(@NotNull Fragment f10, @Nullable Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().a(f10, bundle, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().a(this.f51780a, f10, bundle);
            }
        }
    }

    public final void b(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Context contextF = this.f51780a.O0().f();
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().b(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().b(this.f51780a, f10, contextF);
            }
        }
    }

    public final void c(@NotNull Fragment f10, @Nullable Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().c(f10, bundle, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().c(this.f51780a, f10, bundle);
            }
        }
    }

    public final void d(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().d(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().d(this.f51780a, f10);
            }
        }
    }

    public final void e(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().e(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().e(this.f51780a, f10);
            }
        }
    }

    public final void f(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().f(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().f(this.f51780a, f10);
            }
        }
    }

    public final void g(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Context contextF = this.f51780a.O0().f();
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().g(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().g(this.f51780a, f10, contextF);
            }
        }
    }

    public final void h(@NotNull Fragment f10, @Nullable Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().h(f10, bundle, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().h(this.f51780a, f10, bundle);
            }
        }
    }

    public final void i(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().i(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().i(this.f51780a, f10);
            }
        }
    }

    public final void j(@NotNull Fragment f10, @NotNull Bundle outState, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            int i10 = 7 ^ 1;
            parentFragmentManager.Q0().j(f10, outState, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().j(this.f51780a, f10, outState);
            }
        }
    }

    public final void k(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().k(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().k(this.f51780a, f10);
            }
        }
    }

    public final void l(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().l(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().l(this.f51780a, f10);
            }
        }
    }

    public final void m(@NotNull Fragment f10, @NotNull View v10, @Nullable Bundle bundle, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Intrinsics.checkNotNullParameter(v10, "v");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().m(f10, v10, bundle, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().m(this.f51780a, f10, v10, bundle);
            }
        }
    }

    public final void n(@NotNull Fragment f10, boolean z10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Fragment fragmentR0 = this.f51780a.R0();
        if (fragmentR0 != null) {
            FragmentManager parentFragmentManager = fragmentR0.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.Q0().n(f10, true);
        }
        for (a aVar : this.f51781b) {
            if (!z10 || aVar.b()) {
                aVar.a().n(this.f51780a, f10);
            }
        }
    }

    public final void o(@NotNull FragmentManager.n cb2, boolean z10) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.f51781b.add(new a(cb2, z10));
    }

    public final void p(@NotNull FragmentManager.n cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        synchronized (this.f51781b) {
            try {
                int size = this.f51781b.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f51781b.get(i10).a() == cb2) {
                        this.f51781b.remove(i10);
                        break;
                    }
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
