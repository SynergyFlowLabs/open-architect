package net.openid.appauth.browser;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f332837a = "http";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f332838b = "https";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    static final String f332839c = "android.support.customtabs.action.CustomTabsService";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l1
    static final Intent f332840d = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    @NonNull
    @e.a({"PackageManagerGetSignatures"})
    public static List<c> a(Context context) {
        int i10;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        Intent intent = f332840d;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 131136)) {
            if (c(resolveInfo)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.packageName, 64);
                    if (b(packageManager, resolveInfo.activityInfo.packageName)) {
                        i10 = 1;
                        c cVar = new c(packageInfo, true);
                        if (resolveInfo.activityInfo.packageName.equals(str)) {
                            arrayList.add(0, cVar);
                        } else {
                            arrayList.add(cVar);
                            i10 = 0;
                        }
                    } else {
                        i10 = 0;
                    }
                    c cVar2 = new c(packageInfo, false);
                    if (resolveInfo.activityInfo.packageName.equals(str)) {
                        arrayList.add(i10, cVar2);
                    } else {
                        arrayList.add(cVar2);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return arrayList;
    }

    private static boolean b(PackageManager packageManager, String str) {
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        intent.setPackage(str);
        return packageManager.resolveService(intent, 0) != null;
    }

    private static boolean c(ResolveInfo resolveInfo) {
        if (resolveInfo.filter.hasAction("android.intent.action.VIEW") && resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") && resolveInfo.filter.schemesIterator() != null) {
            if (resolveInfo.filter.authoritiesIterator() != null) {
                return false;
            }
            Iterator<String> itSchemesIterator = resolveInfo.filter.schemesIterator();
            boolean zEquals = false;
            boolean zEquals2 = false;
            while (itSchemesIterator.hasNext()) {
                String next = itSchemesIterator.next();
                zEquals |= f332837a.equals(next);
                zEquals2 |= "https".equals(next);
                if (zEquals && zEquals2) {
                    return true;
                }
            }
        }
        return false;
    }

    @e.a({"PackageManagerGetSignatures"})
    @p0
    public static c d(Context context, d dVar) {
        c cVar = null;
        for (c cVar2 : a(context)) {
            if (dVar.a(cVar2)) {
                if (cVar2.f332836d.booleanValue()) {
                    return cVar2;
                }
                if (cVar == null) {
                    cVar = cVar2;
                }
            }
        }
        return cVar;
    }
}
