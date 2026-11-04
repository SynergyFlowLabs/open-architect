package com.planner5d.library.model.manager.managedfiles;

import androidx.compose.runtime.internal.w0;
import com.planner5d.library.services.exceptions.ErrorMessageException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@w0(parameters = 0)
public final class v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f192083g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final com.planner5d.library.model.d f192084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final w f192085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final y.b f192086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final ErrorMessageException f192087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f192088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String[] f192089f;

    public v(@NotNull com.planner5d.library.model.d datafile, @Nullable w wVar, @NotNull y.b downloadState, @Nullable ErrorMessageException errorMessageException, int i10, @NotNull String[] validationError) {
        Intrinsics.checkNotNullParameter(datafile, "datafile");
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        this.f192084a = datafile;
        this.f192085b = wVar;
        this.f192086c = downloadState;
        this.f192087d = errorMessageException;
        this.f192088e = i10;
        this.f192089f = validationError;
    }

    @NotNull
    public final com.planner5d.library.model.d a() {
        return this.f192084a;
    }

    @Nullable
    public final ErrorMessageException b() {
        return this.f192087d;
    }

    public final int c() {
        return this.f192088e;
    }

    @NotNull
    public final y.b d() {
        return this.f192086c;
    }

    @Nullable
    public final w e() {
        return this.f192085b;
    }

    @NotNull
    public final String[] f() {
        return this.f192089f;
    }

    @NotNull
    public final v g(@Nullable w wVar) {
        return new v(this.f192084a, wVar, this.f192086c, this.f192087d, this.f192088e, this.f192089f);
    }

    @NotNull
    public final v h(@NotNull y.b downloadState, @Nullable ErrorMessageException errorMessageException) {
        Intrinsics.checkNotNullParameter(downloadState, "downloadState");
        return new v(this.f192084a, this.f192085b, downloadState, errorMessageException, this.f192088e, this.f192089f);
    }

    @NotNull
    public final v i(int i10) {
        return new v(this.f192084a, this.f192085b, this.f192086c, this.f192087d, i10, this.f192089f);
    }

    @NotNull
    public final v j(@NotNull String[] validationError) {
        Intrinsics.checkNotNullParameter(validationError, "validationError");
        return new v(this.f192084a, this.f192085b, this.f192086c, this.f192087d, this.f192088e, validationError);
    }
}
