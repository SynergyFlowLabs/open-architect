package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.w0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSemanticsProperties.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.android.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesAndroid\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,96:1\n481#2:97\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.android.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesAndroid\n*L\n30#1:97\n*E\n"})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a0 f41069a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final d0<Boolean> f41070b = new d0<>("TestTagsAsResourceId", false, b.f41074a, null, 8, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final d0<String> f41071c = new d0<>("AccessibilityClassName", true, a.f41073a, null, 8, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41072d = 8;

    static final class a extends l0 implements Function2<String, String, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41073a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }

    static final class b extends l0 implements Function2<Boolean, Boolean, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f41074a = new b();

        b() {
            super(2);
        }

        public final Boolean c(Boolean bool, boolean z10) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, Boolean bool2) {
            return c(bool, bool2.booleanValue());
        }
    }

    private a0() {
    }

    @NotNull
    public final d0<String> a() {
        return f41071c;
    }

    @NotNull
    public final d0<Boolean> b() {
        return f41070b;
    }
}
