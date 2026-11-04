package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f67335c = "com.apple.iTunes";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f67336d = "iTunSMPB";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f67337e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67338a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67339b = -1;

    private boolean b(String str) {
        Matcher matcher = f67337e.matcher(str);
        if (matcher.find()) {
            try {
                int i10 = Integer.parseInt((String) k1.o(matcher.group(1)), 16);
                int i11 = Integer.parseInt((String) k1.o(matcher.group(2)), 16);
                if (i10 > 0 || i11 > 0) {
                    this.f67338a = i10;
                    this.f67339b = i11;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f67338a == -1 || this.f67339b == -1) ? false : true;
    }

    public boolean c(androidx.media3.common.r0 r0Var) {
        for (int i10 = 0; i10 < r0Var.e(); i10++) {
            androidx.media3.common.r0.a aVarD = r0Var.d(i10);
            if (aVarD instanceof androidx.media3.extractor.metadata.id3.e) {
                androidx.media3.extractor.metadata.id3.e eVar = (androidx.media3.extractor.metadata.id3.e) aVarD;
                if (f67336d.equals(eVar.f67547c) && b(eVar.f67548d)) {
                    return true;
                }
            } else if (aVarD instanceof androidx.media3.extractor.metadata.id3.k) {
                androidx.media3.extractor.metadata.id3.k kVar = (androidx.media3.extractor.metadata.id3.k) aVarD;
                if (f67335c.equals(kVar.f67577b) && f67336d.equals(kVar.f67578c) && b(kVar.f67579d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
