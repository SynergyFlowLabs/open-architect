package com.planner5d.library.widget.tab;

import androidx.compose.runtime.internal.w0;
import androidx.viewpager2.widget.ViewPager2;
import com.planner5d.library.activity.fragment.projects.c0;
import com.planner5d.library.model.manager.statistics.events.b2;
import com.planner5d.library.model.manager.statistics.events.j1;
import com.planner5d.library.model.manager.statistics.events.u2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class b extends ViewPager2.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f258781c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<f.a> f258782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ij.a
    public c0 f258783b;

    public b(@NotNull List<f.a> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f258782a = tabs;
        com.planner5d.library.application.b.f142455c.a().g1(this);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.j
    public void c(int i10) {
        super.c(i10);
        f.a aVar = (f.a) CollectionsKt.getOrNull(this.f258782a, i10);
        if (aVar != null) {
            j1.f216988b.P(aVar.c());
            Function0<Unit> function0B = aVar.b();
            if (function0B != null) {
                function0B.invoke();
            }
        }
        if (i10 == 0) {
            b2.f216725b.M0(null, d().a().a());
        } else {
            u2.f217517b.k0(null, d().a().b());
        }
    }

    @NotNull
    public final c0 d() {
        c0 c0Var = this.f258783b;
        if (c0Var != null) {
            return c0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sourceManager");
        return null;
    }

    public final void e(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<set-?>");
        this.f258783b = c0Var;
    }
}
