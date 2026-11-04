package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76758b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull androidx.work.impl.constraints.trackers.h<Boolean> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f76758b = 6;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public int b() {
        return this.f76758b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public boolean d(@NotNull v workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f76992j.g();
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public /* bridge */ /* synthetic */ boolean f(Boolean bool) {
        return h(bool.booleanValue());
    }

    public boolean h(boolean z10) {
        return !z10;
    }
}
