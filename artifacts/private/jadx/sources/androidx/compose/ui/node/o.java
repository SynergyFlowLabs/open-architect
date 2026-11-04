package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Comparator<l0> f39935a = new a();

    public static final class a implements Comparator<l0> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(l0 l0Var, l0 l0Var2) {
            int iCompare = Intrinsics.compare(l0Var.a0(), l0Var2.a0());
            return iCompare != 0 ? iCompare : Intrinsics.compare(l0Var.hashCode(), l0Var2.hashCode());
        }
    }
}
