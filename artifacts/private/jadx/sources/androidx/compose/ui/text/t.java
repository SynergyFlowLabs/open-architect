package androidx.compose.ui.text;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,580:1\n27#2,2:581\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader\n*L\n271#1:581,2\n*E\n"})
final class t implements androidx.compose.ui.text.font.x.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f42263b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static Map<androidx.compose.ui.text.font.y.b, androidx.compose.ui.text.font.x.b> f42264c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.text.platform.c0 f42265d = new androidx.compose.ui.text.platform.c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.text.font.y.b f42266a;

    @SourceDebugExtension({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.android.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n*L\n1#1,580:1\n35#2:581\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n274#1:581\n*E\n"})
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final androidx.compose.ui.text.font.x.b a(@NotNull androidx.compose.ui.text.font.y.b bVar) {
            synchronized (c()) {
                try {
                    a aVar = t.f42263b;
                    androidx.compose.ui.text.font.x.b bVar2 = aVar.b().get(bVar);
                    if (bVar2 != null) {
                        return bVar2;
                    }
                    t tVar = new t(bVar, null);
                    aVar.b().put(bVar, tVar);
                    return tVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @NotNull
        public final Map<androidx.compose.ui.text.font.y.b, androidx.compose.ui.text.font.x.b> b() {
            return t.f42264c;
        }

        @NotNull
        public final androidx.compose.ui.text.platform.c0 c() {
            return t.f42265d;
        }

        public final void d(@NotNull Map<androidx.compose.ui.text.font.y.b, androidx.compose.ui.text.font.x.b> map) {
            t.f42264c = map;
        }

        private a() {
        }
    }

    public /* synthetic */ t(androidx.compose.ui.text.font.y.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    @Override // androidx.compose.ui.text.font.x.b
    @kotlin.l(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.b1(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @NotNull
    public Object a(@NotNull androidx.compose.ui.text.font.x xVar) {
        return androidx.compose.ui.text.font.y.b.c(this.f42266a, androidx.compose.ui.text.font.j0.g(xVar), xVar.a(), xVar.c(), 0, 8, null).getValue();
    }

    private t(androidx.compose.ui.text.font.y.b bVar) {
        this.f42266a = bVar;
    }
}
