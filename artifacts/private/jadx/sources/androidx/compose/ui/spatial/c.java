package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.h2;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.m;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.t;
import androidx.compose.ui.node.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nRectListDebugger.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebuggerModifierNode\n+ 2 RectList.kt\nandroidx/compose/ui/spatial/RectList\n+ 3 RectList.kt\nandroidx/compose/ui/spatial/RectListKt\n*L\n1#1,92:1\n541#2,10:93\n551#2:104\n552#2:106\n553#2:108\n554#2:110\n556#2,3:112\n860#3:103\n893#3:105\n895#3:107\n893#3:109\n895#3:111\n*S KotlinDebug\n*F\n+ 1 RectListDebugger.android.kt\nandroidx/compose/ui/spatial/RectListDebuggerModifierNode\n*L\n87#1:93,10\n87#1:104\n87#1:106\n87#1:108\n87#1:110\n87#1:112,3\n87#1:103\n87#1:105\n87#1:107\n87#1:109\n87#1:111\n*E\n"})
final class c extends a0.d implements t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private Paint f41237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    private Object f41238t;

    static final class a extends l0 implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            u.a(c.this);
        }
    }

    public c() {
        h2 h2VarA = m.a();
        h2VarA.S(q0.f38131b.q());
        h2VarA.G(j2.f37801b.b());
        this.f41237s = h2VarA.D();
    }

    @Override // androidx.compose.ui.node.t
    public void P(@NotNull androidx.compose.ui.graphics.drawscope.c cVar) {
        b bVarF = k.v(this).getRectManager().f();
        Canvas canvasD = androidx.compose.ui.graphics.c.d(cVar.Z3().f());
        Paint paint = this.f41237s;
        long[] jArr = bVarF.f41234a;
        int i10 = bVarF.f41236c;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            long j10 = jArr[i11];
            long j11 = jArr[i11 + 1];
            long j12 = jArr[i11 + 2];
            canvasD.drawRect((int) (j10 >> 32), (int) j10, (int) (j11 >> 32), (int) j11, paint);
        }
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        this.f41238t = k.v(this).getRectManager().q(new a());
    }

    @Override // androidx.compose.ui.a0.d
    public void f9() {
        k.v(this).getRectManager().v(this.f41238t);
    }

    @Nullable
    public final Object v9() {
        return this.f41238t;
    }

    public final void w9(@Nullable Object obj) {
        this.f41238t = obj;
    }
}
