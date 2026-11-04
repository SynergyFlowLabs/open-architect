package io.ably.lib.network;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public interface m {
    static m a() {
        try {
            return (m) c.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static m b() {
        m mVarD = d();
        if (mVarD != null) {
            return mVarD;
        }
        m mVarA = a();
        if (mVarA != null) {
            return mVarA;
        }
        throw new IllegalStateException("No engines are available");
    }

    static m d() {
        try {
            return (m) Class.forName("io.ably.lib.network.OkHttpEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    g c();

    k e(l lVar);
}
