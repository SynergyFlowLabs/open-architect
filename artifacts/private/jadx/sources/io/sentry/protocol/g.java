package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f306258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306259d;

    public static final class a implements a2<g> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public g a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            g gVar = new g();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "region":
                        gVar.f306258c = y3Var.n6();
                        break;
                    case "city":
                        gVar.f306256a = y3Var.n6();
                        break;
                    case "country_code":
                        gVar.f306257b = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            gVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return gVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306260a = "city";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306261b = "country_code";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306262c = "region";
    }

    public g() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static g d(@NotNull Map<String, Object> map) {
        g gVar = new g();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            byte b10 = -1;
            switch (key.hashCode()) {
                case -934795532:
                    if (key.equals("region")) {
                        b10 = 0;
                    }
                    break;
                case 3053931:
                    if (key.equals(b.f306260a)) {
                        b10 = 1;
                    }
                    break;
                case 1481071862:
                    if (key.equals(b.f306261b)) {
                        b10 = 2;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    gVar.f306258c = value instanceof String ? (String) value : null;
                    break;
                case 1:
                    gVar.f306256a = value instanceof String ? (String) value : null;
                    break;
                case 2:
                    gVar.f306257b = value instanceof String ? (String) value : null;
                    break;
            }
        }
        return gVar;
    }

    @Nullable
    public String e() {
        return this.f306256a;
    }

    @Nullable
    public String f() {
        return this.f306257b;
    }

    @Nullable
    public String g() {
        return this.f306258c;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306259d;
    }

    public void h(@Nullable String str) {
        this.f306256a = str;
    }

    public void i(@Nullable String str) {
        this.f306257b = str;
    }

    public void j(@Nullable String str) {
        this.f306258c = str;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306256a != null) {
            z3Var.f(b.f306260a).b(this.f306256a);
        }
        if (this.f306257b != null) {
            z3Var.f(b.f306261b).b(this.f306257b);
        }
        if (this.f306258c != null) {
            z3Var.f("region").b(this.f306258c);
        }
        Map<String, Object> map = this.f306259d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306259d.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306259d = map;
    }

    public g(@NotNull g gVar) {
        this.f306256a = gVar.f306256a;
        this.f306257b = gVar.f306257b;
        this.f306258c = gVar.f306258c;
    }
}
