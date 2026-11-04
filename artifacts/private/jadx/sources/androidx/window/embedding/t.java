package androidx.window.embedding;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final c f76338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final c f76339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f76340c;

    public t(@NotNull c primaryActivityStack, @NotNull c secondaryActivityStack, float f10) {
        Intrinsics.checkNotNullParameter(primaryActivityStack, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(secondaryActivityStack, "secondaryActivityStack");
        this.f76338a = primaryActivityStack;
        this.f76339b = secondaryActivityStack;
        this.f76340c = f10;
    }

    public final boolean a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return this.f76338a.a(activity) || this.f76339b.a(activity);
    }

    @NotNull
    public final c b() {
        return this.f76338a;
    }

    @NotNull
    public final c c() {
        return this.f76339b;
    }

    public final float d() {
        return this.f76340c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f76338a, tVar.f76338a) && Intrinsics.areEqual(this.f76339b, tVar.f76339b) && this.f76340c == tVar.f76340c;
    }

    public int hashCode() {
        return (((this.f76338a.hashCode() * 31) + this.f76339b.hashCode()) * 31) + Float.hashCode(this.f76340c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SplitInfo:{");
        sb2.append("primaryActivityStack=" + b() + AbstractJsonLexerKt.COMMA);
        sb2.append("secondaryActivityStack=" + c() + AbstractJsonLexerKt.COMMA);
        sb2.append("splitRatio=" + d() + AbstractJsonLexerKt.END_OBJ);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
