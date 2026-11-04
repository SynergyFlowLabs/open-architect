package com.planner5d.library.activity.fragment.spaces.view;

import androidx.annotation.f1;
import androidx.compose.runtime.internal.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class m extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f136418f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f136419e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@f1 int i10, @f1 int i11, @NotNull Function0<Unit> onDownloadClick) {
        super(Integer.valueOf(i10), Integer.valueOf(i11), null);
        Intrinsics.checkNotNullParameter(onDownloadClick, "onDownloadClick");
        this.f136419e = onDownloadClick;
    }

    @NotNull
    public final Function0<Unit> c() {
        return this.f136419e;
    }
}
