package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.graphics.f2;
import androidx.compose.ui.graphics.q3;
import androidx.compose.ui.unit.w;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 1)
@SourceDebugExtension({"SMAP\nCornerBasedShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerBasedShape.kt\nandroidx/compose/foundation/shape/CornerBasedShape\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,119:1\n97#2,4:120\n*S KotlinDebug\n*F\n+ 1 CornerBasedShape.kt\nandroidx/compose/foundation/shape/CornerBasedShape\n*L\n62#1:120,4\n*E\n"})
public abstract class e implements q3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f18734e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final f f18735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f18736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f f18737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final f f18738d;

    public e(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4) {
        this.f18735a = fVar;
        this.f18736b = fVar2;
        this.f18737c = fVar3;
        this.f18738d = fVar4;
    }

    public static /* synthetic */ e c(e eVar, f fVar, f fVar2, f fVar3, f fVar4, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i10 & 1) != 0) {
            fVar = eVar.f18735a;
        }
        if ((i10 & 2) != 0) {
            fVar2 = eVar.f18736b;
        }
        if ((i10 & 4) != 0) {
            fVar3 = eVar.f18737c;
        }
        if ((i10 & 8) != 0) {
            fVar4 = eVar.f18738d;
        }
        return eVar.b(fVar, fVar2, fVar3, fVar4);
    }

    @NotNull
    public final e a(@NotNull f fVar) {
        return b(fVar, fVar, fVar, fVar);
    }

    @NotNull
    public abstract e b(@NotNull f fVar, @NotNull f fVar2, @NotNull f fVar3, @NotNull f fVar4);

    @Override // androidx.compose.ui.graphics.q3
    @NotNull
    /* JADX INFO: renamed from: createOutline-Pq9zytI */
    public final f2 mo0createOutlinePq9zytI(long j10, @NotNull w wVar, @NotNull androidx.compose.ui.unit.d dVar) {
        float fA = this.f18735a.a(j10, dVar);
        float fA2 = this.f18736b.a(j10, dVar);
        float fA3 = this.f18737c.a(j10, dVar);
        float fA4 = this.f18738d.a(j10, dVar);
        float fQ = n0.n.q(j10);
        float f10 = fA + fA4;
        if (f10 > fQ) {
            float f11 = fQ / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fQ) {
            float f13 = fQ / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (!(fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f)) {
            androidx.compose.foundation.internal.e.g("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j10, fA, fA2, fA3, fA4, wVar);
    }

    @NotNull
    public abstract f2 d(long j10, float f10, float f11, float f12, float f13, @NotNull w wVar);

    @NotNull
    public final f e() {
        return this.f18737c;
    }

    @NotNull
    public final f f() {
        return this.f18738d;
    }

    @NotNull
    public final f g() {
        return this.f18736b;
    }

    @NotNull
    public final f h() {
        return this.f18735a;
    }
}
