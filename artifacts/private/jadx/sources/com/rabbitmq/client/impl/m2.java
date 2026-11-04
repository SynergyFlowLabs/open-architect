package com.rabbitmq.client.impl;

/* JADX INFO: loaded from: classes13.dex */
public class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f265544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f265545b;

    public m2(int i10, int i11) {
        this.f265544a = i10;
        this.f265545b = i11;
    }

    public static boolean b(m2 m2Var, m2 m2Var2) {
        return m2Var.a().equals(m2Var2.a());
    }

    public m2 a() {
        return (c() == 8 && d() == 0) ? new m2(0, 8) : this;
    }

    public int c() {
        return this.f265544a;
    }

    public int d() {
        return this.f265545b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m2) {
            m2 m2Var = (m2) obj;
            if (c() == m2Var.c() && d() == m2Var.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (c() * 31) + d();
    }

    public String toString() {
        return "" + c() + "-" + d();
    }
}
