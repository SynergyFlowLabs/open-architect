package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.z3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    @SourceDebugExtension({"SMAP\nLazyGridScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,75:1\n118#2:76\n35#2,5:77\n119#2:82\n*S KotlinDebug\n*F\n+ 1 LazyGridScrollScope.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScrollScopeKt$LazyLayoutScrollScope$1\n*L\n65#1:76\n65#1:77,5\n65#1:82\n*E\n"})
    public static final class a implements androidx.compose.foundation.lazy.layout.m1, z3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z3 f16835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x1 f16836b;

        a(z3 z3Var, x1 x1Var) {
            this.f16836b = x1Var;
            this.f16835a = z3Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int a() {
            return this.f16836b.L().c();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int c() {
            return this.f16836b.F();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int d() {
            x xVar = (x) CollectionsKt.lastOrNull((List) this.f16836b.L().h());
            if (xVar != null) {
                return xVar.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public void e(int i10, int i11) {
            this.f16836b.n0(i10, i11, true);
        }

        @Override // androidx.compose.foundation.gestures.z3
        public float f(float f10) {
            return this.f16835a.f(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int g(int i10, int i11) {
            Integer numValueOf;
            x xVar;
            n0 n0VarL = this.f16836b.L();
            int iB = 0;
            if (n0VarL.h().isEmpty()) {
                return 0;
            }
            int iC = c();
            if (i10 > d() || iC > i10) {
                int iB0 = this.f16836b.b0();
                iB = (o0.b(n0VarL) * (((i10 - c()) + ((iB0 - 1) * ((i10 < c() ? 1 : 0) != 0 ? -1 : 1))) / iB0)) - i();
            } else {
                List<x> listH = n0VarL.h();
                int size = listH.size();
                int i12 = 0;
                while (true) {
                    numValueOf = null;
                    if (i12 >= size) {
                        xVar = null;
                        break;
                    }
                    xVar = listH.get(i12);
                    if (xVar.getIndex() == i10) {
                        break;
                    }
                    i12++;
                }
                x xVar2 = xVar;
                if (n0VarL.getOrientation() == q3.Vertical) {
                    if (xVar2 != null) {
                        numValueOf = Integer.valueOf(androidx.compose.ui.unit.q.p(xVar2.g()));
                    }
                } else if (xVar2 != null) {
                    numValueOf = Integer.valueOf(androidx.compose.ui.unit.q.n(xVar2.g()));
                }
                if (numValueOf != null) {
                    iB = numValueOf.intValue();
                }
            }
            return iB + i11;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int i() {
            return this.f16836b.G();
        }
    }

    @NotNull
    public static final androidx.compose.foundation.lazy.layout.m1 a(@NotNull x1 x1Var, @NotNull z3 z3Var) {
        return new a(z3Var, x1Var);
    }
}
