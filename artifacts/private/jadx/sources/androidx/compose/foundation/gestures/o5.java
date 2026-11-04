package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTransformable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,399:1\n103#2:400\n35#2,5:401\n104#2:406\n*S KotlinDebug\n*F\n+ 1 Transformable.kt\nandroidx/compose/foundation/gestures/TransformableNode\n*L\n238#1:400\n238#1:401,5\n238#1:406\n*E\n"})
final class o5 extends androidx.compose.ui.node.m implements androidx.compose.ui.node.d2, androidx.compose.ui.node.h {

    @Nullable
    private u3 H1;

    @NotNull
    private Function1<? super n0.g, Boolean> X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @Nullable
    private androidx.compose.ui.node.d2 f14897g3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, Boolean> f14898p0 = new Function1() { // from class: androidx.compose.foundation.gestures.n5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(o5.N9(this.f14860a, (n0.g) obj));
        }
    };

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<i5> f14899p1 = kotlinx.coroutines.channels.s.d(Integer.MAX_VALUE, null, null, 6, null);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.input.pointer.y0 f14900p2 = (androidx.compose.ui.input.pointer.y0) v9(androidx.compose.ui.input.pointer.w0.a(new b()));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private p5 f14901w;

    static final class a implements PointerInputEventHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u3 f14903b;

        a(u3 u3Var) {
            this.f14903b = u3Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objI = m5.i(l0Var, o5.this.f14899p1, this.f14903b, dVar);
            return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
        }
    }

    static final class b implements PointerInputEventHandler {

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f14906b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.input.pointer.l0 f14907c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ o5 f14908d;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.o5$b$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {175, 178}, m = "invokeSuspend", n = {"$this$launch", androidx.core.app.w.I0, "$this$launch"}, s = {"L$0", "L$1", "L$0"})
            static final class C0082a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                Object f14909a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f14910b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f14911c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private /* synthetic */ Object f14912d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ o5 f14913e;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.o5$b$a$a$a, reason: collision with other inner class name */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {187}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
                static final class C0083a extends kotlin.coroutines.jvm.internal.o implements Function2<k5, kotlin.coroutines.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    Object f14914a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f14915b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    private /* synthetic */ Object f14916c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ kotlin.jvm.internal.i1.h<i5> f14917d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ o5 f14918e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0083a(kotlin.jvm.internal.i1.h<i5> hVar, o5 o5Var, kotlin.coroutines.d<? super C0083a> dVar) {
                        super(2, dVar);
                        this.f14917d = hVar;
                        this.f14918e = o5Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                        C0083a c0083a = new C0083a(this.f14917d, this.f14918e, dVar);
                        c0083a.f14916c = obj;
                        return c0083a;
                    }

                    /* JADX WARN: Code duplicated, block: B:11:0x0037  */
                    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
                    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
                    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
                    /* JADX WARN: Code duplicated, block: B:19:0x006a A[RETURN] */
                    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:20:0x006b). Please report as a decompilation issue!!! */
                    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0037
                        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                        */
                    @Override // kotlin.coroutines.jvm.internal.a
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                            r6 = 0
                            int r1 = r7.f14915b
                            r2 = 1
                            if (r1 == 0) goto L21
                            if (r1 != r2) goto L19
                            r6 = 7
                            java.lang.Object r1 = r7.f14914a
                            kotlin.jvm.internal.i1$h r1 = (kotlin.jvm.internal.i1.h) r1
                            java.lang.Object r3 = r7.f14916c
                            androidx.compose.foundation.gestures.k5 r3 = (androidx.compose.foundation.gestures.k5) r3
                            kotlin.ResultKt.m(r8)
                            goto L6b
                        L19:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L21:
                            r6 = 1
                            kotlin.ResultKt.m(r8)
                            r6 = 3
                            java.lang.Object r8 = r7.f14916c
                            r6 = 4
                            androidx.compose.foundation.gestures.k5 r8 = (androidx.compose.foundation.gestures.k5) r8
                            r3 = r8
                            r3 = r8
                        L2d:
                            r6 = 3
                            kotlin.jvm.internal.i1$h<androidx.compose.foundation.gestures.i5> r8 = r7.f14917d
                            r6 = 6
                            T r8 = r8.f312751a
                            boolean r1 = r8 instanceof androidx.compose.foundation.gestures.i5.c
                            if (r1 != 0) goto L6f
                            boolean r1 = r8 instanceof androidx.compose.foundation.gestures.i5.a
                            if (r1 == 0) goto L3e
                            androidx.compose.foundation.gestures.i5$a r8 = (androidx.compose.foundation.gestures.i5.a) r8
                            goto L40
                        L3e:
                            r6 = 5
                            r8 = 0
                        L40:
                            if (r8 == 0) goto L53
                            float r1 = r8.c()
                            r6 = 0
                            long r4 = r8.a()
                            float r8 = r8.b()
                            r6 = 3
                            r3.a(r1, r4, r8)
                        L53:
                            kotlin.jvm.internal.i1$h<androidx.compose.foundation.gestures.i5> r1 = r7.f14917d
                            r6 = 4
                            androidx.compose.foundation.gestures.o5 r8 = r7.f14918e
                            kotlinx.coroutines.channels.p r8 = androidx.compose.foundation.gestures.o5.H9(r8)
                            r6 = 4
                            r7.f14916c = r3
                            r7.f14914a = r1
                            r6 = 5
                            r7.f14915b = r2
                            java.lang.Object r8 = r8.j(r7)
                            if (r8 != r0) goto L6b
                            return r0
                        L6b:
                            r6 = 7
                            r1.f312751a = r8
                            goto L2d
                        L6f:
                            kotlin.Unit r7 = kotlin.Unit.f312394a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.o5.b.a.C0082a.C0083a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(k5 k5Var, kotlin.coroutines.d<? super Unit> dVar) {
                        return ((C0083a) create(k5Var, dVar)).invokeSuspend(Unit.f312394a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0082a(o5 o5Var, kotlin.coroutines.d<? super C0082a> dVar) {
                    super(2, dVar);
                    this.f14913e = o5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0082a c0082a = new C0082a(this.f14913e, dVar);
                    c0082a.f14912d = obj;
                    return c0082a;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x0043  */
                /* JADX WARN: Code duplicated, block: B:18:0x0060  */
                /* JADX WARN: Code duplicated, block: B:30:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008e -> B:13:0x003b). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                @Override // kotlin.coroutines.jvm.internal.a
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                        int r1 = r10.f14911c
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L33
                        if (r1 == r3) goto L22
                        if (r1 != r2) goto L19
                        java.lang.Object r1 = r10.f14912d
                        kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                        r9 = 2
                        kotlin.ResultKt.m(r11)     // Catch: java.util.concurrent.CancellationException -> L16
                    L16:
                        r11 = r1
                        r11 = r1
                        goto L3b
                    L19:
                        r9 = 3
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L22:
                        java.lang.Object r1 = r10.f14910b
                        kotlin.jvm.internal.i1$h r1 = (kotlin.jvm.internal.i1.h) r1
                        r9 = 4
                        java.lang.Object r4 = r10.f14909a
                        kotlin.jvm.internal.i1$h r4 = (kotlin.jvm.internal.i1.h) r4
                        java.lang.Object r5 = r10.f14912d
                        kotlinx.coroutines.s0 r5 = (kotlinx.coroutines.s0) r5
                        kotlin.ResultKt.m(r11)
                        goto L64
                    L33:
                        kotlin.ResultKt.m(r11)
                        java.lang.Object r11 = r10.f14912d
                        r9 = 2
                        kotlinx.coroutines.s0 r11 = (kotlinx.coroutines.s0) r11
                    L3b:
                        r9 = 4
                        boolean r1 = kotlinx.coroutines.t0.k(r11)
                        r9 = 6
                        if (r1 == 0) goto L91
                        kotlin.jvm.internal.i1$h r1 = new kotlin.jvm.internal.i1$h
                        r9 = 0
                        r1.<init>()
                        androidx.compose.foundation.gestures.o5 r4 = r10.f14913e
                        kotlinx.coroutines.channels.p r4 = androidx.compose.foundation.gestures.o5.H9(r4)
                        r9 = 5
                        r10.f14912d = r11
                        r10.f14909a = r1
                        r10.f14910b = r1
                        r10.f14911c = r3
                        java.lang.Object r4 = r4.j(r10)
                        r9 = 6
                        if (r4 != r0) goto L60
                        goto L8d
                    L60:
                        r5 = r11
                        r11 = r4
                        r4 = r1
                        r4 = r1
                    L64:
                        r1.f312751a = r11
                        T r11 = r4.f312751a
                        boolean r11 = r11 instanceof androidx.compose.foundation.gestures.i5.b
                        r9 = 7
                        if (r11 == 0) goto L8e
                        androidx.compose.foundation.gestures.o5 r11 = r10.f14913e     // Catch: java.util.concurrent.CancellationException -> L8e
                        androidx.compose.foundation.gestures.p5 r11 = androidx.compose.foundation.gestures.o5.K9(r11)     // Catch: java.util.concurrent.CancellationException -> L8e
                        androidx.compose.foundation.q3 r1 = androidx.compose.foundation.q3.UserInput     // Catch: java.util.concurrent.CancellationException -> L8e
                        androidx.compose.foundation.gestures.o5$b$a$a$a r6 = new androidx.compose.foundation.gestures.o5$b$a$a$a     // Catch: java.util.concurrent.CancellationException -> L8e
                        androidx.compose.foundation.gestures.o5 r7 = r10.f14913e     // Catch: java.util.concurrent.CancellationException -> L8e
                        r8 = 0
                        r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L8e
                        r10.f14912d = r5     // Catch: java.util.concurrent.CancellationException -> L8e
                        r10.f14909a = r8     // Catch: java.util.concurrent.CancellationException -> L8e
                        r10.f14910b = r8     // Catch: java.util.concurrent.CancellationException -> L8e
                        r10.f14911c = r2     // Catch: java.util.concurrent.CancellationException -> L8e
                        r9 = 2
                        java.lang.Object r11 = r11.c(r1, r6, r10)     // Catch: java.util.concurrent.CancellationException -> L8e
                        r9 = 0
                        if (r11 != r0) goto L8e
                    L8d:
                        return r0
                    L8e:
                        r11 = r5
                        r9 = 4
                        goto L3b
                    L91:
                        r9 = 4
                        kotlin.Unit r10 = kotlin.Unit.f312394a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.o5.b.a.C0082a.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0082a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.o5$b$a$b, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
            static final class C0084b extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14919a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f14920b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ o5 f14921c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.s0 f14922d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0084b(o5 o5Var, kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super C0084b> dVar) {
                    super(2, dVar);
                    this.f14921c = o5Var;
                    this.f14922d = s0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    C0084b c0084b = new C0084b(this.f14921c, this.f14922d, dVar);
                    c0084b.f14920b = obj;
                    return c0084b;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f14919a;
                    try {
                        try {
                            if (i10 == 0) {
                                ResultKt.m(obj);
                                androidx.compose.ui.input.pointer.c cVar = (androidx.compose.ui.input.pointer.c) this.f14920b;
                                boolean z10 = this.f14921c.Y;
                                kotlinx.coroutines.channels.p pVar = this.f14921c.f14899p1;
                                Function1 function1 = this.f14921c.f14898p0;
                                this.f14919a = 1;
                                if (m5.h(cVar, z10, pVar, function1, this) == objL) {
                                    return objL;
                                }
                            } else {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.m(obj);
                            }
                        } catch (CancellationException e10) {
                            if (!kotlinx.coroutines.t0.k(this.f14922d)) {
                                throw e10;
                            }
                        }
                        this.f14921c.f14899p1.p(i5.c.f14619a);
                        return Unit.f312394a;
                    } catch (Throwable th2) {
                        this.f14921c.f14899p1.p(i5.c.f14619a);
                        throw th2;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0084b) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.input.pointer.l0 l0Var, o5 o5Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14907c = l0Var;
                this.f14908d = o5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14907c, this.f14908d, dVar);
                aVar.f14906b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14905a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f14906b;
                    kotlinx.coroutines.k.f(s0Var, null, kotlinx.coroutines.u0.UNDISPATCHED, new C0082a(this.f14908d, null), 1, null);
                    androidx.compose.ui.input.pointer.l0 l0Var = this.f14907c;
                    C0084b c0084b = new C0084b(this.f14908d, s0Var, null);
                    this.f14905a = 1;
                    if (e3.e(l0Var, c0084b, this) == objL) {
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

        b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.l0 l0Var, kotlin.coroutines.d<? super Unit> dVar) {
            Object objG;
            return (o5.this.Z && (objG = kotlinx.coroutines.t0.g(new a(l0Var, o5.this, null), dVar)) == kotlin.coroutines.intrinsics.b.l()) ? objG : Unit.f312394a;
        }
    }

    public o5(@NotNull p5 p5Var, @NotNull Function1<? super n0.g, Boolean> function1, boolean z10, boolean z11) {
        this.f14901w = p5Var;
        this.X = function1;
        this.Y = z10;
        this.Z = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean N9(o5 o5Var, n0.g gVar) {
        return o5Var.X.invoke(gVar).booleanValue();
    }

    public final void M9(@NotNull p5 p5Var, @NotNull Function1<? super n0.g, Boolean> function1, boolean z10, boolean z11) {
        this.X = function1;
        if (Intrinsics.areEqual(this.f14901w, p5Var) && this.Z == z11 && this.Y == z10) {
            return;
        }
        this.f14901w = p5Var;
        this.Z = z11;
        this.Y = z10;
        this.f14900p2.A6();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        super.e9();
        this.H1 = f0.a(this);
    }

    @Override // androidx.compose.ui.node.d2
    public void p3() {
        this.f14900p2.p3();
        androidx.compose.ui.node.d2 d2Var = this.f14897g3;
        if (d2Var != null) {
            d2Var.p3();
        }
    }

    @Override // androidx.compose.ui.node.d2
    public void p5(@NotNull androidx.compose.ui.input.pointer.q qVar, @NotNull androidx.compose.ui.input.pointer.s sVar, long j10) {
        u3 u3Var = this.H1;
        if (this.Z) {
            List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
            int size = listE.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (androidx.compose.ui.input.pointer.r0.i(listE.get(i10).C(), androidx.compose.ui.input.pointer.r0.f39113b.b())) {
                    if (u3Var != null && this.f14897g3 == null) {
                        this.f14897g3 = (androidx.compose.ui.node.d2) v9(androidx.compose.ui.input.pointer.w0.a(new a(u3Var)));
                        break;
                    } else {
                        break;
                        break;
                    }
                }
            }
        }
        this.f14900p2.p5(qVar, sVar, j10);
        androidx.compose.ui.node.d2 d2Var = this.f14897g3;
        if (d2Var != null) {
            d2Var.p5(qVar, sVar, j10);
        }
    }
}
