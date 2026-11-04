package androidx.compose.ui.text;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nBullet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bullet.kt\nandroidx/compose/ui/text/CircleShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,139:1\n33#2:140\n53#3,3:141\n*S KotlinDebug\n*F\n+ 1 Bullet.kt\nandroidx/compose/ui/text/CircleShape\n*L\n127#1:140\n127#1:141,3\n*E\n"})
final class s implements androidx.compose.ui.graphics.q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final s f42138a = new s();

    private s() {
    }

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public androidx.compose.ui.graphics.f2 mo0createOutlinePq9zytI(long j10, @NotNull androidx.compose.ui.unit.w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        float fQ = n0.n.q(j10) / 2.0f;
        long jE = n0.a.e((((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(fQ)) & com.rabbitmq.client.k0.f265952a));
        return new androidx.compose.ui.graphics.f2.c(n0.m.c(n0.o.m(j10), jE, jE, jE, jE));
    }
}
