package com.planner5d.library.unity;

import com.planner5d.library.math.m;
import com.planner5d.library.walls.WallsInfoWall;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class d {
    @NotNull
    public final qb.b a(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, @Nullable qb.g gVar) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        return new sb.b(puid, position, rotation, scale, size, gVar);
    }

    @NotNull
    public final qb.d b(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        return new sb.c(puid, position, rotation, scale, size);
    }

    @NotNull
    public final qb.e c(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        return new sb.d(puid, position, rotation, scale, size);
    }

    @NotNull
    public final qb.f d(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, @NotNull List<? extends qb.g> items) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(items, "items");
        return new sb.e(puid, position, rotation, scale, size, items);
    }

    @NotNull
    public final qb.g e(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, boolean z10, float f10, @NotNull WallsInfoWall info) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(info, "info");
        return new sb.f(puid, position, rotation, scale, size, z10, f10, info);
    }

    @NotNull
    public final qb.h f(@NotNull String puid, @NotNull m position, @NotNull m rotation, @NotNull m scale, @NotNull m size, @Nullable qb.g gVar) {
        Intrinsics.checkNotNullParameter(puid, "puid");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(rotation, "rotation");
        Intrinsics.checkNotNullParameter(scale, "scale");
        Intrinsics.checkNotNullParameter(size, "size");
        return new sb.g(puid, position, rotation, scale, size, gVar);
    }
}
