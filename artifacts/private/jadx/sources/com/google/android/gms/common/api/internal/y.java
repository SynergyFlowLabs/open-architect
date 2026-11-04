package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class y extends k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @g6.a
    private final e.b<Status> f106267a;

    @g6.a
    public y(@NonNull e.b<Status> bVar) {
        this.f106267a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    @g6.a
    public void s6(@NonNull Status status) {
        this.f106267a.a(status);
    }
}
