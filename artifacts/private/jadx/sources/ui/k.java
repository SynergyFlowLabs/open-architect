package ui;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.a0;
import kotlinx.io.c0;
import kotlinx.io.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nByteReadPacketExtensions.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadPacketExtensions.jvm.kt\nio/ktor/utils/io/core/ByteReadPacketExtensions_jvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n99#2:37\n100#2,8:39\n1#3:38\n*S KotlinDebug\n*F\n+ 1 ByteReadPacketExtensions.jvm.kt\nio/ktor/utils/io/core/ByteReadPacketExtensions_jvmKt\n*L\n28#1:37\n28#1:39,8\n28#1:38\n*E\n"})
public final class k {
    @NotNull
    public static final c0 a(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        kotlinx.io.b bVar = new kotlinx.io.b();
        a0.g(bVar, byteBuffer);
        return bVar;
    }

    public static final void b(@NotNull c0 c0Var, @NotNull Function1<? super ByteBuffer, Unit> block) throws EOFException {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = c0Var.n();
        if (bVarN.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        kotlinx.io.t tVarG = bVarN.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iH, tVarG.d() - iH);
        Intrinsics.checkNotNull(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iH;
        if (iPosition != 0) {
            if (iPosition < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (iPosition > tVarG.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bVarN.skip(iPosition);
        }
    }

    public static final int c(@NotNull c0 c0Var, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int iRemaining = buffer.remaining();
        f0.g(c0Var, buffer);
        return iRemaining - buffer.remaining();
    }

    public static final void d(@NotNull c0 c0Var, @NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (!c0Var.y1() && buffer.hasRemaining()) {
            f0.g(c0Var, buffer);
        }
    }
}
