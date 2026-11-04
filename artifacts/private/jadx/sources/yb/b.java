package yb;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements com.planner5d.library.engine.i {
    @Override // com.planner5d.library.engine.i
    @NotNull
    public vb.c a(@NotNull vb.a application, @NotNull vb.b config, @NotNull vb.g factory) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new com.planner5d.library.engine.libgdx.compatibility.b(application, config, factory);
    }

    @Override // com.planner5d.library.engine.i
    @NotNull
    public com.planner5d.library.engine.j b() {
        return new c();
    }

    @Override // com.planner5d.library.engine.i
    @NotNull
    public vb.a c(@NotNull Context context, @NotNull com.planner5d.library.engine.b listener, @NotNull vb.b config, @NotNull vb.e factory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new com.planner5d.library.engine.libgdx.compatibility.a(context, listener, config, factory);
    }
}
