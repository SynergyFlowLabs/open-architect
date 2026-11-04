package com.planner5d.library.mesh;

import com.planner5d.library.math.n;
import com.planner5d.library.walls.WallsBuilder3DMesh;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements WallsBuilder3DMesh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f180527a;

    public m(@NotNull e mesh) {
        Intrinsics.checkNotNullParameter(mesh, "mesh");
        this.f180527a = mesh;
    }

    @Override // com.planner5d.library.walls.WallsBuilder3DMesh
    public void buildClose(@NotNull n v10, @NotNull n v11, @NotNull n v12) {
        Intrinsics.checkNotNullParameter(v10, "v0");
        Intrinsics.checkNotNullParameter(v11, "v1");
        Intrinsics.checkNotNullParameter(v12, "v2");
        this.f180527a.a(v10, v11, v12);
    }

    @Override // com.planner5d.library.walls.WallsBuilder3DMesh
    public void buildSide(@NotNull n v10, @NotNull n v11, @NotNull n v12, boolean z10) {
        Intrinsics.checkNotNullParameter(v10, "v0");
        Intrinsics.checkNotNullParameter(v11, "v1");
        Intrinsics.checkNotNullParameter(v12, "v2");
        this.f180527a.a(v10, v11, v12);
    }
}
