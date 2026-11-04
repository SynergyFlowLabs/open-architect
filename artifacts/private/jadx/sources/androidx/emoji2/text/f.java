package androidx.emoji2.text;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import androidx.annotation.b0;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.d
public class f {
    public static final int A = 1;
    public static final int B = 2;

    @b1({b1.a.LIBRARY})
    static final int C = Integer.MAX_VALUE;
    private static final Object D = new Object();
    private static final Object E = new Object();

    @b0("INSTANCE_LOCK")
    @p0
    private static volatile f F = null;

    @b0("CONFIG_LOCK")
    private static volatile boolean G = false;
    private static final String H = "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f51063o = "android.support.text.emoji.emojiCompat_metadataVersion";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f51064p = "android.support.text.emoji.emojiCompat_replaceAll";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f51065q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f51066r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f51067s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f51068t = 2;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f51069u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f51070v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f51071w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f51072x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f51073y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f51074z = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @b0("mInitLock")
    private final Set<g> f51076b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private final c f51079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    final j f51080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final m f51081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f51082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f51083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    final int[] f51084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f51085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f51086l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f51087m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0462f f51088n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final ReadWriteLock f51075a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("mInitLock")
    private volatile int f51077c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private final Handler f51078d = new Handler(Looper.getMainLooper());

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface a {
    }

    @w0(19)
    private static final class b extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.j f51089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile p f51090c;

        class a extends k {
            a() {
            }

            @Override // androidx.emoji2.text.f.k
            public void a(@p0 Throwable th2) {
                b.this.f51092a.v(th2);
            }

            @Override // androidx.emoji2.text.f.k
            public void b(@NonNull p pVar) {
                b.this.j(pVar);
            }
        }

        b(f fVar) {
            super(fVar);
        }

        @Override // androidx.emoji2.text.f.c
        String a() {
            String strN = this.f51090c.g().N();
            return strN == null ? "" : strN;
        }

