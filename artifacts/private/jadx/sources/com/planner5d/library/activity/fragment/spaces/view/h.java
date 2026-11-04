package com.planner5d.library.activity.fragment.spaces.view;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class h extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f136407g = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Integer f136408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final k3 f136409f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@Nullable Integer num, @NotNull k3 titleText, @f1 int i10) {
        super(null, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        this.f136408e = num;
        this.f136409f = titleText;
    }

    @Nullable
    public final Integer c() {
        return this.f136408e;
    }

    @NotNull
    public final k3 d() {
        return this.f136409f;
    }
}
