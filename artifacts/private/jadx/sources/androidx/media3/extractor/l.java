package androidx.media3.extractor;

import android.net.Uri;
import androidx.media3.common.util.b1;
import com.google.common.collect.l6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class l implements w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[] f67443s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a f67444t = new a(new a.InterfaceC0607a() { // from class: androidx.media3.extractor.j
        @Override // androidx.media3.extractor.l.a.InterfaceC0607a
        public final Constructor a() {
            return l.l();
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final a f67445u = new a(new a.InterfaceC0607a() { // from class: androidx.media3.extractor.k
        @Override // androidx.media3.extractor.l.a.InterfaceC0607a
        public final Constructor a() {
            return l.m();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f67446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f67447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f67448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f67450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f67451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f67452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f67453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f67454j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f67456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private l6<androidx.media3.common.w> f67457m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f67461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f67462r;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f67455k = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f67458n = androidx.media3.extractor.ts.l0.E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private androidx.media3.extractor.text.r.a f67460p = new androidx.media3.extractor.text.g();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f67459o = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0607a f67463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f67464b = new AtomicBoolean(false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.b0("extensionLoaded")
        @androidx.annotation.p0
        private Constructor<? extends r> f67465c;

        /* JADX INFO: renamed from: androidx.media3.extractor.l$a$a, reason: collision with other inner class name */
        public interface InterfaceC0607a {
            @androidx.annotation.p0
            Constructor<? extends r> a() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public a(InterfaceC0607a interfaceC0607a) {
            this.f67463a = interfaceC0607a;
        }

        @androidx.annotation.p0
        private Constructor<? extends r> b() {
            synchronized (this.f67464b) {
                try {
                    if (this.f67464b.get()) {
                        return this.f67465c;
                    }
                    try {
                        try {
                            return this.f67463a.a();
                        } catch (ClassNotFoundException unused) {
                            this.f67464b.set(true);
                            return this.f67465c;
                        }
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @androidx.annotation.p0
        public r a(Object... objArr) {
            Constructor<? extends r> constructorB = b();
            if (constructorB == null) {
                return null;
            }
            try {
                return constructorB.newInstance(objArr);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating extractor", e10);
            }
        }
    }

    private void i(int i10, List<r> list) {
        int i11 = 2;
        switch (i10) {
            case 0:
                list.add(new androidx.media3.extractor.ts.b());
                break;
            case 1:
                list.add(new androidx.media3.extractor.ts.e());
                break;
            case 2:
                list.add(new androidx.media3.extractor.ts.h(((this.f67448d | (this.f67446b ? 1 : 0)) == true ? 1 : 0) | (this.f67447c ? 2 : 0)));
                break;
            case 3:
                int i12 = this.f67449e | (this.f67446b ? 1 : 0);
                if (!this.f67447c) {
                    i11 = 0;
                }
                list.add(new androidx.media3.extractor.amr.b(i12 | i11));
                break;
            case 4:
                r rVarA = f67444t.a(Integer.valueOf(this.f67450f));
                if (rVarA == null) {
                    list.add(new androidx.media3.extractor.flac.e(this.f67450f));
                } else {
                    list.add(rVarA);
                }
                break;
            case 5:
                list.add(new androidx.media3.extractor.flv.c());
                break;
            case 6:
                list.add(new androidx.media3.extractor.mkv.f(this.f67460p, this.f67451g | (this.f67459o ? 0 : 2)));
                break;
            case 7:
                int i13 = this.f67454j | (this.f67446b ? 1 : 0);
                if (!this.f67447c) {
                    i11 = 0;
                }
                list.add(new androidx.media3.extractor.mp3.f(i13 | i11));
                break;
            case 8:
                list.add(new androidx.media3.extractor.mp4.i(this.f67460p, this.f67453i | androidx.media3.extractor.mp4.i.l(this.f67461q) | (this.f67459o ? 0 : 32)));
                list.add(new androidx.media3.extractor.mp4.p(this.f67460p, this.f67452h | androidx.media3.extractor.mp4.p.p(this.f67461q) | (this.f67459o ? 0 : 16)));
                break;
            case 9:
                list.add(new androidx.media3.extractor.ogg.d());
                break;
            case 10:
                list.add(new androidx.media3.extractor.ts.c0());
                break;
            case 11:
                if (this.f67457m == null) {
                    this.f67457m = l6.F();
                }
                list.add(new androidx.media3.extractor.ts.l0(this.f67455k, !this.f67459o ? 1 : 0, this.f67460p, new androidx.media3.common.util.w0(0L), new androidx.media3.extractor.ts.j(this.f67456l, this.f67457m), this.f67458n));
                break;
            case 12:
                list.add(new androidx.media3.extractor.wav.b());
                break;
            case 14:
                list.add(new androidx.media3.extractor.jpeg.a(this.f67462r));
                break;
            case 15:
                r rVarA2 = f67445u.a(new Object[0]);
                if (rVarA2 != null) {
                    list.add(rVarA2);
                }
                break;
            case 16:
                list.add(new androidx.media3.extractor.avi.b(!this.f67459o ? 1 : 0, this.f67460p));
                break;
            case 17:
                list.add(new androidx.media3.extractor.png.a());
                break;
            case 18:
                list.add(new androidx.media3.extractor.webp.a());
                break;
            case 19:
                list.add(new androidx.media3.extractor.bmp.a());
                break;
            case 20:
                int i14 = this.f67452h;
                if ((i14 & 2) == 0 && (i14 & 4) == 0) {
                    list.add(new androidx.media3.extractor.heif.a());
                    break;
                }
                break;
            case 21:
                list.add(new androidx.media3.extractor.avif.a());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.p0
    public static Constructor<? extends r> l() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(r.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends r> m() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(r.class).getConstructor(null);
    }

    @z7.a
    public synchronized l A(int i10) {
        try {
            this.f67455k = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l B(int i10) {
        try {
            this.f67458n = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l C(List<androidx.media3.common.w> list) {
        try {
            this.f67457m = l6.w(list);
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // androidx.media3.extractor.w
    public synchronized r[] c() {
        return e(Uri.EMPTY, new HashMap());
    }

    @Override // androidx.media3.extractor.w
    public synchronized r[] e(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        try {
            int[] iArr = f67443s;
            arrayList = new ArrayList(iArr.length);
            int iB = androidx.media3.common.r.b(map);
            if (iB != -1) {
                i(iB, arrayList);
            }
            int iC = androidx.media3.common.r.c(uri);
            if (iC != -1 && iC != iB) {
                i(iC, arrayList);
            }
            for (int i10 : iArr) {
                if (i10 != iB && i10 != iC) {
                    i(i10, arrayList);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (r[]) arrayList.toArray(new r[arrayList.size()]);
    }

    @Override // androidx.media3.extractor.w
    @z7.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public synchronized l b(int i10) {
        try {
            this.f67461q = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // androidx.media3.extractor.w
    @Deprecated
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public synchronized l d(boolean z10) {
        this.f67459o = z10;
        return this;
    }

    @z7.a
    public synchronized l n(int i10) {
        this.f67448d = i10;
        return this;
    }

    @z7.a
    public synchronized l o(int i10) {
        try {
            this.f67449e = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l p(boolean z10) {
        this.f67447c = z10;
        return this;
    }

    @z7.a
    public synchronized l q(boolean z10) {
        this.f67446b = z10;
        return this;
    }

    @z7.a
    public synchronized l r(int i10) {
        try {
            this.f67450f = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l s(int i10) {
        try {
            this.f67453i = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l t(int i10) {
        try {
            this.f67462r = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l u(int i10) {
        try {
            this.f67451g = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l v(int i10) {
        try {
            this.f67454j = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    public synchronized l w(int i10) {
        try {
            this.f67452h = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @Override // androidx.media3.extractor.w
    @z7.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public synchronized l a(androidx.media3.extractor.text.r.a aVar) {
        try {
            this.f67460p = aVar;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }

    @z7.a
    @Deprecated
    public synchronized l y(boolean z10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return d(z10);
    }

    @z7.a
    public synchronized l z(int i10) {
        try {
            this.f67456l = i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
