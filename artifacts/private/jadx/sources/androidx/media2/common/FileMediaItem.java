package androidx.media2.common;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.core.util.t;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class FileMediaItem extends MediaItem {
    private static final String E = "FileMediaItem";
    public static final long F = 576460752303423487L;
    private final long A;
    private final Object B;

    @b0("mLock")
    private int C;

    @b0("mLock")
    private boolean D;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ParcelFileDescriptor f52977y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final long f52978z;

    public static final class a extends MediaItem.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ParcelFileDescriptor f52979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f52980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f52981f;

        public a(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
            this.f52980e = 0L;
            this.f52981f = 576460752303423487L;
            t.l(parcelFileDescriptor);
            this.f52979d = parcelFileDescriptor;
            this.f52980e = 0L;
            this.f52981f = 576460752303423487L;
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public FileMediaItem a() {
            return new FileMediaItem(this);
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(long j10) {
            return (a) super.b(j10);
        }

        @NonNull
        public a g(long j10) {
            if (j10 < 0) {
                j10 = 576460752303423487L;
            }
            this.f52981f = j10;
            return this;
        }

        @NonNull
        public a h(long j10) {
            if (j10 < 0) {
                j10 = 0;
            }
            this.f52980e = j10;
            return this;
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a c(@p0 MediaMetadata mediaMetadata) {
            return (a) super.c(mediaMetadata);
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public a d(long j10) {
            return (a) super.d(j10);
        }
    }

    FileMediaItem(a aVar) {
        super(aVar);
        this.B = new Object();
        this.f52977y = aVar.f52979d;
        this.f52978z = aVar.f52980e;
        this.A = aVar.f52981f;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void q() throws IOException {
        synchronized (this.B) {
            try {
                ParcelFileDescriptor parcelFileDescriptor = this.f52977y;
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                this.D = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void r() {
        synchronized (this.B) {
            try {
                if (this.D) {
                    return;
                }
                int i10 = this.C - 1;
                this.C = i10;
                if (i10 <= 0) {
                    try {
                        try {
                            ParcelFileDescriptor parcelFileDescriptor = this.f52977y;
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                        } catch (IOException unused) {
                            Objects.toString(this.f52977y);
                        }
                        this.D = true;
                    } catch (Throwable th2) {
                        this.D = true;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public long s() {
        return this.A;
    }

    public long t() {
        return this.f52978z;
    }

    @NonNull
    public ParcelFileDescriptor u() {
        return this.f52977y;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void v() {
        synchronized (this.B) {
            try {
                if (this.D) {
                    return;
                }
                this.C++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean w() {
        boolean z10;
        synchronized (this.B) {
            try {
                z10 = this.D;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
