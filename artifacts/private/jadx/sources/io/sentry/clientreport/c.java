package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.p;
import io.sentry.y3;
import io.sentry.y7;
import io.sentry.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class c implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Date f305272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<g> f305273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305274c;

    public static final class a implements a2<c> {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(y7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            y3Var.m1();
            Date dateZ3 = null;
            HashMap map = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals(b.f305276b)) {
                    arrayList.addAll(y3Var.p8(iLogger, new g.a()));
                } else if (strNa.equals("timestamp")) {
                    dateZ3 = y3Var.z3(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            if (dateZ3 == null) {
                throw c("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c(b.f305276b, iLogger);
            }
            c cVar = new c(dateZ3, arrayList);
            cVar.setUnknown(map);
            return cVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305275a = "timestamp";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305276b = "discarded_events";
    }

    public c(@NotNull Date date, @NotNull List<g> list) {
        this.f305272a = date;
        this.f305273b = list;
    }

    @NotNull
    public List<g> a() {
        return this.f305273b;
    }

    @NotNull
    public Date b() {
        return this.f305272a;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305274c;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("timestamp").b(p.h(this.f305272a));
        z3Var.f(b.f305276b).j(iLogger, this.f305273b);
        Map<String, Object> map = this.f305274c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f305274c.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305274c = map;
    }
}
