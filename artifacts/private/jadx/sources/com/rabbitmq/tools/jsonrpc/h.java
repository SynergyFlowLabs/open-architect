package com.rabbitmq.tools.jsonrpc;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f266109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f266110b;

    public h() {
    }

    public static String c(Class<?> cls) {
        if (cls == Void.class) {
            return "nil";
        }
        if (cls == Boolean.class) {
            return "bit";
        }
        if (cls == Integer.class || cls == Double.class) {
            return "num";
        }
        if (cls == String.class) {
            return "str";
        }
        if (cls.isArray()) {
            return "arr";
        }
        if (Map.class.isAssignableFrom(cls)) {
            return "obj";
        }
        return Collection.class.isAssignableFrom(cls) ? "arr" : org.apache.commons.codec.language.bm.c.f335307b;
    }

    public String a() {
        return this.f266109a;
    }

    public String b() {
        return this.f266110b;
    }

    public void d(String str) {
        this.f266109a = str;
    }

    public void e(String str) {
        this.f266110b = str;
    }

    public h(Map<String, Object> map) {
        com.rabbitmq.tools.json.c.c(this, map);
    }

    public h(int i10, Class<?> cls) {
        this.f266109a = "param" + i10;
        this.f266110b = c(cls);
    }
}
