package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,429:1\n375#2:430\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n420#1:430\n*E\n"})
public final class d1<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final j<T> f314116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<j<? super T>, kotlin.coroutines.d<? super Unit>, Object> f314117b;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {422, 426}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f314119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f314120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d1<T> f314121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f314122e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d1<T> d1Var, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f314121d = d1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314120c = obj;
            this.f314122e |= Integer.MIN_VALUE;
            return this.f314121d.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d1(@NotNull j<? super T> jVar, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        this.f314116a = jVar;
        this.f314117b = function2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (((kotlinx.coroutines.flow.d1) r8).a(r0) == r1) goto L30;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            r7 = 4
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.d1.a
            if (r0 == 0) goto L17
            r0 = r9
            r7 = 4
            kotlinx.coroutines.flow.d1$a r0 = (kotlinx.coroutines.flow.d1.a) r0
            r7 = 6
            int r1 = r0.f314122e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            r7 = 5
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f314122e = r1
            goto L1c
        L17:
            kotlinx.coroutines.flow.d1$a r0 = new kotlinx.coroutines.flow.d1$a
            r0.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r0.f314120c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r7 = 1
            int r2 = r0.f314122e
            r3 = 2
            r7 = 1
            r4 = 1
            r7 = 7
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L34
            kotlin.ResultKt.m(r9)
            r7 = 5
            goto L90
        L34:
            r7 = 0
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            java.lang.Object r8 = r0.f314119b
            kotlinx.coroutines.flow.internal.w r8 = (kotlinx.coroutines.flow.internal.w) r8
            java.lang.Object r2 = r0.f314118a
            kotlinx.coroutines.flow.d1 r2 = (kotlinx.coroutines.flow.d1) r2
            r7 = 4
            kotlin.ResultKt.m(r9)     // Catch: java.lang.Throwable -> L4a
            goto L73
        L4a:
            r9 = move-exception
            r7 = 2
            goto L9b
        L4d:
            r7 = 3
            kotlin.ResultKt.m(r9)
            kotlinx.coroutines.flow.internal.w r9 = new kotlinx.coroutines.flow.internal.w
            kotlinx.coroutines.flow.j<T> r2 = r8.f314116a
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r7 = 2
            r9.<init>(r2, r5)
            kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r2 = r8.f314117b     // Catch: java.lang.Throwable -> L97
            r0.f314118a = r8     // Catch: java.lang.Throwable -> L97
            r7 = 5
            r0.f314119b = r9     // Catch: java.lang.Throwable -> L97
            r0.f314122e = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.invoke(r9, r0)     // Catch: java.lang.Throwable -> L97
            r7 = 3
            if (r2 != r1) goto L6f
            r7 = 2
            goto L8e
        L6f:
            r2 = r8
            r2 = r8
            r8 = r9
            r8 = r9
        L73:
            r7 = 1
            r8.releaseIntercepted()
            kotlinx.coroutines.flow.j<T> r8 = r2.f314116a
            boolean r9 = r8 instanceof kotlinx.coroutines.flow.d1
            if (r9 == 0) goto L93
            kotlinx.coroutines.flow.d1 r8 = (kotlinx.coroutines.flow.d1) r8
            r9 = 0
            r0.f314118a = r9
            r7 = 5
            r0.f314119b = r9
            r0.f314122e = r3
            java.lang.Object r8 = r8.a(r0)
            r7 = 4
            if (r8 != r1) goto L90
        L8e:
            r7 = 5
            return r1
        L90:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            return r8
        L93:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 6
            return r8
        L97:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L9b:
            r7 = 6
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d1.a(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    @Nullable
    public Object emit(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f314116a.emit(t10, dVar);
    }
}
