package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Object f102539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f102540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f102541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected HashSet<String> f102542d;

    private b(Object obj) {
        this.f102539a = obj;
    }

    public static b f(com.fasterxml.jackson.core.h hVar) {
        return new b(hVar);
    }

    public static b g(JsonParser jsonParser) {
        return new b(jsonParser);
    }

    public b a() {
        return new b(this.f102539a);
    }

    public com.fasterxml.jackson.core.i b() {
        Object obj = this.f102539a;
        if (obj instanceof JsonParser) {
            return ((JsonParser) obj).d0();
        }
        return null;
    }

    public Object c() {
        return this.f102539a;
    }

    public boolean d(String str) throws com.fasterxml.jackson.core.j {
        String str2 = this.f102540b;
        if (str2 == null) {
            this.f102540b = str;
            return false;
        }
        if (str.equals(str2)) {
            return true;
        }
        String str3 = this.f102541c;
        if (str3 == null) {
            this.f102541c = str;
            return false;
        }
        if (str.equals(str3)) {
            return true;
        }
        if (this.f102542d == null) {
            HashSet<String> hashSet = new HashSet<>(16);
            this.f102542d = hashSet;
            hashSet.add(this.f102540b);
            this.f102542d.add(this.f102541c);
        }
        return !this.f102542d.add(str);
    }

    public void e() {
        this.f102540b = null;
        this.f102541c = null;
        this.f102542d = null;
    }
}
