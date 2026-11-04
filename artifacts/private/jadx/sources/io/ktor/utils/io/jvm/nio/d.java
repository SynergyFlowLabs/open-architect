package io.ktor.utils.io.jvm.nio;

import io.ktor.utils.io.p;
import java.nio.ByteBuffer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.i1;
import kotlinx.io.t;
import kotlinx.io.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nWriteSuspendSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WriteSuspendSession.kt\nio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,62:1\n195#2,28:63\n*S KotlinDebug\n*F\n+ 1 WriteSuspendSession.kt\nio/ktor/utils/io/jvm/nio/WriteSuspendSessionKt\n*L\n54#1:63,28\n*E\n"})
public final class d {

    @f(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0}, l = {43, 45, 45}, m = "writeSuspendSession", n = {"$this$writeSuspendSession"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f296934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f296935c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296934b = obj;
            this.f296935c |= Integer.MIN_VALUE;
            return d.a(null, null, this);
        }
    }

    @f(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0, 0, 0}, l = {com.planner5d.library.engine.input.f.b.D0}, m = "writeWhile", n = {"$this$writeWhile", "block", "done"}, s = {"L$0", "L$1", "L$2"})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f296936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f296937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f296938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f296939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f296940e;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f296939d = obj;
            this.f296940e |= Integer.MIN_VALUE;
            return d.b(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r8 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [io.ktor.utils.io.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v3, types: [io.ktor.utils.io.p] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [io.ktor.utils.io.p] */
    @kotlin.l(level = kotlin.n.WARNING, message = "writeSuspendSession deprecated, use writeWhile instead", replaceWith = @kotlin.b1(expression = "writeWhile { buffer -> }", imports = {}))
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@org.jetbrains.annotations.NotNull io.ktor.utils.io.p r8, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super io.ktor.utils.io.jvm.nio.c, ? super kotlin.coroutines.d<? super kotlin.Unit>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.d<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            java.lang.String r7 = "Androeed.ru"
            boolean r0 = r10 instanceof io.ktor.utils.io.jvm.nio.d.a
            if (r0 == 0) goto L16
            r0 = r10
            io.ktor.utils.io.jvm.nio.d$a r0 = (io.ktor.utils.io.jvm.nio.d.a) r0
            int r1 = r0.f296935c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r7 = 5
            r0.f296935c = r1
            goto L1b
        L16:
            io.ktor.utils.io.jvm.nio.d$a r0 = new io.ktor.utils.io.jvm.nio.d$a
            r0.<init>(r10)
        L1b:
            java.lang.Object r10 = r0.f296934b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f296935c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L57
            if (r2 == r5) goto L46
            if (r2 == r4) goto L42
            if (r2 == r3) goto L38
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r7 = 5
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            r8.<init>(r9)
            throw r8
        L38:
            java.lang.Object r8 = r0.f296933a
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            r7 = 1
            kotlin.ResultKt.m(r10)
            r7 = 6
            goto L8a
        L42:
            kotlin.ResultKt.m(r10)
            goto L78
        L46:
            r7 = 5
            java.lang.Object r8 = r0.f296933a
            io.ktor.utils.io.p r8 = (io.ktor.utils.io.p) r8
            r7 = 7
            kotlin.ResultKt.m(r10)     // Catch: java.lang.Throwable -> L50
            goto L6a
        L50:
            r9 = move-exception
            r6 = r9
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = 0
            goto L7c
        L57:
            kotlin.ResultKt.m(r10)
            io.ktor.utils.io.jvm.nio.c r10 = new io.ktor.utils.io.jvm.nio.c     // Catch: java.lang.Throwable -> L50
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L50
            r0.f296933a = r8     // Catch: java.lang.Throwable -> L50
            r0.f296935c = r5     // Catch: java.lang.Throwable -> L50
            java.lang.Object r9 = r9.invoke(r10, r0)     // Catch: java.lang.Throwable -> L50
            if (r9 != r1) goto L6a
            goto L88
        L6a:
            r7 = 1
            r9 = 0
            r0.f296933a = r9
            r0.f296935c = r4
            r7 = 6
            java.lang.Object r8 = r8.d(r0)
            if (r8 != r1) goto L78
            goto L88
        L78:
            kotlin.Unit r8 = kotlin.Unit.f312394a
            r7 = 5
            return r8
        L7c:
            r0.f296933a = r8
            r7 = 1
            r0.f296935c = r3
            java.lang.Object r9 = r9.d(r0)
            r7 = 4
            if (r9 != r1) goto L8a
        L88:
            r7 = 0
            return r1
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.nio.d.a(io.ktor.utils.io.p, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public static final Object b(@NotNull p pVar, @NotNull Function1<? super ByteBuffer, Boolean> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        p pVar2;
        i1.a aVar;
        Function1<? super ByteBuffer, Boolean> function2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f296940e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f296940e = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f296939d;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f296940e;
        if (i11 == 0) {
            ResultKt.m(obj);
            pVar2 = pVar;
            aVar = new i1.a();
            function2 = function1;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (i1.a) bVar.f296938c;
            Function1<? super ByteBuffer, Boolean> function3 = (Function1) bVar.f296937b;
            p pVar3 = (p) bVar.f296936a;
            ResultKt.m(obj);
            function2 = function3;
            pVar2 = pVar3;
        }
        while (!aVar.f312744a) {
            kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
            kotlinx.io.b bVarN = pVar2.i().n();
            t tVarR = bVarN.R(1);
            byte[] bArrB = tVarR.b(false);
            int iD = tVarR.d();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iD, bArrB.length - iD);
            Intrinsics.checkNotNull(byteBufferWrap);
            aVar.f312744a = !function2.invoke(byteBufferWrap).booleanValue();
            int iPosition = byteBufferWrap.position() - iD;
            if (iPosition == 1) {
                tVarR.I(bArrB, iPosition);
                tVarR.x(tVarR.d() + iPosition);
                bVarN.H(bVarN.l() + ((long) iPosition));
            } else {
                if (iPosition < 0 || iPosition > tVarR.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + iPosition + ". Should be in 0.." + tVarR.l()).toString());
                }
                if (iPosition != 0) {
                    tVarR.I(bArrB, iPosition);
                    tVarR.x(tVarR.d() + iPosition);
                    bVarN.H(bVarN.l() + ((long) iPosition));
                } else if (v.d(tVarR)) {
                    bVarN.y();
                }
            }
            bVar.f296936a = pVar2;
            bVar.f296937b = function2;
            bVar.f296938c = aVar;
            bVar.f296940e = 1;
            if (pVar2.d(bVar) == objL) {
                return objL;
            }
        }
        return Unit.f312394a;
    }

    private static final Object c(p pVar, Function1<? super ByteBuffer, Boolean> function1, kotlin.coroutines.d<? super Unit> dVar) {
        i1.a aVar = new i1.a();
        while (!aVar.f312744a) {
            kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
            kotlinx.io.b bVarN = pVar.i().n();
            t tVarR = bVarN.R(1);
            byte[] bArrB = tVarR.b(false);
            Integer numValueOf = Integer.valueOf(tVarR.d());
            int iIntValue = Integer.valueOf(bArrB.length).intValue();
            int iIntValue2 = numValueOf.intValue();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iIntValue2, iIntValue - iIntValue2);
            Intrinsics.checkNotNull(byteBufferWrap);
            aVar.f312744a = !function1.invoke(byteBufferWrap).booleanValue();
            int iIntValue3 = Integer.valueOf(byteBufferWrap.position() - iIntValue2).intValue();
            if (iIntValue3 == 1) {
                tVarR.I(bArrB, iIntValue3);
                tVarR.x(tVarR.d() + iIntValue3);
                bVarN.H(bVarN.l() + ((long) iIntValue3));
            } else {
                if (iIntValue3 < 0 || iIntValue3 > tVarR.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + iIntValue3 + ". Should be in 0.." + tVarR.l()).toString());
                }
                if (iIntValue3 != 0) {
                    tVarR.I(bArrB, iIntValue3);
                    tVarR.x(tVarR.d() + iIntValue3);
                    bVarN.H(bVarN.l() + ((long) iIntValue3));
                } else if (v.d(tVarR)) {
                    bVarN.y();
                }
            }
            h0.e(0);
            pVar.d(dVar);
            h0.e(1);
        }
        return Unit.f312394a;
    }
}
