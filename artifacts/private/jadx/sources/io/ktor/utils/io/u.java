package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteWriteChannelOperations.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannelOperations.jvm.kt\nio/ktor/utils/io/ByteWriteChannelOperations_jvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n195#2,28:74\n195#2,28:103\n1#3:102\n*S KotlinDebug\n*F\n+ 1 ByteWriteChannelOperations.jvm.kt\nio/ktor/utils/io/ByteWriteChannelOperations_jvmKt\n*L\n26#1:74,28\n59#1:103,28\n*E\n"})
public final class u {
    @Nullable
    public static final Object a(@NotNull p pVar, int i10, @NotNull Function1<? super ByteBuffer, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = pVar.i().n();
        kotlinx.io.t tVarR = bVarN.R(i10);
        byte[] bArrB = tVarR.b(false);
        int iD = tVarR.d();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iD, bArrB.length - iD);
        Intrinsics.checkNotNull(byteBufferWrap);
        function1.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iD;
        if (iPosition == i10) {
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
            } else if (kotlinx.io.v.d(tVarR)) {
                bVarN.y();
            }
        }
        Object objD = pVar.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    public static /* synthetic */ Object b(p pVar, int i10, Function1 function1, kotlin.coroutines.d dVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return a(pVar, i10, function1, dVar);
    }

    public static final int c(@NotNull p pVar, int i10, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        if (i10 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i10 > 1048576) {
            throw new IllegalArgumentException(("Min(" + i10 + ") shouldn't be greater than 1048576").toString());
        }
        if (pVar.h()) {
            return -1;
        }
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = pVar.i().n();
        kotlinx.io.t tVarR = bVarN.R(i10);
        byte[] bArrB = tVarR.b(false);
        int iD = tVarR.d();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iD, bArrB.length - iD);
        Intrinsics.checkNotNull(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iD;
        int iPosition2 = byteBufferWrap.position() - iD;
        if (iPosition2 == i10) {
            tVarR.I(bArrB, iPosition2);
            tVarR.x(tVarR.d() + iPosition2);
            bVarN.H(bVarN.l() + ((long) iPosition2));
            return iPosition;
        }
        if (iPosition2 < 0 || iPosition2 > tVarR.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + iPosition2 + ". Should be in 0.." + tVarR.l()).toString());
        }
        if (iPosition2 == 0) {
            if (kotlinx.io.v.d(tVarR)) {
                bVarN.y();
            }
            return iPosition;
        }
        tVarR.I(bArrB, iPosition2);
        tVarR.x(tVarR.d() + iPosition2);
        bVarN.H(bVarN.l() + ((long) iPosition2));
        return iPosition;
    }

    public static final void d(@NotNull p pVar, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        kotlinx.io.a0.g(pVar.i(), buffer);
    }

    public static /* synthetic */ int e(p pVar, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return c(pVar, i10, function1);
    }

    @Nullable
    public static final Object f(@NotNull p pVar, @NotNull ByteBuffer byteBuffer, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        ui.r.a(pVar.i(), byteBuffer);
        Object objD = pVar.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    @Nullable
    public static final Object g(@NotNull p pVar, @NotNull ByteBuffer byteBuffer, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        ui.r.a(pVar.i(), byteBuffer);
        Object objD = pVar.d(dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }
}
