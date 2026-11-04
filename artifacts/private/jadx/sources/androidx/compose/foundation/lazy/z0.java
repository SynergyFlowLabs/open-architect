package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.z3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    @SourceDebugExtension({"SMAP\nLazyListScrollScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,67:1\n118#2:68\n35#2,5:69\n119#2:74\n*S KotlinDebug\n*F\n+ 1 LazyListScrollScope.kt\nandroidx/compose/foundation/lazy/LazyListScrollScopeKt$LazyLayoutScrollScope$1\n*L\n61#1:68\n61#1:69,5\n61#1:74\n*E\n"})
    public static final class a implements androidx.compose.foundation.lazy.layout.m1, z3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z3 f18072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j1 f18073b;

        a(z3 z3Var, j1 j1Var) {
            this.f18073b = j1Var;
            this.f18072a = z3Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int a() {
            return this.f18073b.K().c();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int c() {
            return this.f18073b.E();
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int d() {
            v vVar = (v) CollectionsKt.lastOrNull((List) this.f18073b.K().h());
            if (vVar != null) {
                return vVar.getIndex();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public void e(int i10, int i11) {
            this.f18073b.k0(i10, i11, true);
        }

        @Override // androidx.compose.foundation.gestures.z3
        public float f(float f10) {
            return this.f18072a.f(f10);
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int g(int i10, int i11) {
            v vVar;
            f0 f0VarK = this.f18073b.K();
            int iA = 0;
            if (f0VarK.h().isEmpty()) {
                return 0;
            }
            int iC = c();
            if (i10 > d() || iC > i10) {
                iA = (g0.a(f0VarK) * (i10 - c())) - i();
            } else {
                List<v> listH = f0VarK.h();
                int size = listH.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        vVar = null;
                        break;
                    }
                    vVar = listH.get(i12);
                    if (vVar.getIndex() == i10) {
                        break;
                    }
                    i12++;
                }
                v vVar2 = vVar;
                if (vVar2 != null) {
                    iA = vVar2.getOffset();
                }
            }
            return iA + i11;
        }

        @Override // androidx.compose.foundation.lazy.layout.m1
        public int i() {
            return this.f18073b.F();
        }
    }

    @NotNull
    public static final androidx.compose.foundation.lazy.layout.m1 a(@NotNull j1 j1Var, @NotNull z3 z3Var) {
        return new a(z3Var, j1Var);
    }
}
