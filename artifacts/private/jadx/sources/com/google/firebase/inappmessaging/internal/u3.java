package com.google.firebase.inappmessaging.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class u3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f122961e = "test_device";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.google.common.annotations.e
    static final String f122962f = "fresh_install";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.google.common.annotations.e
    static final int f122963g = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s3 f122964a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f122967d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f122966c = d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f122965b = e();

    @ij.a
    public u3(s3 s3Var) {
        this.f122964a = s3Var;
    }

    private boolean d() {
        return this.f122964a.b(f122962f, true);
    }

    private boolean e() {
        return this.f122964a.b(f122961e, false);
    }

    private void f(boolean z10) {
        this.f122966c = z10;
        this.f122964a.g(f122962f, z10);
    }

    private void g(boolean z10) {
        this.f122965b = z10;
        this.f122964a.g(f122961e, z10);
    }

    private void h() {
        if (this.f122966c) {
            int i10 = this.f122967d + 1;
            this.f122967d = i10;
            if (i10 >= 5) {
                f(false);
            }
        }
    }

    public boolean a() {
        return this.f122966c;
    }

    public boolean b() {
        return this.f122965b;
    }

    public void c(com.google.internal.firebase.inappmessaging.v1.sdkserving.i iVar) {
        if (this.f122965b) {
            return;
        }
        h();
        Iterator<com.google.internal.firebase.inappmessaging.v1.a.f> it = iVar.hg().iterator();
        while (it.hasNext()) {
            if (it.next().Fh()) {
                g(true);
                p2.c("Setting this device as a test device");
                return;
            }
        }
    }
}
