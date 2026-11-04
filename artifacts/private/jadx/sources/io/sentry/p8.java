package io.sentry;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class p8 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f306015o = "android.widget.TextView";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f306016p = "android.widget.ImageView";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f306017q = "android.webkit.WebView";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f306018r = "android.widget.VideoView";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f306019s = "androidx.media3.ui.PlayerView";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f306020t = "com.google.android.exoplayer2.ui.PlayerView";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f306021u = "com.google.android.exoplayer2.ui.StyledPlayerView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Double f306022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Double f306023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<String> f306024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set<String> f306025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private String f306026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private String f306027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private a f306028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f306029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f306030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f306031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f306032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f306033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    private io.sentry.protocol.p f306034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f306035n;

    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f10, int i10, int i11) {
            this.sizeScale = f10;
            this.bitRate = i10;
            this.screenshotQuality = i11;
        }

        @NotNull
        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public p8(boolean z10, @Nullable io.sentry.protocol.p pVar) {
        this.f306024c = new CopyOnWriteArraySet();
        this.f306025d = new CopyOnWriteArraySet();
        this.f306026e = null;
        this.f306027f = null;
        this.f306028g = a.MEDIUM;
        this.f306029h = 1;
        this.f306030i = 30000L;
        this.f306031j = 5000L;
        this.f306032k = 3600000L;
        this.f306033l = true;
        this.f306035n = false;
        if (z10) {
            return;
        }
        u(true);
        t(true);
        this.f306024c.add(f306017q);
        this.f306024c.add(f306018r);
        this.f306024c.add(f306019s);
        this.f306024c.add(f306020t);
        this.f306024c.add(f306021u);
        this.f306034m = pVar;
    }

    @lm.a.c
    public void A(boolean z10) {
        this.f306033l = z10;
    }

    @lm.a.c
    public void B(@NotNull String str) {
        this.f306027f = str;
    }

    public void a(@NotNull String str) {
        this.f306024c.add(str);
    }

    public void b(@NotNull String str) {
        this.f306025d.add(str);
    }

    @lm.a.c
    public long c() {
        return this.f306030i;
    }

    @lm.a.c
    public int d() {
        return this.f306029h;
    }

    @NotNull
    public Set<String> e() {
        return this.f306024c;
    }

    @lm.a.c
    @Nullable
    public String f() {
        return this.f306026e;
    }

    @Nullable
    public Double g() {
        return this.f306023b;
    }

    @lm.a.c
    @NotNull
    public a h() {
        return this.f306028g;
    }

    @lm.a.c
    @Nullable
    public io.sentry.protocol.p i() {
        return this.f306034m;
    }

    @lm.a.c
    public long j() {
        return this.f306032k;
    }

    @Nullable
    public Double k() {
        return this.f306022a;
    }

    @lm.a.c
    public long l() {
        return this.f306031j;
    }

    @NotNull
    public Set<String> m() {
        return this.f306025d;
    }

    @lm.a.c
    @Nullable
    public String n() {
        return this.f306027f;
    }

    public boolean o() {
        return this.f306035n;
    }

    public boolean p() {
        return k() != null && k().doubleValue() > 0.0d;
    }

    public boolean q() {
        return g() != null && g().doubleValue() > 0.0d;
    }

    @lm.a.c
    public boolean r() {
        return this.f306033l;
    }

    public void s(boolean z10) {
        this.f306035n = z10;
    }

    public void t(boolean z10) {
        if (z10) {
            a(f306016p);
            this.f306025d.remove(f306016p);
        } else {
            b(f306016p);
            this.f306024c.remove(f306016p);
        }
    }

    public void u(boolean z10) {
        if (z10) {
            a("android.widget.TextView");
            this.f306025d.remove("android.widget.TextView");
        } else {
            b("android.widget.TextView");
            this.f306024c.remove("android.widget.TextView");
        }
    }

    @lm.a.c
    public void v(@NotNull String str) {
        a(str);
        this.f306026e = str;
    }

    public void w(@Nullable Double d10) {
        if (io.sentry.util.d0.f(d10)) {
            this.f306023b = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void x(@NotNull a aVar) {
        this.f306028g = aVar;
    }

    @lm.a.c
    public void y(@Nullable io.sentry.protocol.p pVar) {
        this.f306034m = pVar;
    }

    public void z(@Nullable Double d10) {
        if (io.sentry.util.d0.f(d10)) {
            this.f306022a = d10;
            return;
        }
        throw new IllegalArgumentException("The value " + d10 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public p8(@Nullable Double d10, @Nullable Double d11, @Nullable io.sentry.protocol.p pVar) {
        this(false, pVar);
        this.f306022a = d10;
        this.f306023b = d11;
        this.f306034m = pVar;
    }
}
