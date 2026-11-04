package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f17453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f17454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f17455c;

        a(l0 l0Var, int i10, Object obj) {
            this.f17453a = l0Var;
            this.f17454b = i10;
            this.f17455c = obj;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(980966366, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:126)");
            }
            this.f17453a.i(this.f17454b, this.f17455c, c0Var, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final void b(final l0 l0Var, final Object obj, final int i10, final Object obj2, androidx.compose.runtime.c0 c0Var, final int i11) {
        int i12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1439843069);
        if ((i11 & 6) == 0) {
            i12 = (c0VarR.D(l0Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0VarR.D(obj) ? 32 : 16;
        }
        if ((i11 & a5.S0) == 0) {
            i12 |= c0VarR.K(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c0VarR.D(obj2) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1439843069, i12, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:124)");
            }
            ((androidx.compose.runtime.saveable.m) obj).e(obj2, androidx.compose.runtime.internal.w.e(980966366, true, new a(l0Var, i10, obj2), c0VarR, 54), c0VarR, 48);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.lazy.layout.j0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return k0.c(l0Var, obj, i10, obj2, i11, (androidx.compose.runtime.c0) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(l0 l0Var, Object obj, int i10, Object obj2, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        b(l0Var, obj, i10, obj2, c0Var, t4.a(i11 | 1));
        return Unit.f312394a;
    }
}
