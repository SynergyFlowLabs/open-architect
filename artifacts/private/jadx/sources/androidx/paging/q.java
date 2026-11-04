package androidx.paging;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nConflatedEventBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,36:1\n60#2:37\n63#2:41\n50#3:38\n55#3:40\n107#4:39\n*S KotlinDebug\n*F\n+ 1 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n*L\n30#1:37\n30#1:41\n30#1:38\n30#1:40\n30#1:39\n*E\n"})
public final class q<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.k0<Pair<Integer, T>> f72431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.flow.i<T> f72432b;

    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,113:1\n51#2,5:114\n*E\n"})
    public static final class a implements kotlinx.coroutines.flow.i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f72433a;

        /* JADX INFO: renamed from: androidx.paging.q$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 ConflatedEventBus.kt\nandroidx/paging/ConflatedEventBus\n*L\n1#1,222:1\n61#2:223\n62#2:225\n30#3:224\n*E\n"})
        public static final class C0677a<T> implements kotlinx.coroutines.flow.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f72434a;

            /* JADX INFO: renamed from: androidx.paging.q$a$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.ConflatedEventBus$special$$inlined$mapNotNull$1$2", f = "ConflatedEventBus.kt", i = {}, l = {225}, m = "emit", n = {}, s = {})
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            public static final class C0678a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f72435a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72436b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                Object f72437c;

                public C0678a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f72435a = obj;
                    this.f72436b |= Integer.MIN_VALUE;
                    return C0677a.this.emit(null, this);
                }
            }

            public C0677a(kotlinx.coroutines.flow.j jVar) {
                this.f72434a = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.j
            @Nullable
            public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
                C0678a c0678a;
                if (dVar instanceof C0678a) {
                    c0678a = (C0678a) dVar;
                    int i10 = c0678a.f72436b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0678a.f72436b = i10 - Integer.MIN_VALUE;
                    } else {
                        c0678a = new C0678a(dVar);
                    }
                } else {
                    c0678a = new C0678a(dVar);
                }
                Object obj2 = c0678a.f72435a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i11 = c0678a.f72436b;
                if (i11 == 0) {
                    ResultKt.m(obj2);
                    kotlinx.coroutines.flow.j jVar = this.f72434a;
                    Object second = ((Pair) obj).getSecond();
                    if (second != null) {
                        c0678a.f72436b = 1;
                        if (jVar.emit(second, c0678a) == objL) {
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
            this.f72433a = iVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @Nullable
        public Object collect(@NotNull kotlinx.coroutines.flow.j jVar, @NotNull kotlin.coroutines.d dVar) {
            Object objCollect = this.f72433a.collect(new C0677a(jVar), dVar);
            return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<T> a() {
        return this.f72432b;
    }

    public final void b(@NotNull T data) {
        Intrinsics.checkNotNullParameter(data, "data");
        kotlinx.coroutines.flow.k0<Pair<Integer, T>> k0Var = this.f72431a;
        k0Var.setValue(new Pair<>(Integer.valueOf(k0Var.getValue().getFirst().intValue() + 1), data));
    }

    public q(@Nullable T t10) {
        kotlinx.coroutines.flow.k0<Pair<Integer, T>> k0VarA = kotlinx.coroutines.flow.b1.a(new Pair(Integer.MIN_VALUE, t10));
        this.f72431a = k0VarA;
        this.f72432b = new a(k0VarA);
    }

    public /* synthetic */ q(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
