package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
class JniNativeApi implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f121928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final FilenameFilter f121929c = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.f
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.toLowerCase().endsWith(".apk");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f121930a;

    static {
        boolean z10;
        try {
            System.loadLibrary("crashlytics");
            z10 = true;
        } catch (UnsatisfiedLinkError e10) {
            com.google.firebase.crashlytics.internal.g.f().d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e10.getLocalizedMessage());
            z10 = false;
        }
        f121928b = z10;
    }

    public JniNativeApi(Context context) {
        this.f121930a = context;
    }

    @e.b(21)
    public static void c(List<String> list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", e(packageInfo)));
        if (!file.exists()) {
            com.google.firebase.crashlytics.internal.g.f().b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] fileArrListFiles = file.listFiles(f121929c);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        com.google.firebase.crashlytics.internal.g.f().b("Found " + fileArrListFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : fileArrListFiles) {
            com.google.firebase.crashlytics.internal.g.f().b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    private static int d() {
        return 9216;
    }

    private static String e(PackageInfo packageInfo) {
        return Long.toString(packageInfo.getLongVersionCode());
    }

    public static boolean f() {
        return true;
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.g
    public boolean a(String str, AssetManager assetManager) {
        String[] strArrG = g(Build.CPU_ABI);
        if (strArrG.length < 2) {
            return false;
        }
        return f121928b && nativeInit(new String[]{strArrG[0], strArrG[1], str}, assetManager);
    }

    public String[] g(String str) {
        try {
            PackageInfo packageInfo = this.f121930a.getPackageManager().getPackageInfo(this.f121930a.getPackageName(), d());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (f()) {
                c(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e10) {
            com.google.firebase.crashlytics.internal.g.f().e("Unable to compose package paths", e10);
            throw new RuntimeException(e10);
        }
    }
}
