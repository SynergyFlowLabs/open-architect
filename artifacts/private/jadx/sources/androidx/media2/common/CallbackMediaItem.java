package androidx.media2.common;

import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.util.t;

/* JADX INFO: loaded from: classes2.dex */
public class CallbackMediaItem extends MediaItem {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final c f52975y;

    public static final class a extends MediaItem.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f52976d;

        public a(@NonNull c cVar) {
            t.l(cVar);
            this.f52976d = cVar;
        }

        @Override // androidx.media2.common.MediaItem.b
        @NonNull
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public CallbackMediaItem a() {
            return new CallbackMediaItem(this);
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
    }

    CallbackMediaItem(a aVar) {
        super(aVar);
        this.f52975y = aVar.f52976d;
    }

    @NonNull
    public c q() {
        return this.f52975y;
    }
}
