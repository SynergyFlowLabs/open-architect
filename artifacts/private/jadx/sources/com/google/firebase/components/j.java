package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import androidx.annotation.l1;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class j<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f120775c = "ComponentDiscovery";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f120776d = "com.google.firebase.components.ComponentRegistrar";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f120777e = "com.google.firebase.components:";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f120778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<T> f120779b;

    private static class b implements c<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f120780a;

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f120780a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Objects.toString(this.f120780a);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @Override // com.google.firebase.components.j.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if (j.f120776d.equals(bundleB.get(str)) && str.startsWith(j.f120777e)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private b(Class<? extends Service> cls) {
            this.f120780a = cls;
        }
    }

    @l1
    interface c<T> {
        List<String> a(T t10);
    }

    @l1
    j(T t10, c<T> cVar) {
        this.f120778a = t10;
        this.f120779b = cVar;
    }

    public static j<Context> d(Context context, Class<? extends Service> cls) {
        return new j<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public static ComponentRegistrar e(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new a0(String.format("Class %s is not an instance of %s", str, f120776d));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e10) {
            throw new a0(String.format("Could not instantiate %s.", str), e10);
        } catch (InstantiationException e11) {
            throw new a0(String.format("Could not instantiate %s.", str), e11);
        } catch (NoSuchMethodException e12) {
            throw new a0(String.format("Could not instantiate %s", str), e12);
        } catch (InvocationTargetException e13) {
            throw new a0(String.format("Could not instantiate %s", str), e13);
        }
    }

    @Deprecated
    public List<ComponentRegistrar> b() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f120779b.a(this.f120778a).iterator();
        while (it.hasNext()) {
            try {
                ComponentRegistrar componentRegistrarE = e(it.next());
                if (componentRegistrarE != null) {
                    arrayList.add(componentRegistrarE);
                }
            } catch (a0 unused) {
            }
        }
        return arrayList;
    }

    public List<z8.b<ComponentRegistrar>> c() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f120779b.a(this.f120778a)) {
            arrayList.add(new z8.b() { // from class: com.google.firebase.components.i
                @Override // z8.b
                public final Object get() {
                    return j.e(str);
                }
            });
        }
        return arrayList;
    }
}
