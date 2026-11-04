package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.internal.w0;
import androidx.compose.ui.layout.g1;
import androidx.compose.ui.unit.s;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@n
public abstract class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f42513i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f42514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final String f42515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private final m f42516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private final Object f42517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final s f42518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final Collection<Object> f42519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Collection<e> f42520g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f42521h;

    public /* synthetic */ e(Object obj, String str, m mVar, Object obj2, s sVar, Collection collection, Collection collection2, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, mVar, obj2, sVar, collection, collection2, z10);
    }

    @NotNull
    public final s a() {
        return this.f42518e;
    }

    @NotNull
    public final Collection<e> b() {
        return this.f42520g;
    }

    @NotNull
    public final Collection<Object> c() {
        return this.f42519f;
    }

    @Nullable
    public final Object d() {
        return this.f42517d;
    }

    @Nullable
    public final Object e() {
        return this.f42514a;
    }

    @Nullable
    public final m f() {
        return this.f42516c;
    }

    @NotNull
    public List<g1> g() {
        return CollectionsKt.emptyList();
    }

    @Nullable
    public final String h() {
        return this.f42515b;
    }

    @NotNull
    public List<h> i() {
        return CollectionsKt.emptyList();
    }

    public final boolean j() {
        return this.f42521h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e(Object obj, String str, m mVar, Object obj2, s sVar, Collection<? extends Object> collection, Collection<? extends e> collection2, boolean z10) {
        this.f42514a = obj;
        this.f42515b = str;
        this.f42516c = mVar;
        this.f42517d = obj2;
        this.f42518e = sVar;
        this.f42519f = collection;
        this.f42520g = collection2;
        this.f42521h = z10;
    }
}
