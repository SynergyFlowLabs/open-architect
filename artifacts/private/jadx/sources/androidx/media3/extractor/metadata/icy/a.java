package androidx.media3.extractor.metadata.icy;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a extends androidx.media3.extractor.metadata.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f67503c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f67504d = "streamtitle";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f67505e = "streamurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f67506a = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharsetDecoder f67507b = StandardCharsets.ISO_8859_1.newDecoder();

    @p0
    private String c(ByteBuffer byteBuffer) {
        try {
            String string = this.f67506a.decode(byteBuffer).toString();
            this.f67506a.reset();
            byteBuffer.rewind();
            return string;
        } catch (CharacterCodingException unused) {
            this.f67506a.reset();
            byteBuffer.rewind();
            try {
                String string2 = this.f67507b.decode(byteBuffer).toString();
                this.f67507b.reset();
                byteBuffer.rewind();
                return string2;
            } catch (CharacterCodingException unused2) {
                this.f67507b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f67507b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } catch (Throwable th3) {
            this.f67506a.reset();
            byteBuffer.rewind();
            throw th3;
        }
    }

    @Override // androidx.media3.extractor.metadata.c
    protected r0 b(androidx.media3.extractor.metadata.b bVar, ByteBuffer byteBuffer) {
        String strC = c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        int i10 = 4 ^ 1;
        String str = null;
        if (strC == null) {
            return new r0(new c(bArr, null, null));
        }
        Matcher matcher = f67503c.matcher(strC);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            int i11 = 4 << 2;
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strG = com.google.common.base.c.g(strGroup);
                strG.getClass();
                if (strG.equals(f67505e)) {
                    str2 = strGroup2;
                } else if (strG.equals(f67504d)) {
                    str = strGroup2;
                }
            }
        }
        return new r0(new c(bArr, str, str2));
    }
}
