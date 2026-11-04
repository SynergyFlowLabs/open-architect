package androidx.media2.common;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.util.p;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class MediaItem extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f52982v = "MediaItem";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final long f52983w = 576460752303423487L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f52984x = 576460752303423487L;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Object f52985q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @b0("mLock")
    MediaMetadata f52986r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    long f52987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f52988t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @b0("mLock")
    private final List<p<c, Executor>> f52989u;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f52990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MediaMetadata f52991b;

        a(c cVar, MediaMetadata mediaMetadata) {
            this.f52990a = cVar;
            this.f52991b = mediaMetadata;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f52990a.a(MediaItem.this, this.f52991b);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        MediaMetadata f52993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f52994b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f52995c = 576460752303423487L;

        @NonNull
        public MediaItem a() {
            return new MediaItem(this);
        }

        @NonNull
        public b b(long j10) {
            if (j10 < 0) {
                j10 = 576460752303423487L;
            }
            this.f52995c = j10;
            return this;
        }

        @NonNull
        public b c(@p0 MediaMetadata mediaMetadata) {
            this.f52993a = mediaMetadata;
            return this;
        }

        @NonNull
        public b d(long j10) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.f52994b = j10;
            return this;
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public interface c {
        void a(@NonNull MediaItem mediaItem, @p0 MediaMetadata mediaMetadata);
    }

    MediaItem() {
        this.f52985q = new Object();
        this.f52987s = 0L;
        this.f52988t = 576460752303423487L;
        this.f52989u = new ArrayList();
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void f(boolean z10) {
        if (getClass() != MediaItem.class) {
            throw new RuntimeException("MediaItem's subclasses shouldn't be parcelized.");
        }
        super.f(z10);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void j(Executor executor, c cVar) {
        synchronized (this.f52985q) {
            try {
                Iterator<p<c, Executor>> it = this.f52989u.iterator();
                while (it.hasNext()) {
                    if (it.next().f48411a == cVar) {
                        return;
                    }
                }
                this.f52989u.add(new p<>(cVar, executor));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long k() {
        return this.f52988t;
    }

    @b1({b1.a.LIBRARY_GROUP})
    @p0
    public String l() {
        String strQ;
        synchronized (this.f52985q) {
            try {
                MediaMetadata mediaMetadata = this.f52986r;
                strQ = mediaMetadata != null ? mediaMetadata.q("android.media.metadata.MEDIA_ID") : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return strQ;
    }

    @p0
    public MediaMetadata m() {
        MediaMetadata mediaMetadata;
        synchronized (this.f52985q) {
            mediaMetadata = this.f52986r;
        }
        return mediaMetadata;
    }

    public long n() {
        return this.f52987s;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void o(c cVar) {
        synchronized (this.f52985q) {
            try {
                for (int size = this.f52989u.size() - 1; size >= 0; size--) {
                    if (this.f52989u.get(size).f48411a == cVar) {
                        this.f52989u.remove(size);
                        return;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p(@p0 MediaMetadata mediaMetadata) {
        ArrayList<p> arrayList = new ArrayList();
        synchronized (this.f52985q) {
            try {
                MediaMetadata mediaMetadata2 = this.f52986r;
                if (mediaMetadata2 == mediaMetadata) {
                    return;
                }
                if (mediaMetadata2 == null || mediaMetadata == null || TextUtils.equals(l(), mediaMetadata.n())) {
                    this.f52986r = mediaMetadata;
                    arrayList.addAll(this.f52989u);
                    for (p pVar : arrayList) {
                        ((Executor) pVar.f48412b).execute(new a((c) pVar.f48411a, mediaMetadata));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(getClass().getSimpleName());
        synchronized (this.f52985q) {
            try {
                sb2.append("{Media Id=");
                sb2.append(l());
                sb2.append(", mMetadata=");
                sb2.append(this.f52986r);
                sb2.append(", mStartPositionMs=");
                sb2.append(this.f52987s);
                sb2.append(", mEndPositionMs=");
                sb2.append(this.f52988t);
                sb2.append(AbstractJsonLexerKt.END_OBJ);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sb2.toString();
    }

    MediaItem(b bVar) {
        this(bVar.f52993a, bVar.f52994b, bVar.f52995c);
    }

    MediaItem(MediaItem mediaItem) {
        this(mediaItem.f52986r, mediaItem.f52987s, mediaItem.f52988t);
    }

    MediaItem(@p0 MediaMetadata mediaMetadata, long j10, long j11) {
        this.f52985q = new Object();
        this.f52987s = 0L;
        this.f52988t = 576460752303423487L;
        this.f52989u = new ArrayList();
        if (j10 <= j11) {
            if (mediaMetadata != null && mediaMetadata.j("android.media.metadata.DURATION")) {
                long jM = mediaMetadata.m("android.media.metadata.DURATION");
                if (jM != Long.MIN_VALUE && j11 != 576460752303423487L && j11 > jM) {
                    throw new IllegalStateException("endPositionMs shouldn't be greater than duration in the metdata, endPositionMs=" + j11 + ", durationMs=" + jM);
                }
            }
            this.f52986r = mediaMetadata;
            this.f52987s = j10;
            this.f52988t = j11;
            return;
        }
        throw new IllegalStateException("Illegal start/end position: " + j10 + " : " + j11);
    }
}
