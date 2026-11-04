package io.sentry.config;

import io.sentry.util.h0;
import io.sentry.util.y;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
abstract class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f305288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Properties f305289b;

    protected a(@NotNull String str, @NotNull Properties properties) {
        this.f305288a = (String) y.c(str, "prefix is required");
        this.f305289b = (Properties) y.c(properties, "properties are required");
    }

    @Override // io.sentry.config.g
    @NotNull
    public Map<String, String> e(@NotNull String str) {
        String str2 = this.f305288a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f305289b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), h0.j((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.g
    @Nullable
    public String getProperty(@NotNull String str) {
        return h0.j(this.f305289b.getProperty(this.f305288a + str), "\"");
    }

    protected a(@NotNull Properties properties) {
        this("", properties);
    }
}
