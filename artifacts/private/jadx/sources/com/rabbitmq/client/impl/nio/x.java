package com.rabbitmq.client.impl.nio;

/* JADX INFO: loaded from: classes13.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final w f265630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f265631b;

    public x(w wVar, int i10) {
        this.f265630a = wVar;
        this.f265631b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f265630a.d().equals(((x) obj).f265630a.d());
        }
        return false;
    }

    public int hashCode() {
        return this.f265630a.d().hashCode();
    }
}
