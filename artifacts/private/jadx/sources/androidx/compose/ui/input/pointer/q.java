package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.b1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n35#2,5:256\n35#2,5:261\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n125#1:256,5\n147#1:261,5\n*E\n"})
public final class q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f39105g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<c0> f39106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final i f39107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f39108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f39109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f39111f;

    public q(@NotNull List<c0> list, @Nullable i iVar) {
        this.f39106a = list;
        this.f39107b = iVar;
        MotionEvent motionEventI = i();
        this.f39108c = motionEventI != null ? motionEventI.getClassification() : 0;
        MotionEvent motionEventI2 = i();
        this.f39109d = p.b(motionEventI2 != null ? motionEventI2.getButtonState() : 0);
        MotionEvent motionEventI3 = i();
        this.f39110e = q0.b(motionEventI3 != null ? motionEventI3.getMetaState() : 0);
        this.f39111f = a();
    }

    private final int a() {
        MotionEvent motionEventI = i();
        if (motionEventI == null) {
            List<c0> list = this.f39106a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = list.get(i10);
                if (r.e(c0Var)) {
                    return u.f39127b.e();
                }
                if (r.c(c0Var)) {
                    return u.f39127b.d();
                }
            }
            return u.f39127b.c();
        }
        int actionMasked = motionEventI.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            return u.f39127b.f();
                        case 9:
                            return u.f39127b.a();
                        case 10:
                            return u.f39127b.b();
                        default:
                            return u.f39127b.g();
                    }
                }
                return u.f39127b.c();
            }
            return u.f39127b.e();
        }
        return u.f39127b.d();
    }

    @NotNull
    public final List<c0> b() {
        return this.f39106a;
    }

    @NotNull
    public final q c(@NotNull List<c0> list, @Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new q(list, null);
        }
        if (Intrinsics.areEqual(motionEvent, i())) {
            return new q(list, this.f39107b);
        }
        b1 b1Var = new b1(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            c0 c0Var = list.get(i10);
            b1Var.n(c0Var.s(), c0Var);
            long jS = c0Var.s();
            long jD = c0Var.D();
            long jU = c0Var.u();
            long jU2 = c0Var.u();
            boolean zW = c0Var.w();
            float fX = c0Var.x();
            int iC = c0Var.C();
            i iVar = this.f39107b;
            int i11 = i10;
            arrayList.add(new f0(jS, jD, jU, jU2, zW, fX, iC, iVar != null && iVar.a(c0Var.s()), null, 0L, 0L, 1792, null));
            i10 = i11 + 1;
        }
        return new q(list, new i(b1Var, new e0(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    public final int d() {
        return this.f39109d;
    }

    @NotNull
    public final List<c0> e() {
        return this.f39106a;
    }

    public final int f() {
        return this.f39108c;
    }

    @Nullable
    public final i g() {
        return this.f39107b;
    }

    public final int h() {
        return this.f39110e;
    }

    @Nullable
    public final MotionEvent i() {
        i iVar = this.f39107b;
        if (iVar != null) {
            return iVar.c();
        }
        return null;
    }

    public final int j() {
        return this.f39111f;
    }

    public final void k(int i10) {
        this.f39111f = i10;
    }

    public q(@NotNull List<c0> list) {
        this(list, null);
    }
}
