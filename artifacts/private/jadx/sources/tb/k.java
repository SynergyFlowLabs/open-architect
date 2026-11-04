package tb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f376256a = new k();

    private k() {
    }

    @NotNull
    public final e a(@NotNull qb.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        a aVarA = b.f376241a.a(item);
        float f10 = aVarA.f().f180480a;
        float f11 = aVarA.f().f180481b;
        if (item instanceof qb.d) {
            com.planner5d.library.math.m mVarZ0 = item.Z0();
            Math.abs(mVarZ0.f180482a);
            Math.abs(mVarZ0.f180483b);
        }
        double d10 = ((double) (item.g().f180483b / 180)) * 3.141592653589793d;
        com.planner5d.library.math.m position = item.getPosition();
        return new e(new com.planner5d.library.math.k(position.f180482a, position.f180483b), new com.planner5d.library.math.k(aVarA.f()), (float) d10, item);
    }
}
