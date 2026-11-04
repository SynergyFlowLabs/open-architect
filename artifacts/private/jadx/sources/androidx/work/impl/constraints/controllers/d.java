package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.v;
import androidx.work.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends c<androidx.work.impl.constraints.c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76768b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull androidx.work.impl.constraints.trackers.h<androidx.work.impl.constraints.c> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f76768b = 7;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public int b() {
        return this.f76768b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public boolean d(@NotNull v workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f76992j.d() == w.CONNECTED;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean f(@NotNull androidx.work.impl.constraints.c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.g() && value.j()) ? false : true;
    }
}
