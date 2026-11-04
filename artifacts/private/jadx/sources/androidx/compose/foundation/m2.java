package androidx.compose.foundation;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nClipScrollableContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/HorizontalScrollableClipShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,99:1\n1#2:100\n57#3:101\n61#3:104\n60#4:102\n70#4:105\n22#5:103\n22#5:106\n*S KotlinDebug\n*F\n+ 1 ClipScrollableContainer.kt\nandroidx/compose/foundation/HorizontalScrollableClipShape\n*L\n75#1:101\n76#1:104\n75#1:102\n76#1:105\n75#1:103\n76#1:106\n*E\n"})
final class m2 implements androidx.compose.ui.graphics.q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final m2 f18091a = new m2();

    private m2() {
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        float fG6 = dVar.g6(m1.b());
        return new androidx.compose.ui.graphics.f2.b(new n0.j(0.0f, -fG6, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)) + fG6));
    }
}
