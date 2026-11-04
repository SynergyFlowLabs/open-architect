package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.b;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public abstract class b0<A extends com.google.android.gms.common.api.a.b, ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final Feature[] f105959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f105960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f105961c;

    @g6.a
    public static class a<A extends com.google.android.gms.common.api.a.b, ResultT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w f105962a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Feature[] f105964c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f105963b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f105965d = 0;

        private a() {
        }

        @NonNull
        @g6.a
        public b0<A, ResultT> a() {
            com.google.android.gms.common.internal.w.b(this.f105962a != null, "execute parameter required");
            return new z2(this, this.f105964c, this.f105963b, this.f105965d);
        }

        @NonNull
        @g6.a
        @Deprecated
        public a<A, ResultT> b(@NonNull final com.google.android.gms.common.util.d<A, com.google.android.gms.tasks.l<ResultT>> dVar) {
            this.f105962a = new w() { // from class: com.google.android.gms.common.api.internal.y2
                @Override // com.google.android.gms.common.api.internal.w
                public final void accept(Object obj, Object obj2) {
                    dVar.accept((com.google.android.gms.common.api.a.b) obj, (com.google.android.gms.tasks.l) obj2);
                }
            };
            return this;
        }

        @NonNull
        @g6.a
        public a<A, ResultT> c(@NonNull w<A, com.google.android.gms.tasks.l<ResultT>> wVar) {
            this.f105962a = wVar;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, ResultT> d(boolean z10) {
            this.f105963b = z10;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, ResultT> e(@NonNull Feature... featureArr) {
            this.f105964c = featureArr;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, ResultT> f(int i10) {
            this.f105965d = i10;
            return this;
        }

        /* synthetic */ a(a3 a3Var) {
        }
    }

    @g6.a
    @Deprecated
    public b0() {
        this.f105959a = null;
        this.f105960b = false;
        this.f105961c = 0;
    }

    @NonNull
    @g6.a
    public static <A extends com.google.android.gms.common.api.a.b, ResultT> a<A, ResultT> a() {
        return new a<>(null);
    }

    @g6.a
    protected abstract void b(@NonNull A a10, @NonNull com.google.android.gms.tasks.l<ResultT> lVar) throws RemoteException;

    @g6.a
    public boolean c() {
        return this.f105960b;
    }

    public final int d() {
        return this.f105961c;
    }

    @androidx.annotation.p0
    public final Feature[] e() {
        return this.f105959a;
    }

    @g6.a
    protected b0(@androidx.annotation.p0 Feature[] featureArr, boolean z10, int i10) {
        this.f105959a = featureArr;
        boolean z11 = false;
        if (featureArr != null && z10) {
            z11 = true;
        }
        this.f105960b = z11;
        this.f105961c = i10;
    }
}
