package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.a1;
import kotlin.e1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@a1
@e1(version = "1.3")
public final class j<T> implements d<T>, kotlin.coroutines.jvm.internal.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f312472b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<j<?>, Object> f312473c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "result");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<T> f312474a;

    @Nullable
    private volatile Object result;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void a() {
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(@NotNull d<? super T> delegate, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f312474a = delegate;
        this.result = obj;
    }

    @a1
    @Nullable
    public final Object a() {
        Object obj = this.result;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.UNDECIDED;
        if (obj == aVar) {
            if (androidx.concurrent.futures.b.a(f312473c, this, aVar, kotlin.coroutines.intrinsics.b.l())) {
                return kotlin.coroutines.intrinsics.b.l();
            }
            obj = this.result;
        }
        if (obj == kotlin.coroutines.intrinsics.a.RESUMED) {
            return kotlin.coroutines.intrinsics.b.l();
        }
        if (obj instanceof Result.b) {
            throw ((Result.b) obj).f312393a;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        d<T> dVar = this.f312474a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return this.f312474a.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.UNDECIDED;
            if (obj2 == aVar) {
                if (androidx.concurrent.futures.b.a(f312473c, this, aVar, obj)) {
                    return;
                }
            } else {
                if (obj2 != kotlin.coroutines.intrinsics.b.l()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.b.a(f312473c, this, kotlin.coroutines.intrinsics.b.l(), kotlin.coroutines.intrinsics.a.RESUMED)) {
                    this.f312474a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.f312474a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public j(@NotNull d<? super T> delegate) {
        this(delegate, kotlin.coroutines.intrinsics.a.UNDECIDED);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
