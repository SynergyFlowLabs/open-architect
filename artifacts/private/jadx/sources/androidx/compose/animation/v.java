package androidx.compose.animation;

import androidx.compose.animation.core.t4;
import androidx.compose.animation.core.z3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function1<androidx.compose.ui.graphics.colorspace.c, z3<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v>> f13748a = a.f13749a;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.colorspace.c, z3<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13749a = new a();

        /* JADX INFO: renamed from: androidx.compose.animation.v$a$a, reason: collision with other inner class name */
        @SourceDebugExtension({"SMAP\nColorVectorConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$1\n+ 2 Color.kt\nandroidx/compose/ui/graphics/Color\n*L\n1#1,59:1\n219#2,7:60\n*S KotlinDebug\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$1\n*L\n35#1:60,7\n*E\n"})
        static final class C0068a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0068a f13750a = new C0068a();

            C0068a() {
                super(1);
            }

            public final androidx.compose.animation.core.v c(long j10) {
                long jU = androidx.compose.ui.graphics.q0.u(j10, androidx.compose.ui.graphics.colorspace.k.f37611a.H());
                return new androidx.compose.animation.core.v(androidx.compose.ui.graphics.q0.A(jU), androidx.compose.ui.graphics.q0.I(jU), androidx.compose.ui.graphics.q0.G(jU), androidx.compose.ui.graphics.q0.C(jU));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.animation.core.v invoke(androidx.compose.ui.graphics.q0 q0Var) {
                return c(q0Var.M());
            }
        }

        @SourceDebugExtension({"SMAP\nColorVectorConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2\n+ 2 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,59:1\n65#2,10:60\n65#2,10:70\n65#2,10:80\n65#2,10:90\n*S KotlinDebug\n*F\n+ 1 ColorVectorConverter.kt\nandroidx/compose/animation/ColorVectorConverterKt$ColorToVector$1$2\n*L\n40#1:60,10\n41#1:70,10\n42#1:80,10\n43#1:90,10\n*E\n"})
        static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.animation.core.v, androidx.compose.ui.graphics.q0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.graphics.colorspace.c f13751a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(androidx.compose.ui.graphics.colorspace.c cVar) {
                super(1);
                this.f13751a = cVar;
            }

            public final long c(androidx.compose.animation.core.v vVar) {
                float fG = vVar.g();
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
                if (fG > 1.0f) {
                    fG = 1.0f;
                }
                float fH = vVar.h();
                if (fH < -0.5f) {
                    fH = -0.5f;
                }
                float f10 = 0.5f;
                if (fH > 0.5f) {
                    fH = 0.5f;
                }
                float fI = vVar.i();
                float f11 = fI >= -0.5f ? fI : -0.5f;
                if (f11 <= 0.5f) {
                    f10 = f11;
                }
                float f12 = vVar.f();
                float f13 = f12 >= 0.0f ? f12 : 0.0f;
                return androidx.compose.ui.graphics.q0.u(androidx.compose.ui.graphics.s0.a(fG, fH, f10, f13 <= 1.0f ? f13 : 1.0f, androidx.compose.ui.graphics.colorspace.k.f37611a.H()), this.f13751a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.q0 invoke(androidx.compose.animation.core.v vVar) {
                return androidx.compose.ui.graphics.q0.n(c(vVar));
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final z3<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v> invoke(androidx.compose.ui.graphics.colorspace.c cVar) {
            return t4.K(C0068a.f13750a, new b(cVar));
        }
    }

    @NotNull
    public static final Function1<androidx.compose.ui.graphics.colorspace.c, z3<androidx.compose.ui.graphics.q0, androidx.compose.animation.core.v>> a(@NotNull androidx.compose.ui.graphics.q0.a aVar) {
        return f13748a;
    }
}
