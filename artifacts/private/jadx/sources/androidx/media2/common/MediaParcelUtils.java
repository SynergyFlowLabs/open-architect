package androidx.media2.common;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.h;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public class MediaParcelUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53031a = "MediaParcelUtils";

    @e.a({"RestrictedApi"})
    private static class MediaItemParcelImpl extends ParcelImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaItem f53032b;

        MediaItemParcelImpl(MediaItem mediaItem) {
            super(new MediaItem(mediaItem));
            this.f53032b = mediaItem;
        }

        @Override // androidx.versionedparcelable.ParcelImpl
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaItem a() {
            return this.f53032b;
        }
    }

    private MediaParcelUtils() {
    }

    @p0
    public static <T extends h> T a(@NonNull ParcelImpl parcelImpl) {
        return (T) androidx.versionedparcelable.c.b(parcelImpl);
    }

    @NonNull
    public static <T extends h> List<T> b(@NonNull List<ParcelImpl> list) {
        ArrayList arrayList = new ArrayList();
        int i10 = 6 ^ 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(a(list.get(i11)));
        }
        return arrayList;
    }

    @NonNull
    public static ParcelImpl c(@p0 h hVar) {
        return hVar instanceof MediaItem ? new MediaItemParcelImpl((MediaItem) hVar) : (ParcelImpl) androidx.versionedparcelable.c.h(hVar);
    }

    @NonNull
    public static List<ParcelImpl> d(@NonNull List<? extends h> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(c(list.get(i10)));
        }
        return arrayList;
    }
}
