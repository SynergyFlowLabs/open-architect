package io.sentry.internal.modules;

import io.sentry.ILogger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
@lm.a.b
public final class a extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<b> f305625f;

    public a(@NotNull List<b> list, @NotNull ILogger iLogger) {
        super(iLogger);
        this.f305625f = list;
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        TreeMap treeMap = new TreeMap();
        Iterator<b> it = this.f305625f.iterator();
        while (it.hasNext()) {
            Map<String, String> mapA = it.next().a();
            if (mapA != null) {
                treeMap.putAll(mapA);
            }
        }
        return treeMap;
    }
}
