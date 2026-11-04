package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final r f76329a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f76330b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final String f76331c = "SplitRuleResolution";

    private r() {
    }

    private final boolean c(String str, String str2) {
        if (!StringsKt.V2(str2, "*", false, 2, null)) {
            return false;
        }
        if (Intrinsics.areEqual(str2, "*")) {
            return true;
        }
        if (StringsKt.r3(str2, "*", 0, false, 6, null) != StringsKt.G3(str2, "*", 0, false, 6, null) || !StringsKt.M1(str2, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return StringsKt.u2(str, strSubstring, false, 2, null);
    }

    public final boolean a(@NotNull Activity activity, @NotNull ComponentName ruleComponent) {
        ComponentName component;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (b(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f76329a.b(component, ruleComponent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009c  */
    public final boolean b(@Nullable ComponentName componentName, @NotNull ComponentName ruleComponent) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (componentName == null) {
            return Intrinsics.areEqual(ruleComponent.getPackageName(), "*") && Intrinsics.areEqual(ruleComponent.getClassName(), "*");
        }
        String string = componentName.toString();
        Intrinsics.checkNotNullExpressionValue(string, "activityComponent.toString()");
        if (StringsKt.V2(string, "*", false, 2, null)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.");
        }
        if (!Intrinsics.areEqual(componentName.getPackageName(), ruleComponent.getPackageName())) {
            String packageName = componentName.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "activityComponent.packageName");
            String packageName2 = ruleComponent.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName2, "ruleComponent.packageName");
            z10 = c(packageName, packageName2);
        }
        if (Intrinsics.areEqual(componentName.getClassName(), ruleComponent.getClassName())) {
            z11 = true;
        } else {
            String className = componentName.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "activityComponent.className");
            String className2 = ruleComponent.getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "ruleComponent.className");
            if (c(className, className2)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z10 && z11;
    }
}
