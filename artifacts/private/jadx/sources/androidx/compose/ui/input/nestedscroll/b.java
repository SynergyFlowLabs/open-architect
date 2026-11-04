package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.c0;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.s0;
import n0.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f38922e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private d f38923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private d f38924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private Function0<? extends s0> f38925c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private s0 f38926d;

    static final class a extends l0 implements Function0<s0> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s0 invoke() {
            return b.this.j();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.b$b, reason: collision with other inner class name */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {222, 224}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {})
    static final class C0296b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38928a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38930c;

        C0296b(kotlin.coroutines.d<? super C0296b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38928a = obj;
            this.f38930c |= Integer.MIN_VALUE;
            return b.this.a(0L, 0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {199}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f38931a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f38933c;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f38931a = obj;
            this.f38933c |= Integer.MIN_VALUE;
            return b.this.c(0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r0 == r1) goto L31;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r7, long r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> r11) {
        /*
            r6 = this;
            java.lang.String r5 = "Androeed.ru"
            boolean r0 = r11 instanceof androidx.compose.ui.input.nestedscroll.b.C0296b
            if (r0 == 0) goto L1b
            r0 = r11
            r5 = 1
            androidx.compose.ui.input.nestedscroll.b$b r0 = (androidx.compose.ui.input.nestedscroll.b.C0296b) r0
            r5 = 5
            int r1 = r0.f38930c
            r5 = 1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L1b
            int r1 = r1 - r2
            r0.f38930c = r1
        L17:
            r11 = r0
            r11 = r0
            r5 = 1
            goto L21
        L1b:
            androidx.compose.ui.input.nestedscroll.b$b r0 = new androidx.compose.ui.input.nestedscroll.b$b
            r0.<init>(r11)
            goto L17
        L21:
            r5 = 5
            java.lang.Object r0 = r11.f38928a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r11.f38930c
            r3 = 2
            r5 = 4
            r4 = 1
            if (r2 == 0) goto L49
            r5 = 1
            if (r2 == r4) goto L44
            if (r2 != r3) goto L39
            kotlin.ResultKt.m(r0)
            r5 = 3
            goto L86
        L39:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = " vso/kirue/benm ao/er iethe/ooer/will/tcsouftc  n /"
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 5
            r6.<init>(r7)
            throw r6
        L44:
            r5 = 1
            kotlin.ResultKt.m(r0)
            goto L64
        L49:
            r5 = 0
            kotlin.ResultKt.m(r0)
            androidx.compose.ui.input.nestedscroll.a r0 = r6.i()
            if (r0 != 0) goto L73
            androidx.compose.ui.input.nestedscroll.d r6 = r6.f38924b
            if (r6 == 0) goto L6c
            r5 = 6
            r11.f38930c = r4
            r5 = 1
            java.lang.Object r0 = r6.B0(r7, r9, r11)
            r5 = 3
            if (r0 != r1) goto L64
            r5 = 0
            goto L84
        L64:
            androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
            long r6 = r0.v()
            r5 = 6
            goto L95
        L6c:
            androidx.compose.ui.unit.c0$a r6 = androidx.compose.ui.unit.c0.f42681b
            long r6 = r6.a()
            goto L95
        L73:
            r5 = 6
            androidx.compose.ui.input.nestedscroll.a r6 = r6.i()
            r5 = 3
            if (r6 == 0) goto L8e
            r11.f38930c = r3
            java.lang.Object r0 = r6.B0(r7, r9, r11)
            r5 = 7
            if (r0 != r1) goto L86
        L84:
            r5 = 3
            return r1
        L86:
            androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
            r5 = 1
            long r6 = r0.v()
            goto L95
        L8e:
            androidx.compose.ui.unit.c0$a r6 = androidx.compose.ui.unit.c0.f42681b
            r5 = 7
            long r6 = r6.a()
        L95:
            androidx.compose.ui.unit.c0 r6 = androidx.compose.ui.unit.c0.b(r6)
            r5 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.b.a(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    public final long b(long j10, long j11, int i10) {
        androidx.compose.ui.input.nestedscroll.a aVarI = i();
        return aVarI != null ? aVarI.b2(j10, j11, i10) : g.f332700b.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object c(long j10, @NotNull kotlin.coroutines.d<? super c0> dVar) {
        c cVar;
        long jA;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f38933c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f38933c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objA4 = cVar.f38931a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f38933c;
        if (i11 == 0) {
            ResultKt.m(objA4);
            androidx.compose.ui.input.nestedscroll.a aVarI = i();
            if (aVarI != null) {
                cVar.f38933c = 1;
                objA4 = aVarI.a4(j10, cVar);
                if (objA4 == objL) {
                    return objL;
                }
            } else {
                jA = c0.f42681b.a();
            }
            return c0.b(jA);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(objA4);
        jA = ((c0) objA4).v();
        return c0.b(jA);
    }

    public final long d(long j10, int i10) {
        androidx.compose.ui.input.nestedscroll.a aVarI = i();
        return aVarI != null ? aVarI.G7(j10, i10) : g.f332700b.e();
    }

    @NotNull
    public final Function0<s0> e() {
        return this.f38925c;
    }

    @NotNull
    public final s0 f() {
        s0 s0VarInvoke = this.f38925c.invoke();
        if (s0VarInvoke != null) {
            return s0VarInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Nullable
    public final d g() {
        return this.f38924b;
    }

    @Nullable
    public final d h() {
        return this.f38923a;
    }

    @Nullable
    public final androidx.compose.ui.input.nestedscroll.a i() {
        d dVar = this.f38923a;
        if (dVar != null) {
            return dVar.B9();
        }
        return null;
    }

    @Nullable
    public final s0 j() {
        return this.f38926d;
    }

    public final void k(@NotNull Function0<? extends s0> function0) {
        this.f38925c = function0;
    }

    public final void l(@Nullable d dVar) {
        this.f38924b = dVar;
    }

    public final void m(@Nullable d dVar) {
        this.f38923a = dVar;
    }

    public final void n(@Nullable s0 s0Var) {
        this.f38926d = s0Var;
    }
}
