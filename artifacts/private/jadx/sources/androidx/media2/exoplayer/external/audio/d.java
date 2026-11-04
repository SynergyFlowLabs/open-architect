package androidx.media2.exoplayer.external.audio;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.util.q0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@e.b(21)
@b1({b1.a.LIBRARY_GROUP})
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f53281c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f53282d = new d(new int[]{2}, 8);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f53283e = new d(new int[]{2, 5, 6}, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f53284f = "external_surround_sound_enabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f53285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f53286b;

    public d(@p0 int[] supportedEncodings, int maxChannelCount) {
        if (supportedEncodings != null) {
            int[] iArrCopyOf = Arrays.copyOf(supportedEncodings, supportedEncodings.length);
            this.f53285a = iArrCopyOf;
            Arrays.sort(iArrCopyOf);
        } else {
            this.f53285a = new int[0];
        }
        this.f53286b = maxChannelCount;
    }

    private static boolean a() {
        return q0.f57626a >= 17 && "Amazon".equals(q0.f57628c);
    }

    public static d b(Context context) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @e.a({"InlinedApi"})
    static d c(Context context, @p0 Intent intent) {
        if (a() && Settings.Global.getInt(context.getContentResolver(), f53284f, 0) == 1) {
            return f53283e;
        }
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new d(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return f53282d;
    }

    @p0
    static Uri d() {
        if (a()) {
            return Settings.Global.getUriFor(f53284f);
        }
        return null;
    }

    public int e() {
        return this.f53286b;
    }

    public boolean equals(@p0 Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return Arrays.equals(this.f53285a, dVar.f53285a) && this.f53286b == dVar.f53286b;
    }

    public boolean f(int encoding) {
        return Arrays.binarySearch(this.f53285a, encoding) >= 0;
    }

    public int hashCode() {
        return this.f53286b + (Arrays.hashCode(this.f53285a) * 31);
    }

    public String toString() {
        int i10 = this.f53286b;
        String string = Arrays.toString(this.f53285a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 67);
        sb2.append("AudioCapabilities[maxChannelCount=");
        sb2.append(i10);
        sb2.append(", supportedEncodings=");
        sb2.append(string);
        sb2.append("]");
        return sb2.toString();
    }
}
