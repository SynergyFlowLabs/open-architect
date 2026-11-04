package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<g> f305293a;

    public c(@NotNull List<g> list) {
        this.f305293a = list;
    }

    @Override // io.sentry.config.g
    @NotNull
    public Map<String, String> e(@NotNull String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator<g> it = this.f305293a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(it.next().e(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.g
    @Nullable
    public String getProperty(@NotNull String str) {
        Iterator<g> it = this.f305293a.iterator();
        while (it.hasNext()) {
            String property = it.next().getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
