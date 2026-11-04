package com.rabbitmq.tools.jsonrpc;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f266120g = "1.1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f266121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f266122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f266123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f266124d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f266125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, i> f266126f;

    public j(Map<String, Object> map) {
        com.rabbitmq.tools.json.c.c(this, map);
    }

    private void a(i iVar) {
        this.f266126f.put(iVar.e() + "/" + iVar.a(), iVar);
    }

    public String b() {
        return this.f266125e;
    }

    public String c() {
        return this.f266122b;
    }

    public String d() {
        return this.f266121a;
    }

    public i e(String str, int i10) {
        i iVar = this.f266126f.get(str + "/" + i10);
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("Procedure not found: " + str + ", arity " + i10);
    }

    public Collection<i> f() {
        return this.f266126f.values();
    }

    public String g() {
        return this.f266124d;
    }

    public String h() {
        return this.f266123c;
    }

    public void i(String str) {
        this.f266125e = str;
    }

    public void j(String str) {
        this.f266122b = str;
    }

    public void k(String str) {
        this.f266121a = str;
    }

    public void l(Collection<Map<String, Object>> collection) {
        this.f266126f = new HashMap();
        Iterator<Map<String, Object>> it = collection.iterator();
        while (it.hasNext()) {
            a(new i(it.next()));
        }
    }

    public void m(String str) {
        this.f266124d = str;
    }

    public void n(String str) {
        this.f266123c = str;
    }

    public j(Class<?> cls) {
        this.f266126f = new HashMap();
        for (Method method : cls.getMethods()) {
            a(new i(method));
        }
    }

    public j() {
    }
}
