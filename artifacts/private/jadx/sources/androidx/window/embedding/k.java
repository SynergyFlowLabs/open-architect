package androidx.window.embedding;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@androidx.window.core.d
public final class k implements l {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f76306c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f76307d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f76308e = "EmbeddingCompat";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ActivityEmbeddingComponent f76309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final i f76310b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActivityEmbeddingComponent a() {
            ActivityEmbeddingComponent activityEmbeddingComponent;
            return (!c() || (activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent()) == null) ? new o() : activityEmbeddingComponent;
        }

        @Nullable
        public final Integer b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final boolean c() {
            boolean z10 = false;
            try {
                if (WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null) {
                    z10 = true;
                }
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            }
            return z10;
        }

        private a() {
        }
    }

    public k(@NotNull ActivityEmbeddingComponent embeddingExtension, @NotNull i adapter) {
        Intrinsics.checkNotNullParameter(embeddingExtension, "embeddingExtension");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f76309a = embeddingExtension;
        this.f76310b = adapter;
    }

    @Override // androidx.window.embedding.l
    public void a(@NotNull Set<? extends m> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f76309a.setEmbeddingRules(this.f76310b.j(rules));
    }

    @Override // androidx.window.embedding.l
    public void b(@NotNull l.a embeddingCallback) {
        Intrinsics.checkNotNullParameter(embeddingCallback, "embeddingCallback");
        this.f76309a.setSplitInfoCallback(new n(embeddingCallback, this.f76310b));
    }

    public k() {
        this(f76306c.a(), new i());
    }
}
