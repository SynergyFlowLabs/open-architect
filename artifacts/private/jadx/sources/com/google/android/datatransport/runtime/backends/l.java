package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ij.f
class l implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f103490d = "BackendRegistry";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f103491e = "backend:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f103492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f103493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, n> f103494c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f103495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f103496b = null;

        a(Context context) {
            this.f103495a = context;
        }

        private Map<String, String> a(Context context) {
            Bundle bundleD = d(context);
            if (bundleD == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleD.keySet()) {
                Object obj = bundleD.get(str);
                if ((obj instanceof String) && str.startsWith(l.f103491e)) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private Map<String, String> c() {
            if (this.f103496b == null) {
                this.f103496b = a(this.f103495a);
            }
            return this.f103496b;
        }

        private static Bundle d(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @p0
        d b(String str) {
            String str2 = c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (d) Class.forName(str2).asSubclass(d.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    @ij.a
    l(Context context, j jVar) {
        this(new a(context), jVar);
    }

    @Override // com.google.android.datatransport.runtime.backends.e
    @p0
    public synchronized n get(String str) {
        if (this.f103494c.containsKey(str)) {
            return this.f103494c.get(str);
        }
        d dVarB = this.f103492a.b(str);
        if (dVarB == null) {
            return null;
        }
        n nVarCreate = dVarB.create(this.f103493b.a(str));
        this.f103494c.put(str, nVarCreate);
        return nVarCreate;
    }

    l(a aVar, j jVar) {
        this.f103494c = new HashMap();
        this.f103492a = aVar;
        this.f103493b = jVar;
    }
}
