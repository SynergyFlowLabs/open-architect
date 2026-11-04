package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.a.b;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class v<A extends com.google.android.gms.common.api.a.b, L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @g6.a
    public final u<A, L> f106230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final d0 f106231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Runnable f106232c;

    @g6.a
    public static class a<A extends com.google.android.gms.common.api.a.b, L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private w f106233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private w f106234b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o f106236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Feature[] f106237e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f106239g;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f106235c = new Runnable() { // from class: com.google.android.gms.common.api.internal.o2
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f106238f = true;

        private a() {
        }

        @NonNull
        @g6.a
        public v<A, L> a() {
            com.google.android.gms.common.internal.w.b(this.f106233a != null, "Must set register function");
            com.google.android.gms.common.internal.w.b(this.f106234b != null, "Must set unregister function");
            com.google.android.gms.common.internal.w.b(this.f106236d != null, "Must set holder");
            return new v<>(new p2(this, this.f106236d, this.f106237e, this.f106238f, this.f106239g), new q2(this, (o.a) com.google.android.gms.common.internal.w.s(this.f106236d.b(), "Key must not be null")), this.f106235c, null);
        }

        @NonNull
        @g6.a
        public a<A, L> b(@NonNull Runnable runnable) {
            this.f106235c = runnable;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, L> c(@NonNull w<A, com.google.android.gms.tasks.l<Void>> wVar) {
            this.f106233a = wVar;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, L> d(boolean z10) {
            this.f106238f = z10;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, L> e(@NonNull Feature... featureArr) {
            this.f106237e = featureArr;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, L> f(int i10) {
            this.f106239g = i10;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, L> g(@NonNull w<A, com.google.android.gms.tasks.l<Boolean>> wVar) {
            this.f106234b = wVar;
            return this;
        }

        @NonNull
        @g6.a
        public a<A, L> h(@NonNull o<L> oVar) {
            this.f106236d = oVar;
            return this;
        }

        /* synthetic */ a(r2 r2Var) {
        }
    }

    /* synthetic */ v(u uVar, d0 d0Var, Runnable runnable, r2 r2Var) {
        this.f106230a = uVar;
        this.f106231b = d0Var;
        this.f106232c = runnable;
    }

    @NonNull
    @g6.a
    public static <A extends com.google.android.gms.common.api.a.b, L> a<A, L> a() {
        return new a<>(null);
    }
}
