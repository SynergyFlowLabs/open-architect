package com.planner5d.library.model.payments.paymentmethod;

import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final List<fd.c> f222519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Exception f222520b;

    public d(@Nullable List<fd.c> list, @Nullable Exception exc) {
        this.f222519a = list;
        this.f222520b = exc;
    }

    @Nullable
    public final Exception a() {
        return this.f222520b;
    }

    @Nullable
    public final List<fd.c> b() {
        return this.f222519a;
    }
}
