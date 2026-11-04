package androidx.media3.exoplayer.image;

import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.w;

/* JADX INFO: loaded from: classes3.dex */
@b1
public interface d extends androidx.media3.decoder.e<androidx.media3.decoder.g, f, e> {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f63879a = new androidx.media3.exoplayer.image.a.c();

        d a();

        int b(w wVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.decoder.e
    @p0
    f a() throws e;

    @Override // androidx.media3.decoder.e
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    void b(androidx.media3.decoder.g gVar) throws e;
}
