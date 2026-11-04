package com.google.firebase.inappmessaging.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public class s3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f122936b = "com.google.firebase.inappmessaging";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.h f122937a;

    @ij.a
    public s3(com.google.firebase.h hVar) {
        this.f122937a = hVar;
    }

    public void a(String str) {
        SharedPreferences.Editor editorEdit = ((Application) this.f122937a.n()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.remove(str);
        editorEdit.apply();
    }

    public boolean b(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f122937a.n()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        if (sharedPreferences.contains(str)) {
            return sharedPreferences.getBoolean(str, z10);
        }
        g(str, z10);
        return z10;
    }

    public boolean c(String str, boolean z10) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f122937a.n();
        try {
            PackageManager packageManager = application.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(str)) {
                return applicationInfo.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return z10;
    }

    public boolean d(String str, boolean z10) {
        SharedPreferences sharedPreferences = ((Application) this.f122937a.n()).getSharedPreferences("com.google.firebase.inappmessaging", 0);
        return sharedPreferences.contains(str) ? sharedPreferences.getBoolean(str, z10) : z10;
    }

    public boolean e(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Application application = (Application) this.f122937a.n();
        try {
            PackageManager packageManager = application.getPackageManager();
            return (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(application.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(str)) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public boolean f(String str) {
        return ((Application) this.f122937a.n()).getSharedPreferences("com.google.firebase.inappmessaging", 0).contains(str);
    }

    public void g(String str, boolean z10) {
        SharedPreferences.Editor editorEdit = ((Application) this.f122937a.n()).getSharedPreferences("com.google.firebase.inappmessaging", 0).edit();
        editorEdit.putBoolean(str, z10);
        editorEdit.apply();
    }
}
