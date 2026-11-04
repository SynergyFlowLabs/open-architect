package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ComponentName f76341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final ComponentName f76342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final String f76343c;

    public u(@NotNull ComponentName primaryActivityName, @NotNull ComponentName secondaryActivityName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(primaryActivityName, "primaryActivityName");
        Intrinsics.checkNotNullParameter(secondaryActivityName, "secondaryActivityName");
        this.f76341a = primaryActivityName;
        this.f76342b = secondaryActivityName;
        this.f76343c = str;
        String packageName = primaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className2, "secondaryActivityName.className");
        if (packageName.length() == 0 || packageName2.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() == 0 || className2.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (StringsKt.V2(packageName, "*", false, 2, null) && StringsKt.r3(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (StringsKt.V2(className, "*", false, 2, null) && StringsKt.r3(className, "*", 0, false, 6, null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
        if (StringsKt.V2(packageName2, "*", false, 2, null) && StringsKt.r3(packageName2, "*", 0, false, 6, null) != packageName2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (StringsKt.V2(className2, "*", false, 2, null) && StringsKt.r3(className2, "*", 0, false, 6, null) != className2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @NotNull
    public final ComponentName a() {
        return this.f76341a;
    }

    @Nullable
    public final String b() {
        return this.f76343c;
    }

    @NotNull
    public final ComponentName c() {
        return this.f76342b;
    }

    public final boolean d(@NotNull Activity primaryActivity, @NotNull Intent secondaryActivityIntent) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        r rVar = r.f76329a;
        if (!rVar.b(componentName, this.f76341a) || !rVar.b(secondaryActivityIntent.getComponent(), this.f76342b)) {
            return false;
        }
        String str = this.f76343c;
        return str == null || Intrinsics.areEqual(str, secondaryActivityIntent.getAction());
    }

    public final boolean e(@NotNull Activity primaryActivity, @NotNull Activity secondaryActivity) {
        Intrinsics.checkNotNullParameter(primaryActivity, "primaryActivity");
        Intrinsics.checkNotNullParameter(secondaryActivity, "secondaryActivity");
        r rVar = r.f76329a;
        boolean z10 = rVar.b(primaryActivity.getComponentName(), this.f76341a) && rVar.b(secondaryActivity.getComponentName(), this.f76342b);
        if (secondaryActivity.getIntent() == null) {
            return z10;
        }
        if (z10) {
            Intent intent = secondaryActivity.getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "secondaryActivity.intent");
            if (d(primaryActivity, intent)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.areEqual(this.f76341a, uVar.f76341a) && Intrinsics.areEqual(this.f76342b, uVar.f76342b) && Intrinsics.areEqual(this.f76343c, uVar.f76343c);
    }

    public int hashCode() {
        int iHashCode = ((this.f76341a.hashCode() * 31) + this.f76342b.hashCode()) * 31;
        String str = this.f76343c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.f76341a + ", secondaryActivityName=" + this.f76342b + ", secondaryActivityAction=" + ((Object) this.f76343c) + AbstractJsonLexerKt.END_OBJ;
    }
}
