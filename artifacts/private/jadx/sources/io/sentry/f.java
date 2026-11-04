package io.sentry;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements m2, k2, Comparable<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Long f305402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Date f305403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Long f305404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private String f305405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f305406e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private Map<String, Object> f305407f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private String f305408g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private String f305409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private y7 f305410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private Map<String, Object> f305411j;

    public static final class a implements a2<f> {
        @Override // io.sentry.a2
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public f a(@NotNull y3 y3Var, @NotNull ILogger iLogger) throws Exception {
            y3Var.m1();
            Date dateD = p.d();
            Map concurrentHashMap = new ConcurrentHashMap();
            String strN6 = null;
            String strN7 = null;
            String strN8 = null;
            String strN9 = null;
            y7 y7VarA = null;
            ConcurrentHashMap concurrentHashMap2 = null;
            while (y3Var.peek() == io.sentry.vendor.gson.stream.c.NAME) {
                String strNa = y3Var.na();
                strNa.getClass();
                switch (strNa) {
                    case "origin":
                        strN9 = y3Var.n6();
                        break;
                    case "data":
                        Map mapF = io.sentry.util.d.f((Map) y3Var.re());
                        if (mapF == null) {
                            break;
                        } else {
                            concurrentHashMap = mapF;
                            break;
                        }
                        break;
                    case "type":
                        strN7 = y3Var.n6();
                        break;
                    case "category":
                        strN8 = y3Var.n6();
                        break;
                    case "timestamp":
                        Date dateZ3 = y3Var.z3(iLogger);
                        if (dateZ3 == null) {
                            break;
                        } else {
                            dateD = dateZ3;
                            break;
                        }
                        break;
                    case "level":
                        try {
                            y7VarA = new y7.a().a(y3Var, iLogger);
                            break;
                        } catch (Exception e10) {
                            iLogger.b(y7.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                            break;
                        }
                        break;
                    case "message":
                        strN6 = y3Var.n6();
                        break;
                    default:
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap();
                        }
                        y3Var.gd(iLogger, concurrentHashMap2, strNa);
                        break;
                }
            }
            f fVar = new f(dateD);
            fVar.f305405d = strN6;
            fVar.f305406e = strN7;
            fVar.f305407f = concurrentHashMap;
            fVar.f305408g = strN8;
            fVar.f305409h = strN9;
            fVar.f305410i = y7VarA;
            fVar.setUnknown(concurrentHashMap2);
            y3Var.F1();
            return fVar;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f305412a = "timestamp";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f305413b = "message";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f305414c = "type";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f305415d = "data";

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final String f305416e = "category";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f305417f = "origin";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f305418g = "level";
    }

    public f(@NotNull Date date) {
        this.f305407f = new ConcurrentHashMap();
        this.f305404c = Long.valueOf(System.nanoTime());
        this.f305403b = date;
        this.f305402a = null;
    }

    @NotNull
    public static f D(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        f fVar = new f();
        fVar.Y("graphql");
        fVar.T("graphql.fetcher");
        if (str != null) {
            fVar.U("path", str);
        }
        if (str2 != null) {
            fVar.U("field", str2);
        }
        if (str3 != null) {
            fVar.U("type", str3);
        }
        if (str4 != null) {
            fVar.U("object_type", str4);
        }
        return fVar;
    }

    @NotNull
    public static f E(@NotNull Iterable<?> iterable, @Nullable Class<?> cls, @Nullable Class<?> cls2, @Nullable String str) {
        f fVar = new f();
        fVar.Y("graphql");
        fVar.T("graphql.data_loader");
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        fVar.U(com.google.firebase.crashlytics.internal.metadata.p.f121327i, arrayList);
        if (cls != null) {
            fVar.U("key_type", cls.getName());
        }
        if (cls2 != null) {
            fVar.U("value_type", cls2.getName());
        }
        if (str != null) {
            fVar.U("name", str);
        }
        return fVar;
    }

    @NotNull
    public static f H(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        f fVar = new f();
        fVar.Y("graphql");
        if (str != null) {
            fVar.U("operation_name", str);
        }
        if (str2 != null) {
            fVar.U("operation_type", str2);
            fVar.T(str2);
        } else {
            fVar.T("graphql.operation");
        }
        if (str3 != null) {
            fVar.U("operation_id", str3);
        }
        return fVar;
    }

    @NotNull
    public static f I(@NotNull String str, @NotNull String str2) {
        f fVar = new f();
        io.sentry.util.r0.a aVarC = io.sentry.util.r0.c(str);
        fVar.Y("http");
        fVar.T("http");
        if (aVarC.e() != null) {
            fVar.U("url", aVarC.e());
        }
        fVar.U("method", str2.toUpperCase(Locale.ROOT));
        if (aVarC.d() != null) {
            fVar.U(q9.f306590c, aVarC.d());
        }
        if (aVarC.c() != null) {
            fVar.U(q9.f306591d, aVarC.c());
        }
        return fVar;
    }

    @NotNull
    public static f L(@NotNull String str, @NotNull String str2, @Nullable Integer num) {
        f fVarI = I(str, str2);
        if (num != null) {
            fVarI.U(io.sentry.protocol.n.b.f306414c, num);
            fVarI.V(N(num));
        }
        return fVarI;
    }

    @NotNull
    public static f M(@NotNull String str) {
        f fVar = new f();
        fVar.Y("info");
        fVar.W(str);
        fVar.V(y7.INFO);
        return fVar;
    }

    @Nullable
    private static y7 N(@NotNull Integer num) {
        if (io.sentry.util.o.e(num.intValue())) {
            return y7.WARNING;
        }
        if (io.sentry.util.o.f(num.intValue())) {
            return y7.ERROR;
        }
        return null;
    }

    @NotNull
    public static f O(@NotNull String str, @NotNull String str2) {
        f fVar = new f();
        fVar.T("navigation");
        fVar.Y("navigation");
        fVar.U("from", str);
        fVar.U("to", str2);
        return fVar;
    }

    @NotNull
    public static f R(@NotNull String str) {
        f fVar = new f();
        fVar.Y("query");
        fVar.W(str);
        return fVar;
    }

    @NotNull
    public static f Z(@NotNull String str) {
        f fVar = new f();
        fVar.Y("default");
        fVar.T("sentry.transaction");
        fVar.W(str);
        return fVar;
    }

    @NotNull
    public static f a0(@NotNull String str, @NotNull String str2) {
        f fVar = new f();
        fVar.Y("default");
        fVar.T("ui." + str);
        fVar.W(str2);
        return fVar;
    }

    @NotNull
    public static f c0(@NotNull String str, @NotNull String str2) {
        f fVar = new f();
        fVar.Y("user");
        fVar.T(str);
        fVar.W(str2);
        return fVar;
    }

    @NotNull
    public static f d0(@NotNull String str, @Nullable String str2, @Nullable String str3) {
        return f0(str, str2, str3, Collections.EMPTY_MAP);
    }

    @NotNull
    public static f e0(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Map<String, Object> map) {
        f fVar = new f();
        fVar.Y("user");
        fVar.T("ui." + str);
        if (str2 != null) {
            fVar.U("view.id", str2);
        }
        if (str3 != null) {
            fVar.U("view.class", str3);
        }
        if (str4 != null) {
            fVar.U("view.tag", str4);
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            fVar.s().put(entry.getKey(), entry.getValue());
        }
        fVar.V(y7.INFO);
        return fVar;
    }

    @NotNull
    public static f f0(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Map<String, Object> map) {
        return e0(str, str2, str3, null, map);
    }

    @NotNull
    public static f n(@NotNull String str) {
        f fVar = new f();
        fVar.Y("debug");
        fVar.W(str);
        fVar.V(y7.DEBUG);
        return fVar;
    }

    @NotNull
    public static f o(@NotNull String str) {
        f fVar = new f();
        fVar.Y("error");
        fVar.W(str);
        fVar.V(y7.ERROR);
        return fVar;
    }

    public static f p(@NotNull Map<String, Object> map, @NotNull n8 n8Var) {
        Date dateP4;
        Date dateD = p.d();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        y7 y7VarValueOf = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            key.getClass();
            switch (key) {
                case "origin":
                    if (!(value instanceof String)) {
                        str4 = null;
                        break;
                    } else {
                        str4 = (String) value;
                        break;
                    }
                    break;
                case "data":
                    Map map2 = value instanceof Map ? (Map) value : null;
                    if (map2 == null) {
                        break;
                    } else {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (!(entry2.getKey() instanceof String) || entry2.getValue() == null) {
                                n8Var.getLogger().c(y7.WARNING, "Invalid key or null value in data map.", new Object[0]);
                            } else {
                                concurrentHashMap.put((String) entry2.getKey(), entry2.getValue());
                            }
                        }
                        break;
                    }
                    break;
                case "type":
                    if (!(value instanceof String)) {
                        str2 = null;
                        break;
                    } else {
                        str2 = (String) value;
                        break;
                    }
                    break;
                case "category":
                    if (!(value instanceof String)) {
                        str3 = null;
                        break;
                    } else {
                        str3 = (String) value;
                        break;
                    }
                    break;
                case "timestamp":
                    if ((value instanceof String) && (dateP4 = y3.P4((String) value, n8Var.getLogger())) != null) {
                        dateD = dateP4;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "level":
                    String str5 = value instanceof String ? (String) value : null;
                    if (str5 == null) {
                        break;
                    } else {
                        try {
                            y7VarValueOf = y7.valueOf(str5.toUpperCase(Locale.ROOT));
                        } catch (Exception unused) {
                        }
                        break;
                    }
                    break;
                case "message":
                    if (!(value instanceof String)) {
                        str = null;
                        break;
                    } else {
                        str = (String) value;
                        break;
                    }
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                    }
                    concurrentHashMap2.put(entry.getKey(), entry.getValue());
                    break;
            }
        }
        f fVar = new f(dateD);
        fVar.f305405d = str;
        fVar.f305406e = str2;
        fVar.f305407f = concurrentHashMap;
        fVar.f305408g = str3;
        fVar.f305409h = str4;
        fVar.f305410i = y7VarValueOf;
        fVar.setUnknown(concurrentHashMap2);
        return fVar;
    }

    public void S(@Nullable String str) {
        if (str == null) {
            return;
        }
        this.f305407f.remove(str);
    }

    public void T(@Nullable String str) {
        this.f305408g = str;
    }

    public void U(@Nullable String str, @Nullable Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            S(str);
        } else {
            this.f305407f.put(str, obj);
        }
    }

    public void V(@Nullable y7 y7Var) {
        this.f305410i = y7Var;
    }

    public void W(@Nullable String str) {
        this.f305405d = str;
    }

    public void X(@Nullable String str) {
        this.f305409h = str;
    }

    public void Y(@Nullable String str) {
        this.f305406e = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (x().getTime() == fVar.x().getTime() && io.sentry.util.y.a(this.f305405d, fVar.f305405d) && io.sentry.util.y.a(this.f305406e, fVar.f305406e) && io.sentry.util.y.a(this.f305408g, fVar.f305408g) && io.sentry.util.y.a(this.f305409h, fVar.f305409h) && this.f305410i == fVar.f305410i) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.m2
    @Nullable
    public Map<String, Object> getUnknown() {
        return this.f305411j;
    }

    public int hashCode() {
        return io.sentry.util.y.b(this.f305403b, this.f305405d, this.f305406e, this.f305408g, this.f305409h, this.f305410i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NotNull f fVar) {
        return this.f305404c.compareTo(fVar.f305404c);
    }

    @Nullable
    public String q() {
        return this.f305408g;
    }

    @Nullable
    public Object r(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f305407f.get(str);
    }

    @lm.a.c
    @NotNull
    public Map<String, Object> s() {
        return this.f305407f;
    }

    @Override // io.sentry.k2
    public void serialize(@NotNull z3 z3Var, @NotNull ILogger iLogger) throws IOException {
        z3Var.m1();
        z3Var.f("timestamp").j(iLogger, x());
        if (this.f305405d != null) {
            z3Var.f("message").b(this.f305405d);
        }
        if (this.f305406e != null) {
            z3Var.f("type").b(this.f305406e);
        }
        z3Var.f("data").j(iLogger, this.f305407f);
        if (this.f305408g != null) {
            z3Var.f("category").b(this.f305408g);
        }
        if (this.f305409h != null) {
            z3Var.f("origin").b(this.f305409h);
        }
        if (this.f305410i != null) {
            z3Var.f("level").j(iLogger, this.f305410i);
        }
        Map<String, Object> map = this.f305411j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f305411j.get(str);
                z3Var.f(str);
                z3Var.j(iLogger, obj);
            }
        }
        z3Var.F1();
    }

    @Override // io.sentry.m2
    public void setUnknown(@Nullable Map<String, Object> map) {
        this.f305411j = map;
    }

    @Nullable
    public y7 t() {
        return this.f305410i;
    }

    @Nullable
    public String v() {
        return this.f305405d;
    }

    @Nullable
    public String w() {
        return this.f305409h;
    }

    @NotNull
    public Date x() {
        Date date = this.f305403b;
        if (date != null) {
            return (Date) date.clone();
        }
        Long l10 = this.f305402a;
        if (l10 == null) {
            throw new IllegalStateException("No timestamp set for breadcrumb");
        }
        Date dateE = p.e(l10.longValue());
        this.f305403b = dateE;
        return dateE;
    }

    @Nullable
    public String z() {
        return this.f305406e;
    }

    public f(long j10) {
        this.f305407f = new ConcurrentHashMap();
        this.f305404c = Long.valueOf(System.nanoTime());
        this.f305402a = Long.valueOf(j10);
        this.f305403b = null;
    }

    f(@NotNull f fVar) {
        this.f305407f = new ConcurrentHashMap();
        this.f305404c = Long.valueOf(System.nanoTime());
        this.f305403b = fVar.f305403b;
        this.f305402a = fVar.f305402a;
        this.f305405d = fVar.f305405d;
        this.f305406e = fVar.f305406e;
        this.f305408g = fVar.f305408g;
        this.f305409h = fVar.f305409h;
        Map<String, Object> mapF = io.sentry.util.d.f(fVar.f305407f);
        if (mapF != null) {
            this.f305407f = mapF;
        }
        this.f305411j = io.sentry.util.d.f(fVar.f305411j);
        this.f305410i = fVar.f305410i;
    }

    public f() {
        this(System.currentTimeMillis());
    }

    public f(@Nullable String str) {
        this();
        this.f305405d = str;
    }
}
