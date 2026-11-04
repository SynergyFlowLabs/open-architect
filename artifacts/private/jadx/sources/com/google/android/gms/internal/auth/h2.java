package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class h2 implements Serializable, g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final g2 f107645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    volatile transient boolean f107646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.a
    transient Object f107647c;

    h2(g2 g2Var) {
        this.f107645a = g2Var;
    }

    @Override // com.google.android.gms.internal.auth.g2
    public final Object a() {
        if (!this.f107646b) {
            synchronized (this) {
                try {
                    if (!this.f107646b) {
                        Object objA = this.f107645a.a();
                        this.f107647c = objA;
                        this.f107646b = true;
                        return objA;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f107647c;
    }

    public final String toString() {
        Object obj;
        if (this.f107646b) {
            obj = "<supplier that returned " + String.valueOf(this.f107647c) + ">";
        } else {
            obj = this.f107645a;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }
}
