package com.planner5d.library.model;

import android.content.Context;
import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f180559b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f180560a;

    public c(@f1 int i10) {
        this.f180560a = i10;
    }

    @NotNull
    public final String a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(this.f180560a);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
