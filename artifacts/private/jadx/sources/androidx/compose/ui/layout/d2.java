package androidx.compose.ui.layout;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class d2 implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m2[] f39300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i3 f39301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f39302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i3 f39303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t f39304f;

    public d2(@NotNull m2[] m2VarArr) {
        this.f39300b = m2VarArr;
        i3.a aVar = i3.f39375c;
        int length = m2VarArr.length;
        i3[] i3VarArr = new i3[length];
        for (int i10 = 0; i10 < length; i10++) {
            i3VarArr[i10] = this.f39300b[i10].y();
        }
        this.f39301c = aVar.c(i3VarArr);
        t.a aVar2 = t.f39543c;
        int length2 = this.f39300b.length;
        t[] tVarArr = new t[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            tVarArr[i11] = this.f39300b[i11].n();
        }
        this.f39302d = aVar2.c(tVarArr);
        i3.a aVar3 = i3.f39375c;
        int length3 = this.f39300b.length;
        i3[] i3VarArr2 = new i3[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            i3VarArr2[i12] = this.f39300b[i12].x();
        }
        this.f39303e = aVar3.b(i3VarArr2);
        t.a aVar4 = t.f39543c;
        int length4 = this.f39300b.length;
        t[] tVarArr2 = new t[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            tVarArr2[i13] = this.f39300b[i13].b();
        }
        this.f39304f = aVar4.b(tVarArr2);
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public t b() {
        return this.f39304f;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public t n() {
        return this.f39302d;
    }

    @NotNull
    public String toString() {
        int i10 = 3 | 0;
        return ArraysKt.joinToString$default(this.f39300b, (CharSequence) null, "outermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null);
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public i3 x() {
        return this.f39303e;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public i3 y() {
        return this.f39301c;
    }
}
