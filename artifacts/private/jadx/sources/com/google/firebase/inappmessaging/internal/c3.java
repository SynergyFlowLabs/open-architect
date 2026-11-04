package com.google.firebase.inappmessaging.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class c3 implements com.google.firebase.analytics.connector.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f122597a;

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements com.google.firebase.analytics.connector.a.InterfaceC1123a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Object f122598c = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private Set<String> f122599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile Object f122600b;

        public static /* synthetic */ void d(b bVar, String str, com.google.firebase.analytics.connector.a.b bVar2, z8.b bVar3) {
            if (bVar.f122600b == f122598c) {
                return;
            }
            com.google.firebase.analytics.connector.a.InterfaceC1123a interfaceC1123aE = ((com.google.firebase.analytics.connector.a) bVar3.get()).e(str, bVar2);
            bVar.f122600b = interfaceC1123aE;
            synchronized (bVar) {
                try {
                    if (!bVar.f122599a.isEmpty()) {
                        interfaceC1123aE.c(bVar.f122599a);
                        bVar.f122599a = new HashSet();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC1123a
        public void a() {
            Object obj = this.f122600b;
            Object obj2 = f122598c;
            if (obj == obj2) {
                return;
            }
            if (obj != null) {
                ((com.google.firebase.analytics.connector.a.InterfaceC1123a) obj).a();
            }
            this.f122600b = obj2;
            synchronized (this) {
                this.f122599a.clear();
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC1123a
        public void b() {
            Object obj = this.f122600b;
            if (obj == f122598c) {
                return;
            }
            if (obj != null) {
                ((com.google.firebase.analytics.connector.a.InterfaceC1123a) obj).b();
                return;
            }
            synchronized (this) {
                try {
                    this.f122599a.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.firebase.analytics.connector.a.InterfaceC1123a
        public void c(@NonNull Set<String> set) {
            Object obj = this.f122600b;
            if (obj == f122598c) {
                return;
            }
            if (obj != null) {
                ((com.google.firebase.analytics.connector.a.InterfaceC1123a) obj).c(set);
                return;
            }
            synchronized (this) {
                try {
                    this.f122599a.addAll(set);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private b(final String str, final com.google.firebase.analytics.connector.a.b bVar, z8.a<com.google.firebase.analytics.connector.a> aVar) {
            this.f122599a = new HashSet();
            aVar.a(new z8.a.InterfaceC2541a() { // from class: com.google.firebase.inappmessaging.internal.d3
                @Override // z8.a.InterfaceC2541a
                public final void a(z8.b bVar2) {
                    c3.b.d(this.f122603a, str, bVar, bVar2);
                }
            });
        }
    }

    public c3(z8.a<com.google.firebase.analytics.connector.a> aVar) {
        this.f122597a = aVar;
        aVar.a(new z8.a.InterfaceC2541a() { // from class: com.google.firebase.inappmessaging.internal.b3
            @Override // z8.a.InterfaceC2541a
            public final void a(z8.b bVar) {
                c3.h(this.f122593a, bVar);
            }
        });
    }

    public static /* synthetic */ void h(c3 c3Var, z8.b bVar) {
        c3Var.getClass();
        c3Var.f122597a = bVar.get();
    }

    private com.google.firebase.analytics.connector.a i() {
        Object obj = this.f122597a;
        if (obj instanceof com.google.firebase.analytics.connector.a) {
            return (com.google.firebase.analytics.connector.a) obj;
        }
        return null;
    }

    @Override // com.google.firebase.analytics.connector.a
    public void a(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        com.google.firebase.analytics.connector.a aVarI = i();
        if (aVarI != null) {
            aVarI.a(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    public void b(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        com.google.firebase.analytics.connector.a aVarI = i();
        if (aVarI != null) {
            aVarI.b(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    public int c(@NonNull String str) {
        return 0;
    }

    @Override // com.google.firebase.analytics.connector.a
    public void clearConditionalUserProperty(@NonNull String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 Bundle bundle) {
    }

    @Override // com.google.firebase.analytics.connector.a
    @NonNull
    public List<com.google.firebase.analytics.connector.a.c> d(@NonNull String str, @androidx.annotation.p0 String str2) {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.firebase.analytics.connector.a
    @NonNull
    public com.google.firebase.analytics.connector.a.InterfaceC1123a e(@NonNull String str, @NonNull com.google.firebase.analytics.connector.a.b bVar) {
        Object obj = this.f122597a;
        return obj instanceof com.google.firebase.analytics.connector.a ? ((com.google.firebase.analytics.connector.a) obj).e(str, bVar) : new b(str, bVar, (z8.a) obj);
    }

    @Override // com.google.firebase.analytics.connector.a
    public void f(@NonNull com.google.firebase.analytics.connector.a.c cVar) {
    }

    @Override // com.google.firebase.analytics.connector.a
    @NonNull
    public Map<String, Object> g(boolean z10) {
        return Collections.EMPTY_MAP;
    }
}
