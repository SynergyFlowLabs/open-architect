package com.planner5d.library.unity;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ob.a f230645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ob.e f230646b;

    public c() {
        ob.a aVar = new ob.a();
        this.f230645a = aVar;
        this.f230646b = new ob.b(aVar);
    }

    @NotNull
    public final ob.d a(@NotNull qb.a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return this.f230646b.a(item);
    }

    @NotNull
    public final c b(boolean z10) {
        this.f230645a.e(z10);
        return this;
    }

    @NotNull
    public final c c(@NotNull List<? extends qb.a> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230645a.f(items);
        return this;
    }
}
