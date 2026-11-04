package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.m1;
import androidx.core.content.FileProvider;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f11951a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f11952b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    private m() {
    }

    public static boolean a(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(new Intent().setAction(f.f11910c).setPackage(str), 64);
        if (resolveInfoResolveService == null || (intentFilter = resolveInfoResolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    public static void b(@NonNull Context context, @NonNull d dVar, @NonNull Uri uri) {
        if (androidx.core.app.l.a(dVar.f11897a.getExtras(), d.f11872d) == null) {
            throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
        }
        dVar.f11897a.putExtra(f11951a, true);
        dVar.g(context, uri);
    }

    @b1({b1.a.LIBRARY})
    public static void c(@NonNull Context context, @NonNull h hVar, @NonNull Uri uri) {
        Intent intent = new Intent(f11952b);
        intent.setPackage(hVar.e().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        androidx.core.app.l.b(bundle, d.f11872d, hVar.d());
        intent.putExtras(bundle);
        PendingIntent pendingIntentF = hVar.f();
        if (pendingIntentF != null) {
            intent.putExtra(d.f11874e, pendingIntentF);
        }
        context.startActivity(intent);
    }

    @m1
    public static boolean d(@NonNull Context context, @NonNull File file, @NonNull String str, @NonNull String str2, @NonNull h hVar) {
        Uri uriForFile = FileProvider.getUriForFile(context, str, file);
        context.grantUriPermission(str2, uriForFile, 1);
        int i10 = 3 ^ 0;
        return hVar.i(uriForFile, 1, null);
    }
}
