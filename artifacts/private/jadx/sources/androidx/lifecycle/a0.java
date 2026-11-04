package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f52155a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f52156b = "androidx.lifecycle.savedstate.vm.tag";

    public static final class a implements androidx.savedstate.j.a {
        @Override // androidx.savedstate.j.a
        public void a(@NotNull androidx.savedstate.m owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof m2)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + owner).toString());
            }
            l2 viewModelStore = ((m2) owner).getViewModelStore();
            androidx.savedstate.j savedStateRegistry = owner.getSavedStateRegistry();
            Iterator<String> it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                f2 f2VarB = viewModelStore.b(it.next());
                if (f2VarB != null) {
                    a0.a(f2VarB, savedStateRegistry, owner.getLifecycle());
                }
            }
            if (!viewModelStore.c().isEmpty()) {
                savedStateRegistry.e(a.class);
            }
        }
    }

    public static final class b implements j0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f52157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.savedstate.j f52158b;

        b(c0 c0Var, androidx.savedstate.j jVar) {
            this.f52157a = c0Var;
            this.f52158b = jVar;
        }

        @Override // androidx.lifecycle.j0
        public void e(o0 source, c0.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == c0.a.ON_START) {
                this.f52157a.g(this);
                this.f52158b.e(a.class);
            }
        }
    }

    private a0() {
    }

    @oj.n
    public static final void a(@NotNull f2 viewModel, @NotNull androidx.savedstate.j registry, @NotNull c0 lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        n1 n1Var = (n1) viewModel.getCloseable(f52156b);
        if (n1Var == null || n1Var.c()) {
            return;
        }
        n1Var.a(registry, lifecycle);
        f52155a.c(registry, lifecycle);
    }

    @oj.n
    @NotNull
    public static final n1 b(@NotNull androidx.savedstate.j registry, @NotNull c0 lifecycle, @Nullable String str, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(str);
        n1 n1Var = new n1(str, l1.f52428c.a(registry.a(str), bundle));
        n1Var.a(registry, lifecycle);
        f52155a.c(registry, lifecycle);
        return n1Var;
    }

    private final void c(androidx.savedstate.j jVar, c0 c0Var) {
        c0.b bVarD = c0Var.d();
        if (bVarD != c0.b.INITIALIZED && !bVarD.n(c0.b.STARTED)) {
            c0Var.c(new b(c0Var, jVar));
            return;
        }
        jVar.e(a.class);
    }
}
