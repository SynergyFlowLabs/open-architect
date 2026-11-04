package androidx.window.layout;

import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final WindowLayoutComponent f76382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f76383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @NotNull
    private final Map<Activity, a> f76384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
    @NotNull
    private final Map<androidx.core.util.e<x>, Activity> f76385d;

    @e.a({"NewApi"})
    private static final class a implements Consumer<WindowLayoutInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Activity f76386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final ReentrantLock f76387b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
        @Nullable
        private x f76388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.b0(io.sentry.protocol.z.b.f306551r)
        @NotNull
        private final Set<androidx.core.util.e<x>> f76389d;

        public a(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f76386a = activity;
            this.f76387b = new ReentrantLock();
            this.f76389d = new LinkedHashSet();
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NotNull WindowLayoutInfo value) {
            Intrinsics.checkNotNullParameter(value, "value");
            ReentrantLock reentrantLock = this.f76387b;
            reentrantLock.lock();
            try {
                this.f76388c = l.f76390a.b(this.f76386a, value);
                Iterator<T> it = this.f76389d.iterator();
                while (it.hasNext()) {
                    ((androidx.core.util.e) it.next()).accept(this.f76388c);
                }
                Unit unit = Unit.f312394a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(@NotNull androidx.core.util.e<x> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock = this.f76387b;
            reentrantLock.lock();
            try {
                x xVar = this.f76388c;
                if (xVar != null) {
                    listener.accept(xVar);
                }
                this.f76389d.add(listener);
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        public final boolean c() {
            return this.f76389d.isEmpty();
        }

        public final void d(@NotNull androidx.core.util.e<x> listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            ReentrantLock reentrantLock = this.f76387b;
            reentrantLock.lock();
            try {
                this.f76389d.remove(listener);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public k(@NotNull WindowLayoutComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.f76382a = component;
        this.f76383b = new ReentrantLock();
        this.f76384c = new LinkedHashMap();
        this.f76385d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.s
    public void a(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<x> callback) {
        Unit unit;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f76383b;
        reentrantLock.lock();
        try {
            a aVar = this.f76384c.get(activity);
            if (aVar == null) {
                unit = null;
            } else {
                aVar.b(callback);
                this.f76385d.put(callback, activity);
                unit = Unit.f312394a;
            }
            if (unit == null) {
                a aVar2 = new a(activity);
                this.f76384c.put(activity, aVar2);
                this.f76385d.put(callback, activity);
                aVar2.b(callback);
                this.f76382a.addWindowLayoutInfoListener(activity, aVar2);
            }
            Unit unit2 = Unit.f312394a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.s
    public void b(@NotNull androidx.core.util.e<x> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = this.f76383b;
        reentrantLock.lock();
        try {
            Activity activity = this.f76385d.get(callback);
            if (activity == null) {
                reentrantLock.unlock();
                return;
            }
            a aVar = this.f76384c.get(activity);
            if (aVar == null) {
                reentrantLock.unlock();
                return;
            }
            aVar.d(callback);
            if (aVar.c()) {
                this.f76382a.removeWindowLayoutInfoListener(aVar);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
