package com.google.android.filament.android;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.filament.Renderer;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f104691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DisplayManager f104692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Display f104693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Renderer f104694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private DisplayManager.DisplayListener f104695e;

    /* JADX INFO: renamed from: com.google.android.filament.android.a$a, reason: collision with other inner class name */
    class C0954a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Display f104696a;

        C0954a(Display display) {
            this.f104696a = display;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == this.f104696a.getDisplayId()) {
                a.this.j();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.j();
        }
    }

    public a(@NonNull Context context) {
        this.f104691a = null;
        this.f104692b = (DisplayManager) context.getSystemService("display");
    }

    public static long d(@NonNull Display display) {
        return display.getAppVsyncOffsetNanos();
    }

    @NonNull
    public static Renderer.b f(@NonNull Display display, @p0 Renderer.b bVar) {
        if (bVar == null) {
            bVar = new Renderer.b();
        }
        bVar.f104174a = i(display);
        return bVar;
    }

    public static long g(@NonNull Display display) {
        return display.getPresentationDeadlineNanos();
    }

    public static long h(@NonNull Display display) {
        return (long) (1.0E9d / ((double) display.getRefreshRate()));
    }

    public static float i(@NonNull Display display) {
        return display.getRefreshRate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        Renderer renderer = this.f104694d;
        renderer.r(f(this.f104693c, renderer.f()));
    }

    public void b(@NonNull Renderer renderer, @NonNull Display display) {
        if (renderer == this.f104694d && display == this.f104693c) {
            return;
        }
        this.f104694d = renderer;
        this.f104693c = display;
        C0954a c0954a = new C0954a(display);
        this.f104695e = c0954a;
        this.f104692b.registerDisplayListener(c0954a, this.f104691a);
        Handler handler = this.f104691a;
        if (handler != null) {
            handler.post(new b());
        } else {
            j();
        }
    }

    public void c() {
        DisplayManager.DisplayListener displayListener = this.f104695e;
        if (displayListener != null) {
            this.f104692b.unregisterDisplayListener(displayListener);
            this.f104695e = null;
            this.f104693c = null;
            this.f104694d = null;
        }
    }

    public Display e() {
        return this.f104693c;
    }

    protected void finalize() throws Throwable {
        try {
            c();
        } finally {
            super.finalize();
        }
    }

    public a(@NonNull Context context, @NonNull Handler handler) {
        this(context);
        this.f104691a = handler;
    }
}
