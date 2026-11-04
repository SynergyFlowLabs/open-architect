package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends kotlin.random.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final a f312887c = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.a
    @NotNull
    public Random r() {
        Random random = this.f312887c.get();
        Intrinsics.checkNotNullExpressionValue(random, "get(...)");
        return random;
    }
}
