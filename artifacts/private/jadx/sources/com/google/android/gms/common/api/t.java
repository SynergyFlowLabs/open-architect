package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t<R extends v> extends x<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f106333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106334b;

    protected t(@NonNull Activity activity, int i10) {
        com.google.android.gms.common.internal.w.s(activity, "Activity must not be null");
        this.f106333a = activity;
        this.f106334b = i10;
    }

    @Override // com.google.android.gms.common.api.x
    @g6.a
    public final void b(@NonNull Status status) {
        if (!status.f2()) {
            d(status);
            return;
        }
        try {
            status.s2(this.f106333a, this.f106334b);
        } catch (IntentSender.SendIntentException unused) {
            d(new Status(8));
        }
    }

    @Override // com.google.android.gms.common.api.x
    public abstract void c(@NonNull R r10);

    public abstract void d(@NonNull Status status);
}
