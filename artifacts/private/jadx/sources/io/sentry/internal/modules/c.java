package io.sentry.internal.modules;

import io.sentry.ILogger;
import io.sentry.y7;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
@lm.a.b
public final class c extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Pattern f305626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Pattern f305627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ClassLoader f305628h;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f305629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f305630b;

        public a(@NotNull String str, @NotNull String str2) {
            this.f305629a = str;
            this.f305630b = str2;
        }
    }

    public c(@NotNull ILogger iLogger) {
        this(c.class.getClassLoader(), iLogger);
    }

    @Nullable
    private a d(@Nullable String str) {
        a aVar = null;
        if (str == null) {
            return null;
        }
        Matcher matcher = this.f305627g.matcher(str);
        if (matcher.matches() && matcher.groupCount() == 2) {
            aVar = new a(matcher.group(1), matcher.group(2));
        }
        return aVar;
    }

    @NotNull
    private List<a> e() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<URL> resources = this.f305628h.getResources("META-INF/MANIFEST.MF");
            while (resources.hasMoreElements()) {
                a aVarD = d(f(resources.nextElement()));
                if (aVarD != null) {
                    arrayList.add(aVarD);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            this.f305633a.a(y7.ERROR, "Unable to detect modules via manifest files.", th2);
            return arrayList;
        }
    }

    @Nullable
    private String f(@NotNull URL url) {
        Matcher matcher = this.f305626f.matcher(url.toString());
        if (matcher.matches() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        return null;
    }

    @Override // io.sentry.internal.modules.d
    protected Map<String, String> b() {
        HashMap map = new HashMap();
        for (a aVar : e()) {
            map.put(aVar.f305629a, aVar.f305630b);
        }
        return map;
    }

    c(@Nullable ClassLoader classLoader, @NotNull ILogger iLogger) {
        super(iLogger);
        this.f305626f = Pattern.compile(".*/(.+)!/META-INF/MANIFEST.MF");
        this.f305627g = Pattern.compile("(.*?)-(\\d+\\.\\d+.*).jar");
        this.f305628h = io.sentry.util.c.a(classLoader);
    }
}
