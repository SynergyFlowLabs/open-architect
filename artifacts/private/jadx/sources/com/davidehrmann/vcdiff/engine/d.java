package com.davidehrmann.vcdiff.engine;

import java.io.IOException;
import java.util.EnumSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class d implements com.davidehrmann.vcdiff.a<Appendable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private StringBuilder f97827a = new StringBuilder(1024);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f97828b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f97829c = false;

    private static void a(byte b10, StringBuilder sb2) {
        if (b10 == 12) {
            sb2.append("\\f");
            return;
        }
        if (b10 == 13) {
            sb2.append("\\r");
            return;
        }
        if (b10 == 34) {
            sb2.append("\\\"");
            return;
        }
        if (b10 == 92) {
            sb2.append("\\\\");
            return;
        }
        switch (b10) {
            case 8:
                sb2.append("\\b");
                break;
            case 9:
                sb2.append("\\t");
                break;
            case 10:
                sb2.append("\\n");
                break;
            default:
                if (b10 >= 32 && b10 < 127) {
                    sb2.append((char) b10);
                }
                sb2.append(String.format("\\u%04x", Integer.valueOf(b10 & 65535)));
                break;
        }
    }

    @Override // com.davidehrmann.vcdiff.a
    public void P0(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || (i12 = i11 + i10) > bArr.length) {
            throw new IllegalArgumentException();
        }
        if (this.f97829c) {
            this.f97827a.append(AbstractJsonLexerKt.COMMA);
        }
        this.f97827a.append('\"');
        while (i10 < i12) {
            a(bArr[i10], this.f97827a);
            i10++;
        }
        this.f97827a.append('\"');
        this.f97829c = true;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void R0(int i10, int i11) {
        if (this.f97829c) {
            this.f97827a.append(AbstractJsonLexerKt.COMMA);
        }
        this.f97827a.append(i10);
        this.f97827a.append(AbstractJsonLexerKt.COMMA);
        this.f97827a.append(i11);
        this.f97829c = true;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void S0(int i10) {
        throw new UnsupportedOperationException("Checksum not supported");
    }

    @Override // com.davidehrmann.vcdiff.a
    public void T0(int i10, byte b10) {
        if (this.f97829c) {
            this.f97827a.append(AbstractJsonLexerKt.COMMA);
        }
        this.f97827a.append('\"');
        StringBuilder sb2 = new StringBuilder(8);
        a(b10, sb2);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f97827a.append((CharSequence) sb2);
        }
        this.f97827a.append('\"');
        this.f97829c = true;
    }

    @Override // com.davidehrmann.vcdiff.a
    public void W0(int i10) {
        this.f97827a.append(AbstractJsonLexerKt.BEGIN_LIST);
        this.f97829c = false;
    }

    @Override // com.davidehrmann.vcdiff.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void Q0(Appendable appendable) throws IOException {
        if (this.f97828b) {
            appendable.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    @Override // com.davidehrmann.vcdiff.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void V0(Appendable appendable) throws IOException {
        this.f97828b = true;
        appendable.append(this.f97827a);
        this.f97827a = new StringBuilder(1024);
    }

    @Override // com.davidehrmann.vcdiff.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void U0(Appendable appendable, EnumSet<com.davidehrmann.vcdiff.f> enumSet) throws IOException {
        if (!enumSet.isEmpty() && !EnumSet.of(com.davidehrmann.vcdiff.f.GOOGLE_JSON).equals(enumSet)) {
            throw new IOException("VCDiffFormatExtensions " + enumSet + " no compatible with JSONCodeTableWritar");
        }
    }
}
