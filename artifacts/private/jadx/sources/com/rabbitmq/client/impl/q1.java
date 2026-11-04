package com.rabbitmq.client.impl;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes13.dex */
public class q1 extends r0 implements com.rabbitmq.client.g0 {
    @Override // com.rabbitmq.client.impl.r0, com.rabbitmq.client.g0
    public void a(com.rabbitmq.client.k kVar, Throwable th2) {
        i(kVar, th2, "ReturnListener.handleReturn");
    }

    @Override // com.rabbitmq.client.impl.r0, com.rabbitmq.client.g0
    public void d(com.rabbitmq.client.p pVar, Throwable th2) {
        j(pVar, th2, "BlockedListener");
    }

    @Override // com.rabbitmq.client.impl.r0, com.rabbitmq.client.g0
    public void f(com.rabbitmq.client.k kVar, Throwable th2) {
        i(kVar, th2, "ConfirmListener.handle{N,A}ck");
    }

    @Override // com.rabbitmq.client.impl.r0, com.rabbitmq.client.g0
    public void h(com.rabbitmq.client.k kVar, Throwable th2, com.rabbitmq.client.t tVar, String str, String str2) {
        m(kVar, th2, "Consumer " + tVar + " (" + str + ") method " + str2 + " for channel " + kVar, "Consumer (" + str + ") method " + str2 + " for channel " + kVar);
    }

    @Override // com.rabbitmq.client.impl.r0
    protected void i(com.rabbitmq.client.k kVar, Throwable th2, String str) {
        m(kVar, th2, str, str);
    }

    protected void m(com.rabbitmq.client.k kVar, Throwable th2, String str, String str2) {
        l(str + " threw an exception for channel " + kVar, th2);
        try {
            kVar.close(200, "Closed due to exception from " + str2);
        } catch (com.rabbitmq.client.d | TimeoutException unused) {
        } catch (IOException e10) {
            l("Failure during close of channel " + kVar + " after " + th2, e10);
            com.rabbitmq.client.p pVarC0 = kVar.C0();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Internal error closing channel for ");
            sb2.append(str2);
            pVarC0.r1(com.rabbitmq.client.a.f264854y, sb2.toString());
        }
    }
}
