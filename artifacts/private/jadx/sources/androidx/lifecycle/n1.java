package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSavedStateHandleController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleController.kt\nandroidx/lifecycle/SavedStateHandleController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class n1 implements j0, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f52448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l1 f52449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f52450c;

    public n1(@NotNull String key, @NotNull l1 handle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(handle, "handle");
        this.f52448a = key;
        this.f52449b = handle;
    }

    public final void a(@NotNull androidx.savedstate.j registry, @NotNull c0 lifecycle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.f52450c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f52450c = true;
        lifecycle.c(this);
        registry.d(this.f52448a, this.f52449b.m());
    }

    @NotNull
    public final l1 b() {
        return this.f52449b;
    }

    public final boolean c() {
        return this.f52450c;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.lifecycle.j0
    public void e(@NotNull o0 source, @NotNull c0.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == c0.a.ON_DESTROY) {
            this.f52450c = false;
            source.getLifecycle().g(this);
        }
    }
}
