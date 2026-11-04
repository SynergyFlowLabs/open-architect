package com.google.firebase.perf.transport;

import androidx.annotation.NonNull;
import androidx.annotation.m1;
import com.google.android.datatransport.l;
import com.google.android.datatransport.m;
import com.google.firebase.perf.v1.s;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.firebase.perf.logging.a f124126d = com.google.firebase.perf.logging.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f124127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z8.b<m> f124128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l<s> f124129c;

    b(z8.b<m> bVar, String str) {
        this.f124127a = str;
        this.f124128b = bVar;
    }

    private boolean a() {
        if (this.f124129c == null) {
            m mVar = this.f124128b.get();
            if (mVar != null) {
                this.f124129c = mVar.b(this.f124127a, s.class, com.google.android.datatransport.e.b("proto"), new com.google.android.datatransport.k() { // from class: com.google.firebase.perf.transport.a
                    @Override // com.google.android.datatransport.k
                    public final Object apply(Object obj) {
                        return ((s) obj).H0();
                    }
                });
            } else {
                f124126d.l("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f124129c != null;
    }

    @m1
    public void b(@NonNull s sVar) {
        if (a()) {
            this.f124129c.b(com.google.android.datatransport.f.j(sVar));
        } else {
            f124126d.l("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
