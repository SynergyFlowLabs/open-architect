package com.rabbitmq.tools.jsonrpc;

import com.rabbitmq.client.e1;
import com.rabbitmq.client.f1;
import com.rabbitmq.client.k;
import com.rabbitmq.client.l1;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class c extends e1 implements InvocationHandler {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final org.slf4j.c f266090q = org.slf4j.e.k(c.class);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f266091o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f266092p;

    public c(f1 f1Var, e eVar) throws d, TimeoutException, IOException {
        super(f1Var);
        this.f266091o = eVar;
        H();
    }

    private Object D(e.b bVar) throws d {
        if (bVar.a() == null) {
            return bVar.c();
        }
        throw bVar.b();
    }

    @Deprecated
    public static Object E(String str, String str2) throws NumberFormatException {
        if ("bit".equals(str2)) {
            return Boolean.getBoolean(str) ? Boolean.TRUE : Boolean.FALSE;
        }
        if ("num".equals(str2)) {
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return Double.valueOf(str);
            }
        }
        if ("str".equals(str2)) {
            return str;
        }
        if ("arr".equals(str2) || "obj".equals(str2) || org.apache.commons.codec.language.bm.c.f335307b.equals(str2)) {
            return new com.rabbitmq.tools.json.a().i(str);
        }
        if ("nil".equals(str2)) {
            return null;
        }
        throw new IllegalArgumentException("Bad type: " + str2);
    }

    private void H() throws d, TimeoutException, IOException {
        this.f266092p = new j((Map<String, Object>) B("system.describe", null));
    }

    public Object B(String str, Object[] objArr) throws d, TimeoutException, IOException {
        HashMap map = new HashMap();
        map.put("id", null);
        map.put("method", str);
        map.put("version", j.f266120g);
        if (objArr == null) {
            objArr = new Object[0];
        }
        map.put("params", objArr);
        try {
            String strA = A(this.f266091o.c(map));
            org.slf4j.c cVar = f266090q;
            if (cVar.O()) {
                cVar.D("Reply string: {}", strA);
            }
            return D(this.f266091o.b(strA, ("system.describe".equals(str) && objArr.length == 0) ? Map.class : this.f266092p.e(str, objArr.length).h()));
        } catch (l1 e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Deprecated
    public Object C(String[] strArr) throws d, TimeoutException, NumberFormatException, IOException {
        if (strArr.length == 0) {
            throw new IllegalArgumentException("First string argument must be method name");
        }
        int i10 = 0;
        String str = strArr[0];
        int length = strArr.length - 1;
        h[] hVarArrF = this.f266092p.e(str, length).f();
        Object[] objArr = new Object[length];
        while (i10 < hVarArrF.length) {
            int i11 = i10 + 1;
            objArr[i10] = E(strArr[i11], hVarArrF[i10].b());
            i10 = i11;
        }
        return B(str, objArr);
    }

    public <T> T F(Class<T> cls) throws IllegalArgumentException {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
    }

    public j G() {
        return this.f266092p;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        return B(method.getName(), objArr);
    }

    public c(k kVar, String str, String str2, int i10, e eVar) throws d, TimeoutException, IOException {
        super(new f1().a(kVar).c(str).m(str2).o(i10));
        this.f266091o = eVar;
        H();
    }

    public c(k kVar, String str, String str2, int i10) throws d, TimeoutException, IOException {
        this(kVar, str, str2, i10, new a());
    }

    public c(k kVar, String str, String str2) throws d, TimeoutException, IOException {
        this(kVar, str, str2, -1);
    }
}
