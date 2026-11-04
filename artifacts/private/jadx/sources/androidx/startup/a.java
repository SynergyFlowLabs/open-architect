package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f75354d = "Startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile a f75355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f75356f = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final Context f75359c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final Set<Class<? extends b<?>>> f75358b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final Map<Class<?>, Object> f75357a = new HashMap();

    a(@NonNull Context context) {
        this.f75359c = context.getApplicationContext();
    }

    @NonNull
    private <T> T d(@NonNull Class<? extends b<?>> cls, @NonNull Set<Class<?>> set) {
        T t10;
        if (androidx.tracing.b.i()) {
            try {
                androidx.tracing.b.c(cls.getSimpleName());
            } catch (Throwable th2) {
                androidx.tracing.b.f();
                throw th2;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f75357a.containsKey(cls)) {
            t10 = (T) this.f75357a.get(cls);
        } else {
            set.add(cls);
            try {
                b<?> bVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends b<?>>> listDependencies = bVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : listDependencies) {
                        if (!this.f75357a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                t10 = (T) bVarNewInstance.create(this.f75359c);
                set.remove(cls);
                this.f75357a.put(cls, t10);
            } catch (Throwable th3) {
                throw new d(th3);
            }
        }
        androidx.tracing.b.f();
        return t10;
    }

    @NonNull
    public static a e(@NonNull Context context) {
        if (f75355e == null) {
            synchronized (f75356f) {
                try {
                    if (f75355e == null) {
                        f75355e = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f75355e;
    }

    static void h(@NonNull a aVar) {
        synchronized (f75356f) {
            try {
                f75355e = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void a(@p0 Bundle bundle) {
        String string = this.f75359c.getString(c.a.f75360a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f75358b.add((Class<? extends b<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends b<?>>> it = this.f75358b.iterator();
                while (it.hasNext()) {
                    d(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e10) {
                throw new d(e10);
            }
        }
    }

    void b(@NonNull Class<? extends InitializationProvider> cls) {
        try {
            try {
                androidx.tracing.b.c(f75354d);
                a(this.f75359c.getPackageManager().getProviderInfo(new ComponentName(this.f75359c, cls), 128).metaData);
                androidx.tracing.b.f();
            } catch (PackageManager.NameNotFoundException e10) {
                throw new d(e10);
            }
        } catch (Throwable th2) {
            androidx.tracing.b.f();
            throw th2;
        }
    }

    @NonNull
    <T> T c(@NonNull Class<? extends b<?>> cls) {
        T t10;
        synchronized (f75356f) {
            try {
                t10 = (T) this.f75357a.get(cls);
                if (t10 == null) {
                    t10 = (T) d(cls, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t10;
    }

    @NonNull
    public <T> T f(@NonNull Class<? extends b<T>> cls) {
        return (T) c(cls);
    }

    public boolean g(@NonNull Class<? extends b<?>> cls) {
        return this.f75358b.contains(cls);
    }
}
