package androidx.compose.ui.platform;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n*L\n1#1,123:1\n35#2,3:124\n39#2:128\n425#3:127\n*S KotlinDebug\n*F\n+ 1 SemanticsUtils.android.kt\nandroidx/compose/ui/platform/SemanticsNodeCopy\n*L\n46#1:124,3\n46#1:128\n47#1:127\n*E\n"})
public final class w3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40947c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final SemanticsConfiguration f40948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.u1 f40949b;

    public w3(@NotNull androidx.compose.ui.semantics.u uVar, @NotNull androidx.collection.j0<androidx.compose.ui.semantics.w> j0Var) {
        this.f40948a = uVar.F();
        this.f40949b = new androidx.collection.u1(uVar.B().size());
        List<androidx.compose.ui.semantics.u> listB = uVar.B();
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.semantics.u uVar2 = listB.get(i10);
            if (j0Var.e(uVar2.s())) {
                this.f40949b.G(uVar2.s());
            }
        }
    }

    @NotNull
    public final androidx.collection.u1 a() {
        return this.f40949b;
    }

    @NotNull
    public final SemanticsConfiguration b() {
        return this.f40948a;
    }
}
