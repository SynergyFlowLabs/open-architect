package kotlinx.coroutines.flow;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
public final /* synthetic */ class f0 {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {210, 214, 215, 221}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u0 f314200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T> f314201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ j0<T> f314202d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ T f314203e;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.f0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class C2279a extends kotlin.coroutines.jvm.internal.o implements Function2<Integer, kotlin.coroutines.d<? super Boolean>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314204a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ int f314205b;

            C2279a(kotlin.coroutines.d<? super C2279a> dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                C2279a c2279a = new C2279a(dVar);
                c2279a.f314205b = ((Number) obj).intValue();
                return c2279a;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, kotlin.coroutines.d<? super Boolean> dVar) {
                return k(num.intValue(), dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f314204a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f314205b > 0);
            }

            public final Object k(int i10, kotlin.coroutines.d<? super Boolean> dVar) {
                return ((C2279a) create(Integer.valueOf(i10), dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {223}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314206a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f314207b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ i<T> f314208c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ j0<T> f314209d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f314210e;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.f0$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2280a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f314211a;

                static {
                    int[] iArr = new int[s0.values().length];
                    try {
                        iArr[s0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[s0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[s0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f314211a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(i<? extends T> iVar, j0<T> j0Var, T t10, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f314208c = iVar;
                this.f314209d = j0Var;
                this.f314210e = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                b bVar = new b(this.f314208c, this.f314209d, this.f314210e, dVar);
                bVar.f314207b = obj;
                return bVar;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314206a;
                int i11 = 5 & 1;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    int i12 = C2280a.f314211a[((s0) this.f314207b).ordinal()];
                    if (i12 == 1) {
                        i<T> iVar = this.f314208c;
                        o0 o0Var = this.f314209d;
                        this.f314206a = 1;
                        if (iVar.collect(o0Var, this) == objL) {
                            return objL;
                        }
                    } else if (i12 != 2) {
                        if (i12 != 3) {
                            throw new kotlin.k0();
                        }
                        T t10 = this.f314210e;
                        if (t10 == q0.f314763a) {
                            this.f314209d.d();
                        } else {
                            kotlin.coroutines.jvm.internal.b.a(this.f314209d.f(t10));
                        }
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
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u0 u0Var, i<? extends T> iVar, j0<T> j0Var, T t10, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314200b = u0Var;
            this.f314201c = iVar;
            this.f314202d = j0Var;
            this.f314203e = t10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f314200b, this.f314201c, this.f314202d, this.f314203e, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0075  */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (r9.collect(r1, r8) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
        
            if (kotlinx.coroutines.flow.k.C(r9, r1, r8) == r0) goto L28;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f314199a
                r2 = 4
                r7 = r2
                r3 = 1
                r3 = 3
                r4 = 2
                r7 = 5
                r5 = 1
                if (r1 == 0) goto L2b
                if (r1 == r5) goto L27
                if (r1 == r4) goto L22
                if (r1 == r3) goto L27
                if (r1 != r2) goto L18
                goto L27
            L18:
                r7 = 4
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                r7 = 7
                throw r8
            L22:
                r7 = 7
                kotlin.ResultKt.m(r9)
                goto L69
            L27:
                kotlin.ResultKt.m(r9)
                goto L9e
            L2b:
                r7 = 5
                kotlin.ResultKt.m(r9)
                kotlinx.coroutines.flow.u0 r9 = r8.f314200b
                kotlinx.coroutines.flow.u0$a r1 = kotlinx.coroutines.flow.u0.f314834a
                kotlinx.coroutines.flow.u0 r6 = r1.c()
                if (r9 != r6) goto L48
                r7 = 2
                kotlinx.coroutines.flow.i<T> r9 = r8.f314201c
                kotlinx.coroutines.flow.j0<T> r1 = r8.f314202d
                r8.f314199a = r5
                r7 = 2
                java.lang.Object r8 = r9.collect(r1, r8)
                if (r8 != r0) goto L9e
                goto L9d
            L48:
                kotlinx.coroutines.flow.u0 r9 = r8.f314200b
                r7 = 2
                kotlinx.coroutines.flow.u0 r1 = r1.d()
                r5 = 0
                r7 = r7 | r5
                if (r9 != r1) goto L77
                kotlinx.coroutines.flow.j0<T> r9 = r8.f314202d
                kotlinx.coroutines.flow.z0 r9 = r9.i()
                r7 = 0
                kotlinx.coroutines.flow.f0$a$a r1 = new kotlinx.coroutines.flow.f0$a$a
                r7 = 6
                r1.<init>(r5)
                r8.f314199a = r4
                java.lang.Object r9 = kotlinx.coroutines.flow.k.x0(r9, r1, r8)
                if (r9 != r0) goto L69
                goto L9d
            L69:
                kotlinx.coroutines.flow.i<T> r9 = r8.f314201c
                kotlinx.coroutines.flow.j0<T> r1 = r8.f314202d
                r8.f314199a = r3
                java.lang.Object r8 = r9.collect(r1, r8)
                if (r8 != r0) goto L9e
                r7 = 6
                goto L9d
            L77:
                r7 = 1
                kotlinx.coroutines.flow.u0 r9 = r8.f314200b
                r7 = 1
                kotlinx.coroutines.flow.j0<T> r1 = r8.f314202d
                kotlinx.coroutines.flow.z0 r1 = r1.i()
                kotlinx.coroutines.flow.i r9 = r9.a(r1)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.i0(r9)
                kotlinx.coroutines.flow.f0$a$b r1 = new kotlinx.coroutines.flow.f0$a$b
                kotlinx.coroutines.flow.i<T> r3 = r8.f314201c
                kotlinx.coroutines.flow.j0<T> r4 = r8.f314202d
                T r6 = r8.f314203e
                r1.<init>(r3, r4, r6, r5)
                r8.f314199a = r2
                java.lang.Object r8 = kotlinx.coroutines.flow.k.C(r9, r1, r8)
                r7 = 1
                if (r8 != r0) goto L9e
            L9d:
                return r0
            L9e:
                kotlin.Unit r8 = kotlin.Unit.f312394a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.f0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {0}, l = {337}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T> f314214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.x<Result<z0<T>>> f314215d;

        @SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/FlowKt__ShareKt$launchSharingDeferred$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
        static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i1.h<k0<T>> f314216a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.s0 f314217b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.x<Result<z0<T>>> f314218c;

            a(i1.h<k0<T>> hVar, kotlinx.coroutines.s0 s0Var, kotlinx.coroutines.x<Result<z0<T>>> xVar) {
                this.f314216a = hVar;
                this.f314217b = s0Var;
                this.f314218c = xVar;
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, kotlinx.coroutines.flow.k0, kotlinx.coroutines.flow.z0] */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                i1.h<k0<T>> hVar = this.f314216a;
                k0<T> k0Var = hVar.f312751a;
                if (k0Var != null) {
                    k0Var.setValue(t10);
                } else {
                    kotlinx.coroutines.s0 s0Var = this.f314217b;
                    kotlinx.coroutines.x<Result<z0<T>>> xVar = this.f314218c;
                    ?? r10 = (T) b1.a(t10);
                    Result.a aVar = Result.Companion;
                    xVar.R(Result.a(Result.m785constructorimpl(new m0(r10, s2.A(s0Var.getCoroutineContext())))));
                    hVar.f312751a = r10;
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(i<? extends T> iVar, kotlinx.coroutines.x<Result<z0<T>>> xVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f314214c = iVar;
            this.f314215d = xVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f314214c, this.f314215d, dVar);
            bVar.f314213b = obj;
            return bVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.f0$b for r7v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r6 = 1
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f314212a
                r6 = 4
                r2 = 1
                if (r1 == 0) goto L24
                r6 = 3
                if (r1 != r2) goto L19
                java.lang.Object r0 = r7.f314213b
                kotlin.jvm.internal.i1$h r0 = (kotlin.jvm.internal.i1.h) r0
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L16
                goto L4a
            L16:
                r8 = move-exception
                r6 = 7
                goto L71
            L19:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "ensn/e/ah/c/wke  /i bilmoecriu /oloof/ttevsour e tr"
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r6 = 1
                r7.<init>(r8)
                throw r7
            L24:
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f314213b
                r6 = 1
                kotlinx.coroutines.s0 r8 = (kotlinx.coroutines.s0) r8
                kotlin.jvm.internal.i1$h r1 = new kotlin.jvm.internal.i1$h     // Catch: java.lang.Throwable -> L16
                r1.<init>()     // Catch: java.lang.Throwable -> L16
                kotlinx.coroutines.flow.i<T> r3 = r7.f314214c     // Catch: java.lang.Throwable -> L16
                r6 = 1
                kotlinx.coroutines.flow.f0$b$a r4 = new kotlinx.coroutines.flow.f0$b$a     // Catch: java.lang.Throwable -> L16
                kotlinx.coroutines.x<kotlin.Result<kotlinx.coroutines.flow.z0<T>>> r5 = r7.f314215d     // Catch: java.lang.Throwable -> L16
                r6 = 3
                r4.<init>(r1, r8, r5)     // Catch: java.lang.Throwable -> L16
                r7.f314213b = r1     // Catch: java.lang.Throwable -> L16
                r7.f314212a = r2     // Catch: java.lang.Throwable -> L16
                r6 = 5
                java.lang.Object r8 = r3.collect(r4, r7)     // Catch: java.lang.Throwable -> L16
                r6 = 7
                if (r8 != r0) goto L49
                return r0
            L49:
                r0 = r1
            L4a:
                T r8 = r0.f312751a     // Catch: java.lang.Throwable -> L16
                if (r8 != 0) goto L6d
                r6 = 3
                kotlinx.coroutines.x<kotlin.Result<kotlinx.coroutines.flow.z0<T>>> r8 = r7.f314215d     // Catch: java.lang.Throwable -> L16
                kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L16
                r6 = 7
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L16
                java.lang.String r1 = "Flow is empty"
                r6 = 2
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L16
                r6 = 0
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)     // Catch: java.lang.Throwable -> L16
                java.lang.Object r0 = kotlin.Result.m785constructorimpl(r0)     // Catch: java.lang.Throwable -> L16
                kotlin.Result r0 = kotlin.Result.a(r0)     // Catch: java.lang.Throwable -> L16
                r6 = 6
                r8.R(r0)     // Catch: java.lang.Throwable -> L16
            L6d:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                r6 = 2
                return r7
            L71:
                kotlinx.coroutines.x<kotlin.Result<kotlinx.coroutines.flow.z0<T>>> r7 = r7.f314215d
                r7.f(r8)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.f0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt", f = "Share.kt", i = {}, l = {326}, m = "stateIn", n = {}, s = {})
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f314219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f314220b;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314219a = obj;
            this.f314220b |= Integer.MIN_VALUE;
            return k.P1(null, null, this);
        }
    }

    @NotNull
    public static final <T> o0<T> a(@NotNull j0<T> j0Var) {
        return new l0(j0Var, null);
    }

    @NotNull
    public static final <T> z0<T> b(@NotNull k0<T> k0Var) {
        return new m0(k0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    private static final <T> t0<T> c(i<? extends T> iVar, int i10) {
        kotlinx.coroutines.flow.internal.e eVar;
        i<T> iVarJ;
        int iU = kotlin.ranges.r.u(i10, kotlinx.coroutines.channels.p.N2.a()) - i10;
        if (!(iVar instanceof kotlinx.coroutines.flow.internal.e) || (iVarJ = (eVar = (kotlinx.coroutines.flow.internal.e) iVar).j()) == null) {
            return new t0<>(iVar, iU, kotlinx.coroutines.channels.j.SUSPEND, kotlin.coroutines.h.f312451a);
        }
        int i11 = eVar.f314496b;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iU = i11;
        } else if (eVar.f314497c == kotlinx.coroutines.channels.j.SUSPEND) {
            if (i11 == 0) {
                iU = 0;
            }
        } else if (i10 == 0) {
            iU = 1;
        } else {
            iU = 0;
        }
        return new t0<>(iVarJ, iU, eVar.f314497c, eVar.f314495a);
    }

    private static final <T> p2 d(kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, i<? extends T> iVar, j0<T> j0Var, u0 u0Var, T t10) {
        return kotlinx.coroutines.i.d(s0Var, coroutineContext, Intrinsics.areEqual(u0Var, u0.f314834a.c()) ? kotlinx.coroutines.u0.DEFAULT : kotlinx.coroutines.u0.UNDISPATCHED, new a(u0Var, iVar, j0Var, t10, null));
    }

    private static final <T> void e(kotlinx.coroutines.s0 s0Var, CoroutineContext coroutineContext, i<? extends T> iVar, kotlinx.coroutines.x<Result<z0<T>>> xVar) {
        int i10 = 7 >> 0;
        kotlinx.coroutines.k.f(s0Var, coroutineContext, null, new b(iVar, xVar, null), 2, null);
    }

    @NotNull
    public static final <T> o0<T> f(@NotNull o0<? extends T> o0Var, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new e1(o0Var, function2);
    }

    @NotNull
    public static final <T> o0<T> g(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull u0 u0Var, int i10) {
        t0 t0VarC = c(iVar, i10);
        j0 j0VarA = q0.a(i10, t0VarC.f314831b, t0VarC.f314832c);
        return new l0(j0VarA, d(s0Var, t0VarC.f314833d, t0VarC.f314830a, j0VarA, u0Var, q0.f314763a));
    }

    public static /* synthetic */ o0 h(i iVar, kotlinx.coroutines.s0 s0Var, u0 u0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return k.I1(iVar, s0Var, u0Var, i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public static final <T> Object i(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull kotlin.coroutines.d<? super z0<? extends T>> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f314220b;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f314220b = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objQ = cVar.f314219a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f314220b;
        if (i11 == 0) {
            ResultKt.m(objQ);
            t0 t0VarC = c(iVar, 1);
            kotlinx.coroutines.x xVarB = kotlinx.coroutines.z.b((p2) s0Var.getCoroutineContext().get(p2.M2));
            e(s0Var, t0VarC.f314833d, t0VarC.f314830a, xVarB);
            cVar.f314220b = 1;
            objQ = xVarB.q(cVar);
            if (objQ == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(objQ);
        }
        Object objJ = ((Result) objQ).j();
        ResultKt.m(objJ);
        return objJ;
    }

    @NotNull
    public static final <T> z0<T> j(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull u0 u0Var, T t10) {
        t0 t0VarC = c(iVar, 1);
        k0 k0VarA = b1.a(t10);
        return new m0(k0VarA, d(s0Var, t0VarC.f314833d, t0VarC.f314830a, k0VarA, u0Var, t10));
    }
}
