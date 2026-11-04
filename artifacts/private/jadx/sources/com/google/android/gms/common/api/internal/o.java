package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public final class o<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f106152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile Object f106153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private volatile a f106154c;

    @g6.a
    public static final class a<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f106155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f106156b;

        @g6.a
        a(L l10, String str) {
            this.f106155a = l10;
            this.f106156b = str;
        }

        @NonNull
        @g6.a
        public String a() {
            return this.f106156b + "@" + System.identityHashCode(this.f106155a);
        }

        @g6.a
        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f106155a == aVar.f106155a && this.f106156b.equals(aVar.f106156b);
        }

        @g6.a
        public int hashCode() {
            return (System.identityHashCode(this.f106155a) * 31) + this.f106156b.hashCode();
        }
    }

    @g6.a
    public interface b<L> {
        @g6.a
        void a(@NonNull L l10);

        @g6.a
        void b();
    }

    @g6.a
    o(@NonNull Looper looper, @NonNull L l10, @NonNull String str) {
        this.f106152a = new com.google.android.gms.common.util.concurrent.a(looper);
        this.f106153b = com.google.android.gms.common.internal.w.s(l10, "Listener must not be null");
        this.f106154c = new a(l10, com.google.android.gms.common.internal.w.l(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(@NonNull o oVar, @NonNull b bVar) {
        Object obj = oVar.f106153b;
        if (obj == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(obj);
        } catch (RuntimeException e10) {
            bVar.b();
            throw e10;
        }
    }

    @g6.a
    public void a() {
        this.f106153b = null;
        this.f106154c = null;
    }

    @androidx.annotation.p0
    @g6.a
    public a<L> b() {
        return this.f106154c;
    }

    @g6.a
    public boolean c() {
        return this.f106153b != null;
    }

    @g6.a
    public void d(@NonNull final b<? super L> bVar) {
        com.google.android.gms.common.internal.w.s(bVar, "Notifier must not be null");
        this.f106152a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.f2
            @Override // java.lang.Runnable
            public final void run() {
                o.e(this.f106022a, bVar);
            }
        });
    }

    @g6.a
    o(@NonNull Executor executor, @NonNull L l10, @NonNull String str) {
        this.f106152a = (Executor) com.google.android.gms.common.internal.w.s(executor, "Executor must not be null");
        this.f106153b = com.google.android.gms.common.internal.w.s(l10, "Listener must not be null");
        this.f106154c = new a(l10, com.google.android.gms.common.internal.w.l(str));
    }
}
