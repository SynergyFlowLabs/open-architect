package tb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f376235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.math.k f376236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f376237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f376238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f376239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f376240f;

    public a(@NotNull com.planner5d.library.math.k center, @NotNull com.planner5d.library.math.k size) {
        Intrinsics.checkNotNullParameter(center, "center");
        Intrinsics.checkNotNullParameter(size, "size");
        this.f376235a = center;
        this.f376236b = size;
        float f10 = center.f180480a;
        float f11 = size.f180480a;
        this.f376237c = f10 - (f11 / 2.0f);
        this.f376238d = f10 + (f11 / 2.0f);
        float f12 = center.f180481b;
        float f13 = size.f180481b;
        this.f376239e = f12 - (f13 / 2.0f);
        this.f376240f = f12 + (f13 / 2.0f);
    }

    @NotNull
    public final com.planner5d.library.math.k a() {
        return this.f376235a;
    }

    public final float b() {
        return this.f376238d;
    }

    public final float c() {
        return this.f376240f;
    }

    public final float d() {
        return this.f376237c;
    }

    public final float e() {
        return this.f376239e;
    }

    @NotNull
    public final com.planner5d.library.math.k f() {
        return this.f376236b;
    }
}
