package androidx.compose.foundation.text;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class w4 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,61:1\n326#2:62\n*S KotlinDebug\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2\n*L\n40#1:62\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.l0 f21708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.s f21709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f21710d;

        /* JADX INFO: renamed from: androidx.compose.foundation.text.w4$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nPointerMoveDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerMoveDetector.kt\nandroidx/compose/foundation/text/PointerMoveDetectorKt$detectMoves$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
        static final class C0163a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f21711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f21712b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f21713c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f21714d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.s f21715e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<n0.g, Unit> f21716f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0163a(CoroutineContext coroutineContext, androidx.compose.ui.input.pointer.s sVar, Function1<? super n0.g, Unit> function1, kotlin.coroutines.d<? super C0163a> dVar) {
                super(2, dVar);
                this.f21714d = coroutineContext;
                this.f21715e = sVar;
                this.f21716f = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C0163a c0163a = new C0163a(this.f21714d, this.f21715e, this.f21716f, dVar);
                c0163a.f21713c = obj;
                return c0163a;
            }

            /* JADX WARN: Code duplicated, block: B:11:0x003c  */
            /* JADX WARN: Code duplicated, block: B:13:0x004c A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:16:0x0064  */
            /* JADX WARN: Code duplicated, block: B:20:0x007b  */
            /* JADX WARN: Code duplicated, block: B:23:0x009d  */
            /* JADX WARN: Code duplicated, block: B:25:0x00a1  */
            /* JADX WARN: Type inference failed for: r9v14, types: [T, n0.g] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004a -> B:14:0x004d). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x004c
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r8.f21712b
                    r2 = 1
                    if (r1 == 0) goto L23
                    if (r1 != r2) goto L19
                    java.lang.Object r1 = r8.f21711a
                    kotlin.jvm.internal.i1$h r1 = (kotlin.jvm.internal.i1.h) r1
                    java.lang.Object r3 = r8.f21713c
                    r7 = 7
                    androidx.compose.ui.input.pointer.c r3 = (androidx.compose.ui.input.pointer.c) r3
                    r7 = 7
                    kotlin.ResultKt.m(r9)
                    goto L4d
                L19:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "cose  /tenovaeb/u otmeoeclh/ril/eniw//k f ro /sirt/"
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L23:
                    kotlin.ResultKt.m(r9)
                    r7 = 1
                    java.lang.Object r9 = r8.f21713c
                    androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.c) r9
                    r7 = 5
                    kotlin.jvm.internal.i1$h r1 = new kotlin.jvm.internal.i1$h
                    r1.<init>()
                    r3 = r9
                    r3 = r9
                L33:
                    r7 = 5
                    kotlin.coroutines.CoroutineContext r9 = r8.f21714d
                    boolean r9 = kotlinx.coroutines.s2.D(r9)
                    if (r9 == 0) goto Lb6
                    r7 = 7
                    androidx.compose.ui.input.pointer.s r9 = r8.f21715e
                    r8.f21713c = r3
                    r7 = 4
                    r8.f21711a = r1
                    r8.f21712b = r2
                    java.lang.Object r9 = r3.I6(r9, r8)
                    if (r9 != r0) goto L4d
                    return r0
                L4d:
                    r7 = 2
                    androidx.compose.ui.input.pointer.q r9 = (androidx.compose.ui.input.pointer.q) r9
                    r7 = 0
                    int r4 = r9.j()
                    r7 = 6
                    androidx.compose.ui.input.pointer.u$a r5 = androidx.compose.ui.input.pointer.u.f39127b
                    int r6 = r5.c()
                    r7 = 3
                    boolean r6 = androidx.compose.ui.input.pointer.u.k(r4, r6)
                    r7 = 4
                    if (r6 != 0) goto L7b
                    int r6 = r5.a()
                    r7 = 1
                    boolean r6 = androidx.compose.ui.input.pointer.u.k(r4, r6)
                    r7 = 6
                    if (r6 != 0) goto L7b
                    int r5 = r5.b()
                    r7 = 0
                    boolean r4 = androidx.compose.ui.input.pointer.u.k(r4, r5)
                    if (r4 == 0) goto L33
                L7b:
                    r7 = 1
                    java.util.List r9 = r9.e()
                    java.lang.Object r9 = kotlin.collections.CollectionsKt.first(r9)
                    androidx.compose.ui.input.pointer.c0 r9 = (androidx.compose.ui.input.pointer.c0) r9
                    long r4 = r9.u()
                    r7 = 6
                    n0.g r9 = n0.g.d(r4)
                    r7 = 6
                    long r4 = r9.B()
                    T r6 = r1.f312751a
                    boolean r4 = n0.g.k(r4, r6)
                    if (r4 != 0) goto L9d
                    goto L9f
                L9d:
                    r9 = 0
                    r7 = r9
                L9f:
                    if (r9 == 0) goto L33
                    kotlin.jvm.functions.Function1<n0.g, kotlin.Unit> r4 = r8.f21716f
                    long r5 = r9.B()
                    n0.g r9 = n0.g.d(r5)
                    r1.f312751a = r9
                    n0.g r9 = n0.g.d(r5)
                    r4.invoke(r9)
                    goto L33
                Lb6:
                    r7 = 5
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    r7 = 4
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.w4.a.C0163a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0163a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.ui.input.pointer.l0 l0Var, androidx.compose.ui.input.pointer.s sVar, Function1<? super n0.g, Unit> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21708b = l0Var;
            this.f21709c = sVar;
            this.f21710d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f21708b, this.f21709c, this.f21710d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f21707a;
            if (i10 == 0) {
                ResultKt.m(obj);
                CoroutineContext context = getContext();
                androidx.compose.ui.input.pointer.l0 l0Var = this.f21708b;
                C0163a c0163a = new C0163a(context, this.f21709c, this.f21710d, null);
                this.f21707a = 1;
                if (l0Var.g5(c0163a, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final Object a(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull androidx.compose.ui.input.pointer.s sVar, @NotNull Function1<? super n0.g, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new a(l0Var, sVar, function1, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public static /* synthetic */ Object b(androidx.compose.ui.input.pointer.l0 l0Var, androidx.compose.ui.input.pointer.s sVar, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Initial;
        }
        return a(l0Var, sVar, function1, dVar);
    }
}
