package coil.disk;

import android.os.StatFs;
import androidx.annotation.x;
import io.sentry.o8;
import java.io.Closeable;
import java.io.File;
import kotlin.b1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.l;
import kotlin.ranges.r;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.n0;
import okio.r0;
import okio.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: coil.disk.a$a, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskCache.kt\ncoil/disk/DiskCache$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
    public static final class C0815a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private r0 f87237a;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f87242f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private v f87238b = v.f335116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private double f87239c = 0.02d;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f87240d = o8.f305969h3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f87241e = 262144000;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        private n0 f87243g = l1.c();

        @NotNull
        public final a a() {
            long jK;
            r0 r0Var = this.f87237a;
            if (r0Var == null) {
                throw new IllegalStateException("directory == null");
            }
            if (this.f87239c > 0.0d) {
                try {
                    File file = r0Var.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jK = r.K((long) (this.f87239c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f87240d, this.f87241e);
                } catch (Exception unused) {
                    jK = this.f87240d;
                }
            } else {
                jK = this.f87242f;
            }
            return new e(jK, r0Var, this.f87238b, this.f87243g);
        }

        @NotNull
        public final C0815a b(@NotNull n0 n0Var) {
            this.f87243g = n0Var;
            return this;
        }

        @NotNull
        public final C0815a c(@NotNull File file) {
            return d(r0.a.g(r0.f335070b, file, false, 1, null));
        }

        @NotNull
        public final C0815a d(@NotNull r0 r0Var) {
            this.f87237a = r0Var;
            return this;
        }

        @NotNull
        public final C0815a e(@NotNull v vVar) {
            this.f87238b = vVar;
            return this;
        }

        @NotNull
        public final C0815a f(long j10) {
            if (j10 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f87239c = 0.0d;
            this.f87242f = j10;
            return this;
        }

        @NotNull
        public final C0815a g(@x(from = 0.0d, to = 1.0d) double d10) {
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("size must be in the range [0.0, 1.0].");
            }
            this.f87242f = 0L;
            this.f87239c = d10;
            return this;
        }

        @NotNull
        public final C0815a h(long j10) {
            if (j10 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f87241e = j10;
            return this;
        }

        @NotNull
        public final C0815a i(long j10) {
            if (j10 <= 0) {
                throw new IllegalArgumentException("size must be > 0.");
            }
            this.f87240d = j10;
            return this;
        }
    }

    @i4.a
    public interface b {
        @Nullable
        c a();

        void abort();

        @l(message = "Renamed to 'commitAndOpenSnapshot'.", replaceWith = @b1(expression = "commitAndOpenSnapshot()", imports = {}))
        @Nullable
        c b();

        void commit();

        @NotNull
        r0 getData();

        @NotNull
        r0 z();
    }

    @i4.a
    public interface c extends Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        void close();

        @NotNull
        r0 getData();

        @l(message = "Renamed to 'closeAndOpenEditor'.", replaceWith = @b1(expression = "closeAndOpenEditor()", imports = {}))
        @Nullable
        b n7();

        @Nullable
        b qd();

        @NotNull
        r0 z();
    }

    @i4.a
    static /* synthetic */ void b() {
    }

    @i4.a
    static /* synthetic */ void c() {
    }

    @i4.a
    static /* synthetic */ void d() {
    }

    @i4.a
    static /* synthetic */ void h() {
    }

    long a();

    @i4.a
    void clear();

    @i4.a
    @Nullable
    b e(@NotNull String str);

    @i4.a
    @Nullable
    c f(@NotNull String str);

    @i4.a
    @l(message = "Renamed to 'openEditor'.", replaceWith = @b1(expression = "openEditor(key)", imports = {}))
    @Nullable
    b g(@NotNull String str);

    @i4.a
    @l(message = "Renamed to 'openSnapshot'.", replaceWith = @b1(expression = "openSnapshot(key)", imports = {}))
    @Nullable
    c get(@NotNull String str);

    @NotNull
    r0 getDirectory();

    @NotNull
    v getFileSystem();

    long getSize();

    @i4.a
    boolean remove(@NotNull String str);
}
