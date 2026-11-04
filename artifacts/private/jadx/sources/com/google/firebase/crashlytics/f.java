package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
class f implements com.google.firebase.analytics.connector.a.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f120938c = "_o";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f120939d = "name";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f120940e = "params";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f120941f = "clx";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.analytics.b f120942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.firebase.crashlytics.internal.analytics.b f120943b;

    f() {
    }

    private static void b(@p0 com.google.firebase.crashlytics.internal.analytics.b bVar, @NonNull String str, @NonNull Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.onEvent(str, bundle);
    }

    private void c(@NonNull String str, @NonNull Bundle bundle) {
        b(f120941f.equals(bundle.getString(f120938c)) ? this.f120942a : this.f120943b, str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.a.b
    public void a(int i10, @p0 Bundle bundle) {
        String string;
        com.google.firebase.crashlytics.internal.g.f().k(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(@p0 com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.f120943b = bVar;
    }

    public void e(@p0 com.google.firebase.crashlytics.internal.analytics.b bVar) {
        this.f120942a = bVar;
    }
}
