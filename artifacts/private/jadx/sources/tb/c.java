package tb;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    @NotNull
    public final List<com.planner5d.library.math.d> a(@NotNull pb.c rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        float f10 = 2;
        List<com.planner5d.library.math.k> listListOf = CollectionsKt.listOf((Object[]) new com.planner5d.library.math.k[]{new com.planner5d.library.math.k(rect.getSize().f180480a / f10, rect.getSize().f180481b / f10).P(rect.a()), new com.planner5d.library.math.k((-rect.getSize().f180480a) / f10, rect.getSize().f180481b / f10).P(rect.a()), new com.planner5d.library.math.k(rect.getSize().f180480a / f10, (-rect.getSize().f180481b) / f10).P(rect.a()), new com.planner5d.library.math.k((-rect.getSize().f180480a) / f10, (-rect.getSize().f180481b) / f10).P(rect.a())});
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k(Float.MIN_VALUE, 0.0f);
        for (com.planner5d.library.math.k kVar2 : listListOf) {
            if (kVar2.f180480a > kVar.f180480a) {
                kVar = kVar2;
            }
        }
        com.planner5d.library.math.k kVar3 = new com.planner5d.library.math.k(Float.MAX_VALUE, 0.0f);
        for (com.planner5d.library.math.k kVar4 : listListOf) {
            if (kVar4.f180480a < kVar3.f180480a) {
                kVar3 = kVar4;
            }
        }
        com.planner5d.library.math.k kVar5 = new com.planner5d.library.math.k(0.0f, Float.MIN_VALUE);
        for (com.planner5d.library.math.k kVar6 : listListOf) {
            if (kVar6.f180481b > kVar5.f180481b) {
                kVar5 = kVar6;
            }
        }
        com.planner5d.library.math.k kVar7 = new com.planner5d.library.math.k(0.0f, Float.MAX_VALUE);
        for (com.planner5d.library.math.k kVar8 : listListOf) {
            if (kVar8.f180481b < kVar7.f180481b) {
                kVar7 = kVar8;
            }
        }
        return CollectionsKt.listOf((Object[]) new com.planner5d.library.math.d[]{new com.planner5d.library.math.d(kVar.b(rect.getPosition()), new com.planner5d.library.math.k(1.0f, 0.0f)), new com.planner5d.library.math.d(kVar3.b(rect.getPosition()), new com.planner5d.library.math.k(-1.0f, 0.0f)), new com.planner5d.library.math.d(kVar5.b(rect.getPosition()), new com.planner5d.library.math.k(0.0f, 1.0f)), new com.planner5d.library.math.d(kVar7.b(rect.getPosition()), new com.planner5d.library.math.k(0.0f, -1.0f))});
    }
}
