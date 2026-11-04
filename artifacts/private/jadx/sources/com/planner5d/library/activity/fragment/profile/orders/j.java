package com.planner5d.library.activity.fragment.profile.orders;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 1)
public final class j extends h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f134780g = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f134781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f134782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f134783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String f134784f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i10, @NotNull String catalogLimit, @NotNull String snapshotsLeft, @NotNull String texturesLeft) {
        super(h.a.Platform);
        Intrinsics.checkNotNullParameter(catalogLimit, "catalogLimit");
        Intrinsics.checkNotNullParameter(snapshotsLeft, "snapshotsLeft");
        Intrinsics.checkNotNullParameter(texturesLeft, "texturesLeft");
        this.f134781c = i10;
        this.f134782d = catalogLimit;
        this.f134783e = snapshotsLeft;
        this.f134784f = texturesLeft;
    }

    @NotNull
    public final String b() {
        return this.f134782d;
    }

    public final int c() {
        return this.f134781c;
    }

    @NotNull
    public final String d() {
        return this.f134783e;
    }

    @NotNull
    public final String e() {
        return this.f134784f;
    }
}
