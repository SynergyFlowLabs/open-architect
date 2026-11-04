package androidx.compose.foundation;

import android.view.Surface;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
abstract class y implements h, h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f21895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private pj.p<? super g5, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> f21896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private pj.n<? super Surface, ? super Integer, ? super Integer, Unit> f21897c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private Function1<? super Surface, Unit> f21898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.p2 f21899e;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1", f = "AndroidExternalSurface.android.kt", i = {0}, l = {130, 136}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f21900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21901b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Surface f21903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f21904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f21905f;

        /* JADX INFO: renamed from: androidx.compose.foundation.y$a$a, reason: collision with other inner class name */
        public static final class C0166a implements g5, h5, kotlinx.coroutines.s0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ y f21906a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final /* synthetic */ kotlinx.coroutines.s0 f21907b;

            C0166a(y yVar, kotlinx.coroutines.s0 s0Var) {
                this.f21906a = yVar;
                this.f21907b = s0Var;
            }

            @Override // androidx.compose.foundation.h5
            public void c(Surface surface, pj.n<? super Surface, ? super Integer, ? super Integer, Unit> nVar) {
                this.f21906a.c(surface, nVar);
            }

            @Override // androidx.compose.foundation.h5
            public void e(Surface surface, Function1<? super Surface, Unit> function1) {
                this.f21906a.e(surface, function1);
            }

            @Override // kotlinx.coroutines.s0
            public CoroutineContext getCoroutineContext() {
                return this.f21907b.getCoroutineContext();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Surface surface, int i10, int i11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f21903d = surface;
            this.f21904e = i10;
            this.f21905f = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = y.this.new a(this.f21903d, this.f21904e, this.f21905f, dVar);
            aVar.f21901b = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
        
            if (r3.invoke(r4, r5, r6, r7, r10) == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                r9 = 5
                int r1 = r10.f21900a
                r2 = 2
                r9 = 7
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L20
                if (r1 != r2) goto L15
                r9 = 2
                kotlin.ResultKt.m(r11)
                goto L79
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "v/sekro//  /rihe/esuilaccitmleeotnt /uwb/ roo n o/e"
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r9 = 0
                r10.<init>(r11)
                throw r10
            L20:
                r9 = 0
                java.lang.Object r1 = r10.f21901b
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                kotlin.ResultKt.m(r11)
                r9 = 1
                goto L4b
            L2a:
                r9 = 0
                kotlin.ResultKt.m(r11)
                java.lang.Object r11 = r10.f21901b
                r1 = r11
                r9 = 7
                kotlinx.coroutines.s0 r1 = (kotlinx.coroutines.s0) r1
                androidx.compose.foundation.y r11 = androidx.compose.foundation.y.this
                r9 = 5
                kotlinx.coroutines.p2 r11 = androidx.compose.foundation.y.b(r11)
                r9 = 4
                if (r11 == 0) goto L4b
                r9 = 5
                r10.f21901b = r1
                r9 = 0
                r10.f21900a = r3
                java.lang.Object r11 = kotlinx.coroutines.s2.l(r11, r10)
                if (r11 != r0) goto L4b
                goto L78
            L4b:
                androidx.compose.foundation.y$a$a r4 = new androidx.compose.foundation.y$a$a
                androidx.compose.foundation.y r11 = androidx.compose.foundation.y.this
                r4.<init>(r11, r1)
                androidx.compose.foundation.y r11 = androidx.compose.foundation.y.this
                pj.p r3 = androidx.compose.foundation.y.d(r11)
                if (r3 == 0) goto L79
                android.view.Surface r5 = r10.f21903d
                int r11 = r10.f21904e
                java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.f(r11)
                int r11 = r10.f21905f
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.f(r11)
                r9 = 6
                r11 = 0
                r10.f21901b = r11
                r10.f21900a = r2
                r8 = r10
                r8 = r10
                r9 = 7
                java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
                r9 = 1
                if (r10 != r0) goto L79
            L78:
                return r0
            L79:
                kotlin.Unit r10 = kotlin.Unit.f312394a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.y.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public y(@NotNull kotlinx.coroutines.s0 s0Var) {
        this.f21895a = s0Var;
    }

    @Override // androidx.compose.foundation.h
    public void a(@NotNull pj.p<? super g5, ? super Surface, ? super Integer, ? super Integer, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> pVar) {
        this.f21896b = pVar;
    }

    @Override // androidx.compose.foundation.h5
    public void c(@NotNull Surface surface, @NotNull pj.n<? super Surface, ? super Integer, ? super Integer, Unit> nVar) {
        this.f21897c = nVar;
    }

    @Override // androidx.compose.foundation.h5
    public void e(@NotNull Surface surface, @NotNull Function1<? super Surface, Unit> function1) {
        this.f21898d = function1;
    }

    public final void f(@NotNull Surface surface, int i10, int i11) {
        pj.n<? super Surface, ? super Integer, ? super Integer, Unit> nVar = this.f21897c;
        if (nVar != null) {
            nVar.invoke(surface, Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    public final void g(@NotNull Surface surface, int i10, int i11) {
        if (this.f21896b != null) {
            this.f21899e = kotlinx.coroutines.k.f(this.f21895a, null, kotlinx.coroutines.u0.UNDISPATCHED, new a(surface, i10, i11, null), 1, null);
        }
    }

    public final void h(@NotNull Surface surface) {
        Function1<? super Surface, Unit> function1 = this.f21898d;
        if (function1 != null) {
            function1.invoke(surface);
        }
        kotlinx.coroutines.p2 p2Var = this.f21899e;
        if (p2Var != null) {
            kotlinx.coroutines.p2.a.b(p2Var, null, 1, null);
        }
    }

    @NotNull
    public final kotlinx.coroutines.s0 i() {
        return this.f21895a;
    }
}
