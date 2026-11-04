package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f97239b = "ManifestParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f97240c = "GlideModule";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f97241a;

    public e(Context context) {
        this.f97241a = context;
    }

    private static c b(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e10) {
                c(cls, e10);
            } catch (InstantiationException e11) {
                c(cls, e11);
            } catch (NoSuchMethodException e12) {
                c(cls, e12);
            } catch (InvocationTargetException e13) {
                c(cls, e13);
            }
            if (objNewInstance instanceof c) {
                return (c) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e14) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e14);
        }
    }

    private static void c(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public List<c> a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f97241a.getPackageManager().getApplicationInfo(this.f97241a.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return arrayList;
            }
            if (Log.isLoggable(f97239b, 2)) {
                Objects.toString(applicationInfo.metaData);
            }
            for (String str : applicationInfo.metaData.keySet()) {
                if (f97240c.equals(applicationInfo.metaData.get(str))) {
                    arrayList.add(b(str));
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e10);
        }
    }
}
