package kotlinx.io;

import androidx.collection.g3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nBuffers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffers.kt\nkotlinx/io/BuffersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ByteStringBuilder.kt\nkotlinx/io/bytestring/ByteStringBuilderKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 5 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsKt\n+ 6 Buffer.kt\nkotlinx/io/BufferKt\n*L\n1#1,80:1\n1#2:81\n127#3:82\n378#4,3:83\n381#4,3:88\n434#5,2:86\n659#6,25:91\n*S KotlinDebug\n*F\n+ 1 Buffers.kt\nkotlinx/io/BuffersKt\n*L\n24#1:82\n25#1:83,3\n25#1:88,3\n26#1:86,2\n52#1:91,25\n*E\n"})
public final class e {
    public static final long a(@NotNull b bVar, byte b10, long j10, long j11) {
        long jN;
        long j12;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        long jMin = Math.min(j11, bVar.j());
        k0.e(bVar.j(), j10, jMin);
        if (j10 == jMin || bVar.g() == null) {
            return -1L;
        }
        if (bVar.j() - j10 < j10) {
            t tVarO = bVar.o();
            jN = bVar.j();
            while (tVarO != null && jN > j10) {
                jN -= (long) (tVarO.d() - tVarO.h());
                if (jN <= j10) {
                    break;
                }
                tVarO = tVarO.j();
            }
            if (jN == -1) {
                return -1L;
            }
            while (jMin > jN) {
                Intrinsics.checkNotNull(tVarO);
                int iA = v.a(tVarO, b10, Math.max((int) (j10 - jN), 0), Math.min(tVarO.n(), (int) (jMin - jN)));
                if (iA != -1) {
                    j12 = iA;
                } else {
                    jN += (long) tVarO.n();
                    tVarO = tVarO.f();
                    if (tVarO == null || jN >= jMin) {
                        return -1L;
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }
        t tVarG = bVar.g();
        jN = 0;
        while (tVarG != null) {
            long jD = ((long) (tVarG.d() - tVarG.h())) + jN;
            if (jD > j10) {
                break;
            }
            tVarG = tVarG.f();
            jN = jD;
        }
        if (jN == -1) {
            return -1L;
        }
        while (jMin > jN) {
            Intrinsics.checkNotNull(tVarG);
            int iA2 = v.a(tVarG, b10, Math.max((int) (j10 - jN), 0), Math.min(tVarG.n(), (int) (jMin - jN)));
            if (iA2 != -1) {
                j12 = iA2;
            } else {
                jN += (long) tVarG.n();
                tVarG = tVarG.f();
                if (tVarG == null || jN >= jMin) {
                    return -1L;
                }
            }
        }
        throw new IllegalStateException("Check failed.");
        return jN + j12;
    }

    public static /* synthetic */ long b(b bVar, byte b10, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = bVar.j();
        }
        return a(bVar, b10, j12, j11);
    }

    @NotNull
    public static final kotlinx.io.bytestring.c c(@NotNull b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar.j() == 0) {
            return kotlinx.io.bytestring.g.a();
        }
        if (bVar.j() > g3.f12256c) {
            throw new IllegalStateException(("Buffer is too long (" + bVar.j() + ") to be converted into a byte string.").toString());
        }
        kotlinx.io.bytestring.d dVar = new kotlinx.io.bytestring.d((int) bVar.j());
        kotlinx.io.unsafe.d dVar2 = kotlinx.io.unsafe.d.f315799a;
        for (t tVarG = bVar.g(); tVarG != null; tVarG = tVarG.f()) {
            kotlinx.io.unsafe.b unused = kotlinx.io.unsafe.f.f315800a;
            dVar.b(tVarG.b(true), tVarG.h(), tVarG.d());
        }
        return dVar.g();
    }
}
