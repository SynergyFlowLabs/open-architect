package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nRuler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/VerticalRuler\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,164:1\n59#2:165\n90#3:166\n53#3,3:168\n60#3:172\n30#4:167\n65#5:171\n22#6:173\n*S KotlinDebug\n*F\n+ 1 Ruler.kt\nandroidx/compose/ui/layout/VerticalRuler\n*L\n60#1:165\n60#1:166\n60#1:168,3\n61#1:172\n60#1:167\n61#1:171\n61#1:173\n*E\n"})
public final class i3 extends s2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f39375c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f39376d = 0;

    public static final class a {

        /* JADX INFO: renamed from: androidx.compose.ui.layout.i3$a$a, reason: collision with other inner class name */
        static final class C0303a extends kotlin.jvm.internal.l0 implements Function2<i2.a, Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i3[] f39377a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0303a(i3[] i3VarArr) {
                super(2);
                this.f39377a = i3VarArr;
            }

            public final Float c(i2.a aVar, float f10) {
                return Float.valueOf(t2.b(aVar, true, this.f39377a, f10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Float invoke(i2.a aVar, Float f10) {
                return c(aVar, f10.floatValue());
            }
        }

        static final class b extends kotlin.jvm.internal.l0 implements Function2<i2.a, Float, Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i3[] f39378a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(i3[] i3VarArr) {
                super(2);
                this.f39378a = i3VarArr;
            }

            public final Float c(i2.a aVar, float f10) {
                return Float.valueOf(t2.b(aVar, false, this.f39378a, f10));
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
        public final i3 a(@NotNull Function2<? super i2.a, ? super Float, Float> function2) {
            return new i3(function2, null);
        }

        @NotNull
        public final i3 b(@NotNull i3... i3VarArr) {
            return a(new C0303a(i3VarArr));
        }

        @NotNull
        public final i3 c(@NotNull i3... i3VarArr) {
            return a(new b(i3VarArr));
        }

        private a() {
        }
    }

    public /* synthetic */ i3(Function2 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2);
    }

    @Override // androidx.compose.ui.layout.s2
    public float a(float f10, @NotNull g0 g0Var, @NotNull g0 g0Var2) {
        return Float.intBitsToFloat((int) (g0Var2.r0(g0Var, n0.g.g((((long) Float.floatToRawIntBits(((int) (g0Var.a() & com.rabbitmq.client.k0.f265952a)) / 2.0f)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f10) << 32))) >> 32));
    }

    private i3(Function2<? super i2.a, ? super Float, Float> function2) {
        super(function2, null);
    }

    public i3() {
        this(null);
    }
}
