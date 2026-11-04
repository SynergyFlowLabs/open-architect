package io.customer.messagingpush.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ih.e f288467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.customer.messagingpush.c f288468b;

    public e(@NotNull ih.e logger, @NotNull io.customer.messagingpush.c moduleConfig) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(moduleConfig, "moduleConfig");
        this.f288467a = logger;
        this.f288468b = moduleConfig;
    }

    private final Intent d(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.setPackage(context.getPackageName());
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        return f(intent, packageManager);
    }

    private final Intent e(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536)) : packageManager.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNull(listQueryIntentActivities);
        if (!listQueryIntentActivities.isEmpty()) {
            intent.setPackage(((ResolveInfo) CollectionsKt.first((List) listQueryIntentActivities)).activityInfo.packageName);
        }
        Intrinsics.checkNotNull(packageManager);
        return f(intent, packageManager);
    }

    private final Intent f(Intent intent, PackageManager packageManager) {
        if (intent.resolveActivity(packageManager) != null) {
            return intent;
        }
        return null;
    }

    @Override // io.customer.messagingpush.util.b
    @Nullable
    public Intent a(@NotNull Context context, @NotNull String link) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
        Uri uri = Uri.parse(link);
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        Intent intentD = d(context, uri);
        if (intentD == null) {
            ih.e.a.c(this.f288467a, "No supporting activity found in host app for link received in push notification " + link, null, 2, null);
        }
        return intentD;
    }

    @Override // io.customer.messagingpush.util.b
    @Nullable
    public Intent b(@NotNull Context context, @NotNull String link) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(link, "link");
        Uri uri = Uri.parse(link);
        Intrinsics.checkNotNull(uri);
        Intent intentE = e(context, uri);
        if (intentE == null) {
            ih.e.a.c(this.f288467a, "No supporting application found for link received in push notification: " + link, null, 2, null);
        }
        return intentE;
    }

    @Override // io.customer.messagingpush.util.b
    @Nullable
    public Intent c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }
}
