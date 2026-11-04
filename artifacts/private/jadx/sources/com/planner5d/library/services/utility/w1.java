package com.planner5d.library.services.utility;

import android.app.Application;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@ij.f
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f229829a;

    @ij.a
    public w1(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f229829a = application;
    }

    @Nullable
    public final Locale a() {
        return this.f229829a.getResources().getConfiguration().getLocales().get(0);
    }
}
