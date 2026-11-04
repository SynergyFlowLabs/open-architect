package tb;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class m {
    private final com.planner5d.library.math.d a(float f10, float f11, float f12, float f13, pb.c cVar) {
        return new com.planner5d.library.math.d(new com.planner5d.library.math.k(f10, f11).P(cVar.a()).b(cVar.getPosition()), new com.planner5d.library.math.k(f12, f13).P(cVar.a()));
    }

    @NotNull
    public final List<com.planner5d.library.math.d> b(@NotNull pb.c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        float f10 = 2;
        int i10 = 2 | 0;
        return CollectionsKt.listOf((Object[]) new com.planner5d.library.math.d[]{a(rect.getSize().f180480a / f10, 0.0f, 1.0f, 0.0f, rect), a(0.0f, rect.getSize().f180481b / f10, 0.0f, 1.0f, rect), a((-rect.getSize().f180480a) / f10, 0.0f, -1.0f, 0.0f, rect), a(0.0f, (-rect.getSize().f180481b) / f10, 0.0f, -1.0f, rect)});
    }
}
