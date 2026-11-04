package androidx.compose.ui.tooling;

import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nComposeViewAdapter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,611:1\n1368#2:612\n1454#2,5:613\n1#3:618\n*S KotlinDebug\n*F\n+ 1 ComposeViewAdapter.android.kt\nandroidx/compose/ui/tooling/ViewInfo\n*L\n97#1:612\n97#1:613,5\n*E\n"})
public final class e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f42563h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f42564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.s f42566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.tooling.data.m f42567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<e0> f42568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final Object f42569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final String f42570g;

    public e0(@NotNull String str, int i10, @NotNull androidx.compose.ui.unit.s sVar, @Nullable androidx.compose.ui.tooling.data.m mVar, @NotNull List<e0> list, @Nullable Object obj, @Nullable String str2) {
        this.f42564a = str;
        this.f42565b = i10;
        this.f42566c = sVar;
        this.f42567d = mVar;
        this.f42568e = list;
        this.f42569f = obj;
        this.f42570g = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ e0 j(e0 e0Var, String str, int i10, androidx.compose.ui.unit.s sVar, androidx.compose.ui.tooling.data.m mVar, List list, Object obj, String str2, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = e0Var.f42564a;
        }
        if ((i11 & 2) != 0) {
            i10 = e0Var.f42565b;
        }
        if ((i11 & 4) != 0) {
            sVar = e0Var.f42566c;
        }
        if ((i11 & 8) != 0) {
            mVar = e0Var.f42567d;
        }
        if ((i11 & 16) != 0) {
            list = e0Var.f42568e;
        }
        if ((i11 & 32) != 0) {
            obj = e0Var.f42569f;
        }
        if ((i11 & 64) != 0) {
            str2 = e0Var.f42570g;
        }
        Object obj3 = obj;
        String str3 = str2;
        List list2 = list;
        androidx.compose.ui.unit.s sVar2 = sVar;
        return e0Var.i(str, i10, sVar2, mVar, list2, obj3, str3);
    }

    @NotNull
    public final List<e0> a() {
        List<e0> list = this.f42568e;
        List<e0> list2 = list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, ((e0) it.next()).a());
        }
        return CollectionsKt.plus((Collection) list2, (Iterable) arrayList);
    }

    @NotNull
    public final String b() {
        return this.f42564a;
    }

    public final int c() {
        return this.f42565b;
    }

    @NotNull
    public final androidx.compose.ui.unit.s d() {
        return this.f42566c;
    }

    @Nullable
    public final androidx.compose.ui.tooling.data.m e() {
        return this.f42567d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.areEqual(this.f42564a, e0Var.f42564a) && this.f42565b == e0Var.f42565b && Intrinsics.areEqual(this.f42566c, e0Var.f42566c) && Intrinsics.areEqual(this.f42567d, e0Var.f42567d) && Intrinsics.areEqual(this.f42568e, e0Var.f42568e) && Intrinsics.areEqual(this.f42569f, e0Var.f42569f) && Intrinsics.areEqual(this.f42570g, e0Var.f42570g);
    }

    @NotNull
    public final List<e0> f() {
        return this.f42568e;
    }

    @Nullable
    public final Object g() {
        return this.f42569f;
    }

    @Nullable
    public final String h() {
        return this.f42570g;
    }

    public int hashCode() {
        int iHashCode = ((((this.f42564a.hashCode() * 31) + Integer.hashCode(this.f42565b)) * 31) + this.f42566c.hashCode()) * 31;
        androidx.compose.ui.tooling.data.m mVar = this.f42567d;
        int iHashCode2 = 0;
        int iHashCode3 = (((iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31) + this.f42568e.hashCode()) * 31;
        Object obj = this.f42569f;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.f42570g;
        if (str != null) {
            iHashCode2 = str.hashCode();
        }
        return iHashCode4 + iHashCode2;
    }

    @NotNull
    public final e0 i(@NotNull String str, int i10, @NotNull androidx.compose.ui.unit.s sVar, @Nullable androidx.compose.ui.tooling.data.m mVar, @NotNull List<e0> list, @Nullable Object obj, @Nullable String str2) {
        return new e0(str, i10, sVar, mVar, list, obj, str2);
    }

    @NotNull
    public final androidx.compose.ui.unit.s k() {
        return this.f42566c;
    }

    @NotNull
    public final List<e0> l() {
        return this.f42568e;
    }

    @NotNull
    public final String m() {
        return this.f42564a;
    }

    @Nullable
    public final Object n() {
        return this.f42569f;
    }

    public final int o() {
        return this.f42565b;
    }

    @Nullable
    public final androidx.compose.ui.tooling.data.m p() {
        return this.f42567d;
    }

    @Nullable
    public final String q() {
        return this.f42570g;
    }

    public final boolean r() {
        return (this.f42566c.j() == 0 || this.f42566c.x() == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x006b  */
    @NotNull
    public String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append(this.f42564a);
        sb2.append(AbstractJsonLexerKt.COLON);
        sb2.append(this.f42565b);
        sb2.append(",\n            |bounds=(top=");
        sb2.append(this.f42566c.B());
        sb2.append(", left=");
        sb2.append(this.f42566c.t());
        sb2.append(",\n            |location=");
        androidx.compose.ui.tooling.data.m mVar = this.f42567d;
        if (mVar != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('(');
            sb3.append(mVar.j());
            sb3.append('L');
            sb3.append(mVar.h());
            string = sb3.toString();
            if (string == null) {
                string = "<none>";
            }
        } else {
            string = "<none>";
        }
        sb2.append(string);
        sb2.append("\n            |bottom=");
        sb2.append(this.f42566c.j());
        sb2.append(", right=");
        sb2.append(this.f42566c.x());
        sb2.append("),\n            |childrenCount=");
        sb2.append(this.f42568e.size());
        sb2.append(')');
        return StringsKt.r(sb2.toString(), null, 1, null);
    }
}
