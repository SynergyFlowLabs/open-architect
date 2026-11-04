package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.metadata.id3.CommentFrame;
import androidx.media2.exoplayer.external.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f54078c = "com.apple.iTunes";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f54079d = "iTunSMPB";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f54080e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f54081a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54082b = -1;

    private boolean b(String data) {
        Matcher matcher = f54080e.matcher(data);
        if (matcher.find()) {
            try {
                int i10 = Integer.parseInt(matcher.group(1), 16);
                int i11 = Integer.parseInt(matcher.group(2), 16);
                if (i10 > 0 || i11 > 0) {
                    this.f54081a = i10;
                    this.f54082b = i11;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    public boolean a() {
        return (this.f54081a == -1 || this.f54082b == -1) ? false : true;
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            Metadata.Entry entryC = metadata.c(i10);
            if (entryC instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryC;
                if (f54079d.equals(commentFrame.f55501c) && b(commentFrame.f55502d)) {
                    return true;
                }
            } else if (entryC instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryC;
                if (f54078c.equals(internalFrame.f55510b) && f54079d.equals(internalFrame.f55511c) && b(internalFrame.f55512d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int value) {
        int i10 = value >> 12;
        int i11 = value & 4095;
        if (i10 <= 0 && i11 <= 0) {
            return false;
        }
        this.f54081a = i10;
        this.f54082b = i11;
        return true;
    }
}
