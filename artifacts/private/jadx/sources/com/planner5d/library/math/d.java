package com.planner5d.library.math;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final k f180472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k f180473b;

    public d(@NotNull k origin, @NotNull k direction) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f180472a = origin;
        this.f180473b = direction;
    }

    @NotNull
    public final k a() {
        return this.f180473b;
    }

    @NotNull
    public final k b() {
        return this.f180472a;
    }

    @NotNull
    public final d c(@NotNull k translation, float f10) {
        Intrinsics.checkNotNullParameter(translation, "translation");
        k kVar = this.f180472a;
        k kVar2 = new k(kVar.f180480a + translation.f180480a, kVar.f180481b + translation.f180481b);
        double d10 = f10;
        return new d(new k((kVar2.f180480a * ((float) Math.cos(d10))) - (kVar2.f180481b * ((float) Math.sin(d10))), (kVar2.f180480a * ((float) Math.sin(d10))) + (kVar2.f180481b * ((float) Math.cos(d10)))), new k((this.f180473b.f180480a * ((float) Math.cos(d10))) - (this.f180473b.f180481b * ((float) Math.sin(d10))), (this.f180473b.f180480a * ((float) Math.sin(d10))) + (this.f180473b.f180481b * ((float) Math.cos(d10)))));
    }
}
