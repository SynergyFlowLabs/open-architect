package kotlinx.coroutines;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n273#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/NodeList\n*L\n1510#1:1584,6\n*E\n"})
public final class b3 extends kotlinx.coroutines.internal.d0 implements i2 {
    @NotNull
    public final String E(@NotNull String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        Object objJ = j();
        Intrinsics.checkNotNull(objJ, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        boolean z10 = true;
        for (kotlinx.coroutines.internal.f0 f0VarK = (kotlinx.coroutines.internal.f0) objJ; !Intrinsics.areEqual(f0VarK, this); f0VarK = f0VarK.k()) {
            if (f0VarK instanceof v2) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(f0VarK);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.i2
    @NotNull
    public b3 a() {
        return this;
    }

    @Override // kotlinx.coroutines.i2
    public boolean isActive() {
        return true;
    }

    @Override // kotlinx.coroutines.internal.f0
    @NotNull
    public String toString() {
        return super.toString();
    }
}
