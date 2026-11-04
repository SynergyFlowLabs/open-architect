package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.w0;
import io.sentry.android.replay.e0;
import io.sentry.android.replay.f;
import io.sentry.android.replay.util.i;
import io.sentry.m1;
import io.sentry.n8;
import io.sentry.y7;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nGestureRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureRecorder.kt\nio/sentry/android/replay/gestures/GestureRecorder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n1855#2,2:93\n*S KotlinDebug\n*F\n+ 1 GestureRecorder.kt\nio/sentry/android/replay/gestures/GestureRecorder\n*L\n36#1:93,2\n*E\n"})
public final class a implements f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f304903e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n8 f304904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f304905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList<WeakReference<View>> f304906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f304907d;

    /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    @w0(parameters = 0)
    public static final class C2216a extends i {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f304908d = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final n8 f304909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final c f304910c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2216a(@NotNull n8 options, @Nullable c cVar, @Nullable Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.f304909b = options;
            this.f304910c = cVar;
        }

        @Override // io.sentry.android.replay.util.i, android.view.Window.Callback
        public boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                Intrinsics.checkNotNullExpressionValue(motionEventObtainNoHistory, "obtainNoHistory(...)");
                try {
                    c cVar = this.f304910c;
                    if (cVar != null) {
                        cVar.a(motionEventObtainNoHistory);
                    }
                } catch (Throwable th2) {
                    try {
                        this.f304909b.getLogger().a(y7.ERROR, "Error dispatching touch event", th2);
                    } catch (Throwable th3) {
                        motionEventObtainNoHistory.recycle();
                        throw th3;
                    }
                }
                motionEventObtainNoHistory.recycle();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    static final class b extends l0 implements Function1<WeakReference<View>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f304911a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(1);
            this.f304911a = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference<View> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.get(), this.f304911a));
        }
    }

    public a(@NotNull n8 options, @NotNull c touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.f304904a = options;
        this.f304905b = touchRecorderCallback;
        this.f304906c = new ArrayList<>();
        this.f304907d = new io.sentry.util.a();
    }

    private final void b(View view) {
        Window windowA = e0.a(view);
        if (windowA == null) {
            this.f304904a.getLogger().c(y7.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C2216a) {
            return;
        }
        windowA.setCallback(new C2216a(this.f304904a, this.f304905b, callback));
    }

    private final void d(View view) {
        Window windowA = e0.a(view);
        if (windowA == null) {
            this.f304904a.getLogger().c(y7.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C2216a) {
            windowA.setCallback(((C2216a) callback).f305024a);
        }
    }

    @Override // io.sentry.android.replay.f
    public void a(@NotNull View root, boolean z10) throws Exception {
        Intrinsics.checkNotNullParameter(root, "root");
        m1 m1VarA = this.f304907d.a();
        try {
            if (z10) {
                this.f304906c.add(new WeakReference<>(root));
                b(root);
                Unit unit = Unit.f312394a;
            } else {
                d(root);
                CollectionsKt.removeAll((List) this.f304906c, (Function1) new b(root));
            }
            kotlin.jdk7.a.c(m1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }

    public final void c() throws Exception {
        m1 m1VarA = this.f304907d.a();
        try {
            Iterator<T> it = this.f304906c.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    Intrinsics.checkNotNull(view);
                    d(view);
                }
            }
            this.f304906c.clear();
            Unit unit = Unit.f312394a;
            kotlin.jdk7.a.c(m1VarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jdk7.a.c(m1VarA, th2);
                throw th3;
            }
        }
    }
}
