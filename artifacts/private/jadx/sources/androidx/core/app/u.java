package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f47164s = "miscellaneous";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f47165t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f47166u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final String f47167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    CharSequence f47168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f47169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f47170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f47171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f47172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Uri f47173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    AudioAttributes f47174h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f47175i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f47176j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f47177k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long[] f47178l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f47179m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f47180n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f47181o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f47182p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f47183q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f47184r;

    @w0(26)
    static class a {
        private a() {
        }

        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        static NotificationChannel c(String str, CharSequence charSequence, int i10) {
            return new NotificationChannel(str, charSequence, i10);
        }

        static void d(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableLights(z10);
        }

        static void e(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.enableVibration(z10);
        }

        static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        static void r(NotificationChannel notificationChannel, int i10) {
            notificationChannel.setLightColor(i10);
        }

        static void s(NotificationChannel notificationChannel, boolean z10) {
            notificationChannel.setShowBadge(z10);
        }

        static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    @w0(29)
    static class b {
        private b() {
        }

        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    @w0(30)
    static class c {
        private c() {
        }

        static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u f47185a;

        public d(@NonNull String str, int i10) {
            this.f47185a = new u(str, i10);
        }

        @NonNull
        public u a() {
            return this.f47185a;
        }

        @NonNull
        public d b(@NonNull String str, @NonNull String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                u uVar = this.f47185a;
                uVar.f47179m = str;
                uVar.f47180n = str2;
            }
            return this;
        }

        @NonNull
        public d c(@androidx.annotation.p0 String str) {
            this.f47185a.f47170d = str;
            return this;
        }

        @NonNull
        public d d(@androidx.annotation.p0 String str) {
            this.f47185a.f47171e = str;
            return this;
        }

        @NonNull
        public d e(int i10) {
            this.f47185a.f47169c = i10;
            return this;
        }

        @NonNull
        public d f(int i10) {
            this.f47185a.f47176j = i10;
            return this;
        }

        @NonNull
        public d g(boolean z10) {
            this.f47185a.f47175i = z10;
            return this;
        }

        @NonNull
        public d h(@androidx.annotation.p0 CharSequence charSequence) {
            this.f47185a.f47168b = charSequence;
            return this;
        }

        @NonNull
        public d i(boolean z10) {
            this.f47185a.f47172f = z10;
            return this;
        }

        @NonNull
        public d j(@androidx.annotation.p0 Uri uri, @androidx.annotation.p0 AudioAttributes audioAttributes) {
            u uVar = this.f47185a;
            uVar.f47173g = uri;
            uVar.f47174h = audioAttributes;
            return this;
        }

        @NonNull
        public d k(boolean z10) {
            this.f47185a.f47177k = z10;
            return this;
        }

        @NonNull
        public d l(@androidx.annotation.p0 long[] jArr) {
            u uVar = this.f47185a;
            uVar.f47177k = jArr != null && jArr.length > 0;
            uVar.f47178l = jArr;
            return this;
        }
    }

    u(@NonNull String str, int i10) {
        this.f47172f = true;
        this.f47173g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f47176j = 0;
        this.f47167a = (String) androidx.core.util.t.l(str);
        this.f47169c = i10;
        this.f47174h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f47183q;
    }

    public boolean b() {
        return this.f47181o;
    }

    public boolean c() {
        return this.f47172f;
    }

    @androidx.annotation.p0
    public AudioAttributes d() {
        return this.f47174h;
    }

    @androidx.annotation.p0
    public String e() {
        return this.f47180n;
    }

    @androidx.annotation.p0
    public String f() {
        return this.f47170d;
    }

    @androidx.annotation.p0
    public String g() {
        return this.f47171e;
    }

    @NonNull
    public String h() {
        return this.f47167a;
    }

    public int i() {
        return this.f47169c;
    }

    public int j() {
        return this.f47176j;
    }

    public int k() {
        return this.f47182p;
    }

    @androidx.annotation.p0
    public CharSequence l() {
        return this.f47168b;
    }

    NotificationChannel m() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannelC = a.c(this.f47167a, this.f47168b, this.f47169c);
        a.p(notificationChannelC, this.f47170d);
        a.q(notificationChannelC, this.f47171e);
        a.s(notificationChannelC, this.f47172f);
        a.t(notificationChannelC, this.f47173g, this.f47174h);
        a.d(notificationChannelC, this.f47175i);
        a.r(notificationChannelC, this.f47176j);
        a.u(notificationChannelC, this.f47178l);
        a.e(notificationChannelC, this.f47177k);
        if (i10 >= 30 && (str = this.f47179m) != null && (str2 = this.f47180n) != null) {
            c.d(notificationChannelC, str, str2);
        }
        return notificationChannelC;
    }

    @androidx.annotation.p0
    public String n() {
        return this.f47179m;
    }

    @androidx.annotation.p0
    public Uri o() {
        return this.f47173g;
    }

    @androidx.annotation.p0
    public long[] p() {
        return this.f47178l;
    }

    public boolean q() {
        return this.f47184r;
    }

    public boolean r() {
        return this.f47175i;
    }

    public boolean s() {
        return this.f47177k;
    }

    @NonNull
    public d t() {
        return new d(this.f47167a, this.f47169c).h(this.f47168b).c(this.f47170d).d(this.f47171e).i(this.f47172f).j(this.f47173g, this.f47174h).g(this.f47175i).f(this.f47176j).k(this.f47177k).l(this.f47178l).b(this.f47179m, this.f47180n);
    }

    @w0(26)
    u(@NonNull NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f47168b = a.m(notificationChannel);
        this.f47170d = a.g(notificationChannel);
        this.f47171e = a.h(notificationChannel);
        this.f47172f = a.b(notificationChannel);
        this.f47173g = a.n(notificationChannel);
        this.f47174h = a.f(notificationChannel);
        this.f47175i = a.v(notificationChannel);
        this.f47176j = a.k(notificationChannel);
        this.f47177k = a.w(notificationChannel);
        this.f47178l = a.o(notificationChannel);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f47179m = c.b(notificationChannel);
            this.f47180n = c.a(notificationChannel);
        }
        this.f47181o = a.a(notificationChannel);
        this.f47182p = a.l(notificationChannel);
        this.f47183q = b.a(notificationChannel);
        if (i10 >= 30) {
            this.f47184r = c.c(notificationChannel);
        }
    }
}
