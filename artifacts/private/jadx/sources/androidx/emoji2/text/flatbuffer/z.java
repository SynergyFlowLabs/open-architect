package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public class z extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<a> f51218b = ThreadLocal.withInitial(new Supplier() { // from class: androidx.emoji2.text.flatbuffer.y
        @Override // java.util.function.Supplier
        public final Object get() {
            return z.f();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final CharsetEncoder f51219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final CharsetDecoder f51220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f51221c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ByteBuffer f51222d = null;

        a() {
            Charset charset = StandardCharsets.UTF_8;
            this.f51219a = charset.newEncoder();
            this.f51220b = charset.newDecoder();
        }
    }

    public static /* synthetic */ a f() {
        return new a();
    }

    @Override // androidx.emoji2.text.flatbuffer.x
    public String a(ByteBuffer byteBuffer, int i10, int i11) {
        CharsetDecoder charsetDecoder = f51218b.get().f51220b;
        charsetDecoder.reset();
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position(i10);
        byteBufferDuplicate.limit(i10 + i11);
        try {
            return charsetDecoder.decode(byteBufferDuplicate).toString();
        } catch (CharacterCodingException e10) {
            throw new IllegalArgumentException("Bad encoding", e10);
        }
    }

    @Override // androidx.emoji2.text.flatbuffer.x
    public void b(CharSequence charSequence, ByteBuffer byteBuffer) {
        a aVar = f51218b.get();
        if (aVar.f51221c != charSequence) {
            c(charSequence);
        }
        byteBuffer.put(aVar.f51222d);
    }

    @Override // androidx.emoji2.text.flatbuffer.x
    public int c(CharSequence charSequence) {
        a aVar = f51218b.get();
        int length = (int) (charSequence.length() * aVar.f51219a.maxBytesPerChar());
        ByteBuffer byteBuffer = aVar.f51222d;
        if (byteBuffer == null || byteBuffer.capacity() < length) {
            aVar.f51222d = ByteBuffer.allocate(Math.max(128, length));
        }
        aVar.f51222d.clear();
        aVar.f51221c = charSequence;
        CoderResult coderResultEncode = aVar.f51219a.encode(charSequence instanceof CharBuffer ? (CharBuffer) charSequence : CharBuffer.wrap(charSequence), aVar.f51222d, true);
        if (coderResultEncode.isError()) {
            try {
                coderResultEncode.throwException();
            } catch (CharacterCodingException e10) {
                throw new IllegalArgumentException("bad character encoding", e10);
            }
        }
        aVar.f51222d.flip();
        return aVar.f51222d.remaining();
    }
}
