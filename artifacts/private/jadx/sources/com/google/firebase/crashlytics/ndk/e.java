package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.g0;

/* JADX INFO: loaded from: classes5.dex */
class e implements com.google.firebase.crashlytics.internal.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static e f121950e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f121951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f121952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f121953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f121954d;

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        void a();
    }

    e(@NonNull c cVar, boolean z10) {
        this.f121951a = cVar;
        this.f121952b = z10;
    }

    public static /* synthetic */ void e(e eVar, String str, String str2, long j10, g0 g0Var) {
        eVar.getClass();
        com.google.firebase.crashlytics.internal.g.f().b("Initializing native session: " + str);
        if (eVar.f121951a.k(str, str2, j10, g0Var)) {
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().m("Failed to initialize Crashlytics NDK for session " + str);
    }

    static e f(@NonNull Context context, boolean z10) {
        e eVar = new e(new c(context, new JniNativeApi(context), new com.google.firebase.crashlytics.internal.persistence.g(context)), z10);
        f121950e = eVar;
        return eVar;
    }

    @NonNull
    public static e g() {
        e eVar = f121950e;
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("FirebaseCrashlyticsNdk component is not present.");
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public synchronized void a(@NonNull final String str, @NonNull final String str2, final long j10, @NonNull final g0 g0Var) throws Throwable {
        try {
            try {
                this.f121953c = str;
                a aVar = new a() { // from class: com.google.firebase.crashlytics.ndk.d
                    @Override // com.google.firebase.crashlytics.ndk.e.a
                    public final void a() {
                        e.e(this.f121945a, str, str2, j10, g0Var);
                    }
                };
                this.f121954d = aVar;
                if (this.f121952b) {
                    aVar.a();
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @NonNull
    public com.google.firebase.crashlytics.internal.h b(@NonNull String str) {
        return new j(this.f121951a.d(str));
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean c() {
        String str = this.f121953c;
        return str != null && d(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean d(@NonNull String str) {
        return this.f121951a.j(str);
    }

    public synchronized void h() {
        a aVar = this.f121954d;
        if (aVar != null) {
            aVar.a();
            return;
        }
        if (this.f121952b) {
            com.google.firebase.crashlytics.internal.g.f().m("Native signal handler already installed; skipping re-install.");
        } else {
            com.google.firebase.crashlytics.internal.g.f().b("Deferring signal handler installation until the FirebaseCrashlyticsNdk session has been prepared");
            this.f121952b = true;
        }
    }
}
