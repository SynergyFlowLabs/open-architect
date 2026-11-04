package com.planner5d.library.spaces.view.loading;

import androidx.compose.runtime.internal.w0;
import androidx.lifecycle.f2;
import com.planner5d.library.model.manager.statistics.events.c4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
public final class g extends f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f230382c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.spaces.data.a f230383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c4 f230384b;

    @ij.a
    public g(@NotNull com.planner5d.library.spaces.data.a addressRepository, @NotNull c4 statisticsEventSpaces) {
        Intrinsics.checkNotNullParameter(addressRepository, "addressRepository");
        Intrinsics.checkNotNullParameter(statisticsEventSpaces, "statisticsEventSpaces");
        this.f230383a = addressRepository;
        this.f230384b = statisticsEventSpaces;
    }

    public final void U(@Nullable String str) {
        if (str != null) {
            this.f230383a.n(str);
        }
    }

    public final void V() {
        c4.b.b(this.f230384b, c4.d.initial_loader, null, null, 4, null);
    }
}
