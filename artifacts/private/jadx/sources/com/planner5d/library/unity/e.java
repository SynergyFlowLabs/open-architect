package com.planner5d.library.unity;

import com.planner5d.library.math.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements com.planner5d.library.mesh.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<n> f230647a = new ArrayList();

    @Override // com.planner5d.library.mesh.e
    public void a(@NotNull n v10, @NotNull n v11, @NotNull n v12) {
        Intrinsics.checkNotNullParameter(v10, "v0");
        Intrinsics.checkNotNullParameter(v11, "v1");
        Intrinsics.checkNotNullParameter(v12, "v2");
        this.f230647a.add(v10);
        this.f230647a.add(v11);
        this.f230647a.add(v12);
    }

    @NotNull
    public final e b(@NotNull n vertex) {
        Intrinsics.checkNotNullParameter(vertex, "vertex");
        this.f230647a.add(new n(vertex.f180485a, vertex.f180486b, vertex.f180487c));
        return this;
    }

    @NotNull
    public final List<n> c() {
        return this.f230647a;
    }
}
