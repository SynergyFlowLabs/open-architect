package io.ktor.utils.io;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final p f297176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f297177c;

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.utils.io.CloseHookByteWriteChannel", f = "CloseHookByteWriteChannel.kt", i = {}, l = {24, 25}, m = "flushAndClose", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f297178a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f297180c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f297178a = obj;
            this.f297180c |= Integer.MIN_VALUE;
            return y.this.g(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@NotNull p delegate, @NotNull Function1<? super kotlin.coroutines.d<? super Unit>, ? extends Object> onClose) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        this.f297176b = delegate;
        this.f297177c = onClose;
    }

    @Override // io.ktor.utils.io.p
    public void c(@Nullable Throwable th2) {
        this.f297176b.c(th2);
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Object d(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f297176b.d(dVar);
    }

    @Override // io.ktor.utils.io.p
    @Nullable
    public Throwable e() {
        return this.f297176b.e();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r6.invoke(r0) == r1) goto L22;
     */
    @Override // io.ktor.utils.io.p
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof io.ktor.utils.io.y.a
            r5 = 4
            if (r0 == 0) goto L14
            r0 = r7
            io.ktor.utils.io.y$a r0 = (io.ktor.utils.io.y.a) r0
            int r1 = r0.f297180c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f297180c = r1
            goto L1b
        L14:
            r5 = 4
            io.ktor.utils.io.y$a r0 = new io.ktor.utils.io.y$a
            r5 = 5
            r0.<init>(r7)
        L1b:
            r5 = 3
            java.lang.Object r7 = r0.f297178a
            r5 = 7
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f297180c
            r5 = 7
            r3 = 2
            r4 = 1
            r5 = 3
            if (r2 == 0) goto L43
            r5 = 5
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            kotlin.ResultKt.m(r7)
            r5 = 6
            goto L5f
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            r5 = 2
            kotlin.ResultKt.m(r7)
            r5 = 5
            goto L52
        L43:
            kotlin.ResultKt.m(r7)
            r5 = 7
            io.ktor.utils.io.p r7 = r6.f297176b
            r0.f297180c = r4
            java.lang.Object r7 = r7.g(r0)
            if (r7 != r1) goto L52
            goto L5e
        L52:
            r5 = 4
            kotlin.jvm.functions.Function1<kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r6 = r6.f297177c
            r0.f297180c = r3
            r5 = 4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.y.g(kotlin.coroutines.d):java.lang.Object");
    }

    @Override // io.ktor.utils.io.p
    public boolean h() {
        return this.f297176b.h();
    }

    @Override // io.ktor.utils.io.p
    @NotNull
    public kotlinx.io.x i() {
        return this.f297176b.i();
    }
}
