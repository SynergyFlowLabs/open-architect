package com.google.api.client.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map<Class<?>, k> f116088e = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<Class<?>, k> f116089f = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f116090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f116091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<String, r> f116092c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final List<String> f116093d;

    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (f0.a(str, str2)) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return str.compareTo(str2);
        }
    }

    private k(Class<?> cls, boolean z10) {
        this.f116090a = cls;
        this.f116091b = z10;
        h0.b((z10 && cls.isEnum()) ? false : true, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new a());
        for (Field field : cls.getDeclaredFields()) {
            r rVarL = r.l(field);
            if (rVarL != null) {
                String strF = rVarL.f();
                strF = z10 ? strF.toLowerCase(Locale.US).intern() : strF;
                r rVar = this.f116092c.get(strF);
                h0.c(rVar == null, "two fields have the same %sname <%s>: %s and %s", z10 ? "case-insensitive " : "", strF, field, rVar == null ? null : rVar.c());
                this.f116092c.put(strF, rVarL);
                treeSet.add(strF);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            k kVarI = i(superclass, z10);
            treeSet.addAll(kVarI.f116093d);
            for (Map.Entry<String, r> entry : kVarI.f116092c.entrySet()) {
                String key = entry.getKey();
                if (!this.f116092c.containsKey(key)) {
                    this.f116092c.put(key, entry.getValue());
                }
            }
        }
        this.f116093d = treeSet.isEmpty() ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public static k h(Class<?> cls) {
        return i(cls, false);
    }

    public static k i(Class<?> cls, boolean z10) {
        k kVar;
        if (cls == null) {
            return null;
        }
        Map<Class<?>, k> map = z10 ? f116089f : f116088e;
        synchronized (map) {
            try {
                kVar = map.get(cls);
                if (kVar == null) {
                    kVar = new k(cls, z10);
                    map.put(cls, kVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kVar;
    }

    public Field a(String str) {
        r rVarB = b(str);
        if (rVarB == null) {
            return null;
        }
        return rVarB.c();
    }

    public r b(String str) {
        if (str != null) {
            if (this.f116091b) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.f116092c.get(str);
    }

    public Collection<r> c() {
        return Collections.unmodifiableCollection(this.f116092c.values());
    }

    public final boolean d() {
        return this.f116091b;
    }

    public Collection<String> e() {
        return this.f116093d;
    }

    public Class<?> f() {
        return this.f116090a;
    }

    public boolean g() {
        return this.f116090a.isEnum();
    }
}
