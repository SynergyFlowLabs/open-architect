package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f106929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Method f106930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Method f106931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Method f106932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Method f106933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Method f106934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Method f106935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Method f106936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Method f106937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.b0("WorkSourceUtil.class")
    private static Boolean f106938j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f106929a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f106930b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f106931c = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f106932d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f106933e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f106934f = method5;
        if (v.o()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception unused6) {
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f106935g = method6;
        if (v.o()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception unused7) {
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f106936h = method7;
        if (v.o()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused8) {
                }
            } catch (Exception unused9) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f106937i = method8;
        f106938j = null;
    }

    private d0() {
    }

    @g6.a
    public static void a(@NonNull WorkSource workSource, int i10, @NonNull String str) {
        Method method = f106931c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f106930b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    @NonNull
    @g6.a
    public static WorkSource b(@NonNull Context context, @NonNull String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = com.google.android.gms.common.wrappers.d.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
        }
        return null;
    }

    @NonNull
    @g6.a
    public static WorkSource c(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i10 = -1;
            try {
                ApplicationInfo applicationInfoC = com.google.android.gms.common.wrappers.d.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    "Could not get applicationInfo from package: ".concat(str);
                } else {
                    i10 = applicationInfoC.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                "Could not find package: ".concat(str);
            }
            if (i10 < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = f106935g;
            if (method2 == null || (method = f106936h) == null) {
                a(workSource, i10, str);
            } else {
                try {
                    Object objInvoke = method2.invoke(workSource, null);
                    int i11 = f106929a;
                    if (i10 != i11) {
                        method.invoke(objInvoke, Integer.valueOf(i10), str);
                    }
                    method.invoke(objInvoke, Integer.valueOf(i11), str2);
                } catch (Exception unused2) {
                }
            }
            return workSource;
        }
        return null;
    }

    @g6.a
    public static int d(@NonNull WorkSource workSource, int i10) {
        Method method = f106933e;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, Integer.valueOf(i10));
            com.google.android.gms.common.internal.w.r(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }

    @NonNull
    @g6.a
    public static String e(@NonNull WorkSource workSource, int i10) {
        Method method = f106934f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(i10));
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return null;
        }
    }

    @NonNull
    @g6.a
    public static List<String> f(@NonNull WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int i10 = 2 >> 0;
        int i11 = workSource == null ? 0 : i(workSource);
        if (i11 != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                String strE = e(workSource, i12);
                if (!b0.b(strE)) {
                    com.google.android.gms.common.internal.w.r(strE);
                    arrayList.add(strE);
                }
            }
        }
        return arrayList;
    }

    @g6.a
    public static synchronized boolean g(@NonNull Context context) {
        try {
            Boolean bool = f106938j;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (context == null) {
                return false;
            }
            boolean z10 = androidx.core.content.d.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
            f106938j = Boolean.valueOf(z10);
            return z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @g6.a
    public static boolean h(@NonNull WorkSource workSource) {
        Method method = f106937i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                com.google.android.gms.common.internal.w.r(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return i(workSource) == 0;
    }

    @g6.a
    public static int i(@NonNull WorkSource workSource) {
        Method method = f106932d;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                com.google.android.gms.common.internal.w.r(objInvoke);
                return ((Integer) objInvoke).intValue();
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            }
        }
        return 0;
    }
}
