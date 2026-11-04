package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassification;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f21328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f21329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final TextClassification f21330c;

    public /* synthetic */ p3(CharSequence charSequence, long j10, TextClassification textClassification, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, j10, textClassification);
    }

    public static /* synthetic */ p3 e(p3 p3Var, CharSequence charSequence, long j10, TextClassification textClassification, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charSequence = p3Var.f21328a;
        }
        if ((i10 & 2) != 0) {
            j10 = p3Var.f21329b;
        }
        if ((i10 & 4) != 0) {
            textClassification = p3Var.f21330c;
        }
        return p3Var.d(charSequence, j10, textClassification);
    }

    @NotNull
    public final CharSequence a() {
        return this.f21328a;
    }

    public final long b() {
        return this.f21329b;
    }

    @NotNull
    public final TextClassification c() {
        return this.f21330c;
    }

    @NotNull
    public final p3 d(@NotNull CharSequence charSequence, long j10, @NotNull TextClassification textClassification) {
        return new p3(charSequence, j10, textClassification, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return Intrinsics.areEqual(this.f21328a, p3Var.f21328a) && androidx.compose.ui.text.w3.g(this.f21329b, p3Var.f21329b) && Intrinsics.areEqual(this.f21330c, p3Var.f21330c);
    }

    public final long f() {
        return this.f21329b;
    }

    @NotNull
    public final CharSequence g() {
        return this.f21328a;
    }

    @NotNull
    public final TextClassification h() {
        return this.f21330c;
    }

    public int hashCode() {
        return (((this.f21328a.hashCode() * 31) + androidx.compose.ui.text.w3.o(this.f21329b)) * 31) + this.f21330c.hashCode();
    }

    @NotNull
    public String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f21328a) + ", selection=" + ((Object) androidx.compose.ui.text.w3.q(this.f21329b)) + ", textClassification=" + this.f21330c + ')';
    }

    private p3(CharSequence charSequence, long j10, TextClassification textClassification) {
        this.f21328a = charSequence;
        this.f21329b = j10;
        this.f21330c = textClassification;
    }
}
