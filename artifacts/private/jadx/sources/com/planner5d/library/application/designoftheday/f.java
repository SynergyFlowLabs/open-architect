package com.planner5d.library.application.designoftheday;

import com.planner5d.library.model.manager.statistics.events.a1;
import com.planner5d.library.model.manager.statistics.events.q3;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ij.f
public final class f implements kc.a {
    @ij.a
    public f() {
    }

    private final void c(q3.a aVar, Integer num) {
        boolean z10 = false | false;
        q3.c.a(a1.f216679b, aVar, q3.b.design_of_the_day, num, q3.d.home_page, null, 16, null);
    }

    @Override // kc.a
    public void a(@Nullable Integer num) {
        c(q3.a.open, num);
    }

    @Override // kc.a
    public void b(@Nullable Integer num) {
        c(q3.a.like, num);
    }
}
