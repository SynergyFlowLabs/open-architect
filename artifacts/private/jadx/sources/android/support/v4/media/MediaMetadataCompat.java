package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.b1;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String H1 = "android.media.metadata.RATING";
    public static final String X = "android.media.metadata.ART";
    public static final String Y = "android.media.metadata.ART_URI";
    public static final String Z = "android.media.metadata.ALBUM_ART";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f9427d = "MediaMetadata";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f9428e = "android.media.metadata.TITLE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f9429f = "android.media.metadata.ARTIST";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f9430g = "android.media.metadata.DURATION";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f9431g3 = "android.media.metadata.DISPLAY_SUBTITLE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f9432h = "android.media.metadata.ALBUM";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final String f9433h3 = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f9434i = "android.media.metadata.AUTHOR";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final String f9435i3 = "android.media.metadata.DISPLAY_ICON";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f9436j = "android.media.metadata.WRITER";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final String f9437j3 = "android.media.metadata.DISPLAY_ICON_URI";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f9438k = "android.media.metadata.COMPOSER";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final String f9439k3 = "android.media.metadata.MEDIA_ID";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f9440l = "android.media.metadata.COMPILATION";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final String f9441l3 = "android.media.metadata.MEDIA_URI";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f9442m = "android.media.metadata.DATE";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final String f9443m3 = "android.media.metadata.BT_FOLDER_TYPE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f9444n = "android.media.metadata.YEAR";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final String f9445n3 = "android.media.metadata.ADVERTISEMENT";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f9446o = "android.media.metadata.GENRE";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final String f9447o3 = "android.media.metadata.DOWNLOAD_STATUS";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f9448p0 = "android.media.metadata.ALBUM_ART_URI";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f9449p1 = "android.media.metadata.USER_RATING";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f9450p2 = "android.media.metadata.DISPLAY_TITLE";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    static final int f9451p3 = 0;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    static final int f9452q3 = 1;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    static final int f9453r3 = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f9454s = "android.media.metadata.TRACK_NUMBER";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    static final int f9455s3 = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f9456t = "android.media.metadata.NUM_TRACKS";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    static final androidx.collection.a<String, Integer> f9457t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final String[] f9458u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f9459v = "android.media.metadata.DISC_NUMBER";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final String[] f9460v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9461w = "android.media.metadata.ALBUM_ARTIST";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final String[] f9462w3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Bundle f9463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaMetadata f9464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaDescriptionCompat f9465c;

    class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel in) {
            return new MediaMetadataCompat(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int size) {
            return new MediaMetadataCompat[size];
        }
    }

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        f9457t3 = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put(f9443m3, 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put(f9447o3, 0);
        f9458u3 = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f9460v3 = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f9462w3 = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f9463a = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public static MediaMetadataCompat b(Object metadataObj) {
        if (metadataObj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) metadataObj;
        mediaMetadata.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f9464b = mediaMetadata;
        return mediaMetadataCompatCreateFromParcel;
    }

    public boolean a(String key) {
        return this.f9463a.containsKey(key);
    }

    public Bitmap c(String key) {
        try {
            return (Bitmap) this.f9463a.getParcelable(key);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle e() {
        return new Bundle(this.f9463a);
    }

    public MediaDescriptionCompat f() {
        Bitmap bitmapC;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f9465c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String strJ = j("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequenceK = k("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequenceK)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = f9458u3;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence charSequenceK2 = k(strArr[i11]);
                if (!TextUtils.isEmpty(charSequenceK2)) {
                    charSequenceArr[i10] = charSequenceK2;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = charSequenceK;
            charSequenceArr[1] = k("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = k("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = f9460v3;
            if (i13 >= strArr2.length) {
                bitmapC = null;
                break;
            }
            bitmapC = c(strArr2[i13]);
            if (bitmapC != null) {
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = f9462w3;
            if (i14 >= strArr3.length) {
                uri = null;
                break;
            }
            String strJ2 = j(strArr3[i14]);
            if (!TextUtils.isEmpty(strJ2)) {
                uri = Uri.parse(strJ2);
                break;
            }
            i14++;
        }
        String strJ3 = j("android.media.metadata.MEDIA_URI");
        Uri uri2 = TextUtils.isEmpty(strJ3) ? null : Uri.parse(strJ3);
        MediaDescriptionCompat.d dVar = new MediaDescriptionCompat.d();
        dVar.f(strJ);
        dVar.i(charSequenceArr[0]);
        dVar.h(charSequenceArr[1]);
        dVar.b(charSequenceArr[2]);
        dVar.d(bitmapC);
        dVar.e(uri);
        dVar.g(uri2);
        Bundle bundle = new Bundle();
        if (this.f9463a.containsKey(f9443m3)) {
            bundle.putLong(MediaDescriptionCompat.f9399k, g(f9443m3));
        }
        if (this.f9463a.containsKey(f9447o3)) {
            bundle.putLong(MediaDescriptionCompat.f9409w, g(f9447o3));
        }
        if (!bundle.isEmpty()) {
            dVar.c(bundle);
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        this.f9465c = mediaDescriptionCompatA;
        return mediaDescriptionCompatA;
    }

    public long g(String key) {
        return this.f9463a.getLong(key, 0L);
    }

    public Object h() {
        if (this.f9464b == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.f9464b = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f9464b;
    }

    public RatingCompat i(String key) {
        try {
            return RatingCompat.a(this.f9463a.getParcelable(key));
        } catch (Exception unused) {
            return null;
        }
    }

    public String j(String key) {
        CharSequence charSequence = this.f9463a.getCharSequence(key);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence k(String key) {
        return this.f9463a.getCharSequence(key);
    }

    public Set<String> l() {
        return this.f9463a.keySet();
    }

    public int m() {
        return this.f9463a.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeBundle(this.f9463a);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bundle f9466a;

        public b() {
            this.f9466a = new Bundle();
        }

        private Bitmap g(Bitmap bmp, int maxSize) {
            float f10 = maxSize;
            float fMin = Math.min(f10 / bmp.getWidth(), f10 / bmp.getHeight());
            return Bitmap.createScaledBitmap(bmp, (int) (bmp.getWidth() * fMin), (int) (bmp.getHeight() * fMin), true);
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f9466a);
        }

        public b b(String key, Bitmap value) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f9457t3;
            if (aVar.containsKey(key) && aVar.get(key).intValue() != 2) {
                throw new IllegalArgumentException("The " + key + " key cannot be used to put a Bitmap");
            }
            this.f9466a.putParcelable(key, value);
            return this;
        }

        public b c(String key, long value) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f9457t3;
            if (aVar.containsKey(key) && aVar.get(key).intValue() != 0) {
                throw new IllegalArgumentException("The " + key + " key cannot be used to put a long");
            }
            this.f9466a.putLong(key, value);
            return this;
        }

        public b d(String key, RatingCompat value) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f9457t3;
            if (!aVar.containsKey(key) || aVar.get(key).intValue() == 3) {
                this.f9466a.putParcelable(key, (Parcelable) value.c());
                return this;
            }
            throw new IllegalArgumentException("The " + key + " key cannot be used to put a Rating");
        }

        public b e(String key, String value) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f9457t3;
            if (!aVar.containsKey(key) || aVar.get(key).intValue() == 1) {
                this.f9466a.putCharSequence(key, value);
                return this;
            }
            throw new IllegalArgumentException("The " + key + " key cannot be used to put a String");
        }

        public b f(String key, CharSequence value) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.f9457t3;
            if (!aVar.containsKey(key) || aVar.get(key).intValue() == 1) {
                this.f9466a.putCharSequence(key, value);
                return this;
            }
            throw new IllegalArgumentException("The " + key + " key cannot be used to put a CharSequence");
        }

        public b(MediaMetadataCompat source) {
            Bundle bundle = new Bundle(source.f9463a);
            this.f9466a = bundle;
            MediaSessionCompat.b(bundle);
        }

        @b1({b1.a.LIBRARY})
        public b(MediaMetadataCompat source, int maxBitmapSize) {
            this(source);
            for (String str : this.f9466a.keySet()) {
                Object obj = this.f9466a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > maxBitmapSize || bitmap.getWidth() > maxBitmapSize) {
                        b(str, g(bitmap, maxBitmapSize));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel in) {
        this.f9463a = in.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
