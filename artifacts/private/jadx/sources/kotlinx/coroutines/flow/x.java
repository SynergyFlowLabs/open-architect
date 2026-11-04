package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
final /* synthetic */ class x {

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {212}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f314842c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314841b = obj;
            this.f314842c |= Integer.MIN_VALUE;
            return x.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n143#2,13:109\n156#2,6:123\n375#3:122\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n155#1:122\n*E\n"})
    public static final class b<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n f314844b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {110, me.relex.circleindicator.a.f332619e, 124}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", "e", "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314846b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314848d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314849e;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314845a = obj;
                this.f314846b |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(i iVar, pj.n nVar) {
            this.f314843a = iVar;
            this.f314844b = nVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0018  */
        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
            a aVar;
            kotlinx.coroutines.flow.internal.w wVar;
            kotlinx.coroutines.flow.internal.w wVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314846b;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314846b = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f314845a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314846b;
            try {
                try {
                    if (i11 == 0) {
                        ResultKt.m(obj);
                        i iVar = this.f314843a;
                        aVar.f314848d = this;
                        aVar.f314849e = jVar;
                        aVar.f314846b = 1;
                        if (iVar.collect(jVar, aVar) != objL) {
                        }
                        return objL;
                    }
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Throwable th2 = (Throwable) aVar.f314848d;
                            ResultKt.m(obj);
                            throw th2;
                        }
                        if (i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wVar2 = (kotlinx.coroutines.flow.internal.w) aVar.f314848d;
                        try {
                            ResultKt.m(obj);
                            wVar2.releaseIntercepted();
                            return Unit.f312394a;
                        } catch (Throwable th3) {
                            th = th3;
                            wVar2.releaseIntercepted();
                            throw th;
                        }
                    }
                    jVar = (j) aVar.f314849e;
                    this = (b) aVar.f314848d;
                    ResultKt.m(obj);
                    pj.n nVar = this.f314844b;
                    aVar.f314848d = wVar;
                    aVar.f314849e = null;
                    aVar.f314846b = 3;
                    kotlin.jvm.internal.h0.e(6);
                    Object objInvoke = nVar.invoke(wVar, null, aVar);
                    kotlin.jvm.internal.h0.e(7);
                    if (objInvoke != objL) {
                        wVar2 = wVar;
                        wVar2.releaseIntercepted();
                        return Unit.f312394a;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    wVar2 = wVar;
                    wVar2.releaseIntercepted();
                    throw th;
                }
                wVar = new kotlinx.coroutines.flow.internal.w(jVar, aVar.getContext());
            } catch (Throwable th5) {
                b<T> bVar = this;
                f1 f1Var = new f1(th5);
                pj.n nVar2 = bVar.f314844b;
                aVar.f314848d = th5;
                aVar.f314849e = null;
                aVar.f314846b = 2;
                if (x.c(f1Var, nVar2, th5, aVar) != objL) {
                    throw th5;
                }
            }
            return objL;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n178#2,7:109\n185#2,7:117\n375#3:116\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n184#1:116\n*E\n"})
    public static final class c<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314851b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {110, 118}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314852a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314853b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314855d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314856e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f314857f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314852a = obj;
                this.f314853b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(i iVar, Function2 function2) {
            this.f314850a = iVar;
            this.f314851b = function2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0016  */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
        
            if (r8 == r1) goto L29;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.flow.x$c] */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.x$c, kotlinx.coroutines.flow.x$c<T>] */
        /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.w] */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v8, types: [kotlinx.coroutines.flow.internal.w] */
        @Override // kotlinx.coroutines.flow.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r8, kotlin.coroutines.d<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                java.lang.String r6 = "Androeed.ru"
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.x.c.a
                r6 = 4
                if (r0 == 0) goto L16
                r0 = r9
                kotlinx.coroutines.flow.x$c$a r0 = (kotlinx.coroutines.flow.x.c.a) r0
                int r1 = r0.f314853b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f314853b = r1
                goto L1c
            L16:
                r6 = 0
                kotlinx.coroutines.flow.x$c$a r0 = new kotlinx.coroutines.flow.x$c$a
                r0.<init>(r9)
            L1c:
                java.lang.Object r9 = r0.f314852a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f314853b
                r3 = 2
                r4 = 1
                r6 = 4
                if (r2 == 0) goto L54
                if (r2 == r4) goto L43
                if (r2 != r3) goto L3a
                r6 = 6
                java.lang.Object r7 = r0.f314855d
                r6 = 1
                kotlinx.coroutines.flow.internal.w r7 = (kotlinx.coroutines.flow.internal.w) r7
                kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L37
                goto Lab
            L37:
                r8 = move-exception
                r6 = 7
                goto Laf
            L3a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 5
                throw r7
            L43:
                java.lang.Object r7 = r0.f314857f
                r6 = 2
                kotlin.jvm.internal.i1$a r7 = (kotlin.jvm.internal.i1.a) r7
                java.lang.Object r8 = r0.f314856e
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.j) r8
                java.lang.Object r2 = r0.f314855d
                kotlinx.coroutines.flow.x$c r2 = (kotlinx.coroutines.flow.x.c) r2
                kotlin.ResultKt.m(r9)
                goto L7d
            L54:
                kotlin.ResultKt.m(r9)
                r6 = 6
                kotlin.jvm.internal.i1$a r9 = new kotlin.jvm.internal.i1$a
                r6 = 1
                r9.<init>()
                r6 = 2
                r9.f312744a = r4
                kotlinx.coroutines.flow.i r2 = r7.f314850a
                kotlinx.coroutines.flow.x$d r5 = new kotlinx.coroutines.flow.x$d
                r5.<init>(r9, r8)
                r0.f314855d = r7
                r6 = 6
                r0.f314856e = r8
                r6 = 4
                r0.f314857f = r9
                r0.f314853b = r4
                java.lang.Object r2 = r2.collect(r5, r0)
                if (r2 != r1) goto L79
                goto Laa
            L79:
                r2 = r7
                r2 = r7
                r7 = r9
                r7 = r9
            L7d:
                boolean r7 = r7.f312744a
                if (r7 == 0) goto Lb3
                kotlinx.coroutines.flow.internal.w r7 = new kotlinx.coroutines.flow.internal.w
                kotlin.coroutines.CoroutineContext r9 = r0.getContext()
                r6 = 2
                r7.<init>(r8, r9)
                r6 = 7
                kotlin.jvm.functions.Function2 r8 = r2.f314851b     // Catch: java.lang.Throwable -> L37
                r6 = 2
                r0.f314855d = r7     // Catch: java.lang.Throwable -> L37
                r9 = 0
                r0.f314856e = r9     // Catch: java.lang.Throwable -> L37
                r6 = 2
                r0.f314857f = r9     // Catch: java.lang.Throwable -> L37
                r0.f314853b = r3     // Catch: java.lang.Throwable -> L37
                r9 = 6
                kotlin.jvm.internal.h0.e(r9)     // Catch: java.lang.Throwable -> L37
                r6 = 7
                java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L37
                r9 = 1
                r9 = 7
                r6 = 4
                kotlin.jvm.internal.h0.e(r9)     // Catch: java.lang.Throwable -> L37
                if (r8 != r1) goto Lab
            Laa:
                return r1
            Lab:
                r7.releaseIntercepted()
                goto Lb3
            Laf:
                r7.releaseIntercepted()
                throw r8
            Lb3:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x.c.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    static final class d<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.a f314858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<T> f314859b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {181}, m = "emit", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314860a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d<T> f314861b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314862c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(d<? super T> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(dVar2);
                this.f314861b = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314860a = obj;
                this.f314862c |= Integer.MIN_VALUE;
                return this.f314861b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        d(i1.a aVar, j<? super T> jVar) {
            this.f314858a = aVar;
            this.f314859b = jVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314862c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314862c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314860a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314862c;
            int i12 = 3 >> 1;
            if (i11 == 0) {
                ResultKt.m(obj);
                this.f314858a.f312744a = false;
                j<T> jVar = this.f314859b;
                aVar.f314862c = 1;
                if (jVar.emit(t10, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n73#2:109\n74#2,7:111\n375#3:110\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n73#1:110\n*E\n"})
    public static final class e<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2 f314863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f314864b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.B, androidx.media3.extractor.metadata.dvbsi.b.f67479d}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314865a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314866b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f314868d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f314869e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f314870f;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314865a = obj;
                this.f314866b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(Function2 function2, i iVar) {
            this.f314863a = function2;
            this.f314864b = iVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
        
            if (r6.collect(r7, r0) == r1) goto L27;
         */
        @Override // kotlinx.coroutines.flow.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.j<? super T> r7, kotlin.coroutines.d<? super kotlin.Unit> r8) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r5 = "Androeed.ru"
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.x.e.a
                if (r0 == 0) goto L17
                r0 = r8
                r0 = r8
                kotlinx.coroutines.flow.x$e$a r0 = (kotlinx.coroutines.flow.x.e.a) r0
                int r1 = r0.f314866b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L17
                r5 = 7
                int r1 = r1 - r2
                r0.f314866b = r1
                goto L1d
            L17:
                kotlinx.coroutines.flow.x$e$a r0 = new kotlinx.coroutines.flow.x$e$a
                r5 = 5
                r0.<init>(r8)
            L1d:
                java.lang.Object r8 = r0.f314865a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                r5 = 0
                int r2 = r0.f314866b
                r3 = 3
                r3 = 2
                r5 = 4
                r4 = 1
                if (r2 == 0) goto L55
                if (r2 == r4) goto L41
                if (r2 != r3) goto L35
                r5 = 4
                kotlin.ResultKt.m(r8)
                goto L99
            L35:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 4
                java.lang.String r7 = "//seio kie/t    wo alr/mlnoesei/rf/ctruto/eouhcv/be"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 6
                throw r6
            L41:
                java.lang.Object r6 = r0.f314870f
                kotlinx.coroutines.flow.internal.w r6 = (kotlinx.coroutines.flow.internal.w) r6
                java.lang.Object r7 = r0.f314869e
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                java.lang.Object r2 = r0.f314868d
                kotlinx.coroutines.flow.x$e r2 = (kotlinx.coroutines.flow.x.e) r2
                r5 = 4
                kotlin.ResultKt.m(r8)     // Catch: java.lang.Throwable -> L53
                r5 = 3
                goto L81
            L53:
                r7 = move-exception
                goto L9f
            L55:
                r5 = 4
                kotlin.ResultKt.m(r8)
                kotlinx.coroutines.flow.internal.w r8 = new kotlinx.coroutines.flow.internal.w
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r5 = 5
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f314863a     // Catch: java.lang.Throwable -> L9d
                r0.f314868d = r6     // Catch: java.lang.Throwable -> L9d
                r5 = 6
                r0.f314869e = r7     // Catch: java.lang.Throwable -> L9d
                r0.f314870f = r8     // Catch: java.lang.Throwable -> L9d
                r0.f314866b = r4     // Catch: java.lang.Throwable -> L9d
                r5 = 1
                r4 = 6
                kotlin.jvm.internal.h0.e(r4)     // Catch: java.lang.Throwable -> L9d
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L9d
                r5 = 7
                r4 = 7
                kotlin.jvm.internal.h0.e(r4)     // Catch: java.lang.Throwable -> L9d
                if (r2 != r1) goto L7f
                goto L98
            L7f:
                r2 = r6
                r6 = r8
            L81:
                r5 = 2
                r6.releaseIntercepted()
                kotlinx.coroutines.flow.i r6 = r2.f314864b
                r8 = 0
                r5 = 2
                r0.f314868d = r8
                r0.f314869e = r8
                r0.f314870f = r8
                r0.f314866b = r3
                java.lang.Object r6 = r6.collect(r7, r0)
                r5 = 2
                if (r6 != r1) goto L99
            L98:
                return r1
            L99:
                r5 = 2
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            L9d:
                r7 = move-exception
                r6 = r8
            L9f:
                r6.releaseIntercepted()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x.e.collect(kotlinx.coroutines.flow.j, kotlin.coroutines.d):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f<R> extends kotlin.coroutines.jvm.internal.o implements Function2<j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i<T> f314873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> f314874d;

        public static final class a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> f314875a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j<R> f314876b;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.x$f$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {38}, m = "emit", n = {}, s = {})
            public static final class C2306a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f314877a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ a<T> f314878b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f314879c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C2306a(a<? super T> aVar, kotlin.coroutines.d<? super C2306a> dVar) {
                    super(dVar);
                    this.f314878b = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f314877a = obj;
                    this.f314879c |= Integer.MIN_VALUE;
                    return this.f314878b.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, j<? super R> jVar) {
                this.f314875a = nVar;
                this.f314876b = jVar;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            public final Object a(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                kotlin.jvm.internal.h0.e(4);
                new C2306a(this, dVar);
                kotlin.jvm.internal.h0.e(5);
                this.f314875a.invoke((j<? super R>) this.f314876b, t10, dVar);
                return Unit.f312394a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                C2306a c2306a;
                if (dVar instanceof C2306a) {
                    c2306a = (C2306a) dVar;
                    int i10 = c2306a.f314879c;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c2306a.f314879c = i10 - Integer.MIN_VALUE;
                    } else {
                        c2306a = new C2306a(this, dVar);
                    }
                } else {
                    c2306a = new C2306a(this, dVar);
                }
                Object obj = c2306a.f314877a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c2306a.f314879c;
                if (i11 == 0) {
                    ResultKt.m(obj);
                    pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314875a;
                    j<R> jVar = this.f314876b;
                    c2306a.f314879c = 1;
                    if (nVar.invoke((j<? super R>) jVar, t10, c2306a) == objL) {
                        return objL;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(i<? extends T> iVar, pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f314873c = iVar;
            this.f314874d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f314873c, this.f314874d, dVar);
            fVar.f314872b = obj;
            return fVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.x$f<R> for r6v4 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f314871a
                r5 = 5
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L10
                kotlin.ResultKt.m(r7)
                goto L35
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 0
                r6.<init>(r7)
                throw r6
            L19:
                kotlin.ResultKt.m(r7)
                r5 = 6
                java.lang.Object r7 = r6.f314872b
                r5 = 3
                kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                kotlinx.coroutines.flow.i<T> r1 = r6.f314873c
                kotlinx.coroutines.flow.x$f$a r3 = new kotlinx.coroutines.flow.x$f$a
                pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r4 = r6.f314874d
                r3.<init>(r4, r7)
                r5 = 6
                r6.f314871a = r2
                java.lang.Object r6 = r1.collect(r3, r6)
                if (r6 != r0) goto L35
                return r0
            L35:
                r5 = 5
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.x$f<R> for r4v3 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r5 = r4.f314872b
                kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.j) r5
                kotlinx.coroutines.flow.i<T> r0 = r4.f314873c
                kotlinx.coroutines.flow.x$f$a r1 = new kotlinx.coroutines.flow.x$f$a
                pj.n<kotlinx.coroutines.flow.j<? super R>, T, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r2 = r4.f314874d
                r1.<init>(r2, r5)
                r3 = 6
                r5 = 0
                kotlin.jvm.internal.h0.e(r5)
                r0.collect(r1, r4)
                r3 = 1
                r4 = 1
                r3 = 0
                kotlin.jvm.internal.h0.e(r4)
                kotlin.Unit r4 = kotlin.Unit.f312394a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.x.f.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    public static final class g<R> implements i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f314880a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.n f314881b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314882a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314883b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314882a = obj;
                this.f314883b |= Integer.MIN_VALUE;
                return g.this.collect(null, this);
            }
        }

        public g(i iVar, pj.n nVar) {
            this.f314880a = iVar;
            this.f314881b = nVar;
        }

        public Object c(j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            i iVar = this.f314880a;
            h hVar = new h(this.f314881b, jVar);
            kotlin.jvm.internal.h0.e(0);
            iVar.collect(hVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            Object objCollect = this.f314880a.collect(new h(this.f314881b, jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    public static final class h<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> f314885a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j<R> f314886b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {49}, m = "emit", n = {}, s = {})
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314887a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h<T> f314888b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f314889c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, kotlin.coroutines.d<? super a> dVar) {
                super(dVar);
                this.f314888b = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314887a = obj;
                this.f314889c |= Integer.MIN_VALUE;
                return this.f314888b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, j<? super R> jVar) {
            this.f314885a = nVar;
            this.f314886b = jVar;
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
        public final Object a(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(this, dVar);
            kotlin.jvm.internal.h0.e(5);
            this.f314885a.invoke(this.f314886b, t10, dVar);
            return Unit.f312394a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0014  */
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
        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i10 = aVar.f314889c;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    aVar.f314889c = i10 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(this, dVar);
                }
            } else {
                aVar = new a(this, dVar);
            }
            Object obj = aVar.f314887a;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = aVar.f314889c;
            if (i11 == 0) {
                ResultKt.m(obj);
                pj.n<j<? super R>, T, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314885a;
                Object obj2 = this.f314886b;
                aVar.f314889c = 1;
                if (nVar.invoke(obj2, t10, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }
    }

    public static final void b(@NotNull j<?> jVar) {
        if (jVar instanceof f1) {
            throw ((f1) jVar).f314221a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final <T> Object c(j<? super T> jVar, pj.n<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f314842c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f314842c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f314841b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f314842c;
        int i12 = 5 ^ 1;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar.f314840a = th2;
                aVar.f314842c = 1;
                if (nVar.invoke(jVar, th2, aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th2 = (Throwable) aVar.f314840a;
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        } catch (Throwable th3) {
            if (th2 != null && th2 != th3) {
                kotlin.p.a(th3, th2);
            }
            throw th3;
        }
    }

    @NotNull
    public static final <T> i<T> d(@NotNull i<? extends T> iVar, @NotNull pj.n<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return new b(iVar, nVar);
    }

    @NotNull
    public static final <T> i<T> e(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new c(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> f(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return new e(function2, iVar);
    }

    @NotNull
    public static final <T, R> i<R> g(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return k.K0(new f(iVar, nVar, null));
    }

    @kotlin.a1
    @NotNull
    public static final <T, R> i<R> h(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return new g(iVar, nVar);
    }
}
