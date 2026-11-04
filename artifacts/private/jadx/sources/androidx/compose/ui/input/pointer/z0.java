package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.k7;
import androidx.compose.ui.platform.o4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 12 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n682#1:958\n683#1,4:961\n687#1:973\n690#1,3:982\n1107#2:919\n1085#2,2:920\n1107#2:923\n1085#2,2:924\n26#3:922\n32#3:940\n32#3:959\n32#3:1016\n57#4:926\n61#4:931\n60#5:927\n85#5:930\n70#5:932\n90#5:935\n53#5,3:937\n22#6:928\n22#6:933\n54#7:929\n59#7:934\n33#8:936\n144#9:941\n424#9,8:942\n448#9,8:950\n144#9:960\n424#9,8:965\n448#9,8:974\n643#9,2:1017\n88#10:985\n35#10,5:986\n89#10:991\n88#10:992\n35#10,5:993\n89#10:998\n440#10,2:999\n35#10,3:1001\n39#10:1005\n442#10:1006\n1#11:1004\n318#12,9:1007\n327#12,2:1019\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n699#1:958\n699#1:961,4\n699#1:973\n699#1:982,3\n550#1:919\n550#1:920,2\n560#1:923\n560#1:924,2\n552#1:922\n682#1:940\n699#1:959\n773#1:1016\n580#1:926\n581#1:931\n580#1:927\n580#1:930\n581#1:932\n581#1:935\n582#1:937,3\n580#1:928\n581#1:933\n580#1:929\n581#1:934\n582#1:936\n682#1:941\n686#1:942,8\n687#1:950,8\n699#1:960\n699#1:965,8\n699#1:974,8\n774#1:1017,2\n729#1:985\n729#1:986,5\n729#1:991\n739#1:992\n739#1:993,5\n739#1:998\n743#1:999,2\n743#1:1001,3\n743#1:1005\n743#1:1006\n743#1:1004\n771#1:1007,9\n771#1:1019,2\n*E\n"})
public final class z0 extends androidx.compose.ui.a0.d implements y0, l0, androidx.compose.ui.unit.d {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f39149i3 = 0;

    @NotNull
    private final androidx.compose.runtime.collection.d<b<?>> H1;

    @NotNull
    private PointerInputEventHandler X;

    @Nullable
    private p2 Y;

    @NotNull
    private q Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private long f39150g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f39151h3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<b<?>> f39152p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final Object f39153p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @Nullable
    private q f39154p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    private Object f39155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Object f39156t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    private Object[] f39157v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    private Function2<? super l0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f39158w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f39159a = new a();

