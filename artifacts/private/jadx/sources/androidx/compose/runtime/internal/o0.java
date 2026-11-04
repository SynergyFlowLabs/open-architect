package androidx.compose.runtime.internal;

import androidx.compose.runtime.m5;
import androidx.compose.runtime.n5;
import java.util.Set;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/PausedCompositionRemembers\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,293:1\n1107#2:294\n1085#2,2:295\n424#3,8:297\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/PausedCompositionRemembers\n*L\n44#1:294\n44#1:295,2\n47#1:297,8\n*E\n"})
public final class o0 implements m5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f36059c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<m5> f36060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.collection.d<n5> f36061b = new androidx.compose.runtime.collection.d<>(new n5[16], 0);

    public o0(@NotNull Set<m5> set) {
        this.f36060a = set;
    }

    @NotNull
    public final androidx.compose.runtime.collection.d<n5> a() {
        return this.f36061b;
    }

    @Override // androidx.compose.runtime.m5
    public void i() {
        androidx.compose.runtime.collection.d<n5> dVar = this.f36061b;
        n5[] n5VarArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            m5 m5VarB = n5VarArr[i10].b();
            this.f36060a.remove(m5VarB);
            m5VarB.i();
        }
    }

    @Override // androidx.compose.runtime.m5
    public void j() {
    }

    @Override // androidx.compose.runtime.m5
    public void k() {
    }
}
