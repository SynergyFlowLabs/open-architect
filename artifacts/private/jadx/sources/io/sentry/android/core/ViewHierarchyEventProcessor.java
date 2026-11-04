package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.o7;
import io.sentry.y7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@lm.a.c
public final class ViewHierarchyEventProcessor implements io.sentry.i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f304038c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f304039d = 2000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f304040e = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f304041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.android.core.internal.util.m f304042b = new io.sentry.android.core.internal.util.m(io.sentry.android.core.internal.util.f.b(), 2000, 3);

    public ViewHierarchyEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f304041a = (SentryAndroidOptions) io.sentry.util.y.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.q.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void e(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(j(view, list));
            countDownLatch.countDown();
        } catch (Throwable th2) {
            iLogger.a(y7.ERROR, "Failed to process view hierarchy.", th2);
        }
    }

    private static void f(@NotNull View view, @NotNull io.sentry.protocol.i0 i0Var, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        if (view instanceof ViewGroup) {
            Iterator<io.sentry.internal.viewhierarchy.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a(i0Var, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.i0 i0VarL = l(childAt);
                    arrayList.add(i0VarL);
                    f(childAt, i0VarL, list);
                }
            }
            i0Var.x(arrayList);
        }
    }

    @Nullable
    public static io.sentry.protocol.h0 g(@Nullable Activity activity, @NotNull ILogger iLogger) {
        int i10 = 3 & 0;
        return h(activity, new ArrayList(0), io.sentry.android.core.internal.util.h.h(), iLogger);
    }

    @Nullable
    public static io.sentry.protocol.h0 h(@Nullable Activity activity, @NotNull final List<io.sentry.internal.viewhierarchy.a> list, @NotNull io.sentry.util.thread.a aVar, @NotNull ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th2;
        if (activity == null) {
            iLogger.c(y7.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(y7.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(y7.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (!aVar.a()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference(null);
                iLogger2 = iLogger;
                try {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.u2
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewHierarchyEventProcessor.e(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2);
                        }
                    });
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return (io.sentry.protocol.h0) atomicReference.get();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    iLogger2.a(y7.ERROR, "Failed to process view hierarchy.", th2);
                }
                return null;
            }
            try {
                return j(viewPeekDecorView, list);
            } catch (Throwable th4) {
                th2 = th4;
                iLogger2 = iLogger;
            }
        } catch (Throwable th5) {
            th = th5;
            iLogger2 = iLogger;
        }
        th2 = th;
        iLogger2.a(y7.ERROR, "Failed to process view hierarchy.", th2);
        return null;
    }

    @NotNull
    public static io.sentry.protocol.h0 i(@NotNull View view) {
        boolean z10 = false | false;
        return j(view, new ArrayList(0));
    }

    @NotNull
    public static io.sentry.protocol.h0 j(@NotNull View view, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.h0 h0Var = new io.sentry.protocol.h0("android_view_system", arrayList);
        io.sentry.protocol.i0 i0VarL = l(view);
        arrayList.add(i0VarL);
        f(view, i0VarL, list);
        return h0Var;
    }

    public static byte[] k(@Nullable Activity activity, @NotNull io.sentry.util.thread.a aVar, @NotNull io.sentry.n1 n1Var, @NotNull ILogger iLogger) {
        io.sentry.protocol.h0 h0VarH = h(activity, new ArrayList(0), aVar, iLogger);
        if (h0VarH == null) {
            iLogger.c(y7.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            return null;
        }
        byte[] bArrB = io.sentry.util.r.b(n1Var, iLogger, h0VarH);
        if (bArrB == null) {
            iLogger.c(y7.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            return null;
        }
        if (bArrB.length >= 1) {
            return bArrB;
        }
        iLogger.c(y7.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
        return null;
    }

    @NotNull
    private static io.sentry.protocol.i0 l(@NotNull View view) {
        io.sentry.protocol.i0 i0Var = new io.sentry.protocol.i0();
        i0Var.C(io.sentry.android.core.internal.util.j.a(view));
        try {
            i0Var.z(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        i0Var.F(Double.valueOf(view.getX()));
        i0Var.G(Double.valueOf(view.getY()));
        i0Var.E(Double.valueOf(view.getWidth()));
        i0Var.y(Double.valueOf(view.getHeight()));
        i0Var.w(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            i0Var.D("visible");
        } else if (visibility == 4) {
            i0Var.D("invisible");
        } else if (visibility == 8) {
            i0Var.D("gone");
        }
        return i0Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public o7 c(@NotNull o7 o7Var, @NotNull io.sentry.n0 n0Var) {
        if (o7Var.I0()) {
            if (!this.f304041a.isAttachViewHierarchy()) {
                this.f304041a.getLogger().c(y7.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return o7Var;
            }
            if (!io.sentry.util.n.i(n0Var)) {
                boolean zA = this.f304042b.a();
                SentryAndroidOptions.b beforeViewHierarchyCaptureCallback = this.f304041a.getBeforeViewHierarchyCaptureCallback();
                if (beforeViewHierarchyCaptureCallback == null ? !zA : beforeViewHierarchyCaptureCallback.a(o7Var, n0Var, zA)) {
                    io.sentry.protocol.h0 h0VarH = h(b1.d().c(), this.f304041a.getViewHierarchyExporters(), this.f304041a.getThreadChecker(), this.f304041a.getLogger());
                    if (h0VarH != null) {
                        n0Var.s(io.sentry.b.d(h0VarH));
                    }
                }
            }
        }
        return o7Var;
    }

    @Override // io.sentry.i0
    @NotNull
    public io.sentry.protocol.c0 d(@NotNull io.sentry.protocol.c0 c0Var, @NotNull io.sentry.n0 n0Var) {
        return c0Var;
    }

    @Override // io.sentry.i0
    @Nullable
    public Long getOrder() {
        return 11000L;
    }
}
