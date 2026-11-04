package kotlinx.io.unsafe;

import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.h0;
import kotlinx.io.t;
import kotlinx.io.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nUnsafeBufferOperationsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n99#2:187\n100#2,8:189\n195#2,28:197\n1#3:188\n*S KotlinDebug\n*F\n+ 1 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n*L\n50#1:187\n50#1:189,8\n100#1:197,28\n50#1:188\n*E\n"})
public final class e {
    @h0
    public static final long a(@NotNull d dVar, @NotNull kotlinx.io.b buffer, @NotNull ByteBuffer[] iovec, @NotNull Function2<? super ByteBuffer[], ? super Integer, Long> readAction) throws EOFException {
        int i10;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(iovec, "iovec");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        t tVarG = buffer.g();
        if (tVarG == null) {
            throw new IllegalArgumentException("buffer is empty.");
        }
        if (iovec.length == 0) {
            throw new IllegalArgumentException("iovec is empty.");
        }
        int i11 = 0;
        long j10 = 0;
        while (true) {
            int iH = tVarG.h();
            int iD = tVarG.d() - iH;
            i10 = i11 + 1;
            iovec[i11] = ByteBuffer.wrap(tVarG.b(true), iH, iD).slice().asReadOnlyBuffer();
            j10 += (long) iD;
            tVarG = tVarG.f();
            if (tVarG == null || i10 >= iovec.length) {
                break;
            }
            i11 = i10;
        }
        long jLongValue = readAction.invoke(iovec, Integer.valueOf(i10)).longValue();
        if (jLongValue == 0) {
            return jLongValue;
        }
        if (jLongValue >= 0 && jLongValue <= j10) {
            buffer.skip(jLongValue);
            return jLongValue;
        }
        throw new IllegalStateException("readAction should return a value in range [0, " + j10 + "], but returned: " + jLongValue);
    }

    @h0
    public static final int b(@NotNull d dVar, @NotNull kotlinx.io.b buffer, @NotNull Function1<? super ByteBuffer, Unit> readAction) throws EOFException {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (buffer.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t tVarG = buffer.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArrB, iH, tVarG.d() - iH).slice().asReadOnlyBuffer();
        Intrinsics.checkNotNull(byteBufferAsReadOnlyBuffer);
        readAction.invoke(byteBufferAsReadOnlyBuffer);
        int iPosition = byteBufferAsReadOnlyBuffer.position();
        if (iPosition == 0) {
            return iPosition;
        }
        if (iPosition < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (iPosition > tVarG.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(iPosition);
        return iPosition;
    }

    @h0
    public static final int c(@NotNull d dVar, @NotNull kotlinx.io.b buffer, int i10, @NotNull Function1<? super ByteBuffer, Unit> writeAction) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        t tVarR = buffer.R(i10);
        byte[] bArrB = tVarR.b(false);
        int iD = tVarR.d();
        ByteBuffer byteBufferSlice = ByteBuffer.wrap(bArrB, iD, bArrB.length - iD).slice();
        Intrinsics.checkNotNull(byteBufferSlice);
        writeAction.invoke(byteBufferSlice);
        int iPosition = byteBufferSlice.position();
        if (iPosition == i10) {
            tVarR.I(bArrB, iPosition);
            tVarR.x(tVarR.d() + iPosition);
            buffer.H(buffer.l() + ((long) iPosition));
            return iPosition;
        }
        if (iPosition < 0 || iPosition > tVarR.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + iPosition + ". Should be in 0.." + tVarR.l()).toString());
        }
        if (iPosition == 0) {
            if (v.d(tVarR)) {
                buffer.y();
            }
            return iPosition;
        }
        tVarR.I(bArrB, iPosition);
        tVarR.x(tVarR.d() + iPosition);
        buffer.H(buffer.l() + ((long) iPosition));
        return iPosition;
    }
}
