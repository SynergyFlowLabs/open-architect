package com.planner5d.library.database.model.spaces;

import androidx.room.t;
import androidx.room.w1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @t
    @NotNull
    private final a f154217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @w1(entityColumn = "space_id", parentColumn = "id")
    @NotNull
    private final b f154218b;

    public c(@NotNull a space, @NotNull b attributes) {
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f154217a = space;
        this.f154218b = attributes;
    }

    public static /* synthetic */ c d(c cVar, a aVar, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = cVar.f154217a;
        }
        if ((i10 & 2) != 0) {
            bVar = cVar.f154218b;
        }
        return cVar.c(aVar, bVar);
    }

    @NotNull
    public final a a() {
        return this.f154217a;
    }

    @NotNull
    public final b b() {
        return this.f154218b;
    }

    @NotNull
    public final c c(@NotNull a space, @NotNull b attributes) {
        Intrinsics.checkNotNullParameter(space, "space");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return new c(space, attributes);
    }

    @NotNull
    public final b e() {
        return this.f154218b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f154217a, cVar.f154217a) && Intrinsics.areEqual(this.f154218b, cVar.f154218b);
    }

    @NotNull
    public final a f() {
        return this.f154217a;
    }

    public int hashCode() {
        return (this.f154217a.hashCode() * 31) + this.f154218b.hashCode();
    }

    @NotNull
    public String toString() {
        return "SpaceWithAttributes(space=" + this.f154217a + ", attributes=" + this.f154218b + ")";
    }
}
