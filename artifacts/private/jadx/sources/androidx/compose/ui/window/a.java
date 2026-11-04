package androidx.compose.ui.window;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.unit.w;
import com.rabbitmq.client.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,150:1\n32#2:151\n80#3:152\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n95#1:151\n95#1:152\n*E\n"})
public final class a implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42850c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f42851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f42852b;

    public /* synthetic */ a(androidx.compose.ui.e eVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar, j10);
    }

    @Override // androidx.compose.ui.window.s
    public long a(@NotNull androidx.compose.ui.unit.s sVar, long j10, @NotNull w wVar, long j11) {
        androidx.compose.ui.e eVar = this.f42851a;
        androidx.compose.ui.unit.u.a aVar = androidx.compose.ui.unit.u.f42720b;
        long jA = eVar.a(aVar.a(), sVar.z(), wVar);
        return androidx.compose.ui.unit.q.s(androidx.compose.ui.unit.q.s(androidx.compose.ui.unit.q.s(sVar.E(), jA), androidx.compose.ui.unit.q.w(this.f42851a.a(aVar.a(), j11, wVar))), androidx.compose.ui.unit.q.f((((long) (androidx.compose.ui.unit.q.n(this.f42852b) * (wVar == w.Ltr ? 1 : -1))) << 32) | (((long) androidx.compose.ui.unit.q.p(this.f42852b)) & k0.f265952a)));
    }

    @NotNull
    public final androidx.compose.ui.e b() {
        return this.f42851a;
    }

    public final long c() {
        return this.f42852b;
    }

    private a(androidx.compose.ui.e eVar, long j10) {
        this.f42851a = eVar;
        this.f42852b = j10;
    }
}
