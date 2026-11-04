package com.planner5d.library.services.utility;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nOpenLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenLink.kt\ncom/planner5d/library/services/utility/OpenLink\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,103:1\n29#2:104\n1611#3,9:105\n1863#3:114\n1864#3:117\n1620#3:118\n1#4:115\n1#4:116\n37#5,2:119\n*S KotlinDebug\n*F\n+ 1 OpenLink.kt\ncom/planner5d/library/services/utility/OpenLink\n*L\n27#1:104\n51#1:105,9\n51#1:114\n51#1:117\n51#1:118\n51#1:116\n97#1:119,2\n*E\n"})
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i2 f225273a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f225274b = "com.android.chrome";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final String f225275c = "com.chrome.beta";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final String f225276d = "com.chrome.dev";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f225277e = "com.google.android.apps.chrome";

    private i2() {
    }

    private final String a(Context context, Uri uri) {
        ActivityInfo activityInfo;
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        int i10 = 7 & 0;
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        String str = (resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName;
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            String str2 = ((ResolveInfo) it.next()).activityInfo.packageName;
            Intent intent2 = new Intent();
            intent2.setAction(androidx.browser.customtabs.f.f11910c);
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) == null) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        if (!arrayList.isEmpty()) {
            if ((str == null || str.length() == 0) && CollectionsKt.contains(arrayList, str)) {
                return str;
            }
            if (arrayList.contains("com.android.chrome")) {
                return "com.android.chrome";
            }
            if (arrayList.contains(f225275c)) {
                return f225275c;
            }
            if (arrayList.contains(f225276d)) {
                return f225276d;
            }
            if (arrayList.contains(f225277e)) {
                return f225277e;
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String) arrayList.get(0);
    }

    @oj.n
    public static final void b(@Nullable Activity activity, @Nullable String str) throws ActivityNotFoundException {
        String strA;
        if (activity == null || str == null) {
            return;
        }
        Uri uri = Uri.parse(str);
        try {
            strA = f225273a.a(activity, uri);
        } catch (Throwable unused) {
            strA = null;
        }
        if (strA == null) {
            f225273a.c(activity, new Intent("android.intent.action.VIEW", uri), activity.getString(o2.q.Xa));
            return;
        }
        androidx.browser.customtabs.d dVarD = new androidx.browser.customtabs.d.c().C(androidx.core.content.d.g(activity, o2.e.Tl)).d();
        dVarD.f11897a.setPackage(strA);
        dVarD.g(activity, uri);
        Intrinsics.checkNotNull(dVarD);
    }

    private final void c(Context context, Intent intent, String str) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 0)) {
            if (!Intrinsics.areEqual(resolveInfo.activityInfo.packageName, context.getPackageName())) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                String packageName = resolveInfo.activityInfo.packageName;
                Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                hashSet.add(packageName);
                arrayList.add(intent2);
            }
        }
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveInfoResolveActivity == null || hashSet.isEmpty()) {
            throw new ActivityNotFoundException();
        }
        if (hashSet.contains(resolveInfoResolveActivity.activityInfo.packageName)) {
            context.startActivity(intent);
            return;
        }
        Intent intentCreateChooser = Intent.createChooser((Intent) arrayList.remove(0), str);
        intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Intent[0]));
        context.startActivity(intentCreateChooser);
    }
}
