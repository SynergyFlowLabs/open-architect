package io.sentry.util;

import io.sentry.h8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Boolean> f306954a = new ConcurrentHashMap();

    @NotNull
    public static List<String> a(@NotNull h8 h8Var) {
        ArrayList arrayList = new ArrayList();
        h8 h8Var2 = h8.AGENT;
        if (h8Var2 == h8Var || h8.AGENTLESS_SPRING == h8Var) {
            arrayList.add("auto.http.spring_jakarta.webmvc");
            arrayList.add("auto.http.spring.webmvc");
            arrayList.add("auto.http.spring7.webmvc");
            arrayList.add("auto.spring_jakarta.webflux");
            arrayList.add("auto.spring.webflux");
            arrayList.add("auto.spring7.webflux");
            arrayList.add("auto.db.jdbc");
            arrayList.add("auto.http.spring_jakarta.webclient");
            arrayList.add("auto.http.spring.webclient");
            arrayList.add("auto.http.spring7.webclient");
            arrayList.add("auto.http.spring_jakarta.restclient");
            arrayList.add("auto.http.spring.restclient");
            arrayList.add("auto.http.spring7.restclient");
            arrayList.add("auto.http.spring_jakarta.resttemplate");
            arrayList.add("auto.http.spring.resttemplate");
            arrayList.add("auto.http.spring7.resttemplate");
            arrayList.add("auto.http.openfeign");
            arrayList.add("auto.http.ktor-client");
        }
        if (h8Var2 == h8Var) {
            arrayList.add("auto.graphql.graphql");
            arrayList.add("auto.graphql.graphql22");
        }
        return arrayList;
    }

    @lm.a.c
    public static boolean b(@Nullable List<io.sentry.l0> list, @Nullable String str) {
        if (str != null && list != null && !list.isEmpty()) {
            Map<String, Boolean> map = f306954a;
            if (map.containsKey(str)) {
                return map.get(str).booleanValue();
            }
            Iterator<io.sentry.l0> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a().equalsIgnoreCase(str)) {
                    f306954a.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator<io.sentry.l0> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().b(str)) {
                        f306954a.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            f306954a.put(str, Boolean.FALSE);
        }
        return false;
    }
}
