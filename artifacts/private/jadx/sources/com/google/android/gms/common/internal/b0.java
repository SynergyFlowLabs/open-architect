package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f106503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f106504b;

    public b0(@NonNull Context context) {
        w.r(context);
        Resources resources = context.getResources();
        this.f106503a = resources;
        this.f106504b = resources.getResourcePackageName(com.google.android.gms.common.r.b.f106810a);
    }

    @androidx.annotation.p0
    @g6.a
    public String a(@NonNull String str) {
        int identifier = this.f106503a.getIdentifier(str, androidx.constraintlayout.core.motion.utils.v.b.f43988e, this.f106504b);
        if (identifier == 0) {
            return null;
        }
        return this.f106503a.getString(identifier);
    }
}
