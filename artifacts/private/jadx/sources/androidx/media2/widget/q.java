package androidx.media2.widget;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.accessibility.CaptioningManager;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f60175o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f60176p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f60177q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f60178r = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f60179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<f> f60180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<r> f60181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f60182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f60183e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f60184f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @w0(19)
    private CaptioningManager f60185g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @w0(19)
    private CaptioningManager.CaptioningChangeListener f60186h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f60187i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler.Callback f60188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60189k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f60190l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f60191m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f60192n;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                q.this.e();
                return true;
            }
            if (i10 == 2) {
                q.this.b();
                return true;
            }
            if (i10 == 3) {
                q.this.d((r) message.obj);
                return true;
            }
            if (i10 != 4) {
                return false;
            }
            q.this.c();
            return true;
        }
    }

    class b extends CaptioningManager.CaptioningChangeListener {
        b() {
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onEnabledChanged(boolean z10) {
            q.this.o();
        }

        @Override // android.view.accessibility.CaptioningManager.CaptioningChangeListener
        public void onLocaleChanged(Locale locale) {
            q.this.o();
        }
    }

    interface c {
        void a(r.d dVar);

        Looper b();
    }

    interface d {
        void a(r rVar);
    }

    static class e {
        e() {
        }

        static int a(MediaFormat mediaFormat, String str, int i10) {
            try {
                return mediaFormat.getInteger(str);
            } catch (ClassCastException | NullPointerException unused) {
                return i10;
            }
        }
    }

    public static abstract class f {
        @NonNull
        public abstract r a(@NonNull MediaFormat mediaFormat);

        public abstract boolean b(@NonNull MediaFormat mediaFormat);
    }

    q(@NonNull Context context) {
        this(context, null, null);
    }

    private r.d g() {
        r rVar = this.f60184f;
        if (rVar == null) {
            return null;
        }
        return rVar.h();
    }

    private void l(Message message) {
        if (Looper.myLooper() == this.f60187i.getLooper()) {
            this.f60187i.dispatchMessage(message);
        } else {
            this.f60187i.sendMessage(message);
        }
    }

    public r a(MediaFormat mediaFormat) {
        r rVarA;
        synchronized (this.f60182d) {
            try {
                for (f fVar : this.f60180b) {
                    if (fVar.b(mediaFormat) && (rVarA = fVar.a(mediaFormat)) != null) {
                        synchronized (this.f60183e) {
                            try {
                                if (this.f60181c.size() == 0) {
                                    androidx.media2.widget.c.a.a(this.f60185g, this.f60186h);
                                }
                                this.f60181c.add(rVarA);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return rVarA;
                    }
                }
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    void b() {
        this.f60190l = true;
        r rVar = this.f60184f;
        if (rVar != null) {
            rVar.j();
        }
    }

    void c() {
        r rVar;
        if (this.f60189k) {
            if (this.f60190l) {
                return;
            }
            if (androidx.media2.widget.c.a.e(this.f60185g) || !((rVar = this.f60184f) == null || e.a(rVar.g(), "is-forced-subtitle", 0) == 0)) {
                r();
            } else {
                r rVar2 = this.f60184f;
                if (rVar2 != null && rVar2.i() == 4) {
                    k();
                }
            }
            this.f60190l = false;
        }
        r rVarF = f();
        if (rVarF != null) {
            p(rVarF);
            this.f60189k = false;
            if (this.f60190l) {
                return;
            }
            r();
            this.f60190l = false;
        }
    }

    void d(r rVar) {
        this.f60189k = true;
        r rVar2 = this.f60184f;
        if (rVar2 == rVar) {
            return;
        }
        if (rVar2 != null) {
            rVar2.j();
            this.f60184f.p(null);
        }
        this.f60184f = rVar;
        c cVar = this.f60191m;
        if (cVar != null) {
            cVar.a(g());
        }
        r rVar3 = this.f60184f;
        if (rVar3 != null) {
            rVar3.p(this.f60179a);
            this.f60184f.q();
        }
        d dVar = this.f60192n;
        if (dVar != null) {
            dVar.a(rVar);
        }
    }

    void e() {
        this.f60190l = true;
        r rVar = this.f60184f;
        if (rVar != null) {
            rVar.q();
        }
    }

    public r f() {
        r rVar;
        Locale localeC = androidx.media2.widget.c.a.c(this.f60185g);
        Locale locale = localeC == null ? Locale.getDefault() : localeC;
        boolean zE = androidx.media2.widget.c.a.e(this.f60185g);
        synchronized (this.f60183e) {
            try {
                rVar = null;
                int i10 = -1;
                for (r rVar2 : this.f60181c) {
                    MediaFormat mediaFormatG = rVar2.g();
                    String string = mediaFormatG.getString("language");
                    int i11 = 0;
                    int i12 = 1;
                    boolean z10 = e.a(mediaFormatG, "is-forced-subtitle", 0) != 0;
                    boolean z11 = e.a(mediaFormatG, "is-autoselect", 1) != 0;
                    boolean z12 = e.a(mediaFormatG, "is-default", 0) != 0;
                    if (locale != null && !locale.getLanguage().equals("") && !locale.getISO3Language().equals(string) && !locale.getLanguage().equals(string)) {
                        i12 = 0;
                    }
                    int i13 = (z10 ? 0 : 8) + ((localeC == null && z12) ? 4 : 0);
                    if (!z11) {
                        i11 = 2;
                    }
                    int i14 = i13 + i11 + i12;
                    if (zE || z10) {
                        if ((localeC == null && z12) || (i12 != 0 && (z11 || z10 || localeC != null))) {
                            if (i14 > i10) {
                                rVar = rVar2;
                                i10 = i14;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rVar;
    }

    protected void finalize() throws Throwable {
        androidx.media2.widget.c.a.f(this.f60185g, this.f60186h);
        super.finalize();
    }

    public r h() {
        return this.f60184f;
    }

    public r[] i() {
        r[] rVarArr;
        synchronized (this.f60183e) {
            rVarArr = new r[this.f60181c.size()];
            this.f60181c.toArray(rVarArr);
        }
        return rVarArr;
    }

    public boolean j(MediaFormat mediaFormat) {
        synchronized (this.f60182d) {
            try {
                Iterator<f> it = this.f60180b.iterator();
                while (it.hasNext()) {
                    if (it.next().b(mediaFormat)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k() {
        l(this.f60187i.obtainMessage(2));
    }

    public void m(f fVar) {
        synchronized (this.f60182d) {
            try {
                if (!this.f60180b.contains(fVar)) {
                    this.f60180b.add(fVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void n() {
        k();
        p(null);
        this.f60181c.clear();
        this.f60189k = false;
        this.f60190l = false;
        androidx.media2.widget.c.a.f(this.f60185g, this.f60186h);
    }

    public void o() {
        l(this.f60187i.obtainMessage(4));
    }

    public boolean p(r rVar) {
        if (rVar != null && !this.f60181c.contains(rVar)) {
            return false;
        }
        l(this.f60187i.obtainMessage(3, rVar));
        return true;
    }

    public void q(c cVar) {
        c cVar2 = this.f60191m;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 != null) {
            cVar2.a(null);
        }
        this.f60191m = cVar;
        this.f60187i = null;
        if (cVar != null) {
            this.f60187i = new Handler(this.f60191m.b(), this.f60188j);
            this.f60191m.a(g());
        }
    }

    public void r() {
        l(this.f60187i.obtainMessage(1));
    }

    q(@NonNull Context context, @p0 j jVar, @p0 d dVar) {
        this.f60182d = new Object();
        this.f60183e = new Object();
        this.f60188j = new a();
        this.f60189k = false;
        this.f60190l = false;
        this.f60179a = jVar;
        this.f60192n = dVar;
        this.f60180b = new ArrayList<>();
        this.f60181c = new ArrayList<>();
        this.f60185g = (CaptioningManager) context.getSystemService("captioning");
        this.f60186h = new b();
    }
}
