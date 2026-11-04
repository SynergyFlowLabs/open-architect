package com.planner5d.library.database.migration;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final fg.e<b> f154079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final h f154080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final p f154081c;

    @ij.a
    public r(@NotNull fg.e<b> migration30To31, @NotNull h migration39To40, @NotNull p migration49To50) {
        Intrinsics.checkNotNullParameter(migration30To31, "migration30To31");
        Intrinsics.checkNotNullParameter(migration39To40, "migration39To40");
        Intrinsics.checkNotNullParameter(migration49To50, "migration49To50");
        this.f154079a = migration30To31;
        this.f154080b = migration39To40;
        this.f154081c = migration49To50;
    }

    @NotNull
    public final androidx.room.migration.b[] a() {
        boolean z10 = false & false;
        return new androidx.room.migration.b[]{new a(), this.f154079a.get(), new d(), new e(), new f(), new g(), this.f154080b, new i(), new j(), new k(), new l(), new m(), new n(), new o(), this.f154081c, new q()};
    }
}
