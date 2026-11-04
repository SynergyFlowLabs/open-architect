package com.segment.analytics.kotlin.android.plugins;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.ParseException;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public final class e {
    @Nullable
    public static final Uri b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return activity.getReferrer();
    }

    private static final Uri c(Activity activity) {
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra == null) {
            return null;
        }
        try {
            return Uri.parse(stringExtra);
        } catch (ParseException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Number d(PackageInfo packageInfo) {
        return Long.valueOf(packageInfo.getLongVersionCode());
    }
}
