package androidx.compose.ui.draganddrop;

import androidx.compose.ui.layout.g0;
import androidx.compose.ui.layout.h0;
import androidx.compose.ui.node.p2;
import androidx.compose.ui.node.q2;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.b1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDragAndDropNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,493:1\n71#2:494\n65#2:495\n73#2:498\n69#2:499\n65#2:505\n69#2:508\n60#3:496\n70#3:500\n85#3:502\n90#3:504\n60#3:506\n70#3:509\n22#4:497\n22#4:507\n54#5:501\n59#5:503\n*S KotlinDebug\n*F\n+ 1 DragAndDropNode.kt\nandroidx/compose/ui/draganddrop/DragAndDropNodeKt\n*L\n460#1:494\n460#1:495\n460#1:498\n460#1:499\n467#1:505\n467#1:508\n460#1:496\n460#1:500\n464#1:502\n465#1:504\n467#1:506\n467#1:509\n460#1:497\n467#1:507\n464#1:501\n465#1:503\n*E\n"})
public final class f {

    static final class a extends l0 implements Function1<androidx.compose.ui.draganddrop.b, i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Boolean> f37206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f37207b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, i iVar) {
            super(1);
            this.f37206a = function1;
            this.f37207b = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final i invoke(androidx.compose.ui.draganddrop.b bVar) {
            if (this.f37206a.invoke(bVar).booleanValue()) {
                return this.f37207b;
            }
            return null;
        }
    }

    static final class b extends l0 implements Function1<androidx.compose.ui.draganddrop.b, i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.ui.draganddrop.b, Boolean> f37208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f37209b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, i iVar) {
            super(1);
            this.f37208a = function1;
            this.f37209b = iVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final i invoke(androidx.compose.ui.draganddrop.b bVar) {
            if (this.f37208a.invoke(bVar).booleanValue()) {
                return this.f37209b;
            }
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> extends l0 implements Function1<T, p2.a.EnumC0311a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f37210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1.h<T> f37211b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super T, Boolean> function1, i1.h<T> hVar) {
            super(1);
            this.f37210a = function1;
            this.f37211b = hVar;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Landroidx/compose/ui/node/p2$a$a; */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p2.a.EnumC0311a invoke(p2 p2Var) {
            if (!this.f37210a.invoke(p2Var).booleanValue()) {
                return p2.a.EnumC0311a.ContinueTraversal;
            }
            this.f37211b.f312751a = p2Var;
            return p2.a.EnumC0311a.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.l(message = "Use DragAndDropSourceModifierNode instead", replaceWith = @b1(expression = "DragAndDropSourceModifierNode", imports = {}))
    @NotNull
    public static final d a() {
        return new e(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlin.l(message = "Use DragAndDropTargetModifierNode instead", replaceWith = @b1(expression = "DragAndDropTargetModifierNode", imports = {}))
    @NotNull
    public static final d b(@NotNull Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, @NotNull i iVar) {
        return new e(null, new a(function1, iVar), 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final g c(@NotNull Function2<? super h, ? super n0.g, Unit> function2) {
        return new e(function2, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final j d(@NotNull Function1<? super androidx.compose.ui.draganddrop.b, Boolean> function1, @NotNull i iVar) {
        return new e(null, new b(function1, iVar), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(e eVar, long j10) {
        if (!eVar.w().a9()) {
            return false;
        }
        g0 g0VarN = androidx.compose.ui.node.k.u(eVar).n();
        if (!g0VarN.I()) {
            return false;
        }
        long jF = h0.f(g0VarN);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF & k0.f265952a));
        float fC9 = ((int) (eVar.C9() >> 32)) + fIntBitsToFloat;
        float fC10 = ((int) (eVar.C9() & k0.f265952a)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j10 >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fC9) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j10 & k0.f265952a));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fC10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(i iVar, androidx.compose.ui.draganddrop.b bVar) {
        iVar.Z5(bVar);
        iVar.Q4(bVar);
    }

    private static final <T extends p2> T j(T t10, Function1<? super T, Boolean> function1) {
        if (!t10.w().a9()) {
            return null;
        }
        i1.h hVar = new i1.h();
        q2.h(t10, new c(function1, hVar));
        return (T) hVar.f312751a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends p2> void k(T t10, Function1<? super T, ? extends p2.a.EnumC0311a> function1) {
        if (function1.invoke(t10) != p2.a.EnumC0311a.ContinueTraversal) {
            return;
        }
        q2.h(t10, function1);
    }
}
