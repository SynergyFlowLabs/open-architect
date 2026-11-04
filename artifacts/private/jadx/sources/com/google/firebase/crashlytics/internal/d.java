package com.google.firebase.crashlytics.internal;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.f0;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements com.google.firebase.crashlytics.internal.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f121237c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8.a<com.google.firebase.crashlytics.internal.a> f121238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<com.google.firebase.crashlytics.internal.a> f121239b = new AtomicReference<>(null);

    private static final class b implements h {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public f0.a b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File g() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.h
        public File h() {
            return null;
        }
    }

    public d(z8.a<com.google.firebase.crashlytics.internal.a> aVar) {
        this.f121238a = aVar;
        aVar.a(new z8.a.InterfaceC2541a() { // from class: com.google.firebase.crashlytics.internal.b
            @Override // z8.a.InterfaceC2541a
            public final void a(z8.b bVar) {
                d.f(this.f120960a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(d dVar, z8.b bVar) {
        dVar.getClass();
        g.f().b("Crashlytics native component now available.");
        dVar.f121239b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public void a(@NonNull final String str, @NonNull final String str2, final long j10, @NonNull final g0 g0Var) {
        g.f().k("Deferring native open session: " + str);
        this.f121238a.a(new z8.a.InterfaceC2541a() { // from class: com.google.firebase.crashlytics.internal.c
            @Override // z8.a.InterfaceC2541a
            public final void a(z8.b bVar) {
                ((a) bVar.get()).a(str, str2, j10, g0Var);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @NonNull
    public h b(@NonNull String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f121239b.get();
        return aVar == null ? f121237c : aVar.b(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean c() {
        com.google.firebase.crashlytics.internal.a aVar = this.f121239b.get();
        return aVar != null && aVar.c();
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean d(@NonNull String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f121239b.get();
        return aVar != null && aVar.d(str);
    }
}
