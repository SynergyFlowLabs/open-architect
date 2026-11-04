package io.ktor.util.cio;

import io.ktor.utils.io.m;
import io.ktor.utils.io.o0;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nReadersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadersJvm.kt\nio/ktor/util/cio/ReadersJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class k {

    @kotlin.coroutines.jvm.internal.f(c = "io.ktor.util.cio.ReadersJvmKt", f = "ReadersJvm.kt", i = {0, 0, 0}, l = {19}, m = "pass", n = {"$this$pass", "buffer", "block"}, s = {"L$0", "L$1", "L$2"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296551e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296550d = obj;
            this.f296551e |= Integer.MIN_VALUE;
            return k.a(null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0066 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:20:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @io.ktor.utils.io.o0
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r6, @org.jetbrains.annotations.NotNull java.nio.ByteBuffer r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.nio.ByteBuffer, kotlin.Unit> r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r9) {
        /*
            java.lang.String r5 = "Androeed.ru"
            boolean r0 = r9 instanceof io.ktor.util.cio.k.a
            if (r0 == 0) goto L16
            r0 = r9
            io.ktor.util.cio.k$a r0 = (io.ktor.util.cio.k.a) r0
            int r1 = r0.f296551e
            r5 = 0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f296551e = r1
            goto L1c
        L16:
            r5 = 4
            io.ktor.util.cio.k$a r0 = new io.ktor.util.cio.k$a
            r0.<init>(r9)
        L1c:
            java.lang.Object r9 = r0.f296550d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            r5 = 0
            int r2 = r0.f296551e
            r3 = 1
            r3 = 1
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r6 = r0.f296549c
            r5 = 1
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r7 = r0.f296548b
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            java.lang.Object r8 = r0.f296547a
            r5 = 4
            io.ktor.utils.io.h r8 = (io.ktor.utils.io.h) r8
            kotlin.ResultKt.m(r9)
            r4 = r8
            r8 = r6
            r8 = r6
            r6 = r4
            r5 = 5
            goto L67
        L42:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4a:
            kotlin.ResultKt.m(r9)
        L4d:
            r5 = 4
            boolean r9 = r6.k()
            if (r9 != 0) goto L6e
            r7.clear()
            r0.f296547a = r6
            r0.f296548b = r7
            r0.f296549c = r8
            r0.f296551e = r3
            java.lang.Object r9 = io.ktor.utils.io.m.k(r6, r7, r0)
            r5 = 3
            if (r9 != r1) goto L67
            return r1
        L67:
            r7.flip()
            r8.invoke(r7)
            goto L4d
        L6e:
            java.lang.Throwable r6 = r6.e()
            if (r6 != 0) goto L78
            r5 = 7
            kotlin.Unit r6 = kotlin.Unit.f312394a
            return r6
        L78:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.util.cio.k.a(io.ktor.utils.io.h, java.nio.ByteBuffer, kotlin.jvm.functions.Function1, kotlin.coroutines.d):java.lang.Object");
    }

    @o0
    private static final Object b(io.ktor.utils.io.h hVar, ByteBuffer byteBuffer, Function1<? super ByteBuffer, Unit> function1, kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        while (!hVar.k()) {
            byteBuffer.clear();
            h0.e(0);
            m.k(hVar, byteBuffer, dVar);
            h0.e(1);
            byteBuffer.flip();
            function1.invoke(byteBuffer);
        }
        Throwable thE = hVar.e();
        if (thE == null) {
            return Unit.f312394a;
        }
        throw thE;
    }
}
