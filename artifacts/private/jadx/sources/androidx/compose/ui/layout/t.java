package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/HorizontalRuler\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n54#2:165\n85#3:166\n53#3,3:168\n70#3:172\n30#4:167\n69#5:171\n22#6:173\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/HorizontalRuler\n*L\n115#1:165\n115#1:166\n115#1:168,3\n116#1:172\n115#1:167\n116#1:171\n116#1:173\n*E\n"})
public final class t extends s2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f39543c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39544d = 0;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.t$a$a, reason: collision with other inner class name */
        static final class C0305a extends kotlin.jvm.internal.l0 implements Function2<i2.a, Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t[] f39545a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0305a(t[] tVarArr) {
                super(2);
                this.f39545a = tVarArr;
            }

            public final Float c(i2.a aVar, float f10) {
                return Float.valueOf(t2.b(aVar, true, this.f39545a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(i2.a aVar, Float f10) {
                return c(aVar, f10.floatValue());
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function2<i2.a, Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t[] f39546a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t[] tVarArr) {
                super(2);
                this.f39546a = tVarArr;
            }

            public final Float c(i2.a aVar, float f10) {
                return Float.valueOf(t2.b(aVar, false, this.f39546a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(i2.a aVar, Float f10) {
                return c(aVar, f10.floatValue());
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final t a(@NotNull Function2<? super i2.a, ? super Float, Float> function2) {
            return new t(function2, null);
        }

        @NotNull
        public final t b(@NotNull t... tVarArr) {
            return new t(new C0305a(tVarArr), null);
        }

        @NotNull
        public final t c(@NotNull t... tVarArr) {
            return new t(new b(tVarArr), null);
        }

        private a() {
        }
    }

    public /* synthetic */ t(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.s2
    public float a(float f10, @NotNull g0 g0Var, @NotNull g0 g0Var2) {
        return Float.intBitsToFloat((int) (g0Var2.r0(g0Var, n0.g.g((((long) Float.floatToRawIntBits(((int) (g0Var.a() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a));
    }

    private t(Function2<? super i2.a, ? super Float, Float> function2) {
        super(function2, null);
    }

    public t() {
        this(null);
    }
}
