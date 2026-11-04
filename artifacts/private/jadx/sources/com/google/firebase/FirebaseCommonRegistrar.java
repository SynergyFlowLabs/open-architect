package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f120406a = "fire-android";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f120407b = "fire-core";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f120408c = "device-name";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f120409d = "device-model";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f120410e = "device-brand";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f120411f = "android-target-sdk";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f120412g = "android-min-sdk";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f120413h = "android-platform";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f120414i = "android-installer";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f120415j = "kotlin";

    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String d(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        return context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<com.google.firebase.components.g<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.platforminfo.c.b());
        arrayList.add(com.google.firebase.heartbeatinfo.g.g());
        arrayList.add(com.google.firebase.platforminfo.h.b(f120406a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(f120407b, b.f120738d));
        arrayList.add(com.google.firebase.platforminfo.h.b(f120408c, e(Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.h.b(f120409d, e(Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.h.b(f120410e, e(Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.h.c(f120411f, new com.google.firebase.platforminfo.h.a() { // from class: com.google.firebase.j
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(f120412g, new com.google.firebase.platforminfo.h.a() { // from class: com.google.firebase.k
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(f120413h, new com.google.firebase.platforminfo.h.a() { // from class: com.google.firebase.l
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.platforminfo.h.c(f120414i, new com.google.firebase.platforminfo.h.a() { // from class: com.google.firebase.m
            @Override // com.google.firebase.platforminfo.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String strA = com.google.firebase.platforminfo.e.a();
        if (strA != null) {
            arrayList.add(com.google.firebase.platforminfo.h.b(f120415j, strA));
        }
        return arrayList;
    }
}
