package io.ktor.websocket;

import io.ktor.util.a1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.o1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final c f297265i = new c(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final byte[] f297266j = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f297267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f297268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final byte[] f297269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final o1 f297270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f297271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f297272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f297273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final ByteBuffer f297274h;

    public static final class a extends e {
        public /* synthetic */ a(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, bArr, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, @NotNull byte[] data, boolean z11, boolean z12, boolean z13) {
            super(z10, i.BINARY, data, j.f297309a, z11, z12, z13, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, @NotNull ByteBuffer buffer) {
            this(z10, a1.i(buffer));
            Intrinsics.checkNotNullParameter(buffer, "buffer");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, @NotNull byte[] data) {
            this(z10, data, false, false, false);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, @NotNull kotlinx.io.c0 packet) {
            this(z10, kotlinx.io.g0.c(packet));
            Intrinsics.checkNotNullParameter(packet, "packet");
        }
    }

    @SourceDebugExtension({"SMAP\nFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Frame.kt\nio/ktor/websocket/Frame$Close\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n*L\n1#1,177:1\n21#2,3:178\n*S KotlinDebug\n*F\n+ 1 Frame.kt\nio/ktor/websocket/Frame$Close\n*L\n100#1:178,3\n*E\n"})
    public static final class b extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull byte[] data) {
            super(true, i.CLOSE, data, j.f297309a, false, false, false, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull kotlinx.io.c0 packet) {
            this(kotlinx.io.g0.c(packet));
            Intrinsics.checkNotNullParameter(packet, "packet");
        }

        public b() {
            this(e.f297266j);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull ByteBuffer buffer) {
            this(a1.i(buffer));
            Intrinsics.checkNotNullParameter(buffer, "buffer");
        }

        public b(@NotNull io.ktor.websocket.a reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            kotlinx.io.b bVar = new kotlinx.io.b();
            bVar.oc(reason.e());
            ui.u.p(bVar, reason.g(), 0, 0, null, 14, null);
            this(bVar);
        }
    }

    public static final class c {

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f297275a;

            static {
                int[] iArr = new int[i.values().length];
                try {
                    iArr[i.BINARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[i.TEXT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[i.CLOSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[i.PING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[i.PONG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f297275a = iArr;
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final e a(boolean z10, @NotNull i frameType, @NotNull byte[] data, boolean z11, boolean z12, boolean z13) {
            Intrinsics.checkNotNullParameter(frameType, "frameType");
            Intrinsics.checkNotNullParameter(data, "data");
            int i10 = a.f297275a[frameType.ordinal()];
            if (i10 == 1) {
                return new a(z10, data, z11, z12, z13);
            }
            if (i10 == 2) {
                return new f(z10, data, z11, z12, z13);
            }
            if (i10 == 3) {
                return new b(data);
            }
            if (i10 == 4) {
                return new d(data);
            }
            if (i10 == 5) {
                return new C2109e(data, j.f297309a);
            }
            throw new kotlin.k0();
        }

        private c() {
        }
    }

    public static final class d extends e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull byte[] data) {
            super(true, i.PING, data, j.f297309a, false, false, false, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(@NotNull kotlinx.io.c0 packet) {
            this(kotlinx.io.g0.c(packet));
            Intrinsics.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public d(@NotNull ByteBuffer buffer) {
            this(a1.i(buffer));
            Intrinsics.checkNotNullParameter(buffer, "buffer");
        }
    }

    public static final class f extends e {
        public /* synthetic */ f(boolean z10, byte[] bArr, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z10, bArr, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, @NotNull byte[] data, boolean z11, boolean z12, boolean z13) {
            super(z10, i.TEXT, data, j.f297309a, z11, z12, z13, null);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, @NotNull byte[] data) {
            this(z10, data, false, false, false);
            Intrinsics.checkNotNullParameter(data, "data");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(@NotNull String text) {
            this(true, ui.u.m(text, null, 1, null));
            Intrinsics.checkNotNullParameter(text, "text");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, @NotNull kotlinx.io.c0 packet) {
            this(z10, kotlinx.io.g0.c(packet));
            Intrinsics.checkNotNullParameter(packet, "packet");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, @NotNull ByteBuffer buffer) {
            this(z10, a1.i(buffer));
            Intrinsics.checkNotNullParameter(buffer, "buffer");
        }
    }

    public /* synthetic */ e(boolean z10, i iVar, byte[] bArr, o1 o1Var, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, iVar, bArr, o1Var, z11, z12, z13);
    }

    @NotNull
    public final e b() {
        c cVar = f297265i;
        boolean z10 = this.f297267a;
        i iVar = this.f297268b;
        byte[] bArr = this.f297269c;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return cVar.a(z10, iVar, bArrCopyOf, this.f297271e, this.f297272f, this.f297273g);
    }

    @NotNull
    public final ByteBuffer c() {
        return this.f297274h;
    }

    @NotNull
    public final byte[] d() {
        return this.f297269c;
    }

    @NotNull
    public final o1 e() {
        return this.f297270d;
    }

    public final boolean f() {
        return this.f297267a;
    }

    @NotNull
    public final i g() {
        return this.f297268b;
    }

    public final boolean h() {
        return this.f297271e;
    }

    public final boolean i() {
        return this.f297272f;
    }

    public final boolean j() {
        return this.f297273g;
    }

    @NotNull
    public String toString() {
        return "Frame " + this.f297268b + " (fin=" + this.f297267a + ", buffer len = " + this.f297269c.length + ')';
    }

    /* JADX INFO: renamed from: io.ktor.websocket.e$e, reason: collision with other inner class name */
    public static final class C2109e extends e {
        public /* synthetic */ C2109e(byte[] bArr, o1 o1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i10 & 2) != 0 ? j.f297309a : o1Var);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2109e(@NotNull byte[] data, @NotNull o1 disposableHandle) {
            super(true, i.PONG, data, disposableHandle, false, false, false, null);
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(disposableHandle, "disposableHandle");
            int i10 = 7 ^ 0;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C2109e(@NotNull kotlinx.io.c0 packet) {
            this(kotlinx.io.g0.c(packet), j.f297309a);
            Intrinsics.checkNotNullParameter(packet, "packet");
        }

        public /* synthetic */ C2109e(ByteBuffer byteBuffer, o1 o1Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(byteBuffer, (i10 & 2) != 0 ? j.f297309a : o1Var);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C2109e(@NotNull ByteBuffer buffer, @NotNull o1 disposableHandle) {
            this(a1.i(buffer), disposableHandle);
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(disposableHandle, "disposableHandle");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C2109e(@NotNull ByteBuffer buffer) {
            this(a1.i(buffer), j.f297309a);
            Intrinsics.checkNotNullParameter(buffer, "buffer");
        }
    }

    private e(boolean z10, i iVar, byte[] bArr, o1 o1Var, boolean z11, boolean z12, boolean z13) {
        this.f297267a = z10;
        this.f297268b = iVar;
        this.f297269c = bArr;
        this.f297270d = o1Var;
        this.f297271e = z11;
        this.f297272f = z12;
        this.f297273g = z13;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(byteBufferWrap, "wrap(...)");
        this.f297274h = byteBufferWrap;
    }

    public /* synthetic */ e(boolean z10, i iVar, byte[] bArr, o1 o1Var, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, iVar, bArr, (i10 & 8) != 0 ? j.f297309a : o1Var, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? false : z13, null);
    }
}
