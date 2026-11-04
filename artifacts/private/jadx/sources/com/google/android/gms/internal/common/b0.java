package com.google.android.gms.internal.common;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 {
    @androidx.annotation.p0
    public static Object a(Class cls, String str, z... zVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return c(cls, "isIsolated", null, false, zVarArr);
    }

    @androidx.annotation.p0
    public static Object b(String str, String str2, ClassLoader classLoader, z... zVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return c(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zVarArr);
    }

    @androidx.annotation.p0
    private static Object c(Class cls, String str, @androidx.annotation.p0 Object obj, boolean z10, z... zVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = zVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i10 = 0; i10 < zVarArr.length; i10++) {
            z zVar = zVarArr[i10];
            zVar.getClass();
            clsArr[i10] = zVar.b();
            objArr[i10] = zVarArr[i10].c();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
