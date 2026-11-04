package com.rabbitmq.client.impl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class m1 implements com.rabbitmq.client.k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f265541a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.rabbitmq.client.j1> f265542b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.rabbitmq.client.l1 f265543c = null;

    public boolean d(com.rabbitmq.client.l1 l1Var) {
        synchronized (this.f265541a) {
            try {
                if (!isOpen()) {
                    return false;
                }
                this.f265543c = l1Var;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.rabbitmq.client.k1
    public com.rabbitmq.client.l1 g() {
        com.rabbitmq.client.l1 l1Var;
        synchronized (this.f265541a) {
            try {
                l1Var = this.f265543c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l1Var;
    }

    @Override // com.rabbitmq.client.k1
    public void h(com.rabbitmq.client.j1 j1Var) {
        com.rabbitmq.client.l1 l1Var;
        synchronized (this.f265541a) {
            try {
                l1Var = this.f265543c;
                this.f265542b.add(j1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l1Var != null) {
            j1Var.a(l1Var);
        }
    }

    @Override // com.rabbitmq.client.k1
    public boolean isOpen() {
        boolean z10;
        synchronized (this.f265541a) {
            try {
                z10 = this.f265543c == null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.rabbitmq.client.k1
    public void j(com.rabbitmq.client.j1 j1Var) {
        synchronized (this.f265541a) {
            try {
                this.f265542b.remove(j1Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.rabbitmq.client.k1
    public void l() {
        com.rabbitmq.client.j1[] j1VarArr;
        com.rabbitmq.client.l1 l1Var;
        synchronized (this.f265541a) {
            try {
                List<com.rabbitmq.client.j1> list = this.f265542b;
                j1VarArr = (com.rabbitmq.client.j1[]) list.toArray(new com.rabbitmq.client.j1[list.size()]);
                l1Var = this.f265543c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (com.rabbitmq.client.j1 j1Var : j1VarArr) {
            try {
                j1Var.a(l1Var);
            } catch (Exception unused) {
            }
        }
    }
}
