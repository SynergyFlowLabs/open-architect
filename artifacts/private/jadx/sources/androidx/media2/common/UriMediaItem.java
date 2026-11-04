package androidx.media2.common;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.t;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class UriMediaItem extends MediaItem {
    private final List<HttpCookie> A;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Uri f53076y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Map<String, String> f53077z;

    public static final class a extends MediaItem.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f53078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<String, String> f53079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        List<HttpCookie> f53080f;

        public a(@NonNull Uri uri) {
            this(uri, null, null);
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public UriMediaItem a() {
            return new UriMediaItem(this);
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(long j10) {
            return (a) super.b(j10);
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(@p0 MediaMetadata mediaMetadata) {
            return (a) super.c(mediaMetadata);
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d(long j10) {
            return (a) super.d(j10);
        }

        public a(@NonNull Uri uri, @p0 Map<String, String> map, @p0 List<HttpCookie> list) {
            CookieHandler cookieHandler;
            t.m(uri, "uri cannot be null");
            this.f53078d = uri;
            if (list != null && (cookieHandler = CookieHandler.getDefault()) != null && !(cookieHandler instanceof CookieManager)) {
                throw new IllegalArgumentException("The cookie handler has to be of CookieManager type when cookies are provided");
            }
            this.f53078d = uri;
            if (map != null) {
                this.f53079e = new HashMap(map);
            }
            if (list != null) {
                this.f53080f = new ArrayList(list);
            }
        }
    }

    UriMediaItem(a aVar) {
        super(aVar);
        this.f53076y = aVar.f53078d;
        this.f53077z = aVar.f53079e;
        this.A = aVar.f53080f;
    }

    @NonNull
    public Uri q() {
        return this.f53076y;
    }

    @p0
    public List<HttpCookie> r() {
        if (this.A == null) {
            return null;
        }
        return new ArrayList(this.A);
    }

    @p0
    public Map<String, String> s() {
        if (this.f53077z != null) {
            return new HashMap(this.f53077z);
        }
        int i10 = 3 << 0;
        return null;
    }
}
