package androidx.compose.ui.platform;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f40383b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40384c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f40385d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f40386e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f40387f = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final AccessibilityManager f40388a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d(@NotNull Context context) {
        Object systemService = context.getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f40388a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.compose.ui.platform.c
    public long a(long j10, boolean z10, boolean z11, boolean z12) {
        ?? r10 = z10;
        if (j10 >= androidx.collection.g3.f12256c) {
            return j10;
        }
        if (z11) {
            r10 = (z10 ? 1 : 0) | 2;
        }
        int i10 = r10;
        if (z12) {
            i10 = (r10 == true ? 1 : 0) | 4;
        }
        int iA = w0.f40919a.a(this.f40388a, (int) j10, i10);
        if (iA == Integer.MAX_VALUE) {
            return Long.MAX_VALUE;
        }
        return iA;
    }
}
