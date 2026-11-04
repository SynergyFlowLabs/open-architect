package com.rabbitmq.tools.jsonrpc;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f266111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f266112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f266113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f266114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h[] f266115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f266116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f266117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Class<?> f266118h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Method f266119i;

    public i(Map<String, Object> map) {
        com.rabbitmq.tools.json.c.c(this, map);
        List list = (List) map.get("params");
        this.f266115e = new h[list.size()];
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            this.f266115e[i10] = new h((Map) it.next());
            i10++;
        }
    }

    private Class<?> b() {
        try {
            if ("int".equals(this.f266117g)) {
                return Integer.TYPE;
            }
            if ("double".equals(this.f266117g)) {
                return Double.TYPE;
            }
            if ("long".equals(this.f266117g)) {
                return Long.TYPE;
            }
            if ("boolean".equals(this.f266117g)) {
                return Boolean.TYPE;
            }
            if ("char".equals(this.f266117g)) {
                return Character.TYPE;
            }
            if (io.sentry.profilemeasurements.a.f306070m.equals(this.f266117g)) {
                return Byte.TYPE;
            }
            if ("short".equals(this.f266117g)) {
                return Short.TYPE;
            }
            if ("float".equals(this.f266117g)) {
                return Float.TYPE;
            }
            return "void".equals(this.f266117g) ? Void.TYPE : Class.forName(this.f266117g);
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException("Unable to load class: " + this.f266117g, e10);
        }
    }

    public int a() {
        h[] hVarArr = this.f266115e;
        if (hVarArr == null) {
            return 0;
        }
        return hVarArr.length;
    }

    public String c() {
        return this.f266113c;
    }

    public String d() {
        return this.f266117g;
    }

    public String e() {
        return this.f266111a;
    }

    public h[] f() {
        return this.f266115e;
    }

    public String g() {
        return this.f266116f;
    }

    public Class<?> h() {
        return this.f266118h;
    }

    public String i() {
        return this.f266112b;
    }

    public Method j() {
        return this.f266119i;
    }

    public h[] k() {
        return this.f266115e;
    }

    public boolean l() {
        return this.f266114d;
    }

    public void m(String str) {
        this.f266113c = str;
    }

    public void n(boolean z10) {
        this.f266114d = z10;
    }

    public void o(String str) {
        this.f266117g = str;
        this.f266118h = b();
    }

    public void p(String str) {
        this.f266111a = str;
    }

    public void q(String str) {
        this.f266116f = str;
    }

    public void r(String str) {
        this.f266112b = str;
    }

    public i(Method method) {
        this.f266119i = method;
        this.f266111a = method.getName();
        this.f266112b = "";
        this.f266113c = "";
        this.f266114d = false;
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.f266115e = new h[parameterTypes.length];
        for (int i10 = 0; i10 < parameterTypes.length; i10++) {
            this.f266115e[i10] = new h(i10, parameterTypes[i10]);
        }
        this.f266116f = h.c(method.getReturnType());
        this.f266117g = method.getReturnType().getName();
    }

    public i() {
    }
}
