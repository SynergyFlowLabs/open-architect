package com.android.volley;

import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public class d extends a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Intent f89429c;

    public d() {
    }

    public Intent c() {
        return this.f89429c;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f89429c != null ? "User needs to (re)enter credentials." : super.getMessage();
    }

    public d(Intent intent) {
        this.f89429c = intent;
    }

    public d(o oVar) {
        super(oVar);
    }

    public d(String str) {
        super(str);
    }

    public d(String str, Exception exc) {
        super(str, exc);
    }
}
