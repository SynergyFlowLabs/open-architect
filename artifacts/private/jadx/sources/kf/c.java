package kf;

import com.planner5d.library.math.k;
import com.planner5d.library.walls.Wall;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Wall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f312191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f312192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final e f312193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f312194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Float f312195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final k f312196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private d f312197g;

    public c(@NotNull k start, @NotNull k end, @Nullable e eVar, int i10, @Nullable Float f10) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        this.f312191a = start;
        this.f312192b = end;
        this.f312193c = eVar;
        this.f312194d = i10;
        this.f312195e = f10;
        this.f312196f = new k(end).c0(start).M();
    }

    @Nullable
    public final e a() {
        return this.f312193c;
    }

    @NotNull
    public final k b() {
        return this.f312196f;
    }

    @NotNull
    public final k c() {
        return this.f312192b;
    }

    public final int d() {
        return this.f312194d;
    }

    @NotNull
    public final k e() {
        return this.f312191a;
    }

    @Nullable
    public final Float f() {
        return this.f312195e;
    }

    public final boolean g(@NotNull k point) {
        Intrinsics.checkNotNullParameter(point, "point");
        return Intrinsics.areEqual(point, this.f312191a) || Intrinsics.areEqual(point, this.f312192b);
    }

    @Override // com.planner5d.library.walls.Wall
    public float getHeight() {
        return 270.0f;
    }

    @Override // com.planner5d.library.walls.Wall
    public int getMinimumWidth() {
        return 5;
    }

    @Override // com.planner5d.library.walls.Wall
    @NotNull
    public k getOrigin(@NotNull k origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        return origin.U(0.0f, 0.0f);
    }

    @Override // com.planner5d.library.walls.Wall
    @NotNull
    public k getPoint(@NotNull k vector, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(vector, "vector");
        return vector.V(z11 ? this.f312191a : this.f312192b);
    }

    @Override // com.planner5d.library.walls.Wall
    public float getWidth() {
        Float f10 = this.f312195e;
        if (f10 != null) {
            return f10.floatValue();
        }
        return 10.0f;
    }

    public final void h(@Nullable d dVar) {
        this.f312197g = dVar;
    }

    @Override // com.planner5d.library.walls.Wall
    public boolean isHidden() {
        return false;
    }

    @Override // com.planner5d.library.walls.Wall
    public boolean isZero() {
        return Intrinsics.areEqual(this.f312191a, this.f312192b);
    }
}
