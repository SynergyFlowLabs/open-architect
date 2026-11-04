package com.google.android.gms.auth;

import android.content.Intent;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class d extends UserRecoverableAuthException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f105700d;

    d(int i10, @p0 String str, @p0 Intent intent) {
        super(str, intent);
        this.f105700d = i10;
    }

    public int c() {
        return this.f105700d;
    }
}
