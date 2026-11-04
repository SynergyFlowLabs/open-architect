package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private String f306361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private String f306362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private List<String> f306363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306364d;

    public static final class a implements a2<k> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public k a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            k kVar = new k();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "params":
                        List list = (List) y3Var.re();
                        if (list == null) {
                            break;
                        } else {
                            kVar.f306363c = list;
                            break;
                        }
                        break;
                    case "message":
                        kVar.f306362b = y3Var.n6();
                        break;
                    case "formatted":
                        kVar.f306361a = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            kVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return kVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306365a = "formatted";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306366b = "message";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306367c = "params";
    }

    @Nullable
    public String d() {
        return this.f306361a;
    }

    @Nullable
    public String e() {
        return this.f306362b;
    }

    @Nullable
    public List<String> f() {
        return this.f306363c;
    }

    public void g(@Nullable String str) {
        this.f306361a = str;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306364d;
    }

    public void h(@Nullable String str) {
        this.f306362b = str;
    }

    public void i(@Nullable List<String> list) {
        this.f306363c = io.sentry.util.d.e(list);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306361a != null) {
            z3Var.f(b.f306365a).b(this.f306361a);
        }
        if (this.f306362b != null) {
            z3Var.f("message").b(this.f306362b);
        }
        List<String> list = this.f306363c;
        if (list != null && !list.isEmpty()) {
            z3Var.f("params").j(iLogger, this.f306363c);
        }
        Map<String, Object> map = this.f306364d;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f306364d.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306364d = map;
    }
}
