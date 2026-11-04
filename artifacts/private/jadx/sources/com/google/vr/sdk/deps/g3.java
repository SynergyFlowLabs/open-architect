package com.google.vr.sdk.deps;

import com.google.vr.sdk.deps.x2;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes5.dex */
abstract class g3<T extends x2> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f129410a = Logger.getLogger(t2.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f129411b = "com.google.vr.sdk.deps.dd";

    g3() {
    }

    static <T extends x2> T b(Class<T> cls) {
        String str;
        ClassLoader classLoader = g3.class.getClassLoader();
        if (cls.equals(x2.class)) {
            str = f129411b;
        } else {
            if (!cls.getPackage().equals(g3.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return cls.cast(((g3) Class.forName(str, true, classLoader).getConstructor(null).newInstance(null)).a());
                    } catch (InstantiationException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (NoSuchMethodException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(g3.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((g3) it.next()).a()));
                } catch (ServiceConfigurationError e14) {
                    Logger logger = f129410a;
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (T) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (T) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    protected abstract T a();
}
