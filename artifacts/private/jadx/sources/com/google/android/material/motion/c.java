package com.google.android.material.motion;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final d f112976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final com.google.android.material.motion.b f112977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    private final View f112978c;

    @w0(33)
    private static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private OnBackInvokedCallback f112979a;

        private b() {
        }

        @Override // com.google.android.material.motion.c.d
        @u
        public void a(@NonNull View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (onBackInvokedDispatcherFindOnBackInvokedDispatcher == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f112979a);
            this.f112979a = null;
        }

        @Override // com.google.android.material.motion.c.d
        @u
        public void b(@NonNull com.google.android.material.motion.b bVar, @NonNull View view, boolean z10) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.f112979a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackC = c(bVar);
                this.f112979a = onBackInvokedCallbackC;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z10 ? 1000000 : 0, onBackInvokedCallbackC);
            }
        }

        OnBackInvokedCallback c(@NonNull final com.google.android.material.motion.b bVar) {
            Objects.requireNonNull(bVar);
            return new OnBackInvokedCallback() { // from class: com.google.android.material.motion.e
                public final void onBackInvoked() {
                    bVar.d();
                }
            };
        }

        boolean d() {
            return this.f112979a != null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.motion.c$c, reason: collision with other inner class name */
    @w0(34)
    private static class C0989c extends b {

        /* JADX INFO: renamed from: com.google.android.material.motion.c$c$a */
        class a implements OnBackAnimationCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.google.android.material.motion.b f112980a;

            a(com.google.android.material.motion.b bVar) {
                this.f112980a = bVar;
            }

            public void onBackCancelled() {
                if (C0989c.this.d()) {
                    this.f112980a.f();
                }
            }

            public void onBackInvoked() {
                this.f112980a.d();
            }

            public void onBackProgressed(@NonNull BackEvent backEvent) {
                if (C0989c.this.d()) {
                    this.f112980a.c(new androidx.activity.d(backEvent));
                }
            }

            public void onBackStarted(@NonNull BackEvent backEvent) {
                if (C0989c.this.d()) {
                    this.f112980a.b(new androidx.activity.d(backEvent));
                }
            }
        }

        private C0989c() {
            super();
        }

        @Override // com.google.android.material.motion.c.b
        OnBackInvokedCallback c(@NonNull com.google.android.material.motion.b bVar) {
            return new a(bVar);
        }
    }

    private interface d {
        void a(@NonNull View view);

        void b(@NonNull com.google.android.material.motion.b bVar, @NonNull View view, boolean z10);
    }

    public <T extends View & com.google.android.material.motion.b> c(@NonNull T t10) {
        this(t10, t10);
    }

    @p0
    private static d a() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return new C0989c();
        }
        if (i10 >= 33) {
            return new b();
        }
        return null;
    }

    private void d(boolean z10) {
        d dVar = this.f112976a;
        if (dVar != null) {
            dVar.b(this.f112977b, this.f112978c, z10);
        }
    }

    public boolean b() {
        return this.f112976a != null;
    }

    public void c() {
        d(false);
    }

    public void e() {
        d(true);
    }

    public void f() {
        d dVar = this.f112976a;
        if (dVar != null) {
            dVar.a(this.f112978c);
        }
    }

    public c(@NonNull com.google.android.material.motion.b bVar, @NonNull View view) {
        this.f112976a = a();
        this.f112977b = bVar;
        this.f112978c = view;
    }
}
