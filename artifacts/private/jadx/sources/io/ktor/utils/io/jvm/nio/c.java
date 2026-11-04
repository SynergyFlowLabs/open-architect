package io.ktor.utils.io.jvm.nio;

import io.ktor.utils.io.p;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ui.r;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final p f296928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ByteBuffer f296929b;

    @f(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", i = {}, l = {30, 32}, m = "written", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f296930a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296932c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296930a = obj;
            this.f296932c |= Integer.MIN_VALUE;
            return c.this.d(0, this);
        }
    }

    public c(@NotNull p channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f296928a = channel;
        this.f296929b = ByteBuffer.allocate(8192);
    }

    @NotNull
    public final p a() {
        return this.f296928a;
    }

    @Nullable
    public final ByteBuffer b(int i10) {
        return this.f296929b;
    }

    public final void c(int i10) {
        x xVarI = this.f296928a.i();
        ByteBuffer byteBuffer = this.f296929b;
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        r.a(xVarI, byteBuffer);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r6.d(r7) == r0) goto L22;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            r5 = 7
            boolean r7 = r8 instanceof io.ktor.utils.io.jvm.nio.c.a
            if (r7 == 0) goto L19
            r7 = r8
            r7 = r8
            r5 = 5
            io.ktor.utils.io.jvm.nio.c$a r7 = (io.ktor.utils.io.jvm.nio.c.a) r7
            r5 = 3
            int r0 = r7.f296932c
            r5 = 7
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            r5 = 5
            if (r2 == 0) goto L19
            int r0 = r0 - r1
            r7.f296932c = r0
            goto L1e
        L19:
            io.ktor.utils.io.jvm.nio.c$a r7 = new io.ktor.utils.io.jvm.nio.c$a
            r7.<init>(r8)
        L1e:
            java.lang.Object r8 = r7.f296930a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            r5 = 3
            int r1 = r7.f296932c
            r5 = 4
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L43
            r5 = 2
            if (r1 == r3) goto L3e
            if (r1 != r2) goto L36
            r5 = 5
            kotlin.ResultKt.m(r8)
            goto L70
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            r5 = 7
            kotlin.ResultKt.m(r8)
            goto L5f
        L43:
            kotlin.ResultKt.m(r8)
            java.nio.ByteBuffer r8 = r6.f296929b
            r8.flip()
            io.ktor.utils.io.p r8 = r6.f296928a
            r5 = 4
            java.nio.ByteBuffer r1 = r6.f296929b
            java.lang.String r4 = "byteBuffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            r7.f296932c = r3
            java.lang.Object r8 = io.ktor.utils.io.u.g(r8, r1, r7)
            r5 = 0
            if (r8 != r0) goto L5f
            goto L6f
        L5f:
            java.nio.ByteBuffer r8 = r6.f296929b
            r8.clear()
            io.ktor.utils.io.p r6 = r6.f296928a
            r7.f296932c = r2
            java.lang.Object r6 = r6.d(r7)
            r5 = 3
            if (r6 != r0) goto L70
        L6f:
            return r0
        L70:
            r5 = 4
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.c.d(int, kotlin.coroutines.d):java.lang.Object");
    }
}
