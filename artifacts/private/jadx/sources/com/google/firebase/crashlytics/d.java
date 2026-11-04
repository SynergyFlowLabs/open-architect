package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import com.google.android.gms.measurement.AppMeasurement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z8.a<com.google.firebase.analytics.connector.a> f120930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.google.firebase.crashlytics.internal.analytics.a f120931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e8.b f120932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @b0("this")
    private final List<e8.a> f120933d;

    public d(z8.a<com.google.firebase.analytics.connector.a> aVar) {
        this(aVar, new e8.c(), new com.google.firebase.crashlytics.internal.analytics.f());
    }

    public static /* synthetic */ void a(d dVar, z8.b bVar) {
        dVar.getClass();
        com.google.firebase.crashlytics.internal.g.f().b("AnalyticsConnector now available.");
        com.google.firebase.analytics.connector.a aVar = (com.google.firebase.analytics.connector.a) bVar.get();
        com.google.firebase.crashlytics.internal.analytics.e eVar = new com.google.firebase.crashlytics.internal.analytics.e(aVar);
        f fVar = new f();
        if (g(aVar, fVar) == null) {
            com.google.firebase.crashlytics.internal.g.f().m("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        com.google.firebase.crashlytics.internal.g.f().b("Registered Firebase Analytics listener.");
        com.google.firebase.crashlytics.internal.analytics.d dVar2 = new com.google.firebase.crashlytics.internal.analytics.d();
        com.google.firebase.crashlytics.internal.analytics.c cVar = new com.google.firebase.crashlytics.internal.analytics.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (dVar) {
            try {
                Iterator<e8.a> it = dVar.f120933d.iterator();
                while (it.hasNext()) {
                    dVar2.a(it.next());
                }
                fVar.d(dVar2);
                fVar.e(cVar);
                dVar.f120932c = dVar2;
                dVar.f120931b = cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void c(d dVar, e8.a aVar) {
        synchronized (dVar) {
            try {
                if (dVar.f120932c instanceof e8.c) {
                    dVar.f120933d.add(aVar);
                }
                dVar.f120932c.a(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f() {
        this.f120930a.a(new z8.a.InterfaceC2541a() { // from class: com.google.firebase.crashlytics.c
            @Override // z8.a.InterfaceC2541a
            public final void a(z8.b bVar) {
                d.a(this.f120929a, bVar);
            }
        });
    }

    @c8.a
    private static com.google.firebase.analytics.connector.a.InterfaceC1123a g(@NonNull com.google.firebase.analytics.connector.a aVar, @NonNull f fVar) {
        com.google.firebase.analytics.connector.a.InterfaceC1123a interfaceC1123aE = aVar.e("clx", fVar);
        if (interfaceC1123aE != null) {
            return interfaceC1123aE;
        }
        com.google.firebase.crashlytics.internal.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        com.google.firebase.analytics.connector.a.InterfaceC1123a interfaceC1123aE2 = aVar.e(AppMeasurement.f109714b, fVar);
        if (interfaceC1123aE2 != null) {
            com.google.firebase.crashlytics.internal.g.f().m("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC1123aE2;
    }

    public com.google.firebase.crashlytics.internal.analytics.a d() {
        return new com.google.firebase.crashlytics.internal.analytics.a() { // from class: com.google.firebase.crashlytics.b
            @Override // com.google.firebase.crashlytics.internal.analytics.a
            public final void a(String str, Bundle bundle) {
                this.f120928a.f120931b.a(str, bundle);
            }
        };
    }

    public e8.b e() {
        return new e8.b() { // from class: com.google.firebase.crashlytics.a
            @Override // e8.b
            public final void a(e8.a aVar) {
                d.c(this.f120927a, aVar);
            }
        };
    }

    public d(z8.a<com.google.firebase.analytics.connector.a> aVar, @NonNull e8.b bVar, @NonNull com.google.firebase.crashlytics.internal.analytics.a aVar2) {
        this.f120930a = aVar;
        this.f120932c = bVar;
        this.f120933d = new ArrayList();
        this.f120931b = aVar2;
        f();
    }
}
