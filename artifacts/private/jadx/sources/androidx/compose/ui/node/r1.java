package androidx.compose.ui.node;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class r1 {
    public static final <T extends androidx.compose.ui.a0.d & q1> void a(@NotNull T t10, @NotNull Function0<Unit> function0) {
        s1 s1VarV8 = t10.V8();
        if (s1VarV8 == null) {
            s1VarV8 = new s1(t10);
            t10.q9(s1VarV8);
        }
        k.v(t10).getSnapshotObserver().i(s1VarV8, s1.f39996b.a(), function0);
    }
}
