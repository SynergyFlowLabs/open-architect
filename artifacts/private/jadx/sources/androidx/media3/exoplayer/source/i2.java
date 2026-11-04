package androidx.media3.exoplayer.source;

import android.net.Uri;
import com.google.common.collect.l6;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public class i2 extends androidx.media3.common.v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f65084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l6<androidx.media3.extractor.t0> f65085d;

    @z7.m(imports = {"com.google.common.collect.ImmutableList"}, replacement = "this(message, uri, ImmutableList.of())")
    @Deprecated
    public i2(String str, Uri uri) {
        this(str, uri, l6.F());
    }

    public i2(String str, Uri uri, List<? extends androidx.media3.extractor.t0> list) {
        super(str, null, false, 1);
        this.f65084c = uri;
        this.f65085d = l6.w(list);
    }
}
