package org.apache.commons.lang3.time;

import java.util.Date;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
class k extends TimeZone {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f337505c = 60000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f337506d = 60;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f337507e = 24;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long f337508f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f337509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f337510b;

    k(boolean z10, int i10, int i11) {
        if (i10 >= 24) {
            throw new IllegalArgumentException(i10 + " hours out of range");
        }
        if (i11 >= 60) {
            throw new IllegalArgumentException(i11 + " minutes out of range");
        }
        int i12 = ((i10 * 60) + i11) * 60000;
        this.f337509a = z10 ? -i12 : i12;
        StringBuilder sb2 = new StringBuilder(9);
        sb2.append(m.f337525a);
        sb2.append(z10 ? org.apache.commons.codec.language.l.f335457d : '+');
        StringBuilder sbA = a(sb2, i10);
        sbA.append(AbstractJsonLexerKt.COLON);
        this.f337510b = a(sbA, i11).toString();
    }

    private static StringBuilder a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
        return sb2;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof k) && this.f337510b == ((k) obj).f337510b) {
            return true;
        }
        return false;
    }

    @Override // java.util.TimeZone
    public String getID() {
        return this.f337510b;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i10, int i11, int i12, int i13, int i14, int i15) {
        return this.f337509a;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.f337509a;
    }

    public int hashCode() {
        return this.f337509a;
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i10) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "[GmtTimeZone id=\"" + this.f337510b + "\",offset=" + this.f337509a + AbstractJsonLexerKt.END_LIST;
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return false;
    }
}
