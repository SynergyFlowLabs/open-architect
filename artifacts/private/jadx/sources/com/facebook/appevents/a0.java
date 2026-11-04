package com.facebook.appevents;

import androidx.annotation.b1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f98591a = new a0();

    public static final class a implements com.facebook.internal.b0.b {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i(boolean z10) {
            if (z10) {
                e5.b bVar = e5.b.f274656a;
                e5.b.b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(boolean z10) {
            if (z10) {
                j5.a aVar = j5.a.f307366a;
                j5.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(boolean z10) {
            if (z10) {
                i5.f fVar = i5.f.f287005a;
                i5.f.f();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(boolean z10) {
            if (z10) {
                g5.a aVar = g5.a.f275403a;
                g5.a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m(boolean z10) {
            if (z10) {
                com.facebook.appevents.iap.k kVar = com.facebook.appevents.iap.k.f98971a;
                com.facebook.appevents.iap.k.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(boolean z10) {
            if (z10) {
                com.facebook.appevents.cloudbridge.d dVar = com.facebook.appevents.cloudbridge.d.f98629a;
                com.facebook.appevents.cloudbridge.d.b();
            }
        }

        @Override // com.facebook.internal.b0.b
        public void a() {
        }

        @Override // com.facebook.internal.b0.b
        public void b(@Nullable com.facebook.internal.x xVar) {
            com.facebook.internal.t tVar = com.facebook.internal.t.f100072a;
            com.facebook.internal.t.a(com.facebook.internal.t.b.AAM, new com.facebook.internal.t.a() { // from class: com.facebook.appevents.u
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    a0.a.i(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.RestrictiveDataFiltering, new com.facebook.internal.t.a() { // from class: com.facebook.appevents.v
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    a0.a.j(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.PrivacyProtection, new com.facebook.internal.t.a() { // from class: com.facebook.appevents.w
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    a0.a.k(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.EventDeactivation, new com.facebook.internal.t.a() { // from class: com.facebook.appevents.x
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    a0.a.l(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.IapLogging, new com.facebook.internal.t.a() { // from class: com.facebook.appevents.y
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    a0.a.m(z10);
                }
            });
            com.facebook.internal.t.a(com.facebook.internal.t.b.CloudBridge, new com.facebook.internal.t.a() { // from class: com.facebook.appevents.z
                @Override // com.facebook.internal.t.a
                public final void a(boolean z10) {
                    a0.a.n(z10);
                }
            });
        }
    }

    private a0() {
    }

    @oj.n
    public static final void a() {
        if (com.facebook.internal.instrument.crashshield.b.e(a0.class)) {
            return;
        }
        try {
            com.facebook.internal.b0 b0Var = com.facebook.internal.b0.f99725a;
            com.facebook.internal.b0.d(new a());
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, a0.class);
        }
    }
}
