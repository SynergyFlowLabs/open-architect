package kotlinx.io.unsafe;

import java.io.EOFException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.h0;
import kotlinx.io.k0;
import kotlinx.io.t;
import kotlinx.io.v;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nUnsafeBufferOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Buffer.kt\nkotlinx/io/BufferKt\n*L\n1#1,568:1\n38#2:569\n1#3:570\n659#4,25:571\n*S KotlinDebug\n*F\n+ 1 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n43#1:569\n352#1:571,25\n*E\n"})
@h0
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final d f315799a = new d();

    private d() {
    }

    public static /* synthetic */ void f(d dVar, kotlinx.io.b bVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = bArr.length;
        }
        dVar.e(bVar, bArr, i10, i11);
    }

    public final void a(@NotNull kotlinx.io.b buffer, @NotNull Function2<? super b, ? super t, Unit> action) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(action, "action");
        for (t tVarG = buffer.g(); tVarG != null; tVarG = tVarG.f()) {
            action.invoke(f.f315800a, tVarG);
        }
    }

    public final int b() {
        return 8192;
    }

    public final void c(@NotNull kotlinx.io.b buffer, long j10, @NotNull n<? super a, ? super t, ? super Long, Unit> iterationAction) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(iterationAction, "iterationAction");
        long j11 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(("Offset must be non-negative: " + j10).toString());
        }
        if (j10 >= buffer.j()) {
            throw new IndexOutOfBoundsException("Offset should be less than buffer's size (" + buffer.j() + "): " + j10);
        }
        if (buffer.g() == null) {
            iterationAction.invoke(f.f315802c, null, -1L);
            return;
        }
        if (buffer.j() - j10 >= j10) {
            t tVarG = buffer.g();
            while (tVarG != null) {
                long jD = ((long) (tVarG.d() - tVarG.h())) + j11;
                if (jD > j10) {
                    break;
                }
                tVarG = tVarG.f();
                j11 = jD;
            }
            iterationAction.invoke(f.f315802c, tVarG, Long.valueOf(j11));
            return;
        }
        t tVarO = buffer.o();
        long j12 = buffer.j();
        while (tVarO != null && j12 > j10) {
            j12 -= (long) (tVarO.d() - tVarO.h());
            if (j12 <= j10) {
                break;
            } else {
                tVarO = tVarO.j();
            }
        }
        iterationAction.invoke(f.f315802c, tVarO, Long.valueOf(j12));
    }

    public final void d(@NotNull kotlinx.io.b buffer, @NotNull Function2<? super a, ? super t, Unit> iterationAction) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(iterationAction, "iterationAction");
        iterationAction.invoke(f.f315802c, buffer.g());
    }

    public final void e(@NotNull kotlinx.io.b buffer, @NotNull byte[] bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        k0.e(bytes.length, i10, i11);
        t tVarB = t.f315789h.b(bytes, i10, i11, kotlinx.io.a.f315737a, false);
        t tVarO = buffer.o();
        if (tVarO == null) {
            buffer.E(tVarB);
            buffer.I(tVarB);
        } else {
            buffer.I(tVarO.q(tVarB));
        }
        buffer.H(buffer.l() + ((long) (i11 - i10)));
    }

    public final int g(@NotNull kotlinx.io.b buffer, @NotNull Function2<? super b, ? super t, Integer> readAction) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (buffer.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t tVarG = buffer.g();
        Intrinsics.checkNotNull(tVarG);
        int iIntValue = readAction.invoke(f.f315800a, tVarG).intValue();
        if (iIntValue == 0) {
            return iIntValue;
        }
        if (iIntValue < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (iIntValue > tVarG.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(iIntValue);
        return iIntValue;
    }

    public final int h(@NotNull kotlinx.io.b buffer, @NotNull n<? super byte[], ? super Integer, ? super Integer, Integer> readAction) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        if (buffer.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t tVarG = buffer.g();
        Intrinsics.checkNotNull(tVarG);
        int iIntValue = readAction.invoke(tVarG.b(true), Integer.valueOf(tVarG.h()), Integer.valueOf(tVarG.d())).intValue();
        if (iIntValue == 0) {
            return iIntValue;
        }
        if (iIntValue < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (iIntValue > tVarG.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(iIntValue);
        return iIntValue;
    }

    public final int i(@NotNull kotlinx.io.b buffer, int i10, @NotNull Function2<? super c, ? super t, Integer> writeAction) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        t tVarR = buffer.R(i10);
        int iIntValue = writeAction.invoke(f.f315801b, tVarR).intValue();
        if (iIntValue == i10) {
            tVarR.x(tVarR.d() + iIntValue);
            buffer.H(buffer.l() + ((long) iIntValue));
            return iIntValue;
        }
        if (iIntValue < 0 || iIntValue > tVarR.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + iIntValue + ". Should be in 0.." + tVarR.l()).toString());
        }
        if (iIntValue != 0) {
            tVarR.x(tVarR.d() + iIntValue);
            buffer.H(buffer.l() + ((long) iIntValue));
            return iIntValue;
        }
        if (v.d(tVarR)) {
            buffer.y();
        }
        return iIntValue;
    }

    public final int j(@NotNull kotlinx.io.b buffer, int i10, @NotNull n<? super byte[], ? super Integer, ? super Integer, Integer> writeAction) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(writeAction, "writeAction");
        t tVarR = buffer.R(i10);
        byte[] bArrB = tVarR.b(false);
        int iIntValue = writeAction.invoke(bArrB, Integer.valueOf(tVarR.d()), Integer.valueOf(bArrB.length)).intValue();
        if (iIntValue == i10) {
            tVarR.I(bArrB, iIntValue);
            tVarR.x(tVarR.d() + iIntValue);
            buffer.H(buffer.l() + ((long) iIntValue));
            return iIntValue;
        }
        if (iIntValue < 0 || iIntValue > tVarR.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + iIntValue + ". Should be in 0.." + tVarR.l()).toString());
        }
        if (iIntValue == 0) {
            if (v.d(tVarR)) {
                buffer.y();
            }
            return iIntValue;
        }
        tVarR.I(bArrB, iIntValue);
        tVarR.x(tVarR.d() + iIntValue);
        buffer.H(buffer.l() + ((long) iIntValue));
        return iIntValue;
    }
}
