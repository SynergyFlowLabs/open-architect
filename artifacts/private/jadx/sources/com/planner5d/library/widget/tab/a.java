package com.planner5d.library.widget.tab;

import androidx.compose.runtime.internal.w0;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.model.manager.statistics.events.r3;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class a extends ViewPager2.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258778c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final r3 f258779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<f.a> f258780b;

    public a(@NotNull r3 statisticsEventGeneric, @NotNull List<f.a> tabs) {
        Intrinsics.checkNotNullParameter(statisticsEventGeneric, "statisticsEventGeneric");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f258779a = statisticsEventGeneric;
        this.f258780b = tabs;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i10) {
        super.c(i10);
        f.a aVar = (f.a) CollectionsKt.getOrNull(this.f258780b, i10);
        if (aVar != null) {
            this.f258779a.P(aVar.c());
            Function0<Unit> function0B = aVar.b();
            if (function0B != null) {
                function0B.invoke();
            }
        }
    }
}
