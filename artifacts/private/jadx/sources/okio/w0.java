package okio;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final a f335125h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f335126i = 8192;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f335127j = 1024;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    @NotNull
    public final byte[] f335128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public int f335129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public int f335130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    public boolean f335131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    public boolean f335132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @Nullable
    public w0 f335133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @Nullable
    public w0 f335134g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public w0() {
        this.f335128a = new byte[8192];
        this.f335132e = true;
        this.f335131d = false;
    }

    public final void a() {
        int i10;
        w0 w0Var = this.f335134g;
        if (w0Var == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.checkNotNull(w0Var);
        if (w0Var.f335132e) {
            int i11 = this.f335130c - this.f335129b;
            w0 w0Var2 = this.f335134g;
            Intrinsics.checkNotNull(w0Var2);
            int i12 = 8192 - w0Var2.f335130c;
            w0 w0Var3 = this.f335134g;
            Intrinsics.checkNotNull(w0Var3);
            if (w0Var3.f335131d) {
                i10 = 0;
            } else {
                w0 w0Var4 = this.f335134g;
                Intrinsics.checkNotNull(w0Var4);
                i10 = w0Var4.f335129b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            w0 w0Var5 = this.f335134g;
            Intrinsics.checkNotNull(w0Var5);
            g(w0Var5, i11);
            b();
            x0.d(this);
        }
    }

    @Nullable
    public final w0 b() {
        w0 w0Var = this.f335133f;
        if (w0Var == this) {
            w0Var = null;
        }
        w0 w0Var2 = this.f335134g;
        Intrinsics.checkNotNull(w0Var2);
        w0Var2.f335133f = this.f335133f;
        w0 w0Var3 = this.f335133f;
        Intrinsics.checkNotNull(w0Var3);
        w0Var3.f335134g = this.f335134g;
        this.f335133f = null;
        this.f335134g = null;
        return w0Var;
    }

    @NotNull
    public final w0 c(@NotNull w0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f335134g = this;
        segment.f335133f = this.f335133f;
        w0 w0Var = this.f335133f;
        Intrinsics.checkNotNull(w0Var);
        w0Var.f335134g = segment;
        this.f335133f = segment;
        return segment;
    }

    @NotNull
    public final w0 d() {
        this.f335131d = true;
        return new w0(this.f335128a, this.f335129b, this.f335130c, true, false);
    }

    @NotNull
    public final w0 e(int i10) {
        w0 w0VarE;
        if (i10 <= 0 || i10 > this.f335130c - this.f335129b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            w0VarE = d();
        } else {
            w0VarE = x0.e();
            byte[] bArr = this.f335128a;
            byte[] bArr2 = w0VarE.f335128a;
            int i11 = this.f335129b;
            ArraysKt.copyInto$default(bArr, bArr2, 0, i11, i11 + i10, 2, (Object) null);
        }
        w0VarE.f335130c = w0VarE.f335129b + i10;
        this.f335129b += i10;
        w0 w0Var = this.f335134g;
        Intrinsics.checkNotNull(w0Var);
        w0Var.c(w0VarE);
        return w0VarE;
    }

    @NotNull
    public final w0 f() {
        byte[] bArr = this.f335128a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new w0(bArrCopyOf, this.f335129b, this.f335130c, false, true);
    }

    public final void g(@NotNull w0 sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f335132e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f335130c;
        if (i11 + i10 > 8192) {
            if (sink.f335131d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f335129b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f335128a;
            ArraysKt.copyInto$default(bArr, bArr, 0, i12, i11, 2, (Object) null);
            sink.f335130c -= sink.f335129b;
            sink.f335129b = 0;
        }
        byte[] bArr2 = this.f335128a;
        byte[] bArr3 = sink.f335128a;
        int i13 = sink.f335130c;
        int i14 = this.f335129b;
        ArraysKt.copyInto(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f335130c += i10;
        this.f335129b += i10;
    }

    public w0(@NotNull byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f335128a = data;
        this.f335129b = i10;
        this.f335130c = i11;
        this.f335131d = z10;
        this.f335132e = z11;
    }
}
