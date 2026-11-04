package ck;

import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.r3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.g;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends kotlin.coroutines.a implements r3<Map<String, ? extends String>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final C0806a f86918b = new C0806a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Map<String, String> f86919a;

    /* JADX INFO: renamed from: ck.a$a, reason: collision with other inner class name */
    public static final class C0806a implements CoroutineContext.b<a> {
        public /* synthetic */ C0806a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0806a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void N(Map<String, String> map) {
        if (map == null) {
            g.a();
        } else {
            g.k(map);
        }
    }

    @Override // kotlinx.coroutines.r3
    @Nullable
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public Map<String, String> l1(@NotNull CoroutineContext coroutineContext) {
        Map<String, String> mapC = g.c();
        N(this.f86919a);
        return mapC;
    }

    @Nullable
    public final Map<String, String> h() {
        return this.f86919a;
    }

    @Override // kotlinx.coroutines.r3
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void I(@NotNull CoroutineContext coroutineContext, @Nullable Map<String, String> map) {
        N(map);
    }

    public /* synthetic */ a(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? g.c() : map);
    }

    public a(@Nullable Map<String, String> map) {
        super(f86918b);
        this.f86919a = map;
    }
}
