package vi;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.t;
import kotlinx.io.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nChunkBufferJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkBufferJvm.kt\nio/ktor/utils/io/core/internal/ChunkBufferJvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n195#2,28:32\n99#2:60\n100#2,8:62\n1#3:61\n*S KotlinDebug\n*F\n+ 1 ChunkBufferJvm.kt\nio/ktor/utils/io/core/internal/ChunkBufferJvmKt\n*L\n14#1:32,28\n23#1:60\n23#1:62,8\n23#1:61\n*E\n"})
public final class b {
    public static final void a(@NotNull kotlinx.io.b bVar, @NotNull Function1<? super ByteBuffer, Unit> block) throws EOFException {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = bVar.n();
        if (bVarN.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t tVarG = bVarN.g();
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

    public static final void b(@NotNull kotlinx.io.b bVar, int i10, @NotNull Function1<? super ByteBuffer, Unit> block) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        kotlinx.io.b bVarN = bVar.n();
        t tVarR = bVarN.R(i10);
        byte[] bArrB = tVarR.b(false);
        int iD = tVarR.d();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrB, iD, bArrB.length - iD);
        Intrinsics.checkNotNull(byteBufferWrap);
        block.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iD;
        if (iPosition == i10) {
            tVarR.I(bArrB, iPosition);
            tVarR.x(tVarR.d() + iPosition);
            bVarN.H(bVarN.l() + ((long) iPosition));
            return;
        }
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
}
