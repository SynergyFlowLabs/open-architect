package androidx.compose.ui.layout;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class u implements m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final m2[] f39552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final i3 f39553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final t f39554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final i3 f39555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final t f39556f;

    public u(@NotNull m2[] m2VarArr) {
        this.f39552b = m2VarArr;
        i3.a aVar = i3.f39375c;
        int length = m2VarArr.length;
        i3[] i3VarArr = new i3[length];
        int i10 = 3 | 0;
        for (int i11 = 0; i11 < length; i11++) {
            i3VarArr[i11] = this.f39552b[i11].y();
        }
        this.f39553c = aVar.b(i3VarArr);
        t.a aVar2 = t.f39543c;
        int length2 = this.f39552b.length;
        t[] tVarArr = new t[length2];
        for (int i12 = 0; i12 < length2; i12++) {
            tVarArr[i12] = this.f39552b[i12].n();
        }
        this.f39554d = aVar2.b(tVarArr);
        i3.a aVar3 = i3.f39375c;
        int length3 = this.f39552b.length;
        i3[] i3VarArr2 = new i3[length3];
        for (int i13 = 0; i13 < length3; i13++) {
            i3VarArr2[i13] = this.f39552b[i13].x();
        }
        this.f39555e = aVar3.c(i3VarArr2);
        t.a aVar4 = t.f39543c;
        int length4 = this.f39552b.length;
        t[] tVarArr2 = new t[length4];
        for (int i14 = 0; i14 < length4; i14++) {
            tVarArr2[i14] = this.f39552b[i14].b();
        }
        this.f39556f = aVar4.c(tVarArr2);
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public t b() {
        return this.f39556f;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public t n() {
        return this.f39554d;
    }

    @NotNull
    public String toString() {
        return ArraysKt.joinToString$default(this.f39552b, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null);
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public i3 x() {
        return this.f39555e;
    }

    @Override // androidx.compose.ui.layout.m2
    @NotNull
    public i3 y() {
        return this.f39553c;
    }
}
