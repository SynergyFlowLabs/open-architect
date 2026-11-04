package androidx.paging;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSeparators.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorsKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,608:1\n53#2:609\n55#2:613\n50#3:610\n55#3:612\n107#4:611\n*S KotlinDebug\n*F\n+ 1 Separators.kt\nandroidx/paging/SeparatorsKt\n*L\n606#1:609\n606#1:613\n606#1:610\n606#1:612\n606#1:611\n*E\n"})
public final class y2 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<g1<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f72770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x2 f72771b;

        /* JADX INFO: renamed from: androidx.paging.y2$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Separators.kt\nandroidx/paging/SeparatorsKt\n*L\n1#1,222:1\n54#2:223\n606#3:224\n*E\n"})
        public static final class C0685a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f72772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x2 f72773b;

            /* JADX INFO: renamed from: androidx.paging.y2$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorsKt$insertEventSeparators$$inlined$map$1$2", f = "Separators.kt", i = {}, l = {224, 223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0686a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f72774a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72775b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f72776c;

                public C0686a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72774a = obj;
                    this.f72775b |= Integer.MIN_VALUE;
                    return C0685a.this.emit(null, this);
                }
            }

            public C0685a(kotlinx.coroutines.flow.j jVar, x2 x2Var) {
                this.f72772a = jVar;
                this.f72773b = x2Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
            
                if (r7.emit(r9, r0) == r1) goto L23;
             */
            @Override // kotlinx.coroutines.flow.j
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d r9) {
                /*
                    r7 = this;
                    java.lang.String r6 = "Androeed.ru"
                    boolean r0 = r9 instanceof androidx.paging.y2.a.C0685a.C0686a
                    r6 = 3
                    if (r0 == 0) goto L17
                    r0 = r9
                    androidx.paging.y2$a$a$a r0 = (androidx.paging.y2.a.C0685a.C0686a) r0
                    int r1 = r0.f72775b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L17
                    r6 = 6
                    int r1 = r1 - r2
                    r0.f72775b = r1
                    goto L1c
                L17:
                    androidx.paging.y2$a$a$a r0 = new androidx.paging.y2$a$a$a
                    r0.<init>(r9)
                L1c:
                    java.lang.Object r9 = r0.f72774a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    r6 = 2
                    int r2 = r0.f72775b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L43
                    if (r2 == r4) goto L3a
                    r6 = 6
                    if (r2 != r3) goto L32
                    kotlin.ResultKt.m(r9)
                    goto L6b
                L32:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L3a:
                    java.lang.Object r7 = r0.f72776c
                    r6 = 4
                    kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                    kotlin.ResultKt.m(r9)
                    goto L5e
                L43:
                    r6 = 6
                    kotlin.ResultKt.m(r9)
                    kotlinx.coroutines.flow.j r9 = r7.f72772a
                    androidx.paging.g1 r8 = (androidx.paging.g1) r8
                    r6 = 3
                    androidx.paging.x2 r7 = r7.f72773b
                    r6 = 1
                    r0.f72776c = r9
                    r0.f72775b = r4
                    java.lang.Object r7 = r7.n(r8, r0)
                    if (r7 != r1) goto L5a
                    goto L6a
                L5a:
                    r5 = r9
                    r9 = r7
                    r7 = r5
                    r7 = r5
                L5e:
                    r8 = 0
                    r0.f72776c = r8
                    r6 = 5
                    r0.f72775b = r3
                    java.lang.Object r7 = r7.emit(r9, r0)
                    if (r7 != r1) goto L6b
                L6a:
                    return r1
                L6b:
                    r6 = 7
                    kotlin.Unit r7 = kotlin.Unit.f312394a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.paging.y2.a.C0685a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public a(kotlinx.coroutines.flow.i iVar, x2 x2Var) {
            this.f72770a = iVar;
            this.f72771b = x2Var;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f72770a.collect(new C0685a(jVar, this.f72771b), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorsKt$insertEventSeparators$separatorState$1", f = "Separators.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.e.f44051t}, m = "invokeSuspend", n = {}, s = {})
    static final class b<R, T> extends kotlin.coroutines.jvm.internal.o implements pj.n<T, T, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f72779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f72780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.n<T, T, kotlin.coroutines.d<? super R>, Object> f72781d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, kotlin.coroutines.d<? super b> dVar) {
            super(3, dVar);
            this.f72781d = nVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.paging.y2$b<R, T> for r6v3 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f72778a
                r2 = 1
                if (r1 == 0) goto L1b
                r5 = 1
                if (r1 != r2) goto L11
                r5 = 5
                kotlin.ResultKt.m(r7)
                return r7
            L11:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                r5 = 0
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                r5 = 4
                throw r6
            L1b:
                kotlin.ResultKt.m(r7)
                r5 = 6
                java.lang.Object r7 = r6.f72779b
                r5 = 0
                java.lang.Object r1 = r6.f72780c
                r5 = 3
                pj.n<T, T, kotlin.coroutines.d<? super R>, java.lang.Object> r3 = r6.f72781d
                r5 = 1
                r4 = 0
                r5 = 6
                r6.f72779b = r4
                r6.f72778a = r2
                java.lang.Object r6 = r3.invoke(r7, r1, r6)
                if (r6 != r0) goto L35
                return r0
            L35:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.y2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // pj.n
        @Nullable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@Nullable T t10, @Nullable T t11, @Nullable kotlin.coroutines.d<? super R> dVar) {
            b bVar = new b(this.f72781d, dVar);
            bVar.f72779b = t10;
            bVar.f72780c = t11;
            return bVar.invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", i = {0, 0, 0, 0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.f160705l0}, m = "insertInternalSeparators", n = {"$this$insertInternalSeparators", "generator", "outputList", "outputIndices", "item", androidx.media3.exoplayer.upstream.h.f65997k}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
    static final class c<R, T extends R> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f72782a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f72783b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f72784c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f72785d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f72786e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f72787f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f72788g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f72789h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f72790i;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f72789h = obj;
            this.f72790i |= Integer.MIN_VALUE;
            return y2.d(null, null, this);
        }
    }

    public static final <R, T extends R> void a(@NotNull List<g3<R>> list, @Nullable R r10, @Nullable g3<T> g3Var, @Nullable g3<T> g3Var2, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int[] iArrK = g3Var != null ? g3Var.k() : null;
        int[] iArrK2 = g3Var2 != null ? g3Var2.k() : null;
        if (iArrK != null && iArrK2 != null) {
            iArrK = CollectionsKt.toIntArray(CollectionsKt.sorted(ArraysKt.distinct(ArraysKt.plus(iArrK, iArrK2))));
        } else if (iArrK == null && iArrK2 != null) {
            iArrK = iArrK2;
        } else if (iArrK == null || iArrK2 != null) {
            throw new IllegalArgumentException("Separator page expected adjacentPageBefore or adjacentPageAfter, but both were null.");
        }
        b(list, r10, iArrK, i10, i11);
    }

    public static final <T> void b(@NotNull List<g3<T>> list, @Nullable T t10, @NotNull int[] originalPageOffsets, int i10, int i11) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        if (t10 == null) {
            return;
        }
        list.add(e(t10, originalPageOffsets, i10, i11));
    }

    @NotNull
    public static final <T extends R, R> kotlinx.coroutines.flow.i<g1<R>> c(@NotNull kotlinx.coroutines.flow.i<? extends g1<T>> iVar, @NotNull f3 terminalSeparatorType, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> generator) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return new a(iVar, new x2(terminalSeparatorType, new b(generator, null)));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f0 -> B:12:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final <R, T extends R> java.lang.Object d(@org.jetbrains.annotations.NotNull androidx.paging.g3<T> r12, @org.jetbrains.annotations.NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends java.lang.Object> r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.paging.g3<R>> r14) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.y2.d(androidx.paging.g3, pj.n, kotlin.coroutines.d):java.lang.Object");
    }

    @NotNull
    public static final <T> g3<T> e(@NotNull T separator, @NotNull int[] originalPageOffsets, int i10, int i11) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(originalPageOffsets, "originalPageOffsets");
        return new g3<>(originalPageOffsets, CollectionsKt.listOf(separator), i10, CollectionsKt.listOf(Integer.valueOf(i11)));
    }
}
