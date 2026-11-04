package androidx.media2.exoplayer.external.drm;

import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53821a;

    public b(int errorCode, String message) {
        super(message);
        this.f53821a = errorCode;
    }
}
