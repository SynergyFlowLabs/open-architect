package com.google.android.gms.common.moduleinstall;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f106748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private final com.google.android.gms.common.moduleinstall.a f106749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final Executor f106750c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f106751a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private com.google.android.gms.common.moduleinstall.a f106752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Executor f106753c;

        @NonNull
        public a a(@NonNull n nVar) {
            this.f106751a.add(nVar);
            return this;
        }

        @NonNull
        public d b() {
            return new d(this.f106751a, this.f106752b, this.f106753c, true, null);
        }

        @NonNull
        public a c(@NonNull com.google.android.gms.common.moduleinstall.a aVar) {
            return d(aVar, null);
        }

        @NonNull
        public a d(@NonNull com.google.android.gms.common.moduleinstall.a aVar, @p0 Executor executor) {
            this.f106752b = aVar;
            this.f106753c = executor;
            return this;
        }
    }

    /* synthetic */ d(List list, com.google.android.gms.common.moduleinstall.a aVar, Executor executor, boolean z10, h hVar) {
        w.s(list, "APIs must not be null.");
        w.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            w.s(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f106748a = list;
        this.f106749b = aVar;
        this.f106750c = executor;
    }

    @NonNull
    public static a d() {
        return new a();
    }

    @NonNull
    public List<n> a() {
        return this.f106748a;
    }

    @p0
    public com.google.android.gms.common.moduleinstall.a b() {
        return this.f106749b;
    }

    @p0
    public Executor c() {
        return this.f106750c;
    }
}
