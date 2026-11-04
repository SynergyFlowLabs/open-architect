package com.devtodev.analytics.internal.platform.repository.android;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.devtodev.analytics.internal.modues.analytics.SdkConstraints;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidApplication {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String DEFAULT_INSTALL_SOURCE = "";
    private static final long DEFAULT_VERSION_CODE = 0;

    @NotNull
    private static final String DEFAULT_VERSION_NAME = "";

    @NotNull
    private final Context context;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AndroidApplication(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final PackageManager getPackageManger() {
        return this.context.getPackageManager();
    }

    @NotNull
    public final String getInstallSource() {
        if (Build.VERSION.SDK_INT >= 30) {
            String initiatingPackageName = getPackageManger().getInstallSourceInfo(this.context.getPackageName()).getInitiatingPackageName();
            return initiatingPackageName == null ? "" : initiatingPackageName;
        }
        String installerPackageName = getPackageManger().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    @NotNull
    public final String getPackageName() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    @NotNull
    public final String getPlatformEngine() {
        return "Native";
    }

    public final long getSdkVersionCode() {
        return 1L;
    }

    @NotNull
    public final String getSdkVersionName() {
        return SdkConstraints.Companion.getSdkVersion();
    }

    public final long getVersionCode() {
        try {
            return getPackageManger().getPackageInfo(this.context.getPackageName(), 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            return 0L;
        }
    }

    @NotNull
    public final String getVersionName() {
        try {
            String str = getPackageManger().getPackageInfo(this.context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
            return "";
        }
    }
}
