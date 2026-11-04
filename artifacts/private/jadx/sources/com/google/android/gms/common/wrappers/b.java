package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.util.v;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f106981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static Boolean f106982b;

    @g6.a
    public static synchronized boolean a(@NonNull Context context) {
        Boolean bool;
        try {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f106981a;
            if (context2 != null && (bool = f106982b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f106982b = null;
            if (v.n()) {
                f106982b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f106982b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f106982b = Boolean.FALSE;
                }
            }
            f106981a = applicationContext;
            return f106982b.booleanValue();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
