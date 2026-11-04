package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.h;
import java.io.OutputStream;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWriting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Writing.kt\nio/ktor/utils/io/jvm/javaio/WritingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n1#2:33\n*E\n"})
public final class d {

    @f(c = "io.ktor.utils.io.jvm.javaio.WritingKt", f = "Writing.kt", i = {0, 0, 0}, l = {25}, m = "copyTo", n = {"$this$copyTo", "out", "result"}, s = {"L$0", "L$1", "J$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f296924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296926e;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296925d = obj;
            this.f296926e |= Integer.MIN_VALUE;
            return d.a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x006d -> B:25:0x0071). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0076 -> B:27:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:21:0x005c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.utils.io.h r16, @org.jetbrains.annotations.NotNull java.io.OutputStream r17, long r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super java.lang.Long> r20) {
        /*
            r0 = r18
            r2 = r20
            boolean r3 = r2 instanceof io.ktor.utils.io.jvm.javaio.d.a
            if (r3 == 0) goto L17
            r3 = r2
            io.ktor.utils.io.jvm.javaio.d$a r3 = (io.ktor.utils.io.jvm.javaio.d.a) r3
            int r4 = r3.f296926e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f296926e = r4
            goto L1c
        L17:
            io.ktor.utils.io.jvm.javaio.d$a r3 = new io.ktor.utils.io.jvm.javaio.d$a
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f296925d
            java.lang.Object r4 = kotlin.coroutines.intrinsics.b.l()
            int r5 = r3.f296926e
            r6 = 1
            if (r5 == 0) goto L3f
            if (r5 != r6) goto L37
            long r0 = r3.f296924c
            java.lang.Object r5 = r3.f296923b
            java.io.OutputStream r5 = (java.io.OutputStream) r5
            java.lang.Object r7 = r3.f296922a
            io.ktor.utils.io.h r7 = (io.ktor.utils.io.h) r7
            kotlin.ResultKt.m(r2)
            goto L71
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            kotlin.ResultKt.m(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L9b
            r0 = r16
            r1 = r17
        L4c:
            boolean r2 = r0.k()
            if (r2 != 0) goto L96
            kotlinx.io.c0 r2 = r0.j()
            boolean r2 = r2.y1()
            if (r2 == 0) goto L76
            r3.f296922a = r0
            r3.f296923b = r1
            r3.f296924c = r7
            r3.f296926e = r6
            r2 = 0
            r5 = 0
            java.lang.Object r2 = io.ktor.utils.io.h.b.a(r0, r2, r3, r6, r5)
            if (r2 != r4) goto L6d
            return r4
        L6d:
            r5 = r1
            r14 = r7
            r7 = r0
            r0 = r14
        L71:
            r14 = r0
            r0 = r7
            r7 = r14
            r9 = r5
            goto L77
        L76:
            r9 = r1
        L77:
            kotlinx.io.c0 r1 = r0.j()
            kotlinx.io.b r1 = r1.n()
            long r1 = r1.j()
            long r1 = r1 + r7
            kotlinx.io.c0 r5 = r0.j()
            kotlinx.io.b r8 = r5.n()
            r12 = 2
            r13 = 0
            r10 = 0
            kotlinx.io.d.f(r8, r9, r10, r12, r13)
            r7 = r1
            r1 = r9
            goto L4c
        L96:
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.g(r7)
            return r0
        L9b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Limit shouldn't be negative: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.d.a(io.ktor.utils.io.h, java.io.OutputStream, long, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(h hVar, OutputStream outputStream, long j10, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return a(hVar, outputStream, j10, dVar);
    }
}
