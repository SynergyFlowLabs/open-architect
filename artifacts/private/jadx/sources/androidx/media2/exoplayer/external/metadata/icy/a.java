package androidx.media2.exoplayer.external.metadata.icy;

import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.b;
import androidx.media2.exoplayer.external.metadata.d;
import androidx.media2.exoplayer.external.util.p;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f55476a = "IcyDecoder";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f55477b = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f55478c = "streamtitle";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f55479d = "streamurl";

    @Override // androidx.media2.exoplayer.external.metadata.b
    @p0
    public Metadata a(d inputBuffer) {
        ByteBuffer byteBuffer = (ByteBuffer) androidx.media2.exoplayer.external.util.a.g(inputBuffer.f53789c);
        return b(q0.D(byteBuffer.array(), 0, byteBuffer.limit()));
    }

    @l1
    @p0
    Metadata b(String metadata) {
        Matcher matcher = f55477b.matcher(metadata);
        String str = null;
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strV0 = q0.V0(matcher.group(1));
            String strGroup = matcher.group(2);
            strV0.getClass();
            if (strV0.equals(f55479d)) {
                str2 = strGroup;
            } else if (strV0.equals(f55478c)) {
                str = strGroup;
            } else {
                String strValueOf = String.valueOf(str);
                p.l(f55476a, strValueOf.length() != 0 ? "Unrecognized ICY tag: ".concat(strValueOf) : new String("Unrecognized ICY tag: "));
            }
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new Metadata(new IcyInfo(str, str2));
    }
}
