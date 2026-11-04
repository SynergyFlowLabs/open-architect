package androidx.media3.datasource.cache;

import android.os.ConditionVariable;
import androidx.annotation.m1;
import androidx.annotation.p0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;
import androidx.media3.common.util.z;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t implements androidx.media3.datasource.cache.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f62440m = "SimpleCache";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f62441n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f62442o = ".uid";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final HashSet<File> f62443p = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f62444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f62445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f62446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final f f62447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, ArrayList<androidx.media3.datasource.cache.a.b>> f62448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f62449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f62450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f62451i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f62452j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f62453k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.media3.datasource.cache.a.C0574a f62454l;

    class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f62455a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f62455a = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (t.this) {
                try {
                    this.f62455a.open();
                    t.this.A();
                    t.this.f62445c.c();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Deprecated
    public t(File file, d dVar) {
        this(file, dVar, null, null, false, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        if (!this.f62444b.exists()) {
            try {
                w(this.f62444b);
            } catch (androidx.media3.datasource.cache.a.C0574a e10) {
                this.f62454l = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f62444b.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + this.f62444b;
            z.d(f62440m, str);
            this.f62454l = new androidx.media3.datasource.cache.a.C0574a(str);
            return;
        }
        long jD = D(fileArrListFiles);
        this.f62451i = jD;
        if (jD == -1) {
            try {
                this.f62451i = x(this.f62444b);
            } catch (IOException e11) {
                String str2 = "Failed to create cache UID: " + this.f62444b;
                z.e(f62440m, str2, e11);
                this.f62454l = new androidx.media3.datasource.cache.a.C0574a(str2, e11);
                return;
            }
        }
        try {
            this.f62446d.n(this.f62451i);
            f fVar = this.f62447e;
            if (fVar != null) {
                fVar.f(this.f62451i);
                Map<String, e> mapC = this.f62447e.c();
                C(this.f62444b, true, fileArrListFiles, mapC);
                this.f62447e.h(mapC.keySet());
            } else {
                C(this.f62444b, true, fileArrListFiles, null);
            }
            this.f62446d.r();
            try {
                this.f62446d.s();
            } catch (IOException e12) {
                z.e(f62440m, "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String str3 = "Failed to initialize cache indices: " + this.f62444b;
            z.e(f62440m, str3, e13);
            this.f62454l = new androidx.media3.datasource.cache.a.C0574a(str3, e13);
        }
    }

    public static synchronized boolean B(File file) {
        return f62443p.contains(file.getAbsoluteFile());
    }

    private void C(File file, boolean z10, @p0 File[] fileArr, @p0 Map<String, e> map) {
        long j10;
        long j11;
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                C(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!l.o(name) && !name.endsWith(f62442o))) {
                e eVarRemove = map != null ? map.remove(name) : null;
                if (eVarRemove != null) {
                    j10 = eVarRemove.f62354a;
                    j11 = eVarRemove.f62355b;
                } else {
                    j10 = -1;
                    j11 = -9223372036854775807L;
                }
                u uVarO = u.o(file2, j10, j11, this.f62446d);
                if (uVarO != null) {
                    u(uVarO);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long D(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(f62442o)) {
                try {
                    return I(name);
                } catch (NumberFormatException unused) {
                    z.d(f62440m, "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private static synchronized boolean E(File file) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return f62443p.add(file.getAbsoluteFile());
    }

    private void F(u uVar) {
        ArrayList<androidx.media3.datasource.cache.a.b> arrayList = this.f62448f.get(uVar.f62370a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).e(this, uVar);
                }
            }
        }
        this.f62445c.e(this, uVar);
    }

    private void G(i iVar) {
        ArrayList<androidx.media3.datasource.cache.a.b> arrayList = this.f62448f.get(iVar.f62370a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).f(this, iVar);
            }
        }
        this.f62445c.f(this, iVar);
    }

    private void H(u uVar, i iVar) {
        ArrayList<androidx.media3.datasource.cache.a.b> arrayList = this.f62448f.get(uVar.f62370a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).d(this, uVar, iVar);
            }
        }
        this.f62445c.d(this, uVar, iVar);
    }

    private static long I(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void J(i iVar) {
        k kVarG = this.f62446d.g(iVar.f62370a);
        if (kVarG == null || !kVarG.k(iVar)) {
            return;
        }
        this.f62452j -= iVar.f62372c;
        if (this.f62447e != null) {
            String name = ((File) androidx.media3.common.util.a.g(iVar.f62374e)).getName();
            try {
                this.f62447e.g(name);
            } catch (IOException unused) {
                z.n(f62440m, "Failed to remove file index entry for: " + name);
            }
        }
        this.f62446d.p(kVarG.f62389b);
        G(iVar);
    }

    private void K() {
        ArrayList arrayList = new ArrayList();
        Iterator<k> it = this.f62446d.h().iterator();
        while (it.hasNext()) {
            for (u uVar : it.next().f()) {
                if (((File) androidx.media3.common.util.a.g(uVar.f62374e)).length() != uVar.f62372c) {
                    arrayList.add(uVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            J((i) arrayList.get(i10));
        }
    }

    private u L(String str, u uVar) {
        boolean z10;
        if (!this.f62450h) {
            return uVar;
        }
        String name = ((File) androidx.media3.common.util.a.g(uVar.f62374e)).getName();
        long j10 = uVar.f62372c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        f fVar = this.f62447e;
        if (fVar != null) {
            try {
                fVar.i(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                z.n(f62440m, "Failed to update index with new touch timestamp.");
            }
            z10 = false;
        } else {
            z10 = true;
        }
        u uVarL = ((k) androidx.media3.common.util.a.g(this.f62446d.g(str))).l(uVar, jCurrentTimeMillis, z10);
        H(uVar, uVarL);
        return uVarL;
    }

    private static synchronized void M(File file) {
        try {
            f62443p.remove(file.getAbsoluteFile());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void u(u uVar) {
        this.f62446d.m(uVar.f62370a).a(uVar);
        this.f62452j += uVar.f62372c;
        F(uVar);
    }

    private static void w(File file) throws androidx.media3.datasource.cache.a.C0574a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        z.d(f62440m, str);
        throw new androidx.media3.datasource.cache.a.C0574a(str);
    }

    private static long x(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, Long.toString(jAbs, 16) + f62442o);
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @m1
    public static void y(File file, @p0 androidx.media3.database.b bVar) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (bVar != null) {
                long jD = D(fileArrListFiles);
                if (jD != -1) {
                    try {
                        f.a(bVar, jD);
                    } catch (androidx.media3.database.a unused) {
                        z.n(f62440m, "Failed to delete file metadata: " + jD);
                    }
                    try {
                        l.f(bVar, jD);
                    } catch (androidx.media3.database.a unused2) {
                        z.n(f62440m, "Failed to delete file metadata: " + jD);
                    }
                }
            }
            k1.R1(file);
        }
    }

    private u z(String str, long j10, long j11) {
        u uVarE;
        k kVarG = this.f62446d.g(str);
        if (kVarG == null) {
            return u.q(str, j10, j11);
        }
        while (true) {
            uVarE = kVarG.e(j10, j11);
            if (!uVarE.f62373d || ((File) androidx.media3.common.util.a.g(uVarE.f62374e)).length() == uVarE.f62372c) {
                break;
            }
            K();
        }
        return uVarE;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized long a() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f62451i;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized m b(String str) {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f62446d.i(str);
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void c(i iVar) {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            J(iVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized NavigableSet<i> d(String str, androidx.media3.datasource.cache.a.b bVar) {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            androidx.media3.common.util.a.g(str);
            androidx.media3.common.util.a.g(bVar);
            ArrayList<androidx.media3.datasource.cache.a.b> arrayList = this.f62448f.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f62448f.put(str, arrayList);
            }
            arrayList.add(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
        return q(str);
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized i e(String str, long j10, long j11) throws InterruptedException, androidx.media3.datasource.cache.a.C0574a {
        i iVarK;
        androidx.media3.common.util.a.i(!this.f62453k);
        v();
        while (true) {
            iVarK = k(str, j10, j11);
            if (iVarK == null) {
                wait();
            }
        }
        return iVarK;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void f(String str) {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            Iterator<i> it = q(str).iterator();
            while (it.hasNext()) {
                J(it.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized boolean g(String str, long j10, long j11) {
        k kVarG;
        androidx.media3.common.util.a.i(!this.f62453k);
        kVarG = this.f62446d.g(str);
        return kVarG != null && kVarG.c(j10, j11) >= j11;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized File h(String str, long j10, long j11) throws Throwable {
        Throwable th2;
        try {
            try {
                androidx.media3.common.util.a.i(!this.f62453k);
                v();
                k kVarG = this.f62446d.g(str);
                androidx.media3.common.util.a.g(kVarG);
                androidx.media3.common.util.a.i(kVarG.h(j10, j11));
                if (!this.f62444b.exists()) {
                    try {
                        w(this.f62444b);
                        K();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f62445c.b(this, str, j10, j11);
                File file = new File(this.f62444b, Integer.toString(this.f62449g.nextInt(10)));
                if (!file.exists()) {
                    w(file);
                }
                return u.s(file, kVarG.f62388a, j10, System.currentTimeMillis());
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized long i(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j11 + j10;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        j12 = 0;
        while (j10 < j14) {
            try {
                long jL = l(str, j10, j14 - j10);
                if (jL > 0) {
                    j12 += jL;
                } else {
                    jL = -jL;
                }
                j10 += jL;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j12;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void j(String str, androidx.media3.datasource.cache.a.b bVar) {
        try {
            if (this.f62453k) {
                return;
            }
            ArrayList<androidx.media3.datasource.cache.a.b> arrayList = this.f62448f.get(str);
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.isEmpty()) {
                    this.f62448f.remove(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    @p0
    public synchronized i k(String str, long j10, long j11) throws androidx.media3.datasource.cache.a.C0574a {
        androidx.media3.common.util.a.i(!this.f62453k);
        v();
        u uVarZ = z(str, j10, j11);
        if (uVarZ.f62373d) {
            return L(str, uVarZ);
        }
        if (this.f62446d.m(str).j(j10, uVarZ.f62372c)) {
            return uVarZ;
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized long l(String str, long j10, long j11) {
        k kVarG;
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            if (j11 == -1) {
                j11 = Long.MAX_VALUE;
            }
            kVarG = this.f62446d.g(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return kVarG != null ? kVarG.c(j10, j11) : -j11;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized long m() {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
        } finally {
        }
        return this.f62452j;
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void n(i iVar) {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            k kVar = (k) androidx.media3.common.util.a.g(this.f62446d.g(iVar.f62370a));
            kVar.m(iVar.f62371b);
            this.f62446d.p(kVar.f62389b);
            notifyAll();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void o(File file, long j10) throws androidx.media3.datasource.cache.a.C0574a {
        try {
            boolean z10 = true;
            androidx.media3.common.util.a.i(!this.f62453k);
            if (file.exists()) {
                if (j10 == 0) {
                    file.delete();
                    return;
                }
                u uVar = (u) androidx.media3.common.util.a.g(u.p(file, j10, this.f62446d));
                k kVar = (k) androidx.media3.common.util.a.g(this.f62446d.g(uVar.f62370a));
                androidx.media3.common.util.a.i(kVar.h(uVar.f62371b, uVar.f62372c));
                long jF = m.f(kVar.d());
                if (jF != -1) {
                    if (uVar.f62371b + uVar.f62372c > jF) {
                        z10 = false;
                    }
                    androidx.media3.common.util.a.i(z10);
                }
                if (this.f62447e != null) {
                    try {
                        this.f62447e.i(file.getName(), uVar.f62372c, uVar.f62375f);
                    } catch (IOException e10) {
                        throw new androidx.media3.datasource.cache.a.C0574a(e10);
                    }
                }
                u(uVar);
                try {
                    this.f62446d.s();
                    notifyAll();
                } catch (IOException e11) {
                    throw new androidx.media3.datasource.cache.a.C0574a(e11);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void p(String str, n nVar) throws androidx.media3.datasource.cache.a.C0574a {
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            v();
            this.f62446d.d(str, nVar);
            try {
                this.f62446d.s();
            } catch (IOException e10) {
                throw new androidx.media3.datasource.cache.a.C0574a(e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized NavigableSet<i> q(String str) {
        k kVarG;
        try {
            androidx.media3.common.util.a.i(!this.f62453k);
            kVarG = this.f62446d.g(str);
        } catch (Throwable th2) {
            throw th2;
        }
        return (kVarG == null || kVarG.g()) ? new TreeSet() : new TreeSet((Collection) kVarG.f());
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized Set<String> r() {
        androidx.media3.common.util.a.i(!this.f62453k);
        return new HashSet(this.f62446d.k());
    }

    @Override // androidx.media3.datasource.cache.a
    public synchronized void release() {
        if (this.f62453k) {
            return;
        }
        this.f62448f.clear();
        K();
        try {
            try {
                this.f62446d.s();
                M(this.f62444b);
            } catch (Throwable th2) {
                M(this.f62444b);
                this.f62453k = true;
                throw th2;
            }
        } catch (IOException e10) {
            z.e(f62440m, "Storing index file failed", e10);
            M(this.f62444b);
        }
        this.f62453k = true;
    }

    public synchronized void v() throws androidx.media3.datasource.cache.a.C0574a {
        try {
            androidx.media3.datasource.cache.a.C0574a c0574a = this.f62454l;
            if (c0574a != null) {
                throw c0574a;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public t(File file, d dVar, androidx.media3.database.b bVar) {
        this(file, dVar, bVar, null, false, false);
    }

    public t(File file, d dVar, @p0 androidx.media3.database.b bVar, @p0 byte[] bArr, boolean z10, boolean z11) {
        this(file, dVar, new l(bVar, file, bArr, z10, z11), (bVar == null || z11) ? null : new f(bVar));
    }

    t(File file, d dVar, l lVar, @p0 f fVar) {
        if (!E(file)) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f62444b = file;
        this.f62445c = dVar;
        this.f62446d = lVar;
        this.f62447e = fVar;
        this.f62448f = new HashMap<>();
        this.f62449g = new Random();
        this.f62450h = dVar.a();
        this.f62451i = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
        conditionVariable.block();
    }
}
