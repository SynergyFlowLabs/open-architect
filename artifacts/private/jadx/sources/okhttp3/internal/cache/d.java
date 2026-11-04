package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.a0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oj.j;
import okhttp3.internal.platform.h;
import okio.b1;
import okio.m;
import okio.n;
import okio.y;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
public final class d implements Closeable, Flushable {

    @NotNull
    private final okhttp3.internal.concurrent.c X;

    @NotNull
    private final e Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final okhttp3.internal.io.a f333972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final File f333973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f333974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f333975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f333976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final File f333977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final File f333978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final File f333979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f333980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private m f333981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap<String, c> f333982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f333983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f333984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f333985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f333986o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f333987s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f333988t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f333989v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f333990w;

    @NotNull
    public static final a Z = new a(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333969p0 = coil.disk.c.X;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333970p1 = coil.disk.c.Y;

    @oj.f
    @NotNull
    public static final String H1 = coil.disk.c.Z;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333971p2 = coil.disk.c.f87248p0;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333962g3 = "1";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @oj.f
    public static final long f333963h3 = -1;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Regex f333964i3 = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333965j3 = "CLEAN";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333966k3 = "DIRTY";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333967l3 = "REMOVE";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final String f333968m3 = "READ";

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final c f333991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final boolean[] f333992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f333993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d f333994d;

        static final class a extends l0 implements Function1<IOException, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f333995a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f333996b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, b bVar) {
                super(1);
                this.f333995a = dVar;
                this.f333996b = bVar;
            }

            public final void c(@NotNull IOException it) {
                Intrinsics.checkNotNullParameter(it, "it");
                d dVar = this.f333995a;
                b bVar = this.f333996b;
                synchronized (dVar) {
                    bVar.c();
                    Unit unit = Unit.f312394a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                c(iOException);
                return Unit.f312394a;
            }
        }

        public b(@NotNull d dVar, c entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f333994d = dVar;
            this.f333991a = entry;
            this.f333992b = entry.g() ? null : new boolean[dVar.R()];
        }

