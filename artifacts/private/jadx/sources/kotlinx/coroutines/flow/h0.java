package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n268#1,3:330\n268#1,3:333\n257#1:336\n259#1:338\n268#1,3:339\n257#1:342\n259#1:344\n268#1,3:345\n257#1:348\n259#1:350\n268#1,3:351\n105#2:329\n105#2:337\n105#2:343\n105#2:349\n105#2:354\n105#2:355\n105#2:360\n37#3:356\n36#3,3:357\n37#3:361\n36#3,3:362\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n71#1:330,3\n99#1:333,3\n115#1:336\n115#1:338\n134#1:339,3\n152#1:342\n152#1:344\n173#1:345,3\n193#1:348\n193#1:350\n216#1:351,3\n28#1:329\n115#1:337\n152#1:343\n193#1:349\n233#1:354\n257#1:355\n284#1:360\n283#1:356\n283#1:357,3\n302#1:361\n302#1:362,3\n*E\n"})
final /* synthetic */ class h0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.o f314359b;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.h0$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n116#2,5:259\n*E\n"})
        public static final class C2286a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314360a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314361b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314362c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.o f314363d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2286a(kotlin.coroutines.d dVar, pj.o oVar) {
                super(3, dVar);
                this.f314363d = oVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
            
                if (r1.emit(r9, r8) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    r7 = 1
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r7 = 4
                    int r1 = r8.f314360a
                    r2 = 2
                    r3 = 1
                    r7 = r7 | r3
                    if (r1 == 0) goto L2a
                    r7 = 7
                    if (r1 == r3) goto L21
                    r7 = 7
                    if (r1 != r2) goto L17
                    kotlin.ResultKt.m(r9)
                    goto L67
                L17:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    r7 = 4
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    r7 = 7
                    throw r8
                L21:
                    r7 = 2
                    java.lang.Object r1 = r8.f314361b
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    kotlin.ResultKt.m(r9)
                    goto L59
                L2a:
                    r7 = 0
                    kotlin.ResultKt.m(r9)
                    r7 = 5
                    java.lang.Object r9 = r8.f314361b
                    r1 = r9
                    r7 = 4
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    java.lang.Object r9 = r8.f314362c
                    java.lang.Object[] r9 = (java.lang.Object[]) r9
                    pj.o r4 = r8.f314363d
                    r5 = 0
                    r5 = r9[r5]
                    r7 = 2
                    r6 = r9[r3]
                    r9 = r9[r2]
                    r8.f314361b = r1
                    r8.f314360a = r3
                    r3 = 6
                    kotlin.jvm.internal.h0.e(r3)
                    r7 = 1
                    java.lang.Object r9 = r4.invoke(r5, r6, r9, r8)
                    r7 = 5
                    r3 = 7
                    r7 = 7
                    kotlin.jvm.internal.h0.e(r3)
                    if (r9 != r0) goto L59
                    goto L66
                L59:
                    r3 = 0
                    r8.f314361b = r3
                    r8.f314360a = r2
                    r7 = 6
                    java.lang.Object r8 = r1.emit(r9, r8)
                    r7 = 4
                    if (r8 != r0) goto L67
                L66:
                    return r0
                L67:
                    kotlin.Unit r8 = kotlin.Unit.f312394a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.a.C2286a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                C2286a c2286a = new C2286a(dVar, this.f314363d);
                c2286a.f314361b = jVar;
                c2286a.f314362c = objArr;
                return c2286a.invokeSuspend(Unit.f312394a);
            }
        }

        public a(kotlinx.coroutines.flow.i[] iVarArr, pj.o oVar) {
            this.f314358a = iVarArr;
            this.f314359b = oVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, this.f314358a, h0.r(), new C2286a(null, this.f314359b), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class b<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.p f314365b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n153#2,6:259\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314366a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314367b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314368c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.p f314369d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.p pVar) {
                super(3, dVar);
                this.f314369d = pVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
            
                if (r1.emit(r12, r9) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f314366a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r3) goto L1b
                    if (r1 != r2) goto L13
                    kotlin.ResultKt.m(r12)
                    r10 = 3
                    goto L65
                L13:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L1b:
                    java.lang.Object r1 = r11.f314367b
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    kotlin.ResultKt.m(r12)
                    r9 = r11
                    r10 = 2
                    goto L58
                L25:
                    kotlin.ResultKt.m(r12)
                    java.lang.Object r12 = r11.f314367b
                    r1 = r12
                    r1 = r12
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    r10 = 7
                    java.lang.Object r12 = r11.f314368c
                    java.lang.Object[] r12 = (java.lang.Object[]) r12
                    pj.p r4 = r11.f314369d
                    r10 = 4
                    r5 = 0
                    r5 = r12[r5]
                    r6 = r12[r3]
                    r7 = r12[r2]
                    r8 = 3
                    r8 = r12[r8]
                    r11.f314367b = r1
                    r11.f314366a = r3
                    r12 = 6
                    int r10 = r10 << r12
                    kotlin.jvm.internal.h0.e(r12)
                    r9 = r11
                    r10 = 0
                    java.lang.Object r12 = r4.invoke(r5, r6, r7, r8, r9)
                    r11 = 7
                    r10 = 7
                    kotlin.jvm.internal.h0.e(r11)
                    if (r12 != r0) goto L58
                    r10 = 2
                    goto L64
                L58:
                    r11 = 0
                    r9.f314367b = r11
                    r9.f314366a = r2
                    java.lang.Object r11 = r1.emit(r12, r9)
                    r10 = 3
                    if (r11 != r0) goto L65
                L64:
                    return r0
                L65:
                    r10 = 4
                    kotlin.Unit r11 = kotlin.Unit.f312394a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314369d);
                aVar.f314367b = jVar;
                aVar.f314368c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        public b(kotlinx.coroutines.flow.i[] iVarArr, pj.p pVar) {
            this.f314364a = iVarArr;
            this.f314365b = pVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, this.f314364a, h0.r(), new a(null, this.f314365b), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class c<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314370a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ pj.q f314371b;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n194#2,7:259\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314372a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314373b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314374c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.q f314375d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.q qVar) {
                super(3, dVar);
                this.f314375d = qVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
            
                if (r1.emit(r13, r10) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r12.f314372a
                    r2 = 2
                    r11 = 0
                    r3 = 1
                    if (r1 == 0) goto L27
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    r11 = 1
                    kotlin.ResultKt.m(r13)
                    goto L6c
                L14:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r13)
                    throw r12
                L1c:
                    r11 = 0
                    java.lang.Object r1 = r12.f314373b
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    r11 = 1
                    kotlin.ResultKt.m(r13)
                    r10 = r12
                    goto L5f
                L27:
                    kotlin.ResultKt.m(r13)
                    r11 = 2
                    java.lang.Object r13 = r12.f314373b
                    r1 = r13
                    r11 = 3
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                    r11 = 4
                    java.lang.Object r13 = r12.f314374c
                    r11 = 3
                    java.lang.Object[] r13 = (java.lang.Object[]) r13
                    pj.q r4 = r12.f314375d
                    r5 = 0
                    r5 = r13[r5]
                    r6 = r13[r3]
                    r7 = r13[r2]
                    r11 = 7
                    r8 = 3
                    r8 = r13[r8]
                    r9 = 4
                    r11 = 7
                    r9 = r13[r9]
                    r11 = 7
                    r12.f314373b = r1
                    r12.f314372a = r3
                    r13 = 6
                    r11 = 3
                    kotlin.jvm.internal.h0.e(r13)
                    r10 = r12
                    java.lang.Object r13 = r4.H(r5, r6, r7, r8, r9, r10)
                    r11 = 4
                    r12 = 7
                    kotlin.jvm.internal.h0.e(r12)
                    if (r13 != r0) goto L5f
                    goto L6b
                L5f:
                    r11 = 7
                    r12 = 0
                    r10.f314373b = r12
                    r10.f314372a = r2
                    java.lang.Object r12 = r1.emit(r13, r10)
                    if (r12 != r0) goto L6c
                L6b:
                    return r0
                L6c:
                    kotlin.Unit r12 = kotlin.Unit.f312394a
                    r11 = 6
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314375d);
                aVar.f314373b = jVar;
                aVar.f314374c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        public c(kotlinx.coroutines.flow.i[] iVarArr, pj.q qVar) {
            this.f314370a = iVarArr;
            this.f314371b = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, this.f314370a, h0.r(), new a(null, this.f314371b), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n29#2,2:109\n*E\n"})
    public static final class d<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f314377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n f314378c;

        public d(kotlinx.coroutines.flow.i iVar, kotlinx.coroutines.flow.i iVar2, pj.n nVar) {
            this.f314376a = iVar;
            this.f314377b = iVar2;
            this.f314378c = nVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            int i10 = 2 << 1;
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, new kotlinx.coroutines.flow.i[]{this.f314376a, this.f314377b}, h0.r(), new g(this.f314378c, null), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n234#2,2:109\n*E\n"})
    public static final class e<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314380b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314381a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314382b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314381a = obj;
                this.f314382b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(kotlinx.coroutines.flow.i[] iVarArr, Function2 function2) {
            this.f314379a = iVarArr;
            this.f314380b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f314379a;
            Intrinsics.needClassReification();
            h hVar = new h(this.f314379a);
            Intrinsics.needClassReification();
            int i10 = 1 >> 0;
            i iVar = new i(this.f314380b, null);
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, hVar, iVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f314379a;
            Intrinsics.needClassReification();
            h hVar = new h(this.f314379a);
            Intrinsics.needClassReification();
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, hVar, new i(this.f314380b, null), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n285#2,5:109\n*E\n"})
    public static final class f<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314385b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314386a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314387b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314386a = obj;
                this.f314387b |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(kotlinx.coroutines.flow.i[] iVarArr, Function2 function2) {
            this.f314384a = iVarArr;
            this.f314385b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f314384a;
            Intrinsics.needClassReification();
            j jVar2 = new j(this.f314384a);
            Intrinsics.needClassReification();
            k kVar = new k(this.f314385b, null);
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, jVar2, kVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f314384a;
            Intrinsics.needClassReification();
            j jVar2 = new j(this.f314384a);
            Intrinsics.needClassReification();
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, jVar2, new k(this.f314385b, null), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
    static final class g<R> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314390b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314391c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<T1, T2, kotlin.coroutines.d<? super R>, Object> f314392d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super g> dVar) {
            super(3, dVar);
            this.f314392d = nVar;
            int i10 = 5 >> 3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlinx.coroutines.flow.h0$g<R> for r7v4 'this'  java.lang.Object
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
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r6 = 0
                int r1 = r7.f314389a
                r2 = 2
                r3 = 6
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r8)
                goto L57
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L1c:
                java.lang.Object r1 = r7.f314390b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r8)
                r6 = 5
                goto L49
            L25:
                r6 = 3
                kotlin.ResultKt.m(r8)
                java.lang.Object r8 = r7.f314390b
                r1 = r8
                r6 = 3
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r8 = r7.f314391c
                java.lang.Object[] r8 = (java.lang.Object[]) r8
                r6 = 1
                pj.n<T1, T2, kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r7.f314392d
                r5 = 5
                r5 = 0
                r5 = r8[r5]
                r6 = 6
                r8 = r8[r3]
                r7.f314390b = r1
                r7.f314389a = r3
                java.lang.Object r8 = r4.invoke(r5, r8, r7)
                r6 = 4
                if (r8 != r0) goto L49
                goto L56
            L49:
                r6 = 3
                r3 = 0
                r7.f314390b = r3
                r7.f314389a = r2
                r6 = 5
                java.lang.Object r7 = r1.emit(r8, r7)
                if (r7 != r0) goto L57
            L56:
                return r0
            L57:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
            g gVar = new g(this.f314392d, dVar);
            gVar.f314390b = jVar;
            gVar.f314391c = objArr;
            return gVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class h<T> implements Function0<T[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314393a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
            this.f314393a = iVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final T[] invoke() {
            int length = this.f314393a.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {234, 234}, m = "invokeSuspend", n = {}, s = {})
    public static final class i<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T[], kotlin.coroutines.d<? super R>, Object> f314397d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function2<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super i> dVar) {
            super(3, dVar);
            this.f314397d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f314394a
                r5 = 2
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.m(r7)
                r5 = 3
                goto L52
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1c:
                r5 = 2
                java.lang.Object r1 = r6.f314395b
                r5 = 4
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r5 = 4
                kotlin.ResultKt.m(r7)
                goto L44
            L27:
                r5 = 0
                kotlin.ResultKt.m(r7)
                r5 = 4
                java.lang.Object r7 = r6.f314395b
                r1 = r7
                r1 = r7
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f314396c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                r5 = 3
                kotlin.jvm.functions.Function2<T[], kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r6.f314397d
                r6.f314395b = r1
                r6.f314394a = r3
                java.lang.Object r7 = r4.invoke(r7, r6)
                if (r7 != r0) goto L44
                goto L51
            L44:
                r3 = 7
                r3 = 0
                r6.f314395b = r3
                r6.f314394a = r2
                r5 = 3
                java.lang.Object r6 = r1.emit(r7, r6)
                if (r6 != r0) goto L52
            L51:
                return r0
            L52:
                r5 = 4
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314395b;
            Object objInvoke = this.f314397d.invoke((Object[]) this.f314396c, this);
            kotlin.jvm.internal.h0.e(0);
            jVar.emit(objInvoke, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, T[] tArr, kotlin.coroutines.d<? super Unit> dVar) {
            Intrinsics.needClassReification();
            i iVar = new i(this.f314397d, dVar);
            iVar.f314395b = jVar;
            iVar.f314396c = tArr;
            return iVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class j<T> implements Function0<T[]> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314398a;

        public j(kotlinx.coroutines.flow.i<T>[] iVarArr) {
            this.f314398a = iVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final T[] invoke() {
            int length = this.f314398a.length;
            Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {288, 288}, m = "invokeSuspend", n = {}, s = {})
    public static final class k<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314401c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T[], kotlin.coroutines.d<? super R>, Object> f314402d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(Function2<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super k> dVar) {
            super(3, dVar);
            this.f314402d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L16;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f314399a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                r5 = 7
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.ResultKt.m(r7)
                goto L4d
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1b:
                java.lang.Object r1 = r6.f314400b
                r5 = 2
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                kotlin.ResultKt.m(r7)
                goto L3f
            L24:
                kotlin.ResultKt.m(r7)
                java.lang.Object r7 = r6.f314400b
                r1 = r7
                r5 = 0
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f314401c
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                kotlin.jvm.functions.Function2<T[], kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r6.f314402d
                r6.f314400b = r1
                r6.f314399a = r3
                r5 = 4
                java.lang.Object r7 = r4.invoke(r7, r6)
                if (r7 != r0) goto L3f
                goto L4b
            L3f:
                r3 = 0
                r5 = 5
                r6.f314400b = r3
                r6.f314399a = r2
                java.lang.Object r6 = r1.emit(r7, r6)
                if (r6 != r0) goto L4d
            L4b:
                r5 = 5
                return r0
            L4d:
                r5 = 6
                kotlin.Unit r6 = kotlin.Unit.f312394a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314400b;
            Object objInvoke = this.f314402d.invoke((Object[]) this.f314401c, this);
            kotlin.jvm.internal.h0.e(0);
            jVar.emit(objInvoke, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, T[] tArr, kotlin.coroutines.d<? super Unit> dVar) {
            Intrinsics.needClassReification();
            k kVar = new k(this.f314402d, dVar);
            kVar.f314400b = jVar;
            kVar.f314401c = tArr;
            return kVar.invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class l<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314404b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314405c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.o f314406d;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n72#2,5:270\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314407a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314408b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314409c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.o f314410d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.o oVar) {
                super(3, dVar);
                this.f314410d = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314407a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314408b;
                    Object[] objArr = (Object[]) this.f314409c;
                    pj.o oVar = this.f314410d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f314407a = 1;
                    kotlin.jvm.internal.h0.e(6);
                    Object objInvoke = oVar.invoke(jVar, obj2, obj3, this);
                    kotlin.jvm.internal.h0.e(7);
                    if (objInvoke == objL) {
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

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314410d);
                aVar.f314408b = jVar;
                aVar.f314409c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, pj.o oVar) {
            super(2, dVar);
            this.f314405c = iVarArr;
            this.f314406d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            l lVar = new l(this.f314405c, dVar, this.f314406d);
            lVar.f314404b = obj;
            return lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314403a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314404b;
                kotlinx.coroutines.flow.i[] iVarArr = this.f314405c;
                Function0 function0R = h0.r();
                a aVar = new a(null, this.f314406d);
                this.f314403a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((l) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class m<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314412b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314413c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.o f314414d;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n100#2,5:270\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314415a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314416b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314417c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.o f314418d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.o oVar) {
                super(3, dVar);
                this.f314418d = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314415a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314416b;
                    Object[] objArr = (Object[]) this.f314417c;
                    pj.o oVar = this.f314418d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.f314415a = 1;
                    kotlin.jvm.internal.h0.e(6);
                    Object objInvoke = oVar.invoke(jVar, obj2, obj3, this);
                    kotlin.jvm.internal.h0.e(7);
                    if (objInvoke == objL) {
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

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314418d);
                aVar.f314416b = jVar;
                aVar.f314417c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, pj.o oVar) {
            super(2, dVar);
            this.f314413c = iVarArr;
            this.f314414d = oVar;
            int i10 = 3 << 2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            m mVar = new m(this.f314413c, dVar, this.f314414d);
            mVar.f314412b = obj;
            return mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314411a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314412b;
                kotlinx.coroutines.flow.i[] iVarArr = this.f314413c;
                Function0 function0R = h0.r();
                a aVar = new a(null, this.f314414d);
                this.f314411a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((m) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class n<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.p f314422d;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n135#2,6:270\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314423a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314424b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314425c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.p f314426d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.p pVar) {
                super(3, dVar);
                this.f314426d = pVar;
                int i10 = 7 << 3;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314423a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314424b;
                    Object[] objArr = (Object[]) this.f314425c;
                    pj.p pVar = this.f314426d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f314423a = 1;
                    kotlin.jvm.internal.h0.e(6);
                    Object objInvoke = pVar.invoke(jVar, obj2, obj3, obj4, this);
                    kotlin.jvm.internal.h0.e(7);
                    if (objInvoke == objL) {
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

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314426d);
                aVar.f314424b = jVar;
                aVar.f314425c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, pj.p pVar) {
            super(2, dVar);
            this.f314421c = iVarArr;
            this.f314422d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            n nVar = new n(this.f314421c, dVar, this.f314422d);
            nVar.f314420b = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314419a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314420b;
                kotlinx.coroutines.flow.i[] iVarArr = this.f314421c;
                Function0 function0R = h0.r();
                a aVar = new a(null, this.f314422d);
                this.f314419a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((n) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class o<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314429c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.q f314430d;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n174#2,7:270\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314431a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314432b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314433c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.q f314434d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.q qVar) {
                super(3, dVar);
                this.f314434d = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314431a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314432b;
                    Object[] objArr = (Object[]) this.f314433c;
                    pj.q qVar = this.f314434d;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.f314431a = 1;
                    kotlin.jvm.internal.h0.e(6);
                    Object objH = qVar.H(jVar, obj2, obj3, obj4, obj5, this);
                    kotlin.jvm.internal.h0.e(7);
                    if (objH == objL) {
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

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314434d);
                aVar.f314432b = jVar;
                aVar.f314433c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, pj.q qVar) {
            super(2, dVar);
            this.f314429c = iVarArr;
            this.f314430d = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            o oVar = new o(this.f314429c, dVar, this.f314430d);
            oVar.f314428b = obj;
            return oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314427a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314428b;
                kotlinx.coroutines.flow.i[] iVarArr = this.f314429c;
                Function0 function0R = h0.r();
                a aVar = new a(null, this.f314430d);
                this.f314427a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((o) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class p<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.r f314438d;

        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n217#2,8:270\n*E\n"})
        public static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, Object[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314439a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314440b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314441c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.r f314442d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.coroutines.d dVar, pj.r rVar) {
                super(3, dVar);
                this.f314442d = rVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f314439a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314440b;
                    Object[] objArr = (Object[]) this.f314441c;
                    pj.r rVar = this.f314442d;
                    int i11 = 6 & 0;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.f314439a = 1;
                    kotlin.jvm.internal.h0.e(6);
                    Object objN = rVar.N(jVar, obj2, obj3, obj4, obj5, obj6, this);
                    kotlin.jvm.internal.h0.e(7);
                    if (objN == objL) {
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

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, Object[] objArr, kotlin.coroutines.d<? super Unit> dVar) {
                a aVar = new a(dVar, this.f314442d);
                aVar.f314440b = jVar;
                aVar.f314441c = objArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(kotlinx.coroutines.flow.i[] iVarArr, kotlin.coroutines.d dVar, pj.r rVar) {
            super(2, dVar);
            this.f314437c = iVarArr;
            this.f314438d = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            p pVar = new p(this.f314437c, dVar, this.f314438d);
            pVar.f314436b = obj;
            return pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314435a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314436b;
                kotlinx.coroutines.flow.i[] iVarArr = this.f314437c;
                Function0 function0R = h0.r();
                a aVar = new a(null, this.f314438d);
                this.f314435a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this) == objL) {
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
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((p) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.Q1}, m = "invokeSuspend", n = {}, s = {})
    public static final class q<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314446d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class a<T> implements Function0<T[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314447a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(kotlinx.coroutines.flow.i<? extends T>[] iVarArr) {
                this.f314447a = iVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final T[] invoke() {
                int length = this.f314447a.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.Q1}, m = "invokeSuspend", n = {}, s = {})
        public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314448a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314449b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314450c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314451d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f314451d = nVar;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
                int i10 = this.f314448a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j<? super R> jVar = (kotlinx.coroutines.flow.j) this.f314449b;
                    Object[] objArr = (Object[]) this.f314450c;
                    pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314451d;
                    boolean z10 = true;
                    this.f314449b = null;
                    this.f314448a = 1;
                    if (nVar.invoke(jVar, objArr, this) == objL) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.f314451d.invoke((kotlinx.coroutines.flow.j) this.f314449b, (Object[]) this.f314450c, this);
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, T[] tArr, kotlin.coroutines.d<? super Unit> dVar) {
                Intrinsics.needClassReification();
                b bVar = new b(this.f314451d, dVar);
                bVar.f314449b = jVar;
                bVar.f314450c = tArr;
                return bVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super q> dVar) {
            super(2, dVar);
            this.f314445c = iVarArr;
            this.f314446d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            q qVar = new q(this.f314445c, this.f314446d, dVar);
            qVar.f314444b = obj;
            return qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314443a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314444b;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f314445c;
                Intrinsics.needClassReification();
                a aVar = new a(this.f314445c);
                Intrinsics.needClassReification();
                b bVar = new b(this.f314446d, null);
                this.f314443a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this) == objL) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314444b;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f314445c;
            Intrinsics.needClassReification();
            a aVar = new a(this.f314445c);
            Intrinsics.needClassReification();
            b bVar = new b(this.f314446d, null);
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((q) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    public static final class r<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314455d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        public static final class a<T> implements Function0<T[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314456a;

            public a(kotlinx.coroutines.flow.i<T>[] iVarArr) {
                this.f314456a = iVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final T[] invoke() {
                int length = this.f314456a.length;
                Intrinsics.reifiedOperationMarker(0, "T?");
                return (T[]) new Object[length];
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
        public static final class b<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314457a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314458b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314459c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314460d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super b> dVar) {
                super(3, dVar);
                this.f314460d = nVar;
                int i10 = 1 ^ 3;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
                int i10 = this.f314457a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j<? super R> jVar = (kotlinx.coroutines.flow.j) this.f314458b;
                    Object[] objArr = (Object[]) this.f314459c;
                    pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314460d;
                    this.f314458b = null;
                    this.f314457a = 1;
                    if (nVar.invoke(jVar, objArr, this) == objL) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.f314460d.invoke((kotlinx.coroutines.flow.j) this.f314458b, (Object[]) this.f314459c, this);
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, T[] tArr, kotlin.coroutines.d<? super Unit> dVar) {
                Intrinsics.needClassReification();
                b bVar = new b(this.f314460d, dVar);
                bVar.f314458b = jVar;
                bVar.f314459c = tArr;
                return bVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(kotlinx.coroutines.flow.i<T>[] iVarArr, pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super r> dVar) {
            super(2, dVar);
            this.f314454c = iVarArr;
            this.f314455d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            r rVar = new r(this.f314454c, this.f314455d, dVar);
            rVar.f314453b = obj;
            return rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314452a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314453b;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f314454c;
                Intrinsics.needClassReification();
                a aVar = new a(this.f314454c);
                Intrinsics.needClassReification();
                b bVar = new b(this.f314455d, null);
                this.f314452a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this) == objL) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314453b;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f314454c;
            Intrinsics.needClassReification();
            a aVar = new a(this.f314454c);
            Intrinsics.needClassReification();
            b bVar = new b(this.f314455d, null);
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, aVar, bVar, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((r) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    public static final class s<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T>[] f314463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314464d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
        public static final class a<T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f314465a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f314466b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f314467c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> f314468d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f314468d = nVar;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
                int i10 = this.f314465a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.flow.j<? super R> jVar = (kotlinx.coroutines.flow.j) this.f314466b;
                    Object[] objArr = (Object[]) this.f314467c;
                    pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> nVar = this.f314468d;
                    this.f314466b = null;
                    this.f314465a = 1;
                    if (nVar.invoke(jVar, objArr, this) == objL) {
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

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            public final Object invokeSuspend$$forInline(Object obj) {
                this.f314468d.invoke((kotlinx.coroutines.flow.j) this.f314466b, (Object[]) this.f314467c, this);
                return Unit.f312394a;
            }

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, T[] tArr, kotlin.coroutines.d<? super Unit> dVar) {
                Intrinsics.needClassReification();
                a aVar = new a(this.f314468d, dVar);
                aVar.f314466b = jVar;
                aVar.f314467c = tArr;
                return aVar.invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super s> dVar) {
            super(2, dVar);
            this.f314463c = iVarArr;
            this.f314464d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            s sVar = new s(this.f314463c, this.f314464d, dVar);
            sVar.f314462b = obj;
            return sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314461a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314462b;
                kotlinx.coroutines.flow.i<T>[] iVarArr = this.f314463c;
                Function0 function0R = h0.r();
                Intrinsics.needClassReification();
                a aVar = new a(this.f314464d, null);
                this.f314461a = 1;
                if (kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this) == objL) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314462b;
            kotlinx.coroutines.flow.i<T>[] iVarArr = this.f314463c;
            Function0 function0R = h0.r();
            Intrinsics.needClassReification();
            a aVar = new a(this.f314464d, null);
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, aVar, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((s) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    public static final class t<R> implements kotlinx.coroutines.flow.i<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i[] f314469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f314470b;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f314471a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f314472b;

            public a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f314471a = obj;
                this.f314472b |= Integer.MIN_VALUE;
                return t.this.collect(null, this);
            }
        }

        public t(kotlinx.coroutines.flow.i[] iVarArr, Function2 function2) {
            this.f314469a = iVarArr;
            this.f314470b = function2;
        }

        public Object c(kotlinx.coroutines.flow.j jVar, kotlin.coroutines.d dVar) {
            kotlin.jvm.internal.h0.e(4);
            new a(dVar);
            kotlin.jvm.internal.h0.e(5);
            kotlinx.coroutines.flow.i[] iVarArr = this.f314469a;
            Function0 function0R = h0.r();
            Intrinsics.needClassReification();
            u uVar = new u(this.f314470b, null);
            kotlin.jvm.internal.h0.e(0);
            kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, uVar, dVar);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            kotlinx.coroutines.flow.i[] iVarArr = this.f314469a;
            Function0 function0R = h0.r();
            Intrinsics.needClassReification();
            Object objA = kotlinx.coroutines.flow.internal.m.a(jVar, iVarArr, function0R, new u(this.f314470b, null), dVar);
            return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {258, 258}, m = "invokeSuspend", n = {}, s = {})
    public static final class u<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<kotlinx.coroutines.flow.j<? super R>, T[], kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f314475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T[], kotlin.coroutines.d<? super R>, Object> f314477d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(Function2<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> function2, kotlin.coroutines.d<? super u> dVar) {
            super(3, dVar);
            this.f314477d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r5 = 3
                int r1 = r6.f314474a
                r2 = 3
                r2 = 2
                r3 = 1
                r5 = 2
                if (r1 == 0) goto L29
                if (r1 == r3) goto L20
                if (r1 != r2) goto L15
                kotlin.ResultKt.m(r7)
                goto L54
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "i/sr  nu/boue/oe/ncr eo//ew/faeitomvt t/kl srhlio e"
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r5 = 7
                r6.<init>(r7)
                throw r6
            L20:
                java.lang.Object r1 = r6.f314475b
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                r5 = 0
                kotlin.ResultKt.m(r7)
                goto L47
            L29:
                kotlin.ResultKt.m(r7)
                r5 = 3
                java.lang.Object r7 = r6.f314475b
                r1 = r7
                r5 = 6
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
                java.lang.Object r7 = r6.f314476c
                r5 = 1
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                r5 = 2
                kotlin.jvm.functions.Function2<T[], kotlin.coroutines.d<? super R>, java.lang.Object> r4 = r6.f314477d
                r6.f314475b = r1
                r6.f314474a = r3
                java.lang.Object r7 = r4.invoke(r7, r6)
                r5 = 0
                if (r7 != r0) goto L47
                goto L53
            L47:
                r3 = 0
                r6.f314475b = r3
                r6.f314474a = r2
                java.lang.Object r6 = r1.emit(r7, r6)
                r5 = 5
                if (r6 != r0) goto L54
            L53:
                return r0
            L54:
                kotlin.Unit r6 = kotlin.Unit.f312394a
                r5 = 1
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.h0.u.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final Object invokeSuspend$$forInline(Object obj) {
            kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f314475b;
            Object objInvoke = this.f314477d.invoke((Object[]) this.f314476c, this);
            kotlin.jvm.internal.h0.e(0);
            jVar.emit(objInvoke, this);
            kotlin.jvm.internal.h0.e(1);
            return Unit.f312394a;
        }

        @Override // pj.n
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.flow.j<? super R> jVar, T[] tArr, kotlin.coroutines.d<? super Unit> dVar) {
            Intrinsics.needClassReification();
            u uVar = new u(this.f314477d, dVar);
            uVar.f314475b = jVar;
            uVar.f314476c = tArr;
            return uVar.invokeSuspend(Unit.f312394a);
        }
    }

    static final class v implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f314478a = new v();

        v() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> b(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, Function2<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        kotlinx.coroutines.flow.i[] iVarArr = (kotlinx.coroutines.flow.i[]) CollectionsKt.toList(iterable).toArray(new kotlinx.coroutines.flow.i[0]);
        Intrinsics.needClassReification();
        return new f(iVarArr, function2);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> c(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull kotlinx.coroutines.flow.i<? extends T3> iVar3, @NotNull kotlinx.coroutines.flow.i<? extends T4> iVar4, @NotNull kotlinx.coroutines.flow.i<? extends T5> iVar5, @NotNull pj.q<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return new c(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, qVar);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> d(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull kotlinx.coroutines.flow.i<? extends T3> iVar3, @NotNull kotlinx.coroutines.flow.i<? extends T4> iVar4, @NotNull pj.p<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return new b(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, pVar);
    }

    @NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> e(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull kotlinx.coroutines.flow.i<? extends T3> iVar3, @kotlin.b @NotNull pj.o<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar) {
        int i10 = 3 << 0;
        return new a(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, oVar);
    }

    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> f(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return kotlinx.coroutines.flow.k.L0(iVar, iVar2, nVar);
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> g(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, Function2<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        Intrinsics.needClassReification();
        return new e(iVarArr, function2);
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> h(Iterable<? extends kotlinx.coroutines.flow.i<? extends T>> iterable, @kotlin.b pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        kotlinx.coroutines.flow.i[] iVarArr = (kotlinx.coroutines.flow.i[]) CollectionsKt.toList(iterable).toArray(new kotlinx.coroutines.flow.i[0]);
        Intrinsics.needClassReification();
        return kotlinx.coroutines.flow.k.K0(new r(iVarArr, nVar, null));
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> kotlinx.coroutines.flow.i<R> i(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull kotlinx.coroutines.flow.i<? extends T3> iVar3, @NotNull kotlinx.coroutines.flow.i<? extends T4> iVar4, @NotNull kotlinx.coroutines.flow.i<? extends T5> iVar5, @kotlin.b @NotNull pj.r<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> rVar) {
        return kotlinx.coroutines.flow.k.K0(new p(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4, iVar5}, null, rVar));
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> kotlinx.coroutines.flow.i<R> j(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull kotlinx.coroutines.flow.i<? extends T3> iVar3, @NotNull kotlinx.coroutines.flow.i<? extends T4> iVar4, @kotlin.b @NotNull pj.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> qVar) {
        return kotlinx.coroutines.flow.k.K0(new o(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3, iVar4}, null, qVar));
    }

    @NotNull
    public static final <T1, T2, T3, R> kotlinx.coroutines.flow.i<R> k(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull kotlinx.coroutines.flow.i<? extends T3> iVar3, @kotlin.b @NotNull pj.p<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> pVar) {
        return kotlinx.coroutines.flow.k.K0(new n(new kotlinx.coroutines.flow.i[]{iVar, iVar2, iVar3}, null, pVar));
    }

    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> l(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @kotlin.b @NotNull pj.o<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar) {
        return kotlinx.coroutines.flow.k.K0(new m(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, oVar));
    }

    public static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> m(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @kotlin.b pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        Intrinsics.needClassReification();
        return kotlinx.coroutines.flow.k.K0(new q(iVarArr, nVar, null));
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> n(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, @kotlin.b pj.n<? super kotlinx.coroutines.flow.j<? super R>, ? super T[], ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        Intrinsics.needClassReification();
        return kotlinx.coroutines.flow.k.K0(new s(iVarArr, nVar, null));
    }

    private static final /* synthetic */ <T, R> kotlinx.coroutines.flow.i<R> o(kotlinx.coroutines.flow.i<? extends T>[] iVarArr, Function2<? super T[], ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        Intrinsics.needClassReification();
        return new t(iVarArr, function2);
    }

    @oj.i(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> p(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return new d(iVar, iVar2, nVar);
    }

    @oj.i(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> q(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @kotlin.b @NotNull pj.o<? super kotlinx.coroutines.flow.j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar) {
        return kotlinx.coroutines.flow.k.K0(new l(new kotlinx.coroutines.flow.i[]{iVar, iVar2}, null, oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function0<T[]> r() {
        return v.f314478a;
    }

    @NotNull
    public static final <T1, T2, R> kotlinx.coroutines.flow.i<R> s(@NotNull kotlinx.coroutines.flow.i<? extends T1> iVar, @NotNull kotlinx.coroutines.flow.i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return kotlinx.coroutines.flow.internal.m.b(iVar, iVar2, nVar);
    }
}
