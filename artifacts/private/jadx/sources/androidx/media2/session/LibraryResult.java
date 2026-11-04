package androidx.media2.session;

import android.os.SystemClock;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.common.MediaItem;
import androidx.media2.common.ParcelImplListSlice;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.common.util.concurrent.t1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class LibraryResult extends CustomVersionedParcelable implements c0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f58497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f58498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    MediaItem f58499s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    MediaItem f58500t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    MediaLibraryService.LibraryParams f58501u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    List<MediaItem> f58502v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    ParcelImplListSlice f58503w;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    LibraryResult() {
    }

    static t1<LibraryResult> j(int i10) {
        androidx.concurrent.futures.e eVarN = androidx.concurrent.futures.e.N();
        eVarN.E(new LibraryResult(i10));
        return eVarN;
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void d() {
        this.f58499s = this.f58500t;
        this.f58502v = a0.d(this.f58503w);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void f(boolean z10) {
        MediaItem mediaItem = this.f58499s;
        if (mediaItem != null) {
            synchronized (mediaItem) {
                try {
                    if (this.f58500t == null) {
                        this.f58500t = a0.I(this.f58499s);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        List<MediaItem> list = this.f58502v;
        if (list != null) {
            synchronized (list) {
                try {
                    if (this.f58503w == null) {
                        this.f58503w = a0.c(this.f58502v);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.media2.common.a
    @p0
    public MediaItem g() {
        return this.f58499s;
    }

    @Override // androidx.media2.common.a
    public long h() {
        return this.f58498r;
    }

    @Override // androidx.media2.common.a
    public int i() {
        return this.f58497q;
    }

    @p0
    public MediaLibraryService.LibraryParams k() {
        return this.f58501u;
    }

    @p0
    public List<MediaItem> l() {
        return this.f58502v;
    }

    public LibraryResult(int i10) {
        this(i10, null, null, null);
    }

    public LibraryResult(int i10, @p0 MediaItem mediaItem, @p0 MediaLibraryService.LibraryParams libraryParams) {
        this(i10, mediaItem, null, libraryParams);
    }

    public LibraryResult(int i10, @p0 List<MediaItem> list, @p0 MediaLibraryService.LibraryParams libraryParams) {
        this(i10, null, list, libraryParams);
    }

    private LibraryResult(int i10, @p0 MediaItem mediaItem, @p0 List<MediaItem> list, @p0 MediaLibraryService.LibraryParams libraryParams) {
        this.f58497q = i10;
        this.f58498r = SystemClock.elapsedRealtime();
        this.f58499s = mediaItem;
        this.f58502v = list;
        this.f58501u = libraryParams;
    }
}
