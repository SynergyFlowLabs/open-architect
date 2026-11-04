package io.ktor.util;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class i {
    public static final int c(@NotNull final ReadableByteChannel readableByteChannel, @NotNull kotlinx.io.b buffer) {
        Intrinsics.checkNotNullParameter(readableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (vi.c.b(buffer) == 0) {
            return 0;
        }
        final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        vi.b.b(buffer, 1, new Function1() { // from class: io.ktor.util.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.d(fVar, readableByteChannel, (ByteBuffer) obj);
            }
        });
        return fVar.f312749a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(kotlin.jvm.internal.i1.f fVar, ReadableByteChannel readableByteChannel, ByteBuffer bb2) {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        fVar.f312749a = readableByteChannel.read(bb2);
        return Unit.f312394a;
    }

    @io.ktor.utils.io.o0
    public static final int e(@NotNull final WritableByteChannel writableByteChannel, @NotNull kotlinx.io.b buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(writableByteChannel, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        vi.b.a(buffer, new Function1() { // from class: io.ktor.util.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.f(fVar, writableByteChannel, (ByteBuffer) obj);
            }
        });
        return fVar.f312749a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(kotlin.jvm.internal.i1.f fVar, WritableByteChannel writableByteChannel, ByteBuffer bb2) {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        fVar.f312749a = writableByteChannel.write(bb2);
        return Unit.f312394a;
    }
}
