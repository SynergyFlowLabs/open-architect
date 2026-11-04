package zi;

import io.ktor.utils.io.pool.h;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.g0;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;
import ui.i;
import ui.j;
import ui.l;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nDeflaterUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeflaterUtils.kt\nio/ktor/websocket/internals/DeflaterUtilsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,86:1\n21#2,2:87\n23#2:94\n21#2,3:95\n21#2,2:98\n23#2:105\n182#3,5:89\n182#3,5:100\n*S KotlinDebug\n*F\n+ 1 DeflaterUtils.kt\nio/ktor/websocket/internals/DeflaterUtilsKt\n*L\n20#1:87,2\n20#1:94\n36#1:95,3\n46#1:98,2\n46#1:105\n21#1:89,5\n47#1:100,5\n*E\n"})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f413514a = {0, 0, 0, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final byte[] f413515b = {0, 0, -1, -1};

    @NotNull
    public static final byte[] a(@NotNull Deflater deflater, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(deflater, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        deflater.setInput(data);
        kotlinx.io.b bVar = new kotlinx.io.b();
        h<ByteBuffer> hVarA = io.ktor.util.cio.a.a();
        ByteBuffer byteBufferJc = hVarA.Jc();
        try {
            ByteBuffer byteBuffer = byteBufferJc;
            while (!deflater.needsInput()) {
                b(bVar, deflater, byteBuffer, false);
            }
            while (b(bVar, deflater, byteBuffer, true) != 0) {
            }
            Unit unit = Unit.f312394a;
            hVarA.h8(byteBufferJc);
            if (a.a(bVar, f413514a)) {
                byte[] bArrD = g0.d(bVar, ((int) l.j(bVar)) - f413515b.length);
                bVar.close();
                return bArrD;
            }
            kotlinx.io.b bVar2 = new kotlinx.io.b();
            j.j(bVar2, bVar);
            bVar2.m6((byte) 0);
            return g0.c(bVar2);
        } catch (Throwable th2) {
            hVarA.h8(byteBufferJc);
            throw th2;
        }
    }

    private static final int b(x xVar, Deflater deflater, ByteBuffer byteBuffer, boolean z10) {
        byteBuffer.clear();
        int iDeflate = z10 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        i.a(xVar, byteBuffer);
        return iDeflate;
    }

    @NotNull
    public static final byte[] c(@NotNull Inflater inflater, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(inflater, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrPlus = ArraysKt.plus(data, f413515b);
        inflater.setInput(bArrPlus);
        kotlinx.io.b bVar = new kotlinx.io.b();
        h<ByteBuffer> hVarA = io.ktor.util.cio.a.a();
        ByteBuffer byteBufferJc = hVarA.Jc();
        try {
            ByteBuffer byteBuffer = byteBufferJc;
            long length = ((long) bArrPlus.length) + inflater.getBytesRead();
            while (inflater.getBytesRead() < length) {
                byteBuffer.clear();
                byteBuffer.position(byteBuffer.position() + inflater.inflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit()));
                byteBuffer.flip();
                i.a(bVar, byteBuffer);
            }
            Unit unit = Unit.f312394a;
            return g0.c(bVar);
        } finally {
            hVarA.h8(byteBufferJc);
        }
    }
}
