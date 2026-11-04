package com.sdk.growthbook;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class AppContextProvider implements androidx.startup.b<Context> {
    @Override // androidx.startup.b
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Context create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        pf.b.Companion.a(context);
        return context;
    }

    @Override // androidx.startup.b
    @NotNull
    public List<Class<? extends androidx.startup.b<?>>> dependencies() {
        return CollectionsKt.emptyList();
    }
}
