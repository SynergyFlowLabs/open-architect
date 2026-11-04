package kotlinx.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.t0;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSinksJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,133:1\n38#2:134\n*S KotlinDebug\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt\n*L\n46#1:134\n*E\n"})
public final class a0 {

    @SourceDebugExtension({"SMAP\nSinksJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt$asByteChannel$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class a implements WritableByteChannel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ x f315738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f315739b;

        a(x xVar, Function0<Boolean> function0) {
            this.f315738a = xVar;
            this.f315739b = function0;
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f315738a.close();
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return !this.f315739b.invoke().booleanValue();
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer source) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f315739b.invoke().booleanValue()) {
                throw new IllegalStateException("Underlying sink is closed.");
            }
            return a0.g(this.f315738a, source);
        }
    }

    @NotNull
    public static final WritableByteChannel c(@NotNull x xVar) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar instanceof q) {
            function0 = new t0(xVar) { // from class: kotlinx.io.a0.b
                @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
                public Object get() {
                    return Boolean.valueOf(((q) this.receiver).f315781b);
                }

                @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
                public void set(Object obj) {
                    ((q) this.receiver).f315781b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(xVar instanceof kotlinx.io.b)) {
                throw new kotlin.k0();
            }
            function0 = new Function0() { // from class: kotlinx.io.y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(a0.d());
                }
            };
        }
        return new a(xVar, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d() {
        return false;
    }

    @NotNull
    public static final OutputStream e(@NotNull x xVar) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        if (xVar instanceof q) {
            function0 = new t0(xVar) { // from class: kotlinx.io.a0.d
                @Override // kotlin.jvm.internal.t0, kotlin.reflect.p
                public Object get() {
                    return Boolean.valueOf(((q) this.receiver).f315781b);
                }

                @Override // kotlin.jvm.internal.t0, kotlin.reflect.k
                public void set(Object obj) {
                    ((q) this.receiver).f315781b = ((Boolean) obj).booleanValue();
                }
            };
        } else {
            if (!(xVar instanceof kotlinx.io.b)) {
                throw new kotlin.k0();
            }
            function0 = new Function0() { // from class: kotlinx.io.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(a0.f());
                }
            };
        }
        return new c(function0, xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f() {
        return false;
    }

    public static final int g(@NotNull x xVar, @NotNull ByteBuffer source) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = xVar.n().j();
        kotlinx.io.d.h(xVar.n(), source);
        long j11 = xVar.n().j() - j10;
        xVar.Z3();
        return (int) j11;
    }

    public static final void h(@NotNull x xVar, @NotNull String string, @NotNull Charset charset, int i10, int i11) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        k0.e(string.length(), i10, i11);
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            i0.p(xVar, string, i10, i11);
            return;
        }
        String strSubstring = string.substring(i10, i11);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        byte[] bytes = strSubstring.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        xVar.write(bytes, 0, bytes.length);
    }

    public static /* synthetic */ void i(x xVar, String str, Charset charset, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = str.length();
        }
        h(xVar, str, charset, i10, i11);
    }

    @SourceDebugExtension({"SMAP\nSinksJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt$asOutputStream$1\n+ 2 Sinks.kt\nkotlinx/io/SinksKt\n*L\n1#1,133:1\n374#2,3:134\n374#2,3:137\n*S KotlinDebug\n*F\n+ 1 SinksJvm.kt\nkotlinx/io/SinksJvmKt$asOutputStream$1\n*L\n69#1:134,3\n74#1:137,3\n*E\n"})
    public static final class c extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f315740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x f315741b;

        c(Function0<Boolean> function0, x xVar) {
            this.f315740a = function0;
            this.f315741b = xVar;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f315741b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            if (!this.f315740a.invoke().booleanValue()) {
                this.f315741b.flush();
            }
        }

        public String toString() {
            return this.f315741b + ".asOutputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            if (this.f315740a.invoke().booleanValue()) {
                throw new IOException("Underlying sink is closed.");
            }
            x xVar = this.f315741b;
            xVar.n().m6((byte) i10);
            xVar.Z3();
        }

        @Override // java.io.OutputStream
        public void write(byte[] data, int i10, int i11) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            if (!this.f315740a.invoke().booleanValue()) {
                x xVar = this.f315741b;
                xVar.n().write(data, i10, i11 + i10);
                xVar.Z3();
                return;
            }
            throw new IOException("Underlying sink is closed.");
        }
    }
}
