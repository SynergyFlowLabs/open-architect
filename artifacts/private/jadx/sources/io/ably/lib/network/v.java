package io.ably.lib.network;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes13.dex */
public interface v {
    static v a() {
        try {
            return (v) f.class.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    static v b() {
        v vVarD = d();
        if (vVarD != null) {
            return vVarD;
        }
        v vVarA = a();
        if (vVarA != null) {
            return vVarA;
        }
        throw new IllegalStateException("No engines are available");
    }

    static v d() {
        try {
            return (v) Class.forName("io.ably.lib.network.OkHttpWebSocketEngineFactory").getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    g c();

    t e(u uVar);
}
