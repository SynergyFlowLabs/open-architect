package com.sdk.growthbook.evaluators;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Set<String> f266222a = new LinkedHashSet();

    public final boolean a(@NotNull com.sdk.growthbook.model.f experiment, @Nullable com.sdk.growthbook.model.g gVar) {
        String strR;
        String strT;
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        String strI = experiment.I();
        String str = "";
        if (gVar == null || (strR = gVar.r()) == null) {
            strR = "";
        }
        if (gVar != null && (strT = gVar.t()) != null) {
            str = strT;
        }
        String str2 = strR + str + strI + (gVar != null ? Integer.valueOf(gVar.A()) : null);
        if (this.f266222a.contains(str2)) {
            return true;
        }
        this.f266222a.add(str2);
        return false;
    }
}
