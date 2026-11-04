package com.planner5d.library.model.manager.statistics;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@SourceDebugExtension({"SMAP\nAnalyticsSourceConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsSourceConverter.kt\ncom/planner5d/library/model/manager/statistics/AnalyticsSourceConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class c<T extends Enum<?>> implements d<T> {
    @Override // com.planner5d.library.model.manager.statistics.d
    @NotNull
    public T a(@Nullable Bundle bundle, @NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "default");
        Serializable serializableS = bundle != null ? new com.planner5d.library.services.utility.j(bundle).s(com.planner5d.library.services.r.source, null) : null;
        T t11 = serializableS instanceof Enum ? (T) serializableS : null;
        return t11 == null ? t10 : t11;
    }

    @Override // com.planner5d.library.model.manager.statistics.d
    @NotNull
    public Bundle b(@NotNull Bundle bundle, @Nullable T t10) {
        Bundle bundleA;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        return (t10 == null || (bundleA = new com.planner5d.library.services.utility.i(bundle).t(com.planner5d.library.services.r.source, t10).a()) == null) ? bundle : bundleA;
    }

    @Override // com.planner5d.library.model.manager.statistics.d
    @Nullable
    public T c(@Nullable Bundle bundle) {
        Serializable serializableS = bundle != null ? new com.planner5d.library.services.utility.j(bundle).s(com.planner5d.library.services.r.source, null) : null;
        if (serializableS instanceof Enum) {
            return (T) serializableS;
        }
        return null;
    }

    @Override // com.planner5d.library.model.manager.statistics.d
    public void d(@NotNull Bundle bundle, @NotNull T source) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(source, "source");
        bundle.putSerializable(com.planner5d.library.services.r.source.f224891a, source);
    }
}
