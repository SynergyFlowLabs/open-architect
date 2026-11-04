package com.rabbitmq.client.impl;

import java.io.IOException;
import java.net.ConnectException;

/* JADX INFO: loaded from: classes13.dex */
public class r0 implements com.rabbitmq.client.g0 {
    private static boolean k(Throwable th2) {
        if (th2 instanceof IOException) {
            return "Connection reset".equals(th2.getMessage()) || "Socket closed".equals(th2.getMessage()) || "Connection reset by peer".equals(th2.getMessage());
        }
        return false;
    }

    @Override // com.rabbitmq.client.g0
    public void a(com.rabbitmq.client.k kVar, Throwable th2) {
        i(kVar, th2, "ReturnListener.handleReturn");
    }

    @Override // com.rabbitmq.client.g0
    public void b(com.rabbitmq.client.p pVar, com.rabbitmq.client.k kVar, com.rabbitmq.client.f2 f2Var) {
        l("Caught an exception when recovering topology " + f2Var.getMessage(), f2Var);
    }

    @Override // com.rabbitmq.client.g0
    public void c(com.rabbitmq.client.p pVar, Throwable th2) {
        if (th2 instanceof ConnectException) {
            return;
        }
        l("Caught an exception during connection recovery!", th2);
    }

    @Override // com.rabbitmq.client.g0
    public void d(com.rabbitmq.client.p pVar, Throwable th2) {
        j(pVar, th2, "BlockedListener");
    }

    @Override // com.rabbitmq.client.g0
    public void e(com.rabbitmq.client.p pVar, Throwable th2) {
        l("An unexpected connection driver error occured", th2);
    }

    @Override // com.rabbitmq.client.g0
    public void f(com.rabbitmq.client.k kVar, Throwable th2) {
        i(kVar, th2, "ConfirmListener.handle{N,A}ck");
    }

    @Override // com.rabbitmq.client.g0
    public void g(com.rabbitmq.client.k kVar, Throwable th2) {
        l("Caught an exception when recovering channel " + kVar.V8(), th2);
    }

    @Override // com.rabbitmq.client.g0
    public void h(com.rabbitmq.client.k kVar, Throwable th2, com.rabbitmq.client.t tVar, String str, String str2) {
        i(kVar, th2, "Consumer " + tVar + " (" + str + ") method " + str2 + " for channel " + kVar);
    }

    protected void i(com.rabbitmq.client.k kVar, Throwable th2, String str) {
        l(str + "threw an exception for channel " + kVar, th2);
    }

    protected void j(com.rabbitmq.client.p pVar, Throwable th2, String str) {
        l(str + " threw an exception for connection " + pVar, th2);
        try {
            pVar.close(200, "Closed due to exception from " + str);
        } catch (com.rabbitmq.client.d unused) {
        } catch (IOException e10) {
            l("Failure during close of connection " + pVar + " after " + th2, e10);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Internal error closing connection for ");
            sb2.append(str);
            pVar.r1(com.rabbitmq.client.a.f264854y, sb2.toString());
        }
    }

    protected void l(String str, Throwable th2) {
        if (!k(th2)) {
            org.slf4j.e.k(r0.class).c(str, th2);
            return;
        }
        org.slf4j.e.k(r0.class).m0(str + " (Exception message: " + th2.getMessage() + ")");
    }
}
