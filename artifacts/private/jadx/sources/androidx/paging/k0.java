package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nInvalidateCallbackTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,90:1\n54#2,6:91\n54#2,6:97\n54#2,6:103\n1855#3,2:109\n*S KotlinDebug\n*F\n+ 1 InvalidateCallbackTracker.kt\nandroidx/paging/InvalidateCallbackTracker\n*L\n54#1:91,6\n69#1:97,6\n77#1:103,6\n86#1:109,2\n*E\n"})
public final class k0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<T, Unit> f72306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Function0<Boolean> f72307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f72308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<T> f72309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f72310e;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(@NotNull Function1<? super T, Unit> callbackInvoker, @Nullable Function0<Boolean> function0) {
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        this.f72306a = callbackInvoker;
        this.f72307b = function0;
        this.f72308c = new ReentrantLock();
        this.f72309d = new ArrayList();
    }

    @androidx.annotation.l1
    public final int a() {
        return this.f72309d.size();
    }

    public final boolean b() {
        return this.f72310e;
    }

    public final boolean c() {
        if (this.f72310e) {
            return false;
        }
        ReentrantLock reentrantLock = this.f72308c;
        try {
            reentrantLock.lock();
            if (this.f72310e) {
                reentrantLock.unlock();
                return false;
            }
            this.f72310e = true;
            List list = CollectionsKt.toList(this.f72309d);
            this.f72309d.clear();
            reentrantLock.unlock();
            Function1<T, Unit> function1 = this.f72306a;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(T t10) {
        Function0<Boolean> function0 = this.f72307b;
        boolean z10 = true;
        if (function0 != null && function0.invoke().booleanValue()) {
            c();
        }
        if (this.f72310e) {
            this.f72306a.invoke(t10);
            return;
        }
        ReentrantLock reentrantLock = this.f72308c;
        try {
            reentrantLock.lock();
            if (!this.f72310e) {
                this.f72309d.add(t10);
                z10 = false;
            }
            if (z10) {
                this.f72306a.invoke(t10);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(T t10) {
        ReentrantLock reentrantLock = this.f72308c;
        try {
            reentrantLock.lock();
            this.f72309d.remove(t10);
        } finally {
            reentrantLock.unlock();
        }
    }

    public /* synthetic */ k0(Function1 function1, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i10 & 2) != 0 ? null : function0);
    }
}
