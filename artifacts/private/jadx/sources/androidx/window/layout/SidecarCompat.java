package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.l1;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SidecarCompat implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final a f76355f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f76356g = "SidecarCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final SidecarInterface f76357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f76358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<IBinder, Activity> f76359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<Activity, ComponentCallbacks> f76360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private j.a f76361e;

    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final p f76362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final SidecarInterface.SidecarCallback f76363b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f76364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
        @Nullable
        private SidecarDeviceState f76365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.b0("mLock")
        @NotNull
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> f76366e;

        public DistinctSidecarElementCallback(@NotNull p sidecarAdapter, @NotNull SidecarInterface.SidecarCallback callbackInterface) {
            Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.f76362a = sidecarAdapter;
            this.f76363b = callbackInterface;
            this.f76364c = new ReentrantLock();
            this.f76366e = new WeakHashMap<>();
        }

        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            ReentrantLock reentrantLock = this.f76364c;
            reentrantLock.lock();
            try {
                if (this.f76362a.a(this.f76365d, newDeviceState)) {
                    return;
                }
                this.f76365d = newDeviceState;
                this.f76363b.onDeviceStateChanged(newDeviceState);
                Unit unit = Unit.f312394a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public void onWindowLayoutChanged(@NotNull IBinder token, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            synchronized (this.f76364c) {
                try {
                    if (this.f76362a.d(this.f76366e.get(token), newLayout)) {
                        return;
                    }
                    this.f76366e.put(token, newLayout);
                    this.f76363b.onWindowLayoutChanged(token, newLayout);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SidecarCompat f76367a;

        public TranslatingCallback(SidecarCompat this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f76367a = this$0;
        }

        @e.a({"SyntheticAccessor"})
        public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
            SidecarInterface sidecarInterfaceH;
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            Collection<Activity> collectionValues = this.f76367a.f76359c.values();
            SidecarCompat sidecarCompat = this.f76367a;
            for (Activity activity : collectionValues) {
                IBinder iBinderA = SidecarCompat.f76355f.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (sidecarInterfaceH = sidecarCompat.h()) != null) {
                    windowLayoutInfo = sidecarInterfaceH.getWindowLayoutInfo(iBinderA);
                }
                j.a aVar = sidecarCompat.f76361e;
                if (aVar != null) {
                    aVar.a(activity, sidecarCompat.f76358b.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        @e.a({"SyntheticAccessor"})
        public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Activity activity = (Activity) this.f76367a.f76359c.get(windowToken);
            if (activity == null) {
                return;
            }
            p pVar = this.f76367a.f76358b;
            SidecarInterface sidecarInterfaceH = this.f76367a.h();
            SidecarDeviceState deviceState = sidecarInterfaceH == null ? null : sidecarInterfaceH.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            x xVarE = pVar.e(newLayout, deviceState);
            j.a aVar = this.f76367a.f76361e;
            if (aVar == null) {
                return;
            }
            aVar.a(activity, xVarE);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final IBinder a(@Nullable Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                return attributes.token;
            }
            return null;
        }

        @Nullable
        public final SidecarInterface b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @Nullable
        public final androidx.window.core.i c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                return androidx.window.core.i.f76281f.e(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        private a() {
        }
    }

    private static final class b implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final j.a f76368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f76369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.b0("mLock")
        @NotNull
        private final WeakHashMap<Activity, x> f76370c;

        public b(@NotNull j.a callbackInterface) {
            Intrinsics.checkNotNullParameter(callbackInterface, "callbackInterface");
            this.f76368a = callbackInterface;
            this.f76369b = new ReentrantLock();
            this.f76370c = new WeakHashMap<>();
        }

        @Override // androidx.window.layout.j.a
        public void a(@NotNull Activity activity, @NotNull x newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            ReentrantLock reentrantLock = this.f76369b;
            reentrantLock.lock();
            try {
                if (Intrinsics.areEqual(newLayout, this.f76370c.get(activity))) {
                    reentrantLock.unlock();
                    return;
                }
                this.f76370c.put(activity, newLayout);
                reentrantLock.unlock();
                this.f76368a.a(activity, newLayout);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    private static final class c implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final SidecarCompat f76371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final WeakReference<Activity> f76372b;

        public c(@NotNull SidecarCompat sidecarCompat, @NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f76371a = sidecarCompat;
            this.f76372b = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f76372b.get();
            IBinder iBinderA = SidecarCompat.f76355f.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f76371a.j(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    public static final class d implements ComponentCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f76374b;

        d(Activity activity) {
            this.f76374b = activity;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(@NotNull Configuration newConfig) {
            Intrinsics.checkNotNullParameter(newConfig, "newConfig");
            j.a aVar = SidecarCompat.this.f76361e;
            if (aVar == null) {
                return;
            }
            Activity activity = this.f76374b;
            aVar.a(activity, SidecarCompat.this.i(activity));
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }
    }

    @l1
    public SidecarCompat(@l1 @Nullable SidecarInterface sidecarInterface, @NotNull p sidecarAdapter) {
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.f76357a = sidecarInterface;
        this.f76358b = sidecarAdapter;
        this.f76359c = new LinkedHashMap();
        this.f76360d = new LinkedHashMap();
    }

    private final void k(Activity activity) {
        if (this.f76360d.get(activity) == null) {
            d dVar = new d(activity);
            this.f76360d.put(activity, dVar);
            activity.registerComponentCallbacks(dVar);
        }
    }

    private final void l(Activity activity) {
        activity.unregisterComponentCallbacks(this.f76360d.get(activity));
        this.f76360d.remove(activity);
    }

    @Override // androidx.window.layout.j
    public void a(@NotNull j.a extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.f76361e = new b(extensionCallback);
        SidecarInterface sidecarInterface = this.f76357a;
        if (sidecarInterface == null) {
            return;
        }
        sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.f76358b, new TranslatingCallback(this)));
    }

    @Override // androidx.window.layout.j
    @e.a({"BanUncheckedReflection"})
    public boolean b() {
        boolean z10;
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f76357a;
            Method method = (sidecarInterface == null || (cls = sidecarInterface.getClass()) == null) ? null : cls.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method == null ? null : method.getReturnType();
            Class cls5 = Void.TYPE;
            if (!Intrinsics.areEqual(returnType, cls5)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'setSidecarCallback': ", returnType));
            }
            SidecarInterface sidecarInterface2 = this.f76357a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f76357a;
            z10 = true;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f76357a;
            Method method2 = (sidecarInterface4 == null || (cls2 = sidecarInterface4.getClass()) == null) ? null : cls2.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 == null ? null : method2.getReturnType();
            if (!Intrinsics.areEqual(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'getWindowLayoutInfo': ", returnType2));
            }
            SidecarInterface sidecarInterface5 = this.f76357a;
            Method method3 = (sidecarInterface5 == null || (cls3 = sidecarInterface5.getClass()) == null) ? null : cls3.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 == null ? null : method3.getReturnType();
            if (!Intrinsics.areEqual(returnType3, cls5)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerAdded': ", returnType3));
            }
            SidecarInterface sidecarInterface6 = this.f76357a;
            Method method4 = (sidecarInterface6 == null || (cls4 = sidecarInterface6.getClass()) == null) ? null : cls4.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 == null ? null : method4.getReturnType();
            if (!Intrinsics.areEqual(returnType4, cls5)) {
                throw new NoSuchMethodException(Intrinsics.stringPlus("Illegal return type for 'onWindowLayoutChangeListenerRemoved': ", returnType4));
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (objInvoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (objInvoke2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
                if (!Intrinsics.areEqual(arrayList, (List) objInvoke2)) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
        } catch (Throwable unused3) {
            z10 = false;
        }
        return z10;
    }

    @Override // androidx.window.layout.j
    public void c(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder iBinderA = f76355f.a(activity);
        if (iBinderA != null) {
            j(iBinderA, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    @Override // androidx.window.layout.j
    public void d(@NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder iBinderA = f76355f.a(activity);
        if (iBinderA != null) {
            SidecarInterface sidecarInterface2 = this.f76357a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
            }
            l(activity);
            boolean z10 = this.f76359c.size() == 1;
            this.f76359c.remove(iBinderA);
            if (z10 && (sidecarInterface = this.f76357a) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    @Nullable
    public final SidecarInterface h() {
        return this.f76357a;
    }

    @l1
    @NotNull
    public final x i(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder iBinderA = f76355f.a(activity);
        if (iBinderA == null) {
            return new x(CollectionsKt.emptyList());
        }
        SidecarInterface sidecarInterface = this.f76357a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(iBinderA);
        p pVar = this.f76358b;
        SidecarInterface sidecarInterface2 = this.f76357a;
        SidecarDeviceState deviceState = sidecarInterface2 != null ? sidecarInterface2.getDeviceState() : null;
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        return pVar.e(windowLayoutInfo, deviceState);
    }

    public final void j(@NotNull IBinder windowToken, @NotNull Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f76359c.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.f76357a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.f76359c.size() == 1 && (sidecarInterface = this.f76357a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        j.a aVar = this.f76361e;
        if (aVar != null) {
            aVar.a(activity, i(activity));
        }
        k(activity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SidecarCompat(@NotNull Context context) {
        this(f76355f.b(context), new p(null, 1, null));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
