package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.node.j;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class a<T> extends l0 implements Function1<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i1.h<T> f38948a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i1.h<T> hVar) {
            super(1);
            this.f38948a = hVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p2 p2Var) {
            boolean z10;
            if (p2Var.w().a9()) {
                this.f38948a.f312751a = p2Var;
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends p2> T b(T t10) {
        i1.h hVar = new i1.h();
        q2.d(t10, new a(hVar));
        return (T) hVar.f312751a;
    }

    @NotNull
    public static final j c(@NotNull androidx.compose.ui.input.nestedscroll.a aVar, @Nullable b bVar) {
        return new d(aVar, bVar);
    }
}
