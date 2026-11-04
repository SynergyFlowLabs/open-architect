package coil.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.c0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final h f87649b = new h();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final a f87650c = new a();

    public static final class a implements o0 {
        a() {
        }

        @Override // androidx.lifecycle.o0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h getLifecycle() {
            return h.f87649b;
        }
    }

    private h() {
    }

    @Override // androidx.lifecycle.c0
    public void c(@NotNull n0 n0Var) {
        if (!(n0Var instanceof DefaultLifecycleObserver)) {
            throw new IllegalArgumentException((n0Var + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) n0Var;
        a aVar = f87650c;
        defaultLifecycleObserver.onCreate(aVar);
        defaultLifecycleObserver.onStart(aVar);
        defaultLifecycleObserver.onResume(aVar);
    }

    @Override // androidx.lifecycle.c0
    @NotNull
    public c0.b d() {
        return c0.b.RESUMED;
    }

    @Override // androidx.lifecycle.c0
    public void g(@NotNull n0 n0Var) {
    }

    @NotNull
    public String toString() {
        return "coil.request.GlobalLifecycle";
    }
}
