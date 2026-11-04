package com.superwall.supercel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface FfiConverterRustBuffer<KotlinType> extends FfiConverter<KotlinType, RustBuffer.ByValue> {

    public static final class DefaultImpls {
        public static <KotlinType> KotlinType lift(@NotNull FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, @NotNull RustBuffer.ByValue value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return ffiConverterRustBuffer.liftFromRustBuffer(value);
        }

        public static <KotlinType> KotlinType liftFromRustBuffer(@NotNull FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, @NotNull RustBuffer.ByValue rbuf) {
            Intrinsics.checkNotNullParameter(rbuf, "rbuf");
            return (KotlinType) FfiConverter.DefaultImpls.liftFromRustBuffer(ffiConverterRustBuffer, rbuf);
        }

        @NotNull
        public static <KotlinType> RustBuffer.ByValue lower(@NotNull FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, KotlinType kotlintype) {
            return ffiConverterRustBuffer.lowerIntoRustBuffer(kotlintype);
        }

        @NotNull
        public static <KotlinType> RustBuffer.ByValue lowerIntoRustBuffer(@NotNull FfiConverterRustBuffer<KotlinType> ffiConverterRustBuffer, KotlinType kotlintype) {
            return FfiConverter.DefaultImpls.lowerIntoRustBuffer(ffiConverterRustBuffer, kotlintype);
        }
    }

    KotlinType lift(@NotNull RustBuffer.ByValue byValue);

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    RustBuffer.ByValue lower(KotlinType kotlintype);
}
