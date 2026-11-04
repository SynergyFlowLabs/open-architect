package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.a2;
import io.sentry.k2;
import io.sentry.m2;
import io.sentry.protocol.z;
import io.sentry.y3;
import io.sentry.z3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class a implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private List<io.sentry.protocol.profiling.b> f306435a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<List<Integer>> f306436b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<z> f306437c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Map<String, io.sentry.protocol.profiling.c> f306438d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306439e;

    public static final class b implements a2<a> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "frames":
                        List listP8 = y3Var.p8(iLogger, new z.a());
                        if (listP8 == null) {
                            break;
                        } else {
                            aVar.f306437c = listP8;
                            break;
                        }
                        break;
                    case "stacks":
                        List list = (List) y3Var.i4(iLogger, new d());
                        if (list == null) {
                            break;
                        } else {
                            aVar.f306436b = list;
                            break;
                        }
                        break;
                    case "samples":
                        List listP9 = y3Var.p8(iLogger, new io.sentry.protocol.profiling.b.a());
                        if (listP9 == null) {
                            break;
                        } else {
                            aVar.f306435a = listP9;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        Map mapFd = y3Var.fd(iLogger, new io.sentry.protocol.profiling.c.a());
                        if (mapFd == null) {
                            break;
                        } else {
                            aVar.f306438d = mapFd;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap, strNa);
                        break;
                }
            }
            aVar.setUnknown(concurrentHashMap);
            y3Var.F1();
            return aVar;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306440a = "samples";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f306441b = "stacks";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f306442c = "frames";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f306443d = "thread_metadata";
    }

    private static final class d implements a2<List<List<Integer>>> {
        private d() {
        }

        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<List<Integer>> a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            y3Var.J0();
            while (y3Var.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                y3Var.J0();
                while (y3Var.hasNext()) {
                    arrayList2.add(Integer.valueOf(y3Var.nextInt()));
                }
                y3Var.F0();
                arrayList.add(arrayList2);
            }
            y3Var.F0();
            return arrayList;
        }
    }

    @NotNull
    public List<z> e() {
        return this.f306437c;
    }

    @NotNull
    public List<io.sentry.protocol.profiling.b> f() {
        return this.f306435a;
    }

    @NotNull
    public List<List<Integer>> g() {
        return this.f306436b;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306439e;
    }

    @NotNull
    public Map<String, io.sentry.protocol.profiling.c> h() {
        return this.f306438d;
    }

    public void i(@NotNull List<z> list) {
        this.f306437c = list;
    }

    public void j(@NotNull List<io.sentry.protocol.profiling.b> list) {
        this.f306435a = list;
    }

    public void k(@NotNull List<List<Integer>> list) {
        this.f306436b = list;
    }

    public void l(@NotNull Map<String, io.sentry.protocol.profiling.c> map) {
        this.f306438d = map;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f(c.f306440a).j(iLogger, this.f306435a);
        z3Var.f(c.f306441b).j(iLogger, this.f306436b);
        z3Var.f("frames").j(iLogger, this.f306437c);
        z3Var.f(c.f306443d).j(iLogger, this.f306438d);
        Map<String, Object> map = this.f306439e;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306439e.get(str));
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306439e = map;
    }
}
