package com.planner5d.library.model.manager.builtin.materialsmetadataloading;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@w0(parameters = 1)
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f181156d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f181157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f181158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f181159c;

    public g(@NotNull String remoteUriPath, @NotNull String localFileName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(remoteUriPath, "remoteUriPath");
        Intrinsics.checkNotNullParameter(localFileName, "localFileName");
        this.f181157a = remoteUriPath;
        this.f181158b = localFileName;
        this.f181159c = str;
    }

    @Nullable
    public final String a() {
        return this.f181159c;
    }

    @NotNull
    public final String b() {
        return this.f181158b;
    }

    @NotNull
    public final String c() {
        return this.f181157a;
    }
}
