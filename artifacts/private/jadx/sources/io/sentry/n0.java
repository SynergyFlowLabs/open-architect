package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class n0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final Map<String, Class<?>> f305890h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f305891a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<b> f305892b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f305893c = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private b f305894d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private b f305895e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private b f305896f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private p4 f305897g = null;

    static {
        HashMap map = new HashMap();
        f305890h = map;
        map.put("boolean", Boolean.class);
        map.put("char", Character.class);
        map.put(io.sentry.profilemeasurements.a.f306070m, Byte.class);
        map.put("short", Short.class);
        map.put("int", Integer.class);
        map.put("long", Long.class);
        map.put("float", Float.class);
        map.put("double", Double.class);
    }

    private boolean l(@Nullable Object obj, @NotNull Class<?> cls) {
        Class<?> cls2 = f305890h.get(cls.getCanonicalName());
        return obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj);
    }

    @NotNull
    public static n0 t(@Nullable b bVar) {
        n0 n0Var = new n0();
        n0Var.a(bVar);
        return n0Var;
    }

    @NotNull
    public static n0 u(@Nullable List<b> list) {
        n0 n0Var = new n0();
        n0Var.b(list);
        return n0Var;
    }

    public void a(@Nullable b bVar) {
        if (bVar != null) {
            this.f305892b.add(bVar);
        }
    }

    public void b(@Nullable List<b> list) {
        if (list != null) {
            this.f305892b.addAll(list);
        }
    }

    @lm.a.c
    public void c() {
        m1 m1VarA = this.f305893c.a();
        try {
            Iterator<Map.Entry<String, Object>> it = this.f305891a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                    it.remove();
                }
            }
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void d() {
        this.f305892b.clear();
    }

    @Nullable
    public Object e(@NotNull String str) {
        m1 m1VarA = this.f305893c.a();
        try {
            Object obj = this.f305891a.get(str);
            if (m1VarA != null) {
                m1VarA.close();
            }
            return obj;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Nullable
    public <T> T f(@NotNull String str, @NotNull Class<T> cls) {
        m1 m1VarA = this.f305893c.a();
        try {
            T t10 = (T) this.f305891a.get(str);
            if (cls.isInstance(t10)) {
                if (m1VarA != null) {
                    m1VarA.close();
                    return t10;
                }
            } else {
                if (!l(t10, cls)) {
                    if (m1VarA != null) {
                        m1VarA.close();
                    }
                    return null;
                }
                if (m1VarA != null) {
                    m1VarA.close();
                }
            }
            return t10;
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @NotNull
    public List<b> g() {
        return new ArrayList(this.f305892b);
    }

    @Nullable
    public p4 h() {
        return this.f305897g;
    }

    @Nullable
    public b i() {
        return this.f305894d;
    }

    @Nullable
    public b j() {
        return this.f305896f;
    }

    @Nullable
    public b k() {
        return this.f305895e;
    }

    public void m(@NotNull String str) {
        m1 m1VarA = this.f305893c.a();
        try {
            this.f305891a.remove(str);
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void n(@Nullable List<b> list) {
        d();
        b(list);
    }

    public void o(@NotNull String str, @Nullable Object obj) {
        m1 m1VarA = this.f305893c.a();
        try {
            this.f305891a.put(str, obj);
            if (m1VarA != null) {
                m1VarA.close();
            }
        } catch (Throwable th2) {
            if (m1VarA != null) {
                try {
                    m1VarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public void p(@Nullable p4 p4Var) {
        this.f305897g = p4Var;
    }

    public void q(@Nullable b bVar) {
        this.f305894d = bVar;
    }

    public void r(@Nullable b bVar) {
        this.f305896f = bVar;
    }

    public void s(@Nullable b bVar) {
        this.f305895e = bVar;
    }
}
