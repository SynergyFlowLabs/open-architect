package io.sentry.util;

import io.sentry.n8;
import io.sentry.w7;
import io.sentry.y7;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static String f306952a = "sentry-debug-meta.properties";

    public static void a(@NotNull n8 n8Var, @Nullable List<Properties> list) {
        if (list != null) {
            e(n8Var, list);
            b(n8Var, list);
        }
    }

    private static void b(@NotNull n8 n8Var, @NotNull List<Properties> list) {
        for (Properties properties : list) {
            String strF = f(properties);
            if (strF != null) {
                String strG = g(properties);
                if (strG == null) {
                    strG = "unknown";
                }
                n8Var.getLogger().c(y7.DEBUG, "Build tool found: %s, version %s", strF, strG);
                w7.e().b(strF, strG);
                return;
            }
        }
    }

    private static void c(@NotNull n8 n8Var, @NotNull List<Properties> list) {
        if (n8Var.getBundleIds().isEmpty()) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String property = it.next().getProperty("io.sentry.bundle-ids");
                n8Var.getLogger().c(y7.DEBUG, "Bundle IDs found: %s", property);
                if (property != null) {
                    for (String str : property.split(",", -1)) {
                        n8Var.addBundleId(str);
                    }
                }
            }
        }
    }

    private static void d(@NotNull n8 n8Var, @NotNull List<Properties> list) {
        if (n8Var.getProguardUuid() == null) {
            Iterator<Properties> it = list.iterator();
            while (it.hasNext()) {
                String strH = h(it.next());
                if (strH != null) {
                    n8Var.getLogger().c(y7.DEBUG, "Proguard UUID found: %s", strH);
                    n8Var.setProguardUuid(strH);
                    return;
                }
            }
        }
    }

    public static void e(@NotNull n8 n8Var, @Nullable List<Properties> list) {
        if (list != null) {
            c(n8Var, list);
            d(n8Var, list);
        }
    }

    @Nullable
    public static String f(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.build-tool");
    }

    @Nullable
    public static String g(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.build-tool-version");
    }

    @Nullable
    public static String h(@NotNull Properties properties) {
        return properties.getProperty("io.sentry.ProguardUuids");
    }
}
