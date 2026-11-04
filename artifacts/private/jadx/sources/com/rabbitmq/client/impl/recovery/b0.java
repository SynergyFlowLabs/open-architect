package com.rabbitmq.client.impl.recovery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.rabbitmq.client.impl.y f265684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.rabbitmq.client.impl.u0 f265685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.rabbitmq.client.c f265686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.rabbitmq.client.p0 f265687d;

    public b0(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.u0 u0Var, List<com.rabbitmq.client.b> list) {
        this(yVar, u0Var, new com.rabbitmq.client.j0(list), new com.rabbitmq.client.r0());
    }

    private String a() {
        Object obj;
        Map<String, Object> mapC = this.f265684a.c();
        if (mapC == null || (obj = mapC.get("connection_name")) == null) {
            return null;
        }
        return obj.toString();
    }

    private static List<com.rabbitmq.client.b> d(List<com.rabbitmq.client.b> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.shuffle(arrayList);
        return arrayList;
    }

    protected a0 b(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.t0 t0Var, com.rabbitmq.client.p0 p0Var) {
        return new a0(yVar, t0Var, p0Var);
    }

    public a0 c() throws TimeoutException, IOException {
        Iterator<com.rabbitmq.client.b> it = d(this.f265686c.a()).iterator();
        Throwable e10 = null;
        while (it.hasNext()) {
            try {
                a0 a0VarB = b(this.f265684a, this.f265685b.a(it.next(), a()), this.f265687d);
                a0VarB.start();
                this.f265687d.e(a0VarB);
                return a0VarB;
            } catch (IOException | TimeoutException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            if (e10 instanceof IOException) {
                throw ((IOException) e10);
            }
            if (e10 instanceof TimeoutException) {
                throw ((TimeoutException) e10);
            }
        }
        throw new IOException("failed to connect");
    }

    public b0(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.u0 u0Var, com.rabbitmq.client.c cVar) {
        this(yVar, u0Var, cVar, new com.rabbitmq.client.r0());
    }

    public b0(com.rabbitmq.client.impl.y yVar, com.rabbitmq.client.impl.u0 u0Var, com.rabbitmq.client.c cVar, com.rabbitmq.client.p0 p0Var) {
        this.f265684a = yVar;
        this.f265685b = u0Var;
        this.f265686c = cVar;
        this.f265687d = p0Var;
    }
}
