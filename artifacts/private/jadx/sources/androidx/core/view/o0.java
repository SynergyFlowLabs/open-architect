package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f48892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<r0> f48893b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<r0, a> f48894c = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.c0 f48895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.j0 f48896b;

        a(@NonNull androidx.lifecycle.c0 c0Var, @NonNull androidx.lifecycle.j0 j0Var) {
            this.f48895a = c0Var;
            this.f48896b = j0Var;
            c0Var.c(j0Var);
        }

        void a() {
            this.f48895a.g(this.f48896b);
            this.f48896b = null;
        }
    }

    public o0(@NonNull Runnable runnable) {
        this.f48892a = runnable;
    }

    public static /* synthetic */ void a(o0 o0Var, androidx.lifecycle.c0.b bVar, r0 r0Var, androidx.lifecycle.o0 o0Var2, androidx.lifecycle.c0.a aVar) {
        o0Var.getClass();
        if (aVar == androidx.lifecycle.c0.a.r(bVar)) {
            o0Var.c(r0Var);
            return;
        }
        if (aVar == androidx.lifecycle.c0.a.ON_DESTROY) {
            o0Var.j(r0Var);
        } else if (aVar == androidx.lifecycle.c0.a.l(bVar)) {
            o0Var.f48893b.remove(r0Var);
            o0Var.f48892a.run();
        }
    }

    public static /* synthetic */ void b(o0 o0Var, r0 r0Var, androidx.lifecycle.o0 o0Var2, androidx.lifecycle.c0.a aVar) {
        o0Var.getClass();
        if (aVar == androidx.lifecycle.c0.a.ON_DESTROY) {
            o0Var.j(r0Var);
        }
    }

    public void c(@NonNull r0 r0Var) {
        this.f48893b.add(r0Var);
        this.f48892a.run();
    }

    public void d(@NonNull final r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var) {
        c(r0Var);
        androidx.lifecycle.c0 lifecycle = o0Var.getLifecycle();
        a aVarRemove = this.f48894c.remove(r0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f48894c.put(r0Var, new a(lifecycle, new androidx.lifecycle.j0() { // from class: androidx.core.view.n0
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var2, androidx.lifecycle.c0.a aVar) {
                o0.b(this.f48890a, r0Var, o0Var2, aVar);
            }
        }));
    }

    @e.a({"LambdaLast"})
    public void e(@NonNull final r0 r0Var, @NonNull androidx.lifecycle.o0 o0Var, @NonNull final androidx.lifecycle.c0.b bVar) {
        androidx.lifecycle.c0 lifecycle = o0Var.getLifecycle();
        a aVarRemove = this.f48894c.remove(r0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f48894c.put(r0Var, new a(lifecycle, new androidx.lifecycle.j0() { // from class: androidx.core.view.m0
            @Override // androidx.lifecycle.j0
            public final void e(androidx.lifecycle.o0 o0Var2, androidx.lifecycle.c0.a aVar) {
                o0.a(this.f48887a, bVar, r0Var, o0Var2, aVar);
            }
        }));
    }

    public void f(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<r0> it = this.f48893b.iterator();
        while (it.hasNext()) {
            it.next().a(menu, menuInflater);
        }
    }

    public void g(@NonNull Menu menu) {
        Iterator<r0> it = this.f48893b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean h(@NonNull MenuItem menuItem) {
        Iterator<r0> it = this.f48893b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void i(@NonNull Menu menu) {
        Iterator<r0> it = this.f48893b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
    }

    public void j(@NonNull r0 r0Var) {
        this.f48893b.remove(r0Var);
        a aVarRemove = this.f48894c.remove(r0Var);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f48892a.run();
    }
}
