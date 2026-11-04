package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n35#2,5:547\n103#2:552\n35#2,5:553\n104#2:558\n88#2:559\n35#2,5:560\n89#2:565\n88#2:566\n35#2,5:567\n89#2:572\n88#2:573\n35#2,5:574\n89#2:579\n103#2:580\n35#2,5:581\n104#2:586\n103#2:587\n35#2,5:588\n104#2:593\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n210#1:547,5\n211#1:552\n211#1:553,5\n211#1:558\n321#1:559\n321#1:560,5\n321#1:565\n324#1:566\n324#1:567,5\n324#1:572\n353#1:573\n353#1:574,5\n353#1:579\n359#1:580\n359#1:581,5\n359#1:586\n367#1:587\n367#1:588,5\n367#1:593\n*E\n"})
public final class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14420a = new a(null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14421a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Object invoke(r3 r3Var, n0.g gVar, kotlin.coroutines.d<? super Unit> dVar) {
            return k(r3Var, gVar.B(), dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f14421a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Unit.f312394a;
        }

        public final Object k(r3 r3Var, long j10, kotlin.coroutines.d<? super Unit> dVar) {
            return new a(dVar).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {com.google.android.vending.licensing.k.f115074c}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f14424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14426e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14425d = obj;
            this.f14426e |= Integer.MIN_VALUE;
            return c5.e(null, false, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {304}, m = "awaitPrimaryFirstDown", n = {"$this$awaitPrimaryFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f14429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f14430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f14431e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14430d = obj;
            this.f14431e |= Integer.MIN_VALUE;
            return c5.i(null, false, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", f = "TapGestureDetector.kt", i = {0, 0}, l = {227}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull", "minUptime"}, s = {"L$0", "J$0"})
    static final class d extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f14432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f14434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.c0 f14435d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.input.pointer.c0 c0Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f14435d = c0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(this.f14435d, dVar);
            dVar2.f14434c = obj;
            return dVar2;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0054  */
        /* JADX WARN: Code duplicated, block: B:15:0x0061 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:16:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0052 -> B:13:0x0056). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0062
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f14433b
                r11 = 1
                r2 = 1
                if (r1 == 0) goto L26
                if (r1 != r2) goto L1c
                long r3 = r12.f14432a
                java.lang.Object r1 = r12.f14434c
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.ui.input.pointer.c) r1
                r11 = 3
                kotlin.ResultKt.m(r13)
                r8 = r12
                r8 = r12
                r5 = r1
                r5 = r1
                r11 = 2
                goto L56
            L1c:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                r11 = 6
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r11 = 0
                r12.<init>(r13)
                throw r12
            L26:
                kotlin.ResultKt.m(r13)
                java.lang.Object r13 = r12.f14434c
                androidx.compose.ui.input.pointer.c r13 = (androidx.compose.ui.input.pointer.c) r13
                r11 = 5
                androidx.compose.ui.input.pointer.c0 r1 = r12.f14435d
                r11 = 7
                long r3 = r1.D()
                androidx.compose.ui.platform.o4 r1 = r13.getViewConfiguration()
                long r5 = r1.a()
                long r3 = r3 + r5
                r5 = r13
            L3f:
                r12.f14434c = r5
                r12.f14432a = r3
                r12.f14433b = r2
                r6 = 0
                r11 = 4
                r7 = 0
                r9 = 0
                r9 = 3
                r11 = 3
                r10 = 0
                r8 = r12
                r11 = 3
                java.lang.Object r13 = androidx.compose.foundation.gestures.c5.g(r5, r6, r7, r8, r9, r10)
                if (r13 != r0) goto L56
                r11 = 7
                return r0
            L56:
                androidx.compose.ui.input.pointer.c0 r13 = (androidx.compose.ui.input.pointer.c0) r13
                long r6 = r13.D()
                r11 = 1
                int r12 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r12 < 0) goto L62
                return r13
            L62:
                r12 = r8
                r12 = r8
                goto L3f
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
            return ((d) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {209}, m = "consumeUntilUp", n = {"$this$consumeUntilUp"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14438c;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14437b = obj;
            this.f14438c |= Integer.MIN_VALUE;
            return c5.l(null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.Q1}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.l0 f14441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f14443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ s3 f14444f;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0, 0, 1}, l = {com.planner5d.library.engine.input.f.b.U1, 257}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "resetJob", "resetJob"}, s = {"L$0", "L$1", "L$0"})
        @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,546:1\n1#2:547\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f14445a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f14446b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private /* synthetic */ Object f14447c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f14448d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14449e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1<n0.g, Unit> f14450f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ s3 f14451g;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c5$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.X1}, m = "invokeSuspend", n = {}, s = {})
            static final class C0075a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14452a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14453b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ s3 f14454c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.c0 f14455d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0075a(pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, s3 s3Var, androidx.compose.ui.input.pointer.c0 c0Var, kotlin.coroutines.d<? super C0075a> dVar) {
                    super(2, dVar);
                    this.f14453b = nVar;
                    this.f14454c = s3Var;
                    this.f14455d = c0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0075a(this.f14453b, this.f14454c, this.f14455d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f14452a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f14453b;
                        s3 s3Var = this.f14454c;
                        n0.g gVarD = n0.g.d(this.f14455d.u());
                        this.f14452a = 1;
                        if (nVar.invoke(s3Var, gVarD, this) == objL) {
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
                    return ((C0075a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14456a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14457b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(s3 s3Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f14457b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f14457b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14456a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14457b.c();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14458a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14459b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(s3 s3Var, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f14459b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new c(this.f14459b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14458a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14459b.w();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.S1}, m = "invokeSuspend", n = {}, s = {})
            static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14460a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14461b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(s3 s3Var, kotlin.coroutines.d<? super d> dVar) {
                    super(2, dVar);
                    this.f14461b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new d(this.f14461b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f14460a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        s3 s3Var = this.f14461b;
                        this.f14460a = 1;
                        if (s3Var.x(this) == objL) {
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
                    return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.s0 s0Var, pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, Function1<? super n0.g, Unit> function1, s3 s3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14448d = s0Var;
                this.f14449e = nVar;
                this.f14450f = function1;
                this.f14451g = s3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14448d, this.f14449e, this.f14450f, this.f14451g, dVar);
                aVar.f14447c = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:23:0x0094  */
            /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:26:0x00bb  */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                androidx.compose.ui.input.pointer.c cVar;
                Object objG;
                kotlinx.coroutines.p2 p2Var;
                Object objD;
                kotlinx.coroutines.p2 p2Var2;
                androidx.compose.ui.input.pointer.c0 c0Var;
                Function1<n0.g, Unit> function1;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14446b;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    cVar = (androidx.compose.ui.input.pointer.c) this.f14447c;
                    kotlinx.coroutines.p2 p2VarF = kotlinx.coroutines.k.f(this.f14448d, null, c5.q(), new d(this.f14451g, null), 1, null);
                    this.f14447c = cVar;
                    this.f14445a = p2VarF;
                    this.f14446b = 1;
                    objG = c5.g(cVar, false, null, this, 3, null);
                    if (objG != objL) {
                        p2Var = p2VarF;
                    }
                    return objL;
                }
                if (i10 == 1) {
                    kotlinx.coroutines.p2 p2Var3 = (kotlinx.coroutines.p2) this.f14445a;
                    androidx.compose.ui.input.pointer.c cVar2 = (androidx.compose.ui.input.pointer.c) this.f14447c;
                    ResultKt.m(obj);
                    p2Var = p2Var3;
                    cVar = cVar2;
                    objG = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlinx.coroutines.p2 p2Var4 = (kotlinx.coroutines.p2) this.f14447c;
                    ResultKt.m(obj);
                    p2Var2 = p2Var4;
                    objD = obj;
                }
                c0Var = (androidx.compose.ui.input.pointer.c0) objD;
                if (c0Var == null) {
                    c5.x(this.f14448d, p2Var2, null, new b(this.f14451g, null), 2, null);
                } else {
                    c0Var.a();
                    c5.x(this.f14448d, p2Var2, null, new c(this.f14451g, null), 2, null);
                    function1 = this.f14450f;
                    if (function1 != null) {
                        function1.invoke(n0.g.d(c0Var.u()));
                    }
                }
                return Unit.f312394a;
                androidx.compose.ui.input.pointer.c0 c0Var2 = (androidx.compose.ui.input.pointer.c0) objG;
                c0Var2.a();
                if (this.f14449e != c5.f14420a) {
                    c5.x(this.f14448d, p2Var, null, new C0075a(this.f14449e, this.f14451g, c0Var2, null), 2, null);
                }
                this.f14447c = p2Var;
                this.f14445a = null;
                this.f14446b = 2;
                objD = c5.D(cVar, null, this, 1, null);
                if (objD != objL) {
                    p2Var2 = p2Var;
                    c0Var = (androidx.compose.ui.input.pointer.c0) objD;
                    if (c0Var == null) {
                        c5.x(this.f14448d, p2Var2, null, new b(this.f14451g, null), 2, null);
                    } else {
                        c0Var.a();
                        c5.x(this.f14448d, p2Var2, null, new c(this.f14451g, null), 2, null);
                        function1 = this.f14450f;
                        if (function1 != null) {
                            function1.invoke(n0.g.d(c0Var.u()));
                        }
                    }
                    return Unit.f312394a;
                }
                return objL;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(androidx.compose.ui.input.pointer.l0 l0Var, pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, Function1<? super n0.g, Unit> function1, s3 s3Var, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f14441c = l0Var;
            this.f14442d = nVar;
            this.f14443e = function1;
            this.f14444f = s3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f14441c, this.f14442d, this.f14443e, this.f14444f, dVar);
            fVar.f14440b = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14439a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f14440b;
                androidx.compose.ui.input.pointer.l0 l0Var = this.f14441c;
                a aVar = new a(s0Var, this.f14442d, this.f14443e, this.f14444f, null);
                this.f14439a = 1;
                if (e3.e(l0Var, aVar, this) == objL) {
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
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.l0 f14464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f14466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f14467f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<n0.g, Unit> f14468g;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7}, l = {105, androidx.media3.extractor.metadata.dvbsi.b.f67479d, 119, 122, com.planner5d.library.engine.input.f.b.H1, 167, 169, 180}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "resetJob", "$this$awaitEachGesture", "down", "resetJob", "resetJob", "$this$awaitEachGesture", "upOrCancel", "cancelOrReleaseJob", "resetJob", "upOrCancel", "$this$awaitEachGesture", "resetJob", "upOrCancel", "secondDown", "resetJob"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
        static final class a extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f14469a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f14470b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f14471c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int f14472d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private /* synthetic */ Object f14473e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f14474f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14475g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function1<n0.g, Unit> f14476h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function1<n0.g, Unit> f14477i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function1<n0.g, Unit> f14478j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ s3 f14479k;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c5$g$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
            static final class C0076a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14480a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14481b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ s3 f14482c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.c0 f14483d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0076a(pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, s3 s3Var, androidx.compose.ui.input.pointer.c0 c0Var, kotlin.coroutines.d<? super C0076a> dVar) {
                    super(2, dVar);
                    this.f14481b = nVar;
                    this.f14482c = s3Var;
                    this.f14483d = c0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0076a(this.f14481b, this.f14482c, this.f14483d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f14480a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f14481b;
                        s3 s3Var = this.f14482c;
                        n0.g gVarD = n0.g.d(this.f14483d.u());
                        this.f14480a = 1;
                        if (nVar.invoke(s3Var, gVarD, this) == objL) {
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
                    return ((C0076a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14484a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14485b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(s3 s3Var, kotlin.coroutines.d<? super b> dVar) {
                    super(2, dVar);
                    this.f14485b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new b(this.f14485b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14484a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14485b.w();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14486a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14487b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(s3 s3Var, kotlin.coroutines.d<? super c> dVar) {
                    super(2, dVar);
                    this.f14487b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new c(this.f14487b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14486a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14487b.c();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14488a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14489b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(s3 s3Var, kotlin.coroutines.d<? super d> dVar) {
                    super(2, dVar);
                    this.f14489b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new d(this.f14489b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14488a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14489b.w();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {androidx.media2.widget.f.i.f59799s0, androidx.media2.widget.f.i.f59801t0}, m = "invokeSuspend", n = {}, s = {})
            static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14490a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.p2 f14491b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ s3 f14492c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(kotlinx.coroutines.p2 p2Var, s3 s3Var, kotlin.coroutines.d<? super e> dVar) {
                    super(2, dVar);
                    this.f14491b = p2Var;
                    this.f14492c = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new e(this.f14491b, this.f14492c, dVar);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
                
                    if (r6.x(r5) == r0) goto L16;
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
                        int r1 = r5.f14490a
                        r4 = 0
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L23
                        r4 = 0
                        if (r1 == r3) goto L1f
                        if (r1 != r2) goto L15
                        kotlin.ResultKt.m(r6)
                        r4 = 4
                        goto L3e
                    L15:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        r4 = 7
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        r4 = 7
                        throw r5
                    L1f:
                        kotlin.ResultKt.m(r6)
                        goto L31
                    L23:
                        kotlin.ResultKt.m(r6)
                        kotlinx.coroutines.p2 r6 = r5.f14491b
                        r5.f14490a = r3
                        java.lang.Object r6 = r6.d1(r5)
                        if (r6 != r0) goto L31
                        goto L3d
                    L31:
                        androidx.compose.foundation.gestures.s3 r6 = r5.f14492c
                        r5.f14490a = r2
                        r4 = 7
                        java.lang.Object r5 = r6.x(r5)
                        r4 = 7
                        if (r5 != r0) goto L3e
                    L3d:
                        return r0
                    L3e:
                        kotlin.Unit r5 = kotlin.Unit.f312394a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.g.a.e.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
            static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14493a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> f14494b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ s3 f14495c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ androidx.compose.ui.input.pointer.c0 f14496d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                f(pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, s3 s3Var, androidx.compose.ui.input.pointer.c0 c0Var, kotlin.coroutines.d<? super f> dVar) {
                    super(2, dVar);
                    this.f14494b = nVar;
                    this.f14495c = s3Var;
                    this.f14496d = c0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new f(this.f14494b, this.f14495c, this.f14496d, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f14493a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        pj.n<r3, n0.g, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f14494b;
                        s3 s3Var = this.f14495c;
                        n0.g gVarD = n0.g.d(this.f14496d.u());
                        this.f14493a = 1;
                        if (nVar.invoke(s3Var, gVarD, this) == objL) {
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
                    return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.c5$g$a$g, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C0077g extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14497a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14498b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0077g(s3 s3Var, kotlin.coroutines.d<? super C0077g> dVar) {
                    super(2, dVar);
                    this.f14498b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0077g(this.f14498b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14497a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14498b.w();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0077g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14499a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14500b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(s3 s3Var, kotlin.coroutines.d<? super h> dVar) {
                    super(2, dVar);
                    this.f14500b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new h(this.f14500b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14499a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14500b.c();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$resetJob$1", f = "TapGestureDetector.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
            static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14501a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14502b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(s3 s3Var, kotlin.coroutines.d<? super i> dVar) {
                    super(2, dVar);
                    this.f14502b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new i(this.f14502b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f14501a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        s3 s3Var = this.f14502b;
                        this.f14501a = 1;
                        if (s3Var.x(this) == objL) {
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
                    return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$secondUp$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class j extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f14503a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ s3 f14504b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(s3 s3Var, kotlin.coroutines.d<? super j> dVar) {
                    super(2, dVar);
                    this.f14504b = s3Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new j(this.f14504b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f14503a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                    this.f14504b.w();
                    return Unit.f312394a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((j) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(kotlinx.coroutines.s0 s0Var, pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, Function1<? super n0.g, Unit> function1, Function1<? super n0.g, Unit> function2, Function1<? super n0.g, Unit> function3, s3 s3Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14474f = s0Var;
                this.f14475g = nVar;
                this.f14476h = function1;
                this.f14477i = function2;
                this.f14478j = function3;
                this.f14479k = s3Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14474f, this.f14475g, this.f14476h, this.f14477i, this.f14478j, this.f14479k, dVar);
                aVar.f14473e = obj;
                return aVar;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x00cf  */
            /* JADX WARN: Code duplicated, block: B:24:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:29:0x0100  */
            /* JADX WARN: Code duplicated, block: B:32:0x0111 A[PHI: r0 r1 r2 r4
              0x0111: PHI (r0v21 kotlinx.coroutines.p2) = (r0v7 kotlinx.coroutines.p2), (r0v24 kotlinx.coroutines.p2) binds: [B:30:0x010d, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x0111: PHI (r1v16 androidx.compose.ui.input.pointer.c0) = (r1v3 androidx.compose.ui.input.pointer.c0), (r1v25 androidx.compose.ui.input.pointer.c0) binds: [B:30:0x010d, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x0111: PHI (r2v5 androidx.compose.ui.input.pointer.c) = (r2v1 androidx.compose.ui.input.pointer.c), (r2v7 androidx.compose.ui.input.pointer.c) binds: [B:30:0x010d, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]
              0x0111: PHI (r4v9 java.lang.Object) = (r4v4 java.lang.Object), (r4v13 java.lang.Object) binds: [B:30:0x010d, B:12:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:34:0x011b  */
            /* JADX WARN: Code duplicated, block: B:39:0x014b  */
            /* JADX WARN: Code duplicated, block: B:41:0x014f  */
            /* JADX WARN: Code duplicated, block: B:42:0x0156  */
            /* JADX WARN: Code duplicated, block: B:44:0x015a  */
            /* JADX WARN: Code duplicated, block: B:46:0x015e  */
            /* JADX WARN: Code duplicated, block: B:47:0x016f  */
            /* JADX WARN: Code duplicated, block: B:49:0x0184  */
            /* JADX WARN: Code duplicated, block: B:51:0x0188  */
            /* JADX WARN: Code duplicated, block: B:53:0x018c  */
            /* JADX WARN: Code duplicated, block: B:54:0x0199  */
            /* JADX WARN: Code duplicated, block: B:57:0x01aa A[PHI: r0 r1 r2 r4
              0x01aa: PHI (r0v30 kotlinx.coroutines.p2) = (r0v17 kotlinx.coroutines.p2), (r0v38 kotlinx.coroutines.p2) binds: [B:55:0x01a6, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
              0x01aa: PHI (r1v26 androidx.compose.ui.input.pointer.c0) = (r1v13 androidx.compose.ui.input.pointer.c0), (r1v31 androidx.compose.ui.input.pointer.c0) binds: [B:55:0x01a6, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
              0x01aa: PHI (r2v8 androidx.compose.ui.input.pointer.c) = (r2v4 androidx.compose.ui.input.pointer.c), (r2v13 androidx.compose.ui.input.pointer.c) binds: [B:55:0x01a6, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]
              0x01aa: PHI (r4v14 java.lang.Object) = (r4v8 java.lang.Object), (r4v18 java.lang.Object) binds: [B:55:0x01a6, B:9:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:59:0x01ae  */
            /* JADX WARN: Code duplicated, block: B:61:0x01b2  */
            /* JADX WARN: Code duplicated, block: B:62:0x01bf  */
            /* JADX WARN: Code duplicated, block: B:64:0x01db  */
            /* JADX WARN: Code duplicated, block: B:67:0x01f7  */
            /* JADX WARN: Code duplicated, block: B:70:0x0207  */
            /* JADX WARN: Code duplicated, block: B:72:0x0211  */
            /* JADX WARN: Code duplicated, block: B:75:0x0223  */
            /* JADX WARN: Code duplicated, block: B:78:0x0234  */
            /* JADX WARN: Code duplicated, block: B:81:0x0254  */
            /* JADX WARN: Code duplicated, block: B:84:0x0267  */
            /* JADX WARN: Code duplicated, block: B:86:0x026b  */
            /* JADX WARN: Code duplicated, block: B:87:0x0275  */
            /* JADX WARN: Code duplicated, block: B:89:0x0279  */
            /* JADX WARN: Code duplicated, block: B:91:0x0280  */
            /* JADX WARN: Code duplicated, block: B:92:0x02a0  */
            /* JADX WARN: Code duplicated, block: B:94:0x02b3  */
            /* JADX WARN: Code duplicated, block: B:95:0x02bf  */
            /* JADX WARN: Code duplicated, block: B:99:0x02c8  */
            /* JADX WARN: Code restructure failed: missing block: B:25:0x00f8, code lost:
            
                if (r1 == r6) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0135, code lost:
            
                if (androidx.compose.foundation.gestures.c5.l(r2, r22) == r6) goto L80;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r23) {
                /*
                    Method dump skipped, instruction units count: 740
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.input.pointer.l0 l0Var, pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, Function1<? super n0.g, Unit> function1, Function1<? super n0.g, Unit> function2, Function1<? super n0.g, Unit> function3, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f14464c = l0Var;
            this.f14465d = nVar;
            this.f14466e = function1;
            this.f14467f = function2;
            this.f14468g = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            g gVar = new g(this.f14464c, this.f14465d, this.f14466e, this.f14467f, this.f14468g, dVar);
            gVar.f14463b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14462a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f14463b;
                s3 s3Var = new s3(this.f14464c);
                androidx.compose.ui.input.pointer.l0 l0Var = this.f14464c;
                a aVar = new a(s0Var, this.f14465d, this.f14466e, this.f14467f, this.f14468g, s3Var, null);
                this.f14462a = 1;
                if (e3.e(l0Var, aVar, this) == objL) {
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
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$launchAwaitingReset$1", f = "TapGestureDetector.kt", i = {0}, l = {498, 500}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p2 f14507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> f14508d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(kotlinx.coroutines.p2 p2Var, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super h> dVar) {
            super(2, dVar);
            this.f14507c = p2Var;
            this.f14508d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            h hVar = new h(this.f14507c, this.f14508d, dVar);
            hVar.f14506b = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            if (r6.invoke(r1, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r4 = 4
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f14505a
                r2 = 2
                r4 = r2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r6)
                goto L54
            L14:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1c:
                java.lang.Object r1 = r5.f14506b
                r4 = 4
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                r4 = 0
                kotlin.ResultKt.m(r6)
                goto L43
            L26:
                kotlin.ResultKt.m(r6)
                java.lang.Object r6 = r5.f14506b
                r1 = r6
                r4 = 1
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                r4 = 7
                boolean r6 = androidx.compose.foundation.s1.f18598c
                if (r6 == 0) goto L43
                kotlinx.coroutines.p2 r6 = r5.f14507c
                r4 = 4
                r5.f14506b = r1
                r5.f14505a = r3
                java.lang.Object r6 = r6.d1(r5)
                if (r6 != r0) goto L43
                r4 = 5
                goto L52
            L43:
                r4 = 2
                kotlin.jvm.functions.Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r6 = r5.f14508d
                r3 = 0
                r5.f14506b = r3
                r5.f14505a = r2
                r4 = 2
                java.lang.Object r5 = r6.invoke(r1, r5)
                if (r5 != r0) goto L54
            L52:
                r4 = 2
                return r0
            L54:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                r4 = 5
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((h) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0}, l = {androidx.media3.exoplayer.a5.S0}, m = "waitForLongPress", n = {"result"}, s = {"L$0"})
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14511c;

        i(kotlin.coroutines.d<? super i> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14510b = obj;
            this.f14511c |= Integer.MIN_VALUE;
            return c5.z(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$waitForLongPress$2", f = "TapGestureDetector.kt", i = {0, 1}, l = {386, com.google.api.client.http.a0.f115563p}, m = "invokeSuspend", n = {"$this$withTimeout", "$this$withTimeout"}, s = {"L$0", "L$0"})
    @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n88#2:547\n35#2,5:548\n89#2:553\n103#2:554\n35#2,5:555\n104#2:560\n103#2:561\n35#2,5:562\n104#2:567\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$waitForLongPress$2\n*L\n387#1:547\n387#1:548,5\n387#1:553\n399#1:554\n399#1:555,5\n399#1:560\n410#1:561\n410#1:562,5\n410#1:567\n*E\n"})
    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2<androidx.compose.ui.input.pointer.c, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.input.pointer.s f14514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.h<g3> f14515d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.input.pointer.s sVar, kotlin.jvm.internal.i1.h<g3> hVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.f14514c = sVar;
            this.f14515d = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.f14514c, this.f14515d, dVar);
            jVar.f14513b = obj;
            return jVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0073  */
        /* JADX WARN: Code duplicated, block: B:23:0x007c  */
        /* JADX WARN: Code duplicated, block: B:27:0x0099  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f5 A[LOOP:1: B:17:0x005c->B:42:0x00f5, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:48:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:49:0x006b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:51:0x00b1 A[ADDED_TO_REGION, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v1, types: [T, androidx.compose.foundation.gestures.g3$b] */
        /* JADX WARN: Type inference failed for: r15v11, types: [T, androidx.compose.foundation.gestures.g3$a] */
        /* JADX WARN: Type inference failed for: r15v12, types: [T, androidx.compose.foundation.gestures.g3$c] */
        /* JADX WARN: Type inference failed for: r15v19, types: [T, androidx.compose.foundation.gestures.g3$a] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c4 -> B:35:0x00c7). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 273
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((j) create(cVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {352, 366}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f14517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f14518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14519d;

        k(kotlin.coroutines.d<? super k> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14518c = obj;
            this.f14519d |= Integer.MIN_VALUE;
            return c5.B(null, null, this);
        }
    }

    public static /* synthetic */ Object A(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Main;
        }
        return z(cVar, sVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3 A[LOOP:1: B:23:0x0085->B:45:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bf A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cc -> B:13:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object B(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r17, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.s r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r19) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.B(androidx.compose.ui.input.pointer.c, androidx.compose.ui.input.pointer.s, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object D(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Main;
        }
        return B(cVar, sVar, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0059 -> B:18:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object e(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r8, boolean r9, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.s r10, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.gestures.c5.b
            if (r0 == 0) goto L14
            r0 = r11
            r7 = 6
            androidx.compose.foundation.gestures.c5$b r0 = (androidx.compose.foundation.gestures.c5.b) r0
            int r1 = r0.f14426e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f14426e = r1
            goto L19
        L14:
            androidx.compose.foundation.gestures.c5$b r0 = new androidx.compose.foundation.gestures.c5$b
            r0.<init>(r11)
        L19:
            java.lang.Object r11 = r0.f14425d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14426e
            r3 = 1
            r7 = 2
            if (r2 == 0) goto L49
            if (r2 != r3) goto L3d
            r7 = 7
            boolean r8 = r0.f14424c
            java.lang.Object r9 = r0.f14423b
            androidx.compose.ui.input.pointer.s r9 = (androidx.compose.ui.input.pointer.s) r9
            r7 = 4
            java.lang.Object r10 = r0.f14422a
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.ui.input.pointer.c) r10
            kotlin.ResultKt.m(r11)
            r6 = r9
            r7 = 2
            r9 = r8
            r8 = r10
            r10 = r6
            r7 = 5
            goto L5c
        L3d:
            r7 = 0
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 0
            java.lang.String r9 = "oeser/lr/ n//ct/lhtkif/i/tebo ci   ruwa oeovume/eso"
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L49:
            kotlin.ResultKt.m(r11)
        L4c:
            r0.f14422a = r8
            r0.f14423b = r10
            r0.f14424c = r9
            r0.f14426e = r3
            java.lang.Object r11 = r8.I6(r10, r0)
            r7 = 0
            if (r11 != r1) goto L5c
            return r1
        L5c:
            androidx.compose.ui.input.pointer.q r11 = (androidx.compose.ui.input.pointer.q) r11
            r2 = 2
            r4 = 0
            r5 = 3
            r5 = 0
            boolean r2 = v(r11, r9, r5, r2, r4)
            r7 = 6
            if (r2 == 0) goto L4c
            r7 = 0
            java.util.List r8 = r11.e()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.e(androidx.compose.ui.input.pointer.c, boolean, androidx.compose.ui.input.pointer.s, kotlin.coroutines.d):java.lang.Object");
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object f(androidx.compose.ui.input.pointer.c cVar, boolean z10, kotlin.coroutines.d dVar) {
        return e(cVar, z10, androidx.compose.ui.input.pointer.s.Main, dVar);
    }

    public static /* synthetic */ Object g(androidx.compose.ui.input.pointer.c cVar, boolean z10, androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Main;
        }
        return e(cVar, z10, sVar, dVar);
    }

    public static /* synthetic */ Object h(androidx.compose.ui.input.pointer.c cVar, boolean z10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return f(cVar, z10, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005c -> B:19:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object i(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.c r6, boolean r7, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.s r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.c5.c
            if (r0 == 0) goto L15
            r0 = r9
            r5 = 6
            androidx.compose.foundation.gestures.c5$c r0 = (androidx.compose.foundation.gestures.c5.c) r0
            int r1 = r0.f14431e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 4
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.f14431e = r1
            goto L1a
        L15:
            androidx.compose.foundation.gestures.c5$c r0 = new androidx.compose.foundation.gestures.c5$c
            r0.<init>(r9)
        L1a:
            java.lang.Object r9 = r0.f14430d
            r5 = 4
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 2
            int r2 = r0.f14431e
            r5 = 5
            r3 = 1
            if (r2 == 0) goto L4c
            if (r2 != r3) goto L40
            boolean r6 = r0.f14429c
            java.lang.Object r7 = r0.f14428b
            r5 = 7
            androidx.compose.ui.input.pointer.s r7 = (androidx.compose.ui.input.pointer.s) r7
            java.lang.Object r8 = r0.f14427a
            r5 = 7
            androidx.compose.ui.input.pointer.c r8 = (androidx.compose.ui.input.pointer.c) r8
            kotlin.ResultKt.m(r9)
            r4 = r7
            r5 = 3
            r7 = r6
            r6 = r8
            r8 = r4
            r5 = 3
            goto L60
        L40:
            r5 = 7
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "ol/mef/mnu/ruolrrn/c iehie tktsob/e  /oa /tevoce iw"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            r5 = 2
            throw r6
        L4c:
            kotlin.ResultKt.m(r9)
        L4f:
            r0.f14427a = r6
            r0.f14428b = r8
            r5 = 3
            r0.f14429c = r7
            r0.f14431e = r3
            java.lang.Object r9 = r6.I6(r8, r0)
            if (r9 != r1) goto L60
            r5 = 2
            return r1
        L60:
            androidx.compose.ui.input.pointer.q r9 = (androidx.compose.ui.input.pointer.q) r9
            boolean r2 = u(r9, r7, r3)
            if (r2 == 0) goto L4f
            r5 = 5
            java.util.List r6 = r9.e()
            r5 = 7
            r7 = 0
            java.lang.Object r6 = r6.get(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.i(androidx.compose.ui.input.pointer.c, boolean, androidx.compose.ui.input.pointer.s, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object j(androidx.compose.ui.input.pointer.c cVar, boolean z10, androidx.compose.ui.input.pointer.s sVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            sVar = androidx.compose.ui.input.pointer.s.Main;
        }
        return i(cVar, z10, sVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(androidx.compose.ui.input.pointer.c cVar, androidx.compose.ui.input.pointer.c0 c0Var, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.c0> dVar) {
        int i10 = 7 | 0;
        return cVar.q5(cVar.getViewConfiguration().i(), new d(c0Var, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f A[LOOP:0: B:19:0x005d->B:20:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[LOOP:1: B:22:0x0077->B:26:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0079
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object l(androidx.compose.ui.input.pointer.c r9, kotlin.coroutines.d<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.c5.e
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.c5$e r0 = (androidx.compose.foundation.gestures.c5.e) r0
            int r1 = r0.f14438c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14438c = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.c5$e r0 = new androidx.compose.foundation.gestures.c5$e
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14437b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r8 = 4
            int r2 = r0.f14438c
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L31
            java.lang.Object r9 = r0.f14436a
            r8 = 6
            androidx.compose.ui.input.pointer.c r9 = (androidx.compose.ui.input.pointer.c) r9
            r8 = 2
            kotlin.ResultKt.m(r10)
            r8 = 4
            goto L4c
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = " c/uo /eitnho/ro/r e/ l/  a/cwvotefek/uboirleiotems"
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            r8 = 2
            throw r9
        L3c:
            r8 = 3
            kotlin.ResultKt.m(r10)
        L40:
            r0.f14436a = r9
            r0.f14438c = r3
            r10 = 0
            java.lang.Object r10 = androidx.compose.ui.input.pointer.c.d1(r9, r10, r0, r3, r10)
            if (r10 != r1) goto L4c
            return r1
        L4c:
            androidx.compose.ui.input.pointer.q r10 = (androidx.compose.ui.input.pointer.q) r10
            java.util.List r2 = r10.e()
            r4 = r2
            r8 = 5
            java.util.Collection r4 = (java.util.Collection) r4
            int r4 = r4.size()
            r8 = 2
            r5 = 0
            r6 = r5
        L5d:
            if (r6 >= r4) goto L6b
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.c0 r7 = (androidx.compose.ui.input.pointer.c0) r7
            r7.a()
            int r6 = r6 + 1
            goto L5d
        L6b:
            java.util.List r10 = r10.e()
            r2 = r10
            r8 = 3
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L77:
            if (r5 >= r2) goto L8d
            r8 = 0
            java.lang.Object r4 = r10.get(r5)
            androidx.compose.ui.input.pointer.c0 r4 = (androidx.compose.ui.input.pointer.c0) r4
            r8 = 6
            boolean r4 = r4.w()
            r8 = 5
            if (r4 == 0) goto L89
            goto L40
        L89:
            int r5 = r5 + 1
            r8 = 6
            goto L77
        L8d:
            kotlin.Unit r9 = kotlin.Unit.f312394a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.c5.l(androidx.compose.ui.input.pointer.c, kotlin.coroutines.d):java.lang.Object");
    }

    @Nullable
    public static final Object m(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @NotNull pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @Nullable Function1<? super n0.g, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new f(l0Var, nVar, function1, new s3(l0Var), null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public static /* synthetic */ Object n(androidx.compose.ui.input.pointer.l0 l0Var, pj.n nVar, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nVar = f14420a;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return m(l0Var, nVar, function1, dVar);
    }

    @Nullable
    public static final Object o(@NotNull androidx.compose.ui.input.pointer.l0 l0Var, @Nullable Function1<? super n0.g, Unit> function1, @Nullable Function1<? super n0.g, Unit> function2, @NotNull pj.n<? super r3, ? super n0.g, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @Nullable Function1<? super n0.g, Unit> function3, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new g(l0Var, nVar, function2, function1, function3, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    public static /* synthetic */ Object p(androidx.compose.ui.input.pointer.l0 l0Var, Function1 function1, Function1 function2, pj.n nVar, Function1 function3, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        if ((i10 & 4) != 0) {
            nVar = f14420a;
        }
        if ((i10 & 8) != 0) {
            function3 = null;
        }
        return o(l0Var, function1, function2, nVar, function3, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlinx.coroutines.u0 q() {
        return androidx.compose.foundation.s1.f18598c ? kotlinx.coroutines.u0.UNDISPATCHED : kotlinx.coroutines.u0.DEFAULT;
    }

    private static /* synthetic */ void r() {
    }

    public static final boolean s() {
        return androidx.compose.foundation.s1.f18598c;
    }

    @b3
    @kotlin.l(message = "This flag has been moved to ComposeFoundationFlags and renamed to isDetectTapGesturesImmediateCoroutineDispatchEnabled. For compatibility,  DetectTapGesturesEnableNewDispatchingBehavior controls the new flag (isDetectTapGesturesImmediateCoroutineDispatchEnabled). Please use  isDetectTapGesturesImmediateCoroutineDispatchEnabled instead.", replaceWith = @kotlin.b1(expression = "isDetectTapGesturesImmediateCoroutineDispatchEnabled", imports = {"androidx.compose.foundation.ComposeFoundationFlags.isDetectTapGesturesImmediateCoroutineDispatchEnabled"}))
    public static /* synthetic */ void t() {
    }

    public static final boolean u(@NotNull androidx.compose.ui.input.pointer.q qVar, boolean z10, boolean z11) {
        if (z11) {
            List<androidx.compose.ui.input.pointer.c0> listE = qVar.e();
            int size = listE.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    if (androidx.compose.ui.input.pointer.v.o(qVar.d())) {
                        break;
                    }
                    return false;
                }
                if (!androidx.compose.ui.input.pointer.r0.i(listE.get(i10).C(), androidx.compose.ui.input.pointer.r0.f39113b.b())) {
                    break;
                }
                i10++;
            }
        }
        List<androidx.compose.ui.input.pointer.c0> listE2 = qVar.e();
        int size2 = listE2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            androidx.compose.ui.input.pointer.c0 c0Var = listE2.get(i11);
            if (!(z10 ? androidx.compose.ui.input.pointer.r.b(c0Var) : androidx.compose.ui.input.pointer.r.c(c0Var))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean v(androidx.compose.ui.input.pointer.q qVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = d5.a();
        }
        return u(qVar, z10, z11);
    }

    private static final kotlinx.coroutines.p2 w(kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.p2 p2Var, kotlinx.coroutines.u0 u0Var, Function2<? super kotlinx.coroutines.s0, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return kotlinx.coroutines.k.f(s0Var, null, u0Var, new h(p2Var, function2, null), 1, null);
    }

    static /* synthetic */ kotlinx.coroutines.p2 x(kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.p2 p2Var, kotlinx.coroutines.u0 u0Var, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            u0Var = q();
        }
        return w(s0Var, p2Var, u0Var, function2);
    }

    public static final void y(boolean z10) {
        androidx.compose.foundation.s1 s1Var = androidx.compose.foundation.s1.f18596a;
        androidx.compose.foundation.s1.f18598c = z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.compose.foundation.gestures.g3$a] */
    @Nullable
    public static final Object z(@NotNull androidx.compose.ui.input.pointer.c cVar, @NotNull androidx.compose.ui.input.pointer.s sVar, @NotNull kotlin.coroutines.d<? super g3> dVar) {
        i iVar;
        kotlin.jvm.internal.i1.h hVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i10 = iVar.f14511c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f14511c = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f14510b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = iVar.f14511c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
                hVar2.f312751a = g3.a.f14593b;
                long j10 = cVar.getViewConfiguration().j();
                j jVar = new j(sVar, hVar2, null);
                iVar.f14509a = hVar2;
                iVar.f14511c = 1;
                if (cVar.Y1(j10, jVar, iVar) == objL) {
                    return objL;
                }
                hVar = hVar2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = (kotlin.jvm.internal.i1.h) iVar.f14509a;
                ResultKt.m(obj);
            }
            return hVar.f312751a;
        } catch (androidx.compose.ui.input.pointer.t unused) {
            return g3.c.f14597b;
        }
    }
}
