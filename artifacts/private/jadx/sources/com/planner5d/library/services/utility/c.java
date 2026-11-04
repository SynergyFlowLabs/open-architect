package com.planner5d.library.services.utility;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nAppSystemSettingsLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSystemSettingsLauncher.kt\ncom/planner5d/library/services/utility/AppSystemSettingsLauncher\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,20:1\n29#2:21\n*S KotlinDebug\n*F\n+ 1 AppSystemSettingsLauncher.kt\ncom/planner5d/library/services/utility/AppSystemSettingsLauncher\n*L\n12#1:21\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f225066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Intent f225067b;

    @ij.a
    public c(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f225066a = application;
        this.f225067b = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + application.getPackageName()));
    }

    public final boolean a() {
        return h3.b(this.f225066a, this.f225067b);
    }

    public final void b() {
        h3.f0(this.f225066a, this.f225067b);
    }
}
