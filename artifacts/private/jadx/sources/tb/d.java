package tb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f376242a = 1.1f;

    private final float c(com.planner5d.library.math.d dVar, float f10) {
        return (f10 - dVar.b().f180480a) / dVar.a().f180480a;
    }

    private final float d(com.planner5d.library.math.d dVar, float f10) {
        return (f10 - dVar.b().f180481b) / dVar.a().f180481b;
    }

    private final float e(float f10) {
        return (float) ((Math.abs(((double) f10) % 3.141592653589793d) / 3.141592653589793d) * ((double) 180));
    }

    private final ub.a f(com.planner5d.library.math.d dVar, float f10, float f11) {
        float f12 = 2;
        float fC = c(dVar, (-f10) / f12);
        float fC2 = c(dVar, f10 / f12);
        float fD = d(dVar, (-f11) / f12);
        float fD2 = d(dVar, f11 / f12);
        float fMax = Math.max(Math.min(fC, fC2), Math.min(fD, fD2));
        float fMin = Math.min(Math.max(fC, fC2), Math.max(fD, fD2));
        if (fMin < fMax || fMin < 0.0f || fMax < 0.0f) {
            return null;
        }
        return new ub.a(fMax, e((float) ((fMax == fC || fMax == fC2) ? Math.atan2(dVar.a().f180480a, dVar.a().f180481b) : Math.atan2(dVar.a().f180481b, dVar.a().f180480a))));
    }

    @Nullable
    public final ub.b a(@NotNull com.planner5d.library.math.d ray, @NotNull e rectangle) {
        Intrinsics.checkNotNullParameter(ray, "ray");
        Intrinsics.checkNotNullParameter(rectangle, "rectangle");
        ub.a aVarF = f(ray.c(new com.planner5d.library.math.k(rectangle.getPosition()).R(-1.0f), -rectangle.a()), rectangle.getSize().f180480a, rectangle.getSize().f180481b);
        if (aVarF == null) {
            return null;
        }
        return new ub.b(ray.b(), new com.planner5d.library.math.k(ray.b()).b(new com.planner5d.library.math.k(ray.a()).R(aVarF.f())), aVarF.f(), aVarF.e(), com.planner5d.library.math.j.f(aVarF.e(), 90.0f, this.f376242a), rectangle.c());
    }

    @Nullable
    public final ub.b b(@NotNull com.planner5d.library.math.d ray, @NotNull f segment) {
        Intrinsics.checkNotNullParameter(ray, "ray");
        Intrinsics.checkNotNullParameter(segment, "segment");
        com.planner5d.library.math.k kVarC0 = new com.planner5d.library.math.k(segment.a()).c0(segment.b());
        float f10 = (ray.a().f180480a * (-kVarC0.f180481b)) + (kVarC0.f180480a * ray.a().f180481b);
        if (f10 < 0.0f) {
            float f11 = (((segment.b().f180480a - ray.b().f180480a) * (-kVarC0.f180481b)) - ((-kVarC0.f180480a) * (segment.b().f180481b - ray.b().f180481b))) / f10;
            float f12 = ((ray.a().f180480a * (segment.b().f180481b - ray.b().f180481b)) - ((segment.b().f180480a - ray.b().f180480a) * ray.a().f180481b)) / f10;
            if (f11 >= 0.0f && f12 >= 0.0f && f12 <= 1.0f) {
                com.planner5d.library.math.k kVarB = new com.planner5d.library.math.k(ray.b()).b(new com.planner5d.library.math.k(ray.a()).R(f11));
                float fE = e((float) Math.acos(ray.a().k(kVarC0) / kVarC0.F()));
                return new ub.b(ray.b(), kVarB, f11, fE, com.planner5d.library.math.j.f(fE, 90.0f, this.f376242a), segment.c());
            }
        }
        return null;
    }
}
