package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nWindowInsetsRulers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsetsRulers.kt\nandroidx/compose/ui/layout/InnermostInsetsRulers\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,361:1\n11165#2:362\n11500#2,3:363\n11165#2:368\n11500#2,3:369\n37#3,2:366\n37#3,2:372\n*S KotlinDebug\n*F\n+ 1 WindowInsetsRulers.kt\nandroidx/compose/ui/layout/InnermostInsetsRulers\n*L\n294#1:362\n294#1:363,3\n296#1:368\n296#1:369,3\n294#1:366,2\n296#1:372,2\n*E\n"})
final class w implements k3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f39567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final k3[] f39568c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final m2 f39569d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final m2 f39570e;

    public w(@Nullable String str, @NotNull k3[] k3VarArr) {
        this.f39567b = str;
        this.f39568c = k3VarArr;
        m2.a aVar = m2.f39419a;
        ArrayList arrayList = new ArrayList(k3VarArr.length);
        for (k3 k3Var : k3VarArr) {
            arrayList.add(k3Var.a());
        }
        m2[] m2VarArr = (m2[]) arrayList.toArray(new m2[0]);
        this.f39569d = o2.c(aVar, (m2[]) Arrays.copyOf(m2VarArr, m2VarArr.length));
        m2.a aVar2 = m2.f39419a;
        k3[] k3VarArr2 = this.f39568c;
        ArrayList arrayList2 = new ArrayList(k3VarArr2.length);
        for (k3 k3Var2 : k3VarArr2) {
            arrayList2.add(k3Var2.b());
        }
        m2[] m2VarArr2 = (m2[]) arrayList2.toArray(new m2[0]);
        this.f39570e = o2.c(aVar2, (m2[]) Arrays.copyOf(m2VarArr2, m2VarArr2.length));
    }

    @Override // androidx.compose.ui.layout.k3
    @NotNull
    public m2 a() {
        return this.f39569d;
    }

    @Override // androidx.compose.ui.layout.k3
    @NotNull
    public m2 b() {
        return this.f39570e;
    }

    @Override // androidx.compose.ui.layout.k3
    @NotNull
    public j3 c(@NotNull i2.a aVar) {
        return new v(aVar, this.f39568c);
    }

    @Nullable
    public final String d() {
        return this.f39567b;
    }

    @NotNull
    public final k3[] e() {
        return this.f39568c;
    }

    @NotNull
    public String toString() {
        String str = this.f39567b;
        return str == null ? ArraysKt.joinToString$default(this.f39568c, (CharSequence) null, "innermostOf(", ")", 0, (CharSequence) null, (Function1) null, 57, (Object) null) : str;
    }
}
