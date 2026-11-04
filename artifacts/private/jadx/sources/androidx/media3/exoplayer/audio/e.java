package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.l1;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import com.google.common.collect.l6;
import com.google.common.collect.n6;
import com.google.common.collect.nb;
import com.google.common.collect.z6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    static final int f63181c = 10;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l1
    static final int f63182d = 48000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f63183e = new e(l6.G(C0578e.f63190d));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e.a({"InlinedApi"})
    private static final l6<Integer> f63184f = l6.K(2, 5, 6);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final n6<Integer, Integer> f63185g = new n6.b().i(5, 6).i(17, 6).i(7, 6).i(30, 10).i(18, 6).i(6, 8).i(8, 8).i(14, 8).d();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f63186h = "external_surround_sound_enabled";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f63187i = "use_external_surround_sound_flag";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseArray<C0578e> f63188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63189b;

    @androidx.annotation.w0(23)
    private static final class b {
        private b() {
        }

        private static z6<Integer> a() {
            z6.a aVarB = new z6.a().b(8, 7);
            int i10 = k1.f61540a;
            if (i10 >= 31) {
                aVarB.b(26, 27);
            }
            if (i10 >= 33) {
                aVarB.a(30);
            }
            return aVarB.e();
        }

        public static boolean b(AudioManager audioManager, @androidx.annotation.p0 i iVar) {
            AudioDeviceInfo[] devices = iVar == null ? ((AudioManager) androidx.media3.common.util.a.g(audioManager)).getDevices(2) : new AudioDeviceInfo[]{iVar.f63215a};
            z6<Integer> z6VarA = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (z6VarA.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    @androidx.annotation.w0(29)
    private static final class c {
        private c() {
        }

        public static l6<Integer> a(androidx.media3.common.d dVar) {
            l6.a aVarS = l6.s();
            nb<Integer> it = e.f63185g.keySet().iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                int iIntValue = next.intValue();
                if (k1.f61540a >= k1.X(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), dVar.b().f60484a)) {
                    aVarS.a(next);
                }
            }
            aVarS.a(2);
            return aVarS.e();
        }

        public static int b(int i10, int i11, androidx.media3.common.d dVar) {
            for (int i12 = 10; i12 > 0; i12--) {
                int iA0 = k1.a0(i12);
                if (iA0 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(iA0).build(), dVar.b().f60484a)) {
                    return i12;
                }
            }
            return 0;
        }
    }

    @androidx.annotation.w0(33)
    private static final class d {
        private d() {
        }

        public static e a(AudioManager audioManager, androidx.media3.common.d dVar) {
            return new e(e.c(audioManager.getDirectProfilesForAttributes(dVar.b().f60484a)));
        }

        @androidx.annotation.p0
        public static i b(AudioManager audioManager, androidx.media3.common.d dVar) {
            try {
                List audioDevicesForAttributes = ((AudioManager) androidx.media3.common.util.a.g(audioManager)).getAudioDevicesForAttributes(dVar.b().f60484a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new i((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static boolean b() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @e.a({"WrongConstant"})
    @androidx.annotation.w0(33)
    public static l6<C0578e> c(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(com.google.common.primitives.l.c(12)));
        for (int i10 = 0; i10 < list.size(); i10++) {
            AudioProfile audioProfileA = androidx.media3.exoplayer.audio.a.a(list.get(i10));
            if (audioProfileA.getEncapsulationType() != 1) {
                int format = audioProfileA.getFormat();
                if (k1.h1(format) || f63185g.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) androidx.media3.common.util.a.g((Set) map.get(Integer.valueOf(format)))).addAll(com.google.common.primitives.l.c(audioProfileA.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(com.google.common.primitives.l.c(audioProfileA.getChannelMasks())));
                    }
                }
            }
        }
        l6.a aVarS = l6.s();
        for (Map.Entry entry : map.entrySet()) {
            aVarS.a(new C0578e(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return aVarS.e();
    }

    private static l6<C0578e> d(@androidx.annotation.p0 int[] iArr, int i10) {
        l6.a aVarS = l6.s();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i11 : iArr) {
            aVarS.a(new C0578e(i11, i10));
        }
        return aVarS.e();
    }

    @Deprecated
    public static e e(Context context) {
        return f(context, androidx.media3.common.d.f60472g, null);
    }

    public static e f(Context context, androidx.media3.common.d dVar, @androidx.annotation.p0 AudioDeviceInfo audioDeviceInfo) {
        return h(context, dVar, (k1.f61540a < 23 || audioDeviceInfo == null) ? null : new i(audioDeviceInfo));
    }

    @e.a({"InlinedApi"})
    static e g(Context context, @androidx.annotation.p0 Intent intent, androidx.media3.common.d dVar, @androidx.annotation.p0 i iVar) {
        AudioManager audioManagerC = androidx.media3.common.audio.d.c(context);
        if (iVar == null) {
            iVar = k1.f61540a >= 33 ? d.b(audioManagerC, dVar) : null;
        }
        int i10 = k1.f61540a;
        if (i10 >= 33 && (k1.p1(context) || k1.e1(context))) {
            return d.a(audioManagerC, dVar);
        }
        if (i10 >= 23 && b.b(audioManagerC, iVar)) {
            return f63183e;
        }
        z6.a aVar = new z6.a();
        aVar.a(2);
        if (i10 >= 29 && (k1.p1(context) || k1.e1(context))) {
            aVar.c(c.a(dVar));
            return new e(d(com.google.common.primitives.l.E(aVar.e()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, f63187i, 0) == 1;
        if ((z10 || b()) && Settings.Global.getInt(contentResolver, f63186h, 0) == 1) {
            aVar.c(f63184f);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new e(d(com.google.common.primitives.l.E(aVar.e()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.c(com.google.common.primitives.l.c(intArrayExtra));
        }
        return new e(d(com.google.common.primitives.l.E(aVar.e()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    @e.a({"UnprotectedReceiver"})
    static e h(Context context, androidx.media3.common.d dVar, @androidx.annotation.p0 i iVar) {
        return g(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, iVar);
    }

    private static int i(int i10) {
        int i11 = k1.f61540a;
        if (i11 <= 28) {
            if (i10 == 7) {
                i10 = 8;
            } else if (i10 == 3 || i10 == 4 || i10 == 5) {
                i10 = 6;
            }
        }
        if (i11 <= 26 && "fugu".equals(Build.DEVICE) && i10 == 1) {
            i10 = 2;
        }
        return k1.a0(i10);
    }

    @androidx.annotation.p0
    static Uri l() {
        if (b()) {
            return Settings.Global.getUriFor(f63186h);
        }
        return null;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k1.A(this.f63188a, eVar.f63188a) && this.f63189b == eVar.f63189b;
    }

    public int hashCode() {
        return this.f63189b + (k1.B(this.f63188a) * 31);
    }

    @androidx.annotation.p0
    @Deprecated
    public Pair<Integer, Integer> j(androidx.media3.common.w wVar) {
        return k(wVar, androidx.media3.common.d.f60472g);
    }

    @androidx.annotation.p0
    public Pair<Integer, Integer> k(androidx.media3.common.w wVar, androidx.media3.common.d dVar) {
        int iF = androidx.media3.common.s0.f((String) androidx.media3.common.util.a.g(wVar.f61761o), wVar.f61757k);
        if (!f63185g.containsKey(Integer.valueOf(iF))) {
            return null;
        }
        if (iF == 18 && !p(18)) {
            iF = 6;
        } else if ((iF == 8 && !p(8)) || (iF == 30 && !p(30))) {
            iF = 7;
        }
        if (!p(iF)) {
            return null;
        }
        C0578e c0578e = (C0578e) androidx.media3.common.util.a.g(this.f63188a.get(iF));
        int iB = wVar.E;
        if (iB == -1 || iF == 18) {
            int i10 = wVar.F;
            if (i10 == -1) {
                i10 = 48000;
            }
            iB = c0578e.b(i10, dVar);
        } else if (!wVar.f61761o.equals(androidx.media3.common.s0.f61293a0) || k1.f61540a >= 33) {
            if (!c0578e.c(iB)) {
                return null;
            }
        } else if (iB > 10) {
            return null;
        }
        int i11 = i(iB);
        if (i11 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iF), Integer.valueOf(i11));
    }

    public int m() {
        return this.f63189b;
    }

    @Deprecated
    public boolean n(androidx.media3.common.w wVar) {
        return o(wVar, androidx.media3.common.d.f60472g);
    }

    public boolean o(androidx.media3.common.w wVar, androidx.media3.common.d dVar) {
        return k(wVar, dVar) != null;
    }

    public boolean p(int i10) {
        return k1.y(this.f63188a, i10);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f63189b + ", audioProfiles=" + this.f63188a + "]";
    }

    @Deprecated
    public e(@androidx.annotation.p0 int[] iArr, int i10) {
        this(d(iArr, i10));
    }

    private e(List<C0578e> list) {
        this.f63188a = new SparseArray<>();
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0578e c0578e = list.get(i10);
            this.f63188a.put(c0578e.f63191a, c0578e);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f63188a.size(); i11++) {
            iMax = Math.max(iMax, this.f63188a.valueAt(i11).f63192b);
        }
        this.f63189b = iMax;
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.audio.e$e, reason: collision with other inner class name */
    private static final class C0578e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0578e f63190d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f63191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private final z6<Integer> f63193c;

        static {
            f63190d = k1.f61540a >= 33 ? new C0578e(2, a(10)) : new C0578e(2, 10);
        }

        @androidx.annotation.w0(33)
        public C0578e(int i10, Set<Integer> set) {
            this.f63191a = i10;
            z6<Integer> z6VarA = z6.A(set);
            this.f63193c = z6VarA;
            nb<Integer> it = z6VarA.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(it.next().intValue()));
            }
            this.f63192b = iMax;
        }

        private static z6<Integer> a(int i10) {
            z6.a aVar = new z6.a();
            for (int i11 = 1; i11 <= i10; i11++) {
                aVar.a(Integer.valueOf(k1.a0(i11)));
            }
            return aVar.e();
        }

        public int b(int i10, androidx.media3.common.d dVar) {
            if (this.f63193c != null) {
                return this.f63192b;
            }
            return k1.f61540a >= 29 ? c.b(this.f63191a, i10, dVar) : ((Integer) androidx.media3.common.util.a.g(e.f63185g.getOrDefault(Integer.valueOf(this.f63191a), 0))).intValue();
        }

        public boolean c(int i10) {
            if (this.f63193c == null) {
                return i10 <= this.f63192b;
            }
            int iA0 = k1.a0(i10);
            if (iA0 == 0) {
                return false;
            }
            return this.f63193c.contains(Integer.valueOf(iA0));
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0578e)) {
                return false;
            }
            C0578e c0578e = (C0578e) obj;
            return this.f63191a == c0578e.f63191a && this.f63192b == c0578e.f63192b && Objects.equals(this.f63193c, c0578e.f63193c);
        }

        public int hashCode() {
            int i10 = ((this.f63191a * 31) + this.f63192b) * 31;
            z6<Integer> z6Var = this.f63193c;
            return i10 + (z6Var == null ? 0 : z6Var.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f63191a + ", maxChannelCount=" + this.f63192b + ", channelMasks=" + this.f63193c + "]";
        }

        public C0578e(int i10, int i11) {
            this.f63191a = i10;
            this.f63192b = i11;
            this.f63193c = null;
        }
    }
}
