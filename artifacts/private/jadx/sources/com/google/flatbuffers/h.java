package com.google.flatbuffers;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes5.dex */
public class h extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<a> f125243b = new b(new Supplier() { // from class: com.google.flatbuffers.g
        @Override // java.util.function.Supplier
        public final Object get() {
            return new h.a();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharsetEncoder f125244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CharsetDecoder f125245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f125246c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ByteBuffer f125247d = null;

        a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f125244a = charset.newEncoder();
            this.f125245b = charset.newDecoder();
        }
    }

    private static final class b<T> extends ThreadLocal<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Supplier<? extends T> f125248a;

        b(Supplier<? extends T> supplier) {
            Objects.requireNonNull(supplier);
            this.f125248a = supplier;
        }

        @Override // java.lang.ThreadLocal
        protected T initialValue() {
            return this.f125248a.get();
        }
    }

    @Override // com.google.flatbuffers.f
    public String a(ByteBuffer byteBuffer, int i10, int i11) {
        CharsetDecoder charsetDecoder = f125243b.get().f125245b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        try {
            CharBuffer charBufferDecode = charsetDecoder.decode(byteBufferDuplicate);
            charBufferDecode.flip();
            return charBufferDecode.toString();
        } catch (CharacterCodingException e10) {
            throw new IllegalArgumentException("Bad encoding", e10);
        }
    }

    @Override // com.google.flatbuffers.f
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f125243b.get();
        if (aVar.f125246c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f125247d);
    }

    @Override // com.google.flatbuffers.f
    public int c(CharSequence charSequence) {
        a aVar = f125243b.get();
        int length = (int) (charSequence.length() * aVar.f125244a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f125247d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f125247d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f125247d.clear();
        aVar.f125246c = charSequence;
        CoderResult coderResultEncode = aVar.f125244a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f125247d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new IllegalArgumentException("bad character encoding", e10);
            }
        }
        return aVar.f125247d.remaining();
    }
}
