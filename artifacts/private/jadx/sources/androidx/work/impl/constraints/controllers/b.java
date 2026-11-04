package androidx.work.impl.constraints.controllers;

import androidx.work.impl.model.v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c<Boolean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f76759b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull androidx.work.impl.constraints.trackers.c tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f76759b = 5;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public int b() {
        return this.f76759b;
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public boolean d(@NotNull v workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.f76992j.f();
    }

    @Override // androidx.work.impl.constraints.controllers.c
    public /* bridge */ /* synthetic */ boolean f(Boolean bool) {
        return h(bool.booleanValue());
    }

    public boolean h(boolean z10) {
        return !z10;
    }
}