        a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/platform/Synchronization_androidKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,918:1\n32#2:919\n648#3,2:920\n318#4,11:922\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n845#1:919\n845#1:920,2\n850#1:922,11\n*E\n"})
    private final class b<R> implements androidx.compose.ui.input.pointer.c, androidx.compose.ui.unit.d, kotlin.coroutines.d<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z0 f39160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlin.coroutines.d<R> f39161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private kotlinx.coroutines.n<? super q> f39162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private s f39163d = s.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final CoroutineContext f39164e = kotlin.coroutines.h.f312451a;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {890}, m = "withTimeout", n = {"job"}, s = {"L$0"})
        static final class a<T> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f39166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f39167b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b<R> f39168c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f39169d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b<R> bVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f39168c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39167b = obj;
                this.f39169d |= Integer.MIN_VALUE;
                return this.f39168c.Y1(0L, null, this);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.z0$b$b, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {882, 883}, m = "invokeSuspend", n = {}, s = {})
        static final class C0299b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f39170a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f39171b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b<R> f39172c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0299b(long j10, b<R> bVar, kotlin.coroutines.d<? super C0299b> dVar) {
                super(2, dVar);
                this.f39171b = j10;
                this.f39172c = bVar;
                int i10 = 2 >> 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0299b(this.f39171b, this.f39172c, dVar);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (kotlinx.coroutines.d1.b(8, r9) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r8 = 3
                    int r1 = r9.f39170a
                    r2 = 8
                    r2 = 8
                    r4 = 2
                    r8 = r4
                    r5 = 7
                    r5 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r5) goto L23
                    if (r1 != r4) goto L19
                    kotlin.ResultKt.m(r10)
                    goto L41
                L19:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "/ sre m evsrr/nolloanc/e/wcb/tieuu/okfe h/ti it/e o"
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L23:
                    kotlin.ResultKt.m(r10)
                    goto L38
                L27:
                    r8 = 0
                    kotlin.ResultKt.m(r10)
                    long r6 = r9.f39171b
                    long r6 = r6 - r2
                    r8 = 4
                    r9.f39170a = r5
                    java.lang.Object r10 = kotlinx.coroutines.d1.b(r6, r9)
                    if (r10 != r0) goto L38
                    goto L40
                L38:
                    r9.f39170a = r4
                    java.lang.Object r10 = kotlinx.coroutines.d1.b(r2, r9)
                    if (r10 != r0) goto L41
                L40:
                    return r0
                L41:
                    androidx.compose.ui.input.pointer.z0$b<R> r10 = r9.f39172c
                    kotlinx.coroutines.n r10 = androidx.compose.ui.input.pointer.z0.b.w(r10)
                    r8 = 0
                    if (r10 == 0) goto L61
                    r8 = 4
                    kotlin.Result$a r0 = kotlin.Result.Companion
                    r8 = 3
                    androidx.compose.ui.input.pointer.t r0 = new androidx.compose.ui.input.pointer.t
                    long r1 = r9.f39171b
                    r0.<init>(r1)
                    java.lang.Object r9 = kotlin.ResultKt.createFailure(r0)
                    java.lang.Object r9 = kotlin.Result.m785constructorimpl(r9)
                    r8 = 1
                    r10.resumeWith(r9)
                L61:
                    r8 = 5
                    kotlin.Unit r9 = kotlin.Unit.f312394a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.z0.b.C0299b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0299b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {860}, m = "withTimeoutOrNull", n = {}, s = {})
        static final class c<T> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f39173a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b<R> f39174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f39175c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(b<R> bVar, kotlin.coroutines.d<? super c> dVar) {
                super(dVar);
                this.f39174b = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f39173a = obj;
                this.f39175c |= Integer.MIN_VALUE;
                int i10 = 6 | 0;
                return this.f39174b.q5(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(kotlin.coroutines.d<? super R> dVar) {
            this.f39160a = z0.this;
            this.f39161b = dVar;
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long C0(long j10) {
            return this.f39160a.C0(j10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float D3(int i10) {
            return this.f39160a.D3(i10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float F3(float f10) {
            return this.f39160a.F3(f10);
        }

        @Override // androidx.compose.ui.input.pointer.c
        @Nullable
        public Object I6(@NotNull s sVar, @NotNull kotlin.coroutines.d<? super q> dVar) {
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
            pVar.p0();
            this.f39163d = sVar;
            this.f39162c = pVar;
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU;
        }

        @Override // androidx.compose.ui.input.pointer.c
        @NotNull
        public q J6() {
            return z0.this.Z;
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        @NotNull
        public n0.j N3(@NotNull androidx.compose.ui.unit.k kVar) {
            return this.f39160a.N3(kVar);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float S7(float f10) {
            return this.f39160a.S7(f10);
        }

        public final void U(@Nullable Throwable th2) {
            kotlinx.coroutines.n<? super q> nVar = this.f39162c;
            if (nVar != null) {
                nVar.c(th2);
            }
            this.f39162c = null;
        }

        public final void V(@NotNull q qVar, @NotNull s sVar) {
            kotlinx.coroutines.n<? super q> nVar;
            if (sVar == this.f39163d && (nVar = this.f39162c) != null) {
                this.f39162c = null;
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(qVar));
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.c
        @Nullable
        public <T> Object Y1(long j10, @NotNull Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
            a aVar;
            Throwable th2;
            p2 p2Var;
            kotlinx.coroutines.n<? super q> nVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f39169d;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f39169d = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object objInvoke = aVar.f39167b;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f39169d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p2Var = (p2) aVar.f39166a;
                try {
                    ResultKt.m(objInvoke);
                    p2Var.e(androidx.compose.ui.input.pointer.d.f38995b);
                    return objInvoke;
                } catch (Throwable th3) {
                    th2 = th3;
                    p2Var.e(androidx.compose.ui.input.pointer.d.f38995b);
                    throw th2;
                }
            }
            ResultKt.m(objInvoke);
            if (j10 <= 0 && (nVar = this.f39162c) != null) {
                Result.a aVar2 = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(new t(j10))));
            }
            p2 p2VarF = kotlinx.coroutines.k.f(z0.this.Q8(), null, null, new C0299b(j10, this, null), 3, null);
            try {
                aVar.f39166a = p2VarF;
                aVar.f39169d = 1;
                objInvoke = function2.invoke(this, aVar);
                if (objInvoke == objL) {
                    return objL;
                }
                p2Var = p2VarF;
                p2Var.e(androidx.compose.ui.input.pointer.d.f38995b);
                return objInvoke;
            } catch (Throwable th4) {
                th2 = th4;
                p2Var = p2VarF;
                p2Var.e(androidx.compose.ui.input.pointer.d.f38995b);
                throw th2;
            }
        }

        @Override // androidx.compose.ui.input.pointer.c
        public long a() {
            return z0.this.f39150g3;
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public int c8(long j10) {
            return this.f39160a.c8(j10);
        }

        @Override // androidx.compose.ui.unit.n
        @k7
        public long d0(float f10) {
            return this.f39160a.d0(f10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public int g6(float f10) {
            return this.f39160a.g6(f10);
        }

        @Override // kotlin.coroutines.d
        @NotNull
        public CoroutineContext getContext() {
            return this.f39164e;
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return this.f39160a.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.c
        @NotNull
        public o4 getViewConfiguration() {
            return z0.this.getViewConfiguration();
        }

        @Override // androidx.compose.ui.input.pointer.c
        public long i0() {
            return z0.this.i0();
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long j1(int i10) {
            return this.f39160a.j1(i10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long k4(long j10) {
            return this.f39160a.k4(j10);
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return this.f39160a.m0();
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public long m1(float f10) {
            return this.f39160a.m1(f10);
        }

        @Override // androidx.compose.ui.unit.d
        @k7
        public float p6(long j10) {
            return this.f39160a.p6(j10);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        @Override // androidx.compose.ui.input.pointer.c
        @Nullable
        public <T> Object q5(long j10, @NotNull Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super T>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) throws Throwable {
            c cVar;
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i10 = cVar.f39175c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar.f39175c = i10 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(this, dVar);
                }
            } else {
                cVar = new c(this, dVar);
            }
            Object obj = cVar.f39173a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = cVar.f39175c;
            try {
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    return obj;
                }
                ResultKt.m(obj);
                cVar.f39175c = 1;
                Object objY1 = Y1(j10, function2, cVar);
                return objY1 == objL ? objL : objY1;
            } catch (t unused) {
                return null;
            }
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(@NotNull Object obj) {
            Object obj2 = z0.this.f39153p1;
            z0 z0Var = z0.this;
            synchronized (obj2) {
                try {
                    z0Var.f39152p0.n0(this);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f39161b.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.n
        @k7
        public float y(long j10) {
            return this.f39160a.y(j10);
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39176a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39176a = iArr;
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b<R> f39177a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b<R> bVar) {
            super(1);
            this.f39177a = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            this.f39177a.U(th2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {718, 720}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$onPointerEvent$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,918:1\n1#2:919\n*E\n"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39178a;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return z0.this.new e(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        
            if (r6.invoke(r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        
            if (r6.invoke(r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r4 = 4
                int r1 = r5.f39178a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L11
                r4 = 3
                goto L1a
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r4 = 0
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.ResultKt.m(r6)
                goto L57
            L1e:
                r4 = 6
                kotlin.ResultKt.m(r6)
                r4 = 0
                androidx.compose.ui.input.pointer.z0 r6 = androidx.compose.ui.input.pointer.z0.this
                kotlin.jvm.functions.Function2 r6 = androidx.compose.ui.input.pointer.z0.z9(r6)
                r4 = 6
                if (r6 == 0) goto L44
                r4 = 2
                androidx.compose.ui.input.pointer.z0 r6 = androidx.compose.ui.input.pointer.z0.this
                kotlin.jvm.functions.Function2 r6 = androidx.compose.ui.input.pointer.z0.z9(r6)
                r4 = 2
                kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
                r4 = 0
                androidx.compose.ui.input.pointer.z0 r1 = androidx.compose.ui.input.pointer.z0.this
                r5.f39178a = r3
                java.lang.Object r5 = r6.invoke(r1, r5)
                r4 = 3
                if (r5 != r0) goto L57
                goto L56
            L44:
                androidx.compose.ui.input.pointer.z0 r6 = androidx.compose.ui.input.pointer.z0.this
                androidx.compose.ui.input.pointer.PointerInputEventHandler r6 = r6.X0()
                androidx.compose.ui.input.pointer.z0 r1 = androidx.compose.ui.input.pointer.z0.this
                r4 = 6
                r5.f39178a = r2
                r4 = 3
                java.lang.Object r5 = r6.invoke(r1, r5)
                if (r5 != r0) goto L57
            L56:
                return r0
            L57:
                r4 = 3
                kotlin.Unit r5 = kotlin.Unit.f312394a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.z0.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$pointerInputHandler$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<l0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f39180a;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f39180a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(l0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ z0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    private final void A9(q qVar, s sVar) {
        synchronized (this.f39153p1) {
            try {
                androidx.compose.runtime.collection.d<b<?>> dVar = this.H1;
                dVar.i(dVar.R(), this.f39152p0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            int i10 = c.f39176a[sVar.ordinal()];
            if (i10 == 1 || i10 == 2) {
                androidx.compose.runtime.collection.d<b<?>> dVar2 = this.H1;
                b<?>[] bVarArr = dVar2.f35552a;
                int iR = dVar2.R();
                for (int i11 = 0; i11 < iR; i11++) {
                    bVarArr[i11].V(qVar, sVar);
                }
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                androidx.compose.runtime.collection.d<b<?>> dVar3 = this.H1;
                int iR2 = dVar3.R() - 1;
                b<?>[] bVarArr2 = dVar3.f35552a;
                if (iR2 < bVarArr2.length) {
                    while (iR2 >= 0) {
                        bVarArr2[iR2].V(qVar, sVar);
                        iR2--;
                    }
                }
            }
            this.H1.r();
        } catch (Throwable th3) {
            this.H1.r();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054 A[Catch: all -> 0x0049, TryCatch #1 {all -> 0x0049, blocks: (B:9:0x001b, B:11:0x0027, B:15:0x002e, B:19:0x003f, B:22:0x004c, B:23:0x0053, B:24:0x0054, B:26:0x0060), top: B:39:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #1 {all -> 0x0049, blocks: (B:9:0x001b, B:11:0x0027, B:15:0x002e, B:19:0x003f, B:22:0x004c, B:23:0x0053, B:24:0x0054, B:26:0x0060), top: B:39:0x001b }] */
    private final void B9(s sVar, Function1<? super b<?>, Unit> function1) {
        b<?>[] bVarArr;
        int iR;
        int i10;
        synchronized (this.f39153p1) {
            try {
                androidx.compose.runtime.collection.d<b<?>> dVar = this.H1;
                dVar.i(dVar.R(), this.f39152p0);
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
        kotlin.jvm.internal.h0.c(1);
        try {
            int i11 = c.f39176a[sVar.ordinal()];
            if (i11 != 1) {
                int i12 = 1 & 2;
                if (i11 == 2) {
                    androidx.compose.runtime.collection.d<b<?>> dVar2 = this.H1;
                    bVarArr = dVar2.f35552a;
                    iR = dVar2.R();
                    for (i10 = 0; i10 < iR; i10++) {
                        function1.invoke(bVarArr[i10]);
                    }
                } else {
                    if (i11 != 3) {
                        throw new kotlin.k0();
                    }
                    androidx.compose.runtime.collection.d<b<?>> dVar3 = this.H1;
                    int iR2 = dVar3.R() - 1;
                    b<?>[] bVarArr2 = dVar3.f35552a;
                    if (iR2 < bVarArr2.length) {
                        while (iR2 >= 0) {
                            function1.invoke(bVarArr2[iR2]);
                            iR2--;
                        }
                    }
                }
            } else {
                androidx.compose.runtime.collection.d<b<?>> dVar4 = this.H1;
                bVarArr = dVar4.f35552a;
                iR = dVar4.R();
                while (i10 < iR) {
                    function1.invoke(bVarArr[i10]);
                }
            }
            kotlin.jvm.internal.h0.d(1);
            this.H1.r();
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.h0.d(1);
            this.H1.r();
            kotlin.jvm.internal.h0.c(1);
            throw th3;
        }
    }

    @kotlin.l(message = "Super property deprecated")
    public static /* synthetic */ void N2() {
    }

    @Override // androidx.compose.ui.input.pointer.y0
    public void A6() {
        p2 p2Var = this.Y;
        if (p2Var != null) {
            p2Var.e(new k0());
            this.Y = null;
        }
    }

    public final void C9(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        boolean z10 = !Intrinsics.areEqual(this.f39155s, obj);
        this.f39155s = obj;
        if (!Intrinsics.areEqual(this.f39156t, obj2)) {
            z10 = true;
        }
        this.f39156t = obj2;
        Object[] objArr2 = this.f39157v;
        if (objArr2 != null && objArr == null) {
            z10 = true;
        }
        if (objArr2 == null && objArr != null) {
            z10 = true;
        }
        if (objArr2 != null && objArr != null && !Arrays.equals(objArr, objArr2)) {
            z10 = true;
        }
        this.f39157v = objArr;
        if (X0().getClass() == pointerInputEventHandler.getClass() ? z10 : true) {
            A6();
        }
        this.X = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.y0
    public void M5(@NotNull PointerInputEventHandler pointerInputEventHandler) {
        A6();
        this.f39158w = null;
        this.X = pointerInputEventHandler;
    }

    @Override // androidx.compose.ui.input.pointer.y0
    public void T3(@NotNull Function2<? super l0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        A6();
        this.f39158w = function2;
    }

    @Override // androidx.compose.ui.input.pointer.l0
    public boolean U7() {
        return this.f39151h3;
    }

    @Override // androidx.compose.ui.input.pointer.y0
    @NotNull
    public PointerInputEventHandler X0() {
        return this.X;
    }

    @Override // androidx.compose.ui.input.pointer.l0
    public long a() {
        return this.f39150g3;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        A6();
        super.f9();
    }

    @Override // androidx.compose.ui.input.pointer.l0
    @Nullable
    public <R> Object g5(@NotNull Function2<? super androidx.compose.ui.input.pointer.c, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        b bVar = new b(pVar);
        synchronized (this.f39153p1) {
            this.f39152p0.d(bVar);
            kotlin.coroutines.d<Unit> dVarC = kotlin.coroutines.f.c(function2, bVar, bVar);
            Result.a aVar = Result.Companion;
            dVarC.resumeWith(Result.m785constructorimpl(Unit.f312394a));
        }
        pVar.e0(new d(bVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    @Override // androidx.compose.ui.unit.d
    public float getDensity() {
        return androidx.compose.ui.node.k.u(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.l0
    @NotNull
    public o4 getViewConfiguration() {
        return androidx.compose.ui.node.k.u(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.input.pointer.l0
    public long i0() {
        long jK4 = k4(getViewConfiguration().l());
        long jA = a();
        return n0.n.f((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK4 >> 32)) - ((int) (jA >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jK4 & com.rabbitmq.client.k0.f265952a)) - ((int) (jA & com.rabbitmq.client.k0.f265952a))) / 2.0f)) & com.rabbitmq.client.k0.f265952a));
    }

    @Override // androidx.compose.ui.node.j, androidx.compose.ui.node.d2
    public void l0() {
        A6();
    }

    @Override // androidx.compose.ui.unit.n
    public float m0() {
        return androidx.compose.ui.node.k.u(this).getDensity().m0();
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        q qVar = this.f39154p2;
        if (qVar == null) {
            return;
        }
        List<c0> listE = qVar.e();
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listE.get(i10).w()) {
                List<c0> listE2 = qVar.e();
                ArrayList arrayList = new ArrayList(listE2.size());
                int size2 = listE2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c0 c0Var = listE2.get(i11);
                    arrayList.add(new c0(c0Var.s(), c0Var.D(), c0Var.u(), false, c0Var.x(), c0Var.D(), c0Var.u(), c0Var.w(), c0Var.w(), c0Var.C(), 0L, 1024, (DefaultConstructorMarker) null));
                }
                q qVar2 = new q(arrayList);
                this.Z = qVar2;
                A9(qVar2, s.Initial);
                A9(qVar2, s.Main);
                A9(qVar2, s.Final);
                this.f39154p2 = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull q qVar, @NotNull s sVar, long j10) {
        this.f39150g3 = j10;
        if (sVar == s.Initial) {
            this.Z = qVar;
        }
        if (this.Y == null) {
            this.Y = kotlinx.coroutines.k.f(Q8(), null, kotlinx.coroutines.u0.UNDISPATCHED, new e(null), 1, null);
        }
        A9(qVar, sVar);
        List<c0> listE = qVar.e();
        int size = listE.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!r.e(listE.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            qVar = null;
        }
        this.f39154p2 = qVar;
    }

    @Override // androidx.compose.ui.input.pointer.y0
    @NotNull
    public Function2<l0, kotlin.coroutines.d<? super Unit>, Object> s8() {
        Function2 fVar = this.f39158w;
        if (fVar == null) {
            fVar = new f(null);
        }
        return fVar;
    }

    @Override // androidx.compose.ui.input.pointer.l0
    public void t6(boolean z10) {
        this.f39151h3 = z10;
    }

    @Override // androidx.compose.ui.node.d2
    public void u8() {
        A6();
    }

    public z0(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull PointerInputEventHandler pointerInputEventHandler) {
        this.f39155s = obj;
        this.f39156t = obj2;
        this.f39157v = objArr;
        this.X = pointerInputEventHandler;
        this.Z = w0.f39139b;
        androidx.compose.runtime.collection.d<b<?>> dVar = new androidx.compose.runtime.collection.d<>(new b[16], 0);
        this.f39152p0 = dVar;
        this.f39153p1 = dVar;
        this.H1 = new androidx.compose.runtime.collection.d<>(new b[16], 0);
        this.f39150g3 = androidx.compose.ui.unit.u.f42720b.a();
    }

    @kotlin.l(message = "Exists to maintain compatibility with previous API shape")
    public z0(@Nullable Object obj, @Nullable Object obj2, @Nullable Object[] objArr, @NotNull Function2<? super l0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this(obj, obj2, objArr, a.f39159a);
        this.f39158w = function2;
    }
}
