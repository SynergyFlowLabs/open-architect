package io.ktor.websocket;

import androidx.compose.animation.core.z1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nFrameParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameParser.kt\nio/ktor/websocket/FrameParser\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AtomicReference<a> f297276a = new AtomicReference<>(a.HEADER0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f297277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f297278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f297279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f297280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f297281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f297282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f297283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f297284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f297285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private Integer f297286k;

    public enum a {
        HEADER0,
        LENGTH,
        MASK_KEY,
        BODY;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f297292f = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<a> l() {
            return f297292f;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f297293a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HEADER0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.MASK_KEY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.BODY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f297293a = iArr;
        }
    }

    private final boolean l(ByteBuffer byteBuffer) {
        a aVar = this.f297276a.get();
        Intrinsics.checkNotNull(aVar);
        int i10 = b.f297293a[aVar.ordinal()];
        if (i10 == 1) {
            return m(byteBuffer);
        }
        int i11 = 7 | 2;
        if (i10 == 2) {
            return n(byteBuffer);
        }
        if (i10 == 3) {
            return o(byteBuffer);
        }
        if (i10 == 4) {
            return false;
        }
        throw new kotlin.k0();
    }

    private final boolean m(ByteBuffer byteBuffer) throws m {
        int i10 = 0;
        boolean z10 = true | false;
        if (byteBuffer.remaining() < 2) {
            return false;
        }
        byte b10 = byteBuffer.get();
        byte b11 = byteBuffer.get();
        this.f297277b = (b10 & 128) != 0;
        this.f297278c = (b10 & com.google.common.primitives.t.f119782a) != 0;
        this.f297279d = (b10 & 32) != 0;
        this.f297280e = (b10 & com.google.common.base.c.f116465r) != 0;
        int i11 = b10 & com.google.common.base.c.f116464q;
        this.f297282g = i11;
        if (i11 == 0 && this.f297283h == 0) {
            throw new m("Can't continue finished frames");
        }
        if (i11 == 0) {
            this.f297282g = this.f297283h;
        } else if (this.f297283h != 0 && !e().o()) {
            throw new m("Can't start new data frame before finishing previous one");
        }
        if (!e().o()) {
            this.f297283h = this.f297277b ? 0 : this.f297282g;
        } else if (!this.f297277b) {
            throw new m("control frames can't be fragmented");
        }
        this.f297281f = (b11 & 128) != 0;
        int i12 = b11 & 127;
        if (e().o() && i12 > 125) {
            throw new m("control frames can't be larger than 125 bytes");
        }
        if (i12 == 126) {
            i10 = 2;
        } else if (i12 == 127) {
            i10 = 8;
        }
        this.f297284i = i10;
        this.f297285j = i10 == 0 ? i12 : 0L;
        if (i10 > 0) {
            this.f297276a.set(a.LENGTH);
        } else if (this.f297281f) {
            this.f297276a.set(a.MASK_KEY);
        } else {
            this.f297276a.set(a.BODY);
        }
        return true;
    }

    private final boolean n(ByteBuffer byteBuffer) {
        long j10;
        int iRemaining = byteBuffer.remaining();
        int i10 = this.f297284i;
        if (iRemaining < i10) {
            return false;
        }
        if (i10 == 2) {
            j10 = ((long) byteBuffer.getShort()) & okhttp3.internal.ws.g.f334653t;
        } else {
            if (i10 != 8) {
                throw new IllegalStateException();
            }
            j10 = byteBuffer.getLong();
        }
        this.f297285j = j10;
        this.f297276a.set(this.f297281f ? a.MASK_KEY : a.BODY);
        return true;
    }

    private final boolean o(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            int i10 = 3 >> 0;
            return false;
        }
        this.f297286k = Integer.valueOf(byteBuffer.getInt());
        this.f297276a.set(a.BODY);
        return true;
    }

    public final void a() {
        if (!z1.a(this.f297276a, a.BODY, a.HEADER0)) {
            throw new IllegalStateException("It should be state BODY but it is " + this.f297276a.get());
        }
        this.f297282g = 0;
        this.f297285j = 0L;
        this.f297284i = 0;
        this.f297286k = null;
    }

    public final void b(@NotNull ByteBuffer bb2) {
        Intrinsics.checkNotNullParameter(bb2, "bb");
        if (Intrinsics.areEqual(bb2.order(), ByteOrder.BIG_ENDIAN)) {
            while (l(bb2)) {
            }
            return;
        }
        throw new IllegalArgumentException(("Buffer order should be BIG_ENDIAN but it is " + bb2.order()).toString());
    }

    public final boolean c() {
        return this.f297276a.get() == a.BODY;
    }

    public final boolean d() {
        return this.f297277b;
    }

    @NotNull
    public final i e() {
        i iVarA = i.f297297c.a(this.f297282g);
        if (iVarA != null) {
            return iVarA;
        }
        throw new IllegalStateException("Unsupported opcode " + Integer.toHexString(this.f297282g));
    }

    public final long f() {
        return this.f297285j;
    }

    public final boolean g() {
        return this.f297281f;
    }

    @Nullable
    public final Integer h() {
        return this.f297286k;
    }

    public final boolean i() {
        return this.f297278c;
    }

    public final boolean j() {
        return this.f297279d;
    }

    public final boolean k() {
        return this.f297280e;
    }
}
