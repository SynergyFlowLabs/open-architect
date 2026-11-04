package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class m<T> extends n<T> implements Iterator<T>, kotlin.coroutines.d<Unit>, qj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f313051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private T f313052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Iterator<? extends T> f313053c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private kotlin.coroutines.d<? super Unit> f313054d;

    private final Throwable g() {
        int i10 = this.f313051a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f313051a);
    }

    private final T i() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.n
    @Nullable
    public Object b(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        this.f313052b = t10;
        this.f313051a = 3;
        this.f313054d = dVar;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        if (objL == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objL == kotlin.coroutines.intrinsics.b.l() ? objL : Unit.f312394a;
    }

    @Override // kotlin.sequences.n
    @Nullable
    public Object e(@NotNull Iterator<? extends T> it, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (!it.hasNext()) {
            return Unit.f312394a;
        }
        this.f313053c = it;
        this.f313051a = 2;
        this.f313054d = dVar;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        if (objL == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objL == kotlin.coroutines.intrinsics.b.l() ? objL : Unit.f312394a;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.h.f312451a;
    }

    @Nullable
    public final kotlin.coroutines.d<Unit> h() {
        return this.f313054d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            int i10 = this.f313051a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator<? extends T> it = this.f313053c;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f313051a = 2;
                    return true;
                }
                this.f313053c = null;
            }
            this.f313051a = 5;
            kotlin.coroutines.d<? super Unit> dVar = this.f313054d;
            Intrinsics.checkNotNull(dVar);
            this.f313054d = null;
            Result.a aVar = Result.Companion;
            dVar.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
    }

    public final void j(@Nullable kotlin.coroutines.d<? super Unit> dVar) {
        this.f313054d = dVar;
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        int i10 = this.f313051a;
        if (i10 == 0 || i10 == 1) {
            return i();
        }
        if (i10 == 2) {
            this.f313051a = 1;
            Iterator<? extends T> it = this.f313053c;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i10 != 3) {
            throw g();
        }
        this.f313051a = 0;
        T t10 = this.f313052b;
        this.f313052b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        ResultKt.m(obj);
        this.f313051a = 4;
    }
}
