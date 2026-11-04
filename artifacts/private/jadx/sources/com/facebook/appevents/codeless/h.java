package com.facebook.appevents.codeless;

import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import oj.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f98809a = new h();

    public static final class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final f5.b f98810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f98811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final WeakReference<View> f98812c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private final View.OnTouchListener f98813d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f98814e;

        public a(@NotNull f5.b mapping, @NotNull View rootView, @NotNull View hostView) {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            this.f98810a = mapping;
            this.f98811b = new WeakReference<>(hostView);
            this.f98812c = new WeakReference<>(rootView);
            f5.g gVar = f5.g.f275010a;
            this.f98813d = f5.g.h(hostView);
            this.f98814e = true;
        }

        public final boolean a() {
            return this.f98814e;
        }

        public final void b(boolean z10) {
            this.f98814e = z10;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
            View view2 = this.f98812c.get();
            View view3 = this.f98811b.get();
            if (view2 != null && view3 != null && motionEvent.getAction() == 1) {
                b bVar = b.f98768a;
                b.d(this.f98810a, view2, view3);
            }
            View.OnTouchListener onTouchListener = this.f98813d;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    private h() {
    }

    @n
    @NotNull
    public static final a a(@NotNull f5.b mapping, @NotNull View rootView, @NotNull View hostView) {
        if (com.facebook.internal.instrument.crashshield.b.e(h.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            return new a(mapping, rootView, hostView);
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.b.c(th2, h.class);
            return null;
        }
    }
}
