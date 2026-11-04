package b0;

import androidx.compose.runtime.internal.w0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f77482b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77483c = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final c f77484d = new c(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b> f77485a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final c a() {
            return c.f77484d;
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@NotNull List<? extends b> list) {
        this.f77485a = list;
    }

    @NotNull
    public final List<b> b() {
        return this.f77485a;
    }

    @NotNull
    public String toString() {
        return "TextContextMenuData(components=" + androidx.compose.ui.util.d.r(this.f77485a, "\n\t", "[\n\t", "\n]", 0, null, null, 56, null) + ')';
    }
}
