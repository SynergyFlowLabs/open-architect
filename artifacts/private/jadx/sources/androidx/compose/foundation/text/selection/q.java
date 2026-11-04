package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nSelectionHandles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,164:1\n284#2:165\n273#2:166\n*S KotlinDebug\n*F\n+ 1 SelectionHandles.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n126#1:165\n126#1:166\n*E\n"})
public final class q implements androidx.compose.ui.window.s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f21340d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f21341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final w f21342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f21343c = n0.g.f332700b.e();

    public q(@NotNull androidx.compose.ui.e eVar, @NotNull w wVar) {
        this.f21341a = eVar;
        this.f21342b = wVar;
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull androidx.compose.ui.unit.w wVar, long j11) {
        long jA = this.f21342b.a();
        if ((9223372034707292159L & jA) == n0.d.f332689d) {
            jA = this.f21343c;
        }
        this.f21343c = jA;
        return androidx.compose.ui.unit.q.s(androidx.compose.ui.unit.q.s(sVar.E(), androidx.compose.ui.unit.r.g(jA)), this.f21341a.a(j11, androidx.compose.ui.unit.u.f42720b.a(), wVar));
    }
}
