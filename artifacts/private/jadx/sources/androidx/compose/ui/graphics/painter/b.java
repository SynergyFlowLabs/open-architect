package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.drawscope.f;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.r0;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import n0.g;
import n0.j;
import n0.k;
import n0.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 7 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,198:1\n57#2:199\n61#2:202\n57#2:208\n61#2:211\n57#2:213\n61#2:216\n60#3:200\n70#3:203\n60#3:209\n70#3:212\n60#3:214\n70#3:217\n53#3,3:219\n22#4:201\n22#4:204\n22#4:210\n22#4:215\n68#5,3:205\n233#5:222\n72#5,3:230\n33#6:218\n95#7,7:223\n*S KotlinDebug\n*F\n+ 1 Painter.kt\nandroidx/compose/ui/graphics/painter/Painter\n*L\n181#1:199\n182#1:202\n184#1:208\n184#1:211\n186#1:213\n186#1:216\n181#1:200\n182#1:203\n184#1:209\n184#1:212\n186#1:214\n186#1:217\n186#1:219,3\n181#1:201\n182#1:204\n184#1:210\n186#1:215\n178#1:205,3\n188#1:222\n178#1:230,3\n186#1:218\n189#1:223,7\n*E\n"})
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private h2 f38117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private r0 f38119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f38120d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private w f38121e = w.Ltr;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function1<f, Unit> f38122f = new a();

    static final class a extends l0 implements Function1<f, Unit> {
        a() {
            super(1);
        }

        public final void c(f fVar) {
            b.this.n(fVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
            c(fVar);
            return Unit.f312394a;
        }
    }

    private final void d(float f10) {
        if (this.f38120d == f10) {
            return;
        }
        if (!a(f10)) {
            if (f10 == 1.0f) {
                h2 h2Var = this.f38117a;
                if (h2Var != null) {
                    h2Var.setAlpha(f10);
                }
                this.f38118b = false;
            } else {
                m().setAlpha(f10);
                this.f38118b = true;
            }
        }
        this.f38120d = f10;
    }

    private final void e(r0 r0Var) {
        if (Intrinsics.areEqual(this.f38119c, r0Var)) {
            return;
        }
        if (!b(r0Var)) {
            if (r0Var == null) {
                h2 h2Var = this.f38117a;
                if (h2Var != null) {
                    h2Var.f(null);
                }
                this.f38118b = false;
            } else {
                m().f(r0Var);
                int i10 = 3 & 1;
                this.f38118b = true;
            }
        }
        this.f38119c = r0Var;
    }

    private final void f(w wVar) {
        if (this.f38121e != wVar) {
            c(wVar);
            this.f38121e = wVar;
        }
    }

    public static /* synthetic */ void h(b bVar, f fVar, long j10, float f10, r0 r0Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: draw-x_KDEd0");
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 4) != 0) {
            r0Var = null;
        }
        bVar.g(fVar, j10, f11, r0Var);
    }

    private final h2 m() {
        h2 h2Var = this.f38117a;
        if (h2Var != null) {
            return h2Var;
        }
        h2 h2VarA = m.a();
        this.f38117a = h2VarA;
        return h2VarA;
    }

    protected boolean a(float f10) {
        return false;
    }

    protected boolean b(@Nullable r0 r0Var) {
        return false;
    }

    protected boolean c(@NotNull w wVar) {
        return false;
    }

    public final void g(@NotNull f fVar, long j10, float f10, @Nullable r0 r0Var) {
        d(f10);
        e(r0Var);
        f(fVar.getLayoutDirection());
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32)) - Float.intBitsToFloat(i10);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.d() & k0.f265952a));
        int i11 = (int) (j10 & k0.f265952a);
        float fIntBitsToFloat3 = fIntBitsToFloat2 - Float.intBitsToFloat(i11);
        fVar.Z3().i().i(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat3);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.f38118b) {
                        long jE = g.f332700b.e();
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i10);
                        j jVarC = k.c(jE, n.f((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11))) & k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat4) << 32)));
                        androidx.compose.ui.graphics.k0 k0VarF = fVar.Z3().f();
                        try {
                            k0VarF.l(jVarC, m());
                            n(fVar);
                            k0VarF.B();
                        } catch (Throwable th2) {
                            k0VarF.B();
                            throw th2;
                        }
                    } else {
                        n(fVar);
                    }
                }
            } catch (Throwable th3) {
                fVar.Z3().i().i(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat3);
                throw th3;
            }
        }
        fVar.Z3().i().i(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat3);
    }

    public abstract long l();

    protected abstract void n(@NotNull f fVar);
}