        public final void a() throws IOException {
            d dVar = this.f333994d;
            synchronized (dVar) {
                try {
                    if (this.f333993c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(this.f333991a.b(), this)) {
                        dVar.l(this, false);
                    }
                    this.f333993c = true;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b() throws IOException {
            d dVar = this.f333994d;
            synchronized (dVar) {
                try {
                    if (this.f333993c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (Intrinsics.areEqual(this.f333991a.b(), this)) {
                        dVar.l(this, true);
                    }
                    this.f333993c = true;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() throws IOException {
            if (Intrinsics.areEqual(this.f333991a.b(), this)) {
                if (this.f333994d.f333985n) {
                    this.f333994d.l(this, false);
                } else {
                    this.f333991a.q(true);
                }
            }
        }

        @NotNull
        public final c d() {
            return this.f333991a;
        }

        @Nullable
        public final boolean[] e() {
            return this.f333992b;
        }

        @NotNull
        public final z0 f(int i10) {
            d dVar = this.f333994d;
            synchronized (dVar) {
                try {
                    if (this.f333993c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!Intrinsics.areEqual(this.f333991a.b(), this)) {
                        return okio.l0.c();
                    }
                    if (!this.f333991a.g()) {
                        boolean[] zArr = this.f333992b;
                        Intrinsics.checkNotNull(zArr);
                        zArr[i10] = true;
                    }
                    try {
                        return new okhttp3.internal.cache.e(dVar.H().h(this.f333991a.c().get(i10)), new a(dVar, this));
                    } catch (FileNotFoundException unused) {
                        return okio.l0.c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Nullable
        public final b1 g(int i10) {
            d dVar = this.f333994d;
            synchronized (dVar) {
                try {
                    if (this.f333993c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    b1 b1VarG = null;
                    if (!this.f333991a.g() || !Intrinsics.areEqual(this.f333991a.b(), this) || this.f333991a.i()) {
                        return null;
                    }
                    try {
                        b1VarG = dVar.H().g(this.f333991a.a().get(i10));
                    } catch (FileNotFoundException unused) {
                    }
                    return b1VarG;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f333997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final long[] f333998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<File> f333999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<File> f334000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f334001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f334002f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private b f334003g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f334004h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f334005i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f334006j;

        public static final class a extends y {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f334007a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f334008b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f334009c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b1 b1Var, d dVar, c cVar) {
                super(b1Var);
                this.f334008b = dVar;
                this.f334009c = cVar;
            }

            @Override // okio.y, okio.b1, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                if (this.f334007a) {
                    return;
                }
                this.f334007a = true;
                d dVar = this.f334008b;
                c cVar = this.f334009c;
                synchronized (dVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            dVar.o0(cVar);
                        }
                        Unit unit = Unit.f312394a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(@NotNull d dVar, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f334006j = dVar;
            this.f333997a = key;
            this.f333998b = new long[dVar.R()];
            this.f333999c = new ArrayList();
            this.f334000d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int iR = dVar.R();
            for (int i10 = 0; i10 < iR; i10++) {
                sb2.append(i10);
                this.f333999c.add(new File(this.f334006j.E(), sb2.toString()));
                sb2.append(".tmp");
                this.f334000d.add(new File(this.f334006j.E(), sb2.toString()));
                sb2.setLength(length);
            }
        }

        private final Void j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final b1 k(int i10) throws FileNotFoundException {
            b1 b1VarG = this.f334006j.H().g(this.f333999c.get(i10));
            if (this.f334006j.f333985n) {
                return b1VarG;
            }
            this.f334004h++;
            return new a(b1VarG, this.f334006j, this);
        }

        @NotNull
        public final List<File> a() {
            return this.f333999c;
        }

        @Nullable
        public final b b() {
            return this.f334003g;
        }

        @NotNull
        public final List<File> c() {
            return this.f334000d;
        }

        @NotNull
        public final String d() {
            return this.f333997a;
        }

        @NotNull
        public final long[] e() {
            return this.f333998b;
        }

        public final int f() {
            return this.f334004h;
        }

        public final boolean g() {
            return this.f334001e;
        }

        public final long h() {
            return this.f334005i;
        }

        public final boolean i() {
            return this.f334002f;
        }

        public final void l(@Nullable b bVar) {
            this.f334003g = bVar;
        }

        public final void m(@NotNull List<String> strings) throws IOException {
            Intrinsics.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f334006j.R()) {
                j(strings);
                throw new a0();
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f333998b[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new a0();
            }
        }

        public final void n(int i10) {
            this.f334004h = i10;
        }

        public final void o(boolean z10) {
            this.f334001e = z10;
        }

        public final void p(long j10) {
            this.f334005i = j10;
        }

        public final void q(boolean z10) {
            this.f334002f = z10;
        }

        @Nullable
        public final C2356d r() {
            d dVar = this.f334006j;
            if (jk.f.f307490h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            if (!this.f334001e) {
                return null;
            }
            if (!this.f334006j.f333985n && (this.f334003g != null || this.f334002f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f333998b.clone();
            try {
                int iR = this.f334006j.R();
                for (int i10 = 0; i10 < iR; i10++) {
                    arrayList.add(k(i10));
                }
                return new C2356d(this.f334006j, this.f333997a, this.f334005i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jk.f.o((b1) it.next());
                }
                try {
                    this.f334006j.o0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(@NotNull m writer) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j10 : this.f333998b) {
                writer.writeByte(32).h5(j10);
            }
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.d$d, reason: collision with other inner class name */
    public final class C2356d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f334010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f334011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<b1> f334012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final long[] f334013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f334014e;

        /* JADX WARN: Multi-variable type inference failed */
        public C2356d(@NotNull d dVar, String key, @NotNull long j10, @NotNull List<? extends b1> sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f334014e = dVar;
            this.f334010a = key;
            this.f334011b = j10;
            this.f334012c = sources;
            this.f334013d = lengths;
        }

        @Nullable
        public final b a() throws IOException {
            return this.f334014e.q(this.f334010a, this.f334011b);
        }

        public final long b(int i10) {
            return this.f334013d[i10];
        }

        @NotNull
        public final b1 c(int i10) {
            return this.f334012c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<b1> it = this.f334012c.iterator();
            while (it.hasNext()) {
                jk.f.o(it.next());
            }
        }

        @NotNull
        public final String d() {
            return this.f334010a;
        }
    }

    public static final class e extends okhttp3.internal.concurrent.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // okhttp3.internal.concurrent.a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (!dVar.f333986o || dVar.y()) {
                        return -1L;
                    }
                    try {
                        dVar.B0();
                    } catch (IOException unused) {
                        dVar.f333988t = true;
                    }
                    try {
                        if (dVar.X()) {
                            dVar.j0();
                            dVar.f333983l = 0;
                        }
                    } catch (IOException unused2) {
                        dVar.f333989v = true;
                        dVar.f333981j = okio.l0.d(okio.l0.c());
                    }
                    return -1L;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$newJournalWriter$faultHidingSink$1\n*L\n304#1:1066,4\n*E\n"})
    static final class f extends l0 implements Function1<IOException, Unit> {
        f() {
            super(1);
        }

        public final void c(@NotNull IOException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            d dVar = d.this;
            if (jk.f.f307490h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            d.this.f333984m = true;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
            c(iOException);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"})
    public static final class g implements Iterator<C2356d>, qj.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Iterator<c> f334017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private C2356d f334018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private C2356d f334019c;

        g() {
            Iterator<c> it = new ArrayList(d.this.I().values()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "ArrayList(lruEntries.values).iterator()");
            this.f334017a = it;
        }

        @Override // java.util.Iterator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2356d next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C2356d c2356d = this.f334018b;
            this.f334019c = c2356d;
            this.f334018b = null;
            Intrinsics.checkNotNull(c2356d);
            return c2356d;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            C2356d c2356dR;
            if (this.f334018b != null) {
                return true;
            }
            d dVar = d.this;
            synchronized (dVar) {
                try {
                    if (dVar.y()) {
                        return false;
                    }
                    while (this.f334017a.hasNext()) {
                        c next = this.f334017a.next();
                        if (next != null && (c2356dR = next.r()) != null) {
                            this.f334018b = c2356dR;
                            return true;
                        }
                    }
                    Unit unit = Unit.f312394a;
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            C2356d c2356d = this.f334019c;
            if (c2356d == null) {
                throw new IllegalStateException("remove() before next()");
            }
            try {
                d.this.k0(c2356d.d());
            } catch (IOException unused) {
            } finally {
                this.f334019c = null;
            }
        }
    }

    public d(@NotNull okhttp3.internal.io.a fileSystem, @NotNull File directory, int i10, int i11, long j10, @NotNull okhttp3.internal.concurrent.d taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f333972a = fileSystem;
        this.f333973b = directory;
        this.f333974c = i10;
        this.f333975d = i11;
        this.f333976e = j10;
        this.f333982k = new LinkedHashMap<>(0, 0.75f, true);
        this.X = taskRunner.j();
        this.Y = new e(jk.f.f307491i + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f333977f = new File(directory, f333969p0);
        this.f333978g = new File(directory, f333970p1);
        this.f333979h = new File(directory, H1);
    }

    private final void H0(String str) {
        if (f333964i3.k(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean X() {
        int i10 = this.f333983l;
        return i10 >= 2000 && i10 >= this.f333982k.size();
    }

    private final m Y() throws FileNotFoundException {
        return okio.l0.d(new okhttp3.internal.cache.e(this.f333972a.e(this.f333977f), new f()));
    }

    private final void d0() throws IOException {
        this.f333972a.c(this.f333978g);
        Iterator<c> it = this.f333982k.values().iterator();
        while (it.hasNext()) {
            c next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            c cVar = next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f333975d;
                while (i10 < i11) {
                    this.f333980i += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f333975d;
                while (i10 < i12) {
                    this.f333972a.c(cVar.a().get(i10));
                    this.f333972a.c(cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void f0() throws IOException {
        n nVarE = okio.l0.e(this.f333972a.g(this.f333977f));
        try {
            String strLb = nVarE.lb();
            String strLb2 = nVarE.lb();
            String strLb3 = nVarE.lb();
            String strLb4 = nVarE.lb();
            String strLb5 = nVarE.lb();
            if (!Intrinsics.areEqual(f333971p2, strLb) || !Intrinsics.areEqual(f333962g3, strLb2) || !Intrinsics.areEqual(String.valueOf(this.f333974c), strLb3) || !Intrinsics.areEqual(String.valueOf(this.f333975d), strLb4) || strLb5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strLb + ", " + strLb2 + ", " + strLb4 + ", " + strLb5 + AbstractJsonLexerKt.END_LIST);
            }
            int i10 = 0;
            while (true) {
                try {
                    g0(nVarE.lb());
                    i10++;
                } catch (EOFException unused) {
                    this.f333983l = i10 - this.f333982k.size();
                    if (nVarE.y1()) {
                        this.f333981j = Y();
                    } else {
                        j0();
                    }
                    Unit unit = Unit.f312394a;
                    kotlin.io.c.a(nVarE, null);
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.c.a(nVarE, th2);
                throw th3;
            }
        }
    }

    private final void g0(String str) throws IOException {
        String strSubstring;
        int iQ3 = StringsKt.q3(str, ' ', 0, false, 6, null);
        if (iQ3 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iQ3 + 1;
        int iQ4 = StringsKt.q3(str, ' ', i10, false, 4, null);
        if (iQ4 == -1) {
            strSubstring = str.substring(i10);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f333967l3;
            if (iQ3 == str2.length() && StringsKt.u2(str, str2, false, 2, null)) {
                this.f333982k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iQ4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = this.f333982k.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f333982k.put(strSubstring, cVar);
        }
        if (iQ4 != -1) {
            String str3 = f333965j3;
            if (iQ3 == str3.length() && StringsKt.u2(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iQ4 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List<String> listT4 = StringsKt.T4(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listT4);
                return;
            }
        }
        if (iQ4 == -1) {
            String str4 = f333966k3;
            if (iQ3 == str4.length() && StringsKt.u2(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iQ4 == -1) {
            String str5 = f333968m3;
            if (iQ3 == str5.length() && StringsKt.u2(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final synchronized void j() {
        try {
            if (this.f333987s) {
                throw new IllegalStateException("cache is closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ b r(d dVar, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = f333963h3;
        }
        return dVar.q(str, j10);
    }

    private final boolean r0() throws IOException {
        for (c toEvict : this.f333982k.values()) {
            if (!toEvict.i()) {
                Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                o0(toEvict);
                return true;
            }
        }
        return false;
    }

    public final void B0() throws IOException {
        while (this.f333980i > this.f333976e) {
            if (!r0()) {
                return;
            }
        }
        this.f333988t = false;
    }

    @NotNull
    public final File E() {
        return this.f333973b;
    }

    @NotNull
    public final okhttp3.internal.io.a H() {
        return this.f333972a;
    }

    @NotNull
    public final LinkedHashMap<String, c> I() {
        return this.f333982k;
    }

    public final synchronized long N() {
        return this.f333976e;
    }

    public final int R() {
        return this.f333975d;
    }

    public final synchronized void T() throws IOException {
        try {
            if (jk.f.f307490h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f333986o) {
                return;
            }
            if (this.f333972a.d(this.f333979h)) {
                if (this.f333972a.d(this.f333977f)) {
                    this.f333972a.c(this.f333979h);
                } else {
                    this.f333972a.b(this.f333979h, this.f333977f);
                }
            }
            this.f333985n = jk.f.M(this.f333972a, this.f333979h);
            if (this.f333972a.d(this.f333977f)) {
                try {
                    f0();
                    d0();
                    this.f333986o = true;
                    return;
                } catch (IOException e10) {
                    h.f334560a.g().m("DiskLruCache " + this.f333973b + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        m();
                        this.f333987s = false;
                        j0();
                        this.f333986o = true;
                    } catch (Throwable th2) {
                        this.f333987s = false;
                        throw th2;
                    }
                }
            }
            j0();
            this.f333986o = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b bVarB;
        try {
            if (this.f333986o && !this.f333987s) {
                Collection<c> collectionValues = this.f333982k.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                B0();
                m mVar = this.f333981j;
                Intrinsics.checkNotNull(mVar);
                mVar.close();
                this.f333981j = null;
                this.f333987s = true;
                return;
            }
            this.f333987s = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        try {
            if (this.f333986o) {
                j();
                B0();
                m mVar = this.f333981j;
                Intrinsics.checkNotNull(mVar);
                mVar.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean isClosed() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f333987s;
    }

    public final synchronized void j0() throws IOException {
        try {
            m mVar = this.f333981j;
            if (mVar != null) {
                mVar.close();
            }
            m mVarD = okio.l0.d(this.f333972a.h(this.f333978g));
            try {
                mVarD.pa(f333971p2).writeByte(10);
                mVarD.pa(f333962g3).writeByte(10);
                mVarD.h5(this.f333974c).writeByte(10);
                mVarD.h5(this.f333975d).writeByte(10);
                mVarD.writeByte(10);
                for (c cVar : this.f333982k.values()) {
                    if (cVar.b() != null) {
                        mVarD.pa(f333966k3).writeByte(32);
                        mVarD.pa(cVar.d());
                        mVarD.writeByte(10);
                    } else {
                        mVarD.pa(f333965j3).writeByte(32);
                        mVarD.pa(cVar.d());
                        cVar.s(mVarD);
                        mVarD.writeByte(10);
                    }
                }
                Unit unit = Unit.f312394a;
                kotlin.io.c.a(mVarD, null);
                if (this.f333972a.d(this.f333977f)) {
                    this.f333972a.b(this.f333977f, this.f333979h);
                }
                this.f333972a.b(this.f333978g, this.f333977f);
                this.f333972a.c(this.f333979h);
                this.f333981j = Y();
                this.f333984m = false;
                this.f333989v = false;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(mVarD, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    public final synchronized boolean k0(@NotNull String key) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(key, "key");
            T();
            j();
            H0(key);
            c cVar = this.f333982k.get(key);
            if (cVar == null) {
                return false;
            }
            boolean zO0 = o0(cVar);
            if (zO0 && this.f333980i <= this.f333976e) {
                this.f333988t = false;
            }
            return zO0;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void l(@NotNull b editor, boolean z10) throws IOException {
        try {
            Intrinsics.checkNotNullParameter(editor, "editor");
            c cVarD = editor.d();
            if (!Intrinsics.areEqual(cVarD.b(), editor)) {
                throw new IllegalStateException("Check failed.");
            }
            if (z10 && !cVarD.g()) {
                int i10 = this.f333975d;
                for (int i11 = 0; i11 < i10; i11++) {
                    boolean[] zArrE = editor.e();
                    Intrinsics.checkNotNull(zArrE);
                    if (!zArrE[i11]) {
                        editor.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!this.f333972a.d(cVarD.c().get(i11))) {
                        editor.a();
                        return;
                    }
                }
            }
            int i12 = this.f333975d;
            for (int i13 = 0; i13 < i12; i13++) {
                File file = cVarD.c().get(i13);
                if (!z10 || cVarD.i()) {
                    this.f333972a.c(file);
                } else if (this.f333972a.d(file)) {
                    File file2 = cVarD.a().get(i13);
                    this.f333972a.b(file, file2);
                    long j10 = cVarD.e()[i13];
                    long jF = this.f333972a.f(file2);
                    cVarD.e()[i13] = jF;
                    this.f333980i = (this.f333980i - j10) + jF;
                }
            }
            cVarD.l(null);
            if (cVarD.i()) {
                o0(cVarD);
                return;
            }
            this.f333983l++;
            m mVar = this.f333981j;
            Intrinsics.checkNotNull(mVar);
            if (cVarD.g() || z10) {
                cVarD.o(true);
                mVar.pa(f333965j3).writeByte(32);
                mVar.pa(cVarD.d());
                cVarD.s(mVar);
                mVar.writeByte(10);
                if (z10) {
                    long j11 = this.f333990w;
                    this.f333990w = 1 + j11;
                    cVarD.p(j11);
                }
            } else {
                this.f333982k.remove(cVarD.d());
                mVar.pa(f333967l3).writeByte(32);
                mVar.pa(cVarD.d());
                mVar.writeByte(10);
            }
            mVar.flush();
            if (this.f333980i > this.f333976e || X()) {
                okhttp3.internal.concurrent.c.p(this.X, this.Y, 0L, 2, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void m() throws IOException {
        close();
        this.f333972a.a(this.f333973b);
    }

    @j
    @Nullable
    public final b o(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        return r(this, key, 0L, 2, null);
    }

    public final boolean o0(@NotNull c entry) throws IOException {
        m mVar;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f333985n) {
            if (entry.f() > 0 && (mVar = this.f333981j) != null) {
                mVar.pa(f333966k3);
                mVar.writeByte(32);
                mVar.pa(entry.d());
                mVar.writeByte(10);
                mVar.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i10 = this.f333975d;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f333972a.c(entry.a().get(i11));
            this.f333980i -= entry.e()[i11];
            entry.e()[i11] = 0;
        }
        this.f333983l++;
        m mVar2 = this.f333981j;
        if (mVar2 != null) {
            mVar2.pa(f333967l3);
            mVar2.writeByte(32);
            mVar2.pa(entry.d());
            mVar2.writeByte(10);
        }
        this.f333982k.remove(entry.d());
        if (X()) {
            okhttp3.internal.concurrent.c.p(this.X, this.Y, 0L, 2, null);
        }
        return true;
    }

    @j
    @Nullable
    public final synchronized b q(@NotNull String key, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        T();
        j();
        H0(key);
        c cVar = this.f333982k.get(key);
        if (j10 != f333963h3 && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f333988t && !this.f333989v) {
            m mVar = this.f333981j;
            Intrinsics.checkNotNull(mVar);
            mVar.pa(f333966k3).writeByte(32).pa(key).writeByte(10);
            mVar.flush();
            if (this.f333984m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f333982k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        okhttp3.internal.concurrent.c.p(this.X, this.Y, 0L, 2, null);
        return null;
    }

    public final synchronized long size() throws IOException {
        try {
            T();
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f333980i;
    }

    public final synchronized void t() throws IOException {
        try {
            T();
            Collection<c> collectionValues = this.f333982k.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
            for (c entry : (c[]) collectionValues.toArray(new c[0])) {
                Intrinsics.checkNotNullExpressionValue(entry, "entry");
                o0(entry);
            }
            this.f333988t = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void w0(boolean z10) {
        this.f333987s = z10;
    }

    @Nullable
    public final synchronized C2356d x(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        T();
        j();
        H0(key);
        c cVar = this.f333982k.get(key);
        if (cVar == null) {
            return null;
        }
        C2356d c2356dR = cVar.r();
        if (c2356dR == null) {
            return null;
        }
        this.f333983l++;
        m mVar = this.f333981j;
        Intrinsics.checkNotNull(mVar);
        mVar.pa(f333968m3).writeByte(32).pa(key).writeByte(10);
        if (X()) {
            okhttp3.internal.concurrent.c.p(this.X, this.Y, 0L, 2, null);
        }
        return c2356dR;
    }

    public final synchronized void x0(long j10) {
        try {
            this.f333976e = j10;
            if (this.f333986o) {
                okhttp3.internal.concurrent.c.p(this.X, this.Y, 0L, 2, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean y() {
        return this.f333987s;
    }

    @NotNull
    public final synchronized Iterator<C2356d> y0() throws IOException {
        try {
            T();
        } catch (Throwable th2) {
            throw th2;
        }
        return new g();
    }
}
