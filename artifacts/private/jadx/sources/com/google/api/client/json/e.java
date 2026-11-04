package com.google.api.client.json;

import com.google.api.client.util.h0;
import com.google.api.client.util.n;
import com.google.api.client.util.p;
import com.google.api.client.util.q0;
import com.google.api.client.util.r;
import com.google.api.client.util.s;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    private void f(boolean z10, Object obj) throws IOException {
        boolean z11;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (n.c(obj)) {
            k();
            return;
        }
        if (obj instanceof String) {
            u((String) obj);
            return;
        }
        boolean z12 = false;
        if (obj instanceof Number) {
            if (z10) {
                u(obj.toString());
                return;
            }
            if (obj instanceof BigDecimal) {
                q((BigDecimal) obj);
                return;
            }
            if (obj instanceof BigInteger) {
                r((BigInteger) obj);
                return;
            }
            if (obj instanceof Long) {
                o(((Long) obj).longValue());
                return;
            }
            if (obj instanceof Float) {
                float fFloatValue = ((Number) obj).floatValue();
                if (!Float.isInfinite(fFloatValue) && !Float.isNaN(fFloatValue)) {
                    z12 = true;
                }
                h0.a(z12);
                m(fFloatValue);
                return;
            }
            if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                double dDoubleValue = ((Number) obj).doubleValue();
                if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                    z12 = true;
                }
                h0.a(z12);
                l(dDoubleValue);
                return;
            }
            n(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            g(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof p) {
            u(((p) obj).f());
            return;
        }
        if (!(obj instanceof Iterable) && !cls.isArray()) {
            if (cls.isEnum()) {
                String strF = r.k((Enum) obj).f();
                if (strF == null) {
                    k();
                    return;
                } else {
                    u(strF);
                    return;
                }
            }
            t();
            boolean z13 = (obj instanceof Map) && !(obj instanceof s);
            com.google.api.client.util.k kVarH = z13 ? null : com.google.api.client.util.k.h(cls);
            for (Map.Entry<String, Object> entry : n.f(obj).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    String key = entry.getKey();
                    if (z13) {
                        z11 = z10;
                    } else {
                        Field fieldA = kVarH.a(key);
                        z11 = (fieldA == null || fieldA.getAnnotation(i.class) == null) ? false : true;
                    }
                    j(key);
                    f(z11, value);
                }
            }
            i();
            return;
        }
        s();
        Iterator it = q0.l(obj).iterator();
        while (it.hasNext()) {
            f(z10, it.next());
        }
        h();
    }

    public abstract void a() throws IOException;

    public void b() throws IOException {
    }

    public abstract void c() throws IOException;

    public abstract d d();

    public final void e(Object obj) throws IOException {
        f(false, obj);
    }

    public abstract void g(boolean z10) throws IOException;

    public abstract void h() throws IOException;

    public abstract void i() throws IOException;

    public abstract void j(String str) throws IOException;

    public abstract void k() throws IOException;

    public abstract void l(double d10) throws IOException;

    public abstract void m(float f10) throws IOException;

    public abstract void n(int i10) throws IOException;

    public abstract void o(long j10) throws IOException;

    public abstract void p(String str) throws IOException;

    public abstract void q(BigDecimal bigDecimal) throws IOException;

    public abstract void r(BigInteger bigInteger) throws IOException;

    public abstract void s() throws IOException;

    public abstract void t() throws IOException;

    public abstract void u(String str) throws IOException;
}