        @Override // androidx.emoji2.text.f.c
        int b(@NonNull CharSequence charSequence, int i10) {
            return this.f51089b.b(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.c
        public int c(CharSequence charSequence, int i10) {
            return this.f51089b.d(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.c
        int d(@NonNull CharSequence charSequence, int i10) {
            return this.f51089b.e(charSequence, i10);
        }

        @Override // androidx.emoji2.text.f.c
        boolean e(@NonNull CharSequence charSequence) {
            return this.f51089b.c(charSequence) == 1;
        }

        @Override // androidx.emoji2.text.f.c
        boolean f(@NonNull CharSequence charSequence, int i10) {
            return this.f51089b.d(charSequence, i10) == 1;
        }

        @Override // androidx.emoji2.text.f.c
        void g() {
            try {
                this.f51092a.f51080f.a(new a());
            } catch (Throwable th2) {
                this.f51092a.v(th2);
            }
        }

        @Override // androidx.emoji2.text.f.c
        CharSequence h(@NonNull CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            return this.f51089b.l(charSequence, i10, i11, i12, z10);
        }

        @Override // androidx.emoji2.text.f.c
        void i(@NonNull EditorInfo editorInfo) {
            editorInfo.extras.putInt(f.f51063o, this.f51090c.h());
            editorInfo.extras.putBoolean(f.f51064p, this.f51092a.f51082h);
        }

        void j(@NonNull p pVar) {
            if (pVar == null) {
                this.f51092a.v(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f51090c = pVar;
            p pVar2 = this.f51090c;
            m mVar = this.f51092a.f51081g;
            InterfaceC0462f interfaceC0462f = this.f51092a.f51088n;
            f fVar = this.f51092a;
            this.f51089b = new androidx.emoji2.text.j(pVar2, mVar, interfaceC0462f, fVar.f51083i, fVar.f51084j, androidx.emoji2.text.i.a());
            this.f51092a.w();
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final f f51092a;

        c(f fVar) {
            this.f51092a = fVar;
        }

        String a() {
            return "";
        }

        int b(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
            return -1;
        }

        public int c(CharSequence charSequence, int i10) {
            return 0;
        }

        int d(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
            return -1;
        }

        boolean e(@NonNull CharSequence charSequence) {
            return false;
        }

        boolean f(@NonNull CharSequence charSequence, int i10) {
            return false;
        }

        void g() {
            this.f51092a.w();
        }

        CharSequence h(@NonNull CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, boolean z10) {
            return charSequence;
        }

        void i(@NonNull EditorInfo editorInfo) {
        }
    }

    public static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        final j f51093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        m f51094b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f51095c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f51096d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @p0
        int[] f51097e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @p0
        Set<g> f51098f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f51099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f51100h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f51101i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        InterfaceC0462f f51102j = new androidx.emoji2.text.e();

        protected d(@NonNull j jVar) {
            androidx.core.util.t.m(jVar, "metadataLoader cannot be null.");
            this.f51093a = jVar;
        }

        @NonNull
        protected final j a() {
            return this.f51093a;
        }

        @NonNull
        public d b(@NonNull g gVar) {
            androidx.core.util.t.m(gVar, "initCallback cannot be null");
            if (this.f51098f == null) {
                this.f51098f = new androidx.collection.c();
            }
            this.f51098f.add(gVar);
            return this;
        }

        @NonNull
        public d c(@androidx.annotation.l int i10) {
            this.f51100h = i10;
            return this;
        }

        @NonNull
        public d d(boolean z10) {
            this.f51099g = z10;
            return this;
        }

        @NonNull
        public d e(@NonNull InterfaceC0462f interfaceC0462f) {
            androidx.core.util.t.m(interfaceC0462f, "GlyphChecker cannot be null");
            this.f51102j = interfaceC0462f;
            return this;
        }

        @NonNull
        public d f(int i10) {
            this.f51101i = i10;
            return this;
        }

        @NonNull
        public d g(boolean z10) {
            this.f51095c = z10;
            return this;
        }

        @NonNull
        public d h(@NonNull m mVar) {
            this.f51094b = mVar;
            return this;
        }

        @NonNull
        public d i(boolean z10) {
            return j(z10, null);
        }

        @NonNull
        public d j(boolean z10, @p0 List<Integer> list) {
            this.f51096d = z10;
            if (!z10 || list == null) {
                this.f51097e = null;
                return this;
            }
            this.f51097e = new int[list.size()];
            Iterator<Integer> it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                this.f51097e[i10] = it.next().intValue();
                i10++;
            }
            Arrays.sort(this.f51097e);
            return this;
        }

        @NonNull
        public d k(@NonNull g gVar) {
            androidx.core.util.t.m(gVar, "initCallback cannot be null");
            Set<g> set = this.f51098f;
            if (set != null) {
                set.remove(gVar);
            }
            return this;
        }
    }

    @b1({b1.a.LIBRARY})
    public static class e implements m {
        @Override // androidx.emoji2.text.f.m
        @NonNull
        @w0(19)
        public androidx.emoji2.text.k a(@NonNull r rVar) {
            return new s(rVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.f$f, reason: collision with other inner class name */
    public interface InterfaceC0462f {
        boolean a(@NonNull CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12);
    }

    public static abstract class g {
        public void a(@p0 Throwable th2) {
        }

        public void b() {
        }
    }

    private static class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<g> f51103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f51104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f51105c;

        h(@NonNull g gVar, int i10) {
            this(Arrays.asList((g) androidx.core.util.t.m(gVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f51103a.size();
            int i10 = 0;
            if (this.f51105c != 1) {
                while (i10 < size) {
                    this.f51103a.get(i10).a(this.f51104b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    this.f51103a.get(i10).b();
                    i10++;
                }
            }
        }

        h(@NonNull Collection<g> collection, int i10) {
            this(collection, i10, null);
        }

        h(@NonNull Collection<g> collection, int i10, @p0 Throwable th2) {
            androidx.core.util.t.m(collection, "initCallbacks cannot be null");
            this.f51103a = new ArrayList(collection);
            this.f51105c = i10;
            this.f51104b = th2;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface i {
    }

    public interface j {
        void a(@NonNull k kVar);
    }

    public static abstract class k {
        public abstract void a(@p0 Throwable th2);

        public abstract void b(@NonNull p pVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY})
    public @interface l {
    }

    public interface m {
        @NonNull
        @w0(19)
        androidx.emoji2.text.k a(@NonNull r rVar);
    }

    private f(@NonNull d dVar) {
        this.f51082h = dVar.f51095c;
        this.f51083i = dVar.f51096d;
        this.f51084j = dVar.f51097e;
        this.f51085k = dVar.f51099g;
        this.f51086l = dVar.f51100h;
        this.f51080f = dVar.f51093a;
        this.f51087m = dVar.f51101i;
        this.f51088n = dVar.f51102j;
        androidx.collection.c cVar = new androidx.collection.c();
        this.f51076b = cVar;
        m mVar = dVar.f51094b;
        this.f51081g = mVar == null ? new e() : mVar;
        Set<g> set = dVar.f51098f;
        if (set != null && !set.isEmpty()) {
            cVar.addAll(dVar.f51098f);
        }
        this.f51079e = new b(this);
        u();
    }

    @NonNull
    @b1({b1.a.LIBRARY})
    public static f C(@NonNull d dVar) {
        f fVar;
        synchronized (D) {
            fVar = new f(dVar);
            F = fVar;
        }
        return fVar;
    }

    @l1
    @b1({b1.a.LIBRARY})
    @p0
    public static f D(@p0 f fVar) {
        f fVar2;
        synchronized (D) {
            try {
                F = fVar;
                fVar2 = F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar2;
    }

    @l1
    @b1({b1.a.LIBRARY})
    public static void E(boolean z10) {
        synchronized (E) {
            try {
                G = z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static f c() {
        f fVar;
        synchronized (D) {
            try {
                fVar = F;
                androidx.core.util.t.o(fVar != null, H);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static boolean j(@NonNull InputConnection inputConnection, @NonNull Editable editable, @g0(from = 0) int i10, @g0(from = 0) int i11, boolean z10) {
        return androidx.emoji2.text.j.f(inputConnection, editable, i10, i11, z10);
    }

    public static boolean k(@NonNull Editable editable, int i10, @NonNull KeyEvent keyEvent) {
        return androidx.emoji2.text.j.g(editable, i10, keyEvent);
    }

    @p0
    public static f n(@NonNull Context context) {
        return o(context, null);
    }

    @b1({b1.a.LIBRARY})
    @p0
    public static f o(@NonNull Context context, @p0 androidx.emoji2.text.d.a aVar) {
        f fVar;
        if (G) {
            return F;
        }
        if (aVar == null) {
            aVar = new androidx.emoji2.text.d.a(null);
        }
        d dVarC = aVar.c(context);
        synchronized (E) {
            try {
                if (!G) {
                    if (dVarC != null) {
                        p(dVarC);
                    }
                    G = true;
                }
                fVar = F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    @NonNull
    public static f p(@NonNull d dVar) {
        f fVar;
        f fVar2 = F;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (D) {
            try {
                fVar = F;
                if (fVar == null) {
                    fVar = new f(dVar);
                    F = fVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static boolean q() {
        return F != null;
    }

    private boolean s() {
        return i() == 1;
    }

    private void u() {
        this.f51075a.writeLock().lock();
        try {
            if (this.f51087m == 0) {
                this.f51077c = 0;
            }
            this.f51075a.writeLock().unlock();
            if (i() == 0) {
                this.f51079e.g();
            }
        } catch (Throwable th2) {
            this.f51075a.writeLock().unlock();
            throw th2;
        }
    }

    @androidx.annotation.j
    @p0
    public CharSequence A(@p0 CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, int i13) {
        boolean z10;
        androidx.core.util.t.o(s(), "Not initialized yet");
        androidx.core.util.t.j(i10, "start cannot be negative");
        androidx.core.util.t.j(i11, "end cannot be negative");
        androidx.core.util.t.j(i12, "maxEmojiCount cannot be negative");
        androidx.core.util.t.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        androidx.core.util.t.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        androidx.core.util.t.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z10 = i13 != 2 ? this.f51082h : false;
        } else {
            z10 = true;
        }
        return this.f51079e.h(charSequence, i10, i11, i12, z10);
    }

    public void B(@NonNull g gVar) {
        androidx.core.util.t.m(gVar, "initCallback cannot be null");
        this.f51075a.writeLock().lock();
        try {
            if (this.f51077c == 1 || this.f51077c == 2) {
                this.f51078d.post(new h(gVar, this.f51077c));
            } else {
                this.f51076b.add(gVar);
            }
            Lock lockWriteLock = this.f51075a.writeLock();
        } finally {
            this.f51075a.writeLock().unlock();
        }
    }

    public void F(@NonNull g gVar) {
        androidx.core.util.t.m(gVar, "initCallback cannot be null");
        this.f51075a.writeLock().lock();
        try {
            this.f51076b.remove(gVar);
            this.f51075a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f51075a.writeLock().unlock();
            throw th2;
        }
    }

    public void G(@NonNull EditorInfo editorInfo) {
        if (s() && editorInfo != null) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            this.f51079e.i(editorInfo);
        }
    }

    @NonNull
    public String d() {
        androidx.core.util.t.o(s(), "Not initialized yet");
        return this.f51079e.a();
    }

    public int e(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
        androidx.core.util.t.o(s(), "Not initialized yet");
        androidx.core.util.t.m(charSequence, "charSequence cannot be null");
        return this.f51079e.b(charSequence, i10);
    }

    public int f(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
        androidx.core.util.t.o(s(), "Not initialized yet");
        androidx.core.util.t.m(charSequence, "sequence cannot be null");
        return this.f51079e.c(charSequence, i10);
    }

    @androidx.annotation.l
    @b1({b1.a.LIBRARY_GROUP})
    public int g() {
        return this.f51086l;
    }

    public int h(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
        androidx.core.util.t.o(s(), "Not initialized yet");
        androidx.core.util.t.m(charSequence, "charSequence cannot be null");
        return this.f51079e.d(charSequence, i10);
    }

    public int i() {
        this.f51075a.readLock().lock();
        try {
            int i10 = this.f51077c;
            this.f51075a.readLock().unlock();
            return i10;
        } catch (Throwable th2) {
            this.f51075a.readLock().unlock();
            throw th2;
        }
    }

    @Deprecated
    public boolean l(@NonNull CharSequence charSequence) {
        androidx.core.util.t.o(s(), "Not initialized yet");
        androidx.core.util.t.m(charSequence, "sequence cannot be null");
        return this.f51079e.e(charSequence);
    }

    @Deprecated
    public boolean m(@NonNull CharSequence charSequence, @g0(from = 0) int i10) {
        androidx.core.util.t.o(s(), "Not initialized yet");
        androidx.core.util.t.m(charSequence, "sequence cannot be null");
        return this.f51079e.f(charSequence, i10);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean r() {
        return this.f51085k;
    }

    public void t() {
        boolean z10 = true;
        if (this.f51087m != 1) {
            z10 = false;
        }
        androidx.core.util.t.o(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (s()) {
            return;
        }
        this.f51075a.writeLock().lock();
        try {
            if (this.f51077c == 0) {
                this.f51075a.writeLock().unlock();
                return;
            }
            this.f51077c = 0;
            this.f51075a.writeLock().unlock();
            this.f51079e.g();
        } catch (Throwable th2) {
            this.f51075a.writeLock().unlock();
            throw th2;
        }
    }

    void v(@p0 Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f51075a.writeLock().lock();
        try {
            this.f51077c = 2;
            arrayList.addAll(this.f51076b);
            this.f51076b.clear();
            this.f51075a.writeLock().unlock();
            this.f51078d.post(new h(arrayList, this.f51077c, th2));
        } catch (Throwable th3) {
            this.f51075a.writeLock().unlock();
            throw th3;
        }
    }

    void w() {
        ArrayList arrayList = new ArrayList();
        this.f51075a.writeLock().lock();
        try {
            this.f51077c = 1;
            arrayList.addAll(this.f51076b);
            this.f51076b.clear();
            this.f51075a.writeLock().unlock();
            this.f51078d.post(new h(arrayList, this.f51077c));
        } catch (Throwable th2) {
            this.f51075a.writeLock().unlock();
            throw th2;
        }
    }

    @androidx.annotation.j
    @p0
    public CharSequence x(@p0 CharSequence charSequence) {
        return y(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    @androidx.annotation.j
    @p0
    public CharSequence y(@p0 CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11) {
        return z(charSequence, i10, i11, Integer.MAX_VALUE);
    }

    @androidx.annotation.j
    @p0
    public CharSequence z(@p0 CharSequence charSequence, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12) {
        return A(charSequence, i10, i11, i12, 0);
    }
}
