package androidx.compose.ui.text;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nMultiParagraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/ParagraphInfo\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,1227:1\n65#2:1228\n69#2:1231\n60#3:1229\n70#3:1232\n53#3,3:1234\n53#3,3:1238\n53#3,3:1242\n53#3,3:1246\n22#4:1230\n30#5:1233\n30#5:1237\n30#5:1241\n30#5:1245\n*S KotlinDebug\n*F\n+ 1 MultiParagraph.kt\nandroidx/compose/ui/text/ParagraphInfo\n*L\n1183#1:1228\n1183#1:1231\n1183#1:1229\n1183#1:1232\n1183#1:1234,3\n1191#1:1238,3\n1199#1:1242,3\n1209#1:1246,3\n1183#1:1230\n1183#1:1233\n1191#1:1237\n1199#1:1241\n1209#1:1245\n*E\n"})
public final class o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f42011h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n0 f42012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f42014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f42017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f42018g;

    public o0(@NotNull n0 n0Var, int i10, int i11, int i12, int i13, float f10, float f11) {
        this.f42012a = n0Var;
        this.f42013b = i10;
        this.f42014c = i11;
        this.f42015d = i12;
        this.f42016e = i13;
        this.f42017f = f10;
        this.f42018g = f11;
    }

    public static /* synthetic */ o0 i(o0 o0Var, n0 n0Var, int i10, int i11, int i12, int i13, float f10, float f11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            n0Var = o0Var.f42012a;
        }
        if ((i14 & 2) != 0) {
            i10 = o0Var.f42013b;
        }
        if ((i14 & 4) != 0) {
            i11 = o0Var.f42014c;
        }
        if ((i14 & 8) != 0) {
            i12 = o0Var.f42015d;
        }
        if ((i14 & 16) != 0) {
            i13 = o0Var.f42016e;
        }
        if ((i14 & 32) != 0) {
            f10 = o0Var.f42017f;
        }
        if ((i14 & 64) != 0) {
            f11 = o0Var.f42018g;
        }
        float f12 = f10;
        float f13 = f11;
        int i15 = i13;
        int i16 = i11;
        return o0Var.h(n0Var, i10, i16, i12, i15, f12, f13);
    }

    public static /* synthetic */ long y(o0 o0Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return o0Var.x(j10, z10);
    }

    public final int A(int i10) {
        return i10 + this.f42015d;
    }

    public final float B(float f10) {
        return f10 + this.f42017f;
    }

    @NotNull
    public final n0.j C(@NotNull n0.j jVar) {
        float f10 = -this.f42017f;
        return jVar.T(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)));
    }

    public final long D(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        return n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) - this.f42017f)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    public final int E(int i10) {
        return kotlin.ranges.r.I(i10, this.f42013b, this.f42014c) - this.f42013b;
    }

    public final int F(int i10) {
        return i10 - this.f42015d;
    }

    public final float G(float f10) {
        return f10 - this.f42017f;
    }

    @NotNull
    public final n0 a() {
        return this.f42012a;
    }

    public final int b() {
        return this.f42013b;
    }

    public final int c() {
        return this.f42014c;
    }

    public final int d() {
        return this.f42015d;
    }

    public final int e() {
        return this.f42016e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.areEqual(this.f42012a, o0Var.f42012a) && this.f42013b == o0Var.f42013b && this.f42014c == o0Var.f42014c && this.f42015d == o0Var.f42015d && this.f42016e == o0Var.f42016e && Float.compare(this.f42017f, o0Var.f42017f) == 0 && Float.compare(this.f42018g, o0Var.f42018g) == 0;
    }

    public final float f() {
        return this.f42017f;
    }

    public final float g() {
        return this.f42018g;
    }

    @NotNull
    public final o0 h(@NotNull n0 n0Var, int i10, int i11, int i12, int i13, float f10, float f11) {
        return new o0(n0Var, i10, i11, i12, i13, f10, f11);
    }

    public int hashCode() {
        return (((((((((((this.f42012a.hashCode() * 31) + Integer.hashCode(this.f42013b)) * 31) + Integer.hashCode(this.f42014c)) * 31) + Integer.hashCode(this.f42015d)) * 31) + Integer.hashCode(this.f42016e)) * 31) + Float.hashCode(this.f42017f)) * 31) + Float.hashCode(this.f42018g);
    }

    public final float j() {
        return this.f42018g;
    }

    public final int k() {
        return this.f42014c;
    }

    public final int l() {
        return this.f42016e;
    }

    public final int m() {
        return this.f42014c - this.f42013b;
    }

    @NotNull
    public final n0 n() {
        return this.f42012a;
    }

    public final int o() {
        return this.f42013b;
    }

    public final int p() {
        return this.f42015d;
    }

    public final float q() {
        return this.f42017f;
    }

    public final void r(float f10) {
        this.f42018g = f10;
    }

    public final void s(int i10) {
        this.f42016e = i10;
    }

    public final void t(int i10) {
        this.f42015d = i10;
    }

    @NotNull
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.f42012a + ", startIndex=" + this.f42013b + ", endIndex=" + this.f42014c + ", startLineIndex=" + this.f42015d + ", endLineIndex=" + this.f42016e + ", top=" + this.f42017f + ", bottom=" + this.f42018g + ')';
    }

    public final void u(float f10) {
        this.f42017f = f10;
    }

    @NotNull
    public final androidx.compose.ui.graphics.k2 v(@NotNull androidx.compose.ui.graphics.k2 k2Var) {
        float f10 = this.f42017f;
        k2Var.m(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)));
        return k2Var;
    }

    @NotNull
    public final n0.j w(@NotNull n0.j jVar) {
        float f10 = this.f42017f;
        return jVar.T(n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)));
    }

    public final long x(long j10, boolean z10) {
        if (z10) {
            w3.a aVar = w3.f42333b;
            if (w3.g(j10, aVar.a())) {
                return aVar.a();
            }
        }
        return x3.b(z(w3.n(j10)), z(w3.i(j10)));
    }

    public final int z(int i10) {
        return i10 + this.f42013b;
    }

    public /* synthetic */ o0(n0 n0Var, int i10, int i11, int i12, int i13, float f10, float f11, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(n0Var, i10, i11, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? -1 : i13, (i14 & 32) != 0 ? -1.0f : f10, (i14 & 64) != 0 ? -1.0f : f11);
    }
}
