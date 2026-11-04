package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.l1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f76426d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private static volatile q f76427e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final String f76429g = "WindowServer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("globalLock")
    @l1
    @Nullable
    private j f76430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final CopyOnWriteArrayList<c> f76431b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76425c = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final ReentrantLock f76428f = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final q a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (q.f76427e == null) {
                ReentrantLock reentrantLock = q.f76428f;
                reentrantLock.lock();
                try {
                    if (q.f76427e == null) {
                        q.f76427e = new q(q.f76425c.b(context));
                    }
                    Unit unit = Unit.f312394a;
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            q qVar = q.f76427e;
            Intrinsics.checkNotNull(qVar);
            return qVar;
        }

        @Nullable
        public final j b(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            int i10 = 7 & 0;
            try {
                if (c(SidecarCompat.f76355f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.b()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        @l1
        public final boolean c(@Nullable androidx.window.core.i iVar) {
            return iVar != null && iVar.compareTo(androidx.window.core.i.f76281f.c()) >= 0;
        }

        @l1
        public final void d() {
            q.f76427e = null;
        }

        private a() {
        }
    }

    @l1
    public final class b implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q f76432a;

        public b(q this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f76432a = this$0;
        }

        @Override // androidx.window.layout.j.a
        @e.a({"SyntheticAccessor"})
        public void a(@NotNull Activity activity, @NotNull x newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            for (c cVar : this.f76432a.h()) {
                if (Intrinsics.areEqual(cVar.d(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Activity f76433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Executor f76434b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final androidx.core.util.e<x> f76435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private x f76436d;

        public c(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<x> callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(executor, "executor");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f76433a = activity;
            this.f76434b = executor;
            this.f76435c = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c this$0, x newLayoutInfo) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(newLayoutInfo, "$newLayoutInfo");
            this$0.f76435c.accept(newLayoutInfo);
        }

        public final void b(@NotNull final x newLayoutInfo) {
            Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
            this.f76436d = newLayoutInfo;
            this.f76434b.execute(new Runnable() { // from class: androidx.window.layout.r
                @Override // java.lang.Runnable
                public final void run() {
                    q.c.c(this.f76437a, newLayoutInfo);
                }
            });
        }

        @NotNull
        public final Activity d() {
            return this.f76433a;
        }

        @NotNull
        public final androidx.core.util.e<x> e() {
            return this.f76435c;
        }

        @Nullable
        public final x f() {
            return this.f76436d;
        }

        public final void g(@Nullable x xVar) {
            this.f76436d = xVar;
        }
    }

    @l1
    public q(@Nullable j jVar) {
        this.f76430a = jVar;
        j jVar2 = this.f76430a;
        if (jVar2 == null) {
            return;
        }
        jVar2.a(new b(this));
    }

    @androidx.annotation.b0("sLock")
    private final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f76431b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        j jVar = this.f76430a;
        if (jVar == null) {
            return;
        }
        jVar.d(activity);
    }

    @l1
    public static /* synthetic */ void i() {
    }

    private final boolean j(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f76431b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.window.layout.s
    public void a(@NotNull Activity activity, @NotNull Executor executor, @NotNull androidx.core.util.e<x> callback) {
        x xVarF;
        Object next;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ReentrantLock reentrantLock = f76428f;
        reentrantLock.lock();
        try {
            j jVarG = g();
            if (jVarG == null) {
                callback.accept(new x(CollectionsKt.emptyList()));
                reentrantLock.unlock();
                return;
            }
            boolean zJ = j(activity);
            c cVar = new c(activity, executor, callback);
            h().add(cVar);
            if (zJ) {
                Iterator<T> it = h().iterator();
                do {
                    xVarF = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(activity, ((c) next).d()));
                c cVar2 = (c) next;
                if (cVar2 != null) {
                    xVarF = cVar2.f();
                }
                if (xVarF != null) {
                    cVar.b(xVarF);
                }
            } else {
                jVarG.c(activity);
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // androidx.window.layout.s
    public void b(@NotNull androidx.core.util.e<x> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (f76428f) {
            try {
                if (g() == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c callbackWrapper : h()) {
                    if (callbackWrapper.e() == callback) {
                        Intrinsics.checkNotNullExpressionValue(callbackWrapper, "callbackWrapper");
                        arrayList.add(callbackWrapper);
                    }
                }
                h().removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f(((c) it.next()).d());
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final j g() {
        return this.f76430a;
    }

    @NotNull
    public final CopyOnWriteArrayList<c> h() {
        return this.f76431b;
    }

    public final void k(@Nullable j jVar) {
        this.f76430a = jVar;
    }
}
