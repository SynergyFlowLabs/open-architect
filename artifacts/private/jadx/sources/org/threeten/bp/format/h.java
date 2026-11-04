package org.threeten.bp.format;

import androidx.compose.animation.core.z1;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<h> f340159a = new AtomicReference<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f340160a = a();

        a() {
        }

        static h a() {
            z1.a(h.f340159a, null, new n());
            return (h) h.f340159a.get();
        }
    }

    static h b() {
        return a.f340160a;
    }

    public static void e(h hVar) {
        if (!z1.a(f340159a, null, hVar)) {
            throw new IllegalStateException("Provider was already set, possibly with a default during initialization");
        }
    }

    public abstract String c(org.threeten.bp.temporal.j jVar, long j10, o oVar, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> d(org.threeten.bp.temporal.j jVar, o oVar, Locale locale);
}
