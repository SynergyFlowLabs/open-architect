package androidx.compose.ui.text.style;

import androidx.compose.runtime.k7;
import androidx.compose.runtime.o2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@o2
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f42216c = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final k f42218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final k f42219f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f42220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42215b = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final k f42217d = new k(0);

    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,103:1\n270#2,2:104\n35#2,5:106\n272#2:111\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n51#1:104,2\n51#1:106,5\n51#1:111\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @k7
        public static /* synthetic */ void c() {
        }

        @k7
        public static /* synthetic */ void e() {
        }

        @k7
        public static /* synthetic */ void g() {
        }

        @NotNull
        public final k a(@NotNull List<k> list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | list.get(i10).e());
            }
            return new k(numValueOf.intValue());
        }

        @NotNull
        public final k b() {
            return k.f42219f;
        }

        @NotNull
        public final k d() {
            return k.f42217d;
        }

        @NotNull
        public final k f() {
            return k.f42218e;
        }

        private a() {
        }
    }

    static {
        boolean z10 = !true;
        f42218e = new k(1);
        f42219f = new k(2);
    }

    public k(int i10) {
        this.f42220a = i10;
    }

    public final boolean d(@NotNull k kVar) {
        int i10 = this.f42220a;
        return (kVar.f42220a | i10) == i10;
    }

    public final int e() {
        return this.f42220a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f42220a == ((k) obj).f42220a;
    }

    @NotNull
    public final k f(@NotNull k kVar) {
        return new k(this.f42220a | kVar.f42220a);
    }

    public int hashCode() {
        return this.f42220a;
    }

    @NotNull
    public String toString() {
        if (this.f42220a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f42220a & f42218e.f42220a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f42220a & f42219f.f42220a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + androidx.compose.ui.util.d.r(arrayList, ", ", null, null, 0, null, null, 62, null) + AbstractJsonLexerKt.END_LIST;
    }
}
