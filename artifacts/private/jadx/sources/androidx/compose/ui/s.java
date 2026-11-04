package androidx.compose.ui;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.node.k1;
import androidx.compose.ui.node.l0;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import androidx.compose.ui.node.w1;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nFrameRate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameRate.kt\nandroidx/compose/ui/FrameRateModifierNode\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,156:1\n35#2,5:157\n*S KotlinDebug\n*F\n+ 1 FrameRate.kt\nandroidx/compose/ui/FrameRateModifierNode\n*L\n151#1:157,5\n*E\n"})
public final class s extends a0.d implements p2, androidx.compose.ui.node.t {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f41002w = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f41003s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f41004t = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final String f41005v = "TRAVERSAL_NODE_KEY_FRAME_RATE_MODIFIER_NODE";

    public s(float f10) {
        this.f41003s = f10;
    }

    public final void A9(boolean z10) {
        this.f41004t = z10;
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        w1 w1VarH4;
        if (this.f41004t) {
            k1 k1VarP8 = P8();
            if (k1VarP8 != null && (w1VarH4 = k1VarP8.H4()) != null) {
                w1VarH4.setFrameRate(this.f41003s);
            }
            k1 k1VarP9 = P8();
            y9(k1VarP9 != null ? k1VarP9.Y4() : null, this.f41003s);
            this.f41004t = false;
        }
        cVar.E4();
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.f41004t = true;
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        s sVar = (s) q2.b(this);
        if (sVar != null) {
            k1 k1VarP8 = P8();
            y9(k1VarP8 != null ? k1VarP8.Y4() : null, sVar.f41003s);
        } else {
            k1 k1VarP9 = P8();
            y9(k1VarP9 != null ? k1VarP9.Y4() : null, 0.0f);
        }
    }

    public final float v9() {
        return this.f41003s;
    }

    public final boolean w9() {
        return this.f41004t;
    }

    @Override // androidx.compose.ui.node.p2
    @NotNull
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public String R4() {
        return this.f41005v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y9(@Nullable k1 k1Var, float f10) {
        l0 l0VarI4;
        List<l0> listZ;
        w1 w1VarH4;
        k1 k1VarY4 = k1Var;
        while (true) {
            if (k1VarY4 == null) {
                if (k1Var == null) {
                    k1Var = P8();
                }
                if (k1Var == null || (l0VarI4 = k1Var.i4()) == null || (listZ = l0VarI4.Z()) == null) {
                    return;
                }
                int size = listZ.size();
                for (int i10 = 0; i10 < size; i10++) {
                    y9(listZ.get(i10).F0(), f10);
                }
                return;
            }
            if (k1Var != null && (w1VarH4 = k1Var.H4()) != null) {
                if (w1VarH4.getFrameRate() != 0.0f && !w1VarH4.m()) {
                    return;
                }
                w1VarH4.setFrameRate(f10);
                w1VarH4.setFrameRateFromParent((f10 == 0.0f ? 1 : 0) ^ 1);
            }
            k1VarY4 = k1VarY4.Y4();
        }
    }

    public final void z9(float f10) {
        this.f41003s = f10;
    }
}
