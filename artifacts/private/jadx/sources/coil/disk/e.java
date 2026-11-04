package coil.disk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.n0;
import okio.o;
import okio.r0;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class e implements coil.disk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f87290e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f87291f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f87292g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f87293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final r0 f87294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v f87295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final coil.disk.c f87296d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache$RealEditor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    private static final class b implements coil.disk.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final coil.disk.c.b f87297a;

        public b(@NotNull coil.disk.c.b bVar) {
            this.f87297a = bVar;
        }

        @Override // coil.disk.a.b
        public void abort() {
            this.f87297a.a();
        }

        @Override // coil.disk.a.b
        @Nullable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b() {
            return a();
        }

        @Override // coil.disk.a.b
        public void commit() {
            this.f87297a.b();
        }

        @Override // coil.disk.a.b
        @Nullable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c a() {
            coil.disk.c.d dVarC = this.f87297a.c();
            if (dVarC != null) {
                return new c(dVarC);
            }
            return null;
        }

        @Override // coil.disk.a.b
        @NotNull
        public r0 getData() {
            return this.f87297a.f(1);
        }

        @Override // coil.disk.a.b
        @NotNull
        public r0 z() {
            return this.f87297a.f(0);
        }
    }

    @SourceDebugExtension({"SMAP\nRealDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealDiskCache.kt\ncoil/disk/RealDiskCache$RealSnapshot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
    private static final class c implements coil.disk.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final coil.disk.c.d f87298a;

        public c(@NotNull coil.disk.c.d dVar) {
            this.f87298a = dVar;
        }

        @Override // coil.disk.a.c
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b n7() {
            return qd();
        }

        @Override // coil.disk.a.c
        @Nullable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b qd() {
            coil.disk.c.b bVarA = this.f87298a.a();
            if (bVarA != null) {
                return new b(bVarA);
            }
            return null;
        }

        @Override // coil.disk.a.c, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f87298a.close();
        }

        @Override // coil.disk.a.c
        @NotNull
        public r0 getData() {
            return this.f87298a.b(1);
        }

        @Override // coil.disk.a.c
        @NotNull
        public r0 z() {
            return this.f87298a.b(0);
        }
    }

    public e(long j10, @NotNull r0 r0Var, @NotNull v vVar, @NotNull n0 n0Var) {
        this.f87293a = j10;
        this.f87294b = r0Var;
        this.f87295c = vVar;
        this.f87296d = new coil.disk.c(getFileSystem(), getDirectory(), n0Var, a(), 1, 2);
    }

    private final String i(String str) {
        return o.f335046d.l(str).t0().N();
    }

    @Override // coil.disk.a
    public long a() {
        return this.f87293a;
    }

    @Override // coil.disk.a
    public void clear() {
        this.f87296d.H();
    }

    @Override // coil.disk.a
    @Nullable
    public coil.disk.a.b e(@NotNull String str) {
        coil.disk.c.b bVarE = this.f87296d.E(i(str));
        if (bVarE != null) {
            return new b(bVarE);
        }
        return null;
    }

    @Override // coil.disk.a
    @Nullable
    public coil.disk.a.c f(@NotNull String str) {
        coil.disk.c.d dVarI = this.f87296d.I(i(str));
        if (dVarI != null) {
            return new c(dVarI);
        }
        return null;
    }

    @Override // coil.disk.a
    @Nullable
    public coil.disk.a.b g(@NotNull String str) {
        return e(str);
    }

    @Override // coil.disk.a
    @Nullable
    public coil.disk.a.c get(@NotNull String str) {
        return f(str);
    }

    @Override // coil.disk.a
    @NotNull
    public r0 getDirectory() {
        return this.f87294b;
    }

    @Override // coil.disk.a
    @NotNull
    public v getFileSystem() {
        return this.f87295c;
    }

    @Override // coil.disk.a
    public long getSize() {
        return this.f87296d.size();
    }

    @Override // coil.disk.a
    public boolean remove(@NotNull String str) {
        return this.f87296d.j0(i(str));
    }
}
