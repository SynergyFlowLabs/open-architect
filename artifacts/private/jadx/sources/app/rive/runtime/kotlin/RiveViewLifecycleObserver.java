package app.rive.runtime.kotlin;

import androidx.annotation.i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.o0;
import app.rive.runtime.kotlin.core.RefCount;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRiveAnimationView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveViewLifecycleObserver\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1175:1\n1863#2,2:1176\n*S KotlinDebug\n*F\n+ 1 RiveAnimationView.kt\napp/rive/runtime/kotlin/RiveViewLifecycleObserver\n*L\n1094#1:1176,2\n*E\n"})
public class RiveViewLifecycleObserver implements DefaultLifecycleObserver {

    @NotNull
    private final List<RefCount> dependencies;

    public RiveViewLifecycleObserver(@NotNull List<RefCount> dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.dependencies = dependencies;
    }

    @NotNull
    protected final List<RefCount> getDependencies() {
        return this.dependencies;
    }

    public final void insert(@NotNull RefCount dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        this.dependencies.add(dependency);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    @i
    public void onDestroy(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Iterator<T> it = this.dependencies.iterator();
        while (it.hasNext()) {
            ((RefCount) it.next()).release();
        }
        owner.getLifecycle().g(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull o0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    public final boolean remove(@NotNull RefCount dependency) {
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return this.dependencies.remove(dependency);
    }
}
