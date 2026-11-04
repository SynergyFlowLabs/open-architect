package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 4 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount\n+ 5 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,232:1\n25#2,5:233\n33#2:242\n33#2:262\n33#2:285\n1516#3:238\n1516#3:239\n174#4:240\n219#4:241\n177#4:243\n193#4,5:244\n216#4:249\n198#4,2:250\n178#4:252\n183#4,17:263\n219#4:280\n185#4:281\n216#4:282\n177#4:292\n193#4,5:293\n216#4:298\n198#4,2:299\n178#4:301\n318#5,9:253\n327#5,2:283\n287#6,6:286\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n65#1:233,5\n80#1:242\n101#1:262\n133#1:285\n68#1:238\n69#1:239\n73#1:240\n73#1:241\n87#1:243\n87#1:244,5\n87#1:249\n87#1:250,2\n87#1:252\n108#1:263,17\n108#1:280\n108#1:281\n108#1:282\n138#1:292\n138#1:293,5\n138#1:298\n138#1:299,2\n138#1:301\n97#1:253,9\n97#1:283,2\n136#1:286,6\n*E\n"})
public final class l implements c3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f36188g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Function0<Unit> f36189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f36190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Throwable f36191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.internal.a f36192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private androidx.collection.g2<b<?>> f36193e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.collection.g2<b<?>> f36194f;

    @oj.g
    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount\n*L\n1#1,232:1\n219#1:233\n193#1,5:234\n216#1:239\n198#1,2:240\n193#1,7:242\n219#1:249\n216#1:250\n193#1,5:251\n216#1:256\n198#1,2:257\n216#1,4:259\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount\n*L\n174#1:233\n177#1:234,5\n177#1:239\n177#1:240,2\n183#1:242,7\n184#1:249\n185#1:250\n189#1:251,5\n189#1:256\n189#1:257,2\n223#1:259,4\n*E\n"})
    private static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C0273a f36195b = new C0273a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f36196c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f36197d = 27;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.runtime.internal.a f36198a;

        /* JADX INFO: renamed from: androidx.compose.runtime.l$a$a, reason: collision with other inner class name */
        public static final class C0273a {
            public /* synthetic */ C0273a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0273a() {
            }
        }

        private /* synthetic */ a(androidx.compose.runtime.internal.a aVar) {
            this.f36198a = aVar;
        }

        public static final /* synthetic */ a b(androidx.compose.runtime.internal.a aVar) {
            return new a(aVar);
        }

        @NotNull
        public static androidx.compose.runtime.internal.a c() {
            return d(new androidx.compose.runtime.internal.a(0));
        }

        private static androidx.compose.runtime.internal.a d(androidx.compose.runtime.internal.a aVar) {
            return aVar;
        }

        public static final void e(androidx.compose.runtime.internal.a aVar, int i10) {
            int i11;
            do {
                i11 = aVar.get();
            } while (!aVar.compareAndSet(i11, ((i11 >>> 27) & 15) == i10 ? i11 - 1 : i11));
        }

        public static boolean f(androidx.compose.runtime.internal.a aVar, Object obj) {
            if ((obj instanceof a) && Intrinsics.areEqual(aVar, ((a) obj).p())) {
                return true;
            }
            return false;
        }

        public static final boolean g(androidx.compose.runtime.internal.a aVar, androidx.compose.runtime.internal.a aVar2) {
            return Intrinsics.areEqual(aVar, aVar2);
        }

        private static final int h(androidx.compose.runtime.internal.a aVar, int i10) {
            return 134217727 & i10;
        }

        private static final int i(androidx.compose.runtime.internal.a aVar, int i10) {
            return (i10 >>> 27) & 15;
        }

        public static final boolean j(androidx.compose.runtime.internal.a aVar) {
            return (aVar.get() & 134217727) > 0;
        }

        public static int k(androidx.compose.runtime.internal.a aVar) {
            return aVar.hashCode();
        }

        public static final int l(androidx.compose.runtime.internal.a aVar, @NotNull Function0<Unit> function0) {
            int i10;
            int i11;
            do {
                i10 = aVar.get();
                i11 = i10 + 1;
            } while (!aVar.compareAndSet(i10, i11));
            if ((134217727 & i11) == 1) {
                function0.invoke();
            }
            return (i11 >>> 27) & 15;
        }

        public static final void m(androidx.compose.runtime.internal.a aVar) {
            int i10;
            do {
                i10 = aVar.get();
            } while (!aVar.compareAndSet(i10, n(aVar, ((i10 >>> 27) & 15) + 1, 0)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int n(androidx.compose.runtime.internal.a aVar, int i10, int i11) {
            return ((i10 & 15) << 27) | (134217727 & i11);
        }

        @NotNull
        public static String o(androidx.compose.runtime.internal.a aVar) {
            int i10 = aVar.get();
            return "AtomicAwaitersCount(version = " + ((i10 >>> 27) & 15) + ", count = " + (i10 & 134217727) + ')';
        }

        private static final int q(androidx.compose.runtime.internal.a aVar, Function1<? super Integer, Integer> function1) {
            int i10;
            int iIntValue;
            do {
                i10 = aVar.get();
                iIntValue = function1.invoke(Integer.valueOf(i10)).intValue();
            } while (!aVar.compareAndSet(i10, iIntValue));
            return iIntValue;
        }

        public boolean equals(Object obj) {
            return f(this.f36198a, obj);
        }

        public int hashCode() {
            return k(this.f36198a);
        }

        public final /* synthetic */ androidx.compose.runtime.internal.a p() {
            return this.f36198a;
        }

        @NotNull
        public String toString() {
            return o(this.f36198a);
        }
    }

    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n1#2:233\n*E\n"})
    private static final class b<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Function1<? super Long, ? extends R> f36199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private kotlinx.coroutines.n<? super R> f36200b;

        public b(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlinx.coroutines.n<? super R> nVar) {
            this.f36199a = function1;
            this.f36200b = nVar;
        }

        public final void a() {
            this.f36199a = null;
            this.f36200b = null;
        }

        public final void b(long j10) {
            kotlinx.coroutines.n<? super R> nVar;
            Object objM785constructorimpl;
            Function1<? super Long, ? extends R> function1 = this.f36199a;
            if (function1 == null || (nVar = this.f36200b) == null) {
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            nVar.resumeWith(objM785constructorimpl);
        }

        public final void c(@NotNull Throwable th2) {
            kotlinx.coroutines.n<? super R> nVar = this.f36200b;
            if (nVar != null) {
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
            }
        }
    }

    @SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$2\n+ 2 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$AtomicAwaitersCount\n*L\n1#1,232:1\n189#2,9:233\n216#2:242\n198#2,2:243\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$2\n*L\n116#1:233,9\n116#1:242\n116#1:243,2\n*E\n"})
    static final class c implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<R> f36201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f36202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.f f36203c;

        c(b<R> bVar, l lVar, kotlin.jvm.internal.i1.f fVar) {
            this.f36201a = bVar;
            this.f36202b = lVar;
            this.f36203c = fVar;
        }

        public final void c(Throwable th2) {
            int i10;
            this.f36201a.a();
            androidx.compose.runtime.internal.a aVar = this.f36202b.f36192d;
            int i11 = this.f36203c.f312749a;
            do {
                i10 = aVar.get();
            } while (!aVar.compareAndSet(i10, ((i10 >>> 27) & 15) == i11 ? i10 - 1 : i10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void j(l lVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        lVar.e(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(Throwable th2) {
        int i10;
        synchronized (this.f36190b) {
            try {
                if (this.f36191c != null) {
                    return;
                }
                this.f36191c = th2;
                androidx.collection.g2<b<?>> g2Var = this.f36193e;
                Object[] objArr = g2Var.f12449a;
                int i11 = g2Var.f12450b;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((b) objArr[i12]).c(th2);
                }
                this.f36193e.l0();
                androidx.compose.runtime.internal.a aVar = this.f36192d;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, a.n(aVar, ((i10 >>> 27) & 15) + 1, 0)));
                Unit unit = Unit.f312394a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void e(@NotNull CancellationException cancellationException) {
        k(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) c3.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) c3.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return c3.a.d(this, bVar);
    }

    public final boolean n() {
        return (this.f36192d.get() & 134217727) > 0;
    }

    public final void p(long j10) {
        int i10;
        int i11;
        synchronized (this.f36190b) {
            try {
                androidx.collection.g2<b<?>> g2Var = this.f36193e;
                this.f36193e = this.f36194f;
                this.f36194f = g2Var;
                androidx.compose.runtime.internal.a aVar = this.f36192d;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, a.n(aVar, ((i10 >>> 27) & 15) + 1, 0)));
                int iC = g2Var.C();
                for (i11 = 0; i11 < iC; i11++) {
                    g2Var.y(i11).b(j10);
                }
                g2Var.l0();
                Unit unit = Unit.f312394a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return c3.a.e(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.c3
    @Nullable
    public <R> Object y(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        int i10;
        int i11;
        boolean z10 = true;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        b bVar = new b(function1, pVar);
        kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        fVar.f312749a = -1;
        synchronized (this.f36190b) {
            Throwable th2 = this.f36191c;
            if (th2 != null) {
                Result.a aVar = Result.Companion;
                pVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
            } else {
                androidx.compose.runtime.internal.a aVar2 = this.f36192d;
                do {
                    i10 = aVar2.get();
                    i11 = i10 + 1;
                } while (!aVar2.compareAndSet(i10, i11));
                if ((134217727 & i11) != 1) {
                    z10 = false;
                }
                fVar.f312749a = (i11 >>> 27) & 15;
                this.f36193e.a0(bVar);
                pVar.e0(new c(bVar, this, fVar));
                if (z10 && this.f36189a != null) {
                    try {
                        this.f36189a.invoke();
                    } catch (Throwable th3) {
                        k(th3);
                    }
                }
            }
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    public l(@Nullable Function0<Unit> function0) {
        this.f36189a = function0;
        this.f36190b = new Object();
        this.f36192d = a.c();
        this.f36193e = new androidx.collection.g2<>(0, 1, null);
        this.f36194f = new androidx.collection.g2<>(0, 1, null);
    }

    public /* synthetic */ l(Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0);
    }
}
