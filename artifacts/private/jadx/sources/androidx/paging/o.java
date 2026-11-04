package androidx.paging;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCombinedLoadStates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStatesKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,161:1\n21#2:162\n23#2:166\n50#3:163\n55#3:165\n107#4:164\n*S KotlinDebug\n*F\n+ 1 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStatesKt\n*L\n157#1:162\n157#1:166\n157#1:163\n157#1:165\n157#1:164\n*E\n"})
public final class o {

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f72396a;

        /* JADX INFO: renamed from: androidx.paging.o$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 CombinedLoadStates.kt\nandroidx/paging/CombinedLoadStatesKt\n*L\n1#1,222:1\n22#2:223\n23#2:225\n158#3:224\n*E\n"})
        public static final class C0675a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f72397a;

            /* JADX INFO: renamed from: androidx.paging.o$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.CombinedLoadStatesKt$awaitNotLoading$$inlined$filter$1$2", f = "CombinedLoadStates.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0676a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f72398a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72399b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f72400c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f72401d;

                public C0676a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72398a = obj;
                    this.f72399b |= Integer.MIN_VALUE;
                    return C0675a.this.emit(null, this);
                }
            }

            public C0675a(kotlinx.coroutines.flow.j jVar) {
                this.f72397a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0676a c0676a;
                if (dVar instanceof C0676a) {
                    c0676a = (C0676a) dVar;
                    int i10 = c0676a.f72399b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0676a.f72399b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0676a = new C0676a(dVar);
                    }
                } else {
                    c0676a = new C0676a(dVar);
                }
                Object obj2 = c0676a.f72398a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0676a.f72399b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f72397a;
                    n nVar = (n) obj;
                    if (nVar.h() || nVar.g()) {
                        c0676a.f72399b = 1;
                        if (jVar.emit(obj, c0676a) == objL) {
                            return objL;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj2);
                }
                return Unit.f312394a;
            }
        }

        public a(kotlinx.coroutines.flow.i iVar) {
            this.f72396a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j<? super n> jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f72396a.collect(new C0675a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    @Nullable
    public static final Object a(@NotNull kotlinx.coroutines.flow.i<n> iVar, @NotNull kotlin.coroutines.d<n> dVar) {
        return kotlinx.coroutines.flow.k.y0(new a(kotlinx.coroutines.flow.k.c0(iVar, 1L)), dVar);
    }
}
