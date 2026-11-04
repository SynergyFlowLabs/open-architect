package com.superwall.supercel;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.y1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterString implements FfiConverter<String, RustBuffer.ByValue> {

    @NotNull
    public static final FfiConverterString INSTANCE = new FfiConverterString();

    private FfiConverterString() {
    }

    @NotNull
    public final ByteBuffer toUtf8(@NotNull String value) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(value, "value");
        CharsetEncoder charsetEncoderNewEncoder = Charsets.UTF_8.newEncoder();
        charsetEncoderNewEncoder.onMalformedInput(CodingErrorAction.REPORT);
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.encode(CharBuffer.wrap(value));
        Intrinsics.checkNotNullExpressionValue(byteBufferEncode, "run(...)");
        return byteBufferEncode;
    }

    @Override // com.superwall.supercel.FfiConverter
    /* JADX INFO: renamed from: allocationSize-I7RO_PI, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
    public long mo84allocationSizeI7RO_PI(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return y1.n(y1.n(y1.n(value.length()) * 3) + 4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public String lift(@NotNull RustBuffer.ByValue value) throws E, InternalException {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            byte[] bArr = new byte[(int) value.len];
            ByteBuffer byteBufferAsByteBuffer = value.asByteBuffer();
            Intrinsics.checkNotNull(byteBufferAsByteBuffer);
            byteBufferAsByteBuffer.get(bArr);
            String str = new String(bArr, Charsets.UTF_8);
            RustBuffer.Companion.free$supercel_release(value);
            return str;
        } catch (Throwable th2) {
            RustBuffer.Companion.free$supercel_release(value);
            throw th2;
        }
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public String liftFromRustBuffer(@NotNull RustBuffer.ByValue byValue) {
        return (String) FfiConverter.DefaultImpls.liftFromRustBuffer(this, byValue);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E */
    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public RustBuffer.ByValue lower(@NotNull String value) throws CharacterCodingException, E, InternalException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer utf8 = toUtf8(value);
        RustBuffer.ByValue byValueM89allocVKZWuLQ$supercel_release = RustBuffer.Companion.m89allocVKZWuLQ$supercel_release(y1.n(utf8.limit()));
        ByteBuffer byteBufferAsByteBuffer = byValueM89allocVKZWuLQ$supercel_release.asByteBuffer();
        Intrinsics.checkNotNull(byteBufferAsByteBuffer);
        byteBufferAsByteBuffer.put(utf8);
        return byValueM89allocVKZWuLQ$supercel_release;
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public RustBuffer.ByValue lowerIntoRustBuffer(@NotNull String str) {
        return FfiConverter.DefaultImpls.lowerIntoRustBuffer(this, str);
    }

    @Override // com.superwall.supercel.FfiConverter
    @NotNull
    public String read(@NotNull ByteBuffer buf) {
        Intrinsics.checkNotNullParameter(buf, "buf");
        byte[] bArr = new byte[buf.getInt()];
        buf.get(bArr);
        return new String(bArr, Charsets.UTF_8);
    }

    @Override // com.superwall.supercel.FfiConverter
    public void write(@NotNull String value, @NotNull ByteBuffer buf) throws CharacterCodingException {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(buf, "buf");
        ByteBuffer utf8 = toUtf8(value);
        buf.putInt(utf8.limit());
        buf.put(utf8);
    }
}
