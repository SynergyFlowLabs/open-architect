package com.planner5d.library.activity.fragment.spaces.view;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.utility.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class l extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f136415g = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k3 f136416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f136417f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@NotNull k3 titleText, @f1 int i10, @NotNull Function0<Unit> onDownloadClick) {
        super(null, Integer.valueOf(i10), null);
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(onDownloadClick, "onDownloadClick");
        this.f136416e = titleText;
        this.f136417f = onDownloadClick;
    }

    @NotNull
    public final Function0<Unit> c() {
        return this.f136417f;
    }

    @NotNull
    public final k3 d() {
        return this.f136416e;
    }
}
