package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f106984b = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private c f106985a = null;

    @NonNull
    @g6.a
    public static c a(@NonNull Context context) {
        return f106984b.b(context);
    }

    @NonNull
    @l1
    public final synchronized c b(@NonNull Context context) {
        try {
            if (this.f106985a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f106985a = new c(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f106985a;
    }
}
