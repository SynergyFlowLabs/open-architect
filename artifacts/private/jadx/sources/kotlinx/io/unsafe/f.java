package kotlinx.io.unsafe;

import kotlin.Unit;
import kotlin.a1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.h0;
import kotlinx.io.t;
import org.jetbrains.annotations.NotNull;
import pj.n;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final kotlinx.io.unsafe.b f315800a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final kotlinx.io.unsafe.c f315801b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final kotlinx.io.unsafe.a f315802c = new a();

    public static final class a implements kotlinx.io.unsafe.a {
        a() {
        }

        @Override // kotlinx.io.unsafe.a
        public t a(t segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            return segment.f();
        }

        @Override // kotlinx.io.unsafe.b
        public byte b(t segment, int i10) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            return f.f315800a.b(segment, i10);
        }
    }

    public static final class b implements kotlinx.io.unsafe.b {
        b() {
        }

        @Override // kotlinx.io.unsafe.b
        public byte b(t segment, int i10) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            return segment.o(i10);
        }
    }

    public static final class c implements kotlinx.io.unsafe.c {
        c() {
        }

        @Override // kotlinx.io.unsafe.c
        public void a(t segment, int i10, byte b10, byte b11) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            segment.C(i10, b10, b11);
        }

        @Override // kotlinx.io.unsafe.c
        public void b(t segment, int i10, byte b10, byte b11, byte b12) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            segment.D(i10, b10, b11, b12);
        }

        @Override // kotlinx.io.unsafe.c
        public void c(t segment, int i10, byte b10) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            segment.B(i10, b10);
        }

        @Override // kotlinx.io.unsafe.c
        public void d(t segment, int i10, byte b10, byte b11, byte b12, byte b13) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            segment.E(i10, b10, b11, b12, b13);
        }
    }

    @a1
    @h0
    public static /* synthetic */ void b() {
    }

    @a1
    @h0
    public static /* synthetic */ void d() {
    }

    @a1
    @h0
    public static /* synthetic */ void f() {
    }

    @h0
    public static final /* synthetic */ void g(kotlinx.io.unsafe.b bVar, t segment, n<? super byte[], ? super Integer, ? super Integer, Unit> readAction) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(readAction, "readAction");
        readAction.invoke(segment.b(true), Integer.valueOf(segment.h()), Integer.valueOf(segment.d()));
    }
}
