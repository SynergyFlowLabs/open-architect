package androidx.media3.extractor.text;

import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l6<androidx.media3.common.text.a> f68444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68447d;

    public d(List<androidx.media3.common.text.a> list, long j10, long j11) {
        this.f68444a = l6.w(list);
        this.f68445b = j10;
        this.f68446c = j11;
        long j12 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L) {
            j12 = j10 + j11;
        }
        this.f68447d = j12;
    }
}
