package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@e.a({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final int A3 = 11;
    public static final long B3 = -1;
    public static final int C3 = -1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final int D3 = 0;
    public static final int E3 = 1;
    public static final int F3 = 2;
    public static final int G3 = 3;
    public static final long H1 = 4096;
    public static final int H3 = -1;
    public static final int I3 = 0;
    public static final int J3 = 1;
    public static final int K3 = 2;
    public static final int L3 = 0;
    public static final int M3 = 1;
    public static final int N3 = 2;
    public static final int O3 = 3;
    public static final int P3 = 4;
    public static final int Q3 = 5;
    public static final int R3 = 6;
    public static final int S3 = 7;
    public static final int T3 = 8;
    public static final int U3 = 9;
    public static final int V3 = 10;
    public static final int W3 = 11;
    public static final long X = 128;
    private static final int X3 = 127;
    public static final long Y = 256;
    private static final int Y3 = 126;
    public static final long Z = 512;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final long f9651g3 = 16384;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final long f9652h3 = 32768;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final long f9653i3 = 65536;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final long f9654j3 = 131072;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final long f9655k3 = 262144;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Deprecated
    public static final long f9656l3 = 524288;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f9657m = 1;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final long f9658m3 = 1048576;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final long f9659n = 2;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final long f9660n3 = 2097152;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f9661o = 4;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final long f9662o3 = 4194304;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f9663p0 = 1024;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final long f9664p1 = 2048;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final long f9665p2 = 8192;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f9666p3 = 0;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f9667q3 = 1;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final int f9668r3 = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final long f9669s = 8;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final int f9670s3 = 3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f9671t = 16;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f9672t3 = 4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final int f9673u3 = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f9674v = 32;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f9675v3 = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f9676w = 64;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f9677w3 = 7;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f9678x3 = 8;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f9679y3 = 9;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f9680z3 = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f9681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f9682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f9683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f9684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f9685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f9686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f9687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f9688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    List<CustomAction> f9689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final long f9690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Bundle f9691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PlaybackState f9692l;

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel in) {
            return new PlaybackStateCompat(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int size) {
            return new PlaybackStateCompat[size];
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface b {
    }

    @w0(21)
    private static class c {
        private c() {
        }

        @u
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        @u
        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        @u
        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        @u
        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        @u
        static PlaybackState.CustomAction.Builder e(String action, CharSequence name, int icon) {
            return new PlaybackState.CustomAction.Builder(action, name, icon);
        }

        @u
        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        @u
        static long g(PlaybackState state) {
            return state.getActions();
        }

        @u
        static long h(PlaybackState state) {
            return state.getActiveQueueItemId();
        }

        @u
        static long i(PlaybackState state) {
            return state.getBufferedPosition();
        }

        @u
        static List<PlaybackState.CustomAction> j(PlaybackState state) {
            return state.getCustomActions();
        }

        @u
        static CharSequence k(PlaybackState state) {
            return state.getErrorMessage();
        }

        @u
        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        @u
        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        @u
        static long n(PlaybackState state) {
            return state.getLastPositionUpdateTime();
        }

        @u
        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        @u
        static float p(PlaybackState state) {
            return state.getPlaybackSpeed();
        }

        @u
        static long q(PlaybackState state) {
            return state.getPosition();
        }

        @u
        static int r(PlaybackState state) {
            return state.getState();
        }

        @u
        static void s(PlaybackState.Builder builder, long actions) {
            builder.setActions(actions);
        }

        @u
        static void t(PlaybackState.Builder builder, long id2) {
            builder.setActiveQueueItemId(id2);
        }

        @u
        static void u(PlaybackState.Builder builder, long bufferedPosition) {
            builder.setBufferedPosition(bufferedPosition);
        }

        @u
        static void v(PlaybackState.Builder builder, CharSequence error) {
            builder.setErrorMessage(error);
        }

        @u
        static void w(PlaybackState.CustomAction.Builder builder, Bundle extras) {
            builder.setExtras(extras);
        }

        @u
        static void x(PlaybackState.Builder builder, int state, long position, float playbackSpeed, long updateTime) {
            builder.setState(state, position, playbackSpeed, updateTime);
        }
    }

    @w0(22)
    private static class d {
        private d() {
        }

        @u
        static Bundle a(PlaybackState state) {
            return state.getExtras();
        }

        @u
        static void b(PlaybackState.Builder builder, Bundle extras) {
            builder.setExtras(extras);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    PlaybackStateCompat(int state, long position, long bufferedPosition, float rate, long actions, int errorCode, CharSequence errorMessage, long updateTime, List<CustomAction> customActions, long activeItemId, Bundle extras) {
        this.f9681a = state;
        this.f9682b = position;
        this.f9683c = bufferedPosition;
        this.f9684d = rate;
        this.f9685e = actions;
        this.f9686f = errorCode;
        this.f9687g = errorMessage;
        this.f9688h = updateTime;
        this.f9689i = new ArrayList(customActions);
        this.f9690j = activeItemId;
        this.f9691k = extras;
    }

    public static PlaybackStateCompat a(Object stateObj) {
        ArrayList arrayList = null;
        if (stateObj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) stateObj;
        List<PlaybackState.CustomAction> listJ = c.j(playbackState);
        if (listJ != null) {
            arrayList = new ArrayList(listJ.size());
            Iterator<PlaybackState.CustomAction> it = listJ.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.a(it.next()));
            }
        }
        Bundle bundleA = d.a(playbackState);
        MediaSessionCompat.b(bundleA);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(c.r(playbackState), c.q(playbackState), c.i(playbackState), c.p(playbackState), c.g(playbackState), 0, c.k(playbackState), c.n(playbackState), arrayList, c.h(playbackState), bundleA);
        playbackStateCompat.f9692l = playbackState;
        return playbackStateCompat;
    }

    public static int p(long action) {
        if (action == 4) {
            return 126;
        }
        if (action == 2) {
            return 127;
        }
        if (action == 32) {
            return 87;
        }
        if (action == 16) {
            return 88;
        }
        if (action == 1) {
            return 86;
        }
        if (action == 64) {
            return 90;
        }
        if (action == 8) {
            return 89;
        }
        return action == 512 ? 85 : 0;
    }

    public long b() {
        return this.f9685e;
    }

    public long c() {
        return this.f9690j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f9683c;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public long f(Long timeDiff) {
        return Math.max(0L, this.f9682b + ((long) (this.f9684d * (timeDiff != null ? timeDiff.longValue() : SystemClock.elapsedRealtime() - this.f9688h))));
    }

    public List<CustomAction> g() {
        return this.f9689i;
    }

    public int h() {
        return this.f9686f;
    }

    public CharSequence i() {
        return this.f9687g;
    }

    @p0
    public Bundle j() {
        return this.f9691k;
    }

    public long k() {
        return this.f9688h;
    }

    public float l() {
        return this.f9684d;
    }

    public Object m() {
        if (this.f9692l == null) {
            PlaybackState.Builder builderD = c.d();
            c.x(builderD, this.f9681a, this.f9682b, this.f9684d, this.f9688h);
            c.u(builderD, this.f9683c);
            c.s(builderD, this.f9685e);
            c.v(builderD, this.f9687g);
            Iterator<CustomAction> it = this.f9689i.iterator();
            while (it.hasNext()) {
                c.a(builderD, (PlaybackState.CustomAction) it.next().c());
            }
            c.t(builderD, this.f9690j);
            d.b(builderD, this.f9691k);
            this.f9692l = c.c(builderD);
        }
        return this.f9692l;
    }

    public long n() {
        return this.f9682b;
    }

    public int o() {
        return this.f9681a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f9681a + ", position=" + this.f9682b + ", buffered position=" + this.f9683c + ", speed=" + this.f9684d + ", updated=" + this.f9688h + ", actions=" + this.f9685e + ", error code=" + this.f9686f + ", error message=" + this.f9687g + ", custom actions=" + this.f9689i + ", active item id=" + this.f9690j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.f9681a);
        dest.writeLong(this.f9682b);
        dest.writeFloat(this.f9684d);
        dest.writeLong(this.f9688h);
        dest.writeLong(this.f9683c);
        dest.writeLong(this.f9685e);
        TextUtils.writeToParcel(this.f9687g, dest, flags);
        dest.writeTypedList(this.f9689i);
        dest.writeLong(this.f9690j);
        dest.writeBundle(this.f9691k);
        dest.writeInt(this.f9686f);
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<CustomAction> f9702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f9703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f9704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f9706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f9707f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f9708g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private CharSequence f9709h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f9710i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f9711j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Bundle f9712k;

        public e() {
            this.f9702a = new ArrayList();
            this.f9711j = -1L;
        }

        public e a(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat");
            }
            this.f9702a.add(customAction);
            return this;
        }

        public e b(String action, String name, int icon) {
            return a(new CustomAction(action, name, icon, null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.f9703b, this.f9704c, this.f9705d, this.f9706e, this.f9707f, this.f9708g, this.f9709h, this.f9710i, this.f9702a, this.f9711j, this.f9712k);
        }

        public e d(long capabilities) {
            this.f9707f = capabilities;
            return this;
        }

        public e e(long id2) {
            this.f9711j = id2;
            return this;
        }

        public e f(long bufferPosition) {
            this.f9705d = bufferPosition;
            return this;
        }

        public e g(int errorCode, CharSequence errorMessage) {
            this.f9708g = errorCode;
            this.f9709h = errorMessage;
            return this;
        }

        @Deprecated
        public e h(CharSequence errorMessage) {
            this.f9709h = errorMessage;
            return this;
        }

        public e i(Bundle extras) {
            this.f9712k = extras;
            return this;
        }

        public e j(int state, long position, float playbackSpeed) {
            return k(state, position, playbackSpeed, SystemClock.elapsedRealtime());
        }

        public e k(int state, long position, float playbackSpeed, long updateTime) {
            this.f9703b = state;
            this.f9704c = position;
            this.f9710i = updateTime;
            this.f9706e = playbackSpeed;
            return this;
        }

        public e(PlaybackStateCompat source) {
            ArrayList arrayList = new ArrayList();
            this.f9702a = arrayList;
            this.f9711j = -1L;
            this.f9703b = source.f9681a;
            this.f9704c = source.f9682b;
            this.f9706e = source.f9684d;
            this.f9710i = source.f9688h;
            this.f9705d = source.f9683c;
            this.f9707f = source.f9685e;
            this.f9708g = source.f9686f;
            this.f9709h = source.f9687g;
            List<CustomAction> list = source.f9689i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f9711j = source.f9690j;
            this.f9712k = source.f9691k;
        }
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f9693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f9694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9695c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f9696d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private PlaybackState.CustomAction f9697e;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel p10) {
                return new CustomAction(p10);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int size) {
                return new CustomAction[size];
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f9698a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CharSequence f9699b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f9700c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Bundle f9701d;

            public b(String action, CharSequence name, int icon) {
                if (TextUtils.isEmpty(action)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(name)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (icon == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f9698a = action;
                this.f9699b = name;
                this.f9700c = icon;
            }

            public CustomAction a() {
                return new CustomAction(this.f9698a, this.f9699b, this.f9700c, this.f9701d);
            }

            public b b(Bundle extras) {
                this.f9701d = extras;
                return this;
            }
        }

        CustomAction(String action, CharSequence name, int icon, Bundle extras) {
            this.f9693a = action;
            this.f9694b = name;
            this.f9695c = icon;
            this.f9696d = extras;
        }

        public static CustomAction a(Object customActionObj) {
            if (customActionObj == null) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) customActionObj;
            Bundle bundleL = c.l(customAction);
            MediaSessionCompat.b(bundleL);
            CustomAction customAction2 = new CustomAction(c.f(customAction), c.o(customAction), c.m(customAction), bundleL);
            customAction2.f9697e = customAction;
            return customAction2;
        }

        public String b() {
            return this.f9693a;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.f9697e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builderE = c.e(this.f9693a, this.f9694b, this.f9695c);
            c.w(builderE, this.f9696d);
            return c.b(builderE);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Bundle e() {
            return this.f9696d;
        }

        public int f() {
            return this.f9695c;
        }

        public CharSequence g() {
            return this.f9694b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f9694b) + ", mIcon=" + this.f9695c + ", mExtras=" + this.f9696d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.f9693a);
            TextUtils.writeToParcel(this.f9694b, dest, flags);
            dest.writeInt(this.f9695c);
            dest.writeBundle(this.f9696d);
        }

        CustomAction(Parcel in) {
            this.f9693a = in.readString();
            this.f9694b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
            this.f9695c = in.readInt();
            this.f9696d = in.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel in) {
        this.f9681a = in.readInt();
        this.f9682b = in.readLong();
        this.f9684d = in.readFloat();
        this.f9688h = in.readLong();
        this.f9683c = in.readLong();
        this.f9685e = in.readLong();
        this.f9687g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(in);
        this.f9689i = in.createTypedArrayList(CustomAction.CREATOR);
        this.f9690j = in.readLong();
        this.f9691k = in.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f9686f = in.readInt();
    }
}
