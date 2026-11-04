package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final long X = 0;
    public static final long Y = 1;
    public static final long Z = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f9398j = "MediaDescriptionCompat";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f9399k = "android.media.extra.BT_FOLDER_TYPE";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f9400l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f9401m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f9402n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f9403o = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9404p0 = "android.support.v4.media.description.MEDIA_URI";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @b1({b1.a.LIBRARY})
    public static final String f9405p1 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f9406s = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f9407t = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f9408v = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f9409w = "android.media.extra.DOWNLOAD_STATUS";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f9410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f9411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f9412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f9413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f9414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f9415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f9416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f9417h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaDescription f9418i;

    class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel in) {
            return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(in));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int size) {
            return new MediaDescriptionCompat[size];
        }
    }

    @w0(21)
    private static class b {
        private b() {
        }

        @u
        static MediaDescription a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @u
        static MediaDescription.Builder b() {
            return new MediaDescription.Builder();
        }

        @u
        @p0
        static CharSequence c(MediaDescription description) {
            return description.getDescription();
        }

        @u
        @p0
        static Bundle d(MediaDescription description) {
            return description.getExtras();
        }

        @u
        @p0
        static Bitmap e(MediaDescription description) {
            return description.getIconBitmap();
        }

        @u
        @p0
        static Uri f(MediaDescription description) {
            return description.getIconUri();
        }

        @u
        @p0
        static String g(MediaDescription description) {
            return description.getMediaId();
        }

        @u
        @p0
        static CharSequence h(MediaDescription description) {
            return description.getSubtitle();
        }

        @u
        @p0
        static CharSequence i(MediaDescription description) {
            return description.getTitle();
        }

        @u
        static void j(MediaDescription.Builder builder, @p0 CharSequence description) {
            builder.setDescription(description);
        }

        @u
        static void k(MediaDescription.Builder builder, @p0 Bundle extras) {
            builder.setExtras(extras);
        }

        @u
        static void l(MediaDescription.Builder builder, @p0 Bitmap icon) {
            builder.setIconBitmap(icon);
        }

        @u
        static void m(MediaDescription.Builder builder, @p0 Uri iconUri) {
            builder.setIconUri(iconUri);
        }

        @u
        static void n(MediaDescription.Builder builder, @p0 String mediaId) {
            builder.setMediaId(mediaId);
        }

        @u
        static void o(MediaDescription.Builder builder, @p0 CharSequence subtitle) {
            builder.setSubtitle(subtitle);
        }

        @u
        static void p(MediaDescription.Builder builder, @p0 CharSequence title) {
            builder.setTitle(title);
        }
    }

    @w0(23)
    private static class c {
        private c() {
        }

        @u
        @p0
        static Uri a(MediaDescription description) {
            return description.getMediaUri();
        }

        @u
        static void b(MediaDescription.Builder builder, @p0 Uri mediaUri) {
            builder.setMediaUri(mediaUri);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f9419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f9420b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f9421c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f9422d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f9423e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f9424f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f9425g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f9426h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f9419a, this.f9420b, this.f9421c, this.f9422d, this.f9423e, this.f9424f, this.f9425g, this.f9426h);
        }

        public d b(@p0 CharSequence description) {
            this.f9422d = description;
            return this;
        }

        public d c(@p0 Bundle extras) {
            this.f9425g = extras;
            return this;
        }

        public d d(@p0 Bitmap icon) {
            this.f9423e = icon;
            return this;
        }

        public d e(@p0 Uri iconUri) {
            this.f9424f = iconUri;
            return this;
        }

        public d f(@p0 String mediaId) {
            this.f9419a = mediaId;
            return this;
        }

        public d g(@p0 Uri mediaUri) {
            this.f9426h = mediaUri;
            return this;
        }

        public d h(@p0 CharSequence subtitle) {
            this.f9421c = subtitle;
            return this;
        }

        public d i(@p0 CharSequence title) {
            this.f9420b = title;
            return this;
        }
    }

    MediaDescriptionCompat(String mediaId, CharSequence title, CharSequence subtitle, CharSequence description, Bitmap icon, Uri iconUri, Bundle extras, Uri mediaUri) {
        this.f9410a = mediaId;
        this.f9411b = title;
        this.f9412c = subtitle;
        this.f9413d = description;
        this.f9414e = icon;
        this.f9415f = iconUri;
        this.f9416g = extras;
        this.f9417h = mediaUri;
    }

    public static MediaDescriptionCompat a(Object descriptionObj) {
        Bundle bundle = null;
        if (descriptionObj == null) {
            return null;
        }
        d dVar = new d();
        MediaDescription mediaDescription = (MediaDescription) descriptionObj;
        dVar.f(b.g(mediaDescription));
        dVar.i(b.i(mediaDescription));
        dVar.h(b.h(mediaDescription));
        dVar.b(b.c(mediaDescription));
        dVar.d(b.e(mediaDescription));
        dVar.e(b.f(mediaDescription));
        Bundle bundleD = b.d(mediaDescription);
        if (bundleD != null) {
            bundleD = MediaSessionCompat.F(bundleD);
        }
        Uri uri = bundleD != null ? (Uri) bundleD.getParcelable(f9404p0) : null;
        if (uri == null) {
            bundle = bundleD;
        } else if (!bundleD.containsKey(f9405p1) || bundleD.size() != 2) {
            bundleD.remove(f9404p0);
            bundleD.remove(f9405p1);
            bundle = bundleD;
        }
        dVar.c(bundle);
        if (uri != null) {
            dVar.g(uri);
        } else {
            dVar.g(c.a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = dVar.a();
        mediaDescriptionCompatA.f9418i = mediaDescription;
        return mediaDescriptionCompatA;
    }

    @p0
    public CharSequence b() {
        return this.f9413d;
    }

    @p0
    public Bundle c() {
        return this.f9416g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @p0
    public Bitmap e() {
        return this.f9414e;
    }

    @p0
    public Uri f() {
        return this.f9415f;
    }

    public Object g() {
        MediaDescription mediaDescription = this.f9418i;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderB = b.b();
        b.n(builderB, this.f9410a);
        b.p(builderB, this.f9411b);
        b.o(builderB, this.f9412c);
        b.j(builderB, this.f9413d);
        b.l(builderB, this.f9414e);
        b.m(builderB, this.f9415f);
        b.k(builderB, this.f9416g);
        c.b(builderB, this.f9417h);
        MediaDescription mediaDescriptionA = b.a(builderB);
        this.f9418i = mediaDescriptionA;
        return mediaDescriptionA;
    }

    @p0
    public String h() {
        return this.f9410a;
    }

    @p0
    public Uri i() {
        return this.f9417h;
    }

    @p0
    public CharSequence j() {
        return this.f9412c;
    }

    @p0
    public CharSequence k() {
        return this.f9411b;
    }

    public String toString() {
        return ((Object) this.f9411b) + ", " + ((Object) this.f9412c) + ", " + ((Object) this.f9413d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        ((MediaDescription) g()).writeToParcel(dest, flags);
    }

    MediaDescriptionCompat(Parcel in) {
        this.f9410a = in.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f9411b = (CharSequence) creator.createFromParcel(in);
        this.f9412c = (CharSequence) creator.createFromParcel(in);
        this.f9413d = (CharSequence) creator.createFromParcel(in);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f9414e = (Bitmap) in.readParcelable(classLoader);
        this.f9415f = (Uri) in.readParcelable(classLoader);
        this.f9416g = in.readBundle(classLoader);
        this.f9417h = (Uri) in.readParcelable(classLoader);
    }
}
