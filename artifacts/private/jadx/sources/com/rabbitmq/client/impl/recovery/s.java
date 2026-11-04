package com.rabbitmq.client.impl.recovery;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public abstract class s extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f265769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f265770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f265771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Map<String, Object> f265772e;

    public s(c cVar) {
        super(cVar);
    }

    public s c(Map<String, Object> map) {
        this.f265772e = map;
        return this;
    }

    public s d(String str) {
        this.f265770c = str;
        return this;
    }

    public Map<String, Object> e() {
        return this.f265772e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r6.f265772e != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r4 = 1
            r1 = 0
            r4 = 7
            if (r6 == 0) goto L59
            r4 = 1
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            r4 = 1
            if (r2 == r3) goto L16
            goto L59
        L16:
            r4 = 6
            com.rabbitmq.client.impl.recovery.s r6 = (com.rabbitmq.client.impl.recovery.s) r6
            r4 = 3
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f265772e
            if (r2 == 0) goto L29
            java.util.Map<java.lang.String, java.lang.Object> r3 = r6.f265772e
            boolean r2 = r2.equals(r3)
            r4 = 5
            if (r2 != 0) goto L2f
            r4 = 7
            goto L2e
        L29:
            r4 = 7
            java.util.Map<java.lang.String, java.lang.Object> r2 = r6.f265772e
            if (r2 == 0) goto L2f
        L2e:
            return r1
        L2f:
            java.lang.String r2 = r5.f265770c
            r4 = 7
            java.lang.String r3 = r6.f265770c
            r4 = 2
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3c
            return r1
        L3c:
            java.lang.String r2 = r5.f265771d
            java.lang.String r3 = r6.f265771d
            boolean r2 = r2.equals(r3)
            r4 = 3
            if (r2 != 0) goto L49
            r4 = 7
            return r1
        L49:
            java.lang.String r5 = r5.f265769b
            r4 = 2
            java.lang.String r6 = r6.f265769b
            r4 = 1
            boolean r5 = r5.equals(r6)
            r4 = 3
            if (r5 != 0) goto L57
            return r1
        L57:
            r4 = 2
            return r0
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rabbitmq.client.impl.recovery.s.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f265770c;
    }

    public String g() {
        return this.f265771d;
    }

    public String h() {
        return this.f265769b;
    }

    public int hashCode() {
        int iHashCode = ((((this.f265769b.hashCode() * 31) + this.f265770c.hashCode()) * 31) + this.f265771d.hashCode()) * 31;
        Map<String, Object> map = this.f265772e;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public abstract void i() throws IOException;

    public s j(String str) {
        this.f265771d = str;
        return this;
    }

    public void k(String str) {
        this.f265770c = str;
    }

    public s l(String str) {
        this.f265769b = str;
        return this;
    }
}
