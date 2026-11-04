package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class v extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f106979a;

    public v(@NonNull String str, @NonNull Intent intent) {
        super(str);
        this.f106979a = intent;
    }

    @NonNull
    public Intent a() {
        return new Intent(this.f106979a);
    }
}
