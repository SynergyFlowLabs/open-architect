package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFlowLayoutBuildingBlocks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n+ 2 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,183:1\n213#2:184\n213#2:185\n*S KotlinDebug\n*F\n+ 1 FlowLayoutBuildingBlocks.kt\nandroidx/compose/foundation/layout/FlowLayoutBuildingBlocks\n*L\n114#1:184\n161#1:185\n*E\n"})
public final class k2 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f16173g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f16174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final y2 f16175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f16176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f16179f;

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f16180e = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final androidx.compose.ui.layout.z0 f16181a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final androidx.compose.ui.layout.i2 f16182b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f16183c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f16184d;

        public /* synthetic */ a(androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.i2 i2Var, long j10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z0Var, i2Var, j10, z10);
        }

        @NotNull
        public final androidx.compose.ui.layout.z0 a() {
            return this.f16181a;
        }

        public final long b() {
            return this.f16183c;
        }

        public final boolean c() {
            return this.f16184d;
        }

        @Nullable
        public final androidx.compose.ui.layout.i2 d() {
            return this.f16182b;
        }

        public final void e(boolean z10) {
            this.f16184d = z10;
        }

        private a(androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.i2 i2Var, long j10, boolean z10) {
            this.f16181a = z0Var;
            this.f16182b = i2Var;
            this.f16183c = j10;
            this.f16184d = z10;
        }

        public /* synthetic */ a(androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.i2 i2Var, long j10, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(z0Var, i2Var, j10, (i10 & 8) != 0 ? true : z10, null);
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f16185c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f16186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f16187b;

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z10 = false;
            this(z10, z10, 3, null);
        }

        public final boolean a() {
            return this.f16187b;
        }

        public final boolean b() {
            return this.f16186a;
        }

        public b(boolean z10, boolean z11) {
            this.f16186a = z10;
            this.f16187b = z11;
        }

        public /* synthetic */ b(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
        }
    }

    public /* synthetic */ k2(int i10, y2 y2Var, long j10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, y2Var, j10, i11, i12, i13);
    }

    @Nullable
    public final a a(@NotNull b bVar, boolean z10, int i10, int i11, int i12, int i13) {
        a aVarH;
        if (!bVar.a() || (aVarH = this.f16175b.h(z10, i10, i11)) == null) {
            return null;
        }
        aVarH.e(i10 >= 0 && (i13 == 0 || (i12 - androidx.collection.e0.h(aVarH.b()) >= 0 && i13 < this.f16174a)));
        return aVarH;
    }

    @NotNull
    public final b b(boolean z10, int i10, long j10, @Nullable androidx.collection.e0 e0Var, int i11, int i12, int i13, boolean z11, boolean z12) {
        int i14 = i12 + i13;
        if (e0Var == null) {
            return new b(true, true);
        }
        if (this.f16175b.p() != u2.a.Visible && (i11 >= this.f16177d || androidx.collection.e0.i(j10) - androidx.collection.e0.i(e0Var.l()) < 0)) {
            return new b(true, true);
        }
        if (i10 != 0 && (i10 >= this.f16174a || androidx.collection.e0.h(j10) - androidx.collection.e0.h(e0Var.l()) < 0)) {
            return z11 ? new b(true, true) : new b(true, b(z10, 0, androidx.collection.e0.d(androidx.compose.ui.unit.b.p(this.f16176c), (androidx.collection.e0.i(j10) - this.f16179f) - i13), androidx.collection.e0.a(androidx.collection.e0.d(androidx.collection.e0.h(e0Var.l()) - this.f16178e, androidx.collection.e0.i(e0Var.l()))), i11 + 1, i14, 0, true, false).a());
        }
        int iMax = i12 + Math.max(i13, androidx.collection.e0.i(e0Var.l()));
        androidx.collection.e0 e0VarI = z12 ? null : this.f16175b.i(z10, i11, iMax);
        if (e0VarI != null) {
            e0VarI.l();
            if (i10 + 1 >= this.f16174a || ((androidx.collection.e0.h(j10) - androidx.collection.e0.h(e0Var.l())) - this.f16178e) - androidx.collection.e0.h(e0VarI.l()) < 0) {
                if (z12) {
                    return new b(true, true);
                }
                b bVarB = b(false, 0, androidx.collection.e0.d(androidx.compose.ui.unit.b.p(this.f16176c), (androidx.collection.e0.i(j10) - this.f16179f) - Math.max(i13, androidx.collection.e0.i(e0Var.l()))), e0VarI, i11 + 1, iMax, 0, true, true);
                return new b(bVarB.a(), bVarB.a());
            }
        }
        return new b(false, false);
    }

    private k2(int i10, y2 y2Var, long j10, int i11, int i12, int i13) {
        this.f16174a = i10;
        this.f16175b = y2Var;
        this.f16176c = j10;
        this.f16177d = i11;
        this.f16178e = i12;
        this.f16179f = i13;
    }
}
