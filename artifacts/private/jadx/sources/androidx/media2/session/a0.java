package androidx.media2.session;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.MediaParcelUtils;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.Rating;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;
import androidx.versionedparcelable.ParcelImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f58738a = "MediaUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58739b = 262144;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.media.e.C0493e f58740c = new androidx.media.e.C0493e(MediaLibraryService.f58610c, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f58741d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f58742e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f58743f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f58744g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map<String, String> f58745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map<String, String> f58746i;

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    static {
        HashMap map = new HashMap();
        f58745h = map;
        f58746i = new HashMap();
        map.put("android.media.metadata.ADVERTISEMENT", MediaMetadata.f53004i0);
        map.put(MediaMetadataCompat.f9443m3, MediaMetadata.Y);
        map.put(MediaMetadataCompat.f9447o3, MediaMetadata.f53005j0);
        for (Map.Entry entry : map.entrySet()) {
            Map<String, String> map2 = f58746i;
            if (map2.containsKey(entry.getValue())) {
                throw new RuntimeException("Shouldn't map to the same value");
            }
            map2.put((String) entry.getValue(), (String) entry.getKey());
        }
    }

    private a0() {
    }

    public static int A(@p0 AudioAttributesCompat audioAttributesCompat) {
        int iA5;
        if (audioAttributesCompat == null || (iA5 = audioAttributesCompat.a5()) == Integer.MIN_VALUE) {
            return 3;
        }
        return iA5;
    }

    private static int B(Rating rating) {
        if (rating instanceof HeartRating) {
            return 1;
        }
        if (rating instanceof ThumbRating) {
            return 2;
        }
        if (!(rating instanceof StarRating)) {
            return rating instanceof PercentageRating ? 6 : 0;
        }
        int iD = ((StarRating) rating).d();
        int i10 = 3;
        if (iD != 3) {
            i10 = 4;
            if (iD != 4) {
                i10 = 5;
                if (iD != 5) {
                    return 0;
                }
            }
        }
        return i10;
    }

    public static boolean C(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        bundle.setClassLoader(a0.class.getClassLoader());
        try {
            bundle.size();
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void D(List<Bundle> list) {
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (C(list.get(size))) {
                list.remove(size);
            }
        }
    }

    @p0
    public static <T> List<T> E(@p0 List<T> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : list) {
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static int F(int i10) {
        if (i10 != 3) {
            return i10 != 6 ? 0 : 2;
        }
        return 3;
    }

    public static MediaController.PlaybackInfo G(MediaControllerCompat.e eVar) {
        return MediaController.PlaybackInfo.d(eVar.e(), new AudioAttributesCompat.d().d(eVar.a().a5()).a(), eVar.f(), eVar.d(), eVar.c());
    }

    public static <T extends Parcelable> List<T> H(List<T> list, int i10) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i11 = 0; i11 < list.size(); i11++) {
            try {
                T t10 = list.get(i11);
                parcelObtain.writeParcelable(t10, 0);
                if (parcelObtain.dataSize() >= i10) {
                    break;
                }
                arrayList.add(t10);
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }

    @p0
    public static MediaItem I(@p0 MediaItem mediaItem) {
        if (mediaItem != null && mediaItem.getClass() != MediaItem.class) {
            mediaItem = new MediaItem.b().d(mediaItem.n()).b(mediaItem.k()).c(mediaItem.m()).a();
        }
        return mediaItem;
    }

    @p0
    public static SessionPlayer.TrackInfo J(@p0 SessionPlayer.TrackInfo trackInfo) {
        return (trackInfo == null || trackInfo.getClass() == SessionPlayer.TrackInfo.class) ? trackInfo : new SessionPlayer.TrackInfo(trackInfo.k(), trackInfo.m(), trackInfo.j(), trackInfo.n());
    }

    @p0
    public static VideoSize K(@p0 VideoSize videoSize) {
        return (videoSize == null || videoSize.getClass() == VideoSize.class) ? videoSize : new VideoSize(videoSize.f(), videoSize.d());
    }

    @p0
    public static List<SessionPlayer.TrackInfo> L(@p0 List<SessionPlayer.TrackInfo> list) {
        if (list == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(J(list.get(i10)));
        }
        return arrayList;
    }

    public static List<ParcelImpl> a(List<MediaSession.CommandButton> list) {
        if (list == null) {
            int i10 = 2 >> 0;
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 3 | 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            arrayList.add(MediaParcelUtils.c(list.get(i12)));
        }
        return arrayList;
    }

    public static List<MediaItem> b(List<MediaBrowserCompat.MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(i(list.get(i10)));
        }
        return arrayList;
    }

    public static ParcelImplListSlice c(List<MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 5 >> 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            MediaItem mediaItem = list.get(i11);
            if (mediaItem != null) {
                arrayList.add(MediaParcelUtils.c(mediaItem));
            }
        }
        return new ParcelImplListSlice(arrayList);
    }

    public static List<MediaItem> d(ParcelImplListSlice parcelImplListSlice) {
        if (parcelImplListSlice == null) {
            return null;
        }
        List<ParcelImpl> listA = parcelImplListSlice.a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listA.size(); i10++) {
            ParcelImpl parcelImpl = listA.get(i10);
            if (parcelImpl != null) {
                arrayList.add((MediaItem) MediaParcelUtils.a(parcelImpl));
            }
        }
        return arrayList;
    }

    public static List<MediaItem> e(List<MediaSessionCompat.QueueItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            MediaItem mediaItemL = l(list.get(i10));
            if (mediaItemL != null) {
                arrayList.add(mediaItemL);
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<MediaSession.CommandButton> f(@p0 PlaybackStateCompat playbackStateCompat) {
        ArrayList arrayList = new ArrayList();
        if (playbackStateCompat != null) {
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.g()) {
                arrayList.add(new MediaSession.CommandButton.a().b(new SessionCommand(customAction.b(), customAction.e())).c(customAction.g()).d(true).f(customAction.f()).a());
            }
        }
        return arrayList;
    }

    @p0
    public static MediaLibraryService.LibraryParams g(@NonNull Context context, @p0 Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            bundle.setClassLoader(context.getClassLoader());
            return new MediaLibraryService.LibraryParams.a().b(bundle).d(bundle.getBoolean(androidx.media.e.C0493e.f52799c)).c(bundle.getBoolean(androidx.media.e.C0493e.f52800d)).e(bundle.getBoolean(androidx.media.e.C0493e.f52801e)).a();
        } catch (Exception unused) {
            return new MediaLibraryService.LibraryParams.a().b(bundle).a();
        }
    }

    @p0
    public static MediaBrowserCompat.MediaItem h(@p0 MediaItem mediaItem) {
        MediaDescriptionCompat mediaDescriptionCompatA;
        if (mediaItem == null) {
            return null;
        }
        MediaMetadata mediaMetadataM = mediaItem.m();
        int i10 = 0;
        if (mediaMetadataM == null) {
            mediaDescriptionCompatA = new MediaDescriptionCompat.d().f(mediaItem.l()).a();
        } else {
            MediaDescriptionCompat.d dVarC = new MediaDescriptionCompat.d().f(mediaItem.l()).h(mediaMetadataM.r("android.media.metadata.DISPLAY_SUBTITLE")).b(mediaMetadataM.r("android.media.metadata.DISPLAY_DESCRIPTION")).d(mediaMetadataM.k("android.media.metadata.DISPLAY_ICON")).c(mediaMetadataM.getExtras());
            String strQ = mediaMetadataM.q("android.media.metadata.TITLE");
            if (strQ != null) {
                dVarC.i(strQ);
            } else {
                dVarC.i(mediaMetadataM.q("android.media.metadata.DISPLAY_TITLE"));
            }
            String strQ2 = mediaMetadataM.q("android.media.metadata.DISPLAY_ICON_URI");
            if (strQ2 != null) {
                dVarC.e(Uri.parse(strQ2));
            }
            String strQ3 = mediaMetadataM.q("android.media.metadata.MEDIA_URI");
            if (strQ3 != null) {
                dVarC.g(Uri.parse(strQ3));
            }
            mediaDescriptionCompatA = dVarC.a();
            boolean z10 = true;
            int i11 = (!mediaMetadataM.j(MediaMetadata.Y) || mediaMetadataM.m(MediaMetadata.Y) == -1) ? 0 : 1;
            if (mediaMetadataM.m(MediaMetadata.f53003h0) == 0) {
                z10 = false;
            }
            i10 = (z10 ? 2 : 0) | i11;
        }
        return new MediaBrowserCompat.MediaItem(mediaDescriptionCompatA, i10);
    }

    public static MediaItem i(MediaBrowserCompat.MediaItem mediaItem) {
        if (mediaItem == null) {
            return null;
        }
        return new MediaItem.b().c(n(mediaItem.c(), mediaItem.g(), mediaItem.h())).a();
    }

    @p0
    public static MediaItem j(@p0 MediaDescriptionCompat mediaDescriptionCompat) {
        MediaMetadata mediaMetadataN = n(mediaDescriptionCompat, false, true);
        if (mediaMetadataN == null) {
            return null;
        }
        return new MediaItem.b().c(mediaMetadataN).a();
    }

    @p0
    public static MediaItem k(@p0 MediaMetadataCompat mediaMetadataCompat, int i10) {
        if (mediaMetadataCompat == null) {
            return null;
        }
        MediaMetadata.b bVarE = new MediaMetadata.b().d(MediaMetadata.f53003h0, 1L).e("android.media.metadata.USER_RATING", u(RatingCompat.n(i10)));
        for (String str : mediaMetadataCompat.l()) {
            Object obj = mediaMetadataCompat.e().get(str);
            Map<String, String> map = f58745h;
            String str2 = map.containsKey(str) ? map.get(str) : str;
            if (obj instanceof CharSequence) {
                bVarE.g(str2, (CharSequence) obj);
            } else if (obj instanceof Bitmap) {
                bVarE.b(str2, (Bitmap) obj);
            } else if (obj instanceof Long) {
                bVarE.d(str2, ((Long) obj).longValue());
            } else if ((obj instanceof RatingCompat) || (obj instanceof android.media.Rating)) {
                try {
                    bVarE.e(str2, u(mediaMetadataCompat.i(str)));
                } catch (Exception unused) {
                }
            }
        }
        return new MediaItem.b().c(bVarE.a()).a();
    }

    public static MediaItem l(MediaSessionCompat.QueueItem queueItem) {
        if (queueItem == null) {
            return null;
        }
        return new MediaItem.b().c(n(queueItem.c(), false, true)).a();
    }

    @p0
    public static List<MediaBrowserCompat.MediaItem> m(@p0 List<MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(h(list.get(i10)));
        }
        return arrayList;
    }

    private static MediaMetadata n(MediaDescriptionCompat mediaDescriptionCompat, boolean z10, boolean z11) {
        if (mediaDescriptionCompat == null) {
            return null;
        }
        MediaMetadata.b bVar = new MediaMetadata.b();
        bVar.f("android.media.metadata.MEDIA_ID", mediaDescriptionCompat.h());
        CharSequence charSequenceK = mediaDescriptionCompat.k();
        if (charSequenceK != null) {
            bVar.g("android.media.metadata.DISPLAY_TITLE", charSequenceK);
        }
        if (mediaDescriptionCompat.b() != null) {
            bVar.g("android.media.metadata.DISPLAY_DESCRIPTION", mediaDescriptionCompat.b());
        }
        CharSequence charSequenceJ = mediaDescriptionCompat.j();
        if (charSequenceJ != null) {
            bVar.g("android.media.metadata.DISPLAY_SUBTITLE", charSequenceJ);
        }
        Bitmap bitmapE = mediaDescriptionCompat.e();
        if (bitmapE != null) {
            bVar.b("android.media.metadata.DISPLAY_ICON", bitmapE);
        }
        Uri uriF = mediaDescriptionCompat.f();
        if (uriF != null) {
            bVar.g("android.media.metadata.DISPLAY_ICON_URI", uriF.toString());
        }
        Bundle bundleC = mediaDescriptionCompat.c();
        if (bundleC != null) {
            bVar.h(bundleC);
        }
        Uri uriI = mediaDescriptionCompat.i();
        if (uriI != null) {
            bVar.g("android.media.metadata.MEDIA_URI", uriI.toString());
        }
        if (bundleC != null && bundleC.containsKey(MediaDescriptionCompat.f9399k)) {
            bVar.d(MediaMetadata.Y, bundleC.getLong(MediaDescriptionCompat.f9399k));
        } else if (z10) {
            bVar.d(MediaMetadata.Y, 0L);
        } else {
            bVar.d(MediaMetadata.Y, -1L);
        }
        bVar.d(MediaMetadata.f53003h0, z11 ? 1L : 0L);
        return bVar.a();
    }

    public static MediaMetadata o(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return new MediaMetadata.b().f("android.media.metadata.TITLE", charSequence.toString()).d(MediaMetadata.Y, 0L).d(MediaMetadata.f53003h0, 1L).a();
    }

    public static MediaMetadataCompat p(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            return null;
        }
        MediaMetadataCompat.b bVar = new MediaMetadataCompat.b();
        for (String str : mediaMetadata.s()) {
            Map<String, String> map = f58746i;
            String str2 = map.containsKey(str) ? map.get(str) : str;
            Object objO = mediaMetadata.o(str);
            if (objO instanceof CharSequence) {
                bVar.f(str2, (CharSequence) objO);
            } else if (objO instanceof Bitmap) {
                bVar.b(str2, (Bitmap) objO);
            } else if (objO instanceof Long) {
                bVar.c(str2, ((Long) objO).longValue());
            } else if ((objO instanceof Bundle) && !TextUtils.equals(str, MediaMetadata.f53009n0)) {
                try {
                    bVar.d(str2, v(mediaMetadata.p(str)));
                } catch (Exception unused) {
                }
            }
        }
        return bVar.a();
    }

    public static int q(int i10, int i11) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return 7;
        }
        return i11 != 2 ? 3 : 6;
    }

    public static int r(PlaybackStateCompat playbackStateCompat) {
        if (playbackStateCompat == null) {
            return 0;
        }
        switch (playbackStateCompat.o()) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 6:
                return 1;
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
                return 2;
            case 7:
            default:
                return 3;
        }
    }

    public static long s(int i10) {
        if (i10 == -1) {
            return -1L;
        }
        return i10;
    }

    public static List<MediaSessionCompat.QueueItem> t(List<MediaItem> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            MediaItem mediaItem = list.get(i10);
            arrayList.add(new MediaSessionCompat.QueueItem(mediaItem.m() == null ? new MediaDescriptionCompat.d().f(mediaItem.l()).a() : p(mediaItem.m()).f(), s(i10)));
        }
        return arrayList;
    }

    public static Rating u(RatingCompat ratingCompat) {
        if (ratingCompat == null) {
            return null;
        }
        switch (ratingCompat.e()) {
            case 1:
                return ratingCompat.h() ? new HeartRating(ratingCompat.g()) : new HeartRating();
            case 2:
                return ratingCompat.h() ? new ThumbRating(ratingCompat.i()) : new ThumbRating();
            case 3:
                return ratingCompat.h() ? new StarRating(3, ratingCompat.f()) : new StarRating(3);
            case 4:
                return ratingCompat.h() ? new StarRating(4, ratingCompat.f()) : new StarRating(4);
            case 5:
                return ratingCompat.h() ? new StarRating(5, ratingCompat.f()) : new StarRating(5);
            case 6:
                return ratingCompat.h() ? new PercentageRating(ratingCompat.b()) : new PercentageRating();
            default:
                return null;
        }
    }

    @e.a({"WrongConstant"})
    public static RatingCompat v(Rating rating) {
        if (rating == null) {
            return null;
        }
        int iB = B(rating);
        if (!rating.b()) {
            return RatingCompat.n(iB);
        }
        switch (iB) {
            case 1:
                return RatingCompat.j(((HeartRating) rating).d());
            case 2:
                return RatingCompat.m(((ThumbRating) rating).d());
            case 3:
            case 4:
            case 5:
                return RatingCompat.l(iB, ((StarRating) rating).f());
            case 6:
                return RatingCompat.k(((PercentageRating) rating).d());
            default:
                return null;
        }
    }

    @p0
    public static Bundle w(@p0 MediaLibraryService.LibraryParams libraryParams) {
        if (libraryParams == null) {
            return null;
        }
        Bundle bundle = libraryParams.getExtras() == null ? new Bundle() : new Bundle(libraryParams.getExtras());
        bundle.putBoolean(androidx.media.e.C0493e.f52799c, libraryParams.h());
        bundle.putBoolean(androidx.media.e.C0493e.f52800d, libraryParams.g());
        bundle.putBoolean(androidx.media.e.C0493e.f52801e, libraryParams.i());
        return bundle;
    }

    @NonNull
    public static SessionCommandGroup x(long j10, @p0 PlaybackStateCompat playbackStateCompat) {
        SessionCommandGroup.a aVar = new SessionCommandGroup.a();
        aVar.b(1);
        if ((j10 & 4) != 0) {
            aVar.d(1);
        }
        aVar.g(1);
        aVar.f(1);
        aVar.k(new SessionCommand(SessionCommand.D));
        aVar.k(new SessionCommand(SessionCommand.T));
        aVar.k(new SessionCommand(SessionCommand.U));
        aVar.k(new SessionCommand(SessionCommand.V));
        if (playbackStateCompat != null && playbackStateCompat.g() != null) {
            for (PlaybackStateCompat.CustomAction customAction : playbackStateCompat.g()) {
                aVar.h(new SessionCommand(customAction.b(), customAction.e()));
            }
        }
        return aVar.j();
    }

    public static MediaDescriptionCompat y(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new MediaDescriptionCompat.d().f(str).a();
    }

    static boolean z(@NonNull Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeBundle(bundle);
            parcelObtain.setDataPosition(0);
            Bundle bundle2 = parcelObtain.readBundle(null);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                bundle2.get(it.next());
            }
            parcelObtain.recycle();
            return false;
        } catch (BadParcelableException unused) {
            parcelObtain.recycle();
            return true;
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
