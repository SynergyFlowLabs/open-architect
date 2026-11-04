package com.planner5d.library.services.download;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nDownloadUri.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DownloadUri.kt\ncom/planner5d/library/services/download/DownloadUri\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,21:1\n29#2:22\n*S KotlinDebug\n*F\n+ 1 DownloadUri.kt\ncom/planner5d/library/services/download/DownloadUri\n*L\n17#1:22\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f224281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f224282b;

    public g(@NotNull String root, @NotNull String path) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f224281a = root + (StringsKt.M1(root, "/", false, 2, null) ? "" : "/") + path;
        this.f224282b = root;
    }

    @NotNull
    public final String a() {
        return this.f224282b;
    }

    @NotNull
    public final String b() {
        return this.f224281a;
    }

    public g(@NotNull String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f224281a = uri;
        String path = Uri.parse(uri).getPath();
        this.f224282b = StringsKt.x5(uri, path == null ? "" : path, null, 2, null);
    }
}
