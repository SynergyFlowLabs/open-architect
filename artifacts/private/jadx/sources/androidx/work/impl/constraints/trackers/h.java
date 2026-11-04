package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.annotation.b1;
import androidx.work.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@b1({b1.a.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nConstraintTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 ConstraintTracker.kt\nandroidx/work/impl/constraints/trackers/ConstraintTracker\n*L\n96#1:125,2\n*E\n"})
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.work.impl.utils.taskexecutor.b f76799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Context f76800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f76801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet<androidx.work.impl.constraints.a<T>> f76802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private T f76803e;

    protected h(@NotNull Context context, @NotNull androidx.work.impl.utils.taskexecutor.b taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f76799a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f76800b = applicationContext;
        this.f76801c = new Object();
        this.f76802d = new LinkedHashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List listenersList, h this$0) {
        Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator<T> it = listenersList.iterator();
        while (it.hasNext()) {
            ((androidx.work.impl.constraints.a) it.next()).a(this$0.f76803e);
        }
    }

    public final void c(@NotNull androidx.work.impl.constraints.a<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f76801c) {
            try {
                if (this.f76802d.add(listener)) {
                    if (this.f76802d.size() == 1) {
                        this.f76803e = f();
                        v.e().a(i.f76804a, getClass().getSimpleName() + ": initial state = " + this.f76803e);
                        i();
                    }
                    listener.a(this.f76803e);
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    protected final Context d() {
        return this.f76800b;
    }

    public final T e() {
        T t10 = this.f76803e;
        return t10 == null ? f() : t10;
    }

    public abstract T f();

    public final void g(@NotNull androidx.work.impl.constraints.a<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f76801c) {
            try {
                if (this.f76802d.remove(listener) && this.f76802d.isEmpty()) {
                    j();
                }
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h(T t10) {
        synchronized (this.f76801c) {
            try {
                T t11 = this.f76803e;
                if (t11 == null || !Intrinsics.areEqual(t11, t10)) {
                    this.f76803e = t10;
                    final List list = CollectionsKt.toList(this.f76802d);
                    this.f76799a.c().execute(new Runnable() { // from class: androidx.work.impl.constraints.trackers.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.b(list, this);
                        }
                    });
                    Unit unit = Unit.f312394a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void i();

    public abstract void j();
}
