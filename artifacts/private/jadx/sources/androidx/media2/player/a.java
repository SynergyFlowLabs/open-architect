package androidx.media2.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import androidx.annotation.b0;
import androidx.media.AudioAttributesCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f58157b = "AudioFocusHandler";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f58158c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0534a f58159a;

    /* JADX INFO: renamed from: androidx.media2.player.a$a, reason: collision with other inner class name */
    interface InterfaceC0534a {
        void close();

        void d();

        boolean e();

        void f(Intent intent);

        void g();
    }

    private static class b implements InterfaceC0534a {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final float f58160l = 0.2f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BroadcastReceiver f58161a = new C0536b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final IntentFilter f58162b = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AudioManager.OnAudioFocusChangeListener f58163c = new C0535a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Object f58164d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Context f58165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final MediaPlayer f58166f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final AudioManager f58167g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @b0("mLock")
        AudioAttributesCompat f58168h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @b0("mLock")
        private int f58169i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @b0("mLock")
        boolean f58170j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @b0("mLock")
        boolean f58171k;

        /* JADX INFO: renamed from: androidx.media2.player.a$b$a, reason: collision with other inner class name */
        private class C0535a implements AudioManager.OnAudioFocusChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float f58172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f58173b;

            C0535a() {
            }

            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public void onAudioFocusChange(int i10) {
                if (i10 == -3) {
                    synchronized (b.this.f58164d) {
                        try {
                            AudioAttributesCompat audioAttributesCompat = b.this.f58168h;
                            if (audioAttributesCompat == null) {
                                return;
                            }
                            boolean z10 = audioAttributesCompat.getContentType() == 1;
                            if (z10) {
                                b.this.f58166f.pause();
                                return;
                            }
                            float fO0 = b.this.f58166f.o0();
                            float f10 = 0.2f * fO0;
                            synchronized (b.this.f58164d) {
                                try {
                                    this.f58172a = fO0;
                                    this.f58173b = f10;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            b.this.f58166f.B1(f10);
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
                if (i10 == -2) {
                    b.this.f58166f.pause();
                    synchronized (b.this.f58164d) {
                        try {
                            b.this.f58170j = true;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    return;
                }
                if (i10 == -1) {
                    b.this.f58166f.pause();
                    synchronized (b.this.f58164d) {
                        try {
                            b.this.f58170j = false;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    return;
                }
                if (i10 != 1) {
                    return;
                }
                if (b.this.f58166f.s0() == 1) {
                    synchronized (b.this.f58164d) {
                        try {
                            b bVar = b.this;
                            if (bVar.f58170j) {
                                bVar.f58166f.B();
                                return;
                            }
                            return;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                float fO1 = b.this.f58166f.o0();
                synchronized (b.this.f58164d) {
                    try {
                        if (fO1 != this.f58173b) {
                            return;
                        }
                        b.this.f58166f.B1(this.f58172a);
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.media2.player.a$b$b, reason: collision with other inner class name */
        private class C0536b extends BroadcastReceiver {
            C0536b() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AudioAttributesCompat audioAttributesCompat;
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    synchronized (b.this.f58164d) {
                        try {
                            intent.toString();
                            b bVar = b.this;
                            boolean z10 = bVar.f58171k;
                            Objects.toString(bVar.f58168h);
                            b bVar2 = b.this;
                            if (bVar2.f58171k && (audioAttributesCompat = bVar2.f58168h) != null) {
                                int iZ4 = audioAttributesCompat.Z4();
                                if (iZ4 == 1) {
                                    b.this.f58166f.pause();
                                } else if (iZ4 == 14) {
                                    MediaPlayer mediaPlayer = b.this.f58166f;
                                    mediaPlayer.B1(mediaPlayer.o0() * 0.2f);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }

        b(Context context, MediaPlayer mediaPlayer) {
            this.f58165e = context;
            this.f58166f = mediaPlayer;
            this.f58167g = (AudioManager) context.getSystemService("audio");
        }

        @b0("mLock")
        private void a() {
            if (this.f58169i == 0) {
                return;
            }
            this.f58167g.abandonAudioFocus(this.f58163c);
            this.f58169i = 0;
            this.f58170j = false;
        }

        private static int b(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                return 0;
            }
            switch (audioAttributesCompat.Z4()) {
                case 0:
                case 1:
                case 14:
                    return 1;
                case 2:
                case 4:
                    return 2;
                case 3:
                    return 0;
                case 11:
                    if (audioAttributesCompat.getContentType() == 1) {
                        return 2;
                    }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 12:
                case 13:
                    return 3;
                case 15:
                default:
                    audioAttributesCompat.toString();
                    return 0;
                case 16:
                    return 4;
            }
        }

        @b0("mLock")
        private void c() {
            if (this.f58171k) {
                return;
            }
            this.f58165e.registerReceiver(this.f58161a, this.f58162b);
            this.f58171k = true;
        }

        @b0("mLock")
        private boolean h() {
            int iB = b(this.f58168h);
            if (iB == 0) {
                return true;
            }
            if (this.f58167g.requestAudioFocus(this.f58163c, this.f58168h.c5(), iB) == 1) {
                this.f58169i = iB;
            } else {
                this.f58169i = 0;
            }
            this.f58170j = false;
            return this.f58169i != 0;
        }

        @b0("mLock")
        private void i() {
            if (this.f58171k) {
                this.f58165e.unregisterReceiver(this.f58161a);
                this.f58171k = false;
            }
        }

        @Override // androidx.media2.player.a.InterfaceC0534a
        public void close() {
            synchronized (this.f58164d) {
                try {
                    i();
                    a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.media2.player.a.InterfaceC0534a
        public void d() {
            synchronized (this.f58164d) {
                try {
                    this.f58170j = false;
                    i();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.media2.player.a.InterfaceC0534a
        public boolean e() {
            boolean z10;
            AudioAttributesCompat audioAttributesCompatB = this.f58166f.b();
            synchronized (this.f58164d) {
                try {
                    this.f58168h = audioAttributesCompatB;
                    if (audioAttributesCompatB == null) {
                        a();
                        i();
                        z10 = true;
                    } else {
                        boolean zH = h();
                        if (zH) {
                            c();
                        }
                        z10 = zH;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z10;
        }

        @Override // androidx.media2.player.a.InterfaceC0534a
        public void f(Intent intent) {
            this.f58161a.onReceive(this.f58165e, intent);
        }

        @Override // androidx.media2.player.a.InterfaceC0534a
        public void g() {
            synchronized (this.f58164d) {
                try {
                    a();
                    i();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    a(Context context, MediaPlayer mediaPlayer) {
        this.f58159a = new b(context, mediaPlayer);
    }

    public void a() {
        this.f58159a.close();
    }

    public void b() {
        this.f58159a.d();
    }

    public boolean c() {
        return this.f58159a.e();
    }

    public void d() {
        this.f58159a.g();
    }

    public void e(Intent intent) {
        this.f58159a.f(intent);
    }
}
