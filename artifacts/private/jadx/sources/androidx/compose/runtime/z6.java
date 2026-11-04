package androidx.compose.runtime;

import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,180:1\n1282#2,6:181\n256#3,2:187\n231#3,3:189\n200#3,7:192\n211#3,3:200\n214#3,9:204\n234#3:213\n258#3:214\n1399#4:199\n1270#4:203\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n66#1:181,6\n179#1:187,2\n179#1:189,3\n179#1:192,7\n179#1:200,3\n179#1:204,9\n179#1:213\n179#1:214\n179#1:199\n179#1:203\n*E\n"})
final /* synthetic */ class z6 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1", f = "SnapshotFlow.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.V, com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements Function2<k4<R>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f36905b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f36906c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i<T> f36907d;

        /* JADX INFO: renamed from: androidx.compose.runtime.z6$a$a, reason: collision with other inner class name */
        static final class C0276a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k4<R> f36908a;

            C0276a(k4<R> k4Var) {
                this.f36908a = k4Var;
            }

            @Override // kotlinx.coroutines.flow.j
            public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                this.f36908a.setValue(t10);
                return Unit.f312394a;
            }
        }

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1$2", f = "SnapshotFlow.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.f160708m0}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f36909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.i<T> f36910b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k4<R> f36911c;

            /* JADX INFO: renamed from: androidx.compose.runtime.z6$a$b$a, reason: collision with other inner class name */
            static final class C0277a<T> implements kotlinx.coroutines.flow.j {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ k4<R> f36912a;

                C0277a(k4<R> k4Var) {
                    this.f36912a = k4Var;
                }

                @Override // kotlinx.coroutines.flow.j
                public final Object emit(T t10, kotlin.coroutines.d<? super Unit> dVar) {
                    this.f36912a.setValue(t10);
                    return Unit.f312394a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(kotlinx.coroutines.flow.i<? extends T> iVar, k4<R> k4Var, kotlin.coroutines.d<? super b> dVar) {
                super(2, dVar);
                this.f36910b = iVar;
                this.f36911c = k4Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new b(this.f36910b, this.f36911c, dVar);
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.compose.runtime.z6$a$b for r5v4 'this'  kotlin.coroutines.d
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    r4 = 2
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r4 = 7
                    int r1 = r5.f36909a
                    r4 = 5
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.m(r6)
                    goto L31
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r4 = 1
                    r5.<init>(r6)
                    throw r5
                L1b:
                    kotlin.ResultKt.m(r6)
                    kotlinx.coroutines.flow.i<T> r6 = r5.f36910b
                    androidx.compose.runtime.z6$a$b$a r1 = new androidx.compose.runtime.z6$a$b$a
                    androidx.compose.runtime.k4<R> r3 = r5.f36911c
                    r1.<init>(r3)
                    r5.f36909a = r2
                    java.lang.Object r5 = r6.collect(r1, r5)
                    if (r5 != r0) goto L31
                    r4 = 7
                    return r0
                L31:
                    kotlin.Unit r5 = kotlin.Unit.f312394a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.z6.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(CoroutineContext coroutineContext, kotlinx.coroutines.flow.i<? extends T> iVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f36906c = coroutineContext;
            this.f36907d = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f36906c, this.f36907d, dVar);
            aVar.f36905b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(k4<R> k4Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(k4Var, dVar)).invokeSuspend(Unit.f312394a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to androidx.compose.runtime.z6$a<R> for r7v5 'this'  kotlin.coroutines.d
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
                int r1 = r7.f36904a
                r2 = 6
                r2 = 2
                r6 = 0
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1c
                r6 = 4
                if (r1 != r2) goto L12
                goto L1c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                r6 = 2
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                r6 = 6
                throw r7
            L1c:
                kotlin.ResultKt.m(r8)
                goto L5e
            L20:
                kotlin.ResultKt.m(r8)
                r6 = 3
                java.lang.Object r8 = r7.f36905b
                androidx.compose.runtime.k4 r8 = (androidx.compose.runtime.k4) r8
                kotlin.coroutines.CoroutineContext r1 = r7.f36906c
                kotlin.coroutines.h r4 = kotlin.coroutines.h.f312451a
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                r6 = 3
                if (r1 == 0) goto L48
                kotlinx.coroutines.flow.i<T> r1 = r7.f36907d
                r6 = 7
                androidx.compose.runtime.z6$a$a r2 = new androidx.compose.runtime.z6$a$a
                r6 = 0
                r2.<init>(r8)
                r6 = 1
                r7.f36904a = r3
                java.lang.Object r7 = r1.collect(r2, r7)
                r6 = 2
                if (r7 != r0) goto L5e
                r6 = 3
                goto L5d
            L48:
                kotlin.coroutines.CoroutineContext r1 = r7.f36906c
                r6 = 2
                androidx.compose.runtime.z6$a$b r3 = new androidx.compose.runtime.z6$a$b
                kotlinx.coroutines.flow.i<T> r4 = r7.f36907d
                r5 = 0
                r6 = 5
                r3.<init>(r4, r8, r5)
                r7.f36904a = r2
                java.lang.Object r7 = kotlinx.coroutines.i.h(r1, r3, r7)
                r6 = 7
                if (r7 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r7 = kotlin.Unit.f312394a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.z6.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {143, com.planner5d.library.engine.input.f.b.F1, 170}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    @SourceDebugExtension({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 3 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 4 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,180:1\n149#2,5:181\n149#2,5:186\n60#3:191\n60#3:213\n51#4,2:192\n54#4:222\n55#4:226\n256#5,2:194\n231#5,3:196\n200#5,7:199\n211#5,3:207\n214#5,2:211\n217#5,6:214\n234#5:220\n258#5:221\n1399#6:206\n1270#6:210\n1755#7,3:223\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n138#1:181,5\n162#1:186,5\n114#1:191\n127#1:213\n127#1:192,2\n127#1:222\n127#1:226\n127#1:194,2\n127#1:196,3\n127#1:199,7\n127#1:207,3\n127#1:211,2\n127#1:214,6\n127#1:220\n127#1:221\n127#1:206\n127#1:210\n127#1:223,3\n*E\n"})
    static final class b<T> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f36914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f36915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f36916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f36917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f36918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f36919g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f36920h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<T> f36921i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends T> function0, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f36921i = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit n(androidx.collection.l2 l2Var, Object obj) {
            if (obj instanceof androidx.compose.runtime.snapshots.d1) {
                androidx.compose.runtime.snapshots.i.a aVar = androidx.compose.runtime.snapshots.i.f36500b;
                ((androidx.compose.runtime.snapshots.d1) obj).b(androidx.compose.runtime.snapshots.i.b(4));
            }
            l2Var.C(obj);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:20:0x0061 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:21:0x0063 A[LOOP:0: B:7:0x001c->B:21:0x0063, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:40:0x009c A[SYNTHETIC] */
        public static final Unit s(kotlinx.coroutines.channels.p pVar, Set set, androidx.compose.runtime.snapshots.m mVar) {
            if (set instanceof androidx.compose.runtime.collection.f) {
                androidx.collection.c3<T> c3VarC = ((androidx.compose.runtime.collection.f) set).c();
                Object[] objArr = c3VarC.f12171b;
                long[] jArr = c3VarC.f12170a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    loop0: while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    Object obj = objArr[(i10 << 3) + i12];
                                    if (!(obj instanceof androidx.compose.runtime.snapshots.d1)) {
                                        break loop0;
                                    }
                                    androidx.compose.runtime.snapshots.i.a aVar = androidx.compose.runtime.snapshots.i.f36500b;
                                    if (((androidx.compose.runtime.snapshots.d1) obj).a(androidx.compose.runtime.snapshots.i.b(4))) {
                                        break loop0;
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i11 == 8) {
                                if (i10 != length) {
                                    i10++;
                                }
                            }
                        } else if (i10 != length) {
                            i10++;
                        }
                    }
                    pVar.p(set);
                }
            } else {
                Set set2 = set;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (T t10 : set2) {
                        if (t10 instanceof androidx.compose.runtime.snapshots.d1) {
                            androidx.compose.runtime.snapshots.i.a aVar2 = androidx.compose.runtime.snapshots.i.f36500b;
                            if (((androidx.compose.runtime.snapshots.d1) t10).a(androidx.compose.runtime.snapshots.i.b(4))) {
                            }
                        }
                        pVar.p(set);
                    }
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = new b(this.f36921i, dVar);
            bVar.f36920h = obj;
            return bVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:35:0x0105 A[Catch: all -> 0x005e, TryCatch #4 {all -> 0x005e, blocks: (B:32:0x0100, B:35:0x0105, B:40:0x0110, B:43:0x0120, B:47:0x013a, B:49:0x0145, B:57:0x0165, B:58:0x0168, B:15:0x0059, B:44:0x012d, B:46:0x0136, B:55:0x0160, B:56:0x0164, B:45:0x0132), top: B:76:0x0059, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x010f  */
        /* JADX WARN: Code duplicated, block: B:43:0x0120 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #4 {all -> 0x005e, blocks: (B:32:0x0100, B:35:0x0105, B:40:0x0110, B:43:0x0120, B:47:0x013a, B:49:0x0145, B:57:0x0165, B:58:0x0168, B:15:0x0059, B:44:0x012d, B:46:0x0136, B:55:0x0160, B:56:0x0164, B:45:0x0132), top: B:76:0x0059, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x0145 A[Catch: all -> 0x005e, TRY_LEAVE, TryCatch #4 {all -> 0x005e, blocks: (B:32:0x0100, B:35:0x0105, B:40:0x0110, B:43:0x0120, B:47:0x013a, B:49:0x0145, B:57:0x0165, B:58:0x0168, B:15:0x0059, B:44:0x012d, B:46:0x0136, B:55:0x0160, B:56:0x0164, B:45:0x0132), top: B:76:0x0059, inners: #3 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x016a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:43:0x0120, B:59:0x0169], limit reached: 79 */
        /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r10v10 */
        /* JADX WARN: Type inference failed for: r10v15 */
        /* JADX WARN: Type inference failed for: r10v16 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.z6.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @o
    @NotNull
    public static final <T extends R, R> n7<R> b(@NotNull kotlinx.coroutines.flow.i<? extends T> iVar, R r10, @Nullable CoroutineContext coroutineContext, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (m0.l0()) {
            m0.A0(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:65)");
        }
        boolean zK0 = c0Var.k0(coroutineContext2) | c0Var.k0(iVar);
        Object objI0 = c0Var.i0();
        if (zK0 || objI0 == c0.f35327a.a()) {
            objI0 = new a(coroutineContext2, iVar, null);
            c0Var.Y(objI0);
        }
        n7<R> n7VarR = w6.r(r10, iVar, coroutineContext2, (Function2) objI0, c0Var, ((i10 >> 3) & 14) | ((i10 << 3) & com.planner5d.library.engine.input.f.b.B) | (i10 & 896));
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarR;
    }

    @o
    @NotNull
    public static final <T> n7<T> c(@NotNull kotlinx.coroutines.flow.z0<? extends T> z0Var, @Nullable CoroutineContext coroutineContext, @Nullable c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (m0.l0()) {
            m0.A0(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:49)");
        }
        n7<T> n7VarA = w6.a(z0Var, z0Var.getValue(), coroutineContext2, c0Var, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (m0.l0()) {
            m0.z0();
        }
        return n7VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[LOOP:0: B:5:0x000c->B:18:0x0046, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0049 A[SYNTHETIC] */
    public static final boolean d(androidx.collection.l2<Object> l2Var, Set<? extends Object> set) {
        Object[] objArr = l2Var.f12171b;
        long[] jArr = l2Var.f12170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && set.contains(objArr[(i10 << 3) + i12])) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    @NotNull
    public static final <T> kotlinx.coroutines.flow.i<T> e(@NotNull Function0<? extends T> function0) {
        return kotlinx.coroutines.flow.k.K0(new b(function0, null));
    }
}
