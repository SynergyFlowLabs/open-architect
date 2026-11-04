package androidx.media2.common;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import androidx.versionedparcelable.ParcelImpl;
import androidx.versionedparcelable.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadata extends CustomVersionedParcelable {
    public static final String A = "android.media.metadata.COMPOSER";
    public static final String B = "android.media.metadata.COMPILATION";
    public static final String C = "android.media.metadata.DATE";
    public static final String D = "android.media.metadata.YEAR";
    public static final String E = "android.media.metadata.GENRE";
    public static final String F = "android.media.metadata.TRACK_NUMBER";
    public static final String G = "android.media.metadata.NUM_TRACKS";
    public static final String H = "android.media.metadata.DISC_NUMBER";
    public static final String I = "android.media.metadata.ALBUM_ARTIST";
    public static final String J = "android.media.metadata.ART";
    public static final String K = "android.media.metadata.ART_URI";
    public static final String L = "android.media.metadata.ALBUM_ART";
    public static final String M = "android.media.metadata.ALBUM_ART_URI";
    public static final String N = "android.media.metadata.USER_RATING";
    public static final String O = "android.media.metadata.RATING";
    public static final String P = "android.media.metadata.DISPLAY_TITLE";
    public static final String Q = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String R = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String S = "android.media.metadata.DISPLAY_ICON";
    public static final String T = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String U = "android.media.metadata.MEDIA_ID";
    public static final String V = "android.media.metadata.MEDIA_URI";

    @b1({b1.a.LIBRARY})
    public static final String W = "androidx.media2.metadata.RADIO_FREQUENCY";

    @b1({b1.a.LIBRARY})
    public static final String X = "androidx.media2.metadata.RADIO_PROGRAM_NAME";
    public static final String Y = "androidx.media2.metadata.BROWSABLE";
    public static final long Z = -1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final long f52996a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final long f52997b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final long f52998c0 = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final long f52999d0 = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final long f53000e0 = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final long f53001f0 = 5;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final long f53002g0 = 6;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f53003h0 = "androidx.media2.metadata.PLAYABLE";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f53004i0 = "androidx.media2.metadata.ADVERTISEMENT";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f53005j0 = "androidx.media2.metadata.DOWNLOAD_STATUS";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final long f53006k0 = 0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final long f53007l0 = 1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final long f53008m0 = 2;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f53009n0 = "androidx.media2.metadata.EXTRAS";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final int f53010o0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    static final int f53011p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    static final int f53012q0 = 2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    static final int f53013r0 = 3;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    static final int f53014s0 = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f53015t = "MediaMetadata";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    static final int f53016t0 = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f53017u = "android.media.metadata.TITLE";

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    static final androidx.collection.a<String, Integer> f53018u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f53019v = "android.media.metadata.ARTIST";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f53020w = "android.media.metadata.DURATION";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f53021x = "android.media.metadata.ALBUM";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f53022y = "android.media.metadata.AUTHOR";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f53023z = "android.media.metadata.WRITER";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Bundle f53024q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    Bundle f53025r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    ParcelImplListSlice f53026s;

    static final class BitmapEntry implements h {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f53027s = 262144;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f53028q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Bitmap f53029r;

        BitmapEntry() {
        }

        private int f(Bitmap bitmap) {
            return androidx.core.graphics.a.b(bitmap);
        }

        Bitmap d() {
            return this.f53029r;
        }

        String g() {
            return this.f53028q;
        }

        BitmapEntry(@NonNull String str, @NonNull Bitmap bitmap) {
            this.f53028q = str;
            this.f53029r = bitmap;
            int iF = f(bitmap);
            if (iF > 262144) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                double dSqrt = Math.sqrt(262144.0d / ((double) iF));
                this.f53029r = Bitmap.createScaledBitmap(bitmap, (int) (((double) width) * dSqrt), (int) (((double) height) * dSqrt), true);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface d {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface g {
    }

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        f53018u0 = aVar;
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
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put(W, 4);
        aVar.put(X, 1);
        aVar.put(Y, 0);
        aVar.put(f53003h0, 0);
        aVar.put(f53004i0, 0);
        aVar.put(f53005j0, 0);
        aVar.put(f53009n0, 5);
    }

    MediaMetadata() {
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void d() {
        Bundle bundle = this.f53025r;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f53024q = bundle;
        ParcelImplListSlice parcelImplListSlice = this.f53026s;
        if (parcelImplListSlice != null) {
            Iterator<ParcelImpl> it = parcelImplListSlice.a().iterator();
            while (it.hasNext()) {
                BitmapEntry bitmapEntry = (BitmapEntry) MediaParcelUtils.a(it.next());
                this.f53024q.putParcelable(bitmapEntry.g(), bitmapEntry.d());
            }
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    @b1({b1.a.LIBRARY})
    public void f(boolean z10) {
        synchronized (this.f53024q) {
            try {
                if (this.f53025r == null) {
                    this.f53025r = new Bundle(this.f53024q);
                    ArrayList arrayList = new ArrayList();
                    for (String str : this.f53024q.keySet()) {
                        Object obj = this.f53024q.get(str);
                        if (obj instanceof Bitmap) {
                            arrayList.add(MediaParcelUtils.c(new BitmapEntry(str, (Bitmap) obj)));
                            this.f53025r.remove(str);
                        }
                    }
                    this.f53026s = new ParcelImplListSlice(arrayList);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @p0
    public Bundle getExtras() {
        try {
            return this.f53024q.getBundle(f53009n0);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean j(@NonNull String str) {
        if (str != null) {
            return this.f53024q.containsKey(str);
        }
        throw new NullPointerException("key shouldn't be null");
    }

    @p0
    public Bitmap k(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        try {
            return (Bitmap) this.f53024q.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public float l(@NonNull String str) {
        if (str != null) {
            return this.f53024q.getFloat(str);
        }
        throw new NullPointerException("key shouldn't be null");
    }

    public long m(@NonNull String str) {
        if (str != null) {
            return this.f53024q.getLong(str, 0L);
        }
        throw new NullPointerException("key shouldn't be null");
    }

    @p0
    public String n() {
        return q("android.media.metadata.MEDIA_ID");
    }

    @b1({b1.a.LIBRARY_GROUP})
    @p0
    public Object o(@NonNull String str) {
        if (str != null) {
            return this.f53024q.get(str);
        }
        throw new NullPointerException("key shouldn't be null");
    }

    @p0
    public Rating p(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        try {
            return (Rating) androidx.versionedparcelable.c.c(this.f53024q, str);
        } catch (Exception unused) {
            return null;
        }
    }

    @p0
    public String q(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("key shouldn't be null");
        }
        CharSequence charSequence = this.f53024q.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @p0
    public CharSequence r(@NonNull String str) {
        if (str != null) {
            return this.f53024q.getCharSequence(str);
        }
        throw new NullPointerException("key shouldn't be null");
    }

    @NonNull
    public Set<String> s() {
        return this.f53024q.keySet();
    }

    public int t() {
        return this.f53024q.size();
    }

    public String toString() {
        return this.f53024q.toString();
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f53030a;

        public b() {
            this.f53030a = new Bundle();
        }

        @NonNull
        public MediaMetadata a() {
            return new MediaMetadata(this.f53030a);
        }

        @NonNull
        public b b(@NonNull String str, @p0 Bitmap bitmap) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            androidx.collection.a<String, Integer> aVar = MediaMetadata.f53018u0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f53030a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        @NonNull
        public b c(@NonNull String str, float f10) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            androidx.collection.a<String, Integer> aVar = MediaMetadata.f53018u0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 4) {
                this.f53030a.putFloat(str, f10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a float");
        }

        @NonNull
        public b d(@NonNull String str, long j10) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            androidx.collection.a<String, Integer> aVar = MediaMetadata.f53018u0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f53030a.putLong(str, j10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        @NonNull
        public b e(@NonNull String str, @p0 Rating rating) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            androidx.collection.a<String, Integer> aVar = MediaMetadata.f53018u0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 3) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
            }
            androidx.versionedparcelable.c.e(this.f53030a, str, rating);
            return this;
        }

        @NonNull
        public b f(@NonNull String str, @p0 String str2) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            androidx.collection.a<String, Integer> aVar = MediaMetadata.f53018u0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f53030a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        @NonNull
        public b g(@NonNull String str, @p0 CharSequence charSequence) {
            if (str == null) {
                throw new NullPointerException("key shouldn't be null");
            }
            androidx.collection.a<String, Integer> aVar = MediaMetadata.f53018u0;
            if (aVar.containsKey(str) && aVar.get(str).intValue() != 1) {
                throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
            }
            this.f53030a.putCharSequence(str, charSequence);
            return this;
        }

        @NonNull
        public b h(@p0 Bundle bundle) {
            this.f53030a.putBundle(MediaMetadata.f53009n0, bundle);
            return this;
        }

        public b(@NonNull MediaMetadata mediaMetadata) {
            this.f53030a = new Bundle(mediaMetadata.f53024q);
        }

        b(Bundle bundle) {
            this.f53030a = new Bundle(bundle);
        }
    }

    MediaMetadata(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f53024q = bundle2;
        bundle2.setClassLoader(MediaMetadata.class.getClassLoader());
    }
}
