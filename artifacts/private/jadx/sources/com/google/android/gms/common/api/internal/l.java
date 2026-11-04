package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f106115a;

    public l(@NonNull Activity activity) {
        com.google.android.gms.common.internal.w.s(activity, "Activity must not be null");
        this.f106115a = activity;
    }

    @NonNull
    public final Activity a() {
        return (Activity) this.f106115a;
    }

    @NonNull
    public final androidx.fragment.app.s b() {
        return (androidx.fragment.app.s) this.f106115a;
    }

    public final boolean c() {
        return this.f106115a instanceof Activity;
    }

    public final boolean d() {
        return this.f106115a instanceof androidx.fragment.app.s;
    }

    @g6.a
    @Deprecated
    public l(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
