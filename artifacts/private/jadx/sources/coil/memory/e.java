package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.d1;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nStrongMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrongMemoryCache.kt\ncoil/memory/RealStrongMemoryCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h f87564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f87565b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Bitmap f87566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final Map<String, Object> f87567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f87568c;

        public a(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i10) {
            this.f87566a = bitmap;
            this.f87567b = map;
            this.f87568c = i10;
        }

        @NotNull
        public final Bitmap a() {
            return this.f87566a;
        }

        @NotNull
        public final Map<String, Object> b() {
            return this.f87567b;
        }

        public final int c() {
            return this.f87568c;
        }
    }

    public static final class b extends d1<MemoryCache.Key, a> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e f87569j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, e eVar) {
            super(i10);
            this.f87569j = eVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.d1
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void c(boolean z10, MemoryCache.Key key, a aVar, a aVar2) {
            this.f87569j.f87564a.a(key, aVar.a(), aVar.b(), aVar.c());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.collection.d1
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public int p(MemoryCache.Key key, a aVar) {
            return aVar.c();
        }
    }

    public e(int i10, @NotNull h hVar) {
        this.f87564a = hVar;
        this.f87565b = new b(i10, this);
    }

    @Override // coil.memory.g
    public int a() {
        return this.f87565b.h();
    }

    @Override // coil.memory.g
    public void b(int i10) {
        if (i10 >= 40) {
            c();
        } else {
            if (10 > i10 || i10 >= 20) {
                return;
            }
            this.f87565b.r(getSize() / 2);
        }
    }

    @Override // coil.memory.g
    public void c() {
        this.f87565b.d();
    }

    @Override // coil.memory.g
    public boolean d(@NotNull MemoryCache.Key key) {
        return this.f87565b.l(key) != null;
    }

    @Override // coil.memory.g
    @Nullable
    public MemoryCache.b e(@NotNull MemoryCache.Key key) {
        a aVarF = this.f87565b.f(key);
        if (aVarF != null) {
            return new MemoryCache.b(aVarF.a(), aVarF.b());
        }
        return null;
    }

    @Override // coil.memory.g
    public void f(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map) {
        int iA = coil.util.a.a(bitmap);
        if (iA <= a()) {
            this.f87565b.j(key, new a(bitmap, map, iA));
        } else {
            this.f87565b.l(key);
            this.f87564a.a(key, bitmap, map, iA);
        }
    }

    @Override // coil.memory.g
    public int getSize() {
        return this.f87565b.o();
    }

    @Override // coil.memory.g
    @NotNull
    public Set<MemoryCache.Key> r() {
        return this.f87565b.q().keySet();
    }
}
