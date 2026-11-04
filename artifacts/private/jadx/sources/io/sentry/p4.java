package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class p4 implements m2, k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Integer f306007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private List<? extends io.sentry.rrweb.b> f306008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f306009c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f306010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f306011b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f306011b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f306011b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f306011b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[io.sentry.rrweb.d.b.values().length];
            f306010a = iArr2;
            try {
                iArr2[io.sentry.rrweb.d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f306010a[io.sentry.rrweb.d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b implements a2<p4> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p4 a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            p4 p4Var = new p4();
            y3Var.m1();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numRc = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                if (strNa.equals("segment_id")) {
                    numRc = y3Var.rc();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    y3Var.gd(iLogger, map, strNa);
                }
            }
            y3Var.F1();
            y3Var.C1(true);
            List list = (List) y3Var.re();
            y3Var.C1(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.w wVar = new io.sentry.util.w(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i10 = a.f306011b[cVar.ordinal()];
                                if (i10 == 1) {
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        io.sentry.rrweb.d.b bVar = io.sentry.rrweb.d.b.values()[num.intValue()];
                                        int i11 = a.f306010a[bVar.ordinal()];
                                        if (i11 == 1) {
                                            arrayList.add(new io.sentry.rrweb.e.a().a(wVar, iLogger));
                                        } else if (i11 != 2) {
                                            iLogger.c(y7.DEBUG, "Unsupported rrweb incremental snapshot type %s", bVar);
                                        } else {
                                            arrayList.add(new io.sentry.rrweb.f.a().a(wVar, iLogger));
                                        }
                                    }
                                } else if (i10 == 2) {
                                    arrayList.add(new io.sentry.rrweb.g.a().a(wVar, iLogger));
                                } else if (i10 != 3) {
                                    iLogger.c(y7.DEBUG, "Unsupported rrweb event type %s", cVar);
                                } else {
                                    Map map4 = (Map) map2.get("data");
                                    if (map4 == null) {
                                        map4 = Collections.EMPTY_MAP;
                                    }
                                    String str2 = (String) map4.get("tag");
                                    if (str2 != null) {
                                        switch (str2) {
                                            case "performanceSpan":
                                                arrayList.add(new io.sentry.rrweb.i.a().a(wVar, iLogger));
                                                break;
                                            case "video":
                                                arrayList.add(new io.sentry.rrweb.j.a().a(wVar, iLogger));
                                                break;
                                            case "breadcrumb":
                                                arrayList.add(new io.sentry.rrweb.a.C2231a().a(wVar, iLogger));
                                                break;
                                            default:
                                                iLogger.c(y7.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            p4Var.d(numRc);
            p4Var.c(arrayList);
            p4Var.setUnknown(map);
            return p4Var;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f306012a = "segment_id";
    }

    @Nullable
    public List<? extends io.sentry.rrweb.b> a() {
        return this.f306008b;
    }

    @Nullable
    public Integer b() {
        return this.f306007a;
    }

    public void c(@Nullable List<? extends io.sentry.rrweb.b> list) {
        this.f306008b = list;
    }

    public void d(@Nullable Integer num) {
        this.f306007a = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p4.class == obj.getClass()) {
            p4 p4Var = (p4) obj;
            if (io.sentry.util.y.a(this.f306007a, p4Var.f306007a) && io.sentry.util.y.a(this.f306008b, p4Var.f306008b)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f306009c;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f306007a, this.f306008b);
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        if (this.f306007a != null) {
            z3Var.f("segment_id").i(this.f306007a);
        }
        Map<String, Object> map = this.f306009c;
        if (map != null) {
            for (String str : map.keySet()) {
                z3Var.f(str).j(iLogger, this.f306009c.get(str));
            }
        }
        z3Var.F1();
        z3Var.C1(true);
        if (this.f306007a != null) {
            z3Var.g("\n");
        }
        List<? extends io.sentry.rrweb.b> list = this.f306008b;
        if (list != null) {
            z3Var.j(iLogger, list);
        }
        z3Var.C1(false);
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f306009c = map;
    }
}
