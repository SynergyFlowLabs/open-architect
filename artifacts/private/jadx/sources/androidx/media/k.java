package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f52959g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f52960h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f52961i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f52964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f52966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VolumeProvider f52967f;

    class a extends VolumeProvider {
        a(int volumeControl, int maxVolume, int currentVolume, String volumeControlId) {
            super(volumeControl, maxVolume, currentVolume, volumeControlId);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int direction) {
            k.this.f(direction);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int volume) {
            k.this.g(volume);
        }
    }

    class b extends VolumeProvider {
        b(int volumeControl, int maxVolume, int currentVolume) {
            super(volumeControl, maxVolume, currentVolume);
        }

        @Override // android.media.VolumeProvider
        public void onAdjustVolume(int direction) {
            k.this.f(direction);
        }

        @Override // android.media.VolumeProvider
        public void onSetVolumeTo(int volume) {
            k.this.g(volume);
        }
    }

    @w0(21)
    private static class c {
        private c() {
        }

        @u
        static void a(VolumeProvider volumeProvider, int currentVolume) {
            volumeProvider.setCurrentVolume(currentVolume);
        }
    }

    public static abstract class d {
        public abstract void a(k volumeProvider);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    public k(int volumeControl, int maxVolume, int currentVolume) {
        this(volumeControl, maxVolume, currentVolume, null);
    }

    public final int a() {
        return this.f52965d;
    }

    public final int b() {
        return this.f52963b;
    }

    public final int c() {
        return this.f52962a;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    @p0
    public final String d() {
        return this.f52964c;
    }

    public Object e() {
        k kVar;
        if (this.f52967f != null) {
            kVar = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            kVar = this;
            kVar.f52967f = kVar.new a(this.f52962a, this.f52963b, this.f52965d, this.f52964c);
        } else {
            kVar = this;
            kVar.f52967f = kVar.new b(kVar.f52962a, kVar.f52963b, kVar.f52965d);
        }
        return kVar.f52967f;
    }

    public void f(int direction) {
    }

    public void g(int volume) {
    }

    public void h(d callback) {
        this.f52966e = callback;
    }

    public final void i(int currentVolume) {
        this.f52965d = currentVolume;
        c.a((VolumeProvider) e(), currentVolume);
        d dVar = this.f52966e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public k(int volumeControl, int maxVolume, int currentVolume, @p0 String volumeControlId) {
        this.f52962a = volumeControl;
        this.f52963b = maxVolume;
        this.f52965d = currentVolume;
        this.f52964c = volumeControlId;
    }
}
