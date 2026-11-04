package androidx.compose.ui;

import com.rabbitmq.client.k0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,284:1\n54#2:285\n59#2:287\n85#3:286\n90#3:288\n80#3:290\n32#4:289\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n*L\n115#1:285\n116#1:287\n115#1:286\n116#1:288\n117#1:290\n117#1:289\n*E\n"})
final class i implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final e.b f38733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final e.c f38734c;

    public i(@NotNull e.b bVar, @NotNull e.c cVar) {
        this.f38733b = bVar;
        this.f38734c = cVar;
    }

    @Override // androidx.compose.ui.e
    public long a(long j10, long j11, @NotNull androidx.compose.ui.unit.w wVar) {
        return androidx.compose.ui.unit.q.f((((long) this.f38733b.a((int) (j10 >> 32), (int) (j11 >> 32), wVar)) << 32) | (((long) this.f38734c.a((int) (j10 & k0.f265952a), (int) (j11 & k0.f265952a))) & k0.f265952a));
    }
}
