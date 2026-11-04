package androidx.media;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.u;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52738a = "AudioManCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f52739b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f52740c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f52741d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f52742e = 4;

    @w0(26)
    private static class a {
        private a() {
        }

        @u
        static int a(AudioManager audioManager, AudioFocusRequest focusRequest) {
            return audioManager.abandonAudioFocusRequest(focusRequest);
        }

        @u
        static int b(AudioManager audioManager, AudioFocusRequest focusRequest) {
            return audioManager.requestAudioFocus(focusRequest);
        }
    }

    /* JADX INFO: renamed from: androidx.media.b$b, reason: collision with other inner class name */
    @w0(28)
    private static class C0492b {
        private C0492b() {
        }

        @u
        static int a(AudioManager audioManager, int streamType) {
            return audioManager.getStreamMinVolume(streamType);
        }
    }

    private b() {
    }

    public static int a(@NonNull AudioManager audioManager, @NonNull androidx.media.a focusRequest) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (focusRequest != null) {
            return a.a(audioManager, focusRequest.c());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    @g0(from = 0)
    public static int b(@NonNull AudioManager audioManager, int streamType) {
        return audioManager.getStreamMaxVolume(streamType);
    }

    @g0(from = 0)
    public static int c(@NonNull AudioManager audioManager, int streamType) {
        return C0492b.a(audioManager, streamType);
    }

    public static int d(@NonNull AudioManager audioManager, @NonNull androidx.media.a focusRequest) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (focusRequest != null) {
            return a.b(audioManager, focusRequest.c());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
