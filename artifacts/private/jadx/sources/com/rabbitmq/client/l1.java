package com.rabbitmq.client;

import com.appsflyer.AppsFlyerProperties;

/* JADX INFO: loaded from: classes13.dex */
public class l1 extends RuntimeException implements com.rabbitmq.utility.d<l1> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f265959e = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f265960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f265961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o0 f265962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f265963d;

    public l1(boolean z10, boolean z11, o0 o0Var, Object obj) {
        this(z10, z11, o0Var, obj, "", null);
    }

    private static String a(boolean z10, boolean z11, o0 o0Var, String str, Throwable th2) {
        String str2 = z10 ? "connection" : AppsFlyerProperties.CHANNEL;
        String str3 = "clean " + str2 + " shutdown";
        String str4 = str2 + " error";
        if (!z11) {
            str3 = str4;
        }
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str3);
        if (o0Var != null) {
            sb2.append("; protocol method: ");
            sb2.append(o0Var);
        }
        if (th2 != null) {
            sb2.append("; cause: ");
            sb2.append(th2);
        }
        return sb2.toString();
    }

    public o0 b() {
        return this.f265962c;
    }

    public Object c() {
        return this.f265963d;
    }

    public boolean d() {
        return this.f265960a;
    }

    public boolean e() {
        return this.f265961b;
    }

    @Override // com.rabbitmq.utility.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public l1 Kk() {
        try {
            return (l1) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public l1(boolean z10, boolean z11, o0 o0Var, Object obj, String str, Throwable th2) {
        super(a(z10, z11, o0Var, str, th2));
        this.f265960a = z10;
        this.f265961b = z11;
        this.f265962c = o0Var;
        this.f265963d = obj;
    }
}
