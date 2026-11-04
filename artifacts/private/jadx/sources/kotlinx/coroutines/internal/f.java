package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
public abstract class f<N extends f<N>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315045a = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315046b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public f(@Nullable N n10) {
        this._prev$volatile = n10;
    }

    private final N c() {
        N n10 = (N) h();
        while (n10 != null && n10.m()) {
            n10 = (N) f315046b.get(n10);
        }
        return n10;
    }

    private final N d() {
        f fVarF;
        N n10 = (N) f();
        Intrinsics.checkNotNull(n10);
        while (n10.m() && (fVarF = n10.f()) != null) {
            n10 = (N) fVarF;
        }
        return n10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g() {
        return f315045a.get(this);
    }

    private final /* synthetic */ Object i() {
        return this._next$volatile;
    }

    private final /* synthetic */ Object k() {
        return this._prev$volatile;
    }

    private final /* synthetic */ void r(Object obj) {
        this._next$volatile = obj;
    }

    private final /* synthetic */ void s(Object obj) {
        this._prev$volatile = obj;
    }

    private final /* synthetic */ void u(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, ? extends Object> function1) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
    }

    public final void b() {
        f315046b.set(this, null);
    }

    @Nullable
    public final N f() {
        Object objG = g();
        if (objG == e.f315044b) {
            return null;
        }
        return (N) objG;
    }

    @Nullable
    public final N h() {
        return (N) f315046b.get(this);
    }

    public abstract boolean m();

    public final boolean n() {
        return f() == null;
    }

    public final boolean o() {
        return androidx.concurrent.futures.b.a(f315045a, this, null, e.f315044b);
    }

    @Nullable
    public final N p(@NotNull Function0 function0) {
        Object objG = g();
        if (objG != e.f315044b) {
            return (N) objG;
        }
        function0.invoke();
        throw new kotlin.a0();
    }

    public final void q() {
        Object obj;
        if (n()) {
            return;
        }
        while (true) {
            f fVarC = c();
            f fVarD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315046b;
            do {
                obj = atomicReferenceFieldUpdater.get(fVarD);
            } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, fVarD, obj, ((f) obj) == null ? null : fVarC));
            if (fVarC != null) {
                f315045a.set(fVarC, fVarD);
            }
            if (!fVarD.m() || fVarD.n()) {
                if (fVarC == null || !fVarC.m()) {
                    return;
                }
            }
        }
    }

    public final boolean t(@NotNull N n10) {
        return androidx.concurrent.futures.b.a(f315045a, this, null, n10);
    }
}
