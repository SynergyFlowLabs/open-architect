package androidx.media2.exoplayer.external.text.cea;

import androidx.annotation.b1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56678a;

    private d(List<byte[]> initializationData) {
        this.f56678a = initializationData.get(0)[0] != 0;
    }

    public static List<byte[]> a(boolean z10) {
        return Collections.singletonList(new byte[]{z10 ? (byte) 1 : (byte) 0});
    }

    public static d b(List<byte[]> initializationData) {
        return new d(initializationData);
    }
}
