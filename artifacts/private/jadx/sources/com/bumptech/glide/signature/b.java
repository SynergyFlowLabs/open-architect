package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.bumptech.glide.load.g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f97449a = "AppVersionSignature";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, g> f97450b = new ConcurrentHashMap();

    private b() {
    }

    @p0
    private static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
            return null;
        }
    }

    @NonNull
    private static String b(@p0 PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    public static g c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, g> concurrentMap = f97450b;
        g gVar = concurrentMap.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        g gVarD = d(context);
        g gVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, gVarD);
        return gVarPutIfAbsent == null ? gVarD : gVarPutIfAbsent;
    }

    @NonNull
    private static g d(@NonNull Context context) {
        return new e(b(a(context)));
    }

    @l1
    static void e() {
        f97450b.clear();
    }
}
