package kotlinx.io;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.g3;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSourcesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n99#2:178\n100#2,8:180\n1#3:179\n*S KotlinDebug\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt\n*L\n41#1:178\n41#1:180,8\n41#1:179\n*E\n"})
public final class f0 {

    public static final class a implements ReadableByteChannel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f315754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f315755b;

        a(c0 c0Var, Function0<Boolean> function0) {
            this.f315754a = c0Var;
            this.f315755b = function0;
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f315754a.close();
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return !this.f315755b.invoke().booleanValue();
        }

        @Override // java.nio.channels.ReadableByteChannel
        public int read(ByteBuffer sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            return f0.g(this.f315754a, sink);
        }
    }

    @NotNull
    public static final ReadableByteChannel c(@NotNull c0 c0Var) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (c0Var instanceof r) {
            function0 = new t0(c0Var) { // from class: kotlinx.io.f0.b
                @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
                public Object get() {
                    return Boolean.valueOf(((r) this.receiver).f315784b);
                }

                @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
                public void set(Object obj) {
                    ((r) this.receiver).f315784b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(c0Var instanceof kotlinx.io.b)) {
                throw new kotlin.k0();
            }
            function0 = new Function0() { // from class: kotlinx.io.e0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(f0.d());
                }
            };
        }
        return new a(c0Var, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d() {
        return false;
    }

    @NotNull
    public static final InputStream e(@NotNull c0 c0Var) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        if (c0Var instanceof r) {
            function0 = new t0(c0Var) { // from class: kotlinx.io.f0.d
                @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
                public Object get() {
                    return Boolean.valueOf(((r) this.receiver).f315784b);
                }

                @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
                public void set(Object obj) {
                    ((r) this.receiver).f315784b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(c0Var instanceof kotlinx.io.b)) {
                throw new kotlin.k0();
            }
            function0 = new Function0() { // from class: kotlinx.io.d0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(f0.f());
                }
            };
        }
        return new c(function0, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return false;
    }

    public static final int g(@NotNull c0 c0Var, @NotNull ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (c0Var.n().j() == 0) {
            c0Var.request(PlaybackStateCompat.f9665p2);
            if (c0Var.n().j() == 0) {
                return -1;
            }
        }
        return kotlinx.io.d.d(c0Var.n(), sink);
    }

    @NotNull
    public static final String h(@NotNull c0 c0Var, long j10, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        c0Var.q1(j10);
        return j(c0Var.n(), j10, charset);
    }

    @NotNull
    public static final String i(@NotNull c0 c0Var, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        for (long j10 = 1; c0Var.request(j10); j10 *= (long) 2) {
        }
        return j(c0Var.n(), c0Var.n().j(), charset);
    }

    private static final String j(kotlinx.io.b bVar, long j10, Charset charset) throws EOFException {
        String str;
        int i10;
        if (j10 < 0 || j10 > g3.f12256c) {
            throw new IllegalArgumentException(("byteCount (" + j10 + ") is not within the range [0..2147483647)").toString());
        }
        if (bVar.j() < j10) {
            throw new EOFException("Buffer contains less bytes then required (byteCount: " + j10 + ", size: " + bVar.j() + ')');
        }
        if (j10 == 0) {
            return "";
        }
        kotlinx.io.unsafe.d dVar = kotlinx.io.unsafe.d.f315799a;
        if (bVar.y1()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t tVarG = bVar.g();
        Intrinsics.checkNotNull(tVarG);
        byte[] bArrB = tVarG.b(true);
        int iH = tVarG.h();
        if (tVarG.d() - iH >= j10) {
            i10 = (int) j10;
            str = new String(bArrB, iH, i10, charset);
        } else {
            str = null;
            i10 = 0;
        }
        if (i10 != 0) {
            if (i10 < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (i10 > tVarG.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            bVar.skip(i10);
        }
        return str == null ? new String(g0.d(bVar, (int) j10), charset) : str;
    }

    @SourceDebugExtension({"SMAP\nSourcesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt$asInputStream$1\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,177:1\n95#2:178\n107#2:179\n*S KotlinDebug\n*F\n+ 1 SourcesJvm.kt\nkotlinx/io/SourcesJvmKt$asInputStream$1\n*L\n115#1:178\n127#1:179\n*E\n"})
    public static final class c extends InputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f315756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f315757b;

        c(Function0<Boolean> function0, c0 c0Var) {
            this.f315756a = function0;
            this.f315757b = c0Var;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (this.f315756a.invoke().booleanValue()) {
                throw new IOException("Underlying source is closed.");
            }
            return (int) Math.min(this.f315757b.n().j(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f315757b.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f315756a.invoke().booleanValue()) {
                throw new IOException("Underlying source is closed.");
            }
            if (this.f315757b.y1()) {
                return -1;
            }
            return this.f315757b.readByte() & 255;
        }

        public String toString() {
            return this.f315757b + ".asInputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (this.f315756a.invoke().booleanValue()) {
                throw new IOException("Underlying source is closed.");
            }
            k0.g(data.length, i10, i11);
            return this.f315757b.Rc(data, i10, i11 + i10);
        }
    }
}
