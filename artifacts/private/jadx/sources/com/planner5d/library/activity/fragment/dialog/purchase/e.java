package com.planner5d.library.activity.fragment.dialog.purchase;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f132578d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f132579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final fd.g[] f132580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f132581c;

    public e(@NotNull a loadingState, @NotNull fd.g[] list, @Nullable String str) {
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(list, "list");
        this.f132579a = loadingState;
        this.f132580b = list;
        this.f132581c = str;
    }

    @NotNull
    public final fd.g[] a() {
        return this.f132580b;
    }

    @NotNull
    public final a b() {
        return this.f132579a;
    }

    @Nullable
    public final String c() {
        return this.f132581c;
    }

    public /* synthetic */ e(a aVar, fd.g[] gVarArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, gVarArr, (i10 & 4) != 0 ? null : str);
    }
}
