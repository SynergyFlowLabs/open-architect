package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDateInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,446:1\n1188#2,3:447\n*S KotlinDebug\n*F\n+ 1 DateInput.kt\nandroidx/compose/material3/DateVisualTransformation\n*L\n431#1:447,3\n*E\n"})
final class nb implements androidx.compose.ui.text.input.j1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.v1 f30999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final a f31003f = new a();

    public static final class a implements androidx.compose.ui.text.input.m0 {
        a() {
        }

        @Override // androidx.compose.ui.text.input.m0
        public int a(int i10) {
            if (i10 <= nb.this.f31000c - 1) {
                return i10;
            }
            if (i10 <= nb.this.f31001d - 1) {
                return i10 - 1;
            }
            return i10 <= nb.this.f31002e + 1 ? i10 - 2 : nb.this.f31002e;
        }

        @Override // androidx.compose.ui.text.input.m0
        public int b(int i10) {
            if (i10 < nb.this.f31000c) {
                return i10;
            }
            if (i10 < nb.this.f31001d) {
                return i10 + 1;
            }
            return i10 <= nb.this.f31002e ? i10 + 2 : nb.this.f31002e + 2;
        }
    }

    public nb(@NotNull androidx.compose.material3.internal.v1 v1Var) {
        this.f30999b = v1Var;
        this.f31000c = StringsKt.q3(v1Var.f(), v1Var.e(), 0, false, 6, null);
        this.f31001d = StringsKt.F3(v1Var.f(), v1Var.e(), 0, false, 6, null);
        this.f31002e = v1Var.g().length();
    }

    @Override // androidx.compose.ui.text.input.j1
    @NotNull
    public androidx.compose.ui.text.input.h1 a(@NotNull androidx.compose.ui.text.f fVar) {
        int i10 = 0;
        String strK5 = fVar.m().length() > this.f31002e ? StringsKt.k5(fVar.m(), kotlin.ranges.r.W1(0, this.f31002e)) : fVar.m();
        String str = "";
        int i11 = 0;
        while (i10 < strK5.length()) {
            int i12 = i11 + 1;
            str = str + strK5.charAt(i10);
            if (i12 == this.f31000c || i11 + 2 == this.f31001d) {
                str = str + this.f30999b.e();
            }
            i10++;
            i11 = i12;
        }
        return new androidx.compose.ui.text.input.h1(new androidx.compose.ui.text.f(str, null, 2, null), this.f31003f);
    }
}
