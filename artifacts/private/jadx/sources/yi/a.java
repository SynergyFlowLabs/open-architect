package yi;

import io.ktor.utils.io.b1;
import io.ktor.utils.io.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.io.b;
import kotlinx.io.c0;
import kotlinx.io.f0;
import kotlinx.io.g;
import kotlinx.io.l;
import kotlinx.io.t;
import kotlinx.io.unsafe.d;
import kotlinx.io.v;
import kotlinx.io.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Streams.kt\nio/ktor/utils/io/streams/StreamsKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,57:1\n195#2,28:58\n*S KotlinDebug\n*F\n+ 1 Streams.kt\nio/ktor/utils/io/streams/StreamsKt\n*L\n33#1:58,28\n*E\n"})
public final class a {
    @NotNull
    public static final p a(@NotNull OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return b1.a(l.a(outputStream));
    }

    @NotNull
    public static final c0 b(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return g.b(l.b(inputStream));
    }

    @NotNull
    public static final InputStream c(@NotNull c0 c0Var) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        return f0.e(c0Var);
    }

    @NotNull
    public static final c0 d(@NotNull InputStream inputStream, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        b bVar = new b();
        d dVar = d.f315799a;
        t tVarR = bVar.R(i10);
        byte[] bArrB = tVarR.b(false);
        int iD = tVarR.d();
        int i11 = inputStream.read(bArrB, iD, bArrB.length - iD);
        int i12 = i11 >= 0 ? i11 : 0;
        if (i12 == i10) {
            tVarR.I(bArrB, i12);
            tVarR.x(tVarR.d() + i12);
            bVar.H(bVar.l() + ((long) i12));
            return bVar;
        }
        if (i12 < 0 || i12 > tVarR.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + i12 + ". Should be in 0.." + tVarR.l()).toString());
        }
        if (i12 == 0) {
            if (v.d(tVarR)) {
                bVar.y();
            }
            return bVar;
        }
        tVarR.I(bArrB, i12);
        tVarR.x(tVarR.d() + i12);
        bVar.H(bVar.l() + ((long) i12));
        return bVar;
    }

    public static /* synthetic */ c0 e(InputStream inputStream, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        return d(inputStream, i10);
    }

    public static final void f(@NotNull OutputStream outputStream, @NotNull Function1<? super x, Unit> block) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        g(outputStream, bVar);
    }

    public static final void g(@NotNull OutputStream outputStream, @NotNull c0 packet) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(packet, "packet");
        packet.T8(l.a(outputStream));
    }
}
