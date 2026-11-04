package com.superwall.supercel;

import com.sun.jna.Pointer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface FfiConverter<KotlinType, FfiType> {

    public static final class DefaultImpls {
        /* JADX INFO: Thrown type has an unknown type hierarchy: E */
        public static <KotlinType, FfiType> KotlinType liftFromRustBuffer(@NotNull FfiConverter<KotlinType, FfiType> ffiConverter, @NotNull RustBuffer.ByValue rbuf) throws E, InternalException {
            Intrinsics.checkNotNullParameter(rbuf, "rbuf");
            ByteBuffer byteBufferAsByteBuffer = rbuf.asByteBuffer();
            Intrinsics.checkNotNull(byteBufferAsByteBuffer);
            try {
                KotlinType kotlintype = ffiConverter.read(byteBufferAsByteBuffer);
                if (byteBufferAsByteBuffer.hasRemaining()) {
                    throw new RuntimeException("junk remaining in buffer after lifting, something is very wrong!!");
                }
                RustBuffer.Companion.free$supercel_release(rbuf);
                return kotlintype;
            } catch (Throwable th2) {
                RustBuffer.Companion.free$supercel_release(rbuf);
                throw th2;
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: E */
        @NotNull
        public static <KotlinType, FfiType> RustBuffer.ByValue lowerIntoRustBuffer(@NotNull FfiConverter<KotlinType, FfiType> ffiConverter, KotlinType kotlintype) throws E, InternalException {
            RustBuffer.ByValue byValueM89allocVKZWuLQ$supercel_release = RustBuffer.Companion.m89allocVKZWuLQ$supercel_release(ffiConverter.mo84allocationSizeI7RO_PI(kotlintype));
            try {
                Pointer pointer = byValueM89allocVKZWuLQ$supercel_release.data;
                Intrinsics.checkNotNull(pointer);
                ByteBuffer byteBuffer = pointer.getByteBuffer(0L, byValueM89allocVKZWuLQ$supercel_release.capacity);
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                Intrinsics.checkNotNull(byteBuffer);
                ffiConverter.write(kotlintype, byteBuffer);
                byValueM89allocVKZWuLQ$supercel_release.writeField("len", Long.valueOf(byteBuffer.position()));
                return byValueM89allocVKZWuLQ$supercel_release;
            } catch (Throwable th2) {
                RustBuffer.Companion.free$supercel_release(byValueM89allocVKZWuLQ$supercel_release);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: not valid java name */
    long mo84allocationSizeI7RO_PI(KotlinType kotlintype);

    KotlinType lift(FfiType ffitype);

    KotlinType liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue);

    FfiType lower(KotlinType kotlintype);

    @NotNull
    RustBuffer.ByValue lowerIntoRustBuffer(KotlinType kotlintype);

    KotlinType read(@NotNull ByteBuffer byteBuffer);

    void write(KotlinType kotlintype, @NotNull ByteBuffer byteBuffer);
}
