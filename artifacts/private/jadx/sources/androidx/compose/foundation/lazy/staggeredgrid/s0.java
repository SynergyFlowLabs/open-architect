package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.z3;
import androidx.compose.foundation.lazy.layout.m1;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    @SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,76:1\n1#2:77\n118#3:78\n35#3,5:79\n119#3:84\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollScopeKt$LazyLayoutScrollScope$1\n*L\n60#1:78\n60#1:79,5\n60#1:84\n*E\n"})
    public static final class a implements m1, z3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z3 f18004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a1 f18005b;

        a(z3 z3Var, a1 a1Var) {
            this.f18005b = a1Var;
            this.f18004a = z3Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int a() {
            return this.f18005b.L().c();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int c() {
            return this.f18005b.E();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int d() {
            q qVar = (q) CollectionsKt.lastOrNull((List) this.f18005b.L().h());
            if (qVar != null) {
                return qVar.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public void e(int i10, int i11) {
            this.f18005b.m0(i10, i11, true);
        }

        @Override // androidx.compose.foundation.gestures.z3
        public float f(float f10) {
            return this.f18004a.f(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int g(int i10, int i11) {
            q qVar;
            int iP;
            c0 c0VarL = this.f18005b.L();
            int i12 = 0;
            if (c0VarL.h().isEmpty()) {
                return 0;
            }
            List<q> listH = c0VarL.h();
            int size = listH.size();
            while (true) {
                if (i12 >= size) {
                    qVar = null;
                    break;
                }
                qVar = listH.get(i12);
                if (qVar.getIndex() == i10) {
                    break;
                }
                i12++;
            }
            q qVar2 = qVar;
            if (qVar2 == null) {
                int iF = m0.f(c0VarL);
                int iJ = this.f18005b.J();
                iP = (iF * ((i10 / iJ) - (c() / iJ))) - i();
            } else {
                iP = c0VarL.getOrientation() == q3.Vertical ? androidx.compose.ui.unit.q.p(qVar2.g()) : androidx.compose.ui.unit.q.n(qVar2.g());
            }
            return iP + i11;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int i() {
            return this.f18005b.F();
        }
    }

    @NotNull
    public static final m1 a(@NotNull a1 a1Var, @NotNull z3 z3Var) {
        return new a(z3Var, a1Var);
    }
}
