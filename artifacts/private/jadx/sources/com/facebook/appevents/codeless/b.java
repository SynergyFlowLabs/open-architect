package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import androidx.annotation.b1;
import com.facebook.appevents.p;
import com.facebook.appevents.q;
import com.facebook.g0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f98768a = new b();

    public static final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private f5.b f98769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private WeakReference<View> f98770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private WeakReference<View> f98771c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private View.OnClickListener f98772d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f98773e;

        public a(@NotNull f5.b mapping, @NotNull View rootView, @NotNull View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f98769a = mapping;
            this.f98770b = new WeakReference<>(hostView);
            this.f98771c = new WeakReference<>(rootView);
            f5.g gVar = f5.g.f275010a;
            this.f98772d = f5.g.g(hostView);
            this.f98773e = true;
        }

        public final boolean a() {
            return this.f98773e;
        }

        public final void b(boolean z10) {
            this.f98773e = z10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                return;
            }
            try {
                if (com.facebook.internal.instrument.crashshield.b.e(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(view, "view");
                    View.OnClickListener onClickListener = this.f98772d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = this.f98771c.get();
                    View view3 = this.f98770b.get();
                    if (view2 == null || view3 == null) {
                        return;
                    }
                    b bVar = b.f98768a;
                    b.d(this.f98769a, view2, view3);
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.b.c(th2, this);
                }
            } catch (Throwable th3) {
                com.facebook.internal.instrument.crashshield.b.c(th3, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.b$b, reason: collision with other inner class name */
    public static final class C0901b implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private f5.b f98774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private WeakReference<AdapterView<?>> f98775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private WeakReference<View> f98776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private AdapterView.OnItemClickListener f98777d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f98778e;

        public C0901b(@NotNull f5.b mapping, @NotNull View rootView, @NotNull AdapterView<?> hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f98774a = mapping;
            this.f98775b = new WeakReference<>(hostView);
            this.f98776c = new WeakReference<>(rootView);
            this.f98777d = hostView.getOnItemClickListener();
            this.f98778e = true;
        }

        public final boolean a() {
            return this.f98778e;
        }

        public final void b(boolean z10) {
            this.f98778e = z10;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(@Nullable AdapterView<?> adapterView, @NotNull View view, int i10, long j10) {
            Intrinsics.checkNotNullParameter(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.f98777d;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i10, j10);
            }
            View view2 = this.f98776c.get();
            AdapterView<?> adapterView2 = this.f98775b.get();
            if (view2 == null || adapterView2 == null) {
                return;
            }
            b bVar = b.f98768a;
            b.d(this.f98774a, view2, adapterView2);
        }
    }

    private b() {
    }

    @n
    @NotNull
    public static final a b(@NotNull f5.b mapping, @NotNull View rootView, @NotNull View hostView) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            return null;
        }
    }

    @n
    @NotNull
    public static final C0901b c(@NotNull f5.b mapping, @NotNull View rootView, @NotNull AdapterView<?> hostView) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new C0901b(mapping, rootView, hostView);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
            return null;
        }
    }

    @n
    public static final void d(@NotNull f5.b mapping, @NotNull View rootView, @NotNull View hostView) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            final String strD = mapping.d();
            final Bundle bundleB = g.f98791f.b(mapping, rootView, hostView);
            f98768a.f(bundleB);
            g0 g0Var = g0.f99617a;
            g0.y().execute(new Runnable() { // from class: com.facebook.appevents.codeless.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.e(strD, bundleB);
                }
            });
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(String eventName, Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.b.e(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(eventName, "$eventName");
            Intrinsics.checkNotNullParameter(parameters, "$parameters");
            g0 g0Var = g0.f99617a;
            q.f99234b.k(g0.n()).q(eventName, parameters);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, b.class);
        }
    }

    public final void f(@NotNull Bundle parameters) {
        if (com.facebook.internal.instrument.crashshield.b.e(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString(p.f99195g0);
            if (string != null) {
                com.facebook.appevents.internal.g gVar = com.facebook.appevents.internal.g.f99011a;
                parameters.putDouble(p.f99195g0, com.facebook.appevents.internal.g.h(string));
            }
            parameters.putString(f5.a.f274941c, "1");
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, this);
        }
    }
}
