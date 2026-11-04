package kotlin.uuid;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,226:1\n226#1:227\n226#1:228\n226#1:229\n226#1:230\n226#1:231\n226#1:232\n226#1:233\n226#1:234\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n88#1:227\n89#1:228\n133#1:229\n134#1:230\n173#1:231\n174#1:232\n220#1:233\n221#1:234\n*E\n"})
class f {
    @a
    @e1(version = "2.0")
    @NotNull
    public static final d a(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long jReverseBytes = byteBuffer.getLong();
        long jReverseBytes2 = byteBuffer.getLong();
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
            jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
        }
        return d.f313446c.b(jReverseBytes, jReverseBytes2);
    }

    @a
    @e1(version = "2.0")
    @NotNull
    public static final d b(@NotNull ByteBuffer byteBuffer, int i10) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Negative index: " + i10);
        }
        if (i10 + 15 < byteBuffer.limit()) {
            long jReverseBytes = byteBuffer.getLong(i10);
            long jReverseBytes2 = byteBuffer.getLong(i10 + 8);
            if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                jReverseBytes = Long.reverseBytes(jReverseBytes);
                jReverseBytes2 = Long.reverseBytes(jReverseBytes2);
            }
            return d.f313446c.b(jReverseBytes, jReverseBytes2);
        }
        throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i10 + ", with limit: " + byteBuffer.limit() + ' ');
    }

    @a
    @e1(version = "2.0")
    @NotNull
    public static final ByteBuffer c(@NotNull ByteBuffer byteBuffer, int i10, @NotNull d uuid) {
        ByteBuffer byteBufferPutLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long jG = uuid.g();
        long jE = uuid.e();
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Negative index: " + i10);
        }
        if (i10 + 15 < byteBuffer.limit()) {
            if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                byteBuffer.putLong(i10, jG);
                byteBufferPutLong = byteBuffer.putLong(i10 + 8, jE);
            } else {
                byteBuffer.putLong(i10, Long.reverseBytes(jG));
                byteBufferPutLong = byteBuffer.putLong(i10 + 8, Long.reverseBytes(jE));
            }
            Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
            return byteBufferPutLong;
        }
        throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i10 + ", with limit: " + byteBuffer.limit() + ' ');
    }

    @a
    @e1(version = "2.0")
    @NotNull
    public static final ByteBuffer d(@NotNull ByteBuffer byteBuffer, @NotNull d uuid) {
        ByteBuffer byteBufferPutLong;
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        long jG = uuid.g();
        long jE = uuid.e();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (Intrinsics.areEqual(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(jG);
            byteBufferPutLong = byteBuffer.putLong(jE);
        } else {
            byteBuffer.putLong(Long.reverseBytes(jG));
            byteBufferPutLong = byteBuffer.putLong(Long.reverseBytes(jE));
        }
        Intrinsics.checkNotNullExpressionValue(byteBufferPutLong, "toLongs(...)");
        return byteBufferPutLong;
    }

    public static final long e(long j10) {
        return Long.reverseBytes(j10);
    }

    @a
    @NotNull
    public static final d f() {
        byte[] bArr = new byte[16];
        b.f313444a.a().nextBytes(bArr);
        return g.q(bArr);
    }

    @a
    @e1(version = "2.0")
    @NotNull
    public static final UUID g(@NotNull d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        return new UUID(dVar.g(), dVar.e());
    }

    @a
    @e1(version = "2.0")
    @NotNull
    public static final d h(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        return d.f313446c.b(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }
}
