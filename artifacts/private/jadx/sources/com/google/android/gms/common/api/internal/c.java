package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.a.d;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class c<O extends com.google.android.gms.common.api.a.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f105970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f105971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private final com.google.android.gms.common.api.a.d f105972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f105973d;

    private c(com.google.android.gms.common.api.a aVar, @androidx.annotation.p0 com.google.android.gms.common.api.a.d dVar, @androidx.annotation.p0 String str) {
        this.f105971b = aVar;
        this.f105972c = dVar;
        this.f105973d = str;
        this.f105970a = com.google.android.gms.common.internal.u.c(aVar, dVar, str);
    }

    @NonNull
    @g6.a
    public static <O extends com.google.android.gms.common.api.a.d> c<O> a(@NonNull com.google.android.gms.common.api.a<O> aVar, @androidx.annotation.p0 O o10, @androidx.annotation.p0 String str) {
        return new c<>(aVar, o10, str);
    }

    @NonNull
    public final String b() {
        return this.f105971b.d();
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return com.google.android.gms.common.internal.u.b(this.f105971b, cVar.f105971b) && com.google.android.gms.common.internal.u.b(this.f105972c, cVar.f105972c) && com.google.android.gms.common.internal.u.b(this.f105973d, cVar.f105973d);
    }

    public final int hashCode() {
        return this.f105970a;
    }
}
