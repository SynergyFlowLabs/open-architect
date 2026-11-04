package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class k<T extends IInterface> extends f<T> implements com.google.android.gms.common.api.a.f, s0 {

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @androidx.annotation.p0
    private static volatile Executor f106590u3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private final h f106591r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final Set f106592s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    @androidx.annotation.p0
    private final Account f106593t3;

    @androidx.annotation.l1
    @g6.a
    protected k(@NonNull Context context, @NonNull Handler handler, int i10, @NonNull h hVar) {
        super(context, handler, l.e(context), com.google.android.gms.common.f.x(), i10, null, null);
        this.f106591r3 = (h) w.r(hVar);
        this.f106593t3 = hVar.b();
        this.f106592s3 = u0(hVar.e());
    }

    private final Set u0(@NonNull Set set) {
        Set<Scope> setT0 = t0(set);
        Iterator<Scope> it = setT0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setT0;
    }

    public static void v0(@androidx.annotation.p0 Executor executor) {
        f106590u3 = executor;
    }

    @Override // com.google.android.gms.common.internal.f
    @androidx.annotation.p0
    public final Account B() {
        return this.f106593t3;
    }

    @Override // com.google.android.gms.common.internal.f
    @androidx.annotation.p0
    @g6.a
    protected Executor E() {
        return f106590u3;
    }

    @Override // com.google.android.gms.common.internal.f
    @NonNull
    @g6.a
    protected final Set<Scope> L() {
        return this.f106592s3;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    @g6.a
    public Set<Scope> j() {
        return h() ? this.f106592s3 : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    @g6.a
    public Feature[] r() {
        return new Feature[0];
    }

    @NonNull
    @g6.a
    protected final h s0() {
        return this.f106591r3;
    }

    @NonNull
    @g6.a
    protected Set<Scope> t0(@NonNull Set<Scope> set) {
        return set;
    }

    @g6.a
    protected k(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull h hVar) {
        this(context, looper, l.e(context), com.google.android.gms.common.f.x(), i10, hVar, null, null);
    }

    @g6.a
    @Deprecated
    protected k(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull h hVar, @NonNull com.google.android.gms.common.api.l.b bVar, @NonNull com.google.android.gms.common.api.l.c cVar) {
        this(context, looper, i10, hVar, (com.google.android.gms.common.api.internal.f) bVar, (com.google.android.gms.common.api.internal.r) cVar);
    }

    @g6.a
    protected k(@NonNull Context context, @NonNull Looper looper, int i10, @NonNull h hVar, @NonNull com.google.android.gms.common.api.internal.f fVar, @NonNull com.google.android.gms.common.api.internal.r rVar) {
        this(context, looper, l.e(context), com.google.android.gms.common.f.x(), i10, hVar, (com.google.android.gms.common.api.internal.f) w.r(fVar), (com.google.android.gms.common.api.internal.r) w.r(rVar));
    }

    @androidx.annotation.l1
    protected k(@NonNull Context context, @NonNull Looper looper, @NonNull l lVar, @NonNull com.google.android.gms.common.f fVar, int i10, @NonNull h hVar, @androidx.annotation.p0 com.google.android.gms.common.api.internal.f fVar2, @androidx.annotation.p0 com.google.android.gms.common.api.internal.r rVar) {
        super(context, looper, lVar, fVar, i10, fVar2 == null ? null : new q0(fVar2), rVar != null ? new r0(rVar) : null, hVar.m());
        this.f106591r3 = hVar;
        this.f106593t3 = hVar.b();
        this.f106592s3 = u0(hVar.e());
    }
}
