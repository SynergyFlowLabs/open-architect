package mg;

import io.ably.lib.util.k;
import java.lang.reflect.InvocationTargetException;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f332659a = "mg.e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile g f332660b;

    @Nullable
    public static g a() {
        if (f332660b == null) {
            synchronized (e.class) {
                try {
                    if (f332660b == null) {
                        try {
                            f332660b = (g) Class.forName("io.ably.lib.objects.serialization.DefaultObjectsSerializer").getDeclaredConstructor(null).newInstance(null);
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
                            k.n(f332659a, "Failed to init ObjectsSerializer, LiveObjects plugin not included in the classpath", e10);
                            return null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f332660b;
    }

    @Nullable
    public static b b(io.ably.lib.realtime.a aVar) {
        try {
            return (b) Class.forName("io.ably.lib.objects.DefaultLiveObjectsPlugin").getDeclaredConstructor(c.class).newInstance(new a(aVar));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            k.g(f332659a, "LiveObjects plugin not found in classpath. LiveObjects functionality will not be available.", e10);
            return null;
        }
    }
}
