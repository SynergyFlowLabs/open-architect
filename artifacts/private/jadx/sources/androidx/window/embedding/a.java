package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ComponentName f76293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f76294b;

    public a(@NotNull ComponentName componentName, @Nullable String str) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
        this.f76293a = componentName;
        this.f76294b = str;
        String packageName = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (StringsKt.V2(packageName, "*", false, 2, null)) {
            int i10 = 2 ^ 6;
            if (StringsKt.r3(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
            }
        }
        if (StringsKt.V2(className, "*", false, 2, null) && StringsKt.r3(className, "*", 0, false, 6, null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @NotNull
    public final ComponentName a() {
        return this.f76293a;
    }

    @Nullable
    public final String b() {
        return this.f76294b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r4 == null ? null : r4.getAction()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(@org.jetbrains.annotations.NotNull android.app.Activity r4) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.window.embedding.r r0 = androidx.window.embedding.r.f76329a
            android.content.ComponentName r1 = r3.f76293a
            boolean r0 = r0.a(r4, r1)
            if (r0 == 0) goto L2b
            java.lang.String r3 = r3.f76294b
            r2 = 0
            if (r3 == 0) goto L28
            android.content.Intent r4 = r4.getIntent()
            r2 = 2
            if (r4 != 0) goto L1d
            r4 = 0
            goto L21
        L1d:
            java.lang.String r4 = r4.getAction()
        L21:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r2 = 3
            if (r3 == 0) goto L2b
        L28:
            r3 = 1
            r2 = 5
            return r3
        L2b:
            r2 = 0
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.a.c(android.app.Activity):boolean");
    }

    public final boolean d(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (!r.f76329a.b(intent.getComponent(), this.f76293a)) {
            return false;
        }
        String str = this.f76294b;
        return str == null || Intrinsics.areEqual(str, intent.getAction());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f76293a, aVar.f76293a) && Intrinsics.areEqual(this.f76294b, aVar.f76294b);
    }

    public int hashCode() {
        int iHashCode = this.f76293a.hashCode() * 31;
        String str = this.f76294b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "ActivityFilter(componentName=" + this.f76293a + ", intentAction=" + ((Object) this.f76294b) + ')';
    }
}
