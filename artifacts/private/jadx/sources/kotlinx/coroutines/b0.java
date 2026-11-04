package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,701:1\n1#2:702\n*E\n"})
final class b0<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final R f313539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    @Nullable
    public final m f313540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    @Nullable
    public final pj.n<Throwable, R, CoroutineContext, Unit> f313541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Object f313542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @Nullable
    public final Throwable f313543e;

    /* JADX WARN: Multi-variable type inference failed */
    public b0(R r10, @Nullable m mVar, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar, @Nullable Object obj, @Nullable Throwable th2) {
        this.f313539a = r10;
        this.f313540b = mVar;
        this.f313541c = nVar;
        this.f313542d = obj;
        this.f313543e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b0 g(b0 b0Var, Object obj, m mVar, pj.n nVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = b0Var.f313539a;
        }
        if ((i10 & 2) != 0) {
            mVar = b0Var.f313540b;
        }
        if ((i10 & 4) != 0) {
            nVar = b0Var.f313541c;
        }
        if ((i10 & 8) != 0) {
            obj2 = b0Var.f313542d;
        }
        if ((i10 & 16) != 0) {
            th2 = b0Var.f313543e;
        }
        Throwable th3 = th2;
        pj.n nVar2 = nVar;
        return b0Var.f(obj, mVar, nVar2, obj2, th3);
    }

    public final R a() {
        return this.f313539a;
    }

    @Nullable
    public final m b() {
        return this.f313540b;
    }

    @Nullable
    public final pj.n<Throwable, R, CoroutineContext, Unit> c() {
        return this.f313541c;
    }

    @Nullable
    public final Object d() {
        return this.f313542d;
    }

    @Nullable
    public final Throwable e() {
        return this.f313543e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f313539a, b0Var.f313539a) && Intrinsics.areEqual(this.f313540b, b0Var.f313540b) && Intrinsics.areEqual(this.f313541c, b0Var.f313541c) && Intrinsics.areEqual(this.f313542d, b0Var.f313542d) && Intrinsics.areEqual(this.f313543e, b0Var.f313543e);
    }

    @NotNull
    public final b0<R> f(R r10, @Nullable m mVar, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar, @Nullable Object obj, @Nullable Throwable th2) {
        return new b0<>(r10, mVar, nVar, obj, th2);
    }

    public final boolean h() {
        return this.f313543e != null;
    }

    public int hashCode() {
        R r10 = this.f313539a;
        int iHashCode = 0;
        int iHashCode2 = (r10 == null ? 0 : r10.hashCode()) * 31;
        m mVar = this.f313540b;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        pj.n<Throwable, R, CoroutineContext, Unit> nVar = this.f313541c;
        int iHashCode4 = (iHashCode3 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        Object obj = this.f313542d;
        int iHashCode5 = (iHashCode4 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th2 = this.f313543e;
        if (th2 != null) {
            iHashCode = th2.hashCode();
        }
        return iHashCode5 + iHashCode;
    }

    public final void i(@NotNull p<?> pVar, @NotNull Throwable th2) {
        m mVar = this.f313540b;
        if (mVar != null) {
            pVar.k(mVar, th2);
        }
        pj.n<Throwable, R, CoroutineContext, Unit> nVar = this.f313541c;
        if (nVar != null) {
            pVar.m(nVar, th2, this.f313539a);
        }
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f313539a + ", cancelHandler=" + this.f313540b + ", onCancellation=" + this.f313541c + ", idempotentResume=" + this.f313542d + ", cancelCause=" + this.f313543e + ')';
    }

    public /* synthetic */ b0(Object obj, m mVar, pj.n nVar, Object obj2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i10 & 2) != 0 ? null : mVar, (i10 & 4) != 0 ? null : nVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
