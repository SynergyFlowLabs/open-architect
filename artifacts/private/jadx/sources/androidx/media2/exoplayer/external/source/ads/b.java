package androidx.media2.exoplayer.external.source.ads;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.o0;
import androidx.media2.exoplayer.external.upstream.o;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public interface b {

    public interface a {
        View[] a();

        ViewGroup getAdViewGroup();
    }

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.source.ads.b$b, reason: collision with other inner class name */
    public interface InterfaceC0516b {
        void a();

        void b();

        void c(f.a error, o dataSpec);

        void d(androidx.media2.exoplayer.external.source.ads.a adPlaybackState);
    }

    void a(int... contentTypes);

    void b(int adGroupIndex, int adIndexInAdGroup, IOException exception);

    void c(@p0 o0 player);

    void d(InterfaceC0516b eventListener, a adViewProvider);

    void release();

    void stop();
}
