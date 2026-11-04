package androidx.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.q3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m<T> extends a1<T> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private f<T> f52434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private s f52435o;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {}, l = {226}, m = "clearSource$lifecycle_livedata_release", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f52436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<T> f52437b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f52438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<T> mVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f52437b = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f52436a = obj;
            this.f52438c |= Integer.MIN_VALUE;
            return this.f52437b.w(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {219, 220}, m = "emitSource$lifecycle_livedata_release", n = {"source"}, s = {"L$0"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f52439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f52440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ m<T> f52441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f52442d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m<T> mVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f52441c = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f52440b = obj;
            this.f52442d |= Integer.MIN_VALUE;
            return this.f52441c.x(null, this);
        }
    }

    public /* synthetic */ m(CoroutineContext coroutineContext, long j10, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i10 & 2) != 0 ? 5000L : j10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(m mVar) {
        mVar.f52434n = null;
        return Unit.f312394a;
    }

    @Override // androidx.lifecycle.a1, androidx.lifecycle.w0
    protected void m() {
        super.m();
        f<T> fVar = this.f52434n;
        if (fVar != null) {
            fVar.h();
        }
    }

    @Override // androidx.lifecycle.a1, androidx.lifecycle.w0
    protected void n() {
        super.n();
        f<T> fVar = this.f52434n;
        if (fVar != null) {
            fVar.g();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object w(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f52438c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f52438c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f52436a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f52438c;
        if (i11 == 0) {
            ResultKt.m(obj);
            s sVar = this.f52435o;
            if (sVar != null) {
                aVar.f52438c = 1;
                if (sVar.b(aVar) == objL) {
                    return objL;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
        }
        this.f52435o = null;
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (r8 == r1) goto L21;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(@org.jetbrains.annotations.NotNull androidx.lifecycle.w0<T> r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlinx.coroutines.o1> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.lifecycle.m.b
            if (r0 == 0) goto L16
            r0 = r8
            r5 = 1
            androidx.lifecycle.m$b r0 = (androidx.lifecycle.m.b) r0
            int r1 = r0.f52442d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 5
            r3 = r1 & r2
            r5 = 3
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f52442d = r1
            goto L1c
        L16:
            androidx.lifecycle.m$b r0 = new androidx.lifecycle.m$b
            r5 = 3
            r0.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r0.f52440b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 5
            int r2 = r0.f52442d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            r5 = 7
            kotlin.ResultKt.m(r8)
            r5 = 1
            goto L63
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r7 = r0.f52439a
            androidx.lifecycle.w0 r7 = (androidx.lifecycle.w0) r7
            r5 = 1
            kotlin.ResultKt.m(r8)
            r5 = 0
            goto L55
        L45:
            kotlin.ResultKt.m(r8)
            r5 = 7
            r0.f52439a = r7
            r0.f52442d = r4
            java.lang.Object r8 = r6.w(r0)
            r5 = 0
            if (r8 != r1) goto L55
            goto L61
        L55:
            r8 = 0
            r0.f52439a = r8
            r0.f52442d = r3
            java.lang.Object r8 = androidx.lifecycle.o.a(r6, r7, r0)
            r5 = 5
            if (r8 != r1) goto L63
        L61:
            r5 = 0
            return r1
        L63:
            r5 = 6
            androidx.lifecycle.s r8 = (androidx.lifecycle.s) r8
            r6.f52435o = r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.x(androidx.lifecycle.w0, kotlin.coroutines.d):java.lang.Object");
    }

    public m(@NotNull CoroutineContext context, long j10, @NotNull Function2<? super y0<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        this.f52434n = new f<>(this, block, j10, kotlinx.coroutines.t0.a(kotlinx.coroutines.l1.e().R0().plus(context).plus(q3.a((kotlinx.coroutines.p2) context.get(kotlinx.coroutines.p2.M2)))), new Function0() { // from class: androidx.lifecycle.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return m.v(this.f52425a);
            }
        });
    }
}
