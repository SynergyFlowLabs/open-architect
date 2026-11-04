package com.planner5d.library.services.utility;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public final class g0 implements androidx.lifecycle.j2.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> f225246b;

    @ij.a
    public g0(@NotNull Map<Class<? extends androidx.lifecycle.f2>, ij.c<androidx.lifecycle.f2>> providers) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        this.f225246b = providers;
    }

    @Override // androidx.lifecycle.j2.c
    @NotNull
    public <T extends androidx.lifecycle.f2> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        ij.c<androidx.lifecycle.f2> cVar = this.f225246b.get(modelClass);
        if (cVar != null) {
            androidx.lifecycle.f2 f2Var = cVar.get();
            Intrinsics.checkNotNull(f2Var, "null cannot be cast to non-null type T of com.planner5d.library.services.utility.DaggerViewModelFactory.create");
            return (T) f2Var;
        }
        throw new RuntimeException("Could not find view model: " + modelClass.getName());
    }
}
