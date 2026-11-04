package kotlinx.io;

import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nkotlinx/io/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,535:1\n1#2:536\n95#3:537\n95#3:538\n95#3:539\n95#3:540\n95#3:541\n98#3:542\n98#3:543\n98#3:544\n98#3:545\n98#3:546\n98#3:547\n98#3:548\n98#3:549\n*S KotlinDebug\n*F\n+ 1 Segment.kt\nkotlinx/io/Segment\n*L\n282#1:537\n291#1:538\n292#1:539\n293#1:540\n294#1:541\n304#1:542\n305#1:543\n306#1:544\n307#1:545\n308#1:546\n309#1:547\n310#1:548\n311#1:549\n*E\n"})
public final class t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f315789h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f315790i = 8192;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f315791j = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f315792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f315793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f315794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private u f315795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public boolean f315796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private t f315797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private t f315798g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ t a() {
            return new t(null);
        }

        public final /* synthetic */ t b(byte[] data, int i10, int i11, u uVar, boolean z10) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new t(data, i10, i11, uVar, z10, null);
        }

        private a() {
        }
    }

    public /* synthetic */ t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @a1
    public static /* synthetic */ void e() {
    }

    @a1
    public static /* synthetic */ void g() {
    }

    @a1
    public static /* synthetic */ void i() {
    }

    @a1
    public static /* synthetic */ void k() {
    }

    public final /* synthetic */ void A(t tVar) {
        this.f315798g = tVar;
    }

    public final void B(int i10, byte b10) {
        this.f315792a[this.f315794c + i10] = b10;
    }

    public final void C(int i10, byte b10, byte b11) {
        byte[] bArr = this.f315792a;
        int i11 = this.f315794c + i10;
        bArr[i11] = b10;
        bArr[i11 + 1] = b11;
    }

    public final void D(int i10, byte b10, byte b11, byte b12) {
        byte[] bArr = this.f315792a;
        int i11 = this.f315794c + i10;
        bArr[i11] = b10;
        bArr[i11 + 1] = b11;
        bArr[i11 + 2] = b12;
    }

    public final void E(int i10, byte b10, byte b11, byte b12, byte b13) {
        byte[] bArr = this.f315792a;
        int i11 = this.f315794c + i10;
        bArr[i11] = b10;
        bArr[i11 + 1] = b11;
        bArr[i11 + 2] = b12;
        bArr[i11 + 3] = b13;
    }

    @NotNull
    public final t F() {
        u uVarL = this.f315795d;
        if (uVarL == null) {
            uVarL = w.l();
            this.f315795d = uVarL;
        }
        u uVar = uVarL;
        byte[] bArr = this.f315792a;
        int i10 = this.f315793b;
        int i11 = this.f315794c;
        uVar.a();
        Unit unit = Unit.f312394a;
        return new t(bArr, i10, i11, uVar, false);
    }

    @NotNull
    public final t G(int i10) {
        t tVarJ;
        if (i10 <= 0 || i10 > this.f315794c - this.f315793b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            tVarJ = F();
        } else {
            tVarJ = w.j();
            byte[] bArr = this.f315792a;
            byte[] bArr2 = tVarJ.f315792a;
            int i11 = this.f315793b;
            int i12 = 3 | 0;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
        }
        tVarJ.f315794c = tVarJ.f315793b + i10;
        this.f315793b += i10;
        t tVar = this.f315798g;
        if (tVar != null) {
            Intrinsics.checkNotNull(tVar);
            tVar.q(tVarJ);
            return tVarJ;
        }
        tVarJ.f315797f = this;
        this.f315798g = tVarJ;
        return tVarJ;
    }

    public final void H(@NotNull byte[] src, int i10, int i11) {
        Intrinsics.checkNotNullParameter(src, "src");
        ArraysKt.copyInto(src, this.f315792a, this.f315794c, i10, i11);
        this.f315794c += i11 - i10;
    }

    @a1
    public final /* synthetic */ void I(byte[] data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final void J(byte b10) {
        byte[] bArr = this.f315792a;
        int i10 = this.f315794c;
        this.f315794c = i10 + 1;
        bArr[i10] = b10;
    }

    public final void K(int i10) {
        byte[] bArr = this.f315792a;
        int i11 = this.f315794c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        this.f315794c = i11 + 4;
    }

    public final void L(long j10) {
        byte[] bArr = this.f315792a;
        int i10 = this.f315794c;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        this.f315794c = i10 + 8;
    }

    public final void M(short s10) {
        byte[] bArr = this.f315792a;
        int i10 = this.f315794c;
        bArr[i10] = (byte) ((s10 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (s10 & 255);
        this.f315794c = i10 + 2;
    }

    public final void N(@NotNull t sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f315796e) {
            throw new IllegalStateException("only owner can write");
        }
        if (sink.f315794c + i10 > 8192) {
            if (sink.m()) {
                throw new IllegalArgumentException();
            }
            int i11 = sink.f315794c;
            int i12 = sink.f315793b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f315792a;
            int i13 = 2 << 0;
            ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f315794c -= sink.f315793b;
            sink.f315793b = 0;
        }
        byte[] bArr2 = this.f315792a;
        byte[] bArr3 = sink.f315792a;
        int i14 = sink.f315794c;
        int i15 = this.f315793b;
        ArraysKt.copyInto(bArr2, bArr3, i14, i15, i15 + i10);
        sink.f315794c += i10;
        this.f315793b += i10;
    }

    @NotNull
    public final t a() {
        int i10;
        t tVar = this.f315798g;
        if (tVar == null) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(tVar);
        if (tVar.f315796e) {
            int i11 = this.f315794c - this.f315793b;
            t tVar2 = this.f315798g;
            Intrinsics.checkNotNull(tVar2);
            int i12 = 8192 - tVar2.f315794c;
            t tVar3 = this.f315798g;
            Intrinsics.checkNotNull(tVar3);
            if (tVar3.m()) {
                i10 = 0;
            } else {
                t tVar4 = this.f315798g;
                Intrinsics.checkNotNull(tVar4);
                i10 = tVar4.f315793b;
            }
            if (i11 <= i12 + i10) {
                t tVar5 = this.f315798g;
                Intrinsics.checkNotNull(tVar5);
                N(tVar5, i11);
                if (p() != null) {
                    throw new IllegalStateException("Check failed.");
                }
                w.h(this);
                return tVar5;
            }
        }
        return this;
    }

    @a1
    public final /* synthetic */ byte[] b(boolean z10) {
        return this.f315792a;
    }

    @Nullable
    public final u c() {
        return this.f315795d;
    }

    public final /* synthetic */ int d() {
        return this.f315794c;
    }

    public final /* synthetic */ t f() {
        return this.f315797f;
    }

    public final /* synthetic */ int h() {
        return this.f315793b;
    }

    public final /* synthetic */ t j() {
        return this.f315798g;
    }

    public final int l() {
        return this.f315792a.length - this.f315794c;
    }

    public final boolean m() {
        u uVar = this.f315795d;
        if (uVar != null) {
            return uVar.b();
        }
        return false;
    }

    public final int n() {
        return this.f315794c - this.f315793b;
    }

    public final byte o(int i10) {
        return this.f315792a[this.f315793b + i10];
    }

    @Nullable
    public final t p() {
        t tVar = this.f315797f;
        t tVar2 = this.f315798g;
        if (tVar2 != null) {
            Intrinsics.checkNotNull(tVar2);
            tVar2.f315797f = this.f315797f;
        }
        t tVar3 = this.f315797f;
        if (tVar3 != null) {
            Intrinsics.checkNotNull(tVar3);
            tVar3.f315798g = this.f315798g;
        }
        this.f315797f = null;
        this.f315798g = null;
        return tVar;
    }

    @NotNull
    public final t q(@NotNull t segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f315798g = this;
        segment.f315797f = this.f315797f;
        t tVar = this.f315797f;
        if (tVar != null) {
            Intrinsics.checkNotNull(tVar);
            tVar.f315798g = segment;
        }
        this.f315797f = segment;
        return segment;
    }

    public final byte r() {
        byte[] bArr = this.f315792a;
        int i10 = this.f315793b;
        this.f315793b = i10 + 1;
        return bArr[i10];
    }

    public final int s() {
        byte[] bArr = this.f315792a;
        int i10 = this.f315793b;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i11 | ((bArr[i10 + 2] & 255) << 8);
        int i13 = (bArr[i10 + 3] & 255) | i12;
        this.f315793b = i10 + 4;
        return i13;
    }

    public final long t() {
        byte[] bArr = this.f315792a;
        int i10 = this.f315793b;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        long j11 = j10 | (((long) bArr[i10 + 7]) & 255);
        this.f315793b = i10 + 8;
        return j11;
    }

    public final short u() {
        byte[] bArr = this.f315792a;
        int i10 = this.f315793b;
        int i11 = (bArr[i10] & 255) << 8;
        short s10 = (short) ((bArr[i10 + 1] & 255) | i11);
        this.f315793b = i10 + 2;
        return s10;
    }

    public final void v(@NotNull byte[] dst, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int i12 = i11 - i10;
        byte[] bArr = this.f315792a;
        int i13 = this.f315793b;
        ArraysKt.copyInto(bArr, dst, i10, i13, i13 + i12);
        this.f315793b += i12;
    }

    public final void w(@Nullable u uVar) {
        this.f315795d = uVar;
    }

    public final /* synthetic */ void x(int i10) {
        this.f315794c = i10;
    }

    public final /* synthetic */ void y(t tVar) {
        this.f315797f = tVar;
    }

    public final /* synthetic */ void z(int i10) {
        this.f315793b = i10;
    }

    public /* synthetic */ t(byte[] bArr, int i10, int i11, u uVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, i10, i11, uVar, z10);
    }

    private t() {
        this.f315792a = new byte[8192];
        this.f315796e = true;
        this.f315795d = null;
    }

    private t(byte[] bArr, int i10, int i11, u uVar, boolean z10) {
        this.f315792a = bArr;
        this.f315793b = i10;
        this.f315794c = i11;
        this.f315795d = uVar;
        this.f315796e = z10;
    }
}
