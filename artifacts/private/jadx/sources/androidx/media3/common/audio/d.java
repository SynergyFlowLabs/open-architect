package androidx.media3.common.audio;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60315a = "AudioManagerCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f60316b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f60317c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f60318d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f60319e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f60320f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private static AudioManager f60321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Context f60322h;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private d() {
    }

    public static /* synthetic */ void a(Context context, androidx.media3.common.util.m mVar) {
        f60321g = (AudioManager) context.getSystemService("audio");
        mVar.f();
    }

    public static int b(AudioManager audioManager, androidx.media3.common.audio.a aVar) {
        return k1.f61540a >= 26 ? audioManager.abandonAudioFocusRequest(aVar.c()) : audioManager.abandonAudioFocus(aVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f60322h != applicationContext) {
                int i10 = 7 >> 0;
                f60321g = null;
            }
            AudioManager audioManager = f60321g;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final androidx.media3.common.util.m mVar = new androidx.media3.common.util.m();
                androidx.media3.common.util.c.a().execute(new Runnable() { // from class: androidx.media3.common.audio.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.a(applicationContext, mVar);
                    }
                });
                mVar.c();
                return (AudioManager) androidx.media3.common.util.a.g(f60321g);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f60321g = audioManager2;
            return (AudioManager) androidx.media3.common.util.a.g(audioManager2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @g0(from = 0)
    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    @g0(from = 0)
    public static int e(AudioManager audioManager, int i10) {
        if (k1.f61540a >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            z.o(f60315a, "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        if (k1.f61540a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return f(audioManager, i10) == 0;
    }

    public static int h(AudioManager audioManager, androidx.media3.common.audio.a aVar) {
        return k1.f61540a >= 26 ? audioManager.requestAudioFocus(aVar.c()) : audioManager.requestAudioFocus(aVar.f(), aVar.b().c(), aVar.e());
    }
}
