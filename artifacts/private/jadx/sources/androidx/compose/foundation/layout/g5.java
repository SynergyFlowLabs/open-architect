package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
public interface g5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f16047a = b.f16053a;

    @androidx.compose.runtime.o2
    @SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,477:1\n93#2,4:478\n113#3:482\n113#3:483\n113#3:484\n113#3:485\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingValues$Absolute\n*L\n207#1:478,4\n200#1:482\n201#1:483\n202#1:484\n203#1:485\n*E\n"})
    public static final class a implements g5 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f16048f = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f16049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f16050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f16051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f16052e;

        public /* synthetic */ a(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, f11, f12, f13);
        }

        @androidx.compose.runtime.k7
        private static /* synthetic */ void e() {
        }

        @androidx.compose.runtime.k7
        private static /* synthetic */ void f() {
        }

        @androidx.compose.runtime.k7
        private static /* synthetic */ void g() {
        }

        @androidx.compose.runtime.k7
        private static /* synthetic */ void h() {
        }

        @Override // androidx.compose.foundation.layout.g5
        public float a() {
            return this.f16052e;
        }

        @Override // androidx.compose.foundation.layout.g5
        public float b(@NotNull androidx.compose.ui.unit.w wVar) {
            return this.f16049b;
        }

        @Override // androidx.compose.foundation.layout.g5
        public float c(@NotNull androidx.compose.ui.unit.w wVar) {
            return this.f16051d;
        }

        @Override // androidx.compose.foundation.layout.g5
        public float d() {
            return this.f16050c;
        }

        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!androidx.compose.ui.unit.h.x(this.f16049b, aVar.f16049b) || !androidx.compose.ui.unit.h.x(this.f16050c, aVar.f16050c) || !androidx.compose.ui.unit.h.x(this.f16051d, aVar.f16051d) || !androidx.compose.ui.unit.h.x(this.f16052e, aVar.f16052e)) {
                return false;
            }
            int i10 = 2 >> 1;
            return true;
        }

        public int hashCode() {
            return (((((androidx.compose.ui.unit.h.D(this.f16049b) * 31) + androidx.compose.ui.unit.h.D(this.f16050c)) * 31) + androidx.compose.ui.unit.h.D(this.f16051d)) * 31) + androidx.compose.ui.unit.h.D(this.f16052e);
        }

        @NotNull
        public String toString() {
            return "PaddingValues.Absolute(left=" + ((Object) androidx.compose.ui.unit.h.M(this.f16049b)) + ", top=" + ((Object) androidx.compose.ui.unit.h.M(this.f16050c)) + ", right=" + ((Object) androidx.compose.ui.unit.h.M(this.f16051d)) + ", bottom=" + ((Object) androidx.compose.ui.unit.h.M(this.f16052e)) + ')';
        }

        private a(float f10, float f11, float f12, float f13) {
            this.f16049b = f10;
            this.f16050c = f11;
            this.f16051d = f12;
            this.f16052e = f13;
            boolean z10 = true | false;
            if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
                x.a.f("Padding must be non-negative");
            }
        }

        public /* synthetic */ a(float f10, float f11, float f12, float f13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? androidx.compose.ui.unit.h.r(0) : f10, (i10 & 2) != 0 ? androidx.compose.ui.unit.h.r(0) : f11, (i10 & 4) != 0 ? androidx.compose.ui.unit.h.r(0) : f12, (i10 & 8) != 0 ? androidx.compose.ui.unit.h.r(0) : f13, null);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f16053a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private static final g5 f16054b = new a(0.0f, 0.0f, 0.0f, 0.0f, 15, null);

        static {
            int i10 = 4 & 0;
        }

        private b() {
        }

        @androidx.compose.runtime.k7
        public static /* synthetic */ void b() {
        }

        @androidx.compose.runtime.k7
        @NotNull
        public final g5 a() {
            return f16054b;
        }
    }

    float a();

    float b(@NotNull androidx.compose.ui.unit.w wVar);

    float c(@NotNull androidx.compose.ui.unit.w wVar);

    float d();
}
