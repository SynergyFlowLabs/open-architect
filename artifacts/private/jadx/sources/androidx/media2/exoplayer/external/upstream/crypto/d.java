package androidx.media2.exoplayer.external.upstream.crypto;

import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
final class d {
    private d() {
    }

    public static long a(@p0 String input) {
        long j10 = 0;
        if (input == null) {
            return 0L;
        }
        for (int i10 = 0; i10 < input.length(); i10++) {
            long jCharAt = j10 ^ ((long) input.charAt(i10));
            j10 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j10;
    }
}
