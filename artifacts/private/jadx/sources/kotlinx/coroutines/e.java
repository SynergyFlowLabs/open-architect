package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n426#2,9:122\n435#2,2:133\n13402#3,2:131\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n63#1:122,9\n63#1:133,2\n75#1:131,2\n*E\n"})
final class e<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f314006b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a1<T>[] f314007a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n11158#2:122\n11493#2,3:123\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n115#1:122\n115#1:123,3\n*E\n"})
    private final class a extends v2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f314008h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final n<List<? extends T>> f314009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public o1 f314010f;

        /* JADX WARN: Multi-variable type inference failed */
        public a(n<? super List<? extends T>> nVar) {
            this.f314009e = nVar;
        }

        private final /* synthetic */ Object I() {
            return this._disposer$volatile;
        }

        private final /* synthetic */ void M(Object obj) {
            this._disposer$volatile = obj;
        }

        @Override // kotlinx.coroutines.v2
        public boolean D() {
            return false;
        }

        @Override // kotlinx.coroutines.v2
        public void E(@Nullable Throwable th2) {
            if (th2 != null) {
                Object objL0 = this.f314009e.l0(th2);
                if (objL0 != null) {
                    this.f314009e.b0(objL0);
                    e<T>.b bVarG = G();
                    if (bVarG != null) {
                        bVarG.a();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.e().decrementAndGet(e.this) == 0) {
                n<List<? extends T>> nVar = this.f314009e;
                a1[] a1VarArr = ((e) e.this).f314007a;
                ArrayList arrayList = new ArrayList(a1VarArr.length);
                for (a1 a1Var : a1VarArr) {
                    arrayList.add(a1Var.m());
                }
                Result.a aVar = Result.Companion;
                nVar.resumeWith(Result.m785constructorimpl(arrayList));
            }
        }

        @Nullable
        public final e<T>.b G() {
            return (b) f314008h.get(this);
        }

        @NotNull
        public final o1 H() {
            o1 o1Var = this.f314010f;
            if (o1Var != null) {
                return o1Var;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final void K(@Nullable e<T>.b bVar) {
            f314008h.set(this, bVar);
        }

        public final void L(@NotNull o1 o1Var) {
            this.f314010f = o1Var;
        }
    }

    @SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,121:1\n13402#2,2:122\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n88#1:122,2\n*E\n"})
    private final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final e<T>.a[] f314012a;

        public b(e<T>.a[] aVarArr) {
            this.f314012a = aVarArr;
        }

        public final void a() {
            for (e<T>.a aVar : this.f314012a) {
                aVar.H().dispose();
            }
        }

        @Override // kotlinx.coroutines.m
        public void e(@Nullable Throwable th2) {
            a();
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f314012a + AbstractJsonLexerKt.END_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull a1<? extends T>[] a1VarArr) {
        this.f314007a = a1VarArr;
        this.notCompletedCount$volatile = a1VarArr.length;
    }

    private final /* synthetic */ int d() {
        return this.notCompletedCount$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater e() {
        return f314006b;
    }

    private final /* synthetic */ void f(int i10) {
        this.notCompletedCount$volatile = i10;
    }

    @Nullable
    public final Object c(@NotNull kotlin.coroutines.d<? super List<? extends T>> dVar) {
        int i10 = 6 ^ 1;
        p pVar = new p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        int length = this.f314007a.length;
        a[] aVarArr = new a[length];
        for (int i11 = 0; i11 < length; i11++) {
            a1 a1Var = this.f314007a[i11];
            a1Var.start();
            a aVar = new a(pVar);
            aVar.L(u2.B(a1Var, false, aVar, 1, null));
            Unit unit = Unit.f312394a;
            aVarArr[i11] = aVar;
        }
        e<T>.b bVar = new b(aVarArr);
        for (int i12 = 0; i12 < length; i12++) {
            aVarArr[i12].K(bVar);
        }
        if (pVar.x()) {
            bVar.a();
        } else {
            r.c(pVar, bVar);
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }
}
